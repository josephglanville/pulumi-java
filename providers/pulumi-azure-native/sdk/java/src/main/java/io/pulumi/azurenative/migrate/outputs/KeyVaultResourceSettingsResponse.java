// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyVaultResourceSettingsResponse {
    private final String resourceType;
    private final String targetResourceName;

    @OutputCustomType.Constructor({"resourceType","targetResourceName"})
    private KeyVaultResourceSettingsResponse(
        String resourceType,
        String targetResourceName) {
        this.resourceType = Objects.requireNonNull(resourceType);
        this.targetResourceName = Objects.requireNonNull(targetResourceName);
    }

    public String getPropResourceType() {
        return this.resourceType;
    }
    public String getTargetResourceName() {
        return this.targetResourceName;
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
