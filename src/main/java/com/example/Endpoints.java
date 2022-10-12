package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "reviews" path)
 */
@Path("/")
public class Endpoints {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Review getReview() {
        Review review = new Review();
        review.setName("Bob");
        review.setAge(99);

        return review;
    }
}
