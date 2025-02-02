/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.NeighborhoodsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NeighborhoodsServiceApi
 */
@Ignore
public class NeighborhoodsServiceApiTest {

    private final NeighborhoodsServiceApi api = new NeighborhoodsServiceApi();

    
    /**
     * Place By Location.
     *
     * Identifies and retrieves the nearest neighborhood around a specific location. This service accepts latitude &amp; longitude as input and returns a place name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlaceByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String levelHint = null;
                NeighborhoodsResponse response = api.getPlaceByLocation(longitude, latitude, levelHint);
        // TODO: test validations
    }
    
}
