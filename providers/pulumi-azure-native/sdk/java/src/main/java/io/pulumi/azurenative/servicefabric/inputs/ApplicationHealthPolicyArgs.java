// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ServiceTypeHealthPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationHealthPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationHealthPolicyArgs Empty = new ApplicationHealthPolicyArgs();

    @InputImport(name="defaultServiceTypeHealthPolicy")
    private final @Nullable Input<ServiceTypeHealthPolicyArgs> defaultServiceTypeHealthPolicy;

    public Input<ServiceTypeHealthPolicyArgs> getDefaultServiceTypeHealthPolicy() {
        return this.defaultServiceTypeHealthPolicy == null ? Input.empty() : this.defaultServiceTypeHealthPolicy;
    }

    @InputImport(name="serviceTypeHealthPolicies")
    private final @Nullable Input<Map<String,ServiceTypeHealthPolicyArgs>> serviceTypeHealthPolicies;

    public Input<Map<String,ServiceTypeHealthPolicyArgs>> getServiceTypeHealthPolicies() {
        return this.serviceTypeHealthPolicies == null ? Input.empty() : this.serviceTypeHealthPolicies;
    }

    public ApplicationHealthPolicyArgs(
        @Nullable Input<ServiceTypeHealthPolicyArgs> defaultServiceTypeHealthPolicy,
        @Nullable Input<Map<String,ServiceTypeHealthPolicyArgs>> serviceTypeHealthPolicies) {
        this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
        this.serviceTypeHealthPolicies = serviceTypeHealthPolicies;
    }

    private ApplicationHealthPolicyArgs() {
        this.defaultServiceTypeHealthPolicy = Input.empty();
        this.serviceTypeHealthPolicies = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceTypeHealthPolicyArgs> defaultServiceTypeHealthPolicy;
        private @Nullable Input<Map<String,ServiceTypeHealthPolicyArgs>> serviceTypeHealthPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationHealthPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultServiceTypeHealthPolicy = defaults.defaultServiceTypeHealthPolicy;
    	      this.serviceTypeHealthPolicies = defaults.serviceTypeHealthPolicies;
        }

        public Builder setDefaultServiceTypeHealthPolicy(@Nullable Input<ServiceTypeHealthPolicyArgs> defaultServiceTypeHealthPolicy) {
            this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
            return this;
        }

        public Builder setDefaultServiceTypeHealthPolicy(@Nullable ServiceTypeHealthPolicyArgs defaultServiceTypeHealthPolicy) {
            this.defaultServiceTypeHealthPolicy = Input.ofNullable(defaultServiceTypeHealthPolicy);
            return this;
        }

        public Builder setServiceTypeHealthPolicies(@Nullable Input<Map<String,ServiceTypeHealthPolicyArgs>> serviceTypeHealthPolicies) {
            this.serviceTypeHealthPolicies = serviceTypeHealthPolicies;
            return this;
        }

        public Builder setServiceTypeHealthPolicies(@Nullable Map<String,ServiceTypeHealthPolicyArgs> serviceTypeHealthPolicies) {
            this.serviceTypeHealthPolicies = Input.ofNullable(serviceTypeHealthPolicies);
            return this;
        }

        public ApplicationHealthPolicyArgs build() {
            return new ApplicationHealthPolicyArgs(defaultServiceTypeHealthPolicy, serviceTypeHealthPolicies);
        }
    }
}
