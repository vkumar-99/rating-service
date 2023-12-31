package com.vkumar.ratingservice.services;

import com.vkumar.ratingservice.entities.RatingEntity;
import com.vkumar.ratingservice.models.Rating;

import java.util.List;

public interface RatingService {

    RatingEntity addRating(Rating request);

    List<RatingEntity> getAllRating();

    List<RatingEntity> getAllRatingsByUserId(String userId);

    List<RatingEntity> getAllRatingsByHotelId(String hotelId);
}
