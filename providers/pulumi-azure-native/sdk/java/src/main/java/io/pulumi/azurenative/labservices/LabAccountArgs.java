// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LabAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabAccountArgs Empty = new LabAccountArgs();

    @InputImport(name="enabledRegionSelection")
    private final @Nullable Input<Boolean> enabledRegionSelection;

    public Input<Boolean> getEnabledRegionSelection() {
        return this.enabledRegionSelection == null ? Input.empty() : this.enabledRegionSelection;
    }

    @InputImport(name="labAccountName")
    private final @Nullable Input<String> labAccountName;

    public Input<String> getLabAccountName() {
        return this.labAccountName == null ? Input.empty() : this.labAccountName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="provisioningState")
    private final @Nullable Input<String> provisioningState;

    public Input<String> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="uniqueIdentifier")
    private final @Nullable Input<String> uniqueIdentifier;

    public Input<String> getUniqueIdentifier() {
        return this.uniqueIdentifier == null ? Input.empty() : this.uniqueIdentifier;
    }

    public LabAccountArgs(
        @Nullable Input<Boolean> enabledRegionSelection,
        @Nullable Input<String> labAccountName,
        @Nullable Input<String> location,
        @Nullable Input<String> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> uniqueIdentifier) {
        this.enabledRegionSelection = enabledRegionSelection;
        this.labAccountName = labAccountName;
        this.location = location;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    private LabAccountArgs() {
        this.enabledRegionSelection = Input.empty();
        this.labAccountName = Input.empty();
        this.location = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.uniqueIdentifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabledRegionSelection;
        private @Nullable Input<String> labAccountName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(LabAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledRegionSelection = defaults.enabledRegionSelection;
    	      this.labAccountName = defaults.labAccountName;
    	      this.location = defaults.location;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder setEnabledRegionSelection(@Nullable Input<Boolean> enabledRegionSelection) {
            this.enabledRegionSelection = enabledRegionSelection;
            return this;
        }

        public Builder setEnabledRegionSelection(@Nullable Boolean enabledRegionSelection) {
            this.enabledRegionSelection = Input.ofNullable(enabledRegionSelection);
            return this;
        }

        public Builder setLabAccountName(@Nullable Input<String> labAccountName) {
            this.labAccountName = labAccountName;
            return this;
        }

        public Builder setLabAccountName(@Nullable String labAccountName) {
            this.labAccountName = Input.ofNullable(labAccountName);
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

        public Builder setProvisioningState(@Nullable Input<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
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

        public Builder setUniqueIdentifier(@Nullable Input<String> uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }

        public Builder setUniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = Input.ofNullable(uniqueIdentifier);
            return this;
        }

        public LabAccountArgs build() {
            return new LabAccountArgs(enabledRegionSelection, labAccountName, location, provisioningState, resourceGroupName, tags, uniqueIdentifier);
        }
    }
}
