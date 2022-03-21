// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleNoncurrentVersionTransitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleNoncurrentVersionTransitionArgs Empty = new BucketLifecycleRuleNoncurrentVersionTransitionArgs();

    /**
     * Specifies the number of days noncurrent object versions transition.
     * 
     */
    @Import(name="days")
      private final @Nullable Output<Integer> days;

    public Output<Integer> getDays() {
        return this.days == null ? Output.empty() : this.days;
    }

    /**
     * Specifies the Amazon S3 [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Transition.html#AmazonS3-Type-Transition-StorageClass) to which you want the object to transition.
     * 
     */
    @Import(name="storageClass", required=true)
      private final Output<String> storageClass;

    public Output<String> getStorageClass() {
        return this.storageClass;
    }

    public BucketLifecycleRuleNoncurrentVersionTransitionArgs(
        @Nullable Output<Integer> days,
        Output<String> storageClass) {
        this.days = days;
        this.storageClass = Objects.requireNonNull(storageClass, "expected parameter 'storageClass' to be non-null");
    }

    private BucketLifecycleRuleNoncurrentVersionTransitionArgs() {
        this.days = Output.empty();
        this.storageClass = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleNoncurrentVersionTransitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> days;
        private Output<String> storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleNoncurrentVersionTransitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder days(@Nullable Output<Integer> days) {
            this.days = days;
            return this;
        }
        public Builder days(@Nullable Integer days) {
            this.days = Output.ofNullable(days);
            return this;
        }
        public Builder storageClass(Output<String> storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public Builder storageClass(String storageClass) {
            this.storageClass = Output.of(Objects.requireNonNull(storageClass));
            return this;
        }        public BucketLifecycleRuleNoncurrentVersionTransitionArgs build() {
            return new BucketLifecycleRuleNoncurrentVersionTransitionArgs(days, storageClass);
        }
    }
}
