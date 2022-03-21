// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The name of the Data Lake Store account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @Import(name="endIpAddress", required=true)
      private final Output<String> endIpAddress;

    public Output<String> getEndIpAddress() {
        return this.endIpAddress;
    }

    /**
     * The name of the firewall rule to create or update.
     * 
     */
    @Import(name="firewallRuleName")
      private final @Nullable Output<String> firewallRuleName;

    public Output<String> getFirewallRuleName() {
        return this.firewallRuleName == null ? Output.empty() : this.firewallRuleName;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @Import(name="startIpAddress", required=true)
      private final Output<String> startIpAddress;

    public Output<String> getStartIpAddress() {
        return this.startIpAddress;
    }

    public FirewallRuleArgs(
        Output<String> accountName,
        Output<String> endIpAddress,
        @Nullable Output<String> firewallRuleName,
        Output<String> resourceGroupName,
        Output<String> startIpAddress) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.endIpAddress = Objects.requireNonNull(endIpAddress, "expected parameter 'endIpAddress' to be non-null");
        this.firewallRuleName = firewallRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.startIpAddress = Objects.requireNonNull(startIpAddress, "expected parameter 'startIpAddress' to be non-null");
    }

    private FirewallRuleArgs() {
        this.accountName = Output.empty();
        this.endIpAddress = Output.empty();
        this.firewallRuleName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.startIpAddress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private Output<String> endIpAddress;
        private @Nullable Output<String> firewallRuleName;
        private Output<String> resourceGroupName;
        private Output<String> startIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.firewallRuleName = defaults.firewallRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.startIpAddress = defaults.startIpAddress;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder endIpAddress(Output<String> endIpAddress) {
            this.endIpAddress = Objects.requireNonNull(endIpAddress);
            return this;
        }
        public Builder endIpAddress(String endIpAddress) {
            this.endIpAddress = Output.of(Objects.requireNonNull(endIpAddress));
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder startIpAddress(Output<String> startIpAddress) {
            this.startIpAddress = Objects.requireNonNull(startIpAddress);
            return this;
        }
        public Builder startIpAddress(String startIpAddress) {
            this.startIpAddress = Output.of(Objects.requireNonNull(startIpAddress));
            return this;
        }        public FirewallRuleArgs build() {
            return new FirewallRuleArgs(accountName, endIpAddress, firewallRuleName, resourceGroupName, startIpAddress);
        }
    }
}
