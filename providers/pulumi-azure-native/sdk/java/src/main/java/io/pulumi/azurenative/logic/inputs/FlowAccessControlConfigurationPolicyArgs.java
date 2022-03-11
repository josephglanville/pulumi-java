// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.IpAddressRangeArgs;
import io.pulumi.azurenative.logic.inputs.OpenAuthenticationAccessPoliciesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The access control configuration policy.
 * 
 */
public final class FlowAccessControlConfigurationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowAccessControlConfigurationPolicyArgs Empty = new FlowAccessControlConfigurationPolicyArgs();

    /**
     * The allowed caller IP address ranges.
     * 
     */
    @InputImport(name="allowedCallerIpAddresses")
      private final @Nullable Output<List<IpAddressRangeArgs>> allowedCallerIpAddresses;

    public Output<List<IpAddressRangeArgs>> getAllowedCallerIpAddresses() {
        return this.allowedCallerIpAddresses == null ? Output.empty() : this.allowedCallerIpAddresses;
    }

    /**
     * The authentication policies for workflow.
     * 
     */
    @InputImport(name="openAuthenticationPolicies")
      private final @Nullable Output<OpenAuthenticationAccessPoliciesArgs> openAuthenticationPolicies;

    public Output<OpenAuthenticationAccessPoliciesArgs> getOpenAuthenticationPolicies() {
        return this.openAuthenticationPolicies == null ? Output.empty() : this.openAuthenticationPolicies;
    }

    public FlowAccessControlConfigurationPolicyArgs(
        @Nullable Output<List<IpAddressRangeArgs>> allowedCallerIpAddresses,
        @Nullable Output<OpenAuthenticationAccessPoliciesArgs> openAuthenticationPolicies) {
        this.allowedCallerIpAddresses = allowedCallerIpAddresses;
        this.openAuthenticationPolicies = openAuthenticationPolicies;
    }

    private FlowAccessControlConfigurationPolicyArgs() {
        this.allowedCallerIpAddresses = Output.empty();
        this.openAuthenticationPolicies = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowAccessControlConfigurationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<IpAddressRangeArgs>> allowedCallerIpAddresses;
        private @Nullable Output<OpenAuthenticationAccessPoliciesArgs> openAuthenticationPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowAccessControlConfigurationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCallerIpAddresses = defaults.allowedCallerIpAddresses;
    	      this.openAuthenticationPolicies = defaults.openAuthenticationPolicies;
        }

        public Builder allowedCallerIpAddresses(@Nullable Output<List<IpAddressRangeArgs>> allowedCallerIpAddresses) {
            this.allowedCallerIpAddresses = allowedCallerIpAddresses;
            return this;
        }

        public Builder allowedCallerIpAddresses(@Nullable List<IpAddressRangeArgs> allowedCallerIpAddresses) {
            this.allowedCallerIpAddresses = Output.ofNullable(allowedCallerIpAddresses);
            return this;
        }

        public Builder openAuthenticationPolicies(@Nullable Output<OpenAuthenticationAccessPoliciesArgs> openAuthenticationPolicies) {
            this.openAuthenticationPolicies = openAuthenticationPolicies;
            return this;
        }

        public Builder openAuthenticationPolicies(@Nullable OpenAuthenticationAccessPoliciesArgs openAuthenticationPolicies) {
            this.openAuthenticationPolicies = Output.ofNullable(openAuthenticationPolicies);
            return this;
        }
        public FlowAccessControlConfigurationPolicyArgs build() {
            return new FlowAccessControlConfigurationPolicyArgs(allowedCallerIpAddresses, openAuthenticationPolicies);
        }
    }
}
