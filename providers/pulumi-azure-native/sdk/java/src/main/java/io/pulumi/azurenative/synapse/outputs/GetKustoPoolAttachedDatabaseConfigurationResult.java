// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.SystemDataResponse;
import io.pulumi.azurenative.synapse.outputs.TableLevelSharingPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKustoPoolAttachedDatabaseConfigurationResult {
    private final List<String> attachedDatabaseNames;
    private final String databaseName;
    private final String defaultPrincipalsModificationKind;
    private final String id;
    private final String kustoPoolResourceId;
    private final @Nullable String location;
    private final String name;
    private final String provisioningState;
    private final SystemDataResponse systemData;
    private final @Nullable TableLevelSharingPropertiesResponse tableLevelSharingProperties;
    private final String type;

    @OutputCustomType.Constructor({"attachedDatabaseNames","databaseName","defaultPrincipalsModificationKind","id","kustoPoolResourceId","location","name","provisioningState","systemData","tableLevelSharingProperties","type"})
    private GetKustoPoolAttachedDatabaseConfigurationResult(
        List<String> attachedDatabaseNames,
        String databaseName,
        String defaultPrincipalsModificationKind,
        String id,
        String kustoPoolResourceId,
        @Nullable String location,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable TableLevelSharingPropertiesResponse tableLevelSharingProperties,
        String type) {
        this.attachedDatabaseNames = Objects.requireNonNull(attachedDatabaseNames);
        this.databaseName = Objects.requireNonNull(databaseName);
        this.defaultPrincipalsModificationKind = Objects.requireNonNull(defaultPrincipalsModificationKind);
        this.id = Objects.requireNonNull(id);
        this.kustoPoolResourceId = Objects.requireNonNull(kustoPoolResourceId);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.tableLevelSharingProperties = tableLevelSharingProperties;
        this.type = Objects.requireNonNull(type);
    }

    public List<String> getAttachedDatabaseNames() {
        return this.attachedDatabaseNames;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }
    public String getDefaultPrincipalsModificationKind() {
        return this.defaultPrincipalsModificationKind;
    }
    public String getId() {
        return this.id;
    }
    public String getKustoPoolResourceId() {
        return this.kustoPoolResourceId;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Optional<TableLevelSharingPropertiesResponse> getTableLevelSharingProperties() {
        return Optional.ofNullable(this.tableLevelSharingProperties);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKustoPoolAttachedDatabaseConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> attachedDatabaseNames;
        private String databaseName;
        private String defaultPrincipalsModificationKind;
        private String id;
        private String kustoPoolResourceId;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable TableLevelSharingPropertiesResponse tableLevelSharingProperties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKustoPoolAttachedDatabaseConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedDatabaseNames = defaults.attachedDatabaseNames;
    	      this.databaseName = defaults.databaseName;
    	      this.defaultPrincipalsModificationKind = defaults.defaultPrincipalsModificationKind;
    	      this.id = defaults.id;
    	      this.kustoPoolResourceId = defaults.kustoPoolResourceId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tableLevelSharingProperties = defaults.tableLevelSharingProperties;
    	      this.type = defaults.type;
        }

        public Builder setAttachedDatabaseNames(List<String> attachedDatabaseNames) {
            this.attachedDatabaseNames = Objects.requireNonNull(attachedDatabaseNames);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDefaultPrincipalsModificationKind(String defaultPrincipalsModificationKind) {
            this.defaultPrincipalsModificationKind = Objects.requireNonNull(defaultPrincipalsModificationKind);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKustoPoolResourceId(String kustoPoolResourceId) {
            this.kustoPoolResourceId = Objects.requireNonNull(kustoPoolResourceId);
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTableLevelSharingProperties(@Nullable TableLevelSharingPropertiesResponse tableLevelSharingProperties) {
            this.tableLevelSharingProperties = tableLevelSharingProperties;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetKustoPoolAttachedDatabaseConfigurationResult build() {
            return new GetKustoPoolAttachedDatabaseConfigurationResult(attachedDatabaseNames, databaseName, defaultPrincipalsModificationKind, id, kustoPoolResourceId, location, name, provisioningState, systemData, tableLevelSharingProperties, type);
        }
    }
}
