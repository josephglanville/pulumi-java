// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    @InputImport(name="endIpAddress", required=true)
    private final Input<String> endIpAddress;

    public Input<String> getEndIpAddress() {
        return this.endIpAddress;
    }

    @InputImport(name="firewallRuleName")
    private final @Nullable Input<String> firewallRuleName;

    public Input<String> getFirewallRuleName() {
        return this.firewallRuleName == null ? Input.empty() : this.firewallRuleName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serverName", required=true)
    private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    @InputImport(name="startIpAddress", required=true)
    private final Input<String> startIpAddress;

    public Input<String> getStartIpAddress() {
        return this.startIpAddress;
    }

    public FirewallRuleArgs(
        Input<String> endIpAddress,
        @Nullable Input<String> firewallRuleName,
        Input<String> resourceGroupName,
        Input<String> serverName,
        Input<String> startIpAddress) {
        this.endIpAddress = Objects.requireNonNull(endIpAddress, "expected parameter 'endIpAddress' to be non-null");
        this.firewallRuleName = firewallRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.startIpAddress = Objects.requireNonNull(startIpAddress, "expected parameter 'startIpAddress' to be non-null");
    }

    private FirewallRuleArgs() {
        this.endIpAddress = Input.empty();
        this.firewallRuleName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
        this.startIpAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endIpAddress;
        private @Nullable Input<String> firewallRuleName;
        private Input<String> resourceGroupName;
        private Input<String> serverName;
        private Input<String> startIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.firewallRuleName = defaults.firewallRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.startIpAddress = defaults.startIpAddress;
        }

        public Builder setEndIpAddress(Input<String> endIpAddress) {
            this.endIpAddress = Objects.requireNonNull(endIpAddress);
            return this;
        }

        public Builder setEndIpAddress(String endIpAddress) {
            this.endIpAddress = Input.of(Objects.requireNonNull(endIpAddress));
            return this;
        }

        public Builder setFirewallRuleName(@Nullable Input<String> firewallRuleName) {
            this.firewallRuleName = firewallRuleName;
            return this;
        }

        public Builder setFirewallRuleName(@Nullable String firewallRuleName) {
            this.firewallRuleName = Input.ofNullable(firewallRuleName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setStartIpAddress(Input<String> startIpAddress) {
            this.startIpAddress = Objects.requireNonNull(startIpAddress);
            return this;
        }

        public Builder setStartIpAddress(String startIpAddress) {
            this.startIpAddress = Input.of(Objects.requireNonNull(startIpAddress));
            return this;
        }

        public FirewallRuleArgs build() {
            return new FirewallRuleArgs(endIpAddress, firewallRuleName, resourceGroupName, serverName, startIpAddress);
        }
    }
}
