// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketLifecycleRuleTransition {
    /**
     * Specifies the date after which you want the corresponding action to take effect.
     * 
     */
    private final @Nullable String date;
    /**
     * Specifies the number of days after object creation when the specific rule action takes effect.
     * 
     */
    private final @Nullable Integer days;
    /**
     * Specifies the Amazon S3 [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Transition.html#AmazonS3-Type-Transition-StorageClass) to which you want the object to transition.
     * 
     */
    private final String storageClass;

    @OutputCustomType.Constructor
    private BucketLifecycleRuleTransition(
        @OutputCustomType.Parameter("date") @Nullable String date,
        @OutputCustomType.Parameter("days") @Nullable Integer days,
        @OutputCustomType.Parameter("storageClass") String storageClass) {
        this.date = date;
        this.days = days;
        this.storageClass = storageClass;
    }

    /**
     * Specifies the date after which you want the corresponding action to take effect.
     * 
    */
    public Optional<String> getDate() {
        return Optional.ofNullable(this.date);
    }
    /**
     * Specifies the number of days after object creation when the specific rule action takes effect.
     * 
    */
    public Optional<Integer> getDays() {
        return Optional.ofNullable(this.days);
    }
    /**
     * Specifies the Amazon S3 [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Transition.html#AmazonS3-Type-Transition-StorageClass) to which you want the object to transition.
     * 
    */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleTransition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String date;
        private @Nullable Integer days;
        private String storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleTransition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.days = defaults.days;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder setDate(@Nullable String date) {
            this.date = date;
            return this;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = days;
            return this;
        }

        public Builder setStorageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public BucketLifecycleRuleTransition build() {
            return new BucketLifecycleRuleTransition(date, days, storageClass);
        }
    }
}
