// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectCacheArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectCacheArgs Empty = new ProjectCacheArgs();

    /**
     * Location of the source code from git or s3.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Specifies settings that AWS CodeBuild uses to store and reuse build dependencies. Valid values:  `LOCAL_SOURCE_CACHE`, `LOCAL_DOCKER_LAYER_CACHE`, `LOCAL_CUSTOM_CACHE`.
     * 
     */
    @Import(name="modes")
      private final @Nullable Output<List<String>> modes;

    public Output<List<String>> getModes() {
        return this.modes == null ? Output.empty() : this.modes;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public ProjectCacheArgs(
        @Nullable Output<String> location,
        @Nullable Output<List<String>> modes,
        @Nullable Output<String> type) {
        this.location = location;
        this.modes = modes;
        this.type = type;
    }

    private ProjectCacheArgs() {
        this.location = Output.empty();
        this.modes = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectCacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<List<String>> modes;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectCacheArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.modes = defaults.modes;
    	      this.type = defaults.type;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder modes(@Nullable Output<List<String>> modes) {
            this.modes = modes;
            return this;
        }
        public Builder modes(@Nullable List<String> modes) {
            this.modes = Output.ofNullable(modes);
            return this;
        }
        public Builder modes(String... modes) {
            return modes(List.of(modes));
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public ProjectCacheArgs build() {
            return new ProjectCacheArgs(location, modes, type);
        }
    }
}
