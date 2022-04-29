// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DeploymentSpecificationRequestPoliciesRateLimitingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentSpecificationRequestPoliciesRateLimitingArgs Empty = new DeploymentSpecificationRequestPoliciesRateLimitingArgs();

    /**
     * (Updatable) The maximum number of requests per second to allow.
     * 
     */
    @Import(name="rateInRequestsPerSecond", required=true)
    private Output<Integer> rateInRequestsPerSecond;

    /**
     * @return (Updatable) The maximum number of requests per second to allow.
     * 
     */
    public Output<Integer> rateInRequestsPerSecond() {
        return this.rateInRequestsPerSecond;
    }

    /**
     * (Updatable) The key used to group requests together.
     * 
     */
    @Import(name="rateKey", required=true)
    private Output<String> rateKey;

    /**
     * @return (Updatable) The key used to group requests together.
     * 
     */
    public Output<String> rateKey() {
        return this.rateKey;
    }

    private DeploymentSpecificationRequestPoliciesRateLimitingArgs() {}

    private DeploymentSpecificationRequestPoliciesRateLimitingArgs(DeploymentSpecificationRequestPoliciesRateLimitingArgs $) {
        this.rateInRequestsPerSecond = $.rateInRequestsPerSecond;
        this.rateKey = $.rateKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentSpecificationRequestPoliciesRateLimitingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentSpecificationRequestPoliciesRateLimitingArgs $;

        public Builder() {
            $ = new DeploymentSpecificationRequestPoliciesRateLimitingArgs();
        }

        public Builder(DeploymentSpecificationRequestPoliciesRateLimitingArgs defaults) {
            $ = new DeploymentSpecificationRequestPoliciesRateLimitingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rateInRequestsPerSecond (Updatable) The maximum number of requests per second to allow.
         * 
         * @return builder
         * 
         */
        public Builder rateInRequestsPerSecond(Output<Integer> rateInRequestsPerSecond) {
            $.rateInRequestsPerSecond = rateInRequestsPerSecond;
            return this;
        }

        /**
         * @param rateInRequestsPerSecond (Updatable) The maximum number of requests per second to allow.
         * 
         * @return builder
         * 
         */
        public Builder rateInRequestsPerSecond(Integer rateInRequestsPerSecond) {
            return rateInRequestsPerSecond(Output.of(rateInRequestsPerSecond));
        }

        /**
         * @param rateKey (Updatable) The key used to group requests together.
         * 
         * @return builder
         * 
         */
        public Builder rateKey(Output<String> rateKey) {
            $.rateKey = rateKey;
            return this;
        }

        /**
         * @param rateKey (Updatable) The key used to group requests together.
         * 
         * @return builder
         * 
         */
        public Builder rateKey(String rateKey) {
            return rateKey(Output.of(rateKey));
        }

        public DeploymentSpecificationRequestPoliciesRateLimitingArgs build() {
            $.rateInRequestsPerSecond = Objects.requireNonNull($.rateInRequestsPerSecond, "expected parameter 'rateInRequestsPerSecond' to be non-null");
            $.rateKey = Objects.requireNonNull($.rateKey, "expected parameter 'rateKey' to be non-null");
            return $;
        }
    }

}
