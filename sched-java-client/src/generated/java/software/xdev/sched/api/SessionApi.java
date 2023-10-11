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

import software.xdev.sched.model.ExportSession;
import software.xdev.sched.model.Session;
import java.net.URI;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SessionApi {


  private ApiClient apiClient;

  public SessionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SessionApi(ApiClient apiClient) {
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
   * @param sessionKey Must be a unique alpha-numeric string. E.g.: 123, PANEL4, ST45K etc. (required)
   * @param name  (required)
   * @param sessionStart Full date + time for start of session Format: YYYY-MM-DD HH:MM (required)
   * @param sessionEnd Full date + time for end of session Format: YYYY-MM-DD HH:MM (required)
   * @param sessionType Used to filter sessions (required)
   * @param sessionSubtype For additional filter/organizing sessions (optional)
   * @param description Detailed description of the session. Links (HTML Tag \\&lt;a&gt;) allowed. Max Size: 8kb (optional)
   * @param mediaUrl URL for media: audio/video/documents. Must use HTTPS. (optional)
   * @param venue Building name / Company name etc. (optional)
   * @param address Room # / Street Address (optional)
   * @param tags Comma-separated words and phrases (optional)
   * @param seats Venue capacity - number of available seats (optional)
   * @param rsvpUrl URL used for Custom Button (optional)
   * @param ticketMessage Custom ticket upgrade message, displayed when attendee attempts to add the session without the correct ticket (accepts basic HTML) (optional)
   * @param active Y &#x3D; session is active, N &#x3D; session is deactivated and hidden (optional)
   * @param customFields To add custom named fields, just add your field names and their values (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String addSession(String sessionKey, String name, String sessionStart, String sessionEnd, String sessionType, String sessionSubtype, String description, URI mediaUrl, String venue, String address, String tags, String seats, URI rsvpUrl, String ticketMessage, String active, Object customFields) throws ApiException {
    return this.addSession(sessionKey, name, sessionStart, sessionEnd, sessionType, sessionSubtype, description, mediaUrl, venue, address, tags, seats, rsvpUrl, ticketMessage, active, customFields, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param sessionKey Must be a unique alpha-numeric string. E.g.: 123, PANEL4, ST45K etc. (required)
   * @param name  (required)
   * @param sessionStart Full date + time for start of session Format: YYYY-MM-DD HH:MM (required)
   * @param sessionEnd Full date + time for end of session Format: YYYY-MM-DD HH:MM (required)
   * @param sessionType Used to filter sessions (required)
   * @param sessionSubtype For additional filter/organizing sessions (optional)
   * @param description Detailed description of the session. Links (HTML Tag \\&lt;a&gt;) allowed. Max Size: 8kb (optional)
   * @param mediaUrl URL for media: audio/video/documents. Must use HTTPS. (optional)
   * @param venue Building name / Company name etc. (optional)
   * @param address Room # / Street Address (optional)
   * @param tags Comma-separated words and phrases (optional)
   * @param seats Venue capacity - number of available seats (optional)
   * @param rsvpUrl URL used for Custom Button (optional)
   * @param ticketMessage Custom ticket upgrade message, displayed when attendee attempts to add the session without the correct ticket (accepts basic HTML) (optional)
   * @param active Y &#x3D; session is active, N &#x3D; session is deactivated and hidden (optional)
   * @param customFields To add custom named fields, just add your field names and their values (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String addSession(String sessionKey, String name, String sessionStart, String sessionEnd, String sessionType, String sessionSubtype, String description, URI mediaUrl, String venue, String address, String tags, String seats, URI rsvpUrl, String ticketMessage, String active, Object customFields, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionKey' is set
    if (sessionKey == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionKey' when calling addSession");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling addSession");
    }
    
    // verify the required parameter 'sessionStart' is set
    if (sessionStart == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionStart' when calling addSession");
    }
    
    // verify the required parameter 'sessionEnd' is set
    if (sessionEnd == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionEnd' when calling addSession");
    }
    
    // verify the required parameter 'sessionType' is set
    if (sessionType == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionType' when calling addSession");
    }
    
    // create path and map variables
    String localVarPath = "/api/session/add";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("session_key", sessionKey));
    localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
    localVarQueryParams.addAll(apiClient.parameterToPair("session_start", sessionStart));
    localVarQueryParams.addAll(apiClient.parameterToPair("session_end", sessionEnd));
    localVarQueryParams.addAll(apiClient.parameterToPair("session_type", sessionType));
    localVarQueryParams.addAll(apiClient.parameterToPair("session_subtype", sessionSubtype));
    localVarQueryParams.addAll(apiClient.parameterToPair("description", description));
    localVarQueryParams.addAll(apiClient.parameterToPair("media_url", mediaUrl));
    localVarQueryParams.addAll(apiClient.parameterToPair("venue", venue));
    localVarQueryParams.addAll(apiClient.parameterToPair("address", address));
    localVarQueryParams.addAll(apiClient.parameterToPair("tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPair("seats", seats));
    localVarQueryParams.addAll(apiClient.parameterToPair("rsvp_url", rsvpUrl));
    localVarQueryParams.addAll(apiClient.parameterToPair("ticket_message", ticketMessage));
    localVarQueryParams.addAll(apiClient.parameterToPair("active", active));
    localVarQueryParams.addAll(apiClient.parameterToPair("custom_fields", customFields));
    
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
        "POST",
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
   * @param sessionKey Must be a unique alpha-numeric string. E.g.: 123, PANEL4, ST45K etc. (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteSession(String sessionKey) throws ApiException {
    return this.deleteSession(sessionKey, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param sessionKey Must be a unique alpha-numeric string. E.g.: 123, PANEL4, ST45K etc. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteSession(String sessionKey, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionKey' is set
    if (sessionKey == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionKey' when calling deleteSession");
    }
    
    // create path and map variables
    String localVarPath = "/api/session/del";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("session_key", sessionKey));
    
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
   * @param since Retrieve sessions modified since timestamp (Unix epoch time) (optional)
   * @param format One of \&quot;csv\&quot;, \&quot;xml\&quot;, \&quot;json\&quot;, \&quot;xls\&quot; (returns xlsx-File). Defaults to \&quot;csv\&quot; (optional)
   * @param fields Comma separated list of fields wanted. Select the order of needed fields by listing them here. Leave blank to get all available fields. (optional)
   * @param page To page results, provide a page number. Omit to get all sessions (optional)
   * @param limit Number of sessions per page. Defaults to 1000 (optional)
   * @param stripHtml Remove HTML tags from description. Include this parameter with value \&quot;Y\&quot; (optional)
   * @param customData Include this parameter with value \&quot;Y\&quot; if you have custom added fields. Note that spaces in field name will be replaced by underscores. (optional)
   * @return List&lt;ExportSession&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ExportSession> exportSessions(Integer since, String format, String fields, Integer page, Integer limit, String stripHtml, String customData) throws ApiException {
    return this.exportSessions(since, format, fields, page, limit, stripHtml, customData, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param since Retrieve sessions modified since timestamp (Unix epoch time) (optional)
   * @param format One of \&quot;csv\&quot;, \&quot;xml\&quot;, \&quot;json\&quot;, \&quot;xls\&quot; (returns xlsx-File). Defaults to \&quot;csv\&quot; (optional)
   * @param fields Comma separated list of fields wanted. Select the order of needed fields by listing them here. Leave blank to get all available fields. (optional)
   * @param page To page results, provide a page number. Omit to get all sessions (optional)
   * @param limit Number of sessions per page. Defaults to 1000 (optional)
   * @param stripHtml Remove HTML tags from description. Include this parameter with value \&quot;Y\&quot; (optional)
   * @param customData Include this parameter with value \&quot;Y\&quot; if you have custom added fields. Note that spaces in field name will be replaced by underscores. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;ExportSession&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ExportSession> exportSessions(Integer since, String format, String fields, Integer page, Integer limit, String stripHtml, String customData, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/session/export";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("since", since));
    localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
    localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("strip_html", stripHtml));
    localVarQueryParams.addAll(apiClient.parameterToPair("custom_data", customData));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json", "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    TypeReference<List<ExportSession>> localVarReturnType = new TypeReference<List<ExportSession>>() {};
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
   * @param since Retrieve sessions modified since timestamp (Unix epoch time) (optional)
   * @param format  (optional, default to json)
   * @param status Set to \&quot;del\&quot; to fetch only references to deleted sessions (optional)
   * @param customData Include this parameter with value \&quot;Y\&quot; if you have custom added fields. Note that spaces in field name will be replaced by underscores. (optional)
   * @return List&lt;Session&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Session> listSessions(Integer since, String format, String status, String customData) throws ApiException {
    return this.listSessions(since, format, status, customData, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param since Retrieve sessions modified since timestamp (Unix epoch time) (optional)
   * @param format  (optional, default to json)
   * @param status Set to \&quot;del\&quot; to fetch only references to deleted sessions (optional)
   * @param customData Include this parameter with value \&quot;Y\&quot; if you have custom added fields. Note that spaces in field name will be replaced by underscores. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;Session&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Session> listSessions(Integer since, String format, String status, String customData, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/session/list";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("since", since));
    localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
    localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
    localVarQueryParams.addAll(apiClient.parameterToPair("custom_data", customData));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json", "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    TypeReference<List<Session>> localVarReturnType = new TypeReference<List<Session>>() {};
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
   * @param sessionKey Must be a unique alpha-numeric string. E.g.: 123, PANEL4, ST45K etc. (required)
   * @param name  (optional)
   * @param sessionStart Full date + time for start of session Format: YYYY-MM-DD HH:MM (optional)
   * @param sessionEnd Full date + time for end of session Format: YYYY-MM-DD HH:MM (optional)
   * @param sessionType Used to filter sessions (optional)
   * @param sessionSubtype For additional filter/organizing sessions (optional)
   * @param description Detailed description of the session. Links (HTML Tag \\&lt;a&gt;) allowed. Max Size: 8kb (optional)
   * @param mediaUrl URL for media: audio/video/documents. Must use HTTPS. (optional)
   * @param venue Building name / Company name etc. (optional)
   * @param address Room # / Street Address (optional)
   * @param tags Comma-separated words and phrases (optional)
   * @param seats Venue capacity - number of available seats (optional)
   * @param rsvpUrl URL used for Custom Button (optional)
   * @param ticketMessage Custom ticket upgrade message, displayed when attendee attempts to add the session without the correct ticket (accepts basic HTML) (optional)
   * @param active Y &#x3D; session is active, N &#x3D; session is deactivated and hidden (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String modifySession(String sessionKey, String name, String sessionStart, String sessionEnd, String sessionType, String sessionSubtype, String description, URI mediaUrl, String venue, String address, String tags, String seats, URI rsvpUrl, String ticketMessage, String active) throws ApiException {
    return this.modifySession(sessionKey, name, sessionStart, sessionEnd, sessionType, sessionSubtype, description, mediaUrl, venue, address, tags, seats, rsvpUrl, ticketMessage, active, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param sessionKey Must be a unique alpha-numeric string. E.g.: 123, PANEL4, ST45K etc. (required)
   * @param name  (optional)
   * @param sessionStart Full date + time for start of session Format: YYYY-MM-DD HH:MM (optional)
   * @param sessionEnd Full date + time for end of session Format: YYYY-MM-DD HH:MM (optional)
   * @param sessionType Used to filter sessions (optional)
   * @param sessionSubtype For additional filter/organizing sessions (optional)
   * @param description Detailed description of the session. Links (HTML Tag \\&lt;a&gt;) allowed. Max Size: 8kb (optional)
   * @param mediaUrl URL for media: audio/video/documents. Must use HTTPS. (optional)
   * @param venue Building name / Company name etc. (optional)
   * @param address Room # / Street Address (optional)
   * @param tags Comma-separated words and phrases (optional)
   * @param seats Venue capacity - number of available seats (optional)
   * @param rsvpUrl URL used for Custom Button (optional)
   * @param ticketMessage Custom ticket upgrade message, displayed when attendee attempts to add the session without the correct ticket (accepts basic HTML) (optional)
   * @param active Y &#x3D; session is active, N &#x3D; session is deactivated and hidden (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String modifySession(String sessionKey, String name, String sessionStart, String sessionEnd, String sessionType, String sessionSubtype, String description, URI mediaUrl, String venue, String address, String tags, String seats, URI rsvpUrl, String ticketMessage, String active, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionKey' is set
    if (sessionKey == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionKey' when calling modifySession");
    }
    
    // create path and map variables
    String localVarPath = "/api/session/mod";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("session_key", sessionKey));
    localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
    localVarQueryParams.addAll(apiClient.parameterToPair("session_start", sessionStart));
    localVarQueryParams.addAll(apiClient.parameterToPair("session_end", sessionEnd));
    localVarQueryParams.addAll(apiClient.parameterToPair("session_type", sessionType));
    localVarQueryParams.addAll(apiClient.parameterToPair("session_subtype", sessionSubtype));
    localVarQueryParams.addAll(apiClient.parameterToPair("description", description));
    localVarQueryParams.addAll(apiClient.parameterToPair("media_url", mediaUrl));
    localVarQueryParams.addAll(apiClient.parameterToPair("venue", venue));
    localVarQueryParams.addAll(apiClient.parameterToPair("address", address));
    localVarQueryParams.addAll(apiClient.parameterToPair("tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPair("seats", seats));
    localVarQueryParams.addAll(apiClient.parameterToPair("rsvp_url", rsvpUrl));
    localVarQueryParams.addAll(apiClient.parameterToPair("ticket_message", ticketMessage));
    localVarQueryParams.addAll(apiClient.parameterToPair("active", active));
    
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
        "POST",
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
