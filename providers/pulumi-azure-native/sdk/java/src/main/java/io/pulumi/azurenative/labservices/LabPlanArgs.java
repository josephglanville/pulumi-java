// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.labservices.inputs.AutoShutdownProfileArgs;
import io.pulumi.azurenative.labservices.inputs.ConnectionProfileArgs;
import io.pulumi.azurenative.labservices.inputs.LabPlanNetworkProfileArgs;
import io.pulumi.azurenative.labservices.inputs.SupportInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LabPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabPlanArgs Empty = new LabPlanArgs();

    /**
     * The allowed regions for the lab creator to use when creating labs using this lab plan.
     * 
     */
    @InputImport(name="allowedRegions")
      private final @Nullable Output<List<String>> allowedRegions;

    public Output<List<String>> getAllowedRegions() {
        return this.allowedRegions == null ? Output.empty() : this.allowedRegions;
    }

    /**
     * The default lab shutdown profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    @InputImport(name="defaultAutoShutdownProfile")
      private final @Nullable Output<AutoShutdownProfileArgs> defaultAutoShutdownProfile;

    public Output<AutoShutdownProfileArgs> getDefaultAutoShutdownProfile() {
        return this.defaultAutoShutdownProfile == null ? Output.empty() : this.defaultAutoShutdownProfile;
    }

    /**
     * The default lab connection profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    @InputImport(name="defaultConnectionProfile")
      private final @Nullable Output<ConnectionProfileArgs> defaultConnectionProfile;

    public Output<ConnectionProfileArgs> getDefaultConnectionProfile() {
        return this.defaultConnectionProfile == null ? Output.empty() : this.defaultConnectionProfile;
    }

    /**
     * The lab plan network profile. To enforce lab network policies they must be defined here and cannot be changed when there are existing labs associated with this lab plan.
     * 
     */
    @InputImport(name="defaultNetworkProfile")
      private final @Nullable Output<LabPlanNetworkProfileArgs> defaultNetworkProfile;

    public Output<LabPlanNetworkProfileArgs> getDefaultNetworkProfile() {
        return this.defaultNetworkProfile == null ? Output.empty() : this.defaultNetworkProfile;
    }

    /**
     * The name of the lab plan that uniquely identifies it within containing resource group. Used in resource URIs and in UI.
     * 
     */
    @InputImport(name="labPlanName")
      private final @Nullable Output<String> labPlanName;

    public Output<String> getLabPlanName() {
        return this.labPlanName == null ? Output.empty() : this.labPlanName;
    }

    /**
     * Base Url of the lms instance this lab plan can link lab rosters against.
     * 
     */
    @InputImport(name="linkedLmsInstance")
      private final @Nullable Output<String> linkedLmsInstance;

    public Output<String> getLinkedLmsInstance() {
        return this.linkedLmsInstance == null ? Output.empty() : this.linkedLmsInstance;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource ID of the Shared Image Gallery attached to this lab plan. When saving a lab template virtual machine image it will be persisted in this gallery. Shared images from the gallery can be made available to use when creating new labs.
     * 
     */
    @InputImport(name="sharedGalleryId")
      private final @Nullable Output<String> sharedGalleryId;

    public Output<String> getSharedGalleryId() {
        return this.sharedGalleryId == null ? Output.empty() : this.sharedGalleryId;
    }

    /**
     * Support contact information and instructions for users of the lab plan. This information is displayed to lab owners and virtual machine users for all labs in the lab plan.
     * 
     */
    @InputImport(name="supportInfo")
      private final @Nullable Output<SupportInfoArgs> supportInfo;

    public Output<SupportInfoArgs> getSupportInfo() {
        return this.supportInfo == null ? Output.empty() : this.supportInfo;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public LabPlanArgs(
        @Nullable Output<List<String>> allowedRegions,
        @Nullable Output<AutoShutdownProfileArgs> defaultAutoShutdownProfile,
        @Nullable Output<ConnectionProfileArgs> defaultConnectionProfile,
        @Nullable Output<LabPlanNetworkProfileArgs> defaultNetworkProfile,
        @Nullable Output<String> labPlanName,
        @Nullable Output<String> linkedLmsInstance,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> sharedGalleryId,
        @Nullable Output<SupportInfoArgs> supportInfo,
        @Nullable Output<Map<String,String>> tags) {
        this.allowedRegions = allowedRegions;
        this.defaultAutoShutdownProfile = defaultAutoShutdownProfile;
        this.defaultConnectionProfile = defaultConnectionProfile;
        this.defaultNetworkProfile = defaultNetworkProfile;
        this.labPlanName = labPlanName;
        this.linkedLmsInstance = linkedLmsInstance;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sharedGalleryId = sharedGalleryId;
        this.supportInfo = supportInfo;
        this.tags = tags;
    }

    private LabPlanArgs() {
        this.allowedRegions = Output.empty();
        this.defaultAutoShutdownProfile = Output.empty();
        this.defaultConnectionProfile = Output.empty();
        this.defaultNetworkProfile = Output.empty();
        this.labPlanName = Output.empty();
        this.linkedLmsInstance = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sharedGalleryId = Output.empty();
        this.supportInfo = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedRegions;
        private @Nullable Output<AutoShutdownProfileArgs> defaultAutoShutdownProfile;
        private @Nullable Output<ConnectionProfileArgs> defaultConnectionProfile;
        private @Nullable Output<LabPlanNetworkProfileArgs> defaultNetworkProfile;
        private @Nullable Output<String> labPlanName;
        private @Nullable Output<String> linkedLmsInstance;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sharedGalleryId;
        private @Nullable Output<SupportInfoArgs> supportInfo;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LabPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRegions = defaults.allowedRegions;
    	      this.defaultAutoShutdownProfile = defaults.defaultAutoShutdownProfile;
    	      this.defaultConnectionProfile = defaults.defaultConnectionProfile;
    	      this.defaultNetworkProfile = defaults.defaultNetworkProfile;
    	      this.labPlanName = defaults.labPlanName;
    	      this.linkedLmsInstance = defaults.linkedLmsInstance;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sharedGalleryId = defaults.sharedGalleryId;
    	      this.supportInfo = defaults.supportInfo;
    	      this.tags = defaults.tags;
        }

        public Builder allowedRegions(@Nullable Output<List<String>> allowedRegions) {
            this.allowedRegions = allowedRegions;
            return this;
        }

        public Builder allowedRegions(@Nullable List<String> allowedRegions) {
            this.allowedRegions = Output.ofNullable(allowedRegions);
            return this;
        }

        public Builder defaultAutoShutdownProfile(@Nullable Output<AutoShutdownProfileArgs> defaultAutoShutdownProfile) {
            this.defaultAutoShutdownProfile = defaultAutoShutdownProfile;
            return this;
        }

        public Builder defaultAutoShutdownProfile(@Nullable AutoShutdownProfileArgs defaultAutoShutdownProfile) {
            this.defaultAutoShutdownProfile = Output.ofNullable(defaultAutoShutdownProfile);
            return this;
        }

        public Builder defaultConnectionProfile(@Nullable Output<ConnectionProfileArgs> defaultConnectionProfile) {
            this.defaultConnectionProfile = defaultConnectionProfile;
            return this;
        }

        public Builder defaultConnectionProfile(@Nullable ConnectionProfileArgs defaultConnectionProfile) {
            this.defaultConnectionProfile = Output.ofNullable(defaultConnectionProfile);
            return this;
        }

        public Builder defaultNetworkProfile(@Nullable Output<LabPlanNetworkProfileArgs> defaultNetworkProfile) {
            this.defaultNetworkProfile = defaultNetworkProfile;
            return this;
        }

        public Builder defaultNetworkProfile(@Nullable LabPlanNetworkProfileArgs defaultNetworkProfile) {
            this.defaultNetworkProfile = Output.ofNullable(defaultNetworkProfile);
            return this;
        }

        public Builder labPlanName(@Nullable Output<String> labPlanName) {
            this.labPlanName = labPlanName;
            return this;
        }

        public Builder labPlanName(@Nullable String labPlanName) {
            this.labPlanName = Output.ofNullable(labPlanName);
            return this;
        }

        public Builder linkedLmsInstance(@Nullable Output<String> linkedLmsInstance) {
            this.linkedLmsInstance = linkedLmsInstance;
            return this;
        }

        public Builder linkedLmsInstance(@Nullable String linkedLmsInstance) {
            this.linkedLmsInstance = Output.ofNullable(linkedLmsInstance);
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

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sharedGalleryId(@Nullable Output<String> sharedGalleryId) {
            this.sharedGalleryId = sharedGalleryId;
            return this;
        }

        public Builder sharedGalleryId(@Nullable String sharedGalleryId) {
            this.sharedGalleryId = Output.ofNullable(sharedGalleryId);
            return this;
        }

        public Builder supportInfo(@Nullable Output<SupportInfoArgs> supportInfo) {
            this.supportInfo = supportInfo;
            return this;
        }

        public Builder supportInfo(@Nullable SupportInfoArgs supportInfo) {
            this.supportInfo = Output.ofNullable(supportInfo);
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
        public LabPlanArgs build() {
            return new LabPlanArgs(allowedRegions, defaultAutoShutdownProfile, defaultConnectionProfile, defaultNetworkProfile, labPlanName, linkedLmsInstance, location, resourceGroupName, sharedGalleryId, supportInfo, tags);
        }
    }
}
