// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.EnvironmentSettingArgs;
import io.pulumi.azurenative.batch.inputs.ResourceFileArgs;
import io.pulumi.azurenative.batch.inputs.TaskContainerSettingsArgs;
import io.pulumi.azurenative.batch.inputs.UserIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * In some cases the start task may be re-run even though the node was not rebooted. Due to this, start tasks should be idempotent and exit gracefully if the setup they're performing has already been done. Special care should be taken to avoid start tasks which create breakaway process or install/launch services from the start task working directory, as this will block Batch from being able to re-run the start task.
 * 
 */
public final class StartTaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final StartTaskArgs Empty = new StartTaskArgs();

    /**
     * The command line does not run under a shell, and therefore cannot take advantage of shell features such as environment variable expansion. If you want to take advantage of such features, you should invoke the shell in the command line, for example using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux. Required if any other properties of the startTask are specified.
     * 
     */
    @InputImport(name="commandLine")
      private final @Nullable Input<String> commandLine;

    public Input<String> getCommandLine() {
        return this.commandLine == null ? Input.empty() : this.commandLine;
    }

    /**
     * When this is specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into the container, all task environment variables are mapped into the container, and the task command line is executed in the container.
     * 
     */
    @InputImport(name="containerSettings")
      private final @Nullable Input<TaskContainerSettingsArgs> containerSettings;

    public Input<TaskContainerSettingsArgs> getContainerSettings() {
        return this.containerSettings == null ? Input.empty() : this.containerSettings;
    }

    @InputImport(name="environmentSettings")
      private final @Nullable Input<List<EnvironmentSettingArgs>> environmentSettings;

    public Input<List<EnvironmentSettingArgs>> getEnvironmentSettings() {
        return this.environmentSettings == null ? Input.empty() : this.environmentSettings;
    }

    /**
     * The Batch service retries a task if its exit code is nonzero. Note that this value specifically controls the number of retries. The Batch service will try the task once, and may then retry up to this limit. For example, if the maximum retry count is 3, Batch tries the task up to 4 times (one initial try and 3 retries). If the maximum retry count is 0, the Batch service does not retry the task. If the maximum retry count is -1, the Batch service retries the task without limit.
     * 
     */
    @InputImport(name="maxTaskRetryCount")
      private final @Nullable Input<Integer> maxTaskRetryCount;

    public Input<Integer> getMaxTaskRetryCount() {
        return this.maxTaskRetryCount == null ? Input.empty() : this.maxTaskRetryCount;
    }

    @InputImport(name="resourceFiles")
      private final @Nullable Input<List<ResourceFileArgs>> resourceFiles;

    public Input<List<ResourceFileArgs>> getResourceFiles() {
        return this.resourceFiles == null ? Input.empty() : this.resourceFiles;
    }

    /**
     * If omitted, the task runs as a non-administrative user unique to the task.
     * 
     */
    @InputImport(name="userIdentity")
      private final @Nullable Input<UserIdentityArgs> userIdentity;

    public Input<UserIdentityArgs> getUserIdentity() {
        return this.userIdentity == null ? Input.empty() : this.userIdentity;
    }

    /**
     * If true and the start task fails on a compute node, the Batch service retries the start task up to its maximum retry count (maxTaskRetryCount). If the task has still not completed successfully after all retries, then the Batch service marks the compute node unusable, and will not schedule tasks to it. This condition can be detected via the node state and scheduling error detail. If false, the Batch service will not wait for the start task to complete. In this case, other tasks can start executing on the compute node while the start task is still running; and even if the start task fails, new tasks will continue to be scheduled on the node. The default is true.
     * 
     */
    @InputImport(name="waitForSuccess")
      private final @Nullable Input<Boolean> waitForSuccess;

    public Input<Boolean> getWaitForSuccess() {
        return this.waitForSuccess == null ? Input.empty() : this.waitForSuccess;
    }

    public StartTaskArgs(
        @Nullable Input<String> commandLine,
        @Nullable Input<TaskContainerSettingsArgs> containerSettings,
        @Nullable Input<List<EnvironmentSettingArgs>> environmentSettings,
        @Nullable Input<Integer> maxTaskRetryCount,
        @Nullable Input<List<ResourceFileArgs>> resourceFiles,
        @Nullable Input<UserIdentityArgs> userIdentity,
        @Nullable Input<Boolean> waitForSuccess) {
        this.commandLine = commandLine;
        this.containerSettings = containerSettings;
        this.environmentSettings = environmentSettings;
        this.maxTaskRetryCount = maxTaskRetryCount;
        this.resourceFiles = resourceFiles;
        this.userIdentity = userIdentity;
        this.waitForSuccess = waitForSuccess;
    }

    private StartTaskArgs() {
        this.commandLine = Input.empty();
        this.containerSettings = Input.empty();
        this.environmentSettings = Input.empty();
        this.maxTaskRetryCount = Input.empty();
        this.resourceFiles = Input.empty();
        this.userIdentity = Input.empty();
        this.waitForSuccess = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StartTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> commandLine;
        private @Nullable Input<TaskContainerSettingsArgs> containerSettings;
        private @Nullable Input<List<EnvironmentSettingArgs>> environmentSettings;
        private @Nullable Input<Integer> maxTaskRetryCount;
        private @Nullable Input<List<ResourceFileArgs>> resourceFiles;
        private @Nullable Input<UserIdentityArgs> userIdentity;
        private @Nullable Input<Boolean> waitForSuccess;

        public Builder() {
    	      // Empty
        }

        public Builder(StartTaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLine = defaults.commandLine;
    	      this.containerSettings = defaults.containerSettings;
    	      this.environmentSettings = defaults.environmentSettings;
    	      this.maxTaskRetryCount = defaults.maxTaskRetryCount;
    	      this.resourceFiles = defaults.resourceFiles;
    	      this.userIdentity = defaults.userIdentity;
    	      this.waitForSuccess = defaults.waitForSuccess;
        }

        public Builder setCommandLine(@Nullable Input<String> commandLine) {
            this.commandLine = commandLine;
            return this;
        }

        public Builder setCommandLine(@Nullable String commandLine) {
            this.commandLine = Input.ofNullable(commandLine);
            return this;
        }

        public Builder setContainerSettings(@Nullable Input<TaskContainerSettingsArgs> containerSettings) {
            this.containerSettings = containerSettings;
            return this;
        }

        public Builder setContainerSettings(@Nullable TaskContainerSettingsArgs containerSettings) {
            this.containerSettings = Input.ofNullable(containerSettings);
            return this;
        }

        public Builder setEnvironmentSettings(@Nullable Input<List<EnvironmentSettingArgs>> environmentSettings) {
            this.environmentSettings = environmentSettings;
            return this;
        }

        public Builder setEnvironmentSettings(@Nullable List<EnvironmentSettingArgs> environmentSettings) {
            this.environmentSettings = Input.ofNullable(environmentSettings);
            return this;
        }

        public Builder setMaxTaskRetryCount(@Nullable Input<Integer> maxTaskRetryCount) {
            this.maxTaskRetryCount = maxTaskRetryCount;
            return this;
        }

        public Builder setMaxTaskRetryCount(@Nullable Integer maxTaskRetryCount) {
            this.maxTaskRetryCount = Input.ofNullable(maxTaskRetryCount);
            return this;
        }

        public Builder setResourceFiles(@Nullable Input<List<ResourceFileArgs>> resourceFiles) {
            this.resourceFiles = resourceFiles;
            return this;
        }

        public Builder setResourceFiles(@Nullable List<ResourceFileArgs> resourceFiles) {
            this.resourceFiles = Input.ofNullable(resourceFiles);
            return this;
        }

        public Builder setUserIdentity(@Nullable Input<UserIdentityArgs> userIdentity) {
            this.userIdentity = userIdentity;
            return this;
        }

        public Builder setUserIdentity(@Nullable UserIdentityArgs userIdentity) {
            this.userIdentity = Input.ofNullable(userIdentity);
            return this;
        }

        public Builder setWaitForSuccess(@Nullable Input<Boolean> waitForSuccess) {
            this.waitForSuccess = waitForSuccess;
            return this;
        }

        public Builder setWaitForSuccess(@Nullable Boolean waitForSuccess) {
            this.waitForSuccess = Input.ofNullable(waitForSuccess);
            return this;
        }
        public StartTaskArgs build() {
            return new StartTaskArgs(commandLine, containerSettings, environmentSettings, maxTaskRetryCount, resourceFiles, userIdentity, waitForSuccess);
        }
    }
}
