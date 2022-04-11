// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sfn;

import io.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationArgs;
import io.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineArgs Empty = new StateMachineArgs();

    /**
     * The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
     * 
     */
    @Import(name="definition", required=true)
      private final Output<String> definition;

    public Output<String> getDefinition() {
        return this.definition;
    }

    /**
     * Defines what execution history events are logged and where they are logged. The `logging_configuration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
     * 
     */
    @Import(name="loggingConfiguration")
      private final @Nullable Output<StateMachineLoggingConfigurationArgs> loggingConfiguration;

    public Output<StateMachineLoggingConfigurationArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Codegen.empty() : this.loggingConfiguration;
    }

    /**
     * The name of the state machine. To enable logging with CloudWatch Logs, the name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Selects whether AWS X-Ray tracing is enabled.
     * 
     */
    @Import(name="tracingConfiguration")
      private final @Nullable Output<StateMachineTracingConfigurationArgs> tracingConfiguration;

    public Output<StateMachineTracingConfigurationArgs> getTracingConfiguration() {
        return this.tracingConfiguration == null ? Codegen.empty() : this.tracingConfiguration;
    }

    /**
     * Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public StateMachineArgs(
        Output<String> definition,
        @Nullable Output<StateMachineLoggingConfigurationArgs> loggingConfiguration,
        @Nullable Output<String> name,
        Output<String> roleArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<StateMachineTracingConfigurationArgs> tracingConfiguration,
        @Nullable Output<String> type) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.loggingConfiguration = loggingConfiguration;
        this.name = name;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
        this.tracingConfiguration = tracingConfiguration;
        this.type = type;
    }

    private StateMachineArgs() {
        this.definition = Codegen.empty();
        this.loggingConfiguration = Codegen.empty();
        this.name = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.tags = Codegen.empty();
        this.tracingConfiguration = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> definition;
        private @Nullable Output<StateMachineLoggingConfigurationArgs> loggingConfiguration;
        private @Nullable Output<String> name;
        private Output<String> roleArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<StateMachineTracingConfigurationArgs> tracingConfiguration;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.tracingConfiguration = defaults.tracingConfiguration;
    	      this.type = defaults.type;
        }

        public Builder definition(Output<String> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }
        public Builder definition(String definition) {
            this.definition = Output.of(Objects.requireNonNull(definition));
            return this;
        }
        public Builder loggingConfiguration(@Nullable Output<StateMachineLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }
        public Builder loggingConfiguration(@Nullable StateMachineLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Codegen.ofNullable(loggingConfiguration);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tracingConfiguration(@Nullable Output<StateMachineTracingConfigurationArgs> tracingConfiguration) {
            this.tracingConfiguration = tracingConfiguration;
            return this;
        }
        public Builder tracingConfiguration(@Nullable StateMachineTracingConfigurationArgs tracingConfiguration) {
            this.tracingConfiguration = Codegen.ofNullable(tracingConfiguration);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public StateMachineArgs build() {
            return new StateMachineArgs(definition, loggingConfiguration, name, roleArn, tags, tracingConfiguration, type);
        }
    }
}
