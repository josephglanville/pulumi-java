// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.DockerBuildArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.DockerImageArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.InferenceContainerPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Environment specification version details.
 * <see href="https://repo2docker.readthedocs.io/en/latest/specification.html" />
 * 
 */
public final class EnvironmentSpecificationVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentSpecificationVersionArgs Empty = new EnvironmentSpecificationVersionArgs();

    /**
     * Standard configuration file used by Conda that lets you install any kind of package, including Python, R, and C/C++ packages.
     * <see href="https://repo2docker.readthedocs.io/en/latest/config_files.html#environment-yml-install-a-conda-environment" />
     * 
     */
    @InputImport(name="condaFile")
      private final @Nullable Input<String> condaFile;

    public Input<String> getCondaFile() {
        return this.condaFile == null ? Input.empty() : this.condaFile;
    }

    /**
     * The asset description text.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Configuration settings for Docker.
     * 
     */
    @InputImport(name="docker")
      private final @Nullable Input<Either<DockerBuildArgs,DockerImageArgs>> docker;

    public Input<Either<DockerBuildArgs,DockerImageArgs>> getDocker() {
        return this.docker == null ? Input.empty() : this.docker;
    }

    /**
     * Defines configuration specific to inference.
     * 
     */
    @InputImport(name="inferenceContainerProperties")
      private final @Nullable Input<InferenceContainerPropertiesArgs> inferenceContainerProperties;

    public Input<InferenceContainerPropertiesArgs> getInferenceContainerProperties() {
        return this.inferenceContainerProperties == null ? Input.empty() : this.inferenceContainerProperties;
    }

    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    @InputImport(name="isAnonymous")
      private final @Nullable Input<Boolean> isAnonymous;

    public Input<Boolean> getIsAnonymous() {
        return this.isAnonymous == null ? Input.empty() : this.isAnonymous;
    }

    /**
     * The asset property dictionary.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public EnvironmentSpecificationVersionArgs(
        @Nullable Input<String> condaFile,
        @Nullable Input<String> description,
        @Nullable Input<Either<DockerBuildArgs,DockerImageArgs>> docker,
        @Nullable Input<InferenceContainerPropertiesArgs> inferenceContainerProperties,
        @Nullable Input<Boolean> isAnonymous,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<Map<String,String>> tags) {
        this.condaFile = condaFile;
        this.description = description;
        this.docker = docker;
        this.inferenceContainerProperties = inferenceContainerProperties;
        this.isAnonymous = isAnonymous;
        this.properties = properties;
        this.tags = tags;
    }

    private EnvironmentSpecificationVersionArgs() {
        this.condaFile = Input.empty();
        this.description = Input.empty();
        this.docker = Input.empty();
        this.inferenceContainerProperties = Input.empty();
        this.isAnonymous = Input.empty();
        this.properties = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentSpecificationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> condaFile;
        private @Nullable Input<String> description;
        private @Nullable Input<Either<DockerBuildArgs,DockerImageArgs>> docker;
        private @Nullable Input<InferenceContainerPropertiesArgs> inferenceContainerProperties;
        private @Nullable Input<Boolean> isAnonymous;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentSpecificationVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condaFile = defaults.condaFile;
    	      this.description = defaults.description;
    	      this.docker = defaults.docker;
    	      this.inferenceContainerProperties = defaults.inferenceContainerProperties;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder setCondaFile(@Nullable Input<String> condaFile) {
            this.condaFile = condaFile;
            return this;
        }

        public Builder setCondaFile(@Nullable String condaFile) {
            this.condaFile = Input.ofNullable(condaFile);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDocker(@Nullable Input<Either<DockerBuildArgs,DockerImageArgs>> docker) {
            this.docker = docker;
            return this;
        }

        public Builder setDocker(@Nullable Either<DockerBuildArgs,DockerImageArgs> docker) {
            this.docker = Input.ofNullable(docker);
            return this;
        }

        public Builder setInferenceContainerProperties(@Nullable Input<InferenceContainerPropertiesArgs> inferenceContainerProperties) {
            this.inferenceContainerProperties = inferenceContainerProperties;
            return this;
        }

        public Builder setInferenceContainerProperties(@Nullable InferenceContainerPropertiesArgs inferenceContainerProperties) {
            this.inferenceContainerProperties = Input.ofNullable(inferenceContainerProperties);
            return this;
        }

        public Builder setIsAnonymous(@Nullable Input<Boolean> isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }

        public Builder setIsAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = Input.ofNullable(isAnonymous);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public EnvironmentSpecificationVersionArgs build() {
            return new EnvironmentSpecificationVersionArgs(condaFile, description, docker, inferenceContainerProperties, isAnonymous, properties, tags);
        }
    }
}
