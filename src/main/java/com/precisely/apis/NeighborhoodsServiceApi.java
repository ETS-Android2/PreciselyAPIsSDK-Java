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
import com.precisely.apis.model.NeighborhoodsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NeighborhoodsServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NeighborhoodsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NeighborhoodsServiceApi(ApiClient apiClient) {
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
     * Build call for getPlaceByLocation
     * @param longitude Longitude of the location. (optional)
     * @param latitude Latitude of the location. (optional)
     * @param levelHint Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6 (optional)
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
    public okhttp3.Call getPlaceByLocationCall(String longitude, String latitude, String levelHint, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/neighborhoods/v1/place/bylocation";

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

        if (levelHint != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("levelHint", levelHint));
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
    private okhttp3.Call getPlaceByLocationValidateBeforeCall(String longitude, String latitude, String levelHint, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getPlaceByLocationCall(longitude, latitude, levelHint, _callback);
        return localVarCall;

    }

    /**
     * Place By Location.
     * Identifies and retrieves the nearest neighborhood around a specific location. This service accepts latitude &amp; longitude as input and returns a place name.
     * @param longitude Longitude of the location. (optional)
     * @param latitude Latitude of the location. (optional)
     * @param levelHint Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6 (optional)
     * @return NeighborhoodsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public NeighborhoodsResponse getPlaceByLocation(String longitude, String latitude, String levelHint) throws ApiException {
        ApiResponse<NeighborhoodsResponse> localVarResp = getPlaceByLocationWithHttpInfo(longitude, latitude, levelHint);
        return localVarResp.getData();
    }

    /**
     * Place By Location.
     * Identifies and retrieves the nearest neighborhood around a specific location. This service accepts latitude &amp; longitude as input and returns a place name.
     * @param longitude Longitude of the location. (optional)
     * @param latitude Latitude of the location. (optional)
     * @param levelHint Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6 (optional)
     * @return ApiResponse&lt;NeighborhoodsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<NeighborhoodsResponse> getPlaceByLocationWithHttpInfo(String longitude, String latitude, String levelHint) throws ApiException {
        okhttp3.Call localVarCall = getPlaceByLocationValidateBeforeCall(longitude, latitude, levelHint, null);
        Type localVarReturnType = new TypeToken<NeighborhoodsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Place By Location. (asynchronously)
     * Identifies and retrieves the nearest neighborhood around a specific location. This service accepts latitude &amp; longitude as input and returns a place name.
     * @param longitude Longitude of the location. (optional)
     * @param latitude Latitude of the location. (optional)
     * @param levelHint Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6 (optional)
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
    public okhttp3.Call getPlaceByLocationAsync(String longitude, String latitude, String levelHint, final ApiCallback<NeighborhoodsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlaceByLocationValidateBeforeCall(longitude, latitude, levelHint, _callback);
        Type localVarReturnType = new TypeToken<NeighborhoodsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
