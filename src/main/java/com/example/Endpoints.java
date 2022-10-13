package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

/**
 * Root resource (exposed at "reviews" path)
 */
@Path("/{id}")
public class Endpoints {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Reviews getReview(@PathParam("id") int id) {
        Rating rating1 = new Rating();
        rating1.setStars(5);
        rating1.setColor("red");

        Review review1 = new Review();
        review1.setReviewer("Bob");
        review1.setText("An extremely entertaining play by Shakespeare. The slapstick humour is refreshing!");
        review1.setRating(rating1);

        Rating rating2 = new Rating();
        rating2.setStars(5);
        rating2.setColor("red");

        Review review2 = new Review();
        review2.setReviewer("Alice");
        review2.setText("Absolutely fun and entertaining. The play lacks thematic depth when compared to other plays by Shakespeare.");
        review2.setRating(rating2);

        List<Review> reviewList = new ArrayList<>();
        reviewList.add(review1);
        reviewList.add(review2);

        Reviews reviews = new Reviews();
        reviews.setId(id);
        reviews.setReviews(reviewList);

        return reviews;
    }
}
