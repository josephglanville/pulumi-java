// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.azurenative.cdn.inputs.SecurityPolicyWebApplicationFirewallAssociationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The json object containing security policy waf parameters
 * 
 */
public final class SecurityPolicyWebApplicationFirewallParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyWebApplicationFirewallParametersArgs Empty = new SecurityPolicyWebApplicationFirewallParametersArgs();

    /**
     * Waf associations
     * 
     */
    @Import(name="associations")
      private final @Nullable Output<List<SecurityPolicyWebApplicationFirewallAssociationArgs>> associations;

    public Output<List<SecurityPolicyWebApplicationFirewallAssociationArgs>> getAssociations() {
        return this.associations == null ? Output.empty() : this.associations;
    }

    /**
     * The type of the Security policy to create.
     * Expected value is 'WebApplicationFirewall'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="wafPolicy")
      private final @Nullable Output<ResourceReferenceArgs> wafPolicy;

    public Output<ResourceReferenceArgs> getWafPolicy() {
        return this.wafPolicy == null ? Output.empty() : this.wafPolicy;
    }

    public SecurityPolicyWebApplicationFirewallParametersArgs(
        @Nullable Output<List<SecurityPolicyWebApplicationFirewallAssociationArgs>> associations,
        Output<String> type,
        @Nullable Output<ResourceReferenceArgs> wafPolicy) {
        this.associations = associations;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.wafPolicy = wafPolicy;
    }

    private SecurityPolicyWebApplicationFirewallParametersArgs() {
        this.associations = Output.empty();
        this.type = Output.empty();
        this.wafPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyWebApplicationFirewallParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SecurityPolicyWebApplicationFirewallAssociationArgs>> associations;
        private Output<String> type;
        private @Nullable Output<ResourceReferenceArgs> wafPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyWebApplicationFirewallParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associations = defaults.associations;
    	      this.type = defaults.type;
    	      this.wafPolicy = defaults.wafPolicy;
        }

        public Builder associations(@Nullable Output<List<SecurityPolicyWebApplicationFirewallAssociationArgs>> associations) {
            this.associations = associations;
            return this;
        }
        public Builder associations(@Nullable List<SecurityPolicyWebApplicationFirewallAssociationArgs> associations) {
            this.associations = Output.ofNullable(associations);
            return this;
        }
        public Builder associations(SecurityPolicyWebApplicationFirewallAssociationArgs... associations) {
            return associations(List.of(associations));
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder wafPolicy(@Nullable Output<ResourceReferenceArgs> wafPolicy) {
            this.wafPolicy = wafPolicy;
            return this;
        }
        public Builder wafPolicy(@Nullable ResourceReferenceArgs wafPolicy) {
            this.wafPolicy = Output.ofNullable(wafPolicy);
            return this;
        }        public SecurityPolicyWebApplicationFirewallParametersArgs build() {
            return new SecurityPolicyWebApplicationFirewallParametersArgs(associations, type, wafPolicy);
        }
    }
}
