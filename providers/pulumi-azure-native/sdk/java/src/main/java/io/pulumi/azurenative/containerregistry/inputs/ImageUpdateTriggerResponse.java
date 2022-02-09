// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.ImageDescriptorResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageUpdateTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageUpdateTriggerResponse Empty = new ImageUpdateTriggerResponse();

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="images")
    private final @Nullable List<ImageDescriptorResponse> images;

    public List<ImageDescriptorResponse> getImages() {
        return this.images == null ? List.of() : this.images;
    }

    @InputImport(name="timestamp")
    private final @Nullable String timestamp;

    public Optional<String> getTimestamp() {
        return this.timestamp == null ? Optional.empty() : Optional.ofNullable(this.timestamp);
    }

    public ImageUpdateTriggerResponse(
        @Nullable String id,
        @Nullable List<ImageDescriptorResponse> images,
        @Nullable String timestamp) {
        this.id = id;
        this.images = images;
        this.timestamp = timestamp;
    }

    private ImageUpdateTriggerResponse() {
        this.id = null;
        this.images = List.of();
        this.timestamp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageUpdateTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable List<ImageDescriptorResponse> images;
        private @Nullable String timestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageUpdateTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.images = defaults.images;
    	      this.timestamp = defaults.timestamp;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setImages(@Nullable List<ImageDescriptorResponse> images) {
            this.images = images;
            return this;
        }

        public Builder setTimestamp(@Nullable String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ImageUpdateTriggerResponse build() {
            return new ImageUpdateTriggerResponse(id, images, timestamp);
        }
    }
}
