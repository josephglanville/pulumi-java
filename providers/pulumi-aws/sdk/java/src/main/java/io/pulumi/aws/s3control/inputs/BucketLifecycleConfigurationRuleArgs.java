// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs;
import io.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleExpirationArgs;
import io.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleConfigurationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleConfigurationRuleArgs Empty = new BucketLifecycleConfigurationRuleArgs();

    /**
     * Configuration block containing settings for abort incomplete multipart upload.
     * 
     */
    @InputImport(name="abortIncompleteMultipartUpload")
      private final @Nullable Output<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload;

    public Output<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs> getAbortIncompleteMultipartUpload() {
        return this.abortIncompleteMultipartUpload == null ? Output.empty() : this.abortIncompleteMultipartUpload;
    }

    /**
     * Configuration block containing settings for expiration of objects.
     * 
     */
    @InputImport(name="expiration")
      private final @Nullable Output<BucketLifecycleConfigurationRuleExpirationArgs> expiration;

    public Output<BucketLifecycleConfigurationRuleExpirationArgs> getExpiration() {
        return this.expiration == null ? Output.empty() : this.expiration;
    }

    /**
     * Configuration block containing settings for filtering.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Output<BucketLifecycleConfigurationRuleFilterArgs> filter;

    public Output<BucketLifecycleConfigurationRuleFilterArgs> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * Unique identifier for the rule.
     * 
     */
    @InputImport(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public BucketLifecycleConfigurationRuleArgs(
        @Nullable Output<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload,
        @Nullable Output<BucketLifecycleConfigurationRuleExpirationArgs> expiration,
        @Nullable Output<BucketLifecycleConfigurationRuleFilterArgs> filter,
        Output<String> id,
        @Nullable Output<String> status) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
        this.expiration = expiration;
        this.filter = filter;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.status = status;
    }

    private BucketLifecycleConfigurationRuleArgs() {
        this.abortIncompleteMultipartUpload = Output.empty();
        this.expiration = Output.empty();
        this.filter = Output.empty();
        this.id = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload;
        private @Nullable Output<BucketLifecycleConfigurationRuleExpirationArgs> expiration;
        private @Nullable Output<BucketLifecycleConfigurationRuleFilterArgs> filter;
        private Output<String> id;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUpload = defaults.abortIncompleteMultipartUpload;
    	      this.expiration = defaults.expiration;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        public Builder abortIncompleteMultipartUpload(@Nullable Output<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
            return this;
        }

        public Builder abortIncompleteMultipartUpload(@Nullable BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = Output.ofNullable(abortIncompleteMultipartUpload);
            return this;
        }

        public Builder expiration(@Nullable Output<BucketLifecycleConfigurationRuleExpirationArgs> expiration) {
            this.expiration = expiration;
            return this;
        }

        public Builder expiration(@Nullable BucketLifecycleConfigurationRuleExpirationArgs expiration) {
            this.expiration = Output.ofNullable(expiration);
            return this;
        }

        public Builder filter(@Nullable Output<BucketLifecycleConfigurationRuleFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable BucketLifecycleConfigurationRuleFilterArgs filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public BucketLifecycleConfigurationRuleArgs build() {
            return new BucketLifecycleConfigurationRuleArgs(abortIncompleteMultipartUpload, expiration, filter, id, status);
        }
    }
}
