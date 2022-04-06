// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.aws.signer.outputs.GetSigningJobSourceS3;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSigningJobSource {
    private final List<GetSigningJobSourceS3> s3s;

    @CustomType.Constructor
    private GetSigningJobSource(@CustomType.Parameter("s3s") List<GetSigningJobSourceS3> s3s) {
        this.s3s = s3s;
    }

    public List<GetSigningJobSourceS3> getS3s() {
        return this.s3s;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningJobSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSigningJobSourceS3> s3s;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningJobSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3s = defaults.s3s;
        }

        public Builder s3s(List<GetSigningJobSourceS3> s3s) {
            this.s3s = Objects.requireNonNull(s3s);
            return this;
        }
        public Builder s3s(GetSigningJobSourceS3... s3s) {
            return s3s(List.of(s3s));
        }        public GetSigningJobSource build() {
            return new GetSigningJobSource(s3s);
        }
    }
}