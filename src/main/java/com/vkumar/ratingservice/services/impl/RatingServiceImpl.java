package com.vkumar.ratingservice.services.impl;

import com.vkumar.ratingservice.entities.RatingEntity;
import com.vkumar.ratingservice.models.Rating;
import com.vkumar.ratingservice.repositories.RatingRepository;
import com.vkumar.ratingservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public RatingEntity addRating(Rating request) {
        RatingEntity entity = RatingEntity.builder()
                .userId(request.getUserId())
                .hotelId(request.getHotelId())
                .rating(request.getRating())
                .feedback(request.getFeedback())
                .build();
        return ratingRepository.save(entity);
    }

    @Override
    public List<RatingEntity> getAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public List<RatingEntity> getAllRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<RatingEntity> getAllRatingsByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
