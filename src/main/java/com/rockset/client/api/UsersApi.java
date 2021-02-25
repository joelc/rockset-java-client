/*
 * REST API
 * Rockset's REST API allows for creating and managing all resources in Rockset. Each supported endpoint is documented below.  All requests must be authorized with a Rockset API key, which can be created in the [Rockset console](https://console.rockset.com). The API key must be provided as `ApiKey <api_key>` in the `Authorization` request header. For example: ``` Authorization: ApiKey aB35kDjg93J5nsf4GjwMeErAVd832F7ad4vhsW1S02kfZiab42sTsfW5Sxt25asT ```  All endpoints are only accessible via https.  Build something awesome!
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rockset.client.api;

import com.rockset.client.ApiCallback;
import com.rockset.client.ApiClient;
import com.rockset.client.ApiResponse;
import com.rockset.client.Configuration;
import com.rockset.client.Pair;
import com.rockset.client.ProgressRequestBody;
import com.rockset.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.rockset.client.model.CreateUserRequest;
import com.rockset.client.model.CreateUserResponse;
import com.rockset.client.model.DeleteUserResponse;
import com.rockset.client.model.ErrorModel;
import com.rockset.client.model.ListUsersResponse;
import com.rockset.client.model.User;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for create
     * @param body JSON object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCall(CreateUserRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createValidateBeforeCall(CreateUserRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new Exception("Missing the required parameter 'body' when calling create(Async)");
        }
        

        com.squareup.okhttp.Call call = createCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create User
     * Create a new user for an organization.
     * @param body JSON object (required)
     * @return CreateUserResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateUserResponse create(CreateUserRequest body) throws Exception {
        ApiResponse<CreateUserResponse> resp = createWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create User
     * Create a new user for an organization.
     * @param body JSON object (required)
     * @return ApiResponse&lt;CreateUserResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateUserResponse> createWithHttpInfo(CreateUserRequest body) throws Exception {
        com.squareup.okhttp.Call call = createValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CreateUserResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create User (asynchronously)
     * Create a new user for an organization.
     * @param body JSON object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAsync(CreateUserRequest body, final ApiCallback<CreateUserResponse> callback) throws Exception {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateUserResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param user user email (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/users/{user}"
            .replaceAll("\\{" + "user" + "\\}", apiClient.escapeString(user.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteValidateBeforeCall(String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new Exception("Missing the required parameter 'user' when calling delete(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCall(user, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete User
     * Delete a user from an organization.
     * @param user user email (required)
     * @return DeleteUserResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteUserResponse delete(String user) throws Exception {
        ApiResponse<DeleteUserResponse> resp = deleteWithHttpInfo(user);
        return resp.getData();
    }

    /**
     * Delete User
     * Delete a user from an organization.
     * @param user user email (required)
     * @return ApiResponse&lt;DeleteUserResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteUserResponse> deleteWithHttpInfo(String user) throws Exception {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(user, null, null);
        Type localVarReturnType = new TypeToken<DeleteUserResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete User (asynchronously)
     * Delete a user from an organization.
     * @param user user email (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(String user, final ApiCallback<DeleteUserResponse> callback) throws Exception {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(user, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteUserResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for get
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/users/self";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        

        com.squareup.okhttp.Call call = getCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Current User
     * Retrieve currently authenticated user.
     * @return User
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public User get() throws Exception {
        ApiResponse<User> resp = getWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Current User
     * Retrieve currently authenticated user.
     * @return ApiResponse&lt;User&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<User> getWithHttpInfo() throws Exception {
        com.squareup.okhttp.Call call = getValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Current User (asynchronously)
     * Retrieve currently authenticated user.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsync(final ApiCallback<User> callback) throws Exception {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for list
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        

        com.squareup.okhttp.Call call = listCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Users
     * Retrieve all users for an organization.
     * @return ListUsersResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListUsersResponse list() throws Exception {
        ApiResponse<ListUsersResponse> resp = listWithHttpInfo();
        return resp.getData();
    }

    /**
     * List Users
     * Retrieve all users for an organization.
     * @return ApiResponse&lt;ListUsersResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListUsersResponse> listWithHttpInfo() throws Exception {
        com.squareup.okhttp.Call call = listValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ListUsersResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Users (asynchronously)
     * Retrieve all users for an organization.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAsync(final ApiCallback<ListUsersResponse> callback) throws Exception {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListUsersResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
