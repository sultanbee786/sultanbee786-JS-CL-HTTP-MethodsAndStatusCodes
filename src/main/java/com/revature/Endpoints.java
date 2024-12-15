package com.revature;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class Endpoints {

    /**
     * The getJavalinInstance method creates and configures a Javalin instance.
     * 
     * This method initializes a new Javalin object, sets up endpoints, and
     * associates them with their related handler methods.
     *
     * @return A configured Javalin instance ready to be started.
     */
    public static Javalin getJavalinInstance() {

        Javalin app = Javalin.create();

        // Below is an example endpoint. Its associated handler is the handleGetRequest
        // method
        app.get("/get-request", Endpoints::handleGetRequest);

        // TODO: create the POST endpoint to the "/post-request" path and associate it
        // with the handler method you will create named handlePostRequest

        // TODO: create the PUT endpoint to the "/put-request" path and associate it
        // with the handler method you will create named handlePutRequest

        // TODO: create the DELETE endpoint to the "/delete-request" path and associate
        // it with the handler method you will create named handleDeleteRequest

        // TODO: create the PATCH endpoint to the "/patch-request" path and associate it
        // with the handler method you will create named handlePatchRequest

        return app;
    }

    /**
     * The handleGetRequest method handles GET requests to the "/get-request" path.
     * 
     * This method sets the response body to "GET request endpoint" and
     * the HTTP status code to 202 (Accepted).
     *
     * @param ctx - The Javalin Context object containing information about the HTTP
     *            request and response.
     */
    private static void handleGetRequest(Context ctx) {
        ctx.result("GET request endpoint").status(202);
    }

    /**
     * The handlePostRequest method handles POST requests to the "/post-request"
     * path.
     * 
     * This method sets the response body to "POST request endpoint" and
     * the HTTP status code to 201 (Created).
     *
     * @param ctx - The Javalin Context object containing information about the HTTP
     *            request and response.
     */
    // TODO: create the POST endpoint's related handler based off of its above description

    /**
     * The handlePutRequest method handles PUT requests to the "/put-request" path.
     * 
     * This method sets the response body to "PUT request endpoint" and
     * the HTTP status code to 201 (Created).
     *
     * @param ctx - The Javalin Context object containing information about the HTTP
     *            request and response.
     */
    // TODO: create the PUT endpoint's related handler based off of its above description

    /**
     * The handleDeleteRequest method handles DELETE requests to the
     * "/delete-request" path.
     * 
     * This method sets the response body to "DELETE request endpoint" and
     * the HTTP status code to 200 (Success).
     *
     * @param ctx - The Javalin Context object containing information about the HTTP
     *            request and response.
     */
    // TODO: create the DELETE endpoint's related handler based off of its above description

    /**
     * The handlePatchRequest method handles PATCH requests to the "/patch-request"
     * path.
     * 
     * This method sets the response body to "PATCH request endpoint" and
     * the HTTP status code to 201 (Created).
     *
     * @param ctx - The Javalin Context object containing information about the HTTP
     *            request and response.
     */
    // TODO: create the PATCH endpoint's related handler based off of its above description
}
