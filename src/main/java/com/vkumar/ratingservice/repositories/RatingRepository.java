package com.vkumar.ratingservice.repositories;

import com.vkumar.ratingservice.entities.RatingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<RatingEntity, String> {

    List<RatingEntity> findByUserId(String userId);

    List<RatingEntity> findByHotelId(String userId);
}
