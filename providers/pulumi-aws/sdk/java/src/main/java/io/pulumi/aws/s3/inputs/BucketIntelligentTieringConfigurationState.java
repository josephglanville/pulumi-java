// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterGetArgs;
import io.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketIntelligentTieringConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final BucketIntelligentTieringConfigurationState Empty = new BucketIntelligentTieringConfigurationState();

    /**
     * The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    @InputImport(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
    }

    /**
     * A bucket filter. The configuration only includes objects that meet the filter's criteria (documented below).
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Output<BucketIntelligentTieringConfigurationFilterGetArgs> filter;

    public Output<BucketIntelligentTieringConfigurationFilterGetArgs> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    @InputImport(name="tierings")
      private final @Nullable Output<List<BucketIntelligentTieringConfigurationTieringGetArgs>> tierings;

    public Output<List<BucketIntelligentTieringConfigurationTieringGetArgs>> getTierings() {
        return this.tierings == null ? Output.empty() : this.tierings;
    }

    public BucketIntelligentTieringConfigurationState(
        @Nullable Output<String> bucket,
        @Nullable Output<BucketIntelligentTieringConfigurationFilterGetArgs> filter,
        @Nullable Output<String> name,
        @Nullable Output<String> status,
        @Nullable Output<List<BucketIntelligentTieringConfigurationTieringGetArgs>> tierings) {
        this.bucket = bucket;
        this.filter = filter;
        this.name = name;
        this.status = status;
        this.tierings = tierings;
    }

    private BucketIntelligentTieringConfigurationState() {
        this.bucket = Output.empty();
        this.filter = Output.empty();
        this.name = Output.empty();
        this.status = Output.empty();
        this.tierings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIntelligentTieringConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<BucketIntelligentTieringConfigurationFilterGetArgs> filter;
        private @Nullable Output<String> name;
        private @Nullable Output<String> status;
        private @Nullable Output<List<BucketIntelligentTieringConfigurationTieringGetArgs>> tierings;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIntelligentTieringConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.tierings = defaults.tierings;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = Output.ofNullable(bucket);
            return this;
        }

        public Builder filter(@Nullable Output<BucketIntelligentTieringConfigurationFilterGetArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable BucketIntelligentTieringConfigurationFilterGetArgs filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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

        public Builder tierings(@Nullable Output<List<BucketIntelligentTieringConfigurationTieringGetArgs>> tierings) {
            this.tierings = tierings;
            return this;
        }

        public Builder tierings(@Nullable List<BucketIntelligentTieringConfigurationTieringGetArgs> tierings) {
            this.tierings = Output.ofNullable(tierings);
            return this;
        }
        public BucketIntelligentTieringConfigurationState build() {
            return new BucketIntelligentTieringConfigurationState(bucket, filter, name, status, tierings);
        }
    }
}
