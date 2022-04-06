// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sfn.inputs;

import io.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationGetArgs;
import io.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineState extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineState Empty = new StateMachineState();

    /**
     * The ARN of the state machine.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The date the state machine was created.
     * 
     */
    @Import(name="creationDate")
      private final @Nullable Output<String> creationDate;

    public Output<String> getCreationDate() {
        return this.creationDate == null ? Output.empty() : this.creationDate;
    }

    /**
     * The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
     * 
     */
    @Import(name="definition")
      private final @Nullable Output<String> definition;

    public Output<String> getDefinition() {
        return this.definition == null ? Output.empty() : this.definition;
    }

    /**
     * Defines what execution history events are logged and where they are logged. The `logging_configuration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
     * 
     */
    @Import(name="loggingConfiguration")
      private final @Nullable Output<StateMachineLoggingConfigurationGetArgs> loggingConfiguration;

    public Output<StateMachineLoggingConfigurationGetArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Output.empty() : this.loggingConfiguration;
    }

    /**
     * The name of the state machine. To enable logging with CloudWatch Logs, the name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    /**
     * The current status of the state machine. Either `ACTIVE` or `DELETING`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Selects whether AWS X-Ray tracing is enabled.
     * 
     */
    @Import(name="tracingConfiguration")
      private final @Nullable Output<StateMachineTracingConfigurationGetArgs> tracingConfiguration;

    public Output<StateMachineTracingConfigurationGetArgs> getTracingConfiguration() {
        return this.tracingConfiguration == null ? Output.empty() : this.tracingConfiguration;
    }

    /**
     * Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public StateMachineState(
        @Nullable Output<String> arn,
        @Nullable Output<String> creationDate,
        @Nullable Output<String> definition,
        @Nullable Output<StateMachineLoggingConfigurationGetArgs> loggingConfiguration,
        @Nullable Output<String> name,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<StateMachineTracingConfigurationGetArgs> tracingConfiguration,
        @Nullable Output<String> type) {
        this.arn = arn;
        this.creationDate = creationDate;
        this.definition = definition;
        this.loggingConfiguration = loggingConfiguration;
        this.name = name;
        this.roleArn = roleArn;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.tracingConfiguration = tracingConfiguration;
        this.type = type;
    }

    private StateMachineState() {
        this.arn = Output.empty();
        this.creationDate = Output.empty();
        this.definition = Output.empty();
        this.loggingConfiguration = Output.empty();
        this.name = Output.empty();
        this.roleArn = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.tracingConfiguration = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> creationDate;
        private @Nullable Output<String> definition;
        private @Nullable Output<StateMachineLoggingConfigurationGetArgs> loggingConfiguration;
        private @Nullable Output<String> name;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<StateMachineTracingConfigurationGetArgs> tracingConfiguration;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationDate = defaults.creationDate;
    	      this.definition = defaults.definition;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.tracingConfiguration = defaults.tracingConfiguration;
    	      this.type = defaults.type;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder creationDate(@Nullable Output<String> creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public Builder creationDate(@Nullable String creationDate) {
            this.creationDate = Output.ofNullable(creationDate);
            return this;
        }
        public Builder definition(@Nullable Output<String> definition) {
            this.definition = definition;
            return this;
        }
        public Builder definition(@Nullable String definition) {
            this.definition = Output.ofNullable(definition);
            return this;
        }
        public Builder loggingConfiguration(@Nullable Output<StateMachineLoggingConfigurationGetArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }
        public Builder loggingConfiguration(@Nullable StateMachineLoggingConfigurationGetArgs loggingConfiguration) {
            this.loggingConfiguration = Output.ofNullable(loggingConfiguration);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder tracingConfiguration(@Nullable Output<StateMachineTracingConfigurationGetArgs> tracingConfiguration) {
            this.tracingConfiguration = tracingConfiguration;
            return this;
        }
        public Builder tracingConfiguration(@Nullable StateMachineTracingConfigurationGetArgs tracingConfiguration) {
            this.tracingConfiguration = Output.ofNullable(tracingConfiguration);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public StateMachineState build() {
            return new StateMachineState(arn, creationDate, definition, loggingConfiguration, name, roleArn, status, tags, tagsAll, tracingConfiguration, type);
        }
    }
}