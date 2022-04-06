// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.appstream.inputs.FleetComputeCapacityArgs;
import io.pulumi.aws.appstream.inputs.FleetDomainJoinInfoArgs;
import io.pulumi.aws.appstream.inputs.FleetVpcConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetArgs Empty = new FleetArgs();

    /**
     * Configuration block for the desired capacity of the fleet. See below.
     * 
     */
    @Import(name="computeCapacity", required=true)
      private final Output<FleetComputeCapacityArgs> computeCapacity;

    public Output<FleetComputeCapacityArgs> getComputeCapacity() {
        return this.computeCapacity;
    }

    /**
     * Description to display.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Amount of time that a streaming session remains active after users disconnect.
     * 
     */
    @Import(name="disconnectTimeoutInSeconds")
      private final @Nullable Output<Integer> disconnectTimeoutInSeconds;

    public Output<Integer> getDisconnectTimeoutInSeconds() {
        return this.disconnectTimeoutInSeconds == null ? Output.empty() : this.disconnectTimeoutInSeconds;
    }

    /**
     * Human-readable friendly name for the AppStream fleet.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. See below.
     * 
     */
    @Import(name="domainJoinInfo")
      private final @Nullable Output<FleetDomainJoinInfoArgs> domainJoinInfo;

    public Output<FleetDomainJoinInfoArgs> getDomainJoinInfo() {
        return this.domainJoinInfo == null ? Output.empty() : this.domainJoinInfo;
    }

    /**
     * Enables or disables default internet access for the fleet.
     * 
     */
    @Import(name="enableDefaultInternetAccess")
      private final @Nullable Output<Boolean> enableDefaultInternetAccess;

    public Output<Boolean> getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess == null ? Output.empty() : this.enableDefaultInternetAccess;
    }

    /**
     * Fleet type. Valid values are: `ON_DEMAND`, `ALWAYS_ON`
     * 
     */
    @Import(name="fleetType")
      private final @Nullable Output<String> fleetType;

    public Output<String> getFleetType() {
        return this.fleetType == null ? Output.empty() : this.fleetType;
    }

    /**
     * ARN of the IAM role to apply to the fleet.
     * 
     */
    @Import(name="iamRoleArn")
      private final @Nullable Output<String> iamRoleArn;

    public Output<String> getIamRoleArn() {
        return this.iamRoleArn == null ? Output.empty() : this.iamRoleArn;
    }

    /**
     * Amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the `disconnect_timeout_in_seconds` time interval begins.
     * 
     */
    @Import(name="idleDisconnectTimeoutInSeconds")
      private final @Nullable Output<Integer> idleDisconnectTimeoutInSeconds;

    public Output<Integer> getIdleDisconnectTimeoutInSeconds() {
        return this.idleDisconnectTimeoutInSeconds == null ? Output.empty() : this.idleDisconnectTimeoutInSeconds;
    }

    /**
     * ARN of the public, private, or shared image to use.
     * 
     */
    @Import(name="imageArn")
      private final @Nullable Output<String> imageArn;

    public Output<String> getImageArn() {
        return this.imageArn == null ? Output.empty() : this.imageArn;
    }

    /**
     * Name of the image used to create the fleet.
     * 
     */
    @Import(name="imageName")
      private final @Nullable Output<String> imageName;

    public Output<String> getImageName() {
        return this.imageName == null ? Output.empty() : this.imageName;
    }

    /**
     * Instance type to use when launching fleet instances.
     * 
     */
    @Import(name="instanceType", required=true)
      private final Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * Maximum amount of time that a streaming session can remain active, in seconds.
     * 
     */
    @Import(name="maxUserDurationInSeconds")
      private final @Nullable Output<Integer> maxUserDurationInSeconds;

    public Output<Integer> getMaxUserDurationInSeconds() {
        return this.maxUserDurationInSeconds == null ? Output.empty() : this.maxUserDurationInSeconds;
    }

    /**
     * Unique name for the fleet.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * AppStream 2.0 view that is displayed to your users when they stream from the fleet. When `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is specified, the standard desktop that is provided by the operating system displays. If not specified, defaults to `APP`.
     * 
     */
    @Import(name="streamView")
      private final @Nullable Output<String> streamView;

    public Output<String> getStreamView() {
        return this.streamView == null ? Output.empty() : this.streamView;
    }

    /**
     * Map of tags to attach to AppStream instances.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Configuration block for the VPC configuration for the image builder. See below.
     * 
     */
    @Import(name="vpcConfig")
      private final @Nullable Output<FleetVpcConfigArgs> vpcConfig;

    public Output<FleetVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Output.empty() : this.vpcConfig;
    }

    public FleetArgs(
        Output<FleetComputeCapacityArgs> computeCapacity,
        @Nullable Output<String> description,
        @Nullable Output<Integer> disconnectTimeoutInSeconds,
        @Nullable Output<String> displayName,
        @Nullable Output<FleetDomainJoinInfoArgs> domainJoinInfo,
        @Nullable Output<Boolean> enableDefaultInternetAccess,
        @Nullable Output<String> fleetType,
        @Nullable Output<String> iamRoleArn,
        @Nullable Output<Integer> idleDisconnectTimeoutInSeconds,
        @Nullable Output<String> imageArn,
        @Nullable Output<String> imageName,
        Output<String> instanceType,
        @Nullable Output<Integer> maxUserDurationInSeconds,
        @Nullable Output<String> name,
        @Nullable Output<String> streamView,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<FleetVpcConfigArgs> vpcConfig) {
        this.computeCapacity = Objects.requireNonNull(computeCapacity, "expected parameter 'computeCapacity' to be non-null");
        this.description = description;
        this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
        this.displayName = displayName;
        this.domainJoinInfo = domainJoinInfo;
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
        this.fleetType = fleetType;
        this.iamRoleArn = iamRoleArn;
        this.idleDisconnectTimeoutInSeconds = idleDisconnectTimeoutInSeconds;
        this.imageArn = imageArn;
        this.imageName = imageName;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.maxUserDurationInSeconds = maxUserDurationInSeconds;
        this.name = name;
        this.streamView = streamView;
        this.tags = tags;
        this.vpcConfig = vpcConfig;
    }

    private FleetArgs() {
        this.computeCapacity = Output.empty();
        this.description = Output.empty();
        this.disconnectTimeoutInSeconds = Output.empty();
        this.displayName = Output.empty();
        this.domainJoinInfo = Output.empty();
        this.enableDefaultInternetAccess = Output.empty();
        this.fleetType = Output.empty();
        this.iamRoleArn = Output.empty();
        this.idleDisconnectTimeoutInSeconds = Output.empty();
        this.imageArn = Output.empty();
        this.imageName = Output.empty();
        this.instanceType = Output.empty();
        this.maxUserDurationInSeconds = Output.empty();
        this.name = Output.empty();
        this.streamView = Output.empty();
        this.tags = Output.empty();
        this.vpcConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FleetComputeCapacityArgs> computeCapacity;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> disconnectTimeoutInSeconds;
        private @Nullable Output<String> displayName;
        private @Nullable Output<FleetDomainJoinInfoArgs> domainJoinInfo;
        private @Nullable Output<Boolean> enableDefaultInternetAccess;
        private @Nullable Output<String> fleetType;
        private @Nullable Output<String> iamRoleArn;
        private @Nullable Output<Integer> idleDisconnectTimeoutInSeconds;
        private @Nullable Output<String> imageArn;
        private @Nullable Output<String> imageName;
        private Output<String> instanceType;
        private @Nullable Output<Integer> maxUserDurationInSeconds;
        private @Nullable Output<String> name;
        private @Nullable Output<String> streamView;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<FleetVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeCapacity = defaults.computeCapacity;
    	      this.description = defaults.description;
    	      this.disconnectTimeoutInSeconds = defaults.disconnectTimeoutInSeconds;
    	      this.displayName = defaults.displayName;
    	      this.domainJoinInfo = defaults.domainJoinInfo;
    	      this.enableDefaultInternetAccess = defaults.enableDefaultInternetAccess;
    	      this.fleetType = defaults.fleetType;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.idleDisconnectTimeoutInSeconds = defaults.idleDisconnectTimeoutInSeconds;
    	      this.imageArn = defaults.imageArn;
    	      this.imageName = defaults.imageName;
    	      this.instanceType = defaults.instanceType;
    	      this.maxUserDurationInSeconds = defaults.maxUserDurationInSeconds;
    	      this.name = defaults.name;
    	      this.streamView = defaults.streamView;
    	      this.tags = defaults.tags;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder computeCapacity(Output<FleetComputeCapacityArgs> computeCapacity) {
            this.computeCapacity = Objects.requireNonNull(computeCapacity);
            return this;
        }
        public Builder computeCapacity(FleetComputeCapacityArgs computeCapacity) {
            this.computeCapacity = Output.of(Objects.requireNonNull(computeCapacity));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder disconnectTimeoutInSeconds(@Nullable Output<Integer> disconnectTimeoutInSeconds) {
            this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
            return this;
        }
        public Builder disconnectTimeoutInSeconds(@Nullable Integer disconnectTimeoutInSeconds) {
            this.disconnectTimeoutInSeconds = Output.ofNullable(disconnectTimeoutInSeconds);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder domainJoinInfo(@Nullable Output<FleetDomainJoinInfoArgs> domainJoinInfo) {
            this.domainJoinInfo = domainJoinInfo;
            return this;
        }
        public Builder domainJoinInfo(@Nullable FleetDomainJoinInfoArgs domainJoinInfo) {
            this.domainJoinInfo = Output.ofNullable(domainJoinInfo);
            return this;
        }
        public Builder enableDefaultInternetAccess(@Nullable Output<Boolean> enableDefaultInternetAccess) {
            this.enableDefaultInternetAccess = enableDefaultInternetAccess;
            return this;
        }
        public Builder enableDefaultInternetAccess(@Nullable Boolean enableDefaultInternetAccess) {
            this.enableDefaultInternetAccess = Output.ofNullable(enableDefaultInternetAccess);
            return this;
        }
        public Builder fleetType(@Nullable Output<String> fleetType) {
            this.fleetType = fleetType;
            return this;
        }
        public Builder fleetType(@Nullable String fleetType) {
            this.fleetType = Output.ofNullable(fleetType);
            return this;
        }
        public Builder iamRoleArn(@Nullable Output<String> iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }
        public Builder iamRoleArn(@Nullable String iamRoleArn) {
            this.iamRoleArn = Output.ofNullable(iamRoleArn);
            return this;
        }
        public Builder idleDisconnectTimeoutInSeconds(@Nullable Output<Integer> idleDisconnectTimeoutInSeconds) {
            this.idleDisconnectTimeoutInSeconds = idleDisconnectTimeoutInSeconds;
            return this;
        }
        public Builder idleDisconnectTimeoutInSeconds(@Nullable Integer idleDisconnectTimeoutInSeconds) {
            this.idleDisconnectTimeoutInSeconds = Output.ofNullable(idleDisconnectTimeoutInSeconds);
            return this;
        }
        public Builder imageArn(@Nullable Output<String> imageArn) {
            this.imageArn = imageArn;
            return this;
        }
        public Builder imageArn(@Nullable String imageArn) {
            this.imageArn = Output.ofNullable(imageArn);
            return this;
        }
        public Builder imageName(@Nullable Output<String> imageName) {
            this.imageName = imageName;
            return this;
        }
        public Builder imageName(@Nullable String imageName) {
            this.imageName = Output.ofNullable(imageName);
            return this;
        }
        public Builder instanceType(Output<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Output.of(Objects.requireNonNull(instanceType));
            return this;
        }
        public Builder maxUserDurationInSeconds(@Nullable Output<Integer> maxUserDurationInSeconds) {
            this.maxUserDurationInSeconds = maxUserDurationInSeconds;
            return this;
        }
        public Builder maxUserDurationInSeconds(@Nullable Integer maxUserDurationInSeconds) {
            this.maxUserDurationInSeconds = Output.ofNullable(maxUserDurationInSeconds);
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
        public Builder streamView(@Nullable Output<String> streamView) {
            this.streamView = streamView;
            return this;
        }
        public Builder streamView(@Nullable String streamView) {
            this.streamView = Output.ofNullable(streamView);
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
        public Builder vpcConfig(@Nullable Output<FleetVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable FleetVpcConfigArgs vpcConfig) {
            this.vpcConfig = Output.ofNullable(vpcConfig);
            return this;
        }        public FleetArgs build() {
            return new FleetArgs(computeCapacity, description, disconnectTimeoutInSeconds, displayName, domainJoinInfo, enableDefaultInternetAccess, fleetType, iamRoleArn, idleDisconnectTimeoutInSeconds, imageArn, imageName, instanceType, maxUserDurationInSeconds, name, streamView, tags, vpcConfig);
        }
    }
}