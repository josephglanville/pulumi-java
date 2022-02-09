// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis.outputs;

import io.pulumi.azurenative.changeanalysis.outputs.ConfigurationProfileResourcePropertiesResponse;
import io.pulumi.azurenative.changeanalysis.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.changeanalysis.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConfigurationProfileResult {
    private final String id;
    private final @Nullable ResourceIdentityResponse identity;
    private final @Nullable String location;
    private final String name;
    private final ConfigurationProfileResourcePropertiesResponse properties;
    private final @Nullable SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"id","identity","location","name","properties","systemData","type"})
    private GetConfigurationProfileResult(
        String id,
        @Nullable ResourceIdentityResponse identity,
        @Nullable String location,
        String name,
        ConfigurationProfileResourcePropertiesResponse properties,
        @Nullable SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.systemData = systemData;
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public Optional<ResourceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public ConfigurationProfileResourcePropertiesResponse getProperties() {
        return this.properties;
    }
    public Optional<SystemDataResponse> getSystemData() {
        return Optional.ofNullable(this.systemData);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable ResourceIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private ConfigurationProfileResourcePropertiesResponse properties;
        private @Nullable SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(ConfigurationProfileResourcePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSystemData(@Nullable SystemDataResponse systemData) {
            this.systemData = systemData;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetConfigurationProfileResult build() {
            return new GetConfigurationProfileResult(id, identity, location, name, properties, systemData, type);
        }
    }
}
