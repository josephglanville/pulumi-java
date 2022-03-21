// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NetworkInterfaceSecurityGroupAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceSecurityGroupAttachmentArgs Empty = new NetworkInterfaceSecurityGroupAttachmentArgs();

    /**
     * The ID of the network interface to attach to.
     * 
     */
    @Import(name="networkInterfaceId", required=true)
      private final Output<String> networkInterfaceId;

    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * The ID of the security group.
     * 
     */
    @Import(name="securityGroupId", required=true)
      private final Output<String> securityGroupId;

    public Output<String> getSecurityGroupId() {
        return this.securityGroupId;
    }

    public NetworkInterfaceSecurityGroupAttachmentArgs(
        Output<String> networkInterfaceId,
        Output<String> securityGroupId) {
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
        this.securityGroupId = Objects.requireNonNull(securityGroupId, "expected parameter 'securityGroupId' to be non-null");
    }

    private NetworkInterfaceSecurityGroupAttachmentArgs() {
        this.networkInterfaceId = Output.empty();
        this.securityGroupId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceSecurityGroupAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> networkInterfaceId;
        private Output<String> securityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceSecurityGroupAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.securityGroupId = defaults.securityGroupId;
        }

        public Builder networkInterfaceId(Output<String> networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Output.of(Objects.requireNonNull(networkInterfaceId));
            return this;
        }
        public Builder securityGroupId(Output<String> securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Output.of(Objects.requireNonNull(securityGroupId));
            return this;
        }        public NetworkInterfaceSecurityGroupAttachmentArgs build() {
            return new NetworkInterfaceSecurityGroupAttachmentArgs(networkInterfaceId, securityGroupId);
        }
    }
}
