// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CurrentJobDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CurrentJobDetailsResponse Empty = new CurrentJobDetailsResponse();

    @InputImport(name="jobId")
    private final @Nullable String jobId;

    public Optional<String> getJobId() {
        return this.jobId == null ? Optional.empty() : Optional.ofNullable(this.jobId);
    }

    @InputImport(name="jobName")
    private final @Nullable String jobName;

    public Optional<String> getJobName() {
        return this.jobName == null ? Optional.empty() : Optional.ofNullable(this.jobName);
    }

    @InputImport(name="startTime")
    private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    public CurrentJobDetailsResponse(
        @Nullable String jobId,
        @Nullable String jobName,
        @Nullable String startTime) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.startTime = startTime;
    }

    private CurrentJobDetailsResponse() {
        this.jobId = null;
        this.jobName = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CurrentJobDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jobId;
        private @Nullable String jobName;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CurrentJobDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.jobName = defaults.jobName;
    	      this.startTime = defaults.startTime;
        }

        public Builder setJobId(@Nullable String jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder setJobName(@Nullable String jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public CurrentJobDetailsResponse build() {
            return new CurrentJobDetailsResponse(jobId, jobName, startTime);
        }
    }
}