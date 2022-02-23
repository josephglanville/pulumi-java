// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.inputs;

import io.pulumi.awsnative.s3outposts.inputs.BucketFilterAndOperator;
import io.pulumi.awsnative.s3outposts.inputs.BucketFilterTag;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The container for the filter of the lifecycle rule.
 * 
 */
public final class BucketRuleFilterProperties extends io.pulumi.resources.InvokeArgs {

    public static final BucketRuleFilterProperties Empty = new BucketRuleFilterProperties();

    /**
     * The container for the AND condition for the lifecycle rule. A combination of Prefix and 1 or more Tags OR a minimum of 2 or more tags.
     * 
     */
    @InputImport(name="andOperator")
      private final @Nullable BucketFilterAndOperator andOperator;

    public Optional<BucketFilterAndOperator> getAndOperator() {
        return this.andOperator == null ? Optional.empty() : Optional.ofNullable(this.andOperator);
    }

    /**
     * Object key prefix that identifies one or more objects to which this rule applies.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable String prefix;

    public Optional<String> getPrefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    /**
     * Specifies a tag used to identify a subset of objects for an Amazon S3Outposts bucket.
     * 
     */
    @InputImport(name="tag")
      private final @Nullable BucketFilterTag tag;

    public Optional<BucketFilterTag> getTag() {
        return this.tag == null ? Optional.empty() : Optional.ofNullable(this.tag);
    }

    public BucketRuleFilterProperties(
        @Nullable BucketFilterAndOperator andOperator,
        @Nullable String prefix,
        @Nullable BucketFilterTag tag) {
        this.andOperator = andOperator;
        this.prefix = prefix;
        this.tag = tag;
    }

    private BucketRuleFilterProperties() {
        this.andOperator = null;
        this.prefix = null;
        this.tag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRuleFilterProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketFilterAndOperator andOperator;
        private @Nullable String prefix;
        private @Nullable BucketFilterTag tag;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRuleFilterProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andOperator = defaults.andOperator;
    	      this.prefix = defaults.prefix;
    	      this.tag = defaults.tag;
        }

        public Builder setAndOperator(@Nullable BucketFilterAndOperator andOperator) {
            this.andOperator = andOperator;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setTag(@Nullable BucketFilterTag tag) {
            this.tag = tag;
            return this;
        }
        public BucketRuleFilterProperties build() {
            return new BucketRuleFilterProperties(andOperator, prefix, tag);
        }
    }
}
