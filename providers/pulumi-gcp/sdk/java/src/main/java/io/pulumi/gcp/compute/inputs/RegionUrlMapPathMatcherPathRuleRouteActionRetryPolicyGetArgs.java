// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs();

    /**
     * Specifies the allowed number retries. This number must be > 0.
     * 
     */
    @Import(name="numRetries")
      private final @Nullable Output<Integer> numRetries;

    public Output<Integer> getNumRetries() {
        return this.numRetries == null ? Output.empty() : this.numRetries;
    }

    /**
     * Specifies a non-zero timeout per retry attempt.
     * Structure is documented below.
     * 
     */
    @Import(name="perTryTimeout")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> getPerTryTimeout() {
        return this.perTryTimeout == null ? Output.empty() : this.perTryTimeout;
    }

    /**
     * Specifies one or more conditions when this retry rule applies. Valid values are:
     * - 5xx: Loadbalancer will attempt a retry if the backend service responds with
     *   any 5xx response code, or if the backend service does not respond at all,
     *   example: disconnects, reset, read timeout, connection failure, and refused
     *   streams.
     * - gateway-error: Similar to 5xx, but only applies to response codes
     *   502, 503 or 504.
     * - connect-failure: Loadbalancer will retry on failures
     *   connecting to backend services, for example due to connection timeouts.
     * - retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
     *   Currently the only retriable error supported is 409.
     * - refused-stream: Loadbalancer will retry if the backend service resets the stream with a
     *   REFUSED_STREAM error code. This reset type indicates that it is safe to retry.
     * - cancelled: Loadbalancer will retry if the gRPC status code in the response
     *   header is set to cancelled
     * - deadline-exceeded: Loadbalancer will retry if the
     *   gRPC status code in the response header is set to deadline-exceeded
     * - resource-exhausted: Loadbalancer will retry if the gRPC status code in the response
     *   header is set to resource-exhausted
     * - unavailable: Loadbalancer will retry if
     *   the gRPC status code in the response header is set to unavailable
     * 
     */
    @Import(name="retryConditions")
      private final @Nullable Output<List<String>> retryConditions;

    public Output<List<String>> getRetryConditions() {
        return this.retryConditions == null ? Output.empty() : this.retryConditions;
    }

    public RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs(
        @Nullable Output<Integer> numRetries,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout,
        @Nullable Output<List<String>> retryConditions) {
        this.numRetries = numRetries;
        this.perTryTimeout = perTryTimeout;
        this.retryConditions = retryConditions;
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs() {
        this.numRetries = Output.empty();
        this.perTryTimeout = Output.empty();
        this.retryConditions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> numRetries;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout;
        private @Nullable Output<List<String>> retryConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        public Builder numRetries(@Nullable Output<Integer> numRetries) {
            this.numRetries = numRetries;
            return this;
        }
        public Builder numRetries(@Nullable Integer numRetries) {
            this.numRetries = Output.ofNullable(numRetries);
            return this;
        }
        public Builder perTryTimeout(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }
        public Builder perTryTimeout(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs perTryTimeout) {
            this.perTryTimeout = Output.ofNullable(perTryTimeout);
            return this;
        }
        public Builder retryConditions(@Nullable Output<List<String>> retryConditions) {
            this.retryConditions = retryConditions;
            return this;
        }
        public Builder retryConditions(@Nullable List<String> retryConditions) {
            this.retryConditions = Output.ofNullable(retryConditions);
            return this;
        }
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }        public RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs(numRetries, perTryTimeout, retryConditions);
        }
    }
}
