// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.azurenative.resources.inputs.AliasPathMetadataResponse;
import io.pulumi.azurenative.resources.inputs.AliasPathResponse;
import io.pulumi.azurenative.resources.inputs.AliasPatternResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The alias type.
 * 
 */
public final class AliasResponse extends io.pulumi.resources.InvokeArgs {

    public static final AliasResponse Empty = new AliasResponse();

    /**
     * The default alias path metadata. Applies to the default path and to any alias path that doesn't have metadata
     * 
     */
    @Import(name="defaultMetadata", required=true)
      private final AliasPathMetadataResponse defaultMetadata;

    public AliasPathMetadataResponse getDefaultMetadata() {
        return this.defaultMetadata;
    }

    /**
     * The default path for an alias.
     * 
     */
    @Import(name="defaultPath")
      private final @Nullable String defaultPath;

    public Optional<String> getDefaultPath() {
        return this.defaultPath == null ? Optional.empty() : Optional.ofNullable(this.defaultPath);
    }

    /**
     * The default pattern for an alias.
     * 
     */
    @Import(name="defaultPattern")
      private final @Nullable AliasPatternResponse defaultPattern;

    public Optional<AliasPatternResponse> getDefaultPattern() {
        return this.defaultPattern == null ? Optional.empty() : Optional.ofNullable(this.defaultPattern);
    }

    /**
     * The alias name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The paths for an alias.
     * 
     */
    @Import(name="paths")
      private final @Nullable List<AliasPathResponse> paths;

    public List<AliasPathResponse> getPaths() {
        return this.paths == null ? List.of() : this.paths;
    }

    /**
     * The type of the alias.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public AliasResponse(
        AliasPathMetadataResponse defaultMetadata,
        @Nullable String defaultPath,
        @Nullable AliasPatternResponse defaultPattern,
        @Nullable String name,
        @Nullable List<AliasPathResponse> paths,
        @Nullable String type) {
        this.defaultMetadata = Objects.requireNonNull(defaultMetadata, "expected parameter 'defaultMetadata' to be non-null");
        this.defaultPath = defaultPath;
        this.defaultPattern = defaultPattern;
        this.name = name;
        this.paths = paths;
        this.type = type;
    }

    private AliasResponse() {
        this.defaultMetadata = null;
        this.defaultPath = null;
        this.defaultPattern = null;
        this.name = null;
        this.paths = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasPathMetadataResponse defaultMetadata;
        private @Nullable String defaultPath;
        private @Nullable AliasPatternResponse defaultPattern;
        private @Nullable String name;
        private @Nullable List<AliasPathResponse> paths;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMetadata = defaults.defaultMetadata;
    	      this.defaultPath = defaults.defaultPath;
    	      this.defaultPattern = defaults.defaultPattern;
    	      this.name = defaults.name;
    	      this.paths = defaults.paths;
    	      this.type = defaults.type;
        }

        public Builder defaultMetadata(AliasPathMetadataResponse defaultMetadata) {
            this.defaultMetadata = Objects.requireNonNull(defaultMetadata);
            return this;
        }
        public Builder defaultPath(@Nullable String defaultPath) {
            this.defaultPath = defaultPath;
            return this;
        }
        public Builder defaultPattern(@Nullable AliasPatternResponse defaultPattern) {
            this.defaultPattern = defaultPattern;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder paths(@Nullable List<AliasPathResponse> paths) {
            this.paths = paths;
            return this;
        }
        public Builder paths(AliasPathResponse... paths) {
            return paths(List.of(paths));
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public AliasResponse build() {
            return new AliasResponse(defaultMetadata, defaultPath, defaultPattern, name, paths, type);
        }
    }
}
