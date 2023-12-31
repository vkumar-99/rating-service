package com.vkumar.ratingservice.controllers;

import com.vkumar.ratingservice.entities.RatingEntity;
import com.vkumar.ratingservice.models.Rating;
import com.vkumar.ratingservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService service;

    @PostMapping
    public ResponseEntity<RatingEntity> addRating(@RequestBody Rating request) {
        RatingEntity entity = service.addRating(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

    @GetMapping
    public ResponseEntity<List<RatingEntity>> getAllRating() {
        return ResponseEntity.ok(service.getAllRating());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<RatingEntity>> getAllRatingByUserId(@PathVariable("id") String id) {
        return ResponseEntity.ok(service.getAllRatingsByUserId(id));
    }

    @GetMapping("/hotel/{id}")
    public ResponseEntity<List<RatingEntity>> getAllRatingByHotelId(@PathVariable("id") String id) {
        return ResponseEntity.ok(service.getAllRatingsByHotelId(id));
    }
}
