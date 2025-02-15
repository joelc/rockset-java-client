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


import com.rockset.client.model.CancelQueryResponse;
import com.rockset.client.model.ErrorModel;
import com.rockset.client.model.ListQueriesResponse;
import com.rockset.client.model.QueryPaginationResponse;
import com.rockset.client.model.QueryRequest;
import com.rockset.client.model.QueryResponse;
import com.rockset.client.model.ValidateQueryResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueriesApi {
    private ApiClient apiClient;

    public QueriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public QueriesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cancel
     * @param queryId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelCall(String queryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/queries/{queryId}"
            .replaceAll("\\{" + "queryId" + "\\}", apiClient.escapeString(queryId.toString()));

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
    private com.squareup.okhttp.Call cancelValidateBeforeCall(String queryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'queryId' is set
        if (queryId == null) {
            throw new Exception("Missing the required parameter 'queryId' when calling cancel(Async)");
        }
        

        com.squareup.okhttp.Call call = cancelCall(queryId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Cancel query
     * Attempts to cancel an actively-running query.
     * @param queryId  (required)
     * @return CancelQueryResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CancelQueryResponse cancel(String queryId) throws Exception {
        ApiResponse<CancelQueryResponse> resp = cancelWithHttpInfo(queryId);
        return resp.getData();
    }

    /**
     * Cancel query
     * Attempts to cancel an actively-running query.
     * @param queryId  (required)
     * @return ApiResponse&lt;CancelQueryResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CancelQueryResponse> cancelWithHttpInfo(String queryId) throws Exception {
        com.squareup.okhttp.Call call = cancelValidateBeforeCall(queryId, null, null);
        Type localVarReturnType = new TypeToken<CancelQueryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancel query (asynchronously)
     * Attempts to cancel an actively-running query.
     * @param queryId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelAsync(String queryId, final ApiCallback<CancelQueryResponse> callback) throws Exception {

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

        com.squareup.okhttp.Call call = cancelValidateBeforeCall(queryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CancelQueryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for get
     * @param queryId  (required)
     * @param cursor  (optional)
     * @param docs  (optional)
     * @param offset  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCall(String queryId, String cursor, Integer docs, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/queries/{queryId}/pages"
            .replaceAll("\\{" + "queryId" + "\\}", apiClient.escapeString(queryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (docs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("docs", docs));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

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
    private com.squareup.okhttp.Call getValidateBeforeCall(String queryId, String cursor, Integer docs, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'queryId' is set
        if (queryId == null) {
            throw new Exception("Missing the required parameter 'queryId' when calling get(Async)");
        }
        

        com.squareup.okhttp.Call call = getCall(queryId, cursor, docs, offset, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch query results page
     * Returns a page of query results.
     * @param queryId  (required)
     * @param cursor  (optional)
     * @param docs  (optional)
     * @param offset  (optional)
     * @return QueryPaginationResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryPaginationResponse get(String queryId, String cursor, Integer docs, Integer offset) throws Exception {
        ApiResponse<QueryPaginationResponse> resp = getWithHttpInfo(queryId, cursor, docs, offset);
        return resp.getData();
    }

    /**
     * Fetch query results page
     * Returns a page of query results.
     * @param queryId  (required)
     * @param cursor  (optional)
     * @param docs  (optional)
     * @param offset  (optional)
     * @return ApiResponse&lt;QueryPaginationResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryPaginationResponse> getWithHttpInfo(String queryId, String cursor, Integer docs, Integer offset) throws Exception {
        com.squareup.okhttp.Call call = getValidateBeforeCall(queryId, cursor, docs, offset, null, null);
        Type localVarReturnType = new TypeToken<QueryPaginationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch query results page (asynchronously)
     * Returns a page of query results.
     * @param queryId  (required)
     * @param cursor  (optional)
     * @param docs  (optional)
     * @param offset  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsync(String queryId, String cursor, Integer docs, Integer offset, final ApiCallback<QueryPaginationResponse> callback) throws Exception {

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

        com.squareup.okhttp.Call call = getValidateBeforeCall(queryId, cursor, docs, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryPaginationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for get_0
     * @param queryId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call get_0Call(String queryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/queries/{queryId}"
            .replaceAll("\\{" + "queryId" + "\\}", apiClient.escapeString(queryId.toString()));

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
    private com.squareup.okhttp.Call get_0ValidateBeforeCall(String queryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'queryId' is set
        if (queryId == null) {
            throw new Exception("Missing the required parameter 'queryId' when calling get_0(Async)");
        }
        

        com.squareup.okhttp.Call call = get_0Call(queryId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get query information
     * Returns information about a query.
     * @param queryId  (required)
     * @return QueryResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResponse get_0(String queryId) throws Exception {
        ApiResponse<QueryResponse> resp = get_0WithHttpInfo(queryId);
        return resp.getData();
    }

    /**
     * Get query information
     * Returns information about a query.
     * @param queryId  (required)
     * @return ApiResponse&lt;QueryResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResponse> get_0WithHttpInfo(String queryId) throws Exception {
        com.squareup.okhttp.Call call = get_0ValidateBeforeCall(queryId, null, null);
        Type localVarReturnType = new TypeToken<QueryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get query information (asynchronously)
     * Returns information about a query.
     * @param queryId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call get_0Async(String queryId, final ApiCallback<QueryResponse> callback) throws Exception {

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

        com.squareup.okhttp.Call call = get_0ValidateBeforeCall(queryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResponse>(){}.getType();
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
        String localVarPath = "/v1/orgs/self/queries";

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
     * List Queries
     * Lists actively queued and running queries.
     * @return ListQueriesResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListQueriesResponse list() throws Exception {
        ApiResponse<ListQueriesResponse> resp = listWithHttpInfo();
        return resp.getData();
    }

    /**
     * List Queries
     * Lists actively queued and running queries.
     * @return ApiResponse&lt;ListQueriesResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListQueriesResponse> listWithHttpInfo() throws Exception {
        com.squareup.okhttp.Call call = listValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ListQueriesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Queries (asynchronously)
     * Lists actively queued and running queries.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAsync(final ApiCallback<ListQueriesResponse> callback) throws Exception {

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
        Type localVarReturnType = new TypeToken<ListQueriesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for query
     * @param body JSON object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryCall(QueryRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/queries";

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
    private com.squareup.okhttp.Call queryValidateBeforeCall(QueryRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new Exception("Missing the required parameter 'body' when calling query(Async)");
        }
        

        com.squareup.okhttp.Call call = queryCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Query
     * Make a SQL query to Rockset.
     * @param body JSON object (required)
     * @return QueryResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResponse query(QueryRequest body) throws Exception {
        ApiResponse<QueryResponse> resp = queryWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Query
     * Make a SQL query to Rockset.
     * @param body JSON object (required)
     * @return ApiResponse&lt;QueryResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResponse> queryWithHttpInfo(QueryRequest body) throws Exception {
        com.squareup.okhttp.Call call = queryValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<QueryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Query (asynchronously)
     * Make a SQL query to Rockset.
     * @param body JSON object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryAsync(QueryRequest body, final ApiCallback<QueryResponse> callback) throws Exception {

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

        com.squareup.okhttp.Call call = queryValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for validate
     * @param body JSON object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call validateCall(QueryRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/queries/validations";

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
    private com.squareup.okhttp.Call validateValidateBeforeCall(QueryRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new Exception("Missing the required parameter 'body' when calling validate(Async)");
        }
        

        com.squareup.okhttp.Call call = validateCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Validate Query
     * Validate a SQL query with Rockset&#39;s parser and planner.
     * @param body JSON object (required)
     * @return ValidateQueryResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ValidateQueryResponse validate(QueryRequest body) throws Exception {
        ApiResponse<ValidateQueryResponse> resp = validateWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Validate Query
     * Validate a SQL query with Rockset&#39;s parser and planner.
     * @param body JSON object (required)
     * @return ApiResponse&lt;ValidateQueryResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ValidateQueryResponse> validateWithHttpInfo(QueryRequest body) throws Exception {
        com.squareup.okhttp.Call call = validateValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ValidateQueryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Validate Query (asynchronously)
     * Validate a SQL query with Rockset&#39;s parser and planner.
     * @param body JSON object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call validateAsync(QueryRequest body, final ApiCallback<ValidateQueryResponse> callback) throws Exception {

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

        com.squareup.okhttp.Call call = validateValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ValidateQueryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
