// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.InventoryDestinationBucketGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class InventoryDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InventoryDestinationGetArgs Empty = new InventoryDestinationGetArgs();

    /**
     * The S3 bucket configuration where inventory results are published (documented below).
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<InventoryDestinationBucketGetArgs> bucket;

    public Output<InventoryDestinationBucketGetArgs> getBucket() {
        return this.bucket;
    }

    public InventoryDestinationGetArgs(Output<InventoryDestinationBucketGetArgs> bucket) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
    }

    private InventoryDestinationGetArgs() {
        this.bucket = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<InventoryDestinationBucketGetArgs> bucket;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
        }

        public Builder bucket(Output<InventoryDestinationBucketGetArgs> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(InventoryDestinationBucketGetArgs bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }        public InventoryDestinationGetArgs build() {
            return new InventoryDestinationGetArgs(bucket);
        }
    }
}