// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigClientConfigArgs;
import io.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigArgs Empty = new EndpointConfigurationAsyncInferenceConfigArgs();

    /**
     * Configures the behavior of the client used by Amazon SageMaker to interact with the model container during asynchronous inference.
     * 
     */
    @Import(name="clientConfig")
      private final @Nullable Output<EndpointConfigurationAsyncInferenceConfigClientConfigArgs> clientConfig;

    public Output<EndpointConfigurationAsyncInferenceConfigClientConfigArgs> getClientConfig() {
        return this.clientConfig == null ? Output.empty() : this.clientConfig;
    }

    /**
     * Specifies the configuration for asynchronous inference invocation outputs.
     * 
     */
    @Import(name="outputConfig", required=true)
      private final Output<EndpointConfigurationAsyncInferenceConfigOutputConfigArgs> outputConfig;

    public Output<EndpointConfigurationAsyncInferenceConfigOutputConfigArgs> getOutputConfig() {
        return this.outputConfig;
    }

    public EndpointConfigurationAsyncInferenceConfigArgs(
        @Nullable Output<EndpointConfigurationAsyncInferenceConfigClientConfigArgs> clientConfig,
        Output<EndpointConfigurationAsyncInferenceConfigOutputConfigArgs> outputConfig) {
        this.clientConfig = clientConfig;
        this.outputConfig = Objects.requireNonNull(outputConfig, "expected parameter 'outputConfig' to be non-null");
    }

    private EndpointConfigurationAsyncInferenceConfigArgs() {
        this.clientConfig = Output.empty();
        this.outputConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EndpointConfigurationAsyncInferenceConfigClientConfigArgs> clientConfig;
        private Output<EndpointConfigurationAsyncInferenceConfigOutputConfigArgs> outputConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientConfig = defaults.clientConfig;
    	      this.outputConfig = defaults.outputConfig;
        }

        public Builder clientConfig(@Nullable Output<EndpointConfigurationAsyncInferenceConfigClientConfigArgs> clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }
        public Builder clientConfig(@Nullable EndpointConfigurationAsyncInferenceConfigClientConfigArgs clientConfig) {
            this.clientConfig = Output.ofNullable(clientConfig);
            return this;
        }
        public Builder outputConfig(Output<EndpointConfigurationAsyncInferenceConfigOutputConfigArgs> outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }
        public Builder outputConfig(EndpointConfigurationAsyncInferenceConfigOutputConfigArgs outputConfig) {
            this.outputConfig = Output.of(Objects.requireNonNull(outputConfig));
            return this;
        }        public EndpointConfigurationAsyncInferenceConfigArgs build() {
            return new EndpointConfigurationAsyncInferenceConfigArgs(clientConfig, outputConfig);
        }
    }
}
