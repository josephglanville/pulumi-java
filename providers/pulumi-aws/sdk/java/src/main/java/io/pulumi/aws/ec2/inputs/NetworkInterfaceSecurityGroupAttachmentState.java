// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceSecurityGroupAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceSecurityGroupAttachmentState Empty = new NetworkInterfaceSecurityGroupAttachmentState();

    /**
     * The ID of the network interface to attach to.
     * 
     */
    @Import(name="networkInterfaceId")
      private final @Nullable Output<String> networkInterfaceId;

    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Output.empty() : this.networkInterfaceId;
    }

    /**
     * The ID of the security group.
     * 
     */
    @Import(name="securityGroupId")
      private final @Nullable Output<String> securityGroupId;

    public Output<String> getSecurityGroupId() {
        return this.securityGroupId == null ? Output.empty() : this.securityGroupId;
    }

    public NetworkInterfaceSecurityGroupAttachmentState(
        @Nullable Output<String> networkInterfaceId,
        @Nullable Output<String> securityGroupId) {
        this.networkInterfaceId = networkInterfaceId;
        this.securityGroupId = securityGroupId;
    }

    private NetworkInterfaceSecurityGroupAttachmentState() {
        this.networkInterfaceId = Output.empty();
        this.securityGroupId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceSecurityGroupAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> networkInterfaceId;
        private @Nullable Output<String> securityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceSecurityGroupAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.securityGroupId = defaults.securityGroupId;
        }

        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Output.ofNullable(networkInterfaceId);
            return this;
        }
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public Builder securityGroupId(@Nullable String securityGroupId) {
            this.securityGroupId = Output.ofNullable(securityGroupId);
            return this;
        }        public NetworkInterfaceSecurityGroupAttachmentState build() {
            return new NetworkInterfaceSecurityGroupAttachmentState(networkInterfaceId, securityGroupId);
        }
    }
}