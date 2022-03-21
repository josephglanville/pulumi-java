// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobStatusResponse {
    /**
     * Defines the job name.
     * 
     */
    private final String jobName;
    /**
     * Gets or sets the monitoring job percentage.
     * 
     */
    private final String jobProgress;

    @CustomType.Constructor
    private JobStatusResponse(
        @CustomType.Parameter("jobName") String jobName,
        @CustomType.Parameter("jobProgress") String jobProgress) {
        this.jobName = jobName;
        this.jobProgress = jobProgress;
    }

    /**
     * Defines the job name.
     * 
    */
    public String getJobName() {
        return this.jobName;
    }
    /**
     * Gets or sets the monitoring job percentage.
     * 
    */
    public String getJobProgress() {
        return this.jobProgress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobName;
        private String jobProgress;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobName = defaults.jobName;
    	      this.jobProgress = defaults.jobProgress;
        }

        public Builder jobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }
        public Builder jobProgress(String jobProgress) {
            this.jobProgress = Objects.requireNonNull(jobProgress);
            return this;
        }        public JobStatusResponse build() {
            return new JobStatusResponse(jobName, jobProgress);
        }
    }
}
