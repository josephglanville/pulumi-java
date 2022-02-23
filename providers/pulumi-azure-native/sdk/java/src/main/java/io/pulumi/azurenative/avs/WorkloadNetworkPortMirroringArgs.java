// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.avs.enums.PortMirroringDirectionEnum;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadNetworkPortMirroringArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadNetworkPortMirroringArgs Empty = new WorkloadNetworkPortMirroringArgs();

    /**
     * Destination VM Group.
     * 
     */
    @InputImport(name="destination")
      private final @Nullable Input<String> destination;

    public Input<String> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    /**
     * Direction of port mirroring profile.
     * 
     */
    @InputImport(name="direction")
      private final @Nullable Input<Either<String,PortMirroringDirectionEnum>> direction;

    public Input<Either<String,PortMirroringDirectionEnum>> getDirection() {
        return this.direction == null ? Input.empty() : this.direction;
    }

    /**
     * Display name of the port mirroring profile.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * NSX Port Mirroring identifier. Generally the same as the Port Mirroring display name
     * 
     */
    @InputImport(name="portMirroringId")
      private final @Nullable Input<String> portMirroringId;

    public Input<String> getPortMirroringId() {
        return this.portMirroringId == null ? Input.empty() : this.portMirroringId;
    }

    /**
     * Name of the private cloud
     * 
     */
    @InputImport(name="privateCloudName", required=true)
      private final Input<String> privateCloudName;

    public Input<String> getPrivateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * NSX revision number.
     * 
     */
    @InputImport(name="revision")
      private final @Nullable Input<Double> revision;

    public Input<Double> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    /**
     * Source VM Group.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    public WorkloadNetworkPortMirroringArgs(
        @Nullable Input<String> destination,
        @Nullable Input<Either<String,PortMirroringDirectionEnum>> direction,
        @Nullable Input<String> displayName,
        @Nullable Input<String> portMirroringId,
        Input<String> privateCloudName,
        Input<String> resourceGroupName,
        @Nullable Input<Double> revision,
        @Nullable Input<String> source) {
        this.destination = destination;
        this.direction = direction;
        this.displayName = displayName;
        this.portMirroringId = portMirroringId;
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.revision = revision;
        this.source = source;
    }

    private WorkloadNetworkPortMirroringArgs() {
        this.destination = Input.empty();
        this.direction = Input.empty();
        this.displayName = Input.empty();
        this.portMirroringId = Input.empty();
        this.privateCloudName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.revision = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadNetworkPortMirroringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> destination;
        private @Nullable Input<Either<String,PortMirroringDirectionEnum>> direction;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> portMirroringId;
        private Input<String> privateCloudName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Double> revision;
        private @Nullable Input<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadNetworkPortMirroringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.portMirroringId = defaults.portMirroringId;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.revision = defaults.revision;
    	      this.source = defaults.source;
        }

        public Builder setDestination(@Nullable Input<String> destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder setDirection(@Nullable Input<Either<String,PortMirroringDirectionEnum>> direction) {
            this.direction = direction;
            return this;
        }

        public Builder setDirection(@Nullable Either<String,PortMirroringDirectionEnum> direction) {
            this.direction = Input.ofNullable(direction);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setPortMirroringId(@Nullable Input<String> portMirroringId) {
            this.portMirroringId = portMirroringId;
            return this;
        }

        public Builder setPortMirroringId(@Nullable String portMirroringId) {
            this.portMirroringId = Input.ofNullable(portMirroringId);
            return this;
        }

        public Builder setPrivateCloudName(Input<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Input.of(Objects.requireNonNull(privateCloudName));
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

        public Builder setRevision(@Nullable Input<Double> revision) {
            this.revision = revision;
            return this;
        }

        public Builder setRevision(@Nullable Double revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }
        public WorkloadNetworkPortMirroringArgs build() {
            return new WorkloadNetworkPortMirroringArgs(destination, direction, displayName, portMirroringId, privateCloudName, resourceGroupName, revision, source);
        }
    }
}
