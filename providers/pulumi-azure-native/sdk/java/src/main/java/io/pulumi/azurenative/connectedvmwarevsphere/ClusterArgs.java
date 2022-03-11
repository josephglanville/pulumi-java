// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.connectedvmwarevsphere.inputs.ExtendedLocationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Name of the cluster.
     * 
     */
    @InputImport(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName == null ? Output.empty() : this.clusterName;
    }

    /**
     * Gets or sets the extended location.
     * 
     */
    @InputImport(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Output.empty() : this.extendedLocation;
    }

    /**
     * Gets or sets the inventory Item ID for the cluster.
     * 
     */
    @InputImport(name="inventoryItemId")
      private final @Nullable Output<String> inventoryItemId;

    public Output<String> getInventoryItemId() {
        return this.inventoryItemId == null ? Output.empty() : this.inventoryItemId;
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Gets or sets the location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the cluster.
     * 
     */
    @InputImport(name="moRefId")
      private final @Nullable Output<String> moRefId;

    public Output<String> getMoRefId() {
        return this.moRefId == null ? Output.empty() : this.moRefId;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Gets or sets the ARM Id of the vCenter resource in which this cluster resides.
     * 
     */
    @InputImport(name="vCenterId")
      private final @Nullable Output<String> vCenterId;

    public Output<String> getVCenterId() {
        return this.vCenterId == null ? Output.empty() : this.vCenterId;
    }

    public ClusterArgs(
        @Nullable Output<String> clusterName,
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<String> inventoryItemId,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<String> moRefId,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vCenterId) {
        this.clusterName = clusterName;
        this.extendedLocation = extendedLocation;
        this.inventoryItemId = inventoryItemId;
        this.kind = kind;
        this.location = location;
        this.moRefId = moRefId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vCenterId = vCenterId;
    }

    private ClusterArgs() {
        this.clusterName = Output.empty();
        this.extendedLocation = Output.empty();
        this.inventoryItemId = Output.empty();
        this.kind = Output.empty();
        this.location = Output.empty();
        this.moRefId = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.vCenterId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterName;
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<String> inventoryItemId;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<String> moRefId;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vCenterId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.inventoryItemId = defaults.inventoryItemId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.moRefId = defaults.moRefId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vCenterId = defaults.vCenterId;
        }

        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Output.ofNullable(clusterName);
            return this;
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Output.ofNullable(extendedLocation);
            return this;
        }

        public Builder inventoryItemId(@Nullable Output<String> inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
            return this;
        }

        public Builder inventoryItemId(@Nullable String inventoryItemId) {
            this.inventoryItemId = Output.ofNullable(inventoryItemId);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
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

        public Builder moRefId(@Nullable Output<String> moRefId) {
            this.moRefId = moRefId;
            return this;
        }

        public Builder moRefId(@Nullable String moRefId) {
            this.moRefId = Output.ofNullable(moRefId);
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder vCenterId(@Nullable Output<String> vCenterId) {
            this.vCenterId = vCenterId;
            return this;
        }

        public Builder vCenterId(@Nullable String vCenterId) {
            this.vCenterId = Output.ofNullable(vCenterId);
            return this;
        }
        public ClusterArgs build() {
            return new ClusterArgs(clusterName, extendedLocation, inventoryItemId, kind, location, moRefId, resourceGroupName, tags, vCenterId);
        }
    }
}
