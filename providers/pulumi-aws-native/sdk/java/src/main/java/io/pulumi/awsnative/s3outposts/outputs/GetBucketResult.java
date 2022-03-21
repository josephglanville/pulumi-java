// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.outputs;

import io.pulumi.awsnative.s3outposts.outputs.BucketLifecycleConfiguration;
import io.pulumi.awsnative.s3outposts.outputs.BucketTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBucketResult {
    /**
     * The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    private final @Nullable String arn;
    /**
     * Rules that define how Amazon S3Outposts manages objects during their lifetime.
     * 
     */
    private final @Nullable BucketLifecycleConfiguration lifecycleConfiguration;
    /**
     * An arbitrary set of tags (key-value pairs) for this S3Outposts bucket.
     * 
     */
    private final @Nullable List<BucketTag> tags;

    @CustomType.Constructor
    private GetBucketResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("lifecycleConfiguration") @Nullable BucketLifecycleConfiguration lifecycleConfiguration,
        @CustomType.Parameter("tags") @Nullable List<BucketTag> tags) {
        this.arn = arn;
        this.lifecycleConfiguration = lifecycleConfiguration;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the specified bucket.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Rules that define how Amazon S3Outposts manages objects during their lifetime.
     * 
    */
    public Optional<BucketLifecycleConfiguration> getLifecycleConfiguration() {
        return Optional.ofNullable(this.lifecycleConfiguration);
    }
    /**
     * An arbitrary set of tags (key-value pairs) for this S3Outposts bucket.
     * 
    */
    public List<BucketTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable BucketLifecycleConfiguration lifecycleConfiguration;
        private @Nullable List<BucketTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.lifecycleConfiguration = defaults.lifecycleConfiguration;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder lifecycleConfiguration(@Nullable BucketLifecycleConfiguration lifecycleConfiguration) {
            this.lifecycleConfiguration = lifecycleConfiguration;
            return this;
        }
        public Builder tags(@Nullable List<BucketTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(BucketTag... tags) {
            return tags(List.of(tags));
        }        public GetBucketResult build() {
            return new GetBucketResult(arn, lifecycleConfiguration, tags);
        }
    }
}
