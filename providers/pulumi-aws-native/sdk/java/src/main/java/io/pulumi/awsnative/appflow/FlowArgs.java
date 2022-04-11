// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow;

import io.pulumi.awsnative.appflow.inputs.FlowDestinationFlowConfigArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSourceFlowConfigArgs;
import io.pulumi.awsnative.appflow.inputs.FlowTagArgs;
import io.pulumi.awsnative.appflow.inputs.FlowTaskArgs;
import io.pulumi.awsnative.appflow.inputs.FlowTriggerConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowArgs Empty = new FlowArgs();

    /**
     * Description of the flow.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * List of Destination connectors of the flow.
     * 
     */
    @Import(name="destinationFlowConfigList", required=true)
      private final Output<List<FlowDestinationFlowConfigArgs>> destinationFlowConfigList;

    public Output<List<FlowDestinationFlowConfigArgs>> getDestinationFlowConfigList() {
        return this.destinationFlowConfigList;
    }

    /**
     * Name of the flow.
     * 
     */
    @Import(name="flowName")
      private final @Nullable Output<String> flowName;

    public Output<String> getFlowName() {
        return this.flowName == null ? Codegen.empty() : this.flowName;
    }

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    @Import(name="kMSArn")
      private final @Nullable Output<String> kMSArn;

    public Output<String> getKMSArn() {
        return this.kMSArn == null ? Codegen.empty() : this.kMSArn;
    }

    /**
     * Configurations of Source connector of the flow.
     * 
     */
    @Import(name="sourceFlowConfig", required=true)
      private final Output<FlowSourceFlowConfigArgs> sourceFlowConfig;

    public Output<FlowSourceFlowConfigArgs> getSourceFlowConfig() {
        return this.sourceFlowConfig;
    }

    /**
     * List of Tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<FlowTagArgs>> tags;

    public Output<List<FlowTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * List of tasks for the flow.
     * 
     */
    @Import(name="tasks", required=true)
      private final Output<List<FlowTaskArgs>> tasks;

    public Output<List<FlowTaskArgs>> getTasks() {
        return this.tasks;
    }

    /**
     * Trigger settings of the flow.
     * 
     */
    @Import(name="triggerConfig", required=true)
      private final Output<FlowTriggerConfigArgs> triggerConfig;

    public Output<FlowTriggerConfigArgs> getTriggerConfig() {
        return this.triggerConfig;
    }

    public FlowArgs(
        @Nullable Output<String> description,
        Output<List<FlowDestinationFlowConfigArgs>> destinationFlowConfigList,
        @Nullable Output<String> flowName,
        @Nullable Output<String> kMSArn,
        Output<FlowSourceFlowConfigArgs> sourceFlowConfig,
        @Nullable Output<List<FlowTagArgs>> tags,
        Output<List<FlowTaskArgs>> tasks,
        Output<FlowTriggerConfigArgs> triggerConfig) {
        this.description = description;
        this.destinationFlowConfigList = Objects.requireNonNull(destinationFlowConfigList, "expected parameter 'destinationFlowConfigList' to be non-null");
        this.flowName = flowName;
        this.kMSArn = kMSArn;
        this.sourceFlowConfig = Objects.requireNonNull(sourceFlowConfig, "expected parameter 'sourceFlowConfig' to be non-null");
        this.tags = tags;
        this.tasks = Objects.requireNonNull(tasks, "expected parameter 'tasks' to be non-null");
        this.triggerConfig = Objects.requireNonNull(triggerConfig, "expected parameter 'triggerConfig' to be non-null");
    }

    private FlowArgs() {
        this.description = Codegen.empty();
        this.destinationFlowConfigList = Codegen.empty();
        this.flowName = Codegen.empty();
        this.kMSArn = Codegen.empty();
        this.sourceFlowConfig = Codegen.empty();
        this.tags = Codegen.empty();
        this.tasks = Codegen.empty();
        this.triggerConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<List<FlowDestinationFlowConfigArgs>> destinationFlowConfigList;
        private @Nullable Output<String> flowName;
        private @Nullable Output<String> kMSArn;
        private Output<FlowSourceFlowConfigArgs> sourceFlowConfig;
        private @Nullable Output<List<FlowTagArgs>> tags;
        private Output<List<FlowTaskArgs>> tasks;
        private Output<FlowTriggerConfigArgs> triggerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationFlowConfigList = defaults.destinationFlowConfigList;
    	      this.flowName = defaults.flowName;
    	      this.kMSArn = defaults.kMSArn;
    	      this.sourceFlowConfig = defaults.sourceFlowConfig;
    	      this.tags = defaults.tags;
    	      this.tasks = defaults.tasks;
    	      this.triggerConfig = defaults.triggerConfig;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder destinationFlowConfigList(Output<List<FlowDestinationFlowConfigArgs>> destinationFlowConfigList) {
            this.destinationFlowConfigList = Objects.requireNonNull(destinationFlowConfigList);
            return this;
        }
        public Builder destinationFlowConfigList(List<FlowDestinationFlowConfigArgs> destinationFlowConfigList) {
            this.destinationFlowConfigList = Output.of(Objects.requireNonNull(destinationFlowConfigList));
            return this;
        }
        public Builder destinationFlowConfigList(FlowDestinationFlowConfigArgs... destinationFlowConfigList) {
            return destinationFlowConfigList(List.of(destinationFlowConfigList));
        }
        public Builder flowName(@Nullable Output<String> flowName) {
            this.flowName = flowName;
            return this;
        }
        public Builder flowName(@Nullable String flowName) {
            this.flowName = Codegen.ofNullable(flowName);
            return this;
        }
        public Builder kMSArn(@Nullable Output<String> kMSArn) {
            this.kMSArn = kMSArn;
            return this;
        }
        public Builder kMSArn(@Nullable String kMSArn) {
            this.kMSArn = Codegen.ofNullable(kMSArn);
            return this;
        }
        public Builder sourceFlowConfig(Output<FlowSourceFlowConfigArgs> sourceFlowConfig) {
            this.sourceFlowConfig = Objects.requireNonNull(sourceFlowConfig);
            return this;
        }
        public Builder sourceFlowConfig(FlowSourceFlowConfigArgs sourceFlowConfig) {
            this.sourceFlowConfig = Output.of(Objects.requireNonNull(sourceFlowConfig));
            return this;
        }
        public Builder tags(@Nullable Output<List<FlowTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<FlowTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(FlowTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder tasks(Output<List<FlowTaskArgs>> tasks) {
            this.tasks = Objects.requireNonNull(tasks);
            return this;
        }
        public Builder tasks(List<FlowTaskArgs> tasks) {
            this.tasks = Output.of(Objects.requireNonNull(tasks));
            return this;
        }
        public Builder tasks(FlowTaskArgs... tasks) {
            return tasks(List.of(tasks));
        }
        public Builder triggerConfig(Output<FlowTriggerConfigArgs> triggerConfig) {
            this.triggerConfig = Objects.requireNonNull(triggerConfig);
            return this;
        }
        public Builder triggerConfig(FlowTriggerConfigArgs triggerConfig) {
            this.triggerConfig = Output.of(Objects.requireNonNull(triggerConfig));
            return this;
        }        public FlowArgs build() {
            return new FlowArgs(description, destinationFlowConfigList, flowName, kMSArn, sourceFlowConfig, tags, tasks, triggerConfig);
        }
    }
}
