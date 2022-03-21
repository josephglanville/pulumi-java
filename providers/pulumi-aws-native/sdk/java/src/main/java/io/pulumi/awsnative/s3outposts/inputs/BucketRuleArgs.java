// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.inputs;

import io.pulumi.awsnative.s3outposts.enums.BucketRuleStatus;
import io.pulumi.awsnative.s3outposts.inputs.BucketAbortIncompleteMultipartUploadArgs;
import io.pulumi.awsnative.s3outposts.inputs.BucketRuleFilterPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies lifecycle rules for an Amazon S3Outposts bucket. You must specify at least one of the following: AbortIncompleteMultipartUpload, ExpirationDate, ExpirationInDays.
 * 
 */
public final class BucketRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketRuleArgs Empty = new BucketRuleArgs();

    /**
     * Specifies a lifecycle rule that stops incomplete multipart uploads to an Amazon S3Outposts bucket.
     * 
     */
    @Import(name="abortIncompleteMultipartUpload")
      private final @Nullable Output<BucketAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload;

    public Output<BucketAbortIncompleteMultipartUploadArgs> getAbortIncompleteMultipartUpload() {
        return this.abortIncompleteMultipartUpload == null ? Output.empty() : this.abortIncompleteMultipartUpload;
    }

    /**
     * Indicates when objects are deleted from Amazon S3Outposts. The date value must be in ISO 8601 format. The time is always midnight UTC.
     * 
     */
    @Import(name="expirationDate")
      private final @Nullable Output<String> expirationDate;

    public Output<String> getExpirationDate() {
        return this.expirationDate == null ? Output.empty() : this.expirationDate;
    }

    /**
     * Indicates the number of days after creation when objects are deleted from Amazon S3Outposts.
     * 
     */
    @Import(name="expirationInDays")
      private final @Nullable Output<Integer> expirationInDays;

    public Output<Integer> getExpirationInDays() {
        return this.expirationInDays == null ? Output.empty() : this.expirationInDays;
    }

    /**
     * The container for the filter of the lifecycle rule.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<BucketRuleFilterPropertiesArgs> filter;

    public Output<BucketRuleFilterPropertiesArgs> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * Unique identifier for the lifecycle rule. The value can't be longer than 255 characters.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    @Import(name="status")
      private final @Nullable Output<BucketRuleStatus> status;

    public Output<BucketRuleStatus> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public BucketRuleArgs(
        @Nullable Output<BucketAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload,
        @Nullable Output<String> expirationDate,
        @Nullable Output<Integer> expirationInDays,
        @Nullable Output<BucketRuleFilterPropertiesArgs> filter,
        @Nullable Output<String> id,
        @Nullable Output<BucketRuleStatus> status) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
        this.expirationDate = expirationDate;
        this.expirationInDays = expirationInDays;
        this.filter = filter;
        this.id = id;
        this.status = status;
    }

    private BucketRuleArgs() {
        this.abortIncompleteMultipartUpload = Output.empty();
        this.expirationDate = Output.empty();
        this.expirationInDays = Output.empty();
        this.filter = Output.empty();
        this.id = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload;
        private @Nullable Output<String> expirationDate;
        private @Nullable Output<Integer> expirationInDays;
        private @Nullable Output<BucketRuleFilterPropertiesArgs> filter;
        private @Nullable Output<String> id;
        private @Nullable Output<BucketRuleStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUpload = defaults.abortIncompleteMultipartUpload;
    	      this.expirationDate = defaults.expirationDate;
    	      this.expirationInDays = defaults.expirationInDays;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        public Builder abortIncompleteMultipartUpload(@Nullable Output<BucketAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
            return this;
        }
        public Builder abortIncompleteMultipartUpload(@Nullable BucketAbortIncompleteMultipartUploadArgs abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = Output.ofNullable(abortIncompleteMultipartUpload);
            return this;
        }
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = Output.ofNullable(expirationDate);
            return this;
        }
        public Builder expirationInDays(@Nullable Output<Integer> expirationInDays) {
            this.expirationInDays = expirationInDays;
            return this;
        }
        public Builder expirationInDays(@Nullable Integer expirationInDays) {
            this.expirationInDays = Output.ofNullable(expirationInDays);
            return this;
        }
        public Builder filter(@Nullable Output<BucketRuleFilterPropertiesArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable BucketRuleFilterPropertiesArgs filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder status(@Nullable Output<BucketRuleStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable BucketRuleStatus status) {
            this.status = Output.ofNullable(status);
            return this;
        }        public BucketRuleArgs build() {
            return new BucketRuleArgs(abortIncompleteMultipartUpload, expirationDate, expirationInDays, filter, id, status);
        }
    }
}
