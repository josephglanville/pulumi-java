// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWorkspaceWorkspaceProperty {
    /**
     * The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO` and `GRAPHICSPRO`.
     * 
     */
    private final String computeTypeName;
    /**
     * The size of the root volume.
     * 
     */
    private final Integer rootVolumeSizeGib;
    /**
     * The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
     * 
     */
    private final String runningMode;
    /**
     * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
     * 
     */
    private final Integer runningModeAutoStopTimeoutInMinutes;
    /**
     * The size of the user storage.
     * 
     */
    private final Integer userVolumeSizeGib;

    @CustomType.Constructor
    private GetWorkspaceWorkspaceProperty(
        @CustomType.Parameter("computeTypeName") String computeTypeName,
        @CustomType.Parameter("rootVolumeSizeGib") Integer rootVolumeSizeGib,
        @CustomType.Parameter("runningMode") String runningMode,
        @CustomType.Parameter("runningModeAutoStopTimeoutInMinutes") Integer runningModeAutoStopTimeoutInMinutes,
        @CustomType.Parameter("userVolumeSizeGib") Integer userVolumeSizeGib) {
        this.computeTypeName = computeTypeName;
        this.rootVolumeSizeGib = rootVolumeSizeGib;
        this.runningMode = runningMode;
        this.runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes;
        this.userVolumeSizeGib = userVolumeSizeGib;
    }

    /**
     * The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO` and `GRAPHICSPRO`.
     * 
    */
    public String getComputeTypeName() {
        return this.computeTypeName;
    }
    /**
     * The size of the root volume.
     * 
    */
    public Integer getRootVolumeSizeGib() {
        return this.rootVolumeSizeGib;
    }
    /**
     * The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
     * 
    */
    public String getRunningMode() {
        return this.runningMode;
    }
    /**
     * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
     * 
    */
    public Integer getRunningModeAutoStopTimeoutInMinutes() {
        return this.runningModeAutoStopTimeoutInMinutes;
    }
    /**
     * The size of the user storage.
     * 
    */
    public Integer getUserVolumeSizeGib() {
        return this.userVolumeSizeGib;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceWorkspaceProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computeTypeName;
        private Integer rootVolumeSizeGib;
        private String runningMode;
        private Integer runningModeAutoStopTimeoutInMinutes;
        private Integer userVolumeSizeGib;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceWorkspaceProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeTypeName = defaults.computeTypeName;
    	      this.rootVolumeSizeGib = defaults.rootVolumeSizeGib;
    	      this.runningMode = defaults.runningMode;
    	      this.runningModeAutoStopTimeoutInMinutes = defaults.runningModeAutoStopTimeoutInMinutes;
    	      this.userVolumeSizeGib = defaults.userVolumeSizeGib;
        }

        public Builder computeTypeName(String computeTypeName) {
            this.computeTypeName = Objects.requireNonNull(computeTypeName);
            return this;
        }
        public Builder rootVolumeSizeGib(Integer rootVolumeSizeGib) {
            this.rootVolumeSizeGib = Objects.requireNonNull(rootVolumeSizeGib);
            return this;
        }
        public Builder runningMode(String runningMode) {
            this.runningMode = Objects.requireNonNull(runningMode);
            return this;
        }
        public Builder runningModeAutoStopTimeoutInMinutes(Integer runningModeAutoStopTimeoutInMinutes) {
            this.runningModeAutoStopTimeoutInMinutes = Objects.requireNonNull(runningModeAutoStopTimeoutInMinutes);
            return this;
        }
        public Builder userVolumeSizeGib(Integer userVolumeSizeGib) {
            this.userVolumeSizeGib = Objects.requireNonNull(userVolumeSizeGib);
            return this;
        }        public GetWorkspaceWorkspaceProperty build() {
            return new GetWorkspaceWorkspaceProperty(computeTypeName, rootVolumeSizeGib, runningMode, runningModeAutoStopTimeoutInMinutes, userVolumeSizeGib);
        }
    }
}