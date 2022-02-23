// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.enums.ProximityPlacementGroupType;
import io.pulumi.azurenative.compute.inputs.InstanceViewStatusArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProximityPlacementGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProximityPlacementGroupArgs Empty = new ProximityPlacementGroupArgs();

    /**
     * Describes colocation status of the Proximity Placement Group.
     * 
     */
    @InputImport(name="colocationStatus")
      private final @Nullable Input<InstanceViewStatusArgs> colocationStatus;

    public Input<InstanceViewStatusArgs> getColocationStatus() {
        return this.colocationStatus == null ? Input.empty() : this.colocationStatus;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the proximity placement group.
     * 
     */
    @InputImport(name="proximityPlacementGroupName")
      private final @Nullable Input<String> proximityPlacementGroupName;

    public Input<String> getProximityPlacementGroupName() {
        return this.proximityPlacementGroupName == null ? Input.empty() : this.proximityPlacementGroupName;
    }

    /**
     * Specifies the type of the proximity placement group. <br><br> Possible values are: <br><br> **Standard** : Co-locate resources within an Azure region or Availability Zone. <br><br> **Ultra** : For future use.
     * 
     */
    @InputImport(name="proximityPlacementGroupType")
      private final @Nullable Input<Either<String,ProximityPlacementGroupType>> proximityPlacementGroupType;

    public Input<Either<String,ProximityPlacementGroupType>> getProximityPlacementGroupType() {
        return this.proximityPlacementGroupType == null ? Input.empty() : this.proximityPlacementGroupType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ProximityPlacementGroupArgs(
        @Nullable Input<InstanceViewStatusArgs> colocationStatus,
        @Nullable Input<String> location,
        @Nullable Input<String> proximityPlacementGroupName,
        @Nullable Input<Either<String,ProximityPlacementGroupType>> proximityPlacementGroupType,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.colocationStatus = colocationStatus;
        this.location = location;
        this.proximityPlacementGroupName = proximityPlacementGroupName;
        this.proximityPlacementGroupType = proximityPlacementGroupType;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ProximityPlacementGroupArgs() {
        this.colocationStatus = Input.empty();
        this.location = Input.empty();
        this.proximityPlacementGroupName = Input.empty();
        this.proximityPlacementGroupType = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProximityPlacementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceViewStatusArgs> colocationStatus;
        private @Nullable Input<String> location;
        private @Nullable Input<String> proximityPlacementGroupName;
        private @Nullable Input<Either<String,ProximityPlacementGroupType>> proximityPlacementGroupType;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProximityPlacementGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colocationStatus = defaults.colocationStatus;
    	      this.location = defaults.location;
    	      this.proximityPlacementGroupName = defaults.proximityPlacementGroupName;
    	      this.proximityPlacementGroupType = defaults.proximityPlacementGroupType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setColocationStatus(@Nullable Input<InstanceViewStatusArgs> colocationStatus) {
            this.colocationStatus = colocationStatus;
            return this;
        }

        public Builder setColocationStatus(@Nullable InstanceViewStatusArgs colocationStatus) {
            this.colocationStatus = Input.ofNullable(colocationStatus);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProximityPlacementGroupName(@Nullable Input<String> proximityPlacementGroupName) {
            this.proximityPlacementGroupName = proximityPlacementGroupName;
            return this;
        }

        public Builder setProximityPlacementGroupName(@Nullable String proximityPlacementGroupName) {
            this.proximityPlacementGroupName = Input.ofNullable(proximityPlacementGroupName);
            return this;
        }

        public Builder setProximityPlacementGroupType(@Nullable Input<Either<String,ProximityPlacementGroupType>> proximityPlacementGroupType) {
            this.proximityPlacementGroupType = proximityPlacementGroupType;
            return this;
        }

        public Builder setProximityPlacementGroupType(@Nullable Either<String,ProximityPlacementGroupType> proximityPlacementGroupType) {
            this.proximityPlacementGroupType = Input.ofNullable(proximityPlacementGroupType);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ProximityPlacementGroupArgs build() {
            return new ProximityPlacementGroupArgs(colocationStatus, location, proximityPlacementGroupName, proximityPlacementGroupType, resourceGroupName, tags);
        }
    }
}
