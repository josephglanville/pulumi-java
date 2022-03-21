// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.azurenative.cognitiveservices.outputs.DeploymentModelResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.DeploymentScaleSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentPropertiesResponse {
    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    private final @Nullable DeploymentModelResponse model;
    /**
     * Gets the status of the resource at the time the operation was called.
     * 
     */
    private final String provisioningState;
    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    private final @Nullable DeploymentScaleSettingsResponse scaleSettings;

    @CustomType.Constructor
    private DeploymentPropertiesResponse(
        @CustomType.Parameter("model") @Nullable DeploymentModelResponse model,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("scaleSettings") @Nullable DeploymentScaleSettingsResponse scaleSettings) {
        this.model = model;
        this.provisioningState = provisioningState;
        this.scaleSettings = scaleSettings;
    }

    /**
     * Properties of Cognitive Services account deployment model.
     * 
    */
    public Optional<DeploymentModelResponse> getModel() {
        return Optional.ofNullable(this.model);
    }
    /**
     * Gets the status of the resource at the time the operation was called.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Properties of Cognitive Services account deployment model.
     * 
    */
    public Optional<DeploymentScaleSettingsResponse> getScaleSettings() {
        return Optional.ofNullable(this.scaleSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeploymentModelResponse model;
        private String provisioningState;
        private @Nullable DeploymentScaleSettingsResponse scaleSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scaleSettings = defaults.scaleSettings;
        }

        public Builder model(@Nullable DeploymentModelResponse model) {
            this.model = model;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder scaleSettings(@Nullable DeploymentScaleSettingsResponse scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }        public DeploymentPropertiesResponse build() {
            return new DeploymentPropertiesResponse(model, provisioningState, scaleSettings);
        }
    }
}
