package com.lcwd.rating.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class   RatingDto {

    private Integer userId;
    private Integer hotelId;
    private int rating;
    private String feedback;

}
