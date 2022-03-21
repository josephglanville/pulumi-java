// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts;

import io.pulumi.awsnative.s3outposts.inputs.BucketLifecycleConfigurationArgs;
import io.pulumi.awsnative.s3outposts.inputs.BucketTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    /**
     * A name for the bucket.
     * 
     */
    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName == null ? Output.empty() : this.bucketName;
    }

    /**
     * Rules that define how Amazon S3Outposts manages objects during their lifetime.
     * 
     */
    @Import(name="lifecycleConfiguration")
      private final @Nullable Output<BucketLifecycleConfigurationArgs> lifecycleConfiguration;

    public Output<BucketLifecycleConfigurationArgs> getLifecycleConfiguration() {
        return this.lifecycleConfiguration == null ? Output.empty() : this.lifecycleConfiguration;
    }

    /**
     * The id of the customer outpost on which the bucket resides.
     * 
     */
    @Import(name="outpostId", required=true)
      private final Output<String> outpostId;

    public Output<String> getOutpostId() {
        return this.outpostId;
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this S3Outposts bucket.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<BucketTagArgs>> tags;

    public Output<List<BucketTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public BucketArgs(
        @Nullable Output<String> bucketName,
        @Nullable Output<BucketLifecycleConfigurationArgs> lifecycleConfiguration,
        Output<String> outpostId,
        @Nullable Output<List<BucketTagArgs>> tags) {
        this.bucketName = bucketName;
        this.lifecycleConfiguration = lifecycleConfiguration;
        this.outpostId = Objects.requireNonNull(outpostId, "expected parameter 'outpostId' to be non-null");
        this.tags = tags;
    }

    private BucketArgs() {
        this.bucketName = Output.empty();
        this.lifecycleConfiguration = Output.empty();
        this.outpostId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private @Nullable Output<BucketLifecycleConfigurationArgs> lifecycleConfiguration;
        private Output<String> outpostId;
        private @Nullable Output<List<BucketTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.lifecycleConfiguration = defaults.lifecycleConfiguration;
    	      this.outpostId = defaults.outpostId;
    	      this.tags = defaults.tags;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Output.ofNullable(bucketName);
            return this;
        }
        public Builder lifecycleConfiguration(@Nullable Output<BucketLifecycleConfigurationArgs> lifecycleConfiguration) {
            this.lifecycleConfiguration = lifecycleConfiguration;
            return this;
        }
        public Builder lifecycleConfiguration(@Nullable BucketLifecycleConfigurationArgs lifecycleConfiguration) {
            this.lifecycleConfiguration = Output.ofNullable(lifecycleConfiguration);
            return this;
        }
        public Builder outpostId(Output<String> outpostId) {
            this.outpostId = Objects.requireNonNull(outpostId);
            return this;
        }
        public Builder outpostId(String outpostId) {
            this.outpostId = Output.of(Objects.requireNonNull(outpostId));
            return this;
        }
        public Builder tags(@Nullable Output<List<BucketTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<BucketTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(BucketTagArgs... tags) {
            return tags(List.of(tags));
        }        public BucketArgs build() {
            return new BucketArgs(bucketName, lifecycleConfiguration, outpostId, tags);
        }
    }
}
