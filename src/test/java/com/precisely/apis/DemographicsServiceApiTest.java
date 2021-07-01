/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.Demographics;
import com.precisely.apis.model.DemographicsAdvancedRequest;
import com.precisely.apis.model.Segmentation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DemographicsServiceApi
 */
public class DemographicsServiceApiTest {

    private final DemographicsServiceApi api = new DemographicsServiceApi();

    
    /**
     * Demographics Advanced Endpoint
     *
     * Demographics Advanced Endpoint will return the aggregated values of the selected demographics variables of the regions falling inside a user provided geometry or travel time/distance boundaries. All the intersecting demographic boundaries will be snapped completely, and user will have option to request these boundaries in response.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDemographicsAdvancedTest() throws ApiException {
        DemographicsAdvancedRequest body = null;
        // Demographics response = api.getDemographicsAdvanced(body);

        // TODO: test validations
    }
    
    /**
     * Demographics Basic
     *
     * Demographics Basic Endpoint will return the aggregated values of the selected demographics variables of the regions falling inside the search radius. All the intersecting demographic boundaries will be snapped completely and user will have option to request these boundaries in response.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDemographicsBasicTest() throws ApiException {
        String address = null;
        String longitude = null;
        String latitude = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String travelMode = null;
        String country = null;
        String profile = null;
        String filter = null;
        String includeGeometry = null;
        // Demographics response = api.getDemographicsBasic(address, longitude, latitude, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, country, profile, filter, includeGeometry);

        // TODO: test validations
    }
    
    /**
     * Demographics By Address.
     *
     * Provides the demographic details around a specified address. GeoLife &#39;byaddress&#39; service accepts address as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDemographicsByAddressV2Test() throws ApiException {
        String address = null;
        String country = null;
        String profile = null;
        String filter = null;
        String valueFormat = null;
        String variableLevel = null;
        // Demographics response = api.getDemographicsByAddressV2(address, country, profile, filter, valueFormat, variableLevel);

        // TODO: test validations
    }
    
    /**
     * Demographics By Boundaryids.
     *
     * This endpoint will allow the user to request demographics details by census boundary id. Multiple comma separated boundary ids will be accepted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDemographicsByBoundaryIdsTest() throws ApiException {
        String boundaryIds = null;
        String profile = null;
        String filter = null;
        String valueFormat = null;
        String variableLevel = null;
        // Demographics response = api.getDemographicsByBoundaryIds(boundaryIds, profile, filter, valueFormat, variableLevel);

        // TODO: test validations
    }
    
    /**
     * Demographics By Location.
     *
     * Provides the demographic details around a specified location. GeoLife &#39;bylocation&#39; service accepts longitude and latitude as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDemographicsByLocationV2Test() throws ApiException {
        String longitude = null;
        String latitude = null;
        String profile = null;
        String filter = null;
        String valueFormat = null;
        String variableLevel = null;
        // Demographics response = api.getDemographicsByLocationV2(longitude, latitude, profile, filter, valueFormat, variableLevel);

        // TODO: test validations
    }
    
    /**
     * Segmentation By Address.
     *
     * Provides the segmentation details around a specified address. GeoLife &#39;Segmentation by Address&#39; service accepts address as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentationByAddressTest() throws ApiException {
        String address = null;
        String country = null;
        // Segmentation response = api.getSegmentationByAddress(address, country);

        // TODO: test validations
    }
    
    /**
     * Segmentation By Location.
     *
     * Provides the segmentation details around a specified location. GeoLife &#39;segmentation bylocation&#39; service accepts longitude and latitude as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentationByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        // Segmentation response = api.getSegmentationByLocation(longitude, latitude);

        // TODO: test validations
    }
    
}
