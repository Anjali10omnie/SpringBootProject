package com.rating.system.Service;

import java.util.List;

import com.rating.system.entity.Rating;

public interface RatingService {
	public Rating create(Rating rating);
	List<Rating> getRatings();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByHotelId(String hotelId);

}
