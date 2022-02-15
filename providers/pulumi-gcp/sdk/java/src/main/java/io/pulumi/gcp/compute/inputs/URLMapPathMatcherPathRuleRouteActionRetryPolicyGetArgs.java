// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs Empty = new URLMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs();

    @InputImport(name="numRetries")
    private final @Nullable Input<Integer> numRetries;

    public Input<Integer> getNumRetries() {
        return this.numRetries == null ? Input.empty() : this.numRetries;
    }

    @InputImport(name="perTryTimeout")
    private final @Nullable Input<URLMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout;

    public Input<URLMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> getPerTryTimeout() {
        return this.perTryTimeout == null ? Input.empty() : this.perTryTimeout;
    }

    @InputImport(name="retryConditions")
    private final @Nullable Input<List<String>> retryConditions;

    public Input<List<String>> getRetryConditions() {
        return this.retryConditions == null ? Input.empty() : this.retryConditions;
    }

    public URLMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs(
        @Nullable Input<Integer> numRetries,
        @Nullable Input<URLMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout,
        @Nullable Input<List<String>> retryConditions) {
        this.numRetries = numRetries;
        this.perTryTimeout = perTryTimeout;
        this.retryConditions = retryConditions;
    }

    private URLMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs() {
        this.numRetries = Input.empty();
        this.perTryTimeout = Input.empty();
        this.retryConditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> numRetries;
        private @Nullable Input<URLMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout;
        private @Nullable Input<List<String>> retryConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        public Builder setNumRetries(@Nullable Input<Integer> numRetries) {
            this.numRetries = numRetries;
            return this;
        }

        public Builder setNumRetries(@Nullable Integer numRetries) {
            this.numRetries = Input.ofNullable(numRetries);
            return this;
        }

        public Builder setPerTryTimeout(@Nullable Input<URLMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }

        public Builder setPerTryTimeout(@Nullable URLMapPathMatcherPathRuleRouteActionRetryPolicyPerTryTimeoutGetArgs perTryTimeout) {
            this.perTryTimeout = Input.ofNullable(perTryTimeout);
            return this;
        }

        public Builder setRetryConditions(@Nullable Input<List<String>> retryConditions) {
            this.retryConditions = retryConditions;
            return this;
        }

        public Builder setRetryConditions(@Nullable List<String> retryConditions) {
            this.retryConditions = Input.ofNullable(retryConditions);
            return this;
        }

        public URLMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs build() {
            return new URLMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs(numRetries, perTryTimeout, retryConditions);
        }
    }
}