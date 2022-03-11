// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NatGatewayState extends io.pulumi.resources.ResourceArgs {

    public static final NatGatewayState Empty = new NatGatewayState();

    /**
     * The Allocation ID of the Elastic IP address for the gateway. Required for `connectivity_type` of `public`.
     * 
     */
    @InputImport(name="allocationId")
      private final @Nullable Output<String> allocationId;

    public Output<String> getAllocationId() {
        return this.allocationId == null ? Output.empty() : this.allocationId;
    }

    /**
     * Connectivity type for the gateway. Valid values are `private` and `public`. Defaults to `public`.
     * 
     */
    @InputImport(name="connectivityType")
      private final @Nullable Output<String> connectivityType;

    public Output<String> getConnectivityType() {
        return this.connectivityType == null ? Output.empty() : this.connectivityType;
    }

    /**
     * The ENI ID of the network interface created by the NAT gateway.
     * 
     */
    @InputImport(name="networkInterfaceId")
      private final @Nullable Output<String> networkInterfaceId;

    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Output.empty() : this.networkInterfaceId;
    }

    /**
     * The private IP address of the NAT Gateway.
     * 
     */
    @InputImport(name="privateIp")
      private final @Nullable Output<String> privateIp;

    public Output<String> getPrivateIp() {
        return this.privateIp == null ? Output.empty() : this.privateIp;
    }

    /**
     * The public IP address of the NAT Gateway.
     * 
     */
    @InputImport(name="publicIp")
      private final @Nullable Output<String> publicIp;

    public Output<String> getPublicIp() {
        return this.publicIp == null ? Output.empty() : this.publicIp;
    }

    /**
     * The Subnet ID of the subnet in which to place the gateway.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Output.empty() : this.subnetId;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public NatGatewayState(
        @Nullable Output<String> allocationId,
        @Nullable Output<String> connectivityType,
        @Nullable Output<String> networkInterfaceId,
        @Nullable Output<String> privateIp,
        @Nullable Output<String> publicIp,
        @Nullable Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.allocationId = allocationId;
        this.connectivityType = connectivityType;
        this.networkInterfaceId = networkInterfaceId;
        this.privateIp = privateIp;
        this.publicIp = publicIp;
        this.subnetId = subnetId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private NatGatewayState() {
        this.allocationId = Output.empty();
        this.connectivityType = Output.empty();
        this.networkInterfaceId = Output.empty();
        this.privateIp = Output.empty();
        this.publicIp = Output.empty();
        this.subnetId = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allocationId;
        private @Nullable Output<String> connectivityType;
        private @Nullable Output<String> networkInterfaceId;
        private @Nullable Output<String> privateIp;
        private @Nullable Output<String> publicIp;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(NatGatewayState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.connectivityType = defaults.connectivityType;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.privateIp = defaults.privateIp;
    	      this.publicIp = defaults.publicIp;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder allocationId(@Nullable Output<String> allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        public Builder allocationId(@Nullable String allocationId) {
            this.allocationId = Output.ofNullable(allocationId);
            return this;
        }

        public Builder connectivityType(@Nullable Output<String> connectivityType) {
            this.connectivityType = connectivityType;
            return this;
        }

        public Builder connectivityType(@Nullable String connectivityType) {
            this.connectivityType = Output.ofNullable(connectivityType);
            return this;
        }

        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Output.ofNullable(networkInterfaceId);
            return this;
        }

        public Builder privateIp(@Nullable Output<String> privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        public Builder privateIp(@Nullable String privateIp) {
            this.privateIp = Output.ofNullable(privateIp);
            return this;
        }

        public Builder publicIp(@Nullable Output<String> publicIp) {
            this.publicIp = publicIp;
            return this;
        }

        public Builder publicIp(@Nullable String publicIp) {
            this.publicIp = Output.ofNullable(publicIp);
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public NatGatewayState build() {
            return new NatGatewayState(allocationId, connectivityType, networkInterfaceId, privateIp, publicIp, subnetId, tags, tagsAll);
        }
    }
}
