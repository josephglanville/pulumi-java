// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.enums.ContainerRecipeTargetContainerRepositoryService;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerRecipeTargetContainerRepository {
    private final @Nullable String repositoryName;
    private final @Nullable ContainerRecipeTargetContainerRepositoryService service;

    @OutputCustomType.Constructor({"repositoryName","service"})
    private ContainerRecipeTargetContainerRepository(
        @Nullable String repositoryName,
        @Nullable ContainerRecipeTargetContainerRepositoryService service) {
        this.repositoryName = repositoryName;
        this.service = service;
    }

    public Optional<String> getRepositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }
    public Optional<ContainerRecipeTargetContainerRepositoryService> getService() {
        return Optional.ofNullable(this.service);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeTargetContainerRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String repositoryName;
        private @Nullable ContainerRecipeTargetContainerRepositoryService service;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeTargetContainerRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
    	      this.service = defaults.service;
        }

        public Builder setRepositoryName(@Nullable String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder setService(@Nullable ContainerRecipeTargetContainerRepositoryService service) {
            this.service = service;
            return this;
        }

        public ContainerRecipeTargetContainerRepository build() {
            return new ContainerRecipeTargetContainerRepository(repositoryName, service);
        }
    }
}