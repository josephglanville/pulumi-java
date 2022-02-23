// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.HostingEnvironmentProfileArgs;
import io.pulumi.azurenative.web.inputs.KubeEnvironmentProfileArgs;
import io.pulumi.azurenative.web.inputs.SkuDescriptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppServicePlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppServicePlanArgs Empty = new AppServicePlanArgs();

    /**
     * The time when the server farm free offer expires.
     * 
     */
    @InputImport(name="freeOfferExpirationTime")
      private final @Nullable Input<String> freeOfferExpirationTime;

    public Input<String> getFreeOfferExpirationTime() {
        return this.freeOfferExpirationTime == null ? Input.empty() : this.freeOfferExpirationTime;
    }

    /**
     * Specification for the App Service Environment to use for the App Service plan.
     * 
     */
    @InputImport(name="hostingEnvironmentProfile")
      private final @Nullable Input<HostingEnvironmentProfileArgs> hostingEnvironmentProfile;

    public Input<HostingEnvironmentProfileArgs> getHostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile == null ? Input.empty() : this.hostingEnvironmentProfile;
    }

    /**
     * If Hyper-V container app service plan <code>true</code>, <code>false</code> otherwise.
     * 
     */
    @InputImport(name="hyperV")
      private final @Nullable Input<Boolean> hyperV;

    public Input<Boolean> getHyperV() {
        return this.hyperV == null ? Input.empty() : this.hyperV;
    }

    /**
     * If <code>true</code>, this App Service Plan owns spot instances.
     * 
     */
    @InputImport(name="isSpot")
      private final @Nullable Input<Boolean> isSpot;

    public Input<Boolean> getIsSpot() {
        return this.isSpot == null ? Input.empty() : this.isSpot;
    }

    /**
     * Obsolete: If Hyper-V container app service plan <code>true</code>, <code>false</code> otherwise.
     * 
     */
    @InputImport(name="isXenon")
      private final @Nullable Input<Boolean> isXenon;

    public Input<Boolean> getIsXenon() {
        return this.isXenon == null ? Input.empty() : this.isXenon;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Specification for the Kubernetes Environment to use for the App Service plan.
     * 
     */
    @InputImport(name="kubeEnvironmentProfile")
      private final @Nullable Input<KubeEnvironmentProfileArgs> kubeEnvironmentProfile;

    public Input<KubeEnvironmentProfileArgs> getKubeEnvironmentProfile() {
        return this.kubeEnvironmentProfile == null ? Input.empty() : this.kubeEnvironmentProfile;
    }

    /**
     * Resource Location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan
     * 
     */
    @InputImport(name="maximumElasticWorkerCount")
      private final @Nullable Input<Integer> maximumElasticWorkerCount;

    public Input<Integer> getMaximumElasticWorkerCount() {
        return this.maximumElasticWorkerCount == null ? Input.empty() : this.maximumElasticWorkerCount;
    }

    /**
     * Name of the App Service plan.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * If <code>true</code>, apps assigned to this App Service plan can be scaled independently.
     * If <code>false</code>, apps assigned to this App Service plan will scale to all instances of the plan.
     * 
     */
    @InputImport(name="perSiteScaling")
      private final @Nullable Input<Boolean> perSiteScaling;

    public Input<Boolean> getPerSiteScaling() {
        return this.perSiteScaling == null ? Input.empty() : this.perSiteScaling;
    }

    /**
     * If Linux app service plan <code>true</code>, <code>false</code> otherwise.
     * 
     */
    @InputImport(name="reserved")
      private final @Nullable Input<Boolean> reserved;

    public Input<Boolean> getReserved() {
        return this.reserved == null ? Input.empty() : this.reserved;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Description of a SKU for a scalable resource.
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Input<SkuDescriptionArgs> sku;

    public Input<SkuDescriptionArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * The time when the server farm expires. Valid only if it is a spot server farm.
     * 
     */
    @InputImport(name="spotExpirationTime")
      private final @Nullable Input<String> spotExpirationTime;

    public Input<String> getSpotExpirationTime() {
        return this.spotExpirationTime == null ? Input.empty() : this.spotExpirationTime;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Scaling worker count.
     * 
     */
    @InputImport(name="targetWorkerCount")
      private final @Nullable Input<Integer> targetWorkerCount;

    public Input<Integer> getTargetWorkerCount() {
        return this.targetWorkerCount == null ? Input.empty() : this.targetWorkerCount;
    }

    /**
     * Scaling worker size ID.
     * 
     */
    @InputImport(name="targetWorkerSizeId")
      private final @Nullable Input<Integer> targetWorkerSizeId;

    public Input<Integer> getTargetWorkerSizeId() {
        return this.targetWorkerSizeId == null ? Input.empty() : this.targetWorkerSizeId;
    }

    /**
     * Target worker tier assigned to the App Service plan.
     * 
     */
    @InputImport(name="workerTierName")
      private final @Nullable Input<String> workerTierName;

    public Input<String> getWorkerTierName() {
        return this.workerTierName == null ? Input.empty() : this.workerTierName;
    }

    public AppServicePlanArgs(
        @Nullable Input<String> freeOfferExpirationTime,
        @Nullable Input<HostingEnvironmentProfileArgs> hostingEnvironmentProfile,
        @Nullable Input<Boolean> hyperV,
        @Nullable Input<Boolean> isSpot,
        @Nullable Input<Boolean> isXenon,
        @Nullable Input<String> kind,
        @Nullable Input<KubeEnvironmentProfileArgs> kubeEnvironmentProfile,
        @Nullable Input<String> location,
        @Nullable Input<Integer> maximumElasticWorkerCount,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> perSiteScaling,
        @Nullable Input<Boolean> reserved,
        Input<String> resourceGroupName,
        @Nullable Input<SkuDescriptionArgs> sku,
        @Nullable Input<String> spotExpirationTime,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Integer> targetWorkerCount,
        @Nullable Input<Integer> targetWorkerSizeId,
        @Nullable Input<String> workerTierName) {
        this.freeOfferExpirationTime = freeOfferExpirationTime;
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        this.hyperV = hyperV == null ? Input.ofNullable(false) : hyperV;
        this.isSpot = isSpot;
        this.isXenon = isXenon == null ? Input.ofNullable(false) : isXenon;
        this.kind = kind;
        this.kubeEnvironmentProfile = kubeEnvironmentProfile;
        this.location = location;
        this.maximumElasticWorkerCount = maximumElasticWorkerCount;
        this.name = name;
        this.perSiteScaling = perSiteScaling == null ? Input.ofNullable(false) : perSiteScaling;
        this.reserved = reserved == null ? Input.ofNullable(false) : reserved;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.spotExpirationTime = spotExpirationTime;
        this.tags = tags;
        this.targetWorkerCount = targetWorkerCount;
        this.targetWorkerSizeId = targetWorkerSizeId;
        this.workerTierName = workerTierName;
    }

    private AppServicePlanArgs() {
        this.freeOfferExpirationTime = Input.empty();
        this.hostingEnvironmentProfile = Input.empty();
        this.hyperV = Input.empty();
        this.isSpot = Input.empty();
        this.isXenon = Input.empty();
        this.kind = Input.empty();
        this.kubeEnvironmentProfile = Input.empty();
        this.location = Input.empty();
        this.maximumElasticWorkerCount = Input.empty();
        this.name = Input.empty();
        this.perSiteScaling = Input.empty();
        this.reserved = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.spotExpirationTime = Input.empty();
        this.tags = Input.empty();
        this.targetWorkerCount = Input.empty();
        this.targetWorkerSizeId = Input.empty();
        this.workerTierName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServicePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> freeOfferExpirationTime;
        private @Nullable Input<HostingEnvironmentProfileArgs> hostingEnvironmentProfile;
        private @Nullable Input<Boolean> hyperV;
        private @Nullable Input<Boolean> isSpot;
        private @Nullable Input<Boolean> isXenon;
        private @Nullable Input<String> kind;
        private @Nullable Input<KubeEnvironmentProfileArgs> kubeEnvironmentProfile;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> maximumElasticWorkerCount;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> perSiteScaling;
        private @Nullable Input<Boolean> reserved;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuDescriptionArgs> sku;
        private @Nullable Input<String> spotExpirationTime;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Integer> targetWorkerCount;
        private @Nullable Input<Integer> targetWorkerSizeId;
        private @Nullable Input<String> workerTierName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServicePlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.freeOfferExpirationTime = defaults.freeOfferExpirationTime;
    	      this.hostingEnvironmentProfile = defaults.hostingEnvironmentProfile;
    	      this.hyperV = defaults.hyperV;
    	      this.isSpot = defaults.isSpot;
    	      this.isXenon = defaults.isXenon;
    	      this.kind = defaults.kind;
    	      this.kubeEnvironmentProfile = defaults.kubeEnvironmentProfile;
    	      this.location = defaults.location;
    	      this.maximumElasticWorkerCount = defaults.maximumElasticWorkerCount;
    	      this.name = defaults.name;
    	      this.perSiteScaling = defaults.perSiteScaling;
    	      this.reserved = defaults.reserved;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.spotExpirationTime = defaults.spotExpirationTime;
    	      this.tags = defaults.tags;
    	      this.targetWorkerCount = defaults.targetWorkerCount;
    	      this.targetWorkerSizeId = defaults.targetWorkerSizeId;
    	      this.workerTierName = defaults.workerTierName;
        }

        public Builder setFreeOfferExpirationTime(@Nullable Input<String> freeOfferExpirationTime) {
            this.freeOfferExpirationTime = freeOfferExpirationTime;
            return this;
        }

        public Builder setFreeOfferExpirationTime(@Nullable String freeOfferExpirationTime) {
            this.freeOfferExpirationTime = Input.ofNullable(freeOfferExpirationTime);
            return this;
        }

        public Builder setHostingEnvironmentProfile(@Nullable Input<HostingEnvironmentProfileArgs> hostingEnvironmentProfile) {
            this.hostingEnvironmentProfile = hostingEnvironmentProfile;
            return this;
        }

        public Builder setHostingEnvironmentProfile(@Nullable HostingEnvironmentProfileArgs hostingEnvironmentProfile) {
            this.hostingEnvironmentProfile = Input.ofNullable(hostingEnvironmentProfile);
            return this;
        }

        public Builder setHyperV(@Nullable Input<Boolean> hyperV) {
            this.hyperV = hyperV;
            return this;
        }

        public Builder setHyperV(@Nullable Boolean hyperV) {
            this.hyperV = Input.ofNullable(hyperV);
            return this;
        }

        public Builder setIsSpot(@Nullable Input<Boolean> isSpot) {
            this.isSpot = isSpot;
            return this;
        }

        public Builder setIsSpot(@Nullable Boolean isSpot) {
            this.isSpot = Input.ofNullable(isSpot);
            return this;
        }

        public Builder setIsXenon(@Nullable Input<Boolean> isXenon) {
            this.isXenon = isXenon;
            return this;
        }

        public Builder setIsXenon(@Nullable Boolean isXenon) {
            this.isXenon = Input.ofNullable(isXenon);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setKubeEnvironmentProfile(@Nullable Input<KubeEnvironmentProfileArgs> kubeEnvironmentProfile) {
            this.kubeEnvironmentProfile = kubeEnvironmentProfile;
            return this;
        }

        public Builder setKubeEnvironmentProfile(@Nullable KubeEnvironmentProfileArgs kubeEnvironmentProfile) {
            this.kubeEnvironmentProfile = Input.ofNullable(kubeEnvironmentProfile);
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

        public Builder setMaximumElasticWorkerCount(@Nullable Input<Integer> maximumElasticWorkerCount) {
            this.maximumElasticWorkerCount = maximumElasticWorkerCount;
            return this;
        }

        public Builder setMaximumElasticWorkerCount(@Nullable Integer maximumElasticWorkerCount) {
            this.maximumElasticWorkerCount = Input.ofNullable(maximumElasticWorkerCount);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPerSiteScaling(@Nullable Input<Boolean> perSiteScaling) {
            this.perSiteScaling = perSiteScaling;
            return this;
        }

        public Builder setPerSiteScaling(@Nullable Boolean perSiteScaling) {
            this.perSiteScaling = Input.ofNullable(perSiteScaling);
            return this;
        }

        public Builder setReserved(@Nullable Input<Boolean> reserved) {
            this.reserved = reserved;
            return this;
        }

        public Builder setReserved(@Nullable Boolean reserved) {
            this.reserved = Input.ofNullable(reserved);
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

        public Builder setSku(@Nullable Input<SkuDescriptionArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuDescriptionArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setSpotExpirationTime(@Nullable Input<String> spotExpirationTime) {
            this.spotExpirationTime = spotExpirationTime;
            return this;
        }

        public Builder setSpotExpirationTime(@Nullable String spotExpirationTime) {
            this.spotExpirationTime = Input.ofNullable(spotExpirationTime);
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

        public Builder setTargetWorkerCount(@Nullable Input<Integer> targetWorkerCount) {
            this.targetWorkerCount = targetWorkerCount;
            return this;
        }

        public Builder setTargetWorkerCount(@Nullable Integer targetWorkerCount) {
            this.targetWorkerCount = Input.ofNullable(targetWorkerCount);
            return this;
        }

        public Builder setTargetWorkerSizeId(@Nullable Input<Integer> targetWorkerSizeId) {
            this.targetWorkerSizeId = targetWorkerSizeId;
            return this;
        }

        public Builder setTargetWorkerSizeId(@Nullable Integer targetWorkerSizeId) {
            this.targetWorkerSizeId = Input.ofNullable(targetWorkerSizeId);
            return this;
        }

        public Builder setWorkerTierName(@Nullable Input<String> workerTierName) {
            this.workerTierName = workerTierName;
            return this;
        }

        public Builder setWorkerTierName(@Nullable String workerTierName) {
            this.workerTierName = Input.ofNullable(workerTierName);
            return this;
        }
        public AppServicePlanArgs build() {
            return new AppServicePlanArgs(freeOfferExpirationTime, hostingEnvironmentProfile, hyperV, isSpot, isXenon, kind, kubeEnvironmentProfile, location, maximumElasticWorkerCount, name, perSiteScaling, reserved, resourceGroupName, sku, spotExpirationTime, tags, targetWorkerCount, targetWorkerSizeId, workerTierName);
        }
    }
}
