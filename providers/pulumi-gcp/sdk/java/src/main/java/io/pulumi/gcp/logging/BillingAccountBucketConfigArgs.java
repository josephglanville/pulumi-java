// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingAccountBucketConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingAccountBucketConfigArgs Empty = new BillingAccountBucketConfigArgs();

    /**
     * The parent resource that contains the logging bucket.
     * 
     */
    @InputImport(name="billingAccount", required=true)
      private final Input<String> billingAccount;

    public Input<String> getBillingAccount() {
        return this.billingAccount;
    }

    /**
     * The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    @InputImport(name="bucketId", required=true)
      private final Input<String> bucketId;

    public Input<String> getBucketId() {
        return this.bucketId;
    }

    /**
     * Describes this bucket.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The location of the bucket.
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used. Bucket retention can not be increased on buckets outside of projects.
     * 
     */
    @InputImport(name="retentionDays")
      private final @Nullable Input<Integer> retentionDays;

    public Input<Integer> getRetentionDays() {
        return this.retentionDays == null ? Input.empty() : this.retentionDays;
    }

    public BillingAccountBucketConfigArgs(
        Input<String> billingAccount,
        Input<String> bucketId,
        @Nullable Input<String> description,
        Input<String> location,
        @Nullable Input<Integer> retentionDays) {
        this.billingAccount = Objects.requireNonNull(billingAccount, "expected parameter 'billingAccount' to be non-null");
        this.bucketId = Objects.requireNonNull(bucketId, "expected parameter 'bucketId' to be non-null");
        this.description = description;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.retentionDays = retentionDays;
    }

    private BillingAccountBucketConfigArgs() {
        this.billingAccount = Input.empty();
        this.bucketId = Input.empty();
        this.description = Input.empty();
        this.location = Input.empty();
        this.retentionDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountBucketConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> billingAccount;
        private Input<String> bucketId;
        private @Nullable Input<String> description;
        private Input<String> location;
        private @Nullable Input<Integer> retentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountBucketConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccount = defaults.billingAccount;
    	      this.bucketId = defaults.bucketId;
    	      this.description = defaults.description;
    	      this.location = defaults.location;
    	      this.retentionDays = defaults.retentionDays;
        }

        public Builder setBillingAccount(Input<String> billingAccount) {
            this.billingAccount = Objects.requireNonNull(billingAccount);
            return this;
        }

        public Builder setBillingAccount(String billingAccount) {
            this.billingAccount = Input.of(Objects.requireNonNull(billingAccount));
            return this;
        }

        public Builder setBucketId(Input<String> bucketId) {
            this.bucketId = Objects.requireNonNull(bucketId);
            return this;
        }

        public Builder setBucketId(String bucketId) {
            this.bucketId = Input.of(Objects.requireNonNull(bucketId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setRetentionDays(@Nullable Input<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder setRetentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Input.ofNullable(retentionDays);
            return this;
        }
        public BillingAccountBucketConfigArgs build() {
            return new BillingAccountBucketConfigArgs(billingAccount, bucketId, description, location, retentionDays);
        }
    }
}
