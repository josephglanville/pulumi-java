// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FolderBucketConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FolderBucketConfigArgs Empty = new FolderBucketConfigArgs();

    /**
     * The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    @InputImport(name="bucketId", required=true)
      private final Output<String> bucketId;

    public Output<String> getBucketId() {
        return this.bucketId;
    }

    /**
     * Describes this bucket.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The parent resource that contains the logging bucket.
     * 
     */
    @InputImport(name="folder", required=true)
      private final Output<String> folder;

    public Output<String> getFolder() {
        return this.folder;
    }

    /**
     * The location of the bucket.
     * 
     */
    @InputImport(name="location", required=true)
      private final Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }

    /**
     * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used. Bucket retention can not be increased on buckets outside of projects.
     * 
     */
    @InputImport(name="retentionDays")
      private final @Nullable Output<Integer> retentionDays;

    public Output<Integer> getRetentionDays() {
        return this.retentionDays == null ? Output.empty() : this.retentionDays;
    }

    public FolderBucketConfigArgs(
        Output<String> bucketId,
        @Nullable Output<String> description,
        Output<String> folder,
        Output<String> location,
        @Nullable Output<Integer> retentionDays) {
        this.bucketId = Objects.requireNonNull(bucketId, "expected parameter 'bucketId' to be non-null");
        this.description = description;
        this.folder = Objects.requireNonNull(folder, "expected parameter 'folder' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.retentionDays = retentionDays;
    }

    private FolderBucketConfigArgs() {
        this.bucketId = Output.empty();
        this.description = Output.empty();
        this.folder = Output.empty();
        this.location = Output.empty();
        this.retentionDays = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderBucketConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketId;
        private @Nullable Output<String> description;
        private Output<String> folder;
        private Output<String> location;
        private @Nullable Output<Integer> retentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderBucketConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketId = defaults.bucketId;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.location = defaults.location;
    	      this.retentionDays = defaults.retentionDays;
        }

        public Builder bucketId(Output<String> bucketId) {
            this.bucketId = Objects.requireNonNull(bucketId);
            return this;
        }

        public Builder bucketId(String bucketId) {
            this.bucketId = Output.of(Objects.requireNonNull(bucketId));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder folder(Output<String> folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }

        public Builder folder(String folder) {
            this.folder = Output.of(Objects.requireNonNull(folder));
            return this;
        }

        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Output.ofNullable(retentionDays);
            return this;
        }
        public FolderBucketConfigArgs build() {
            return new FolderBucketConfigArgs(bucketId, description, folder, location, retentionDays);
        }
    }
}
