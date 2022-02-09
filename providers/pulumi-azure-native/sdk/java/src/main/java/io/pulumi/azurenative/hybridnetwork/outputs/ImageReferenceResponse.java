// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageReferenceResponse {
    private final @Nullable String exactVersion;
    private final @Nullable String offer;
    private final @Nullable String publisher;
    private final @Nullable String sku;
    private final @Nullable String version;

    @OutputCustomType.Constructor({"exactVersion","offer","publisher","sku","version"})
    private ImageReferenceResponse(
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

    public Optional<String> getExactVersion() {
        return Optional.ofNullable(this.exactVersion);
    }
    public Optional<String> getOffer() {
        return Optional.ofNullable(this.offer);
    }
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
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
