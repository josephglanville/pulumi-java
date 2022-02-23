// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceFleetEdgeOutputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceFleetEdgeOutputConfigArgs Empty = new DeviceFleetEdgeOutputConfigArgs();

    /**
     * The KMS key id used for encryption on the S3 bucket
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The Amazon Simple Storage (S3) bucket URI
     * 
     */
    @InputImport(name="s3OutputLocation", required=true)
      private final Input<String> s3OutputLocation;

    public Input<String> getS3OutputLocation() {
        return this.s3OutputLocation;
    }

    public DeviceFleetEdgeOutputConfigArgs(
        @Nullable Input<String> kmsKeyId,
        Input<String> s3OutputLocation) {
        this.kmsKeyId = kmsKeyId;
        this.s3OutputLocation = Objects.requireNonNull(s3OutputLocation, "expected parameter 's3OutputLocation' to be non-null");
    }

    private DeviceFleetEdgeOutputConfigArgs() {
        this.kmsKeyId = Input.empty();
        this.s3OutputLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceFleetEdgeOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyId;
        private Input<String> s3OutputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceFleetEdgeOutputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3OutputLocation = defaults.s3OutputLocation;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setS3OutputLocation(Input<String> s3OutputLocation) {
            this.s3OutputLocation = Objects.requireNonNull(s3OutputLocation);
            return this;
        }

        public Builder setS3OutputLocation(String s3OutputLocation) {
            this.s3OutputLocation = Input.of(Objects.requireNonNull(s3OutputLocation));
            return this;
        }
        public DeviceFleetEdgeOutputConfigArgs build() {
            return new DeviceFleetEdgeOutputConfigArgs(kmsKeyId, s3OutputLocation);
        }
    }
}
