// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.aws.codebuild.outputs.ProjectLogsConfigCloudwatchLogs;
import io.pulumi.aws.codebuild.outputs.ProjectLogsConfigS3Logs;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectLogsConfig {
    /**
     * Configuration block. Detailed below.
     * 
     */
    private final @Nullable ProjectLogsConfigCloudwatchLogs cloudwatchLogs;
    /**
     * Configuration block. Detailed below.
     * 
     */
    private final @Nullable ProjectLogsConfigS3Logs s3Logs;

    @CustomType.Constructor
    private ProjectLogsConfig(
        @CustomType.Parameter("cloudwatchLogs") @Nullable ProjectLogsConfigCloudwatchLogs cloudwatchLogs,
        @CustomType.Parameter("s3Logs") @Nullable ProjectLogsConfigS3Logs s3Logs) {
        this.cloudwatchLogs = cloudwatchLogs;
        this.s3Logs = s3Logs;
    }

    /**
     * Configuration block. Detailed below.
     * 
    */
    public Optional<ProjectLogsConfigCloudwatchLogs> getCloudwatchLogs() {
        return Optional.ofNullable(this.cloudwatchLogs);
    }
    /**
     * Configuration block. Detailed below.
     * 
    */
    public Optional<ProjectLogsConfigS3Logs> getS3Logs() {
        return Optional.ofNullable(this.s3Logs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLogsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ProjectLogsConfigCloudwatchLogs cloudwatchLogs;
        private @Nullable ProjectLogsConfigS3Logs s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectLogsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogs = defaults.cloudwatchLogs;
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder cloudwatchLogs(@Nullable ProjectLogsConfigCloudwatchLogs cloudwatchLogs) {
            this.cloudwatchLogs = cloudwatchLogs;
            return this;
        }
        public Builder s3Logs(@Nullable ProjectLogsConfigS3Logs s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }        public ProjectLogsConfig build() {
            return new ProjectLogsConfig(cloudwatchLogs, s3Logs);
        }
    }
}