// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisvideo.outputs;

import io.pulumi.awsnative.kinesisvideo.outputs.StreamTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStreamResult {
    private final @Nullable String arn;
    private final @Nullable Integer dataRetentionInHours;
    private final @Nullable String deviceName;
    private final @Nullable String kmsKeyId;
    private final @Nullable String mediaType;
    private final @Nullable List<StreamTag> tags;

    @OutputCustomType.Constructor({"arn","dataRetentionInHours","deviceName","kmsKeyId","mediaType","tags"})
    private GetStreamResult(
        @Nullable String arn,
        @Nullable Integer dataRetentionInHours,
        @Nullable String deviceName,
        @Nullable String kmsKeyId,
        @Nullable String mediaType,
        @Nullable List<StreamTag> tags) {
        this.arn = arn;
        this.dataRetentionInHours = dataRetentionInHours;
        this.deviceName = deviceName;
        this.kmsKeyId = kmsKeyId;
        this.mediaType = mediaType;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<Integer> getDataRetentionInHours() {
        return Optional.ofNullable(this.dataRetentionInHours);
    }
    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    public Optional<String> getMediaType() {
        return Optional.ofNullable(this.mediaType);
    }
    public List<StreamTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Integer dataRetentionInHours;
        private @Nullable String deviceName;
        private @Nullable String kmsKeyId;
        private @Nullable String mediaType;
        private @Nullable List<StreamTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataRetentionInHours = defaults.dataRetentionInHours;
    	      this.deviceName = defaults.deviceName;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.mediaType = defaults.mediaType;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDataRetentionInHours(@Nullable Integer dataRetentionInHours) {
            this.dataRetentionInHours = dataRetentionInHours;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setMediaType(@Nullable String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        public Builder setTags(@Nullable List<StreamTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetStreamResult build() {
            return new GetStreamResult(arn, dataRetentionInHours, deviceName, kmsKeyId, mediaType, tags);
        }
    }
}