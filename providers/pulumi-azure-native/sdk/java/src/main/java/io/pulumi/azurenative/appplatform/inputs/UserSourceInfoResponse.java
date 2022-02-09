// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserSourceInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserSourceInfoResponse Empty = new UserSourceInfoResponse();

    @InputImport(name="artifactSelector")
    private final @Nullable String artifactSelector;

    public Optional<String> getArtifactSelector() {
        return this.artifactSelector == null ? Optional.empty() : Optional.ofNullable(this.artifactSelector);
    }

    @InputImport(name="relativePath")
    private final @Nullable String relativePath;

    public Optional<String> getRelativePath() {
        return this.relativePath == null ? Optional.empty() : Optional.ofNullable(this.relativePath);
    }

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    @InputImport(name="version")
    private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public UserSourceInfoResponse(
        @Nullable String artifactSelector,
        @Nullable String relativePath,
        @Nullable String type,
        @Nullable String version) {
        this.artifactSelector = artifactSelector;
        this.relativePath = relativePath;
        this.type = type;
        this.version = version;
    }

    private UserSourceInfoResponse() {
        this.artifactSelector = null;
        this.relativePath = null;
        this.type = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String artifactSelector;
        private @Nullable String relativePath;
        private @Nullable String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(UserSourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactSelector = defaults.artifactSelector;
    	      this.relativePath = defaults.relativePath;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setArtifactSelector(@Nullable String artifactSelector) {
            this.artifactSelector = artifactSelector;
            return this;
        }

        public Builder setRelativePath(@Nullable String relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public UserSourceInfoResponse build() {
            return new UserSourceInfoResponse(artifactSelector, relativePath, type, version);
        }
    }
}
