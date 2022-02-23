// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketIntelligentTieringConfigurationStatus;
import io.pulumi.awsnative.s3.inputs.BucketTagFilter;
import io.pulumi.awsnative.s3.inputs.BucketTiering;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketIntelligentTieringConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketIntelligentTieringConfiguration Empty = new BucketIntelligentTieringConfiguration();

    /**
     * The ID used to identify the S3 Intelligent-Tiering configuration.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * An object key name prefix that identifies the subset of objects to which the rule applies.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable String prefix;

    public Optional<String> getPrefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    /**
     * Specifies the status of the configuration.
     * 
     */
    @InputImport(name="status", required=true)
      private final BucketIntelligentTieringConfigurationStatus status;

    public BucketIntelligentTieringConfigurationStatus getStatus() {
        return this.status;
    }

    /**
     * A container for a key-value pair.
     * 
     */
    @InputImport(name="tagFilters")
      private final @Nullable List<BucketTagFilter> tagFilters;

    public List<BucketTagFilter> getTagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }

    /**
     * Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration. At least one tier must be defined in the list. At most, you can specify two tiers in the list, one for each available AccessTier: ARCHIVE_ACCESS and DEEP_ARCHIVE_ACCESS.
     * 
     */
    @InputImport(name="tierings", required=true)
      private final List<BucketTiering> tierings;

    public List<BucketTiering> getTierings() {
        return this.tierings;
    }

    public BucketIntelligentTieringConfiguration(
        String id,
        @Nullable String prefix,
        BucketIntelligentTieringConfigurationStatus status,
        @Nullable List<BucketTagFilter> tagFilters,
        List<BucketTiering> tierings) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.prefix = prefix;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.tagFilters = tagFilters;
        this.tierings = Objects.requireNonNull(tierings, "expected parameter 'tierings' to be non-null");
    }

    private BucketIntelligentTieringConfiguration() {
        this.id = null;
        this.prefix = null;
        this.status = null;
        this.tagFilters = List.of();
        this.tierings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIntelligentTieringConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String prefix;
        private BucketIntelligentTieringConfigurationStatus status;
        private @Nullable List<BucketTagFilter> tagFilters;
        private List<BucketTiering> tierings;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIntelligentTieringConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.status = defaults.status;
    	      this.tagFilters = defaults.tagFilters;
    	      this.tierings = defaults.tierings;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setStatus(BucketIntelligentTieringConfigurationStatus status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTagFilters(@Nullable List<BucketTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        public Builder setTierings(List<BucketTiering> tierings) {
            this.tierings = Objects.requireNonNull(tierings);
            return this;
        }
        public BucketIntelligentTieringConfiguration build() {
            return new BucketIntelligentTieringConfiguration(id, prefix, status, tagFilters, tierings);
        }
    }
}
