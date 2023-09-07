/*
 * Sched REST API
 * Sched REST API documentation by XDEV Software
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package software.xdev.sched.api;

import com.fasterxml.jackson.core.type.TypeReference;

import software.xdev.sched.client.ApiException;
import software.xdev.sched.client.ApiClient;
import software.xdev.sched.client.Configuration;
import software.xdev.sched.client.Pair;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleApi {


  private ApiClient apiClient;

  public RoleApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoleApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param username  (required)
   * @param role Currently one of the following: attendee, speaker, artist, sponsor, exhibitor (required)
   * @param sessions Comma separated string of session id&#39;s which the user will be connected to (optional)
   * @param sendEmail Default is 1 (on), Set to 0 (off). Whether to send e-mail with login credentials to user (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String addRole(String username, String role, String sessions, String sendEmail) throws ApiException {
    return this.addRole(username, role, sessions, sendEmail, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param username  (required)
   * @param role Currently one of the following: attendee, speaker, artist, sponsor, exhibitor (required)
   * @param sessions Comma separated string of session id&#39;s which the user will be connected to (optional)
   * @param sendEmail Default is 1 (on), Set to 0 (off). Whether to send e-mail with login credentials to user (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String addRole(String username, String role, String sessions, String sendEmail, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling addRole");
    }
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling addRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/role/add";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("username", username));
    localVarQueryParams.addAll(apiClient.parameterToPair("role", role));
    localVarQueryParams.addAll(apiClient.parameterToPair("sessions", sessions));
    localVarQueryParams.addAll(apiClient.parameterToPair("send_email", sendEmail));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   * @param username  (required)
   * @param role Currently one of the following: attendee, speaker, artist, sponsor, exhibitor (required)
   * @param sessions Comma separated string of session id&#39;s which the user will be disconnected from. If no sessions provided, the user will be disconnected from all sessions associated with given role (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRole(String username, String role, String sessions) throws ApiException {
    return this.deleteRole(username, role, sessions, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param username  (required)
   * @param role Currently one of the following: attendee, speaker, artist, sponsor, exhibitor (required)
   * @param sessions Comma separated string of session id&#39;s which the user will be disconnected from. If no sessions provided, the user will be disconnected from all sessions associated with given role (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRole(String username, String role, String sessions, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling deleteRole");
    }
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling deleteRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/role/del";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("username", username));
    localVarQueryParams.addAll(apiClient.parameterToPair("role", role));
    localVarQueryParams.addAll(apiClient.parameterToPair("sessions", sessions));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

}
