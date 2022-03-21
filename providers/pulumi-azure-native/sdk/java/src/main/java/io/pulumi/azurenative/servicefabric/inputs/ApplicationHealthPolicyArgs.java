// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ServiceTypeHealthPolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a health policy used to evaluate the health of an application or one of its children entities.
 * 
 */
public final class ApplicationHealthPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationHealthPolicyArgs Empty = new ApplicationHealthPolicyArgs();

    /**
     * The health policy used by default to evaluate the health of a service type.
     * 
     */
    @Import(name="defaultServiceTypeHealthPolicy")
      private final @Nullable Output<ServiceTypeHealthPolicyArgs> defaultServiceTypeHealthPolicy;

    public Output<ServiceTypeHealthPolicyArgs> getDefaultServiceTypeHealthPolicy() {
        return this.defaultServiceTypeHealthPolicy == null ? Output.empty() : this.defaultServiceTypeHealthPolicy;
    }

    /**
     * The map with service type health policy per service type name. The map is empty by default.
     * 
     */
    @Import(name="serviceTypeHealthPolicies")
      private final @Nullable Output<Map<String,ServiceTypeHealthPolicyArgs>> serviceTypeHealthPolicies;

    public Output<Map<String,ServiceTypeHealthPolicyArgs>> getServiceTypeHealthPolicies() {
        return this.serviceTypeHealthPolicies == null ? Output.empty() : this.serviceTypeHealthPolicies;
    }

    public ApplicationHealthPolicyArgs(
        @Nullable Output<ServiceTypeHealthPolicyArgs> defaultServiceTypeHealthPolicy,
        @Nullable Output<Map<String,ServiceTypeHealthPolicyArgs>> serviceTypeHealthPolicies) {
        this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
        this.serviceTypeHealthPolicies = serviceTypeHealthPolicies;
    }

    private ApplicationHealthPolicyArgs() {
        this.defaultServiceTypeHealthPolicy = Output.empty();
        this.serviceTypeHealthPolicies = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceTypeHealthPolicyArgs> defaultServiceTypeHealthPolicy;
        private @Nullable Output<Map<String,ServiceTypeHealthPolicyArgs>> serviceTypeHealthPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationHealthPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultServiceTypeHealthPolicy = defaults.defaultServiceTypeHealthPolicy;
    	      this.serviceTypeHealthPolicies = defaults.serviceTypeHealthPolicies;
        }

        public Builder defaultServiceTypeHealthPolicy(@Nullable Output<ServiceTypeHealthPolicyArgs> defaultServiceTypeHealthPolicy) {
            this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
            return this;
        }
        public Builder defaultServiceTypeHealthPolicy(@Nullable ServiceTypeHealthPolicyArgs defaultServiceTypeHealthPolicy) {
            this.defaultServiceTypeHealthPolicy = Output.ofNullable(defaultServiceTypeHealthPolicy);
            return this;
        }
        public Builder serviceTypeHealthPolicies(@Nullable Output<Map<String,ServiceTypeHealthPolicyArgs>> serviceTypeHealthPolicies) {
            this.serviceTypeHealthPolicies = serviceTypeHealthPolicies;
            return this;
        }
        public Builder serviceTypeHealthPolicies(@Nullable Map<String,ServiceTypeHealthPolicyArgs> serviceTypeHealthPolicies) {
            this.serviceTypeHealthPolicies = Output.ofNullable(serviceTypeHealthPolicies);
            return this;
        }        public ApplicationHealthPolicyArgs build() {
            return new ApplicationHealthPolicyArgs(defaultServiceTypeHealthPolicy, serviceTypeHealthPolicies);
        }
    }
}
