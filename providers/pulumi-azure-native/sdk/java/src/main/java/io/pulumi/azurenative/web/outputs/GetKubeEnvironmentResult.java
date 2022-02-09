// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.AppLogsConfigurationResponse;
import io.pulumi.azurenative.web.outputs.ArcConfigurationResponse;
import io.pulumi.azurenative.web.outputs.ExtendedLocationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKubeEnvironmentResult {
    private final @Nullable String aksResourceID;
    private final @Nullable AppLogsConfigurationResponse appLogsConfiguration;
    private final @Nullable ArcConfigurationResponse arcConfiguration;
    private final String defaultDomain;
    private final String deploymentErrors;
    private final @Nullable ExtendedLocationResponse extendedLocation;
    private final String id;
    private final @Nullable Boolean internalLoadBalancerEnabled;
    private final @Nullable String kind;
    private final String location;
    private final String name;
    private final String provisioningState;
    private final @Nullable String staticIp;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"aksResourceID","appLogsConfiguration","arcConfiguration","defaultDomain","deploymentErrors","extendedLocation","id","internalLoadBalancerEnabled","kind","location","name","provisioningState","staticIp","tags","type"})
    private GetKubeEnvironmentResult(
        @Nullable String aksResourceID,
        @Nullable AppLogsConfigurationResponse appLogsConfiguration,
        @Nullable ArcConfigurationResponse arcConfiguration,
        String defaultDomain,
        String deploymentErrors,
        @Nullable ExtendedLocationResponse extendedLocation,
        String id,
        @Nullable Boolean internalLoadBalancerEnabled,
        @Nullable String kind,
        String location,
        String name,
        String provisioningState,
        @Nullable String staticIp,
        @Nullable Map<String,String> tags,
        String type) {
        this.aksResourceID = aksResourceID;
        this.appLogsConfiguration = appLogsConfiguration;
        this.arcConfiguration = arcConfiguration;
        this.defaultDomain = Objects.requireNonNull(defaultDomain);
        this.deploymentErrors = Objects.requireNonNull(deploymentErrors);
        this.extendedLocation = extendedLocation;
        this.id = Objects.requireNonNull(id);
        this.internalLoadBalancerEnabled = internalLoadBalancerEnabled;
        this.kind = kind;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.staticIp = staticIp;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAksResourceID() {
        return Optional.ofNullable(this.aksResourceID);
    }
    public Optional<AppLogsConfigurationResponse> getAppLogsConfiguration() {
        return Optional.ofNullable(this.appLogsConfiguration);
    }
    public Optional<ArcConfigurationResponse> getArcConfiguration() {
        return Optional.ofNullable(this.arcConfiguration);
    }
    public String getDefaultDomain() {
        return this.defaultDomain;
    }
    public String getDeploymentErrors() {
        return this.deploymentErrors;
    }
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    public String getId() {
        return this.id;
    }
    public Optional<Boolean> getInternalLoadBalancerEnabled() {
        return Optional.ofNullable(this.internalLoadBalancerEnabled);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getStaticIp() {
        return Optional.ofNullable(this.staticIp);
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

    public static Builder builder(GetKubeEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aksResourceID;
        private @Nullable AppLogsConfigurationResponse appLogsConfiguration;
        private @Nullable ArcConfigurationResponse arcConfiguration;
        private String defaultDomain;
        private String deploymentErrors;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private String id;
        private @Nullable Boolean internalLoadBalancerEnabled;
        private @Nullable String kind;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable String staticIp;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKubeEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aksResourceID = defaults.aksResourceID;
    	      this.appLogsConfiguration = defaults.appLogsConfiguration;
    	      this.arcConfiguration = defaults.arcConfiguration;
    	      this.defaultDomain = defaults.defaultDomain;
    	      this.deploymentErrors = defaults.deploymentErrors;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.internalLoadBalancerEnabled = defaults.internalLoadBalancerEnabled;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.staticIp = defaults.staticIp;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAksResourceID(@Nullable String aksResourceID) {
            this.aksResourceID = aksResourceID;
            return this;
        }

        public Builder setAppLogsConfiguration(@Nullable AppLogsConfigurationResponse appLogsConfiguration) {
            this.appLogsConfiguration = appLogsConfiguration;
            return this;
        }

        public Builder setArcConfiguration(@Nullable ArcConfigurationResponse arcConfiguration) {
            this.arcConfiguration = arcConfiguration;
            return this;
        }

        public Builder setDefaultDomain(String defaultDomain) {
            this.defaultDomain = Objects.requireNonNull(defaultDomain);
            return this;
        }

        public Builder setDeploymentErrors(String deploymentErrors) {
            this.deploymentErrors = Objects.requireNonNull(deploymentErrors);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInternalLoadBalancerEnabled(@Nullable Boolean internalLoadBalancerEnabled) {
            this.internalLoadBalancerEnabled = internalLoadBalancerEnabled;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStaticIp(@Nullable String staticIp) {
            this.staticIp = staticIp;
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

        public GetKubeEnvironmentResult build() {
            return new GetKubeEnvironmentResult(aksResourceID, appLogsConfiguration, arcConfiguration, defaultDomain, deploymentErrors, extendedLocation, id, internalLoadBalancerEnabled, kind, location, name, provisioningState, staticIp, tags, type);
        }
    }
}
