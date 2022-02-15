// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublisherInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final PublisherInfoResponse Empty = new PublisherInfoResponse();

    @InputImport(name="binaryName")
    private final @Nullable String binaryName;

    public Optional<String> getBinaryName() {
        return this.binaryName == null ? Optional.empty() : Optional.ofNullable(this.binaryName);
    }

    @InputImport(name="productName")
    private final @Nullable String productName;

    public Optional<String> getProductName() {
        return this.productName == null ? Optional.empty() : Optional.ofNullable(this.productName);
    }

    @InputImport(name="publisherName")
    private final @Nullable String publisherName;

    public Optional<String> getPublisherName() {
        return this.publisherName == null ? Optional.empty() : Optional.ofNullable(this.publisherName);
    }

    @InputImport(name="version")
    private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public PublisherInfoResponse(
        @Nullable String binaryName,
        @Nullable String productName,
        @Nullable String publisherName,
        @Nullable String version) {
        this.binaryName = binaryName;
        this.productName = productName;
        this.publisherName = publisherName;
        this.version = version;
    }

    private PublisherInfoResponse() {
        this.binaryName = null;
        this.productName = null;
        this.publisherName = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublisherInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String binaryName;
        private @Nullable String productName;
        private @Nullable String publisherName;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(PublisherInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryName = defaults.binaryName;
    	      this.productName = defaults.productName;
    	      this.publisherName = defaults.publisherName;
    	      this.version = defaults.version;
        }

        public Builder setBinaryName(@Nullable String binaryName) {
            this.binaryName = binaryName;
            return this;
        }

        public Builder setProductName(@Nullable String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setPublisherName(@Nullable String publisherName) {
            this.publisherName = publisherName;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public PublisherInfoResponse build() {
            return new PublisherInfoResponse(binaryName, productName, publisherName, version);
        }
    }
}