// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbidedicated;

import io.pulumi.azurenative.powerbidedicated.inputs.AutoScaleVCoreSkuArgs;
import io.pulumi.azurenative.powerbidedicated.inputs.SystemDataArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoScaleVCoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoScaleVCoreArgs Empty = new AutoScaleVCoreArgs();

    /**
     * The maximum capacity of an auto scale v-core resource.
     * 
     */
    @InputImport(name="capacityLimit")
      private final @Nullable Input<Integer> capacityLimit;

    public Input<Integer> getCapacityLimit() {
        return this.capacityLimit == null ? Input.empty() : this.capacityLimit;
    }

    /**
     * The object ID of the capacity resource associated with the auto scale v-core resource.
     * 
     */
    @InputImport(name="capacityObjectId")
      private final @Nullable Input<String> capacityObjectId;

    public Input<String> getCapacityObjectId() {
        return this.capacityObjectId == null ? Input.empty() : this.capacityObjectId;
    }

    /**
     * Location of the PowerBI Dedicated resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the auto scale v-core resource.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<AutoScaleVCoreSkuArgs> sku;

    public Input<AutoScaleVCoreSkuArgs> getSku() {
        return this.sku;
    }

    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @InputImport(name="systemData")
      private final @Nullable Input<SystemDataArgs> systemData;

    public Input<SystemDataArgs> getSystemData() {
        return this.systemData == null ? Input.empty() : this.systemData;
    }

    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @InputImport(name="vcoreName")
      private final @Nullable Input<String> vcoreName;

    public Input<String> getVcoreName() {
        return this.vcoreName == null ? Input.empty() : this.vcoreName;
    }

    public AutoScaleVCoreArgs(
        @Nullable Input<Integer> capacityLimit,
        @Nullable Input<String> capacityObjectId,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<AutoScaleVCoreSkuArgs> sku,
        @Nullable Input<SystemDataArgs> systemData,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> vcoreName) {
        this.capacityLimit = capacityLimit;
        this.capacityObjectId = capacityObjectId;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.systemData = systemData;
        this.tags = tags;
        this.vcoreName = vcoreName;
    }

    private AutoScaleVCoreArgs() {
        this.capacityLimit = Input.empty();
        this.capacityObjectId = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.systemData = Input.empty();
        this.tags = Input.empty();
        this.vcoreName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleVCoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacityLimit;
        private @Nullable Input<String> capacityObjectId;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<AutoScaleVCoreSkuArgs> sku;
        private @Nullable Input<SystemDataArgs> systemData;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> vcoreName;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleVCoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityLimit = defaults.capacityLimit;
    	      this.capacityObjectId = defaults.capacityObjectId;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.vcoreName = defaults.vcoreName;
        }

        public Builder setCapacityLimit(@Nullable Input<Integer> capacityLimit) {
            this.capacityLimit = capacityLimit;
            return this;
        }

        public Builder setCapacityLimit(@Nullable Integer capacityLimit) {
            this.capacityLimit = Input.ofNullable(capacityLimit);
            return this;
        }

        public Builder setCapacityObjectId(@Nullable Input<String> capacityObjectId) {
            this.capacityObjectId = capacityObjectId;
            return this;
        }

        public Builder setCapacityObjectId(@Nullable String capacityObjectId) {
            this.capacityObjectId = Input.ofNullable(capacityObjectId);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(Input<AutoScaleVCoreSkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(AutoScaleVCoreSkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setSystemData(@Nullable Input<SystemDataArgs> systemData) {
            this.systemData = systemData;
            return this;
        }

        public Builder setSystemData(@Nullable SystemDataArgs systemData) {
            this.systemData = Input.ofNullable(systemData);
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

        public Builder setVcoreName(@Nullable Input<String> vcoreName) {
            this.vcoreName = vcoreName;
            return this;
        }

        public Builder setVcoreName(@Nullable String vcoreName) {
            this.vcoreName = Input.ofNullable(vcoreName);
            return this;
        }
        public AutoScaleVCoreArgs build() {
            return new AutoScaleVCoreArgs(capacityLimit, capacityObjectId, location, resourceGroupName, sku, systemData, tags, vcoreName);
        }
    }
}
