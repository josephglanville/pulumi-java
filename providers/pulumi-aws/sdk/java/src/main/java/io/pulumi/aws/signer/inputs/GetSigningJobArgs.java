// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSigningJobArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSigningJobArgs Empty = new GetSigningJobArgs();

    /**
     * The ID of the signing job on output.
     * 
     */
    @Import(name="jobId", required=true)
      private final String jobId;

    public String getJobId() {
        return this.jobId;
    }

    public GetSigningJobArgs(String jobId) {
        this.jobId = Objects.requireNonNull(jobId, "expected parameter 'jobId' to be non-null");
    }

    private GetSigningJobArgs() {
        this.jobId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
        }

        public Builder jobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }        public GetSigningJobArgs build() {
            return new GetSigningJobArgs(jobId);
        }
    }
}
