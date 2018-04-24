/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws IOException {
        User user = null;
        api.createUser(user);

        // TODO: test validations
    }
    
    /**
     * Creates list of users with given input array
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void createUsersWithArrayInputTest() throws IOException {
        List<User> user = null;
        api.createUsersWithArrayInput(user);

        // TODO: test validations
    }
    
    /**
     * Creates list of users with given input array
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void createUsersWithListInputTest() throws IOException {
        List<User> user = null;
        api.createUsersWithListInput(user);

        // TODO: test validations
    }
    
    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws IOException {
        String username = null;
        api.deleteUser(username);

        // TODO: test validations
    }
    
    /**
     * Get user by user name
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void getUserByNameTest() throws IOException {
        String username = null;
        User response = api.getUserByName(username);

        // TODO: test validations
    }
    
    /**
     * Logs user into the system
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void loginUserTest() throws IOException {
        String username = null;
        String password = null;
        String response = api.loginUser(username, password);

        // TODO: test validations
    }
    
    /**
     * Logs out current logged in user session
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void logoutUserTest() throws IOException {
        api.logoutUser();

        // TODO: test validations
    }
    
    /**
     * Updated user
     *
     * This can only be done by the logged in user.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws IOException {
        String username = null;
        User user = null;
        api.updateUser(username, user);

        // TODO: test validations
    }
    
}
