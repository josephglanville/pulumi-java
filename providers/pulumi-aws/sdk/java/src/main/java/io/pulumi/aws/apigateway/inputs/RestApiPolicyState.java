// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestApiPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final RestApiPolicyState Empty = new RestApiPolicyState();

    /**
     * JSON formatted policy document that controls access to the API Gateway.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * The ID of the REST API.
     * 
     */
    @Import(name="restApiId")
      private final @Nullable Output<String> restApiId;

    public Output<String> getRestApiId() {
        return this.restApiId == null ? Output.empty() : this.restApiId;
    }

    public RestApiPolicyState(
        @Nullable Output<String> policy,
        @Nullable Output<String> restApiId) {
        this.policy = policy;
        this.restApiId = restApiId;
    }

    private RestApiPolicyState() {
        this.policy = Output.empty();
        this.restApiId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestApiPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> policy;
        private @Nullable Output<String> restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(RestApiPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }
        public Builder restApiId(@Nullable Output<String> restApiId) {
            this.restApiId = restApiId;
            return this;
        }
        public Builder restApiId(@Nullable String restApiId) {
            this.restApiId = Output.ofNullable(restApiId);
            return this;
        }        public RestApiPolicyState build() {
            return new RestApiPolicyState(policy, restApiId);
        }
    }
}