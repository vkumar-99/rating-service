package com.vkumar.ratingservice.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user_rating")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RatingEntity {

    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
}
