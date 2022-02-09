// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterAgentPoolProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterAuthProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterMasterPoolProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.OpenShiftRouterProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.PurchasePlanResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOpenShiftManagedClusterResult {
    private final @Nullable List<OpenShiftManagedClusterAgentPoolProfileResponse> agentPoolProfiles;
    private final @Nullable OpenShiftManagedClusterAuthProfileResponse authProfile;
    private final String clusterVersion;
    private final String fqdn;
    private final String id;
    private final String location;
    private final @Nullable OpenShiftManagedClusterMasterPoolProfileResponse masterPoolProfile;
    private final String name;
    private final @Nullable NetworkProfileResponse networkProfile;
    private final String openShiftVersion;
    private final @Nullable PurchasePlanResponse plan;
    private final String provisioningState;
    private final String publicHostname;
    private final @Nullable List<OpenShiftRouterProfileResponse> routerProfiles;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"agentPoolProfiles","authProfile","clusterVersion","fqdn","id","location","masterPoolProfile","name","networkProfile","openShiftVersion","plan","provisioningState","publicHostname","routerProfiles","tags","type"})
    private GetOpenShiftManagedClusterResult(
        @Nullable List<OpenShiftManagedClusterAgentPoolProfileResponse> agentPoolProfiles,
        @Nullable OpenShiftManagedClusterAuthProfileResponse authProfile,
        String clusterVersion,
        String fqdn,
        String id,
        String location,
        @Nullable OpenShiftManagedClusterMasterPoolProfileResponse masterPoolProfile,
        String name,
        @Nullable NetworkProfileResponse networkProfile,
        String openShiftVersion,
        @Nullable PurchasePlanResponse plan,
        String provisioningState,
        String publicHostname,
        @Nullable List<OpenShiftRouterProfileResponse> routerProfiles,
        @Nullable Map<String,String> tags,
        String type) {
        this.agentPoolProfiles = agentPoolProfiles;
        this.authProfile = authProfile;
        this.clusterVersion = Objects.requireNonNull(clusterVersion);
        this.fqdn = Objects.requireNonNull(fqdn);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.masterPoolProfile = masterPoolProfile;
        this.name = Objects.requireNonNull(name);
        this.networkProfile = networkProfile;
        this.openShiftVersion = Objects.requireNonNull(openShiftVersion);
        this.plan = plan;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicHostname = Objects.requireNonNull(publicHostname);
        this.routerProfiles = routerProfiles;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public List<OpenShiftManagedClusterAgentPoolProfileResponse> getAgentPoolProfiles() {
        return this.agentPoolProfiles == null ? List.of() : this.agentPoolProfiles;
    }
    public Optional<OpenShiftManagedClusterAuthProfileResponse> getAuthProfile() {
        return Optional.ofNullable(this.authProfile);
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }
    public String getFqdn() {
        return this.fqdn;
    }
    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public Optional<OpenShiftManagedClusterMasterPoolProfileResponse> getMasterPoolProfile() {
        return Optional.ofNullable(this.masterPoolProfile);
    }
    public String getName() {
        return this.name;
    }
    public Optional<NetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    public String getOpenShiftVersion() {
        return this.openShiftVersion;
    }
    public Optional<PurchasePlanResponse> getPlan() {
        return Optional.ofNullable(this.plan);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getPublicHostname() {
        return this.publicHostname;
    }
    public List<OpenShiftRouterProfileResponse> getRouterProfiles() {
        return this.routerProfiles == null ? List.of() : this.routerProfiles;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenShiftManagedClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OpenShiftManagedClusterAgentPoolProfileResponse> agentPoolProfiles;
        private @Nullable OpenShiftManagedClusterAuthProfileResponse authProfile;
        private String clusterVersion;
        private String fqdn;
        private String id;
        private String location;
        private @Nullable OpenShiftManagedClusterMasterPoolProfileResponse masterPoolProfile;
        private String name;
        private @Nullable NetworkProfileResponse networkProfile;
        private String openShiftVersion;
        private @Nullable PurchasePlanResponse plan;
        private String provisioningState;
        private String publicHostname;
        private @Nullable List<OpenShiftRouterProfileResponse> routerProfiles;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOpenShiftManagedClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolProfiles = defaults.agentPoolProfiles;
    	      this.authProfile = defaults.authProfile;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.masterPoolProfile = defaults.masterPoolProfile;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.openShiftVersion = defaults.openShiftVersion;
    	      this.plan = defaults.plan;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicHostname = defaults.publicHostname;
    	      this.routerProfiles = defaults.routerProfiles;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAgentPoolProfiles(@Nullable List<OpenShiftManagedClusterAgentPoolProfileResponse> agentPoolProfiles) {
            this.agentPoolProfiles = agentPoolProfiles;
            return this;
        }

        public Builder setAuthProfile(@Nullable OpenShiftManagedClusterAuthProfileResponse authProfile) {
            this.authProfile = authProfile;
            return this;
        }

        public Builder setClusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMasterPoolProfile(@Nullable OpenShiftManagedClusterMasterPoolProfileResponse masterPoolProfile) {
            this.masterPoolProfile = masterPoolProfile;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setOpenShiftVersion(String openShiftVersion) {
            this.openShiftVersion = Objects.requireNonNull(openShiftVersion);
            return this;
        }

        public Builder setPlan(@Nullable PurchasePlanResponse plan) {
            this.plan = plan;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicHostname(String publicHostname) {
            this.publicHostname = Objects.requireNonNull(publicHostname);
            return this;
        }

        public Builder setRouterProfiles(@Nullable List<OpenShiftRouterProfileResponse> routerProfiles) {
            this.routerProfiles = routerProfiles;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetOpenShiftManagedClusterResult build() {
            return new GetOpenShiftManagedClusterResult(agentPoolProfiles, authProfile, clusterVersion, fqdn, id, location, masterPoolProfile, name, networkProfile, openShiftVersion, plan, provisioningState, publicHostname, routerProfiles, tags, type);
        }
    }
}
