// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceWorkspacePropertiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceWorkspacePropertiesGetArgs Empty = new WorkspaceWorkspacePropertiesGetArgs();

    /**
     * The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO` and `GRAPHICSPRO`.
     * 
     */
    @Import(name="computeTypeName")
      private final @Nullable Output<String> computeTypeName;

    public Output<String> getComputeTypeName() {
        return this.computeTypeName == null ? Codegen.empty() : this.computeTypeName;
    }

    /**
     * The size of the root volume.
     * 
     */
    @Import(name="rootVolumeSizeGib")
      private final @Nullable Output<Integer> rootVolumeSizeGib;

    public Output<Integer> getRootVolumeSizeGib() {
        return this.rootVolumeSizeGib == null ? Codegen.empty() : this.rootVolumeSizeGib;
    }

    /**
     * The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
     * 
     */
    @Import(name="runningMode")
      private final @Nullable Output<String> runningMode;

    public Output<String> getRunningMode() {
        return this.runningMode == null ? Codegen.empty() : this.runningMode;
    }

    /**
     * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
     * 
     */
    @Import(name="runningModeAutoStopTimeoutInMinutes")
      private final @Nullable Output<Integer> runningModeAutoStopTimeoutInMinutes;

    public Output<Integer> getRunningModeAutoStopTimeoutInMinutes() {
        return this.runningModeAutoStopTimeoutInMinutes == null ? Codegen.empty() : this.runningModeAutoStopTimeoutInMinutes;
    }

    /**
     * The size of the user storage.
     * 
     */
    @Import(name="userVolumeSizeGib")
      private final @Nullable Output<Integer> userVolumeSizeGib;

    public Output<Integer> getUserVolumeSizeGib() {
        return this.userVolumeSizeGib == null ? Codegen.empty() : this.userVolumeSizeGib;
    }

    public WorkspaceWorkspacePropertiesGetArgs(
        @Nullable Output<String> computeTypeName,
        @Nullable Output<Integer> rootVolumeSizeGib,
        @Nullable Output<String> runningMode,
        @Nullable Output<Integer> runningModeAutoStopTimeoutInMinutes,
        @Nullable Output<Integer> userVolumeSizeGib) {
        this.computeTypeName = computeTypeName;
        this.rootVolumeSizeGib = rootVolumeSizeGib;
        this.runningMode = runningMode;
        this.runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes;
        this.userVolumeSizeGib = userVolumeSizeGib;
    }

    private WorkspaceWorkspacePropertiesGetArgs() {
        this.computeTypeName = Codegen.empty();
        this.rootVolumeSizeGib = Codegen.empty();
        this.runningMode = Codegen.empty();
        this.runningModeAutoStopTimeoutInMinutes = Codegen.empty();
        this.userVolumeSizeGib = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceWorkspacePropertiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> computeTypeName;
        private @Nullable Output<Integer> rootVolumeSizeGib;
        private @Nullable Output<String> runningMode;
        private @Nullable Output<Integer> runningModeAutoStopTimeoutInMinutes;
        private @Nullable Output<Integer> userVolumeSizeGib;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceWorkspacePropertiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeTypeName = defaults.computeTypeName;
    	      this.rootVolumeSizeGib = defaults.rootVolumeSizeGib;
    	      this.runningMode = defaults.runningMode;
    	      this.runningModeAutoStopTimeoutInMinutes = defaults.runningModeAutoStopTimeoutInMinutes;
    	      this.userVolumeSizeGib = defaults.userVolumeSizeGib;
        }

        public Builder computeTypeName(@Nullable Output<String> computeTypeName) {
            this.computeTypeName = computeTypeName;
            return this;
        }
        public Builder computeTypeName(@Nullable String computeTypeName) {
            this.computeTypeName = Codegen.ofNullable(computeTypeName);
            return this;
        }
        public Builder rootVolumeSizeGib(@Nullable Output<Integer> rootVolumeSizeGib) {
            this.rootVolumeSizeGib = rootVolumeSizeGib;
            return this;
        }
        public Builder rootVolumeSizeGib(@Nullable Integer rootVolumeSizeGib) {
            this.rootVolumeSizeGib = Codegen.ofNullable(rootVolumeSizeGib);
            return this;
        }
        public Builder runningMode(@Nullable Output<String> runningMode) {
            this.runningMode = runningMode;
            return this;
        }
        public Builder runningMode(@Nullable String runningMode) {
            this.runningMode = Codegen.ofNullable(runningMode);
            return this;
        }
        public Builder runningModeAutoStopTimeoutInMinutes(@Nullable Output<Integer> runningModeAutoStopTimeoutInMinutes) {
            this.runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes;
            return this;
        }
        public Builder runningModeAutoStopTimeoutInMinutes(@Nullable Integer runningModeAutoStopTimeoutInMinutes) {
            this.runningModeAutoStopTimeoutInMinutes = Codegen.ofNullable(runningModeAutoStopTimeoutInMinutes);
            return this;
        }
        public Builder userVolumeSizeGib(@Nullable Output<Integer> userVolumeSizeGib) {
            this.userVolumeSizeGib = userVolumeSizeGib;
            return this;
        }
        public Builder userVolumeSizeGib(@Nullable Integer userVolumeSizeGib) {
            this.userVolumeSizeGib = Codegen.ofNullable(userVolumeSizeGib);
            return this;
        }        public WorkspaceWorkspacePropertiesGetArgs build() {
            return new WorkspaceWorkspacePropertiesGetArgs(computeTypeName, rootVolumeSizeGib, runningMode, runningModeAutoStopTimeoutInMinutes, userVolumeSizeGib);
        }
    }
}
