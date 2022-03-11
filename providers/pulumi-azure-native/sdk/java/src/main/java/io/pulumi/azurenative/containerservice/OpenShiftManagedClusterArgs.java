// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.containerservice.inputs.NetworkProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterAgentPoolProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterAuthProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterMasterPoolProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.OpenShiftRouterProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.PurchasePlanArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenShiftManagedClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenShiftManagedClusterArgs Empty = new OpenShiftManagedClusterArgs();

    /**
     * Configuration of OpenShift cluster VMs.
     * 
     */
    @InputImport(name="agentPoolProfiles")
      private final @Nullable Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles;

    public Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> getAgentPoolProfiles() {
        return this.agentPoolProfiles == null ? Output.empty() : this.agentPoolProfiles;
    }

    /**
     * Configures OpenShift authentication.
     * 
     */
    @InputImport(name="authProfile")
      private final @Nullable Output<OpenShiftManagedClusterAuthProfileArgs> authProfile;

    public Output<OpenShiftManagedClusterAuthProfileArgs> getAuthProfile() {
        return this.authProfile == null ? Output.empty() : this.authProfile;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Configuration for OpenShift master VMs.
     * 
     */
    @InputImport(name="masterPoolProfile")
      private final @Nullable Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile;

    public Output<OpenShiftManagedClusterMasterPoolProfileArgs> getMasterPoolProfile() {
        return this.masterPoolProfile == null ? Output.empty() : this.masterPoolProfile;
    }

    /**
     * Configuration for OpenShift networking.
     * 
     */
    @InputImport(name="networkProfile")
      private final @Nullable Output<NetworkProfileArgs> networkProfile;

    public Output<NetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Output.empty() : this.networkProfile;
    }

    /**
     * Version of OpenShift specified when creating the cluster.
     * 
     */
    @InputImport(name="openShiftVersion", required=true)
      private final Output<String> openShiftVersion;

    public Output<String> getOpenShiftVersion() {
        return this.openShiftVersion;
    }

    /**
     * Define the resource plan as required by ARM for billing purposes
     * 
     */
    @InputImport(name="plan")
      private final @Nullable Output<PurchasePlanArgs> plan;

    public Output<PurchasePlanArgs> getPlan() {
        return this.plan == null ? Output.empty() : this.plan;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the OpenShift managed cluster resource.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Output.empty() : this.resourceName;
    }

    /**
     * Configuration for OpenShift router(s).
     * 
     */
    @InputImport(name="routerProfiles")
      private final @Nullable Output<List<OpenShiftRouterProfileArgs>> routerProfiles;

    public Output<List<OpenShiftRouterProfileArgs>> getRouterProfiles() {
        return this.routerProfiles == null ? Output.empty() : this.routerProfiles;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public OpenShiftManagedClusterArgs(
        @Nullable Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles,
        @Nullable Output<OpenShiftManagedClusterAuthProfileArgs> authProfile,
        @Nullable Output<String> location,
        @Nullable Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile,
        @Nullable Output<NetworkProfileArgs> networkProfile,
        Output<String> openShiftVersion,
        @Nullable Output<PurchasePlanArgs> plan,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<List<OpenShiftRouterProfileArgs>> routerProfiles,
        @Nullable Output<Map<String,String>> tags) {
        this.agentPoolProfiles = agentPoolProfiles;
        this.authProfile = authProfile;
        this.location = location;
        this.masterPoolProfile = masterPoolProfile;
        this.networkProfile = networkProfile;
        this.openShiftVersion = Objects.requireNonNull(openShiftVersion, "expected parameter 'openShiftVersion' to be non-null");
        this.plan = plan;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.routerProfiles = routerProfiles;
        this.tags = tags;
    }

    private OpenShiftManagedClusterArgs() {
        this.agentPoolProfiles = Output.empty();
        this.authProfile = Output.empty();
        this.location = Output.empty();
        this.masterPoolProfile = Output.empty();
        this.networkProfile = Output.empty();
        this.openShiftVersion = Output.empty();
        this.plan = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
        this.routerProfiles = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles;
        private @Nullable Output<OpenShiftManagedClusterAuthProfileArgs> authProfile;
        private @Nullable Output<String> location;
        private @Nullable Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile;
        private @Nullable Output<NetworkProfileArgs> networkProfile;
        private Output<String> openShiftVersion;
        private @Nullable Output<PurchasePlanArgs> plan;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<List<OpenShiftRouterProfileArgs>> routerProfiles;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolProfiles = defaults.agentPoolProfiles;
    	      this.authProfile = defaults.authProfile;
    	      this.location = defaults.location;
    	      this.masterPoolProfile = defaults.masterPoolProfile;
    	      this.networkProfile = defaults.networkProfile;
    	      this.openShiftVersion = defaults.openShiftVersion;
    	      this.plan = defaults.plan;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.routerProfiles = defaults.routerProfiles;
    	      this.tags = defaults.tags;
        }

        public Builder agentPoolProfiles(@Nullable Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles) {
            this.agentPoolProfiles = agentPoolProfiles;
            return this;
        }

        public Builder agentPoolProfiles(@Nullable List<OpenShiftManagedClusterAgentPoolProfileArgs> agentPoolProfiles) {
            this.agentPoolProfiles = Output.ofNullable(agentPoolProfiles);
            return this;
        }

        public Builder authProfile(@Nullable Output<OpenShiftManagedClusterAuthProfileArgs> authProfile) {
            this.authProfile = authProfile;
            return this;
        }

        public Builder authProfile(@Nullable OpenShiftManagedClusterAuthProfileArgs authProfile) {
            this.authProfile = Output.ofNullable(authProfile);
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

        public Builder masterPoolProfile(@Nullable Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile) {
            this.masterPoolProfile = masterPoolProfile;
            return this;
        }

        public Builder masterPoolProfile(@Nullable OpenShiftManagedClusterMasterPoolProfileArgs masterPoolProfile) {
            this.masterPoolProfile = Output.ofNullable(masterPoolProfile);
            return this;
        }

        public Builder networkProfile(@Nullable Output<NetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder networkProfile(@Nullable NetworkProfileArgs networkProfile) {
            this.networkProfile = Output.ofNullable(networkProfile);
            return this;
        }

        public Builder openShiftVersion(Output<String> openShiftVersion) {
            this.openShiftVersion = Objects.requireNonNull(openShiftVersion);
            return this;
        }

        public Builder openShiftVersion(String openShiftVersion) {
            this.openShiftVersion = Output.of(Objects.requireNonNull(openShiftVersion));
            return this;
        }

        public Builder plan(@Nullable Output<PurchasePlanArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder plan(@Nullable PurchasePlanArgs plan) {
            this.plan = Output.ofNullable(plan);
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

        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Output.ofNullable(resourceName);
            return this;
        }

        public Builder routerProfiles(@Nullable Output<List<OpenShiftRouterProfileArgs>> routerProfiles) {
            this.routerProfiles = routerProfiles;
            return this;
        }

        public Builder routerProfiles(@Nullable List<OpenShiftRouterProfileArgs> routerProfiles) {
            this.routerProfiles = Output.ofNullable(routerProfiles);
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
        public OpenShiftManagedClusterArgs build() {
            return new OpenShiftManagedClusterArgs(agentPoolProfiles, authProfile, location, masterPoolProfile, networkProfile, openShiftVersion, plan, resourceGroupName, resourceName, routerProfiles, tags);
        }
    }
}
