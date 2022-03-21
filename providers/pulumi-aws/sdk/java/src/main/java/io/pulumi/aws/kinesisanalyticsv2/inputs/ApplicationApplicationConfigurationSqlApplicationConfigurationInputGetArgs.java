// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs();

    @Import(name="inAppStreamNames")
      private final @Nullable Output<List<String>> inAppStreamNames;

    public Output<List<String>> getInAppStreamNames() {
        return this.inAppStreamNames == null ? Output.empty() : this.inAppStreamNames;
    }

    @Import(name="inputId")
      private final @Nullable Output<String> inputId;

    public Output<String> getInputId() {
        return this.inputId == null ? Output.empty() : this.inputId;
    }

    /**
     * Describes the number of in-application streams to create.
     * 
     */
    @Import(name="inputParallelism")
      private final @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs> inputParallelism;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs> getInputParallelism() {
        return this.inputParallelism == null ? Output.empty() : this.inputParallelism;
    }

    /**
     * The input processing configuration for the input.
     * An input processor transforms records as they are received from the stream, before the application's SQL code executes.
     * 
     */
    @Import(name="inputProcessingConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs> inputProcessingConfiguration;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs> getInputProcessingConfiguration() {
        return this.inputProcessingConfiguration == null ? Output.empty() : this.inputProcessingConfiguration;
    }

    /**
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created.
     * 
     */
    @Import(name="inputSchema", required=true)
      private final Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaGetArgs> inputSchema;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaGetArgs> getInputSchema() {
        return this.inputSchema;
    }

    /**
     * The point at which the application starts processing records from the streaming source.
     * 
     */
    @Import(name="inputStartingPositionConfigurations")
      private final @Nullable Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs>> inputStartingPositionConfigurations;

    public Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs>> getInputStartingPositionConfigurations() {
        return this.inputStartingPositionConfigurations == null ? Output.empty() : this.inputStartingPositionConfigurations;
    }

    /**
     * If the streaming source is a Kinesis Data Firehose delivery stream, identifies the delivery stream's ARN.
     * 
     */
    @Import(name="kinesisFirehoseInput")
      private final @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs> kinesisFirehoseInput;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs> getKinesisFirehoseInput() {
        return this.kinesisFirehoseInput == null ? Output.empty() : this.kinesisFirehoseInput;
    }

    /**
     * If the streaming source is a Kinesis data stream, identifies the stream's Amazon Resource Name (ARN).
     * 
     */
    @Import(name="kinesisStreamsInput")
      private final @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs> kinesisStreamsInput;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs> getKinesisStreamsInput() {
        return this.kinesisStreamsInput == null ? Output.empty() : this.kinesisStreamsInput;
    }

    /**
     * The name prefix to use when creating an in-application stream.
     * 
     */
    @Import(name="namePrefix", required=true)
      private final Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs(
        @Nullable Output<List<String>> inAppStreamNames,
        @Nullable Output<String> inputId,
        @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs> inputParallelism,
        @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs> inputProcessingConfiguration,
        Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaGetArgs> inputSchema,
        @Nullable Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs>> inputStartingPositionConfigurations,
        @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs> kinesisFirehoseInput,
        @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs> kinesisStreamsInput,
        Output<String> namePrefix) {
        this.inAppStreamNames = inAppStreamNames;
        this.inputId = inputId;
        this.inputParallelism = inputParallelism;
        this.inputProcessingConfiguration = inputProcessingConfiguration;
        this.inputSchema = Objects.requireNonNull(inputSchema, "expected parameter 'inputSchema' to be non-null");
        this.inputStartingPositionConfigurations = inputStartingPositionConfigurations;
        this.kinesisFirehoseInput = kinesisFirehoseInput;
        this.kinesisStreamsInput = kinesisStreamsInput;
        this.namePrefix = Objects.requireNonNull(namePrefix, "expected parameter 'namePrefix' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs() {
        this.inAppStreamNames = Output.empty();
        this.inputId = Output.empty();
        this.inputParallelism = Output.empty();
        this.inputProcessingConfiguration = Output.empty();
        this.inputSchema = Output.empty();
        this.inputStartingPositionConfigurations = Output.empty();
        this.kinesisFirehoseInput = Output.empty();
        this.kinesisStreamsInput = Output.empty();
        this.namePrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> inAppStreamNames;
        private @Nullable Output<String> inputId;
        private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs> inputParallelism;
        private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs> inputProcessingConfiguration;
        private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaGetArgs> inputSchema;
        private @Nullable Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs>> inputStartingPositionConfigurations;
        private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs> kinesisFirehoseInput;
        private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs> kinesisStreamsInput;
        private Output<String> namePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inAppStreamNames = defaults.inAppStreamNames;
    	      this.inputId = defaults.inputId;
    	      this.inputParallelism = defaults.inputParallelism;
    	      this.inputProcessingConfiguration = defaults.inputProcessingConfiguration;
    	      this.inputSchema = defaults.inputSchema;
    	      this.inputStartingPositionConfigurations = defaults.inputStartingPositionConfigurations;
    	      this.kinesisFirehoseInput = defaults.kinesisFirehoseInput;
    	      this.kinesisStreamsInput = defaults.kinesisStreamsInput;
    	      this.namePrefix = defaults.namePrefix;
        }

        public Builder inAppStreamNames(@Nullable Output<List<String>> inAppStreamNames) {
            this.inAppStreamNames = inAppStreamNames;
            return this;
        }
        public Builder inAppStreamNames(@Nullable List<String> inAppStreamNames) {
            this.inAppStreamNames = Output.ofNullable(inAppStreamNames);
            return this;
        }
        public Builder inAppStreamNames(String... inAppStreamNames) {
            return inAppStreamNames(List.of(inAppStreamNames));
        }
        public Builder inputId(@Nullable Output<String> inputId) {
            this.inputId = inputId;
            return this;
        }
        public Builder inputId(@Nullable String inputId) {
            this.inputId = Output.ofNullable(inputId);
            return this;
        }
        public Builder inputParallelism(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs> inputParallelism) {
            this.inputParallelism = inputParallelism;
            return this;
        }
        public Builder inputParallelism(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs inputParallelism) {
            this.inputParallelism = Output.ofNullable(inputParallelism);
            return this;
        }
        public Builder inputProcessingConfiguration(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs> inputProcessingConfiguration) {
            this.inputProcessingConfiguration = inputProcessingConfiguration;
            return this;
        }
        public Builder inputProcessingConfiguration(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs inputProcessingConfiguration) {
            this.inputProcessingConfiguration = Output.ofNullable(inputProcessingConfiguration);
            return this;
        }
        public Builder inputSchema(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaGetArgs> inputSchema) {
            this.inputSchema = Objects.requireNonNull(inputSchema);
            return this;
        }
        public Builder inputSchema(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaGetArgs inputSchema) {
            this.inputSchema = Output.of(Objects.requireNonNull(inputSchema));
            return this;
        }
        public Builder inputStartingPositionConfigurations(@Nullable Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs>> inputStartingPositionConfigurations) {
            this.inputStartingPositionConfigurations = inputStartingPositionConfigurations;
            return this;
        }
        public Builder inputStartingPositionConfigurations(@Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs> inputStartingPositionConfigurations) {
            this.inputStartingPositionConfigurations = Output.ofNullable(inputStartingPositionConfigurations);
            return this;
        }
        public Builder inputStartingPositionConfigurations(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs... inputStartingPositionConfigurations) {
            return inputStartingPositionConfigurations(List.of(inputStartingPositionConfigurations));
        }
        public Builder kinesisFirehoseInput(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs> kinesisFirehoseInput) {
            this.kinesisFirehoseInput = kinesisFirehoseInput;
            return this;
        }
        public Builder kinesisFirehoseInput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs kinesisFirehoseInput) {
            this.kinesisFirehoseInput = Output.ofNullable(kinesisFirehoseInput);
            return this;
        }
        public Builder kinesisStreamsInput(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs> kinesisStreamsInput) {
            this.kinesisStreamsInput = kinesisStreamsInput;
            return this;
        }
        public Builder kinesisStreamsInput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputGetArgs kinesisStreamsInput) {
            this.kinesisStreamsInput = Output.ofNullable(kinesisStreamsInput);
            return this;
        }
        public Builder namePrefix(Output<String> namePrefix) {
            this.namePrefix = Objects.requireNonNull(namePrefix);
            return this;
        }
        public Builder namePrefix(String namePrefix) {
            this.namePrefix = Output.of(Objects.requireNonNull(namePrefix));
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs(inAppStreamNames, inputId, inputParallelism, inputProcessingConfiguration, inputSchema, inputStartingPositionConfigurations, kinesisFirehoseInput, kinesisStreamsInput, namePrefix);
        }
    }
}
