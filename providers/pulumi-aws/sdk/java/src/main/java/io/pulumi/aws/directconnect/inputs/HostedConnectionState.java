// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedConnectionState extends io.pulumi.resources.ResourceArgs {

    public static final HostedConnectionState Empty = new HostedConnectionState();

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
     * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
     * 
     */
    @Import(name="bandwidth")
      private final @Nullable Output<String> bandwidth;

    public Output<String> getBandwidth() {
        return this.bandwidth == null ? Output.empty() : this.bandwidth;
    }

    /**
     * The ID of the interconnect or LAG.
     * 
     */
    @Import(name="connectionId")
      private final @Nullable Output<String> connectionId;

    public Output<String> getConnectionId() {
        return this.connectionId == null ? Output.empty() : this.connectionId;
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
     * The ID of the LAG.
     * 
     */
    @Import(name="lagId")
      private final @Nullable Output<String> lagId;

    public Output<String> getLagId() {
        return this.lagId == null ? Output.empty() : this.lagId;
    }

    /**
     * The time of the most recent call to [DescribeLoa](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLoa.html) for this connection.
     * 
     */
    @Import(name="loaIssueTime")
      private final @Nullable Output<String> loaIssueTime;

    public Output<String> getLoaIssueTime() {
        return this.loaIssueTime == null ? Output.empty() : this.loaIssueTime;
    }

    /**
     * The location of the connection.
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
     * The ID of the AWS account of the customer for the connection.
     * 
     */
    @Import(name="ownerAccountId")
      private final @Nullable Output<String> ownerAccountId;

    public Output<String> getOwnerAccountId() {
        return this.ownerAccountId == null ? Output.empty() : this.ownerAccountId;
    }

    /**
     * The name of the AWS Direct Connect service provider associated with the connection.
     * 
     */
    @Import(name="partnerName")
      private final @Nullable Output<String> partnerName;

    public Output<String> getPartnerName() {
        return this.partnerName == null ? Output.empty() : this.partnerName;
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
     * The AWS Region where the connection is located.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The state of the connection. Possible values include: ordering, requested, pending, available, down, deleting, deleted, rejected, unknown. See [AllocateHostedConnection](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateHostedConnection.html) for a description of each connection state.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * The dedicated VLAN provisioned to the hosted connection.
     * 
     */
    @Import(name="vlan")
      private final @Nullable Output<Integer> vlan;

    public Output<Integer> getVlan() {
        return this.vlan == null ? Output.empty() : this.vlan;
    }

    public HostedConnectionState(
        @Nullable Output<String> awsDevice,
        @Nullable Output<String> bandwidth,
        @Nullable Output<String> connectionId,
        @Nullable Output<String> hasLogicalRedundancy,
        @Nullable Output<Boolean> jumboFrameCapable,
        @Nullable Output<String> lagId,
        @Nullable Output<String> loaIssueTime,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> ownerAccountId,
        @Nullable Output<String> partnerName,
        @Nullable Output<String> providerName,
        @Nullable Output<String> region,
        @Nullable Output<String> state,
        @Nullable Output<Integer> vlan) {
        this.awsDevice = awsDevice;
        this.bandwidth = bandwidth;
        this.connectionId = connectionId;
        this.hasLogicalRedundancy = hasLogicalRedundancy;
        this.jumboFrameCapable = jumboFrameCapable;
        this.lagId = lagId;
        this.loaIssueTime = loaIssueTime;
        this.location = location;
        this.name = name;
        this.ownerAccountId = ownerAccountId;
        this.partnerName = partnerName;
        this.providerName = providerName;
        this.region = region;
        this.state = state;
        this.vlan = vlan;
    }

    private HostedConnectionState() {
        this.awsDevice = Output.empty();
        this.bandwidth = Output.empty();
        this.connectionId = Output.empty();
        this.hasLogicalRedundancy = Output.empty();
        this.jumboFrameCapable = Output.empty();
        this.lagId = Output.empty();
        this.loaIssueTime = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.ownerAccountId = Output.empty();
        this.partnerName = Output.empty();
        this.providerName = Output.empty();
        this.region = Output.empty();
        this.state = Output.empty();
        this.vlan = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> awsDevice;
        private @Nullable Output<String> bandwidth;
        private @Nullable Output<String> connectionId;
        private @Nullable Output<String> hasLogicalRedundancy;
        private @Nullable Output<Boolean> jumboFrameCapable;
        private @Nullable Output<String> lagId;
        private @Nullable Output<String> loaIssueTime;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ownerAccountId;
        private @Nullable Output<String> partnerName;
        private @Nullable Output<String> providerName;
        private @Nullable Output<String> region;
        private @Nullable Output<String> state;
        private @Nullable Output<Integer> vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsDevice = defaults.awsDevice;
    	      this.bandwidth = defaults.bandwidth;
    	      this.connectionId = defaults.connectionId;
    	      this.hasLogicalRedundancy = defaults.hasLogicalRedundancy;
    	      this.jumboFrameCapable = defaults.jumboFrameCapable;
    	      this.lagId = defaults.lagId;
    	      this.loaIssueTime = defaults.loaIssueTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.ownerAccountId = defaults.ownerAccountId;
    	      this.partnerName = defaults.partnerName;
    	      this.providerName = defaults.providerName;
    	      this.region = defaults.region;
    	      this.state = defaults.state;
    	      this.vlan = defaults.vlan;
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
        public Builder connectionId(@Nullable Output<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Builder connectionId(@Nullable String connectionId) {
            this.connectionId = Output.ofNullable(connectionId);
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
        public Builder lagId(@Nullable Output<String> lagId) {
            this.lagId = lagId;
            return this;
        }
        public Builder lagId(@Nullable String lagId) {
            this.lagId = Output.ofNullable(lagId);
            return this;
        }
        public Builder loaIssueTime(@Nullable Output<String> loaIssueTime) {
            this.loaIssueTime = loaIssueTime;
            return this;
        }
        public Builder loaIssueTime(@Nullable String loaIssueTime) {
            this.loaIssueTime = Output.ofNullable(loaIssueTime);
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
        public Builder partnerName(@Nullable Output<String> partnerName) {
            this.partnerName = partnerName;
            return this;
        }
        public Builder partnerName(@Nullable String partnerName) {
            this.partnerName = Output.ofNullable(partnerName);
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
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder vlan(@Nullable Output<Integer> vlan) {
            this.vlan = vlan;
            return this;
        }
        public Builder vlan(@Nullable Integer vlan) {
            this.vlan = Output.ofNullable(vlan);
            return this;
        }        public HostedConnectionState build() {
            return new HostedConnectionState(awsDevice, bandwidth, connectionId, hasLogicalRedundancy, jumboFrameCapable, lagId, loaIssueTime, location, name, ownerAccountId, partnerName, providerName, region, state, vlan);
        }
    }
}