// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.inputs.IntegrationSourceFlowConfigArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationTaskArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationTriggerConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationFlowDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationFlowDefinitionArgs Empty = new IntegrationFlowDefinitionArgs();

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="flowName", required=true)
      private final Input<String> flowName;

    public Input<String> getFlowName() {
        return this.flowName;
    }

    @InputImport(name="kmsArn", required=true)
      private final Input<String> kmsArn;

    public Input<String> getKmsArn() {
        return this.kmsArn;
    }

    @InputImport(name="sourceFlowConfig", required=true)
      private final Input<IntegrationSourceFlowConfigArgs> sourceFlowConfig;

    public Input<IntegrationSourceFlowConfigArgs> getSourceFlowConfig() {
        return this.sourceFlowConfig;
    }

    @InputImport(name="tasks", required=true)
      private final Input<List<IntegrationTaskArgs>> tasks;

    public Input<List<IntegrationTaskArgs>> getTasks() {
        return this.tasks;
    }

    @InputImport(name="triggerConfig", required=true)
      private final Input<IntegrationTriggerConfigArgs> triggerConfig;

    public Input<IntegrationTriggerConfigArgs> getTriggerConfig() {
        return this.triggerConfig;
    }

    public IntegrationFlowDefinitionArgs(
        @Nullable Input<String> description,
        Input<String> flowName,
        Input<String> kmsArn,
        Input<IntegrationSourceFlowConfigArgs> sourceFlowConfig,
        Input<List<IntegrationTaskArgs>> tasks,
        Input<IntegrationTriggerConfigArgs> triggerConfig) {
        this.description = description;
        this.flowName = Objects.requireNonNull(flowName, "expected parameter 'flowName' to be non-null");
        this.kmsArn = Objects.requireNonNull(kmsArn, "expected parameter 'kmsArn' to be non-null");
        this.sourceFlowConfig = Objects.requireNonNull(sourceFlowConfig, "expected parameter 'sourceFlowConfig' to be non-null");
        this.tasks = Objects.requireNonNull(tasks, "expected parameter 'tasks' to be non-null");
        this.triggerConfig = Objects.requireNonNull(triggerConfig, "expected parameter 'triggerConfig' to be non-null");
    }

    private IntegrationFlowDefinitionArgs() {
        this.description = Input.empty();
        this.flowName = Input.empty();
        this.kmsArn = Input.empty();
        this.sourceFlowConfig = Input.empty();
        this.tasks = Input.empty();
        this.triggerConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationFlowDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> flowName;
        private Input<String> kmsArn;
        private Input<IntegrationSourceFlowConfigArgs> sourceFlowConfig;
        private Input<List<IntegrationTaskArgs>> tasks;
        private Input<IntegrationTriggerConfigArgs> triggerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationFlowDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.flowName = defaults.flowName;
    	      this.kmsArn = defaults.kmsArn;
    	      this.sourceFlowConfig = defaults.sourceFlowConfig;
    	      this.tasks = defaults.tasks;
    	      this.triggerConfig = defaults.triggerConfig;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFlowName(Input<String> flowName) {
            this.flowName = Objects.requireNonNull(flowName);
            return this;
        }

        public Builder setFlowName(String flowName) {
            this.flowName = Input.of(Objects.requireNonNull(flowName));
            return this;
        }

        public Builder setKmsArn(Input<String> kmsArn) {
            this.kmsArn = Objects.requireNonNull(kmsArn);
            return this;
        }

        public Builder setKmsArn(String kmsArn) {
            this.kmsArn = Input.of(Objects.requireNonNull(kmsArn));
            return this;
        }

        public Builder setSourceFlowConfig(Input<IntegrationSourceFlowConfigArgs> sourceFlowConfig) {
            this.sourceFlowConfig = Objects.requireNonNull(sourceFlowConfig);
            return this;
        }

        public Builder setSourceFlowConfig(IntegrationSourceFlowConfigArgs sourceFlowConfig) {
            this.sourceFlowConfig = Input.of(Objects.requireNonNull(sourceFlowConfig));
            return this;
        }

        public Builder setTasks(Input<List<IntegrationTaskArgs>> tasks) {
            this.tasks = Objects.requireNonNull(tasks);
            return this;
        }

        public Builder setTasks(List<IntegrationTaskArgs> tasks) {
            this.tasks = Input.of(Objects.requireNonNull(tasks));
            return this;
        }

        public Builder setTriggerConfig(Input<IntegrationTriggerConfigArgs> triggerConfig) {
            this.triggerConfig = Objects.requireNonNull(triggerConfig);
            return this;
        }

        public Builder setTriggerConfig(IntegrationTriggerConfigArgs triggerConfig) {
            this.triggerConfig = Input.of(Objects.requireNonNull(triggerConfig));
            return this;
        }
        public IntegrationFlowDefinitionArgs build() {
            return new IntegrationFlowDefinitionArgs(description, flowName, kmsArn, sourceFlowConfig, tasks, triggerConfig);
        }
    }
}
