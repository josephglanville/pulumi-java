// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.aws.signer.inputs.SigningJobSignedObjectS3GetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningJobSignedObjectGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobSignedObjectGetArgs Empty = new SigningJobSignedObjectGetArgs();

    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    @Import(name="s3s")
      private final @Nullable Output<List<SigningJobSignedObjectS3GetArgs>> s3s;

    public Output<List<SigningJobSignedObjectS3GetArgs>> getS3s() {
        return this.s3s == null ? Output.empty() : this.s3s;
    }

    public SigningJobSignedObjectGetArgs(@Nullable Output<List<SigningJobSignedObjectS3GetArgs>> s3s) {
        this.s3s = s3s;
    }

    private SigningJobSignedObjectGetArgs() {
        this.s3s = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobSignedObjectGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SigningJobSignedObjectS3GetArgs>> s3s;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobSignedObjectGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3s = defaults.s3s;
        }

        public Builder s3s(@Nullable Output<List<SigningJobSignedObjectS3GetArgs>> s3s) {
            this.s3s = s3s;
            return this;
        }
        public Builder s3s(@Nullable List<SigningJobSignedObjectS3GetArgs> s3s) {
            this.s3s = Output.ofNullable(s3s);
            return this;
        }
        public Builder s3s(SigningJobSignedObjectS3GetArgs... s3s) {
            return s3s(List.of(s3s));
        }        public SigningJobSignedObjectGetArgs build() {
            return new SigningJobSignedObjectGetArgs(s3s);
        }
    }
}