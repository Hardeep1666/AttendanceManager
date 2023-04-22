package com.lcwd.rating.service;

import java.util.List;

import com.lcwd.rating.dto.RatingDto;

public interface RatingService {

    //create
public RatingDto addRating(RatingDto ratingDto);

    //getAll
public List<RatingDto> getAllRatings();


    //getById
public List<RatingDto>  getRatingByUserId(Integer userId);

	
	public  List<RatingDto> getRatingByHotelId(Integer hotelId);


}
