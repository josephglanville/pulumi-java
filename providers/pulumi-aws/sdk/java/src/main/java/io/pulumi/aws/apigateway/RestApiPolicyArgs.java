// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RestApiPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestApiPolicyArgs Empty = new RestApiPolicyArgs();

    /**
     * JSON formatted policy document that controls access to the API Gateway.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }

    /**
     * The ID of the REST API.
     * 
     */
    @Import(name="restApiId", required=true)
      private final Output<String> restApiId;

    public Output<String> getRestApiId() {
        return this.restApiId;
    }

    public RestApiPolicyArgs(
        Output<String> policy,
        Output<String> restApiId) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private RestApiPolicyArgs() {
        this.policy = Output.empty();
        this.restApiId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestApiPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> policy;
        private Output<String> restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(RestApiPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }
        public Builder restApiId(Output<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public Builder restApiId(String restApiId) {
            this.restApiId = Output.of(Objects.requireNonNull(restApiId));
            return this;
        }        public RestApiPolicyArgs build() {
            return new RestApiPolicyArgs(policy, restApiId);
        }
    }
}
