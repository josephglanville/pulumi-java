// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobReference {
    private final @Nullable String jobId;

    @CustomType.Constructor
    private JobReference(@CustomType.Parameter("jobId") @Nullable String jobId) {
        this.jobId = jobId;
    }

    public Optional<String> getJobId() {
        return Optional.ofNullable(this.jobId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jobId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
        }

        public Builder jobId(@Nullable String jobId) {
            this.jobId = jobId;
            return this;
        }        public JobReference build() {
            return new JobReference(jobId);
        }
    }
}
