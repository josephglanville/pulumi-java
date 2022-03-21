// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance.outputs;

import io.pulumi.azurenative.maintenance.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConfigurationAssignmentParentResult {
    /**
     * Fully qualified identifier of the resource
     * 
     */
    private final String id;
    /**
     * Location of the resource
     * 
     */
    private final @Nullable String location;
    /**
     * The maintenance configuration Id
     * 
     */
    private final @Nullable String maintenanceConfigurationId;
    /**
     * Name of the resource
     * 
     */
    private final String name;
    /**
     * The unique resourceId
     * 
     */
    private final @Nullable String resourceId;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the resource
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetConfigurationAssignmentParentResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("maintenanceConfigurationId") @Nullable String maintenanceConfigurationId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        this.name = name;
        this.resourceId = resourceId;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Fully qualified identifier of the resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Location of the resource
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The maintenance configuration Id
     * 
    */
    public Optional<String> getMaintenanceConfigurationId() {
        return Optional.ofNullable(this.maintenanceConfigurationId);
    }
    /**
     * Name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The unique resourceId
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the resource
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationAssignmentParentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private @Nullable String maintenanceConfigurationId;
        private String name;
        private @Nullable String resourceId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationAssignmentParentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder maintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetConfigurationAssignmentParentResult build() {
            return new GetConfigurationAssignmentParentResult(id, location, maintenanceConfigurationId, name, resourceId, systemData, type);
        }
    }
}
