// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.EnvironmentImageRequestEnvironmentArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.EnvironmentImageRequestEnvironmentReferenceArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ImageAssetArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ModelArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CreateServiceRequestEnvironmentImageRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateServiceRequestEnvironmentImageRequestArgs Empty = new CreateServiceRequestEnvironmentImageRequestArgs();

    @InputImport(name="assets")
    private final @Nullable Input<List<ImageAssetArgs>> assets;

    public Input<List<ImageAssetArgs>> getAssets() {
        return this.assets == null ? Input.empty() : this.assets;
    }

    @InputImport(name="driverProgram")
    private final @Nullable Input<String> driverProgram;

    public Input<String> getDriverProgram() {
        return this.driverProgram == null ? Input.empty() : this.driverProgram;
    }

    @InputImport(name="environment")
    private final @Nullable Input<EnvironmentImageRequestEnvironmentArgs> environment;

    public Input<EnvironmentImageRequestEnvironmentArgs> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    @InputImport(name="environmentReference")
    private final @Nullable Input<EnvironmentImageRequestEnvironmentReferenceArgs> environmentReference;

    public Input<EnvironmentImageRequestEnvironmentReferenceArgs> getEnvironmentReference() {
        return this.environmentReference == null ? Input.empty() : this.environmentReference;
    }

    @InputImport(name="modelIds")
    private final @Nullable Input<List<String>> modelIds;

    public Input<List<String>> getModelIds() {
        return this.modelIds == null ? Input.empty() : this.modelIds;
    }

    @InputImport(name="models")
    private final @Nullable Input<List<ModelArgs>> models;

    public Input<List<ModelArgs>> getModels() {
        return this.models == null ? Input.empty() : this.models;
    }

    public CreateServiceRequestEnvironmentImageRequestArgs(
        @Nullable Input<List<ImageAssetArgs>> assets,
        @Nullable Input<String> driverProgram,
        @Nullable Input<EnvironmentImageRequestEnvironmentArgs> environment,
        @Nullable Input<EnvironmentImageRequestEnvironmentReferenceArgs> environmentReference,
        @Nullable Input<List<String>> modelIds,
        @Nullable Input<List<ModelArgs>> models) {
        this.assets = assets;
        this.driverProgram = driverProgram;
        this.environment = environment;
        this.environmentReference = environmentReference;
        this.modelIds = modelIds;
        this.models = models;
    }

    private CreateServiceRequestEnvironmentImageRequestArgs() {
        this.assets = Input.empty();
        this.driverProgram = Input.empty();
        this.environment = Input.empty();
        this.environmentReference = Input.empty();
        this.modelIds = Input.empty();
        this.models = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateServiceRequestEnvironmentImageRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ImageAssetArgs>> assets;
        private @Nullable Input<String> driverProgram;
        private @Nullable Input<EnvironmentImageRequestEnvironmentArgs> environment;
        private @Nullable Input<EnvironmentImageRequestEnvironmentReferenceArgs> environmentReference;
        private @Nullable Input<List<String>> modelIds;
        private @Nullable Input<List<ModelArgs>> models;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateServiceRequestEnvironmentImageRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assets = defaults.assets;
    	      this.driverProgram = defaults.driverProgram;
    	      this.environment = defaults.environment;
    	      this.environmentReference = defaults.environmentReference;
    	      this.modelIds = defaults.modelIds;
    	      this.models = defaults.models;
        }

        public Builder setAssets(@Nullable Input<List<ImageAssetArgs>> assets) {
            this.assets = assets;
            return this;
        }

        public Builder setAssets(@Nullable List<ImageAssetArgs> assets) {
            this.assets = Input.ofNullable(assets);
            return this;
        }

        public Builder setDriverProgram(@Nullable Input<String> driverProgram) {
            this.driverProgram = driverProgram;
            return this;
        }

        public Builder setDriverProgram(@Nullable String driverProgram) {
            this.driverProgram = Input.ofNullable(driverProgram);
            return this;
        }

        public Builder setEnvironment(@Nullable Input<EnvironmentImageRequestEnvironmentArgs> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setEnvironment(@Nullable EnvironmentImageRequestEnvironmentArgs environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder setEnvironmentReference(@Nullable Input<EnvironmentImageRequestEnvironmentReferenceArgs> environmentReference) {
            this.environmentReference = environmentReference;
            return this;
        }

        public Builder setEnvironmentReference(@Nullable EnvironmentImageRequestEnvironmentReferenceArgs environmentReference) {
            this.environmentReference = Input.ofNullable(environmentReference);
            return this;
        }

        public Builder setModelIds(@Nullable Input<List<String>> modelIds) {
            this.modelIds = modelIds;
            return this;
        }

        public Builder setModelIds(@Nullable List<String> modelIds) {
            this.modelIds = Input.ofNullable(modelIds);
            return this;
        }

        public Builder setModels(@Nullable Input<List<ModelArgs>> models) {
            this.models = models;
            return this;
        }

        public Builder setModels(@Nullable List<ModelArgs> models) {
            this.models = Input.ofNullable(models);
            return this;
        }

        public CreateServiceRequestEnvironmentImageRequestArgs build() {
            return new CreateServiceRequestEnvironmentImageRequestArgs(assets, driverProgram, environment, environmentReference, modelIds, models);
        }
    }
}
