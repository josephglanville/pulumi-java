// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.storsimple.inputs.ManagerIntrinsicSettingsArgs;
import io.pulumi.azurenative.storsimple.inputs.ManagerSkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagerArgs Empty = new ManagerArgs();

    /**
     * Represents the type of StorSimple Manager.
     * 
     */
    @Import(name="cisIntrinsicSettings")
      private final @Nullable Output<ManagerIntrinsicSettingsArgs> cisIntrinsicSettings;

    public Output<ManagerIntrinsicSettingsArgs> getCisIntrinsicSettings() {
        return this.cisIntrinsicSettings == null ? Output.empty() : this.cisIntrinsicSettings;
    }

    /**
     * The geo location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The manager name
     * 
     */
    @Import(name="managerName")
      private final @Nullable Output<String> managerName;

    public Output<String> getManagerName() {
        return this.managerName == null ? Output.empty() : this.managerName;
    }

    /**
     * Specifies the state of the resource as it is getting provisioned. Value of "Succeeded" means the Manager was successfully created.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the Sku.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<ManagerSkuArgs> sku;

    public Output<ManagerSkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * The tags attached to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ManagerArgs(
        @Nullable Output<ManagerIntrinsicSettingsArgs> cisIntrinsicSettings,
        @Nullable Output<String> location,
        @Nullable Output<String> managerName,
        @Nullable Output<String> provisioningState,
        Output<String> resourceGroupName,
        @Nullable Output<ManagerSkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.cisIntrinsicSettings = cisIntrinsicSettings;
        this.location = location;
        this.managerName = managerName;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private ManagerArgs() {
        this.cisIntrinsicSettings = Output.empty();
        this.location = Output.empty();
        this.managerName = Output.empty();
        this.provisioningState = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ManagerIntrinsicSettingsArgs> cisIntrinsicSettings;
        private @Nullable Output<String> location;
        private @Nullable Output<String> managerName;
        private @Nullable Output<String> provisioningState;
        private Output<String> resourceGroupName;
        private @Nullable Output<ManagerSkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cisIntrinsicSettings = defaults.cisIntrinsicSettings;
    	      this.location = defaults.location;
    	      this.managerName = defaults.managerName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder cisIntrinsicSettings(@Nullable Output<ManagerIntrinsicSettingsArgs> cisIntrinsicSettings) {
            this.cisIntrinsicSettings = cisIntrinsicSettings;
            return this;
        }
        public Builder cisIntrinsicSettings(@Nullable ManagerIntrinsicSettingsArgs cisIntrinsicSettings) {
            this.cisIntrinsicSettings = Output.ofNullable(cisIntrinsicSettings);
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
        public Builder managerName(@Nullable Output<String> managerName) {
            this.managerName = managerName;
            return this;
        }
        public Builder managerName(@Nullable String managerName) {
            this.managerName = Output.ofNullable(managerName);
            return this;
        }
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
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
        public Builder sku(@Nullable Output<ManagerSkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable ManagerSkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ManagerArgs build() {
            return new ManagerArgs(cisIntrinsicSettings, location, managerName, provisioningState, resourceGroupName, sku, tags);
        }
    }
}
