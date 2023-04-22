package com.lcwd.rating.service.Impl;

import com.lcwd.rating.dto.RatingDto;
import com.lcwd.rating.model.Rating;
import com.lcwd.rating.repository.RatingRepository;
import com.lcwd.rating.service.RatingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RatingRepository ratingRepository;


    private RatingDto RatingToDto(Rating rating) {

        return this.modelMapper.map(rating, RatingDto.class);
    }

    private Rating DtoToRating(RatingDto ratingDto) {

        return this.modelMapper.map(ratingDto, Rating.class);
    }





    @Override
    public RatingDto addRating(RatingDto ratingDto) {
        Rating rating= this.DtoToRating(ratingDto);

        ratingRepository.save(rating);
        return this.RatingToDto(rating);
    }

    @Override
    public List<RatingDto> getAllRatings() {
        List<Rating> ratingList= this.ratingRepository.findAll();

        return ratingList.stream().map(rating -> RatingToDto(rating)).collect(Collectors.toList());
    }
    


    @Override
    public List<RatingDto> getRatingByUserId(Integer userId) {
        List <Rating> ratingList =this.ratingRepository.findByUserId(userId);
        return  ratingList.stream().map(rating -> RatingToDto(rating)).collect(Collectors.toList());
    }

    @Override
    public List<RatingDto> getRatingByHotelId(Integer hotelId) {
        List<Rating> ratingList =this.ratingRepository.findByHotelId(hotelId);
        return  ratingList.stream().map(rating -> RatingToDto(rating)).collect(Collectors.toList());
    }
}
