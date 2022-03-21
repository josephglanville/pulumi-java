// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress. Use value '0.0.0.0' for all Azure-internal IP addresses.
     * 
     */
    @Import(name="endIpAddress")
      private final @Nullable Output<String> endIpAddress;

    public Output<String> getEndIpAddress() {
        return this.endIpAddress == null ? Output.empty() : this.endIpAddress;
    }

    /**
     * The name of the firewall rule.
     * 
     */
    @Import(name="firewallRuleName")
      private final @Nullable Output<String> firewallRuleName;

    public Output<String> getFirewallRuleName() {
        return this.firewallRuleName == null ? Output.empty() : this.firewallRuleName;
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    /**
     * The start IP address of the firewall rule. Must be IPv4 format. Use value '0.0.0.0' for all Azure-internal IP addresses.
     * 
     */
    @Import(name="startIpAddress")
      private final @Nullable Output<String> startIpAddress;

    public Output<String> getStartIpAddress() {
        return this.startIpAddress == null ? Output.empty() : this.startIpAddress;
    }

    public FirewallRuleArgs(
        @Nullable Output<String> endIpAddress,
        @Nullable Output<String> firewallRuleName,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        Output<String> serverName,
        @Nullable Output<String> startIpAddress) {
        this.endIpAddress = endIpAddress;
        this.firewallRuleName = firewallRuleName;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.startIpAddress = startIpAddress;
    }

    private FirewallRuleArgs() {
        this.endIpAddress = Output.empty();
        this.firewallRuleName = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serverName = Output.empty();
        this.startIpAddress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endIpAddress;
        private @Nullable Output<String> firewallRuleName;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private Output<String> serverName;
        private @Nullable Output<String> startIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.firewallRuleName = defaults.firewallRuleName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.startIpAddress = defaults.startIpAddress;
        }

        public Builder endIpAddress(@Nullable Output<String> endIpAddress) {
            this.endIpAddress = endIpAddress;
            return this;
        }
        public Builder endIpAddress(@Nullable String endIpAddress) {
            this.endIpAddress = Output.ofNullable(endIpAddress);
            return this;
        }
        public Builder firewallRuleName(@Nullable Output<String> firewallRuleName) {
            this.firewallRuleName = firewallRuleName;
            return this;
        }
        public Builder firewallRuleName(@Nullable String firewallRuleName) {
            this.firewallRuleName = Output.ofNullable(firewallRuleName);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }
        public Builder startIpAddress(@Nullable Output<String> startIpAddress) {
            this.startIpAddress = startIpAddress;
            return this;
        }
        public Builder startIpAddress(@Nullable String startIpAddress) {
            this.startIpAddress = Output.ofNullable(startIpAddress);
            return this;
        }        public FirewallRuleArgs build() {
            return new FirewallRuleArgs(endIpAddress, firewallRuleName, name, resourceGroupName, serverName, startIpAddress);
        }
    }
}
