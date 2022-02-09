// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.enums.UserSourceType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserSourceInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserSourceInfoArgs Empty = new UserSourceInfoArgs();

    @InputImport(name="artifactSelector")
    private final @Nullable Input<String> artifactSelector;

    public Input<String> getArtifactSelector() {
        return this.artifactSelector == null ? Input.empty() : this.artifactSelector;
    }

    @InputImport(name="relativePath")
    private final @Nullable Input<String> relativePath;

    public Input<String> getRelativePath() {
        return this.relativePath == null ? Input.empty() : this.relativePath;
    }

    @InputImport(name="type")
    private final @Nullable Input<Either<String,UserSourceType>> type;

    public Input<Either<String,UserSourceType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public UserSourceInfoArgs(
        @Nullable Input<String> artifactSelector,
        @Nullable Input<String> relativePath,
        @Nullable Input<Either<String,UserSourceType>> type,
        @Nullable Input<String> version) {
        this.artifactSelector = artifactSelector;
        this.relativePath = relativePath;
        this.type = type;
        this.version = version;
    }

    private UserSourceInfoArgs() {
        this.artifactSelector = Input.empty();
        this.relativePath = Input.empty();
        this.type = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSourceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> artifactSelector;
        private @Nullable Input<String> relativePath;
        private @Nullable Input<Either<String,UserSourceType>> type;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(UserSourceInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactSelector = defaults.artifactSelector;
    	      this.relativePath = defaults.relativePath;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setArtifactSelector(@Nullable Input<String> artifactSelector) {
            this.artifactSelector = artifactSelector;
            return this;
        }

        public Builder setArtifactSelector(@Nullable String artifactSelector) {
            this.artifactSelector = Input.ofNullable(artifactSelector);
            return this;
        }

        public Builder setRelativePath(@Nullable Input<String> relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        public Builder setRelativePath(@Nullable String relativePath) {
            this.relativePath = Input.ofNullable(relativePath);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,UserSourceType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,UserSourceType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public UserSourceInfoArgs build() {
            return new UserSourceInfoArgs(artifactSelector, relativePath, type, version);
        }
    }
}
