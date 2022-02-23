// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.agfoodplatform;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtensionArgs Empty = new ExtensionArgs();

    /**
     * Id of extension resource.
     * 
     */
    @InputImport(name="extensionId")
      private final @Nullable Input<String> extensionId;

    public Input<String> getExtensionId() {
        return this.extensionId == null ? Input.empty() : this.extensionId;
    }

    /**
     * FarmBeats resource name.
     * 
     */
    @InputImport(name="farmBeatsResourceName", required=true)
      private final Input<String> farmBeatsResourceName;

    public Input<String> getFarmBeatsResourceName() {
        return this.farmBeatsResourceName;
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

    public ExtensionArgs(
        @Nullable Input<String> extensionId,
        Input<String> farmBeatsResourceName,
        Input<String> resourceGroupName) {
        this.extensionId = extensionId;
        this.farmBeatsResourceName = Objects.requireNonNull(farmBeatsResourceName, "expected parameter 'farmBeatsResourceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ExtensionArgs() {
        this.extensionId = Input.empty();
        this.farmBeatsResourceName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> extensionId;
        private Input<String> farmBeatsResourceName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensionId = defaults.extensionId;
    	      this.farmBeatsResourceName = defaults.farmBeatsResourceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setExtensionId(@Nullable Input<String> extensionId) {
            this.extensionId = extensionId;
            return this;
        }

        public Builder setExtensionId(@Nullable String extensionId) {
            this.extensionId = Input.ofNullable(extensionId);
            return this;
        }

        public Builder setFarmBeatsResourceName(Input<String> farmBeatsResourceName) {
            this.farmBeatsResourceName = Objects.requireNonNull(farmBeatsResourceName);
            return this;
        }

        public Builder setFarmBeatsResourceName(String farmBeatsResourceName) {
            this.farmBeatsResourceName = Input.of(Objects.requireNonNull(farmBeatsResourceName));
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
        public ExtensionArgs build() {
            return new ExtensionArgs(extensionId, farmBeatsResourceName, resourceGroupName);
        }
    }
}
