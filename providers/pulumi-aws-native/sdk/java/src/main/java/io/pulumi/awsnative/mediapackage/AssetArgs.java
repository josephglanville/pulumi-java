// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage;

import io.pulumi.awsnative.mediapackage.inputs.AssetTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetArgs Empty = new AssetArgs();

    /**
     * The ID of the PackagingGroup for the Asset.
     * 
     */
    @InputImport(name="packagingGroupId", required=true)
      private final Output<String> packagingGroupId;

    public Output<String> getPackagingGroupId() {
        return this.packagingGroupId;
    }

    /**
     * The resource ID to include in SPEKE key requests.
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    /**
     * ARN of the source object in S3.
     * 
     */
    @InputImport(name="sourceArn", required=true)
      private final Output<String> sourceArn;

    public Output<String> getSourceArn() {
        return this.sourceArn;
    }

    /**
     * The IAM role_arn used to access the source S3 bucket.
     * 
     */
    @InputImport(name="sourceRoleArn", required=true)
      private final Output<String> sourceRoleArn;

    public Output<String> getSourceRoleArn() {
        return this.sourceRoleArn;
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<AssetTagArgs>> tags;

    public Output<List<AssetTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public AssetArgs(
        Output<String> packagingGroupId,
        @Nullable Output<String> resourceId,
        Output<String> sourceArn,
        Output<String> sourceRoleArn,
        @Nullable Output<List<AssetTagArgs>> tags) {
        this.packagingGroupId = Objects.requireNonNull(packagingGroupId, "expected parameter 'packagingGroupId' to be non-null");
        this.resourceId = resourceId;
        this.sourceArn = Objects.requireNonNull(sourceArn, "expected parameter 'sourceArn' to be non-null");
        this.sourceRoleArn = Objects.requireNonNull(sourceRoleArn, "expected parameter 'sourceRoleArn' to be non-null");
        this.tags = tags;
    }

    private AssetArgs() {
        this.packagingGroupId = Output.empty();
        this.resourceId = Output.empty();
        this.sourceArn = Output.empty();
        this.sourceRoleArn = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> packagingGroupId;
        private @Nullable Output<String> resourceId;
        private Output<String> sourceArn;
        private Output<String> sourceRoleArn;
        private @Nullable Output<List<AssetTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packagingGroupId = defaults.packagingGroupId;
    	      this.resourceId = defaults.resourceId;
    	      this.sourceArn = defaults.sourceArn;
    	      this.sourceRoleArn = defaults.sourceRoleArn;
    	      this.tags = defaults.tags;
        }

        public Builder packagingGroupId(Output<String> packagingGroupId) {
            this.packagingGroupId = Objects.requireNonNull(packagingGroupId);
            return this;
        }

        public Builder packagingGroupId(String packagingGroupId) {
            this.packagingGroupId = Output.of(Objects.requireNonNull(packagingGroupId));
            return this;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }

        public Builder sourceArn(Output<String> sourceArn) {
            this.sourceArn = Objects.requireNonNull(sourceArn);
            return this;
        }

        public Builder sourceArn(String sourceArn) {
            this.sourceArn = Output.of(Objects.requireNonNull(sourceArn));
            return this;
        }

        public Builder sourceRoleArn(Output<String> sourceRoleArn) {
            this.sourceRoleArn = Objects.requireNonNull(sourceRoleArn);
            return this;
        }

        public Builder sourceRoleArn(String sourceRoleArn) {
            this.sourceRoleArn = Output.of(Objects.requireNonNull(sourceRoleArn));
            return this;
        }

        public Builder tags(@Nullable Output<List<AssetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<AssetTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public AssetArgs build() {
            return new AssetArgs(packagingGroupId, resourceId, sourceArn, sourceRoleArn, tags);
        }
    }
}
