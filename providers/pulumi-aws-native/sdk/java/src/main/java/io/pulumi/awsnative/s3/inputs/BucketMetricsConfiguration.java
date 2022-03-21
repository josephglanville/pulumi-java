// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketTagFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketMetricsConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketMetricsConfiguration Empty = new BucketMetricsConfiguration();

    @Import(name="accessPointArn")
      private final @Nullable String accessPointArn;

    public Optional<String> getAccessPointArn() {
        return this.accessPointArn == null ? Optional.empty() : Optional.ofNullable(this.accessPointArn);
    }

    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    @Import(name="prefix")
      private final @Nullable String prefix;

    public Optional<String> getPrefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    @Import(name="tagFilters")
      private final @Nullable List<BucketTagFilter> tagFilters;

    public List<BucketTagFilter> getTagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }

    public BucketMetricsConfiguration(
        @Nullable String accessPointArn,
        String id,
        @Nullable String prefix,
        @Nullable List<BucketTagFilter> tagFilters) {
        this.accessPointArn = accessPointArn;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.prefix = prefix;
        this.tagFilters = tagFilters;
    }

    private BucketMetricsConfiguration() {
        this.accessPointArn = null;
        this.id = null;
        this.prefix = null;
        this.tagFilters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketMetricsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessPointArn;
        private String id;
        private @Nullable String prefix;
        private @Nullable List<BucketTagFilter> tagFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketMetricsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointArn = defaults.accessPointArn;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.tagFilters = defaults.tagFilters;
        }

        public Builder accessPointArn(@Nullable String accessPointArn) {
            this.accessPointArn = accessPointArn;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder tagFilters(@Nullable List<BucketTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public Builder tagFilters(BucketTagFilter... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }        public BucketMetricsConfiguration build() {
            return new BucketMetricsConfiguration(accessPointArn, id, prefix, tagFilters);
        }
    }
}
