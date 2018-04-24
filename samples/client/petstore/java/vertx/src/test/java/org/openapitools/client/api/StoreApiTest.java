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

import org.openapitools.client.Configuration;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.runner.RunWith;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.Async;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class StoreApiTest {

    private StoreApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new StoreApiImpl();
    }
    
    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void deleteOrderTest(TestContext context) {
        Async async = context.async();
        String orderId = null;
        api.deleteOrder(orderId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getInventoryTest(TestContext context) {
        Async async = context.async();
        api.getInventory(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getOrderByIdTest(TestContext context) {
        Async async = context.async();
        Long orderId = null;
        api.getOrderById(orderId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Place an order for a pet
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void placeOrderTest(TestContext context) {
        Async async = context.async();
        Order order = null;
        api.placeOrder(order, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}