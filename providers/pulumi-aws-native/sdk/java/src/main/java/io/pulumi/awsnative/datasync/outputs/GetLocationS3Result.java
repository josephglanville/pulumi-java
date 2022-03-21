// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.outputs.LocationS3Tag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLocationS3Result {
    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket location.
     * 
     */
    private final @Nullable String locationArn;
    /**
     * The URL of the S3 location that was described.
     * 
     */
    private final @Nullable String locationUri;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<LocationS3Tag> tags;

    @CustomType.Constructor
    private GetLocationS3Result(
        @CustomType.Parameter("locationArn") @Nullable String locationArn,
        @CustomType.Parameter("locationUri") @Nullable String locationUri,
        @CustomType.Parameter("tags") @Nullable List<LocationS3Tag> tags) {
        this.locationArn = locationArn;
        this.locationUri = locationUri;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket location.
     * 
    */
    public Optional<String> getLocationArn() {
        return Optional.ofNullable(this.locationArn);
    }
    /**
     * The URL of the S3 location that was described.
     * 
    */
    public Optional<String> getLocationUri() {
        return Optional.ofNullable(this.locationUri);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<LocationS3Tag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationS3Result defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String locationArn;
        private @Nullable String locationUri;
        private @Nullable List<LocationS3Tag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationS3Result defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationArn = defaults.locationArn;
    	      this.locationUri = defaults.locationUri;
    	      this.tags = defaults.tags;
        }

        public Builder locationArn(@Nullable String locationArn) {
            this.locationArn = locationArn;
            return this;
        }
        public Builder locationUri(@Nullable String locationUri) {
            this.locationUri = locationUri;
            return this;
        }
        public Builder tags(@Nullable List<LocationS3Tag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(LocationS3Tag... tags) {
            return tags(List.of(tags));
        }        public GetLocationS3Result build() {
            return new GetLocationS3Result(locationArn, locationUri, tags);
        }
    }
}
