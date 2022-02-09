// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.AliasPathMetadataResponse;
import io.pulumi.azurenative.resources.outputs.AliasPatternResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AliasPathResponse {
    private final @Nullable List<String> apiVersions;
    private final AliasPathMetadataResponse metadata;
    private final @Nullable String path;
    private final @Nullable AliasPatternResponse pattern;

    @OutputCustomType.Constructor({"apiVersions","metadata","path","pattern"})
    private AliasPathResponse(
        @Nullable List<String> apiVersions,
        AliasPathMetadataResponse metadata,
        @Nullable String path,
        @Nullable AliasPatternResponse pattern) {
        this.apiVersions = apiVersions;
        this.metadata = Objects.requireNonNull(metadata);
        this.path = path;
        this.pattern = pattern;
    }

    public List<String> getApiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }
    public AliasPathMetadataResponse getMetadata() {
        return this.metadata;
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    public Optional<AliasPatternResponse> getPattern() {
        return Optional.ofNullable(this.pattern);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> apiVersions;
        private AliasPathMetadataResponse metadata;
        private @Nullable String path;
        private @Nullable AliasPatternResponse pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersions = defaults.apiVersions;
    	      this.metadata = defaults.metadata;
    	      this.path = defaults.path;
    	      this.pattern = defaults.pattern;
        }

        public Builder setApiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }

        public Builder setMetadata(AliasPathMetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPattern(@Nullable AliasPatternResponse pattern) {
            this.pattern = pattern;
            return this;
        }

        public AliasPathResponse build() {
            return new AliasPathResponse(apiVersions, metadata, path, pattern);
        }
    }
}
