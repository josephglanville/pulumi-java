// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the job status.
 * 
 */
public final class JobStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobStatusResponse Empty = new JobStatusResponse();

    /**
     * Defines the job name.
     * 
     */
    @InputImport(name="jobName", required=true)
      private final String jobName;

    public String getJobName() {
        return this.jobName;
    }

    /**
     * Gets or sets the monitoring job percentage.
     * 
     */
    @InputImport(name="jobProgress", required=true)
      private final String jobProgress;

    public String getJobProgress() {
        return this.jobProgress;
    }

    public JobStatusResponse(
        String jobName,
        String jobProgress) {
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.jobProgress = Objects.requireNonNull(jobProgress, "expected parameter 'jobProgress' to be non-null");
    }

    private JobStatusResponse() {
        this.jobName = null;
        this.jobProgress = null;
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

        public Builder setJobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setJobProgress(String jobProgress) {
            this.jobProgress = Objects.requireNonNull(jobProgress);
            return this;
        }
        public JobStatusResponse build() {
            return new JobStatusResponse(jobName, jobProgress);
        }
    }
}
