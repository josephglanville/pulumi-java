// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ServiceTypeDeltaHealthPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationDeltaHealthPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationDeltaHealthPolicyArgs Empty = new ApplicationDeltaHealthPolicyArgs();

    @InputImport(name="defaultServiceTypeDeltaHealthPolicy")
    private final @Nullable Input<ServiceTypeDeltaHealthPolicyArgs> defaultServiceTypeDeltaHealthPolicy;

    public Input<ServiceTypeDeltaHealthPolicyArgs> getDefaultServiceTypeDeltaHealthPolicy() {
        return this.defaultServiceTypeDeltaHealthPolicy == null ? Input.empty() : this.defaultServiceTypeDeltaHealthPolicy;
    }

    @InputImport(name="serviceTypeDeltaHealthPolicies")
    private final @Nullable Input<Map<String,ServiceTypeDeltaHealthPolicyArgs>> serviceTypeDeltaHealthPolicies;

    public Input<Map<String,ServiceTypeDeltaHealthPolicyArgs>> getServiceTypeDeltaHealthPolicies() {
        return this.serviceTypeDeltaHealthPolicies == null ? Input.empty() : this.serviceTypeDeltaHealthPolicies;
    }

    public ApplicationDeltaHealthPolicyArgs(
        @Nullable Input<ServiceTypeDeltaHealthPolicyArgs> defaultServiceTypeDeltaHealthPolicy,
        @Nullable Input<Map<String,ServiceTypeDeltaHealthPolicyArgs>> serviceTypeDeltaHealthPolicies) {
        this.defaultServiceTypeDeltaHealthPolicy = defaultServiceTypeDeltaHealthPolicy;
        this.serviceTypeDeltaHealthPolicies = serviceTypeDeltaHealthPolicies;
    }

    private ApplicationDeltaHealthPolicyArgs() {
        this.defaultServiceTypeDeltaHealthPolicy = Input.empty();
        this.serviceTypeDeltaHealthPolicies = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationDeltaHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceTypeDeltaHealthPolicyArgs> defaultServiceTypeDeltaHealthPolicy;
        private @Nullable Input<Map<String,ServiceTypeDeltaHealthPolicyArgs>> serviceTypeDeltaHealthPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationDeltaHealthPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultServiceTypeDeltaHealthPolicy = defaults.defaultServiceTypeDeltaHealthPolicy;
    	      this.serviceTypeDeltaHealthPolicies = defaults.serviceTypeDeltaHealthPolicies;
        }

        public Builder setDefaultServiceTypeDeltaHealthPolicy(@Nullable Input<ServiceTypeDeltaHealthPolicyArgs> defaultServiceTypeDeltaHealthPolicy) {
            this.defaultServiceTypeDeltaHealthPolicy = defaultServiceTypeDeltaHealthPolicy;
            return this;
        }

        public Builder setDefaultServiceTypeDeltaHealthPolicy(@Nullable ServiceTypeDeltaHealthPolicyArgs defaultServiceTypeDeltaHealthPolicy) {
            this.defaultServiceTypeDeltaHealthPolicy = Input.ofNullable(defaultServiceTypeDeltaHealthPolicy);
            return this;
        }

        public Builder setServiceTypeDeltaHealthPolicies(@Nullable Input<Map<String,ServiceTypeDeltaHealthPolicyArgs>> serviceTypeDeltaHealthPolicies) {
            this.serviceTypeDeltaHealthPolicies = serviceTypeDeltaHealthPolicies;
            return this;
        }

        public Builder setServiceTypeDeltaHealthPolicies(@Nullable Map<String,ServiceTypeDeltaHealthPolicyArgs> serviceTypeDeltaHealthPolicies) {
            this.serviceTypeDeltaHealthPolicies = Input.ofNullable(serviceTypeDeltaHealthPolicies);
            return this;
        }

        public ApplicationDeltaHealthPolicyArgs build() {
            return new ApplicationDeltaHealthPolicyArgs(defaultServiceTypeDeltaHealthPolicy, serviceTypeDeltaHealthPolicies);
        }
    }
}
