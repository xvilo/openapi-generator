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

import com.google.gson.reflect.TypeToken;
import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import java.io.File;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.openapitools.client.JSON;

import static io.restassured.http.Method.*;

public class FakeApi {

    private RequestSpecBuilder reqSpec;

    private FakeApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static FakeApi fake(RequestSpecBuilder reqSpec) {
        return new FakeApi(reqSpec);
    }


    public FakeOuterBooleanSerializeOper fakeOuterBooleanSerialize() {
        return new FakeOuterBooleanSerializeOper(reqSpec);
    }

    public FakeOuterCompositeSerializeOper fakeOuterCompositeSerialize() {
        return new FakeOuterCompositeSerializeOper(reqSpec);
    }

    public FakeOuterNumberSerializeOper fakeOuterNumberSerialize() {
        return new FakeOuterNumberSerializeOper(reqSpec);
    }

    public FakeOuterStringSerializeOper fakeOuterStringSerialize() {
        return new FakeOuterStringSerializeOper(reqSpec);
    }

    public TestBodyWithQueryParamsOper testBodyWithQueryParams() {
        return new TestBodyWithQueryParamsOper(reqSpec);
    }

    public TestClientModelOper testClientModel() {
        return new TestClientModelOper(reqSpec);
    }

    public TestEndpointParametersOper testEndpointParameters() {
        return new TestEndpointParametersOper(reqSpec);
    }

    public TestEnumParametersOper testEnumParameters() {
        return new TestEnumParametersOper(reqSpec);
    }

    public TestInlineAdditionalPropertiesOper testInlineAdditionalProperties() {
        return new TestInlineAdditionalPropertiesOper(reqSpec);
    }

    public TestJsonFormDataOper testJsonFormData() {
        return new TestJsonFormDataOper(reqSpec);
    }

    /**
     * Customise request specification
     * @param consumer consumer
     * @return api
     */
    public FakeApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * 
     * Test serialization of outer boolean types
     *
     * @see #body Input boolean as post body (optional)
     * return Boolean
     */
    public class FakeOuterBooleanSerializeOper {

        public static final String REQ_URI = "/fake/outer/boolean";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public FakeOuterBooleanSerializeOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("*/*");
            this.respSpec = new ResponseSpecBuilder();
        }

        public FakeOuterBooleanSerializeOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("*/*");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /fake/outer/boolean
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        /**
         * POST /fake/outer/boolean
         * @param handler handler
         * @return Boolean
         */
        public Boolean executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Boolean>(){}.getType();
            return execute(handler).as(type);
        }

         /**
         * @param booleanPostBody (Boolean) Input boolean as post body (optional)
         * @return operation
         */
        public FakeOuterBooleanSerializeOper body(Boolean booleanPostBody) {
            reqSpec.setBody(booleanPostBody);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public FakeOuterBooleanSerializeOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public FakeOuterBooleanSerializeOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * Test serialization of object with outer number type
     *
     * @see #body Input composite as post body (optional)
     * return OuterComposite
     */
    public class FakeOuterCompositeSerializeOper {

        public static final String REQ_URI = "/fake/outer/composite";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public FakeOuterCompositeSerializeOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("*/*");
            this.respSpec = new ResponseSpecBuilder();
        }

        public FakeOuterCompositeSerializeOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("*/*");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /fake/outer/composite
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        /**
         * POST /fake/outer/composite
         * @param handler handler
         * @return OuterComposite
         */
        public OuterComposite executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<OuterComposite>(){}.getType();
            return execute(handler).as(type);
        }

         /**
         * @param outerComposite (OuterComposite) Input composite as post body (optional)
         * @return operation
         */
        public FakeOuterCompositeSerializeOper body(OuterComposite outerComposite) {
            reqSpec.setBody(outerComposite);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public FakeOuterCompositeSerializeOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public FakeOuterCompositeSerializeOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * Test serialization of outer number types
     *
     * @see #body Input number as post body (optional)
     * return BigDecimal
     */
    public class FakeOuterNumberSerializeOper {

        public static final String REQ_URI = "/fake/outer/number";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public FakeOuterNumberSerializeOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("*/*");
            this.respSpec = new ResponseSpecBuilder();
        }

        public FakeOuterNumberSerializeOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("*/*");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /fake/outer/number
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        /**
         * POST /fake/outer/number
         * @param handler handler
         * @return BigDecimal
         */
        public BigDecimal executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<BigDecimal>(){}.getType();
            return execute(handler).as(type);
        }

         /**
         * @param body (BigDecimal) Input number as post body (optional)
         * @return operation
         */
        public FakeOuterNumberSerializeOper body(BigDecimal body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public FakeOuterNumberSerializeOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public FakeOuterNumberSerializeOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * Test serialization of outer string types
     *
     * @see #body Input string as post body (optional)
     * return String
     */
    public class FakeOuterStringSerializeOper {

        public static final String REQ_URI = "/fake/outer/string";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public FakeOuterStringSerializeOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("*/*");
            this.respSpec = new ResponseSpecBuilder();
        }

        public FakeOuterStringSerializeOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("*/*");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /fake/outer/string
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        /**
         * POST /fake/outer/string
         * @param handler handler
         * @return String
         */
        public String executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<String>(){}.getType();
            return execute(handler).as(type);
        }

         /**
         * @param body (String) Input string as post body (optional)
         * @return operation
         */
        public FakeOuterStringSerializeOper body(String body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public FakeOuterStringSerializeOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public FakeOuterStringSerializeOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #queryQuery  (required)
     * @see #body  (required)
     */
    public class TestBodyWithQueryParamsOper {

        public static final String REQ_URI = "/fake/body-with-query-params";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public TestBodyWithQueryParamsOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public TestBodyWithQueryParamsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /fake/body-with-query-params
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(PUT, REQ_URI));
        }

         /**
         * @param user (User)  (required)
         * @return operation
         */
        public TestBodyWithQueryParamsOper body(User user) {
            reqSpec.setBody(user);
            return this;
        }

        /**
         * @param query (String)  (required)
         * @return operation
         */
        public TestBodyWithQueryParamsOper queryQuery(Object... query) {
            reqSpec.addQueryParam("query", query);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public TestBodyWithQueryParamsOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public TestBodyWithQueryParamsOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     *
     * @see #body client model (required)
     * return Client
     */
    public class TestClientModelOper {

        public static final String REQ_URI = "/fake";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public TestClientModelOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public TestClientModelOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /fake
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(PATCH, REQ_URI));
        }

        /**
         * PATCH /fake
         * @param handler handler
         * @return Client
         */
        public Client executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Client>(){}.getType();
            return execute(handler).as(type);
        }

         /**
         * @param client (Client) client model (required)
         * @return operation
         */
        public TestClientModelOper body(Client client) {
            reqSpec.setBody(client);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public TestClientModelOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public TestClientModelOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @see #numberForm None (required)
     * @see #_doubleForm None (required)
     * @see #patternWithoutDelimiterForm None (required)
     * @see #_byteForm None (required)
     * @see #integerForm None (optional)
     * @see #int32Form None (optional)
     * @see #int64Form None (optional)
     * @see #_floatForm None (optional)
     * @see #stringForm None (optional)
     * @see #binaryMultiPart None (optional)
     * @see #dateForm None (optional)
     * @see #dateTimeForm None (optional)
     * @see #passwordForm None (optional)
     * @see #paramCallbackForm None (optional)
     */
    public class TestEndpointParametersOper {

        public static final String REQ_URI = "/fake";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public TestEndpointParametersOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public TestEndpointParametersOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /fake
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

         /**
         * @param integer (Integer) None (optional)
         * @return operation
         */
         public TestEndpointParametersOper integerForm(Object... integer) {
            reqSpec.addFormParam("integer", integer);
            return this;
         }

         /**
         * @param int32 (Integer) None (optional)
         * @return operation
         */
         public TestEndpointParametersOper int32Form(Object... int32) {
            reqSpec.addFormParam("int32", int32);
            return this;
         }

         /**
         * @param int64 (Long) None (optional)
         * @return operation
         */
         public TestEndpointParametersOper int64Form(Object... int64) {
            reqSpec.addFormParam("int64", int64);
            return this;
         }

         /**
         * @param number (BigDecimal) None (required)
         * @return operation
         */
         public TestEndpointParametersOper numberForm(Object... number) {
            reqSpec.addFormParam("number", number);
            return this;
         }

         /**
         * @param _float (Float) None (optional)
         * @return operation
         */
         public TestEndpointParametersOper _floatForm(Object... _float) {
            reqSpec.addFormParam("float", _float);
            return this;
         }

         /**
         * @param _double (Double) None (required)
         * @return operation
         */
         public TestEndpointParametersOper _doubleForm(Object... _double) {
            reqSpec.addFormParam("double", _double);
            return this;
         }

         /**
         * @param string (String) None (optional)
         * @return operation
         */
         public TestEndpointParametersOper stringForm(Object... string) {
            reqSpec.addFormParam("string", string);
            return this;
         }

         /**
         * @param patternWithoutDelimiter (String) None (required)
         * @return operation
         */
         public TestEndpointParametersOper patternWithoutDelimiterForm(Object... patternWithoutDelimiter) {
            reqSpec.addFormParam("pattern_without_delimiter", patternWithoutDelimiter);
            return this;
         }

         /**
         * @param _byte (byte[]) None (required)
         * @return operation
         */
         public TestEndpointParametersOper _byteForm(Object... _byte) {
            reqSpec.addFormParam("byte", _byte);
            return this;
         }

         /**
         * @param date (LocalDate) None (optional)
         * @return operation
         */
         public TestEndpointParametersOper dateForm(Object... date) {
            reqSpec.addFormParam("date", date);
            return this;
         }

         /**
         * @param dateTime (OffsetDateTime) None (optional)
         * @return operation
         */
         public TestEndpointParametersOper dateTimeForm(Object... dateTime) {
            reqSpec.addFormParam("dateTime", dateTime);
            return this;
         }

         /**
         * @param password (String) None (optional)
         * @return operation
         */
         public TestEndpointParametersOper passwordForm(Object... password) {
            reqSpec.addFormParam("password", password);
            return this;
         }

         /**
         * @param paramCallback (String) None (optional)
         * @return operation
         */
         public TestEndpointParametersOper paramCallbackForm(Object... paramCallback) {
            reqSpec.addFormParam("callback", paramCallback);
            return this;
         }

         /**
         * It will assume that the control name is file and the &lt;content-type&gt; is &lt;application/octet-stream&gt;
         * @see #reqSpec for customise
         * @param binary (File) None (optional)
         * @return operation
         */
         public TestEndpointParametersOper binaryMultiPart(File binary) {
            reqSpec.addMultiPart(binary);
            return this;
         }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public TestEndpointParametersOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public TestEndpointParametersOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * To test enum parameters
     * To test enum parameters
     *
     * @see #enumHeaderStringArrayHeader Header parameter enum test (string array) (optional)
     * @see #enumHeaderStringHeader Header parameter enum test (string) (optional, default to -efg)
     * @see #enumQueryStringArrayQuery Query parameter enum test (string array) (optional)
     * @see #enumQueryStringQuery Query parameter enum test (string) (optional, default to -efg)
     * @see #enumQueryIntegerQuery Query parameter enum test (double) (optional)
     * @see #enumQueryDoubleQuery Query parameter enum test (double) (optional)
     * @see #enumFormStringArrayForm Form parameter enum test (string array) (optional)
     * @see #enumFormStringForm Form parameter enum test (string) (optional)
     */
    public class TestEnumParametersOper {

        public static final String REQ_URI = "/fake";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public TestEnumParametersOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public TestEnumParametersOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /fake
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * @param enumHeaderStringArray (List&lt;String&gt;) Header parameter enum test (string array) (optional)
         * @return operation
         */
        public TestEnumParametersOper enumHeaderStringArrayHeader(String enumHeaderStringArray) {
            reqSpec.addHeader("enum_header_string_array", enumHeaderStringArray);
            return this;
        }

        /**
         * @param enumHeaderString (String) Header parameter enum test (string) (optional, default to -efg)
         * @return operation
         */
        public TestEnumParametersOper enumHeaderStringHeader(String enumHeaderString) {
            reqSpec.addHeader("enum_header_string", enumHeaderString);
            return this;
        }

        /**
         * @param enumQueryStringArray (List&lt;String&gt;) Query parameter enum test (string array) (optional)
         * @return operation
         */
        public TestEnumParametersOper enumQueryStringArrayQuery(Object... enumQueryStringArray) {
            reqSpec.addQueryParam("enum_query_string_array", enumQueryStringArray);
            return this;
        }

        /**
         * @param enumQueryString (String) Query parameter enum test (string) (optional, default to -efg)
         * @return operation
         */
        public TestEnumParametersOper enumQueryStringQuery(Object... enumQueryString) {
            reqSpec.addQueryParam("enum_query_string", enumQueryString);
            return this;
        }

        /**
         * @param enumQueryInteger (Integer) Query parameter enum test (double) (optional)
         * @return operation
         */
        public TestEnumParametersOper enumQueryIntegerQuery(Object... enumQueryInteger) {
            reqSpec.addQueryParam("enum_query_integer", enumQueryInteger);
            return this;
        }

        /**
         * @param enumQueryDouble (Double) Query parameter enum test (double) (optional)
         * @return operation
         */
        public TestEnumParametersOper enumQueryDoubleQuery(Object... enumQueryDouble) {
            reqSpec.addQueryParam("enum_query_double", enumQueryDouble);
            return this;
        }

         /**
         * @param enumFormStringArray (List&lt;String&gt;) Form parameter enum test (string array) (optional)
         * @return operation
         */
         public TestEnumParametersOper enumFormStringArrayForm(Object... enumFormStringArray) {
            reqSpec.addFormParam("enum_form_string_array", enumFormStringArray);
            return this;
         }

         /**
         * @param enumFormString (String) Form parameter enum test (string) (optional)
         * @return operation
         */
         public TestEnumParametersOper enumFormStringForm(Object... enumFormString) {
            reqSpec.addFormParam("enum_form_string", enumFormString);
            return this;
         }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public TestEnumParametersOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public TestEnumParametersOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * test inline additionalProperties
     * 
     *
     * @see #body request body (required)
     */
    public class TestInlineAdditionalPropertiesOper {

        public static final String REQ_URI = "/fake/inline-additionalProperties";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public TestInlineAdditionalPropertiesOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public TestInlineAdditionalPropertiesOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /fake/inline-additionalProperties
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

         /**
         * @param requestBody (String) request body (required)
         * @return operation
         */
        public TestInlineAdditionalPropertiesOper body(String requestBody) {
            reqSpec.setBody(requestBody);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public TestInlineAdditionalPropertiesOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public TestInlineAdditionalPropertiesOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * test json serialization of form data
     * 
     *
     * @see #paramForm field1 (required)
     * @see #param2Form field2 (required)
     */
    public class TestJsonFormDataOper {

        public static final String REQ_URI = "/fake/jsonFormData";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public TestJsonFormDataOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public TestJsonFormDataOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /fake/jsonFormData
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

         /**
         * @param param (String) field1 (required)
         * @return operation
         */
         public TestJsonFormDataOper paramForm(Object... param) {
            reqSpec.addFormParam("param", param);
            return this;
         }

         /**
         * @param param2 (String) field2 (required)
         * @return operation
         */
         public TestJsonFormDataOper param2Form(Object... param2) {
            reqSpec.addFormParam("param2", param2);
            return this;
         }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public TestJsonFormDataOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public TestJsonFormDataOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}