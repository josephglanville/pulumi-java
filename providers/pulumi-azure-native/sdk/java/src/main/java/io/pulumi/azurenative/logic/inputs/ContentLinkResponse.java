// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.ContentHashResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContentLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentLinkResponse Empty = new ContentLinkResponse();

    @InputImport(name="contentHash", required=true)
    private final ContentHashResponse contentHash;

    public ContentHashResponse getContentHash() {
        return this.contentHash;
    }

    @InputImport(name="contentSize", required=true)
    private final Double contentSize;

    public Double getContentSize() {
        return this.contentSize;
    }

    @InputImport(name="contentVersion", required=true)
    private final String contentVersion;

    public String getContentVersion() {
        return this.contentVersion;
    }

    @InputImport(name="metadata", required=true)
    private final Object metadata;

    public Object getMetadata() {
        return this.metadata;
    }

    @InputImport(name="uri")
    private final @Nullable String uri;

    public Optional<String> getUri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    public ContentLinkResponse(
        ContentHashResponse contentHash,
        Double contentSize,
        String contentVersion,
        Object metadata,
        @Nullable String uri) {
        this.contentHash = Objects.requireNonNull(contentHash, "expected parameter 'contentHash' to be non-null");
        this.contentSize = Objects.requireNonNull(contentSize, "expected parameter 'contentSize' to be non-null");
        this.contentVersion = Objects.requireNonNull(contentVersion, "expected parameter 'contentVersion' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.uri = uri;
    }

    private ContentLinkResponse() {
        this.contentHash = null;
        this.contentSize = null;
        this.contentVersion = null;
        this.metadata = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentHashResponse contentHash;
        private Double contentSize;
        private String contentVersion;
        private Object metadata;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentHash = defaults.contentHash;
    	      this.contentSize = defaults.contentSize;
    	      this.contentVersion = defaults.contentVersion;
    	      this.metadata = defaults.metadata;
    	      this.uri = defaults.uri;
        }

        public Builder setContentHash(ContentHashResponse contentHash) {
            this.contentHash = Objects.requireNonNull(contentHash);
            return this;
        }

        public Builder setContentSize(Double contentSize) {
            this.contentSize = Objects.requireNonNull(contentSize);
            return this;
        }

        public Builder setContentVersion(String contentVersion) {
            this.contentVersion = Objects.requireNonNull(contentVersion);
            return this;
        }

        public Builder setMetadata(Object metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }

        public ContentLinkResponse build() {
            return new ContentLinkResponse(contentHash, contentSize, contentVersion, metadata, uri);
        }
    }
}
