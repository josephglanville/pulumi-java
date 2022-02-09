// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class KeyVaultResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultResourceSettingsResponse Empty = new KeyVaultResourceSettingsResponse();

    @InputImport(name="resourceType", required=true)
    private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    @InputImport(name="targetResourceName", required=true)
    private final String targetResourceName;

    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    public KeyVaultResourceSettingsResponse(
        String resourceType,
        String targetResourceName) {
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
    }

    private KeyVaultResourceSettingsResponse() {
        this.resourceType = null;
        this.targetResourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public KeyVaultResourceSettingsResponse build() {
            return new KeyVaultResourceSettingsResponse(resourceType, targetResourceName);
        }
    }
}
