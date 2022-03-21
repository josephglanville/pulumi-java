// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Launch Flex Template parameter.
 * 
 */
public final class GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs Empty = new GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs();

    /**
     * Cloud Storage path to a file with a JSON-serialized ContainerSpec as content.
     * 
     */
    @Import(name="containerSpecGcsPath")
      private final @Nullable Output<String> containerSpecGcsPath;

    public Output<String> getContainerSpecGcsPath() {
        return this.containerSpecGcsPath == null ? Output.empty() : this.containerSpecGcsPath;
    }

    /**
     * The runtime environment for the Flex Template job.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs> environment;

    public Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs> getEnvironment() {
        return this.environment == null ? Output.empty() : this.environment;
    }

    /**
     * The job name to use for the created job. For an update job request, the job name should be the same as the existing running job.
     * 
     */
    @Import(name="jobName", required=true)
      private final Output<String> jobName;

    public Output<String> getJobName() {
        return this.jobName;
    }

    /**
     * Launch options for this Flex Template job. This is a common set of options across languages and templates. This should not be used to pass job parameters.
     * 
     */
    @Import(name="launchOptions")
      private final @Nullable Output<Map<String,String>> launchOptions;

    public Output<Map<String,String>> getLaunchOptions() {
        return this.launchOptions == null ? Output.empty() : this.launchOptions;
    }

    /**
     * The parameters for the Flex Template. Example: `{"num_workers":"5"}`
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,String>> parameters;

    public Output<Map<String,String>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Use this to pass transform name mappings for streaming update jobs. Example: `{"oldTransformName":"newTransformName",...}`
     * 
     */
    @Import(name="transformNameMappings")
      private final @Nullable Output<Map<String,String>> transformNameMappings;

    public Output<Map<String,String>> getTransformNameMappings() {
        return this.transformNameMappings == null ? Output.empty() : this.transformNameMappings;
    }

    /**
     * Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job.
     * 
     */
    @Import(name="update")
      private final @Nullable Output<Boolean> update;

    public Output<Boolean> getUpdate() {
        return this.update == null ? Output.empty() : this.update;
    }

    public GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs(
        @Nullable Output<String> containerSpecGcsPath,
        @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs> environment,
        Output<String> jobName,
        @Nullable Output<Map<String,String>> launchOptions,
        @Nullable Output<Map<String,String>> parameters,
        @Nullable Output<Map<String,String>> transformNameMappings,
        @Nullable Output<Boolean> update) {
        this.containerSpecGcsPath = containerSpecGcsPath;
        this.environment = environment;
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.launchOptions = launchOptions;
        this.parameters = parameters;
        this.transformNameMappings = transformNameMappings;
        this.update = update;
    }

    private GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs() {
        this.containerSpecGcsPath = Output.empty();
        this.environment = Output.empty();
        this.jobName = Output.empty();
        this.launchOptions = Output.empty();
        this.parameters = Output.empty();
        this.transformNameMappings = Output.empty();
        this.update = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerSpecGcsPath;
        private @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs> environment;
        private Output<String> jobName;
        private @Nullable Output<Map<String,String>> launchOptions;
        private @Nullable Output<Map<String,String>> parameters;
        private @Nullable Output<Map<String,String>> transformNameMappings;
        private @Nullable Output<Boolean> update;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerSpecGcsPath = defaults.containerSpecGcsPath;
    	      this.environment = defaults.environment;
    	      this.jobName = defaults.jobName;
    	      this.launchOptions = defaults.launchOptions;
    	      this.parameters = defaults.parameters;
    	      this.transformNameMappings = defaults.transformNameMappings;
    	      this.update = defaults.update;
        }

        public Builder containerSpecGcsPath(@Nullable Output<String> containerSpecGcsPath) {
            this.containerSpecGcsPath = containerSpecGcsPath;
            return this;
        }
        public Builder containerSpecGcsPath(@Nullable String containerSpecGcsPath) {
            this.containerSpecGcsPath = Output.ofNullable(containerSpecGcsPath);
            return this;
        }
        public Builder environment(@Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs environment) {
            this.environment = Output.ofNullable(environment);
            return this;
        }
        public Builder jobName(Output<String> jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }
        public Builder jobName(String jobName) {
            this.jobName = Output.of(Objects.requireNonNull(jobName));
            return this;
        }
        public Builder launchOptions(@Nullable Output<Map<String,String>> launchOptions) {
            this.launchOptions = launchOptions;
            return this;
        }
        public Builder launchOptions(@Nullable Map<String,String> launchOptions) {
            this.launchOptions = Output.ofNullable(launchOptions);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder transformNameMappings(@Nullable Output<Map<String,String>> transformNameMappings) {
            this.transformNameMappings = transformNameMappings;
            return this;
        }
        public Builder transformNameMappings(@Nullable Map<String,String> transformNameMappings) {
            this.transformNameMappings = Output.ofNullable(transformNameMappings);
            return this;
        }
        public Builder update(@Nullable Output<Boolean> update) {
            this.update = update;
            return this;
        }
        public Builder update(@Nullable Boolean update) {
            this.update = Output.ofNullable(update);
            return this;
        }        public GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs build() {
            return new GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs(containerSpecGcsPath, environment, jobName, launchOptions, parameters, transformNameMappings, update);
        }
    }
}
