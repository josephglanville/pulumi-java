// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.aws.signer.inputs.SigningJobDestinationS3Args;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class SigningJobDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobDestinationArgs Empty = new SigningJobDestinationArgs();

    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    @InputImport(name="s3", required=true)
      private final Output<SigningJobDestinationS3Args> s3;

    public Output<SigningJobDestinationS3Args> getS3() {
        return this.s3;
    }

    public SigningJobDestinationArgs(Output<SigningJobDestinationS3Args> s3) {
        this.s3 = Objects.requireNonNull(s3, "expected parameter 's3' to be non-null");
    }

    private SigningJobDestinationArgs() {
        this.s3 = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SigningJobDestinationS3Args> s3;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3 = defaults.s3;
        }

        public Builder s3(Output<SigningJobDestinationS3Args> s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }

        public Builder s3(SigningJobDestinationS3Args s3) {
            this.s3 = Output.of(Objects.requireNonNull(s3));
            return this;
        }
        public SigningJobDestinationArgs build() {
            return new SigningJobDestinationArgs(s3);
        }
    }
}
