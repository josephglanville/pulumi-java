// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallFirewallStatusSyncStateAttachmentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallFirewallStatusSyncStateAttachmentGetArgs Empty = new FirewallFirewallStatusSyncStateAttachmentGetArgs();

    /**
     * The identifier of the firewall endpoint that AWS Network Firewall has instantiated in the subnet. You use this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * 
     */
    @InputImport(name="endpointId")
      private final @Nullable Output<String> endpointId;

    public Output<String> getEndpointId() {
        return this.endpointId == null ? Output.empty() : this.endpointId;
    }

    /**
     * The unique identifier for the subnet.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Output.empty() : this.subnetId;
    }

    public FirewallFirewallStatusSyncStateAttachmentGetArgs(
        @Nullable Output<String> endpointId,
        @Nullable Output<String> subnetId) {
        this.endpointId = endpointId;
        this.subnetId = subnetId;
    }

    private FirewallFirewallStatusSyncStateAttachmentGetArgs() {
        this.endpointId = Output.empty();
        this.subnetId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatusSyncStateAttachmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endpointId;
        private @Nullable Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallFirewallStatusSyncStateAttachmentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder endpointId(@Nullable Output<String> endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        public Builder endpointId(@Nullable String endpointId) {
            this.endpointId = Output.ofNullable(endpointId);
            return this;
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Output.ofNullable(subnetId);
            return this;
        }
        public FirewallFirewallStatusSyncStateAttachmentGetArgs build() {
            return new FirewallFirewallStatusSyncStateAttachmentGetArgs(endpointId, subnetId);
        }
    }
}
