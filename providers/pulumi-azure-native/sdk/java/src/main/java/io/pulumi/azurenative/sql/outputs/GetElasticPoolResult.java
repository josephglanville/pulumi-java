// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.ElasticPoolPerDatabaseSettingsResponse;
import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetElasticPoolResult {
    private final String creationDate;
    private final String id;
    private final String kind;
    private final @Nullable String licenseType;
    private final String location;
    private final @Nullable String maintenanceConfigurationId;
    private final @Nullable Double maxSizeBytes;
    private final String name;
    private final @Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings;
    private final @Nullable SkuResponse sku;
    private final String state;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable Boolean zoneRedundant;

    @OutputCustomType.Constructor({"creationDate","id","kind","licenseType","location","maintenanceConfigurationId","maxSizeBytes","name","perDatabaseSettings","sku","state","tags","type","zoneRedundant"})
    private GetElasticPoolResult(
        String creationDate,
        String id,
        String kind,
        @Nullable String licenseType,
        String location,
        @Nullable String maintenanceConfigurationId,
        @Nullable Double maxSizeBytes,
        String name,
        @Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings,
        @Nullable SkuResponse sku,
        String state,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable Boolean zoneRedundant) {
        this.creationDate = Objects.requireNonNull(creationDate);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.licenseType = licenseType;
        this.location = Objects.requireNonNull(location);
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        this.maxSizeBytes = maxSizeBytes;
        this.name = Objects.requireNonNull(name);
        this.perDatabaseSettings = perDatabaseSettings;
        this.sku = sku;
        this.state = Objects.requireNonNull(state);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.zoneRedundant = zoneRedundant;
    }

    public String getCreationDate() {
        return this.creationDate;
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public Optional<String> getLicenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    public String getLocation() {
        return this.location;
    }
    public Optional<String> getMaintenanceConfigurationId() {
        return Optional.ofNullable(this.maintenanceConfigurationId);
    }
    public Optional<Double> getMaxSizeBytes() {
        return Optional.ofNullable(this.maxSizeBytes);
    }
    public String getName() {
        return this.name;
    }
    public Optional<ElasticPoolPerDatabaseSettingsResponse> getPerDatabaseSettings() {
        return Optional.ofNullable(this.perDatabaseSettings);
    }
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public String getState() {
        return this.state;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<Boolean> getZoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationDate;
        private String id;
        private String kind;
        private @Nullable String licenseType;
        private String location;
        private @Nullable String maintenanceConfigurationId;
        private @Nullable Double maxSizeBytes;
        private String name;
        private @Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings;
        private @Nullable SkuResponse sku;
        private String state;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable Boolean zoneRedundant;

        public Builder() {
    	      // Empty
        }

        public Builder(GetElasticPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.maxSizeBytes = defaults.maxSizeBytes;
    	      this.name = defaults.name;
    	      this.perDatabaseSettings = defaults.perDatabaseSettings;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zoneRedundant = defaults.zoneRedundant;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMaintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }

        public Builder setMaxSizeBytes(@Nullable Double maxSizeBytes) {
            this.maxSizeBytes = maxSizeBytes;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPerDatabaseSettings(@Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings) {
            this.perDatabaseSettings = perDatabaseSettings;
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
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

        public Builder setZoneRedundant(@Nullable Boolean zoneRedundant) {
            this.zoneRedundant = zoneRedundant;
            return this;
        }

        public GetElasticPoolResult build() {
            return new GetElasticPoolResult(creationDate, id, kind, licenseType, location, maintenanceConfigurationId, maxSizeBytes, name, perDatabaseSettings, sku, state, tags, type, zoneRedundant);
        }
    }
}
