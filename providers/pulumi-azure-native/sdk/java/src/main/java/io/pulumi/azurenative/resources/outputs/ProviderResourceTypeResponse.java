// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.AliasResponse;
import io.pulumi.azurenative.resources.outputs.ApiProfileResponse;
import io.pulumi.azurenative.resources.outputs.ProviderExtendedLocationResponse;
import io.pulumi.azurenative.resources.outputs.ZoneMappingResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderResourceTypeResponse {
    private final @Nullable List<AliasResponse> aliases;
    private final List<ApiProfileResponse> apiProfiles;
    private final @Nullable List<String> apiVersions;
    private final @Nullable String capabilities;
    private final String defaultApiVersion;
    private final @Nullable List<ProviderExtendedLocationResponse> locationMappings;
    private final @Nullable List<String> locations;
    private final @Nullable Map<String,String> properties;
    private final @Nullable String resourceType;
    private final @Nullable List<ZoneMappingResponse> zoneMappings;

    @OutputCustomType.Constructor({"aliases","apiProfiles","apiVersions","capabilities","defaultApiVersion","locationMappings","locations","properties","resourceType","zoneMappings"})
    private ProviderResourceTypeResponse(
        @Nullable List<AliasResponse> aliases,
        List<ApiProfileResponse> apiProfiles,
        @Nullable List<String> apiVersions,
        @Nullable String capabilities,
        String defaultApiVersion,
        @Nullable List<ProviderExtendedLocationResponse> locationMappings,
        @Nullable List<String> locations,
        @Nullable Map<String,String> properties,
        @Nullable String resourceType,
        @Nullable List<ZoneMappingResponse> zoneMappings) {
        this.aliases = aliases;
        this.apiProfiles = Objects.requireNonNull(apiProfiles);
        this.apiVersions = apiVersions;
        this.capabilities = capabilities;
        this.defaultApiVersion = Objects.requireNonNull(defaultApiVersion);
        this.locationMappings = locationMappings;
        this.locations = locations;
        this.properties = properties;
        this.resourceType = resourceType;
        this.zoneMappings = zoneMappings;
    }

    public List<AliasResponse> getAliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }
    public List<ApiProfileResponse> getApiProfiles() {
        return this.apiProfiles;
    }
    public List<String> getApiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }
    public Optional<String> getCapabilities() {
        return Optional.ofNullable(this.capabilities);
    }
    public String getDefaultApiVersion() {
        return this.defaultApiVersion;
    }
    public List<ProviderExtendedLocationResponse> getLocationMappings() {
        return this.locationMappings == null ? List.of() : this.locationMappings;
    }
    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    public List<ZoneMappingResponse> getZoneMappings() {
        return this.zoneMappings == null ? List.of() : this.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderResourceTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AliasResponse> aliases;
        private List<ApiProfileResponse> apiProfiles;
        private @Nullable List<String> apiVersions;
        private @Nullable String capabilities;
        private String defaultApiVersion;
        private @Nullable List<ProviderExtendedLocationResponse> locationMappings;
        private @Nullable List<String> locations;
        private @Nullable Map<String,String> properties;
        private @Nullable String resourceType;
        private @Nullable List<ZoneMappingResponse> zoneMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderResourceTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.apiProfiles = defaults.apiProfiles;
    	      this.apiVersions = defaults.apiVersions;
    	      this.capabilities = defaults.capabilities;
    	      this.defaultApiVersion = defaults.defaultApiVersion;
    	      this.locationMappings = defaults.locationMappings;
    	      this.locations = defaults.locations;
    	      this.properties = defaults.properties;
    	      this.resourceType = defaults.resourceType;
    	      this.zoneMappings = defaults.zoneMappings;
        }

        public Builder setAliases(@Nullable List<AliasResponse> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder setApiProfiles(List<ApiProfileResponse> apiProfiles) {
            this.apiProfiles = Objects.requireNonNull(apiProfiles);
            return this;
        }

        public Builder setApiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }

        public Builder setCapabilities(@Nullable String capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder setDefaultApiVersion(String defaultApiVersion) {
            this.defaultApiVersion = Objects.requireNonNull(defaultApiVersion);
            return this;
        }

        public Builder setLocationMappings(@Nullable List<ProviderExtendedLocationResponse> locationMappings) {
            this.locationMappings = locationMappings;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setZoneMappings(@Nullable List<ZoneMappingResponse> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }

        public ProviderResourceTypeResponse build() {
            return new ProviderResourceTypeResponse(aliases, apiProfiles, apiVersions, capabilities, defaultApiVersion, locationMappings, locations, properties, resourceType, zoneMappings);
        }
    }
}
