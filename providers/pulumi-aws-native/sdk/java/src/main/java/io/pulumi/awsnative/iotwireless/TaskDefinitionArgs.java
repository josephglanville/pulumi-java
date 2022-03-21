// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.enums.TaskDefinitionType;
import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs;
import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionTagArgs;
import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionUpdateWirelessGatewayTaskCreateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionArgs Empty = new TaskDefinitionArgs();

    /**
     * Whether to automatically create tasks using this task definition for all gateways with the specified current version. If false, the task must me created by calling CreateWirelessGatewayTask.
     * 
     */
    @Import(name="autoCreateTasks", required=true)
      private final Output<Boolean> autoCreateTasks;

    public Output<Boolean> getAutoCreateTasks() {
        return this.autoCreateTasks;
    }

    /**
     * The list of task definitions.
     * 
     */
    @Import(name="loRaWANUpdateGatewayTaskEntry")
      private final @Nullable Output<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> loRaWANUpdateGatewayTaskEntry;

    public Output<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> getLoRaWANUpdateGatewayTaskEntry() {
        return this.loRaWANUpdateGatewayTaskEntry == null ? Output.empty() : this.loRaWANUpdateGatewayTaskEntry;
    }

    /**
     * The name of the new resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A list of key-value pairs that contain metadata for the destination.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<TaskDefinitionTagArgs>> tags;

    public Output<List<TaskDefinitionTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A filter to list only the wireless gateway task definitions that use this task definition type
     * 
     */
    @Import(name="taskDefinitionType")
      private final @Nullable Output<TaskDefinitionType> taskDefinitionType;

    public Output<TaskDefinitionType> getTaskDefinitionType() {
        return this.taskDefinitionType == null ? Output.empty() : this.taskDefinitionType;
    }

    /**
     * Information about the gateways to update.
     * 
     */
    @Import(name="update")
      private final @Nullable Output<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> update;

    public Output<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> getUpdate() {
        return this.update == null ? Output.empty() : this.update;
    }

    public TaskDefinitionArgs(
        Output<Boolean> autoCreateTasks,
        @Nullable Output<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> loRaWANUpdateGatewayTaskEntry,
        @Nullable Output<String> name,
        @Nullable Output<List<TaskDefinitionTagArgs>> tags,
        @Nullable Output<TaskDefinitionType> taskDefinitionType,
        @Nullable Output<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> update) {
        this.autoCreateTasks = Objects.requireNonNull(autoCreateTasks, "expected parameter 'autoCreateTasks' to be non-null");
        this.loRaWANUpdateGatewayTaskEntry = loRaWANUpdateGatewayTaskEntry;
        this.name = name;
        this.tags = tags;
        this.taskDefinitionType = taskDefinitionType;
        this.update = update;
    }

    private TaskDefinitionArgs() {
        this.autoCreateTasks = Output.empty();
        this.loRaWANUpdateGatewayTaskEntry = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.taskDefinitionType = Output.empty();
        this.update = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> autoCreateTasks;
        private @Nullable Output<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> loRaWANUpdateGatewayTaskEntry;
        private @Nullable Output<String> name;
        private @Nullable Output<List<TaskDefinitionTagArgs>> tags;
        private @Nullable Output<TaskDefinitionType> taskDefinitionType;
        private @Nullable Output<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> update;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateTasks = defaults.autoCreateTasks;
    	      this.loRaWANUpdateGatewayTaskEntry = defaults.loRaWANUpdateGatewayTaskEntry;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.taskDefinitionType = defaults.taskDefinitionType;
    	      this.update = defaults.update;
        }

        public Builder autoCreateTasks(Output<Boolean> autoCreateTasks) {
            this.autoCreateTasks = Objects.requireNonNull(autoCreateTasks);
            return this;
        }
        public Builder autoCreateTasks(Boolean autoCreateTasks) {
            this.autoCreateTasks = Output.of(Objects.requireNonNull(autoCreateTasks));
            return this;
        }
        public Builder loRaWANUpdateGatewayTaskEntry(@Nullable Output<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> loRaWANUpdateGatewayTaskEntry) {
            this.loRaWANUpdateGatewayTaskEntry = loRaWANUpdateGatewayTaskEntry;
            return this;
        }
        public Builder loRaWANUpdateGatewayTaskEntry(@Nullable TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs loRaWANUpdateGatewayTaskEntry) {
            this.loRaWANUpdateGatewayTaskEntry = Output.ofNullable(loRaWANUpdateGatewayTaskEntry);
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
        public Builder tags(@Nullable Output<List<TaskDefinitionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<TaskDefinitionTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(TaskDefinitionTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder taskDefinitionType(@Nullable Output<TaskDefinitionType> taskDefinitionType) {
            this.taskDefinitionType = taskDefinitionType;
            return this;
        }
        public Builder taskDefinitionType(@Nullable TaskDefinitionType taskDefinitionType) {
            this.taskDefinitionType = Output.ofNullable(taskDefinitionType);
            return this;
        }
        public Builder update(@Nullable Output<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> update) {
            this.update = update;
            return this;
        }
        public Builder update(@Nullable TaskDefinitionUpdateWirelessGatewayTaskCreateArgs update) {
            this.update = Output.ofNullable(update);
            return this;
        }        public TaskDefinitionArgs build() {
            return new TaskDefinitionArgs(autoCreateTasks, loRaWANUpdateGatewayTaskEntry, name, tags, taskDefinitionType, update);
        }
    }
}
