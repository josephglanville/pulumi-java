// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.ContentHashResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContentSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentSourceResponse Empty = new ContentSourceResponse();

    @InputImport(name="hash")
    private final @Nullable ContentHashResponse hash;

    public Optional<ContentHashResponse> getHash() {
        return this.hash == null ? Optional.empty() : Optional.ofNullable(this.hash);
    }

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    @InputImport(name="value")
    private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    @InputImport(name="version")
    private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ContentSourceResponse(
        @Nullable ContentHashResponse hash,
        @Nullable String type,
        @Nullable String value,
        @Nullable String version) {
        this.hash = hash;
        this.type = type;
        this.value = value;
        this.version = version;
    }

    private ContentSourceResponse() {
        this.hash = null;
        this.type = null;
        this.value = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContentHashResponse hash;
        private @Nullable String type;
        private @Nullable String value;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hash = defaults.hash;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
    	      this.version = defaults.version;
        }

        public Builder setHash(@Nullable ContentHashResponse hash) {
            this.hash = hash;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ContentSourceResponse build() {
            return new ContentSourceResponse(hash, type, value, version);
        }
    }
}
