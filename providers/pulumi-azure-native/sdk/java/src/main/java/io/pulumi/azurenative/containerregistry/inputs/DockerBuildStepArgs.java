// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.ArgumentArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Docker build step.
 * 
 */
public final class DockerBuildStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final DockerBuildStepArgs Empty = new DockerBuildStepArgs();

    /**
     * The collection of override arguments to be used when executing this build step.
     * 
     */
    @InputImport(name="arguments")
      private final @Nullable Input<List<ArgumentArgs>> arguments;

    public Input<List<ArgumentArgs>> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    @InputImport(name="contextAccessToken")
      private final @Nullable Input<String> contextAccessToken;

    public Input<String> getContextAccessToken() {
        return this.contextAccessToken == null ? Input.empty() : this.contextAccessToken;
    }

    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    @InputImport(name="contextPath")
      private final @Nullable Input<String> contextPath;

    public Input<String> getContextPath() {
        return this.contextPath == null ? Input.empty() : this.contextPath;
    }

    /**
     * The Docker file path relative to the source context.
     * 
     */
    @InputImport(name="dockerFilePath", required=true)
      private final Input<String> dockerFilePath;

    public Input<String> getDockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * The fully qualified image names including the repository and tag.
     * 
     */
    @InputImport(name="imageNames")
      private final @Nullable Input<List<String>> imageNames;

    public Input<List<String>> getImageNames() {
        return this.imageNames == null ? Input.empty() : this.imageNames;
    }

    /**
     * The value of this property indicates whether the image built should be pushed to the registry or not.
     * 
     */
    @InputImport(name="isPushEnabled")
      private final @Nullable Input<Boolean> isPushEnabled;

    public Input<Boolean> getIsPushEnabled() {
        return this.isPushEnabled == null ? Input.empty() : this.isPushEnabled;
    }

    /**
     * The value of this property indicates whether the image cache is enabled or not.
     * 
     */
    @InputImport(name="noCache")
      private final @Nullable Input<Boolean> noCache;

    public Input<Boolean> getNoCache() {
        return this.noCache == null ? Input.empty() : this.noCache;
    }

    /**
     * The name of the target build stage for the docker build.
     * 
     */
    @InputImport(name="target")
      private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    /**
     * The type of the step.
     * Expected value is 'Docker'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public DockerBuildStepArgs(
        @Nullable Input<List<ArgumentArgs>> arguments,
        @Nullable Input<String> contextAccessToken,
        @Nullable Input<String> contextPath,
        Input<String> dockerFilePath,
        @Nullable Input<List<String>> imageNames,
        @Nullable Input<Boolean> isPushEnabled,
        @Nullable Input<Boolean> noCache,
        @Nullable Input<String> target,
        Input<String> type) {
        this.arguments = arguments;
        this.contextAccessToken = contextAccessToken;
        this.contextPath = contextPath;
        this.dockerFilePath = Objects.requireNonNull(dockerFilePath, "expected parameter 'dockerFilePath' to be non-null");
        this.imageNames = imageNames;
        this.isPushEnabled = isPushEnabled == null ? Input.ofNullable(true) : isPushEnabled;
        this.noCache = noCache == null ? Input.ofNullable(false) : noCache;
        this.target = target;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DockerBuildStepArgs() {
        this.arguments = Input.empty();
        this.contextAccessToken = Input.empty();
        this.contextPath = Input.empty();
        this.dockerFilePath = Input.empty();
        this.imageNames = Input.empty();
        this.isPushEnabled = Input.empty();
        this.noCache = Input.empty();
        this.target = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerBuildStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ArgumentArgs>> arguments;
        private @Nullable Input<String> contextAccessToken;
        private @Nullable Input<String> contextPath;
        private Input<String> dockerFilePath;
        private @Nullable Input<List<String>> imageNames;
        private @Nullable Input<Boolean> isPushEnabled;
        private @Nullable Input<Boolean> noCache;
        private @Nullable Input<String> target;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerBuildStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.contextAccessToken = defaults.contextAccessToken;
    	      this.contextPath = defaults.contextPath;
    	      this.dockerFilePath = defaults.dockerFilePath;
    	      this.imageNames = defaults.imageNames;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.noCache = defaults.noCache;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder setArguments(@Nullable Input<List<ArgumentArgs>> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setArguments(@Nullable List<ArgumentArgs> arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder setContextAccessToken(@Nullable Input<String> contextAccessToken) {
            this.contextAccessToken = contextAccessToken;
            return this;
        }

        public Builder setContextAccessToken(@Nullable String contextAccessToken) {
            this.contextAccessToken = Input.ofNullable(contextAccessToken);
            return this;
        }

        public Builder setContextPath(@Nullable Input<String> contextPath) {
            this.contextPath = contextPath;
            return this;
        }

        public Builder setContextPath(@Nullable String contextPath) {
            this.contextPath = Input.ofNullable(contextPath);
            return this;
        }

        public Builder setDockerFilePath(Input<String> dockerFilePath) {
            this.dockerFilePath = Objects.requireNonNull(dockerFilePath);
            return this;
        }

        public Builder setDockerFilePath(String dockerFilePath) {
            this.dockerFilePath = Input.of(Objects.requireNonNull(dockerFilePath));
            return this;
        }

        public Builder setImageNames(@Nullable Input<List<String>> imageNames) {
            this.imageNames = imageNames;
            return this;
        }

        public Builder setImageNames(@Nullable List<String> imageNames) {
            this.imageNames = Input.ofNullable(imageNames);
            return this;
        }

        public Builder setIsPushEnabled(@Nullable Input<Boolean> isPushEnabled) {
            this.isPushEnabled = isPushEnabled;
            return this;
        }

        public Builder setIsPushEnabled(@Nullable Boolean isPushEnabled) {
            this.isPushEnabled = Input.ofNullable(isPushEnabled);
            return this;
        }

        public Builder setNoCache(@Nullable Input<Boolean> noCache) {
            this.noCache = noCache;
            return this;
        }

        public Builder setNoCache(@Nullable Boolean noCache) {
            this.noCache = Input.ofNullable(noCache);
            return this;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public DockerBuildStepArgs build() {
            return new DockerBuildStepArgs(arguments, contextAccessToken, contextPath, dockerFilePath, imageNames, isPushEnabled, noCache, target, type);
        }
    }
}
