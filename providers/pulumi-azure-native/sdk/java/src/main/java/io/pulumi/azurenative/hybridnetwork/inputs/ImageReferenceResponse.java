// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageReferenceResponse Empty = new ImageReferenceResponse();

    @InputImport(name="exactVersion")
    private final @Nullable String exactVersion;

    public Optional<String> getExactVersion() {
        return this.exactVersion == null ? Optional.empty() : Optional.ofNullable(this.exactVersion);
    }

    @InputImport(name="offer")
    private final @Nullable String offer;

    public Optional<String> getOffer() {
        return this.offer == null ? Optional.empty() : Optional.ofNullable(this.offer);
    }

    @InputImport(name="publisher")
    private final @Nullable String publisher;

    public Optional<String> getPublisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    @InputImport(name="sku")
    private final @Nullable String sku;

    public Optional<String> getSku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    @InputImport(name="version")
    private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ImageReferenceResponse(
        @Nullable String exactVersion,
        @Nullable String offer,
        @Nullable String publisher,
        @Nullable String sku,
        @Nullable String version) {
        this.exactVersion = exactVersion;
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    private ImageReferenceResponse() {
        this.exactVersion = null;
        this.offer = null;
        this.publisher = null;
        this.sku = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exactVersion;
        private @Nullable String offer;
        private @Nullable String publisher;
        private @Nullable String sku;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactVersion = defaults.exactVersion;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder setExactVersion(@Nullable String exactVersion) {
            this.exactVersion = exactVersion;
            return this;
        }

        public Builder setOffer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ImageReferenceResponse build() {
            return new ImageReferenceResponse(exactVersion, offer, publisher, sku, version);
        }
    }
}
