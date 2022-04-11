// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm;

import io.pulumi.awsnative.ssm.inputs.ResourceDataSyncS3DestinationArgs;
import io.pulumi.awsnative.ssm.inputs.ResourceDataSyncSyncSourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceDataSyncArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceDataSyncArgs Empty = new ResourceDataSyncArgs();

    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName == null ? Codegen.empty() : this.bucketName;
    }

    @Import(name="bucketPrefix")
      private final @Nullable Output<String> bucketPrefix;

    public Output<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Codegen.empty() : this.bucketPrefix;
    }

    @Import(name="bucketRegion")
      private final @Nullable Output<String> bucketRegion;

    public Output<String> getBucketRegion() {
        return this.bucketRegion == null ? Codegen.empty() : this.bucketRegion;
    }

    @Import(name="kMSKeyArn")
      private final @Nullable Output<String> kMSKeyArn;

    public Output<String> getKMSKeyArn() {
        return this.kMSKeyArn == null ? Codegen.empty() : this.kMSKeyArn;
    }

    @Import(name="s3Destination")
      private final @Nullable Output<ResourceDataSyncS3DestinationArgs> s3Destination;

    public Output<ResourceDataSyncS3DestinationArgs> getS3Destination() {
        return this.s3Destination == null ? Codegen.empty() : this.s3Destination;
    }

    @Import(name="syncFormat")
      private final @Nullable Output<String> syncFormat;

    public Output<String> getSyncFormat() {
        return this.syncFormat == null ? Codegen.empty() : this.syncFormat;
    }

    @Import(name="syncSource")
      private final @Nullable Output<ResourceDataSyncSyncSourceArgs> syncSource;

    public Output<ResourceDataSyncSyncSourceArgs> getSyncSource() {
        return this.syncSource == null ? Codegen.empty() : this.syncSource;
    }

    @Import(name="syncType")
      private final @Nullable Output<String> syncType;

    public Output<String> getSyncType() {
        return this.syncType == null ? Codegen.empty() : this.syncType;
    }

    public ResourceDataSyncArgs(
        @Nullable Output<String> bucketName,
        @Nullable Output<String> bucketPrefix,
        @Nullable Output<String> bucketRegion,
        @Nullable Output<String> kMSKeyArn,
        @Nullable Output<ResourceDataSyncS3DestinationArgs> s3Destination,
        @Nullable Output<String> syncFormat,
        @Nullable Output<ResourceDataSyncSyncSourceArgs> syncSource,
        @Nullable Output<String> syncType) {
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.bucketRegion = bucketRegion;
        this.kMSKeyArn = kMSKeyArn;
        this.s3Destination = s3Destination;
        this.syncFormat = syncFormat;
        this.syncSource = syncSource;
        this.syncType = syncType;
    }

    private ResourceDataSyncArgs() {
        this.bucketName = Codegen.empty();
        this.bucketPrefix = Codegen.empty();
        this.bucketRegion = Codegen.empty();
        this.kMSKeyArn = Codegen.empty();
        this.s3Destination = Codegen.empty();
        this.syncFormat = Codegen.empty();
        this.syncSource = Codegen.empty();
        this.syncType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceDataSyncArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private @Nullable Output<String> bucketPrefix;
        private @Nullable Output<String> bucketRegion;
        private @Nullable Output<String> kMSKeyArn;
        private @Nullable Output<ResourceDataSyncS3DestinationArgs> s3Destination;
        private @Nullable Output<String> syncFormat;
        private @Nullable Output<ResourceDataSyncSyncSourceArgs> syncSource;
        private @Nullable Output<String> syncType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceDataSyncArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.bucketRegion = defaults.bucketRegion;
    	      this.kMSKeyArn = defaults.kMSKeyArn;
    	      this.s3Destination = defaults.s3Destination;
    	      this.syncFormat = defaults.syncFormat;
    	      this.syncSource = defaults.syncSource;
    	      this.syncType = defaults.syncType;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Codegen.ofNullable(bucketName);
            return this;
        }
        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Codegen.ofNullable(bucketPrefix);
            return this;
        }
        public Builder bucketRegion(@Nullable Output<String> bucketRegion) {
            this.bucketRegion = bucketRegion;
            return this;
        }
        public Builder bucketRegion(@Nullable String bucketRegion) {
            this.bucketRegion = Codegen.ofNullable(bucketRegion);
            return this;
        }
        public Builder kMSKeyArn(@Nullable Output<String> kMSKeyArn) {
            this.kMSKeyArn = kMSKeyArn;
            return this;
        }
        public Builder kMSKeyArn(@Nullable String kMSKeyArn) {
            this.kMSKeyArn = Codegen.ofNullable(kMSKeyArn);
            return this;
        }
        public Builder s3Destination(@Nullable Output<ResourceDataSyncS3DestinationArgs> s3Destination) {
            this.s3Destination = s3Destination;
            return this;
        }
        public Builder s3Destination(@Nullable ResourceDataSyncS3DestinationArgs s3Destination) {
            this.s3Destination = Codegen.ofNullable(s3Destination);
            return this;
        }
        public Builder syncFormat(@Nullable Output<String> syncFormat) {
            this.syncFormat = syncFormat;
            return this;
        }
        public Builder syncFormat(@Nullable String syncFormat) {
            this.syncFormat = Codegen.ofNullable(syncFormat);
            return this;
        }
        public Builder syncSource(@Nullable Output<ResourceDataSyncSyncSourceArgs> syncSource) {
            this.syncSource = syncSource;
            return this;
        }
        public Builder syncSource(@Nullable ResourceDataSyncSyncSourceArgs syncSource) {
            this.syncSource = Codegen.ofNullable(syncSource);
            return this;
        }
        public Builder syncType(@Nullable Output<String> syncType) {
            this.syncType = syncType;
            return this;
        }
        public Builder syncType(@Nullable String syncType) {
            this.syncType = Codegen.ofNullable(syncType);
            return this;
        }        public ResourceDataSyncArgs build() {
            return new ResourceDataSyncArgs(bucketName, bucketPrefix, bucketRegion, kMSKeyArn, s3Destination, syncFormat, syncSource, syncType);
        }
    }
}
