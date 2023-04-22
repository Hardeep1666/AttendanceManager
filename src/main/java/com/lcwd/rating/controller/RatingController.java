package com.lcwd.rating.controller;

import java.util.List;

import com.lcwd.rating.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.rating.dto.RatingDto;
import com.lcwd.rating.service.RatingService;

@RequestMapping("/ratings")
@RestController
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @Autowired
    private RatingRepository ratingRepository;
    
    @PostMapping("/create")
    public ResponseEntity<RatingDto> create(@RequestBody RatingDto ratingDto)
    {
        RatingDto ratingDto1=this.ratingService.addRating(ratingDto);
        return  new ResponseEntity<RatingDto>(ratingDto1, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<RatingDto>> getAllRatings() {
        List<RatingDto> ratings = this.ratingService.getAllRatings();
        return new ResponseEntity<List<RatingDto>>(ratings, HttpStatus.OK);
    }
    @GetMapping("/Users/{userId}")
    public ResponseEntity<List<RatingDto>> getByUserId(@PathVariable("userId") Integer userId) {
        List<RatingDto> ratings = this.ratingService.getRatingByUserId(userId);
        return new ResponseEntity<List<RatingDto>>(ratings, HttpStatus.OK);
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<RatingDto>> getByHotelId(@PathVariable Integer hotelId) {
        List<RatingDto> ratings = this.ratingService.getRatingByHotelId(hotelId);
        return new ResponseEntity<List<RatingDto>>(ratings, HttpStatus.OK);
    }


}
