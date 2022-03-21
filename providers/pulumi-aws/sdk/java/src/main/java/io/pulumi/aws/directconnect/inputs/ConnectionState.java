// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionState extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * The ARN of the connection.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The Direct Connect endpoint on which the physical connection terminates.
     * 
     */
    @Import(name="awsDevice")
      private final @Nullable Output<String> awsDevice;

    public Output<String> getAwsDevice() {
        return this.awsDevice == null ? Output.empty() : this.awsDevice;
    }

    /**
     * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
     * 
     */
    @Import(name="bandwidth")
      private final @Nullable Output<String> bandwidth;

    public Output<String> getBandwidth() {
        return this.bandwidth == null ? Output.empty() : this.bandwidth;
    }

    /**
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    @Import(name="hasLogicalRedundancy")
      private final @Nullable Output<String> hasLogicalRedundancy;

    public Output<String> getHasLogicalRedundancy() {
        return this.hasLogicalRedundancy == null ? Output.empty() : this.hasLogicalRedundancy;
    }

    /**
     * Boolean value representing if jumbo frames have been enabled for this connection.
     * 
     */
    @Import(name="jumboFrameCapable")
      private final @Nullable Output<Boolean> jumboFrameCapable;

    public Output<Boolean> getJumboFrameCapable() {
        return this.jumboFrameCapable == null ? Output.empty() : this.jumboFrameCapable;
    }

    /**
     * The AWS Direct Connect location where the connection is located. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the connection.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the AWS account that owns the connection.
     * 
     */
    @Import(name="ownerAccountId")
      private final @Nullable Output<String> ownerAccountId;

    public Output<String> getOwnerAccountId() {
        return this.ownerAccountId == null ? Output.empty() : this.ownerAccountId;
    }

    /**
     * The name of the service provider associated with the connection.
     * 
     */
    @Import(name="providerName")
      private final @Nullable Output<String> providerName;

    public Output<String> getProviderName() {
        return this.providerName == null ? Output.empty() : this.providerName;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ConnectionState(
        @Nullable Output<String> arn,
        @Nullable Output<String> awsDevice,
        @Nullable Output<String> bandwidth,
        @Nullable Output<String> hasLogicalRedundancy,
        @Nullable Output<Boolean> jumboFrameCapable,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> ownerAccountId,
        @Nullable Output<String> providerName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.awsDevice = awsDevice;
        this.bandwidth = bandwidth;
        this.hasLogicalRedundancy = hasLogicalRedundancy;
        this.jumboFrameCapable = jumboFrameCapable;
        this.location = location;
        this.name = name;
        this.ownerAccountId = ownerAccountId;
        this.providerName = providerName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ConnectionState() {
        this.arn = Output.empty();
        this.awsDevice = Output.empty();
        this.bandwidth = Output.empty();
        this.hasLogicalRedundancy = Output.empty();
        this.jumboFrameCapable = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.ownerAccountId = Output.empty();
        this.providerName = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> awsDevice;
        private @Nullable Output<String> bandwidth;
        private @Nullable Output<String> hasLogicalRedundancy;
        private @Nullable Output<Boolean> jumboFrameCapable;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ownerAccountId;
        private @Nullable Output<String> providerName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.awsDevice = defaults.awsDevice;
    	      this.bandwidth = defaults.bandwidth;
    	      this.hasLogicalRedundancy = defaults.hasLogicalRedundancy;
    	      this.jumboFrameCapable = defaults.jumboFrameCapable;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.ownerAccountId = defaults.ownerAccountId;
    	      this.providerName = defaults.providerName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder awsDevice(@Nullable Output<String> awsDevice) {
            this.awsDevice = awsDevice;
            return this;
        }
        public Builder awsDevice(@Nullable String awsDevice) {
            this.awsDevice = Output.ofNullable(awsDevice);
            return this;
        }
        public Builder bandwidth(@Nullable Output<String> bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Builder bandwidth(@Nullable String bandwidth) {
            this.bandwidth = Output.ofNullable(bandwidth);
            return this;
        }
        public Builder hasLogicalRedundancy(@Nullable Output<String> hasLogicalRedundancy) {
            this.hasLogicalRedundancy = hasLogicalRedundancy;
            return this;
        }
        public Builder hasLogicalRedundancy(@Nullable String hasLogicalRedundancy) {
            this.hasLogicalRedundancy = Output.ofNullable(hasLogicalRedundancy);
            return this;
        }
        public Builder jumboFrameCapable(@Nullable Output<Boolean> jumboFrameCapable) {
            this.jumboFrameCapable = jumboFrameCapable;
            return this;
        }
        public Builder jumboFrameCapable(@Nullable Boolean jumboFrameCapable) {
            this.jumboFrameCapable = Output.ofNullable(jumboFrameCapable);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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
        public Builder ownerAccountId(@Nullable Output<String> ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Builder ownerAccountId(@Nullable String ownerAccountId) {
            this.ownerAccountId = Output.ofNullable(ownerAccountId);
            return this;
        }
        public Builder providerName(@Nullable Output<String> providerName) {
            this.providerName = providerName;
            return this;
        }
        public Builder providerName(@Nullable String providerName) {
            this.providerName = Output.ofNullable(providerName);
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
        }        public ConnectionState build() {
            return new ConnectionState(arn, awsDevice, bandwidth, hasLogicalRedundancy, jumboFrameCapable, location, name, ownerAccountId, providerName, tags, tagsAll);
        }
    }
}
