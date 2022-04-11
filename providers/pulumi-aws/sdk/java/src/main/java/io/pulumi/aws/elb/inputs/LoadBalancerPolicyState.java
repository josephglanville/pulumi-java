// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.inputs;

import io.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPolicyState Empty = new LoadBalancerPolicyState();

    /**
     * The load balancer on which the policy is defined.
     * 
     */
    @Import(name="loadBalancerName")
      private final @Nullable Output<String> loadBalancerName;

    public Output<String> getLoadBalancerName() {
        return this.loadBalancerName == null ? Codegen.empty() : this.loadBalancerName;
    }

    /**
     * Policy attribute to apply to the policy.
     * 
     */
    @Import(name="policyAttributes")
      private final @Nullable Output<List<LoadBalancerPolicyPolicyAttributeGetArgs>> policyAttributes;

    public Output<List<LoadBalancerPolicyPolicyAttributeGetArgs>> getPolicyAttributes() {
        return this.policyAttributes == null ? Codegen.empty() : this.policyAttributes;
    }

    /**
     * The name of the load balancer policy.
     * 
     */
    @Import(name="policyName")
      private final @Nullable Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName == null ? Codegen.empty() : this.policyName;
    }

    /**
     * The policy type.
     * 
     */
    @Import(name="policyTypeName")
      private final @Nullable Output<String> policyTypeName;

    public Output<String> getPolicyTypeName() {
        return this.policyTypeName == null ? Codegen.empty() : this.policyTypeName;
    }

    public LoadBalancerPolicyState(
        @Nullable Output<String> loadBalancerName,
        @Nullable Output<List<LoadBalancerPolicyPolicyAttributeGetArgs>> policyAttributes,
        @Nullable Output<String> policyName,
        @Nullable Output<String> policyTypeName) {
        this.loadBalancerName = loadBalancerName;
        this.policyAttributes = policyAttributes;
        this.policyName = policyName;
        this.policyTypeName = policyTypeName;
    }

    private LoadBalancerPolicyState() {
        this.loadBalancerName = Codegen.empty();
        this.policyAttributes = Codegen.empty();
        this.policyName = Codegen.empty();
        this.policyTypeName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> loadBalancerName;
        private @Nullable Output<List<LoadBalancerPolicyPolicyAttributeGetArgs>> policyAttributes;
        private @Nullable Output<String> policyName;
        private @Nullable Output<String> policyTypeName;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.policyAttributes = defaults.policyAttributes;
    	      this.policyName = defaults.policyName;
    	      this.policyTypeName = defaults.policyTypeName;
        }

        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = Codegen.ofNullable(loadBalancerName);
            return this;
        }
        public Builder policyAttributes(@Nullable Output<List<LoadBalancerPolicyPolicyAttributeGetArgs>> policyAttributes) {
            this.policyAttributes = policyAttributes;
            return this;
        }
        public Builder policyAttributes(@Nullable List<LoadBalancerPolicyPolicyAttributeGetArgs> policyAttributes) {
            this.policyAttributes = Codegen.ofNullable(policyAttributes);
            return this;
        }
        public Builder policyAttributes(LoadBalancerPolicyPolicyAttributeGetArgs... policyAttributes) {
            return policyAttributes(List.of(policyAttributes));
        }
        public Builder policyName(@Nullable Output<String> policyName) {
            this.policyName = policyName;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = Codegen.ofNullable(policyName);
            return this;
        }
        public Builder policyTypeName(@Nullable Output<String> policyTypeName) {
            this.policyTypeName = policyTypeName;
            return this;
        }
        public Builder policyTypeName(@Nullable String policyTypeName) {
            this.policyTypeName = Codegen.ofNullable(policyTypeName);
            return this;
        }        public LoadBalancerPolicyState build() {
            return new LoadBalancerPolicyState(loadBalancerName, policyAttributes, policyName, policyTypeName);
        }
    }
}
