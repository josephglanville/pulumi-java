// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceFleetOutputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceFleetOutputConfigArgs Empty = new DeviceFleetOutputConfigArgs();

    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume after compilation job. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * The Amazon Simple Storage (S3) bucker URI.
     * 
     */
    @Import(name="s3OutputLocation", required=true)
      private final Output<String> s3OutputLocation;

    public Output<String> getS3OutputLocation() {
        return this.s3OutputLocation;
    }

    public DeviceFleetOutputConfigArgs(
        @Nullable Output<String> kmsKeyId,
        Output<String> s3OutputLocation) {
        this.kmsKeyId = kmsKeyId;
        this.s3OutputLocation = Objects.requireNonNull(s3OutputLocation, "expected parameter 's3OutputLocation' to be non-null");
    }

    private DeviceFleetOutputConfigArgs() {
        this.kmsKeyId = Output.empty();
        this.s3OutputLocation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceFleetOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;
        private Output<String> s3OutputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceFleetOutputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3OutputLocation = defaults.s3OutputLocation;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }
        public Builder s3OutputLocation(Output<String> s3OutputLocation) {
            this.s3OutputLocation = Objects.requireNonNull(s3OutputLocation);
            return this;
        }
        public Builder s3OutputLocation(String s3OutputLocation) {
            this.s3OutputLocation = Output.of(Objects.requireNonNull(s3OutputLocation));
            return this;
        }        public DeviceFleetOutputConfigArgs build() {
            return new DeviceFleetOutputConfigArgs(kmsKeyId, s3OutputLocation);
        }
    }
}