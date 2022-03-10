// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration {
    /**
     * Describes the Lambda function that is used to preprocess the records in the stream before being processed by your application code.
     * 
     */
    private final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor inputLambdaProcessor;

    @OutputCustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration(@OutputCustomType.Parameter("inputLambdaProcessor") ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor inputLambdaProcessor) {
        this.inputLambdaProcessor = inputLambdaProcessor;
    }

    /**
     * Describes the Lambda function that is used to preprocess the records in the stream before being processed by your application code.
     * 
    */
    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor getInputLambdaProcessor() {
        return this.inputLambdaProcessor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor inputLambdaProcessor;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputLambdaProcessor = defaults.inputLambdaProcessor;
        }

        public Builder setInputLambdaProcessor(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor inputLambdaProcessor) {
            this.inputLambdaProcessor = Objects.requireNonNull(inputLambdaProcessor);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration(inputLambdaProcessor);
        }
    }
}
