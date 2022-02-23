// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketAccelerateConfigurationAccelerationStatus;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class BucketAccelerateConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketAccelerateConfigurationArgs Empty = new BucketAccelerateConfigurationArgs();

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     * 
     */
    @InputImport(name="accelerationStatus", required=true)
      private final Input<BucketAccelerateConfigurationAccelerationStatus> accelerationStatus;

    public Input<BucketAccelerateConfigurationAccelerationStatus> getAccelerationStatus() {
        return this.accelerationStatus;
    }

    public BucketAccelerateConfigurationArgs(Input<BucketAccelerateConfigurationAccelerationStatus> accelerationStatus) {
        this.accelerationStatus = Objects.requireNonNull(accelerationStatus, "expected parameter 'accelerationStatus' to be non-null");
    }

    private BucketAccelerateConfigurationArgs() {
        this.accelerationStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccelerateConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BucketAccelerateConfigurationAccelerationStatus> accelerationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccelerateConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerationStatus = defaults.accelerationStatus;
        }

        public Builder setAccelerationStatus(Input<BucketAccelerateConfigurationAccelerationStatus> accelerationStatus) {
            this.accelerationStatus = Objects.requireNonNull(accelerationStatus);
            return this;
        }

        public Builder setAccelerationStatus(BucketAccelerateConfigurationAccelerationStatus accelerationStatus) {
            this.accelerationStatus = Input.of(Objects.requireNonNull(accelerationStatus));
            return this;
        }
        public BucketAccelerateConfigurationArgs build() {
            return new BucketAccelerateConfigurationArgs(accelerationStatus);
        }
    }
}
