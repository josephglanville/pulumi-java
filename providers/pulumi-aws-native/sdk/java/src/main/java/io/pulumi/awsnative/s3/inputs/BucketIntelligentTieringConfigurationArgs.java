// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketIntelligentTieringConfigurationStatus;
import io.pulumi.awsnative.s3.inputs.BucketTagFilterArgs;
import io.pulumi.awsnative.s3.inputs.BucketTieringArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketIntelligentTieringConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketIntelligentTieringConfigurationArgs Empty = new BucketIntelligentTieringConfigurationArgs();

    /**
     * The ID used to identify the S3 Intelligent-Tiering configuration.
     * 
     */
    @InputImport(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * An object key name prefix that identifies the subset of objects to which the rule applies.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * Specifies the status of the configuration.
     * 
     */
    @InputImport(name="status", required=true)
      private final Output<BucketIntelligentTieringConfigurationStatus> status;

    public Output<BucketIntelligentTieringConfigurationStatus> getStatus() {
        return this.status;
    }

    /**
     * A container for a key-value pair.
     * 
     */
    @InputImport(name="tagFilters")
      private final @Nullable Output<List<BucketTagFilterArgs>> tagFilters;

    public Output<List<BucketTagFilterArgs>> getTagFilters() {
        return this.tagFilters == null ? Output.empty() : this.tagFilters;
    }

    /**
     * Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration. At least one tier must be defined in the list. At most, you can specify two tiers in the list, one for each available AccessTier: ARCHIVE_ACCESS and DEEP_ARCHIVE_ACCESS.
     * 
     */
    @InputImport(name="tierings", required=true)
      private final Output<List<BucketTieringArgs>> tierings;

    public Output<List<BucketTieringArgs>> getTierings() {
        return this.tierings;
    }

    public BucketIntelligentTieringConfigurationArgs(
        Output<String> id,
        @Nullable Output<String> prefix,
        Output<BucketIntelligentTieringConfigurationStatus> status,
        @Nullable Output<List<BucketTagFilterArgs>> tagFilters,
        Output<List<BucketTieringArgs>> tierings) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.prefix = prefix;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.tagFilters = tagFilters;
        this.tierings = Objects.requireNonNull(tierings, "expected parameter 'tierings' to be non-null");
    }

    private BucketIntelligentTieringConfigurationArgs() {
        this.id = Output.empty();
        this.prefix = Output.empty();
        this.status = Output.empty();
        this.tagFilters = Output.empty();
        this.tierings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIntelligentTieringConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private @Nullable Output<String> prefix;
        private Output<BucketIntelligentTieringConfigurationStatus> status;
        private @Nullable Output<List<BucketTagFilterArgs>> tagFilters;
        private Output<List<BucketTieringArgs>> tierings;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIntelligentTieringConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.status = defaults.status;
    	      this.tagFilters = defaults.tagFilters;
    	      this.tierings = defaults.tierings;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }

        public Builder status(Output<BucketIntelligentTieringConfigurationStatus> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder status(BucketIntelligentTieringConfigurationStatus status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder tagFilters(@Nullable Output<List<BucketTagFilterArgs>> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        public Builder tagFilters(@Nullable List<BucketTagFilterArgs> tagFilters) {
            this.tagFilters = Output.ofNullable(tagFilters);
            return this;
        }

        public Builder tierings(Output<List<BucketTieringArgs>> tierings) {
            this.tierings = Objects.requireNonNull(tierings);
            return this;
        }

        public Builder tierings(List<BucketTieringArgs> tierings) {
            this.tierings = Output.of(Objects.requireNonNull(tierings));
            return this;
        }
        public BucketIntelligentTieringConfigurationArgs build() {
            return new BucketIntelligentTieringConfigurationArgs(id, prefix, status, tagFilters, tierings);
        }
    }
}
