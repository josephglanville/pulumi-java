// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiskEncryptionSetResourceSettingsResponse {
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Compute/diskEncryptionSets'.
     * 
     */
    private final String resourceType;
    /**
     * Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;

    @CustomType.Constructor
    private DiskEncryptionSetResourceSettingsResponse(
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("targetResourceName") String targetResourceName) {
        this.resourceType = resourceType;
        this.targetResourceName = targetResourceName;
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Compute/diskEncryptionSets'.
     * 
    */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Gets or sets the target Resource name.
     * 
    */
    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionSetResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionSetResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }        public DiskEncryptionSetResourceSettingsResponse build() {
            return new DiskEncryptionSetResourceSettingsResponse(resourceType, targetResourceName);
        }
    }
}
