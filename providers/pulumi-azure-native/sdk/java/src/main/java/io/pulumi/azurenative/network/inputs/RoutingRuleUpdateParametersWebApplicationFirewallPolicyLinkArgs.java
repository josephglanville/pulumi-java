// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the Web Application Firewall policy for each routing rule (if applicable)
 * 
 */
public final class RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs Empty = new RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    public RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs(@Nullable Input<String> id) {
        this.id = id;
    }

    private RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }
        public RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs build() {
            return new RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs(id);
        }
    }
}
