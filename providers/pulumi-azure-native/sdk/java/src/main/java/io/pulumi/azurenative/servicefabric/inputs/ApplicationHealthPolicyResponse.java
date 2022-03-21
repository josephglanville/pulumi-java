// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ServiceTypeHealthPolicyResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a health policy used to evaluate the health of an application or one of its children entities.
 * 
 */
public final class ApplicationHealthPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationHealthPolicyResponse Empty = new ApplicationHealthPolicyResponse();

    /**
     * The health policy used by default to evaluate the health of a service type.
     * 
     */
    @Import(name="defaultServiceTypeHealthPolicy")
      private final @Nullable ServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy;

    public Optional<ServiceTypeHealthPolicyResponse> getDefaultServiceTypeHealthPolicy() {
        return this.defaultServiceTypeHealthPolicy == null ? Optional.empty() : Optional.ofNullable(this.defaultServiceTypeHealthPolicy);
    }

    /**
     * The map with service type health policy per service type name. The map is empty by default.
     * 
     */
    @Import(name="serviceTypeHealthPolicies")
      private final @Nullable Map<String,ServiceTypeHealthPolicyResponse> serviceTypeHealthPolicies;

    public Map<String,ServiceTypeHealthPolicyResponse> getServiceTypeHealthPolicies() {
        return this.serviceTypeHealthPolicies == null ? Map.of() : this.serviceTypeHealthPolicies;
    }

    public ApplicationHealthPolicyResponse(
        @Nullable ServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy,
        @Nullable Map<String,ServiceTypeHealthPolicyResponse> serviceTypeHealthPolicies) {
        this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
        this.serviceTypeHealthPolicies = serviceTypeHealthPolicies;
    }

    private ApplicationHealthPolicyResponse() {
        this.defaultServiceTypeHealthPolicy = null;
        this.serviceTypeHealthPolicies = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy;
        private @Nullable Map<String,ServiceTypeHealthPolicyResponse> serviceTypeHealthPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultServiceTypeHealthPolicy = defaults.defaultServiceTypeHealthPolicy;
    	      this.serviceTypeHealthPolicies = defaults.serviceTypeHealthPolicies;
        }

        public Builder defaultServiceTypeHealthPolicy(@Nullable ServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy) {
            this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
            return this;
        }
        public Builder serviceTypeHealthPolicies(@Nullable Map<String,ServiceTypeHealthPolicyResponse> serviceTypeHealthPolicies) {
            this.serviceTypeHealthPolicies = serviceTypeHealthPolicies;
            return this;
        }        public ApplicationHealthPolicyResponse build() {
            return new ApplicationHealthPolicyResponse(defaultServiceTypeHealthPolicy, serviceTypeHealthPolicies);
        }
    }
}
