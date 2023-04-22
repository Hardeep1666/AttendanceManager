package com.lcwd.rating.repository;

import com.lcwd.rating.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Integer> {
// custom methods

    public List<Rating> findByUserId(Integer userId);
    public  List<Rating>findByHotelId(Integer hotelId);
}
