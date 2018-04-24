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

import org.openapitools.client.model.Order;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.StoreApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.GsonObjectMapper.gson;

/**
 * API tests for StoreApi
 */
@Ignore
public class StoreApiTest {

    private StoreApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder().setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://petstore.swagger.io:80/v2"))).store();
    }

    /**
     * Invalid ID supplied
     */
    @Test
    public void shouldSee400AfterDeleteOrder() {
        String orderId = null;
        api.deleteOrder()
                .orderIdPath(orderId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Order not found
     */
    @Test
    public void shouldSee404AfterDeleteOrder() {
        String orderId = null;
        api.deleteOrder()
                .orderIdPath(orderId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterGetInventory() {
        api.getInventory().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterGetOrderById() {
        Long orderId = null;
        api.getOrderById()
                .orderIdPath(orderId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid ID supplied
     */
    @Test
    public void shouldSee400AfterGetOrderById() {
        Long orderId = null;
        api.getOrderById()
                .orderIdPath(orderId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Order not found
     */
    @Test
    public void shouldSee404AfterGetOrderById() {
        Long orderId = null;
        api.getOrderById()
                .orderIdPath(orderId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterPlaceOrder() {
        Order order = null;
        api.placeOrder()
                .body(order).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid Order
     */
    @Test
    public void shouldSee400AfterPlaceOrder() {
        Order order = null;
        api.placeOrder()
                .body(order).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}