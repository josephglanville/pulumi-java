// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs;
import io.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketIntelligentTieringConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketIntelligentTieringConfigurationArgs Empty = new BucketIntelligentTieringConfigurationArgs();

    /**
     * The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * A bucket filter. The configuration only includes objects that meet the filter's criteria (documented below).
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<BucketIntelligentTieringConfigurationFilterArgs> filter;

    public Output<BucketIntelligentTieringConfigurationFilterArgs> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    @Import(name="tierings", required=true)
      private final Output<List<BucketIntelligentTieringConfigurationTieringArgs>> tierings;

    public Output<List<BucketIntelligentTieringConfigurationTieringArgs>> getTierings() {
        return this.tierings;
    }

    public BucketIntelligentTieringConfigurationArgs(
        Output<String> bucket,
        @Nullable Output<BucketIntelligentTieringConfigurationFilterArgs> filter,
        @Nullable Output<String> name,
        @Nullable Output<String> status,
        Output<List<BucketIntelligentTieringConfigurationTieringArgs>> tierings) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.filter = filter;
        this.name = name;
        this.status = status;
        this.tierings = Objects.requireNonNull(tierings, "expected parameter 'tierings' to be non-null");
    }

    private BucketIntelligentTieringConfigurationArgs() {
        this.bucket = Output.empty();
        this.filter = Output.empty();
        this.name = Output.empty();
        this.status = Output.empty();
        this.tierings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIntelligentTieringConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<BucketIntelligentTieringConfigurationFilterArgs> filter;
        private @Nullable Output<String> name;
        private @Nullable Output<String> status;
        private Output<List<BucketIntelligentTieringConfigurationTieringArgs>> tierings;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIntelligentTieringConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.tierings = defaults.tierings;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder filter(@Nullable Output<BucketIntelligentTieringConfigurationFilterArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable BucketIntelligentTieringConfigurationFilterArgs filter) {
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
        public Builder tierings(Output<List<BucketIntelligentTieringConfigurationTieringArgs>> tierings) {
            this.tierings = Objects.requireNonNull(tierings);
            return this;
        }
        public Builder tierings(List<BucketIntelligentTieringConfigurationTieringArgs> tierings) {
            this.tierings = Output.of(Objects.requireNonNull(tierings));
            return this;
        }
        public Builder tierings(BucketIntelligentTieringConfigurationTieringArgs... tierings) {
            return tierings(List.of(tierings));
        }        public BucketIntelligentTieringConfigurationArgs build() {
            return new BucketIntelligentTieringConfigurationArgs(bucket, filter, name, status, tierings);
        }
    }
}