package com.lcwd.rating.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ratings")
public class Rating {

         @Id
         @GeneratedValue(strategy = GenerationType.AUTO)
        private int ratingId;
        private Integer userId;
        private Integer hotelId;
        private int rating;
        private String feedback;


    }


