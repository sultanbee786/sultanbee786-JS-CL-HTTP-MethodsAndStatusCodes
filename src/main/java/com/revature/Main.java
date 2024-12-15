package com.revature;

// There is no need to edit this file.

public class Main {

    /**
     * The entry point of the application.
     * 
     * This method starts a Javalin server instance on port 8080 and that should set
     * up various HTTP endpoint examples.
     * 
     * Example curl commands for each endpoint are provided in the method body as
     * comments. You can optionally run the program and use these commands in the terminal to test your application manually.
     *
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        Endpoints.getJavalinInstance().start(8080);

        // curl http://localhost:8080/get-request

        // curl -X POST http://localhost:8080/post-request

        // curl -X PUT http://localhost:8080/put-request

        // curl -X DELETE http://localhost:8080/delete-request

        // curl -X PATCH http://localhost:8080/patch-request
    }

}
