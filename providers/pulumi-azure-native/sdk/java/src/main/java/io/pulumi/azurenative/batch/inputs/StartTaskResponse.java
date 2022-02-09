// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.EnvironmentSettingResponse;
import io.pulumi.azurenative.batch.inputs.ResourceFileResponse;
import io.pulumi.azurenative.batch.inputs.TaskContainerSettingsResponse;
import io.pulumi.azurenative.batch.inputs.UserIdentityResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StartTaskResponse extends io.pulumi.resources.InvokeArgs {

    public static final StartTaskResponse Empty = new StartTaskResponse();

    @InputImport(name="commandLine")
    private final @Nullable String commandLine;

    public Optional<String> getCommandLine() {
        return this.commandLine == null ? Optional.empty() : Optional.ofNullable(this.commandLine);
    }

    @InputImport(name="containerSettings")
    private final @Nullable TaskContainerSettingsResponse containerSettings;

    public Optional<TaskContainerSettingsResponse> getContainerSettings() {
        return this.containerSettings == null ? Optional.empty() : Optional.ofNullable(this.containerSettings);
    }

    @InputImport(name="environmentSettings")
    private final @Nullable List<EnvironmentSettingResponse> environmentSettings;

    public List<EnvironmentSettingResponse> getEnvironmentSettings() {
        return this.environmentSettings == null ? List.of() : this.environmentSettings;
    }

    @InputImport(name="maxTaskRetryCount")
    private final @Nullable Integer maxTaskRetryCount;

    public Optional<Integer> getMaxTaskRetryCount() {
        return this.maxTaskRetryCount == null ? Optional.empty() : Optional.ofNullable(this.maxTaskRetryCount);
    }

    @InputImport(name="resourceFiles")
    private final @Nullable List<ResourceFileResponse> resourceFiles;

    public List<ResourceFileResponse> getResourceFiles() {
        return this.resourceFiles == null ? List.of() : this.resourceFiles;
    }

    @InputImport(name="userIdentity")
    private final @Nullable UserIdentityResponse userIdentity;

    public Optional<UserIdentityResponse> getUserIdentity() {
        return this.userIdentity == null ? Optional.empty() : Optional.ofNullable(this.userIdentity);
    }

    @InputImport(name="waitForSuccess")
    private final @Nullable Boolean waitForSuccess;

    public Optional<Boolean> getWaitForSuccess() {
        return this.waitForSuccess == null ? Optional.empty() : Optional.ofNullable(this.waitForSuccess);
    }

    public StartTaskResponse(
        @Nullable String commandLine,
        @Nullable TaskContainerSettingsResponse containerSettings,
        @Nullable List<EnvironmentSettingResponse> environmentSettings,
        @Nullable Integer maxTaskRetryCount,
        @Nullable List<ResourceFileResponse> resourceFiles,
        @Nullable UserIdentityResponse userIdentity,
        @Nullable Boolean waitForSuccess) {
        this.commandLine = commandLine;
        this.containerSettings = containerSettings;
        this.environmentSettings = environmentSettings;
        this.maxTaskRetryCount = maxTaskRetryCount;
        this.resourceFiles = resourceFiles;
        this.userIdentity = userIdentity;
        this.waitForSuccess = waitForSuccess;
    }

    private StartTaskResponse() {
        this.commandLine = null;
        this.containerSettings = null;
        this.environmentSettings = List.of();
        this.maxTaskRetryCount = null;
        this.resourceFiles = List.of();
        this.userIdentity = null;
        this.waitForSuccess = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StartTaskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commandLine;
        private @Nullable TaskContainerSettingsResponse containerSettings;
        private @Nullable List<EnvironmentSettingResponse> environmentSettings;
        private @Nullable Integer maxTaskRetryCount;
        private @Nullable List<ResourceFileResponse> resourceFiles;
        private @Nullable UserIdentityResponse userIdentity;
        private @Nullable Boolean waitForSuccess;

        public Builder() {
    	      // Empty
        }

        public Builder(StartTaskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLine = defaults.commandLine;
    	      this.containerSettings = defaults.containerSettings;
    	      this.environmentSettings = defaults.environmentSettings;
    	      this.maxTaskRetryCount = defaults.maxTaskRetryCount;
    	      this.resourceFiles = defaults.resourceFiles;
    	      this.userIdentity = defaults.userIdentity;
    	      this.waitForSuccess = defaults.waitForSuccess;
        }

        public Builder setCommandLine(@Nullable String commandLine) {
            this.commandLine = commandLine;
            return this;
        }

        public Builder setContainerSettings(@Nullable TaskContainerSettingsResponse containerSettings) {
            this.containerSettings = containerSettings;
            return this;
        }

        public Builder setEnvironmentSettings(@Nullable List<EnvironmentSettingResponse> environmentSettings) {
            this.environmentSettings = environmentSettings;
            return this;
        }

        public Builder setMaxTaskRetryCount(@Nullable Integer maxTaskRetryCount) {
            this.maxTaskRetryCount = maxTaskRetryCount;
            return this;
        }

        public Builder setResourceFiles(@Nullable List<ResourceFileResponse> resourceFiles) {
            this.resourceFiles = resourceFiles;
            return this;
        }

        public Builder setUserIdentity(@Nullable UserIdentityResponse userIdentity) {
            this.userIdentity = userIdentity;
            return this;
        }

        public Builder setWaitForSuccess(@Nullable Boolean waitForSuccess) {
            this.waitForSuccess = waitForSuccess;
            return this;
        }

        public StartTaskResponse build() {
            return new StartTaskResponse(commandLine, containerSettings, environmentSettings, maxTaskRetryCount, resourceFiles, userIdentity, waitForSuccess);
        }
    }
}
