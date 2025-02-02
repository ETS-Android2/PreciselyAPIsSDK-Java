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

import com.precisely.ApiCallback;
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.ApiResponse;
import com.precisely.Configuration;
import com.precisely.Pair;
import com.precisely.ProgressRequestBody;
import com.precisely.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.IntersectionResponse;
import com.precisely.apis.model.SpeedLimit;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreetsServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StreetsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StreetsServiceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getIntersectionByAddress
     * @param address Address (optional)
     * @param roadClass Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All (optional)
     * @param driveTime Returns Intersection in specified drive time (optional)
     * @param driveTimeUnit Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes (optional)
     * @param searchRadius Search radius within which user wants to search, default is 50 miles (optional)
     * @param searchRadiusUnit Search radius unit, allowed values are (feet, meter, kilometers and miles) (optional)
     * @param historicSpeed Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) (optional)
     * @param maxCandidates max candidates to be returned default is 1 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIntersectionByAddressCall(String address, String roadClass, String driveTime, String driveTimeUnit, String searchRadius, String searchRadiusUnit, String historicSpeed, String maxCandidates, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/streets/v1/intersection/byaddress";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (address != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("address", address));
        }

        if (roadClass != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("roadClass", roadClass));
        }

        if (driveTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("driveTime", driveTime));
        }

        if (driveTimeUnit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("driveTimeUnit", driveTimeUnit));
        }

        if (searchRadius != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchRadius", searchRadius));
        }

        if (searchRadiusUnit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchRadiusUnit", searchRadiusUnit));
        }

        if (historicSpeed != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("historicSpeed", historicSpeed));
        }

        if (maxCandidates != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxCandidates", maxCandidates));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getIntersectionByAddressValidateBeforeCall(String address, String roadClass, String driveTime, String driveTimeUnit, String searchRadius, String searchRadiusUnit, String historicSpeed, String maxCandidates, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getIntersectionByAddressCall(address, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates, _callback);
        return localVarCall;

    }

    /**
     * Nearest Intesection By Address.
     * This service accepts an address as input and returns the Nearest Intersection.
     * @param address Address (optional)
     * @param roadClass Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All (optional)
     * @param driveTime Returns Intersection in specified drive time (optional)
     * @param driveTimeUnit Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes (optional)
     * @param searchRadius Search radius within which user wants to search, default is 50 miles (optional)
     * @param searchRadiusUnit Search radius unit, allowed values are (feet, meter, kilometers and miles) (optional)
     * @param historicSpeed Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) (optional)
     * @param maxCandidates max candidates to be returned default is 1 (optional)
     * @return IntersectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public IntersectionResponse getIntersectionByAddress(String address, String roadClass, String driveTime, String driveTimeUnit, String searchRadius, String searchRadiusUnit, String historicSpeed, String maxCandidates) throws ApiException {
        ApiResponse<IntersectionResponse> localVarResp = getIntersectionByAddressWithHttpInfo(address, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates);
        return localVarResp.getData();
    }

    /**
     * Nearest Intesection By Address.
     * This service accepts an address as input and returns the Nearest Intersection.
     * @param address Address (optional)
     * @param roadClass Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All (optional)
     * @param driveTime Returns Intersection in specified drive time (optional)
     * @param driveTimeUnit Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes (optional)
     * @param searchRadius Search radius within which user wants to search, default is 50 miles (optional)
     * @param searchRadiusUnit Search radius unit, allowed values are (feet, meter, kilometers and miles) (optional)
     * @param historicSpeed Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) (optional)
     * @param maxCandidates max candidates to be returned default is 1 (optional)
     * @return ApiResponse&lt;IntersectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IntersectionResponse> getIntersectionByAddressWithHttpInfo(String address, String roadClass, String driveTime, String driveTimeUnit, String searchRadius, String searchRadiusUnit, String historicSpeed, String maxCandidates) throws ApiException {
        okhttp3.Call localVarCall = getIntersectionByAddressValidateBeforeCall(address, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates, null);
        Type localVarReturnType = new TypeToken<IntersectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Nearest Intesection By Address. (asynchronously)
     * This service accepts an address as input and returns the Nearest Intersection.
     * @param address Address (optional)
     * @param roadClass Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All (optional)
     * @param driveTime Returns Intersection in specified drive time (optional)
     * @param driveTimeUnit Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes (optional)
     * @param searchRadius Search radius within which user wants to search, default is 50 miles (optional)
     * @param searchRadiusUnit Search radius unit, allowed values are (feet, meter, kilometers and miles) (optional)
     * @param historicSpeed Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) (optional)
     * @param maxCandidates max candidates to be returned default is 1 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIntersectionByAddressAsync(String address, String roadClass, String driveTime, String driveTimeUnit, String searchRadius, String searchRadiusUnit, String historicSpeed, String maxCandidates, final ApiCallback<IntersectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIntersectionByAddressValidateBeforeCall(address, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates, _callback);
        Type localVarReturnType = new TypeToken<IntersectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getIntersectionByLocation
     * @param longitude Longitude of the location. (optional)
     * @param latitude Latitude of the location. (optional)
     * @param roadClass Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All (optional)
     * @param driveTime Returns Intersection in specified drive time (optional)
     * @param driveTimeUnit Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes (optional)
     * @param searchRadius Search radius within which user wants to search, default is 50 miles (optional)
     * @param searchRadiusUnit Search radius unit, allowed values are (feet, meter, kilometers and miles) (optional)
     * @param historicSpeed Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) (optional)
     * @param maxCandidates max candidates to be returned default is 1 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIntersectionByLocationCall(String longitude, String latitude, String roadClass, String driveTime, String driveTimeUnit, String searchRadius, String searchRadiusUnit, String historicSpeed, String maxCandidates, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/streets/v1/intersection/bylocation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (longitude != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("longitude", longitude));
        }

        if (latitude != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("latitude", latitude));
        }

        if (roadClass != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("roadClass", roadClass));
        }

        if (driveTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("driveTime", driveTime));
        }

        if (driveTimeUnit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("driveTimeUnit", driveTimeUnit));
        }

        if (searchRadius != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchRadius", searchRadius));
        }

        if (searchRadiusUnit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchRadiusUnit", searchRadiusUnit));
        }

        if (historicSpeed != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("historicSpeed", historicSpeed));
        }

        if (maxCandidates != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxCandidates", maxCandidates));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getIntersectionByLocationValidateBeforeCall(String longitude, String latitude, String roadClass, String driveTime, String driveTimeUnit, String searchRadius, String searchRadiusUnit, String historicSpeed, String maxCandidates, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getIntersectionByLocationCall(longitude, latitude, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates, _callback);
        return localVarCall;

    }

    /**
     * Nearest Intesection By Location.
     * This service accepts latitude/longitude as input and returns the Nearest Intersection.
     * @param longitude Longitude of the location. (optional)
     * @param latitude Latitude of the location. (optional)
     * @param roadClass Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All (optional)
     * @param driveTime Returns Intersection in specified drive time (optional)
     * @param driveTimeUnit Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes (optional)
     * @param searchRadius Search radius within which user wants to search, default is 50 miles (optional)
     * @param searchRadiusUnit Search radius unit, allowed values are (feet, meter, kilometers and miles) (optional)
     * @param historicSpeed Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) (optional)
     * @param maxCandidates max candidates to be returned default is 1 (optional)
     * @return IntersectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public IntersectionResponse getIntersectionByLocation(String longitude, String latitude, String roadClass, String driveTime, String driveTimeUnit, String searchRadius, String searchRadiusUnit, String historicSpeed, String maxCandidates) throws ApiException {
        ApiResponse<IntersectionResponse> localVarResp = getIntersectionByLocationWithHttpInfo(longitude, latitude, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates);
        return localVarResp.getData();
    }

    /**
     * Nearest Intesection By Location.
     * This service accepts latitude/longitude as input and returns the Nearest Intersection.
     * @param longitude Longitude of the location. (optional)
     * @param latitude Latitude of the location. (optional)
     * @param roadClass Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All (optional)
     * @param driveTime Returns Intersection in specified drive time (optional)
     * @param driveTimeUnit Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes (optional)
     * @param searchRadius Search radius within which user wants to search, default is 50 miles (optional)
     * @param searchRadiusUnit Search radius unit, allowed values are (feet, meter, kilometers and miles) (optional)
     * @param historicSpeed Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) (optional)
     * @param maxCandidates max candidates to be returned default is 1 (optional)
     * @return ApiResponse&lt;IntersectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IntersectionResponse> getIntersectionByLocationWithHttpInfo(String longitude, String latitude, String roadClass, String driveTime, String driveTimeUnit, String searchRadius, String searchRadiusUnit, String historicSpeed, String maxCandidates) throws ApiException {
        okhttp3.Call localVarCall = getIntersectionByLocationValidateBeforeCall(longitude, latitude, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates, null);
        Type localVarReturnType = new TypeToken<IntersectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Nearest Intesection By Location. (asynchronously)
     * This service accepts latitude/longitude as input and returns the Nearest Intersection.
     * @param longitude Longitude of the location. (optional)
     * @param latitude Latitude of the location. (optional)
     * @param roadClass Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All (optional)
     * @param driveTime Returns Intersection in specified drive time (optional)
     * @param driveTimeUnit Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes (optional)
     * @param searchRadius Search radius within which user wants to search, default is 50 miles (optional)
     * @param searchRadiusUnit Search radius unit, allowed values are (feet, meter, kilometers and miles) (optional)
     * @param historicSpeed Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) (optional)
     * @param maxCandidates max candidates to be returned default is 1 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIntersectionByLocationAsync(String longitude, String latitude, String roadClass, String driveTime, String driveTimeUnit, String searchRadius, String searchRadiusUnit, String historicSpeed, String maxCandidates, final ApiCallback<IntersectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIntersectionByLocationValidateBeforeCall(longitude, latitude, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates, _callback);
        Type localVarReturnType = new TypeToken<IntersectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNearestSpeedLimit
     * @param path Accepts multiple points which will be snapped to the nearest road segment. Longitude and Latitude will be comma separated (longitude,latitude) and Point Coordinates will be separated by semi-colon(;) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNearestSpeedLimitCall(String path, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/streets/v1/speedlimit";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (path != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("path", path));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getNearestSpeedLimitValidateBeforeCall(String path, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getNearestSpeedLimitCall(path, _callback);
        return localVarCall;

    }

    /**
     * Nearest Speedlimit.
     * This service accepts point coordinates of a path as input and returns the posted speed limit of the road segment on which this path will snap.
     * @param path Accepts multiple points which will be snapped to the nearest road segment. Longitude and Latitude will be comma separated (longitude,latitude) and Point Coordinates will be separated by semi-colon(;) (optional)
     * @return SpeedLimit
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public SpeedLimit getNearestSpeedLimit(String path) throws ApiException {
        ApiResponse<SpeedLimit> localVarResp = getNearestSpeedLimitWithHttpInfo(path);
        return localVarResp.getData();
    }

    /**
     * Nearest Speedlimit.
     * This service accepts point coordinates of a path as input and returns the posted speed limit of the road segment on which this path will snap.
     * @param path Accepts multiple points which will be snapped to the nearest road segment. Longitude and Latitude will be comma separated (longitude,latitude) and Point Coordinates will be separated by semi-colon(;) (optional)
     * @return ApiResponse&lt;SpeedLimit&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SpeedLimit> getNearestSpeedLimitWithHttpInfo(String path) throws ApiException {
        okhttp3.Call localVarCall = getNearestSpeedLimitValidateBeforeCall(path, null);
        Type localVarReturnType = new TypeToken<SpeedLimit>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Nearest Speedlimit. (asynchronously)
     * This service accepts point coordinates of a path as input and returns the posted speed limit of the road segment on which this path will snap.
     * @param path Accepts multiple points which will be snapped to the nearest road segment. Longitude and Latitude will be comma separated (longitude,latitude) and Point Coordinates will be separated by semi-colon(;) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNearestSpeedLimitAsync(String path, final ApiCallback<SpeedLimit> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNearestSpeedLimitValidateBeforeCall(path, _callback);
        Type localVarReturnType = new TypeToken<SpeedLimit>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
