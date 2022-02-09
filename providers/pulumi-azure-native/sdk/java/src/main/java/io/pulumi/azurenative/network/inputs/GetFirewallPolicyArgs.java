// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyArgs Empty = new GetFirewallPolicyArgs();

    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    @InputImport(name="firewallPolicyName", required=true)
    private final String firewallPolicyName;

    public String getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetFirewallPolicyArgs(
        @Nullable String expand,
        String firewallPolicyName,
        String resourceGroupName) {
        this.expand = expand;
        this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetFirewallPolicyArgs() {
        this.expand = null;
        this.firewallPolicyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String firewallPolicyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.firewallPolicyName = defaults.firewallPolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setFirewallPolicyName(String firewallPolicyName) {
            this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetFirewallPolicyArgs build() {
            return new GetFirewallPolicyArgs(expand, firewallPolicyName, resourceGroupName);
        }
    }
}
