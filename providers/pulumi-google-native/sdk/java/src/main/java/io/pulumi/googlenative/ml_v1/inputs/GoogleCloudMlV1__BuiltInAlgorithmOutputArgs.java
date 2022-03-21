// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents output related to a built-in algorithm Job.
 * 
 */
public final class GoogleCloudMlV1__BuiltInAlgorithmOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__BuiltInAlgorithmOutputArgs Empty = new GoogleCloudMlV1__BuiltInAlgorithmOutputArgs();

    /**
     * Framework on which the built-in algorithm was trained.
     * 
     */
    @Import(name="framework")
      private final @Nullable Output<String> framework;

    public Output<String> getFramework() {
        return this.framework == null ? Output.empty() : this.framework;
    }

    /**
     * The Cloud Storage path to the `model/` directory where the training job saves the trained model. Only set for successful jobs that don't use hyperparameter tuning.
     * 
     */
    @Import(name="modelPath")
      private final @Nullable Output<String> modelPath;

    public Output<String> getModelPath() {
        return this.modelPath == null ? Output.empty() : this.modelPath;
    }

    /**
     * Python version on which the built-in algorithm was trained.
     * 
     */
    @Import(name="pythonVersion")
      private final @Nullable Output<String> pythonVersion;

    public Output<String> getPythonVersion() {
        return this.pythonVersion == null ? Output.empty() : this.pythonVersion;
    }

    /**
     * AI Platform runtime version on which the built-in algorithm was trained.
     * 
     */
    @Import(name="runtimeVersion")
      private final @Nullable Output<String> runtimeVersion;

    public Output<String> getRuntimeVersion() {
        return this.runtimeVersion == null ? Output.empty() : this.runtimeVersion;
    }

    public GoogleCloudMlV1__BuiltInAlgorithmOutputArgs(
        @Nullable Output<String> framework,
        @Nullable Output<String> modelPath,
        @Nullable Output<String> pythonVersion,
        @Nullable Output<String> runtimeVersion) {
        this.framework = framework;
        this.modelPath = modelPath;
        this.pythonVersion = pythonVersion;
        this.runtimeVersion = runtimeVersion;
    }

    private GoogleCloudMlV1__BuiltInAlgorithmOutputArgs() {
        this.framework = Output.empty();
        this.modelPath = Output.empty();
        this.pythonVersion = Output.empty();
        this.runtimeVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__BuiltInAlgorithmOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> framework;
        private @Nullable Output<String> modelPath;
        private @Nullable Output<String> pythonVersion;
        private @Nullable Output<String> runtimeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__BuiltInAlgorithmOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.framework = defaults.framework;
    	      this.modelPath = defaults.modelPath;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.runtimeVersion = defaults.runtimeVersion;
        }

        public Builder framework(@Nullable Output<String> framework) {
            this.framework = framework;
            return this;
        }
        public Builder framework(@Nullable String framework) {
            this.framework = Output.ofNullable(framework);
            return this;
        }
        public Builder modelPath(@Nullable Output<String> modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public Builder modelPath(@Nullable String modelPath) {
            this.modelPath = Output.ofNullable(modelPath);
            return this;
        }
        public Builder pythonVersion(@Nullable Output<String> pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }
        public Builder pythonVersion(@Nullable String pythonVersion) {
            this.pythonVersion = Output.ofNullable(pythonVersion);
            return this;
        }
        public Builder runtimeVersion(@Nullable Output<String> runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public Builder runtimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = Output.ofNullable(runtimeVersion);
            return this;
        }        public GoogleCloudMlV1__BuiltInAlgorithmOutputArgs build() {
            return new GoogleCloudMlV1__BuiltInAlgorithmOutputArgs(framework, modelPath, pythonVersion, runtimeVersion);
        }
    }
}
