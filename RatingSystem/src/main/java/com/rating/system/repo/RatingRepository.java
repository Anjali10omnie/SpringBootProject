package com.rating.system.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rating.system.entity.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {

	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
	
}
