// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureToAzureNetworkMappingSettingsResponse {
    private final String instanceType;
    private final @Nullable String primaryFabricLocation;
    private final @Nullable String recoveryFabricLocation;

    @OutputCustomType.Constructor({"instanceType","primaryFabricLocation","recoveryFabricLocation"})
    private AzureToAzureNetworkMappingSettingsResponse(
        String instanceType,
        @Nullable String primaryFabricLocation,
        @Nullable String recoveryFabricLocation) {
        this.instanceType = Objects.requireNonNull(instanceType);
        this.primaryFabricLocation = primaryFabricLocation;
        this.recoveryFabricLocation = recoveryFabricLocation;
    }

    public String getInstanceType() {
        return this.instanceType;
    }
    public Optional<String> getPrimaryFabricLocation() {
        return Optional.ofNullable(this.primaryFabricLocation);
    }
    public Optional<String> getRecoveryFabricLocation() {
        return Optional.ofNullable(this.recoveryFabricLocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureToAzureNetworkMappingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;
        private @Nullable String primaryFabricLocation;
        private @Nullable String recoveryFabricLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureToAzureNetworkMappingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.primaryFabricLocation = defaults.primaryFabricLocation;
    	      this.recoveryFabricLocation = defaults.recoveryFabricLocation;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setPrimaryFabricLocation(@Nullable String primaryFabricLocation) {
            this.primaryFabricLocation = primaryFabricLocation;
            return this;
        }

        public Builder setRecoveryFabricLocation(@Nullable String recoveryFabricLocation) {
            this.recoveryFabricLocation = recoveryFabricLocation;
            return this;
        }

        public AzureToAzureNetworkMappingSettingsResponse build() {
            return new AzureToAzureNetworkMappingSettingsResponse(instanceType, primaryFabricLocation, recoveryFabricLocation);
        }
    }
}
