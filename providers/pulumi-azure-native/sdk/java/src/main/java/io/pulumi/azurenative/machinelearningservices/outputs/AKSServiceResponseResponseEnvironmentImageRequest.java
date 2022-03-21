// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.EnvironmentImageResponseResponseEnvironment;
import io.pulumi.azurenative.machinelearningservices.outputs.EnvironmentImageResponseResponseEnvironmentReference;
import io.pulumi.azurenative.machinelearningservices.outputs.ImageAssetResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ModelResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AKSServiceResponseResponseEnvironmentImageRequest {
    /**
     * The list of assets.
     * 
     */
    private final @Nullable List<ImageAssetResponse> assets;
    /**
     * The name of the driver file.
     * 
     */
    private final @Nullable String driverProgram;
    /**
     * The details of the AZURE ML environment.
     * 
     */
    private final @Nullable EnvironmentImageResponseResponseEnvironment environment;
    /**
     * The unique identifying details of the AZURE ML environment.
     * 
     */
    private final @Nullable EnvironmentImageResponseResponseEnvironmentReference environmentReference;
    /**
     * The list of model Ids.
     * 
     */
    private final @Nullable List<String> modelIds;
    /**
     * The list of models.
     * 
     */
    private final @Nullable List<ModelResponse> models;

    @CustomType.Constructor
    private AKSServiceResponseResponseEnvironmentImageRequest(
        @CustomType.Parameter("assets") @Nullable List<ImageAssetResponse> assets,
        @CustomType.Parameter("driverProgram") @Nullable String driverProgram,
        @CustomType.Parameter("environment") @Nullable EnvironmentImageResponseResponseEnvironment environment,
        @CustomType.Parameter("environmentReference") @Nullable EnvironmentImageResponseResponseEnvironmentReference environmentReference,
        @CustomType.Parameter("modelIds") @Nullable List<String> modelIds,
        @CustomType.Parameter("models") @Nullable List<ModelResponse> models) {
        this.assets = assets;
        this.driverProgram = driverProgram;
        this.environment = environment;
        this.environmentReference = environmentReference;
        this.modelIds = modelIds;
        this.models = models;
    }

    /**
     * The list of assets.
     * 
    */
    public List<ImageAssetResponse> getAssets() {
        return this.assets == null ? List.of() : this.assets;
    }
    /**
     * The name of the driver file.
     * 
    */
    public Optional<String> getDriverProgram() {
        return Optional.ofNullable(this.driverProgram);
    }
    /**
     * The details of the AZURE ML environment.
     * 
    */
    public Optional<EnvironmentImageResponseResponseEnvironment> getEnvironment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * The unique identifying details of the AZURE ML environment.
     * 
    */
    public Optional<EnvironmentImageResponseResponseEnvironmentReference> getEnvironmentReference() {
        return Optional.ofNullable(this.environmentReference);
    }
    /**
     * The list of model Ids.
     * 
    */
    public List<String> getModelIds() {
        return this.modelIds == null ? List.of() : this.modelIds;
    }
    /**
     * The list of models.
     * 
    */
    public List<ModelResponse> getModels() {
        return this.models == null ? List.of() : this.models;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceResponseResponseEnvironmentImageRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ImageAssetResponse> assets;
        private @Nullable String driverProgram;
        private @Nullable EnvironmentImageResponseResponseEnvironment environment;
        private @Nullable EnvironmentImageResponseResponseEnvironmentReference environmentReference;
        private @Nullable List<String> modelIds;
        private @Nullable List<ModelResponse> models;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceResponseResponseEnvironmentImageRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assets = defaults.assets;
    	      this.driverProgram = defaults.driverProgram;
    	      this.environment = defaults.environment;
    	      this.environmentReference = defaults.environmentReference;
    	      this.modelIds = defaults.modelIds;
    	      this.models = defaults.models;
        }

        public Builder assets(@Nullable List<ImageAssetResponse> assets) {
            this.assets = assets;
            return this;
        }
        public Builder assets(ImageAssetResponse... assets) {
            return assets(List.of(assets));
        }
        public Builder driverProgram(@Nullable String driverProgram) {
            this.driverProgram = driverProgram;
            return this;
        }
        public Builder environment(@Nullable EnvironmentImageResponseResponseEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public Builder environmentReference(@Nullable EnvironmentImageResponseResponseEnvironmentReference environmentReference) {
            this.environmentReference = environmentReference;
            return this;
        }
        public Builder modelIds(@Nullable List<String> modelIds) {
            this.modelIds = modelIds;
            return this;
        }
        public Builder modelIds(String... modelIds) {
            return modelIds(List.of(modelIds));
        }
        public Builder models(@Nullable List<ModelResponse> models) {
            this.models = models;
            return this;
        }
        public Builder models(ModelResponse... models) {
            return models(List.of(models));
        }        public AKSServiceResponseResponseEnvironmentImageRequest build() {
            return new AKSServiceResponseResponseEnvironmentImageRequest(assets, driverProgram, environment, environmentReference, modelIds, models);
        }
    }
}
