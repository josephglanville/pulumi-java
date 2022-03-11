// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.OpenAuthenticationAccessPolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AuthenticationPolicy of type Open.
 * 
 */
public final class OpenAuthenticationAccessPoliciesArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenAuthenticationAccessPoliciesArgs Empty = new OpenAuthenticationAccessPoliciesArgs();

    /**
     * Open authentication policies.
     * 
     */
    @InputImport(name="policies")
      private final @Nullable Output<Map<String,OpenAuthenticationAccessPolicyArgs>> policies;

    public Output<Map<String,OpenAuthenticationAccessPolicyArgs>> getPolicies() {
        return this.policies == null ? Output.empty() : this.policies;
    }

    public OpenAuthenticationAccessPoliciesArgs(@Nullable Output<Map<String,OpenAuthenticationAccessPolicyArgs>> policies) {
        this.policies = policies;
    }

    private OpenAuthenticationAccessPoliciesArgs() {
        this.policies = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenAuthenticationAccessPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,OpenAuthenticationAccessPolicyArgs>> policies;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenAuthenticationAccessPoliciesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policies = defaults.policies;
        }

        public Builder policies(@Nullable Output<Map<String,OpenAuthenticationAccessPolicyArgs>> policies) {
            this.policies = policies;
            return this;
        }

        public Builder policies(@Nullable Map<String,OpenAuthenticationAccessPolicyArgs> policies) {
            this.policies = Output.ofNullable(policies);
            return this;
        }
        public OpenAuthenticationAccessPoliciesArgs build() {
            return new OpenAuthenticationAccessPoliciesArgs(policies);
        }
    }
}
