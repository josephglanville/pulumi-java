// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs Empty = new EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs();

    /**
     * Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent on failure.
     * 
     */
    @InputImport(name="errorTopic")
      private final @Nullable Output<String> errorTopic;

    public Output<String> getErrorTopic() {
        return this.errorTopic == null ? Output.empty() : this.errorTopic;
    }

    /**
     * Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no notification is sent on success.
     * 
     */
    @InputImport(name="successTopic")
      private final @Nullable Output<String> successTopic;

    public Output<String> getSuccessTopic() {
        return this.successTopic == null ? Output.empty() : this.successTopic;
    }

    public EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs(
        @Nullable Output<String> errorTopic,
        @Nullable Output<String> successTopic) {
        this.errorTopic = errorTopic;
        this.successTopic = successTopic;
    }

    private EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs() {
        this.errorTopic = Output.empty();
        this.successTopic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> errorTopic;
        private @Nullable Output<String> successTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorTopic = defaults.errorTopic;
    	      this.successTopic = defaults.successTopic;
        }

        public Builder errorTopic(@Nullable Output<String> errorTopic) {
            this.errorTopic = errorTopic;
            return this;
        }

        public Builder errorTopic(@Nullable String errorTopic) {
            this.errorTopic = Output.ofNullable(errorTopic);
            return this;
        }

        public Builder successTopic(@Nullable Output<String> successTopic) {
            this.successTopic = successTopic;
            return this;
        }

        public Builder successTopic(@Nullable String successTopic) {
            this.successTopic = Output.ofNullable(successTopic);
            return this;
        }
        public EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs build() {
            return new EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs(errorTopic, successTopic);
        }
    }
}
