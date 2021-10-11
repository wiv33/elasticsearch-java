/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the slm namespace.
 */
public class ElasticsearchSlmAsyncClient extends ApiClient {

	public ElasticsearchSlmAsyncClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: slm.delete_lifecycle

	/**
	 * Deletes an existing snapshot lifecycle policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-delete-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteLifecycleResponse> deleteLifecycle(DeleteLifecycleRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteLifecycleRequest.ENDPOINT);
	}

	/**
	 * Deletes an existing snapshot lifecycle policy.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-delete-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteLifecycleResponse> deleteLifecycle(
			Function<DeleteLifecycleRequest.Builder, ObjectBuilder<DeleteLifecycleRequest>> fn) throws IOException {
		return deleteLifecycle(fn.apply(new DeleteLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: slm.execute_lifecycle

	/**
	 * Immediately creates a snapshot according to the lifecycle policy, without
	 * waiting for the scheduled time.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-execute-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExecuteLifecycleResponse> executeLifecycle(ExecuteLifecycleRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ExecuteLifecycleRequest.ENDPOINT);
	}

	/**
	 * Immediately creates a snapshot according to the lifecycle policy, without
	 * waiting for the scheduled time.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-execute-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExecuteLifecycleResponse> executeLifecycle(
			Function<ExecuteLifecycleRequest.Builder, ObjectBuilder<ExecuteLifecycleRequest>> fn) throws IOException {
		return executeLifecycle(fn.apply(new ExecuteLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: slm.execute_retention

	/**
	 * Deletes any snapshots that are expired according to the policy's retention
	 * rules.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-execute-retention.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<ExecuteRetentionResponse> executeRetention() throws IOException {
		return this.transport.performRequestAsync(ExecuteRetentionRequest._INSTANCE, ExecuteRetentionRequest.ENDPOINT);
	}

	// ----- Endpoint: slm.get_lifecycle

	/**
	 * Retrieves one or more snapshot lifecycle policy definitions and information
	 * about the latest snapshot attempts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLifecycleResponse> getLifecycle(GetLifecycleRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetLifecycleRequest.ENDPOINT);
	}

	/**
	 * Retrieves one or more snapshot lifecycle policy definitions and information
	 * about the latest snapshot attempts.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetLifecycleResponse> getLifecycle(
			Function<GetLifecycleRequest.Builder, ObjectBuilder<GetLifecycleRequest>> fn) throws IOException {
		return getLifecycle(fn.apply(new GetLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: slm.get_stats

	/**
	 * Returns global and policy-level statistics about actions taken by snapshot
	 * lifecycle management.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/slm-api-get-stats.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetStatsResponse> getStats() throws IOException {
		return this.transport.performRequestAsync(GetStatsRequest._INSTANCE, GetStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: slm.get_status

	/**
	 * Retrieves the status of snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetStatusResponse> getStatus() throws IOException {
		return this.transport.performRequestAsync(GetStatusRequest._INSTANCE, GetStatusRequest.ENDPOINT);
	}

	// ----- Endpoint: slm.put_lifecycle

	/**
	 * Creates or updates a snapshot lifecycle policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-put-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutLifecycleResponse> putLifecycle(PutLifecycleRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutLifecycleRequest.ENDPOINT);
	}

	/**
	 * Creates or updates a snapshot lifecycle policy.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-put-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutLifecycleResponse> putLifecycle(
			Function<PutLifecycleRequest.Builder, ObjectBuilder<PutLifecycleRequest>> fn) throws IOException {
		return putLifecycle(fn.apply(new PutLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: slm.start

	/**
	 * Turns on snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-start.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<StartSlmResponse> start() throws IOException {
		return this.transport.performRequestAsync(StartSlmRequest._INSTANCE, StartSlmRequest.ENDPOINT);
	}

	// ----- Endpoint: slm.stop

	/**
	 * Turns off snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-stop.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<StopSlmResponse> stop() throws IOException {
		return this.transport.performRequestAsync(StopSlmRequest._INSTANCE, StopSlmRequest.ENDPOINT);
	}

}
