// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationTargetContainerRepositoryArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container distribution settings for encryption, licensing, and sharing in a specific Region.
 * 
 */
public final class DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs Empty = new DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs();

    /**
     * Tags that are attached to the container distribution configuration.
     * 
     */
    @Import(name="containerTags")
      private final @Nullable Output<List<String>> containerTags;

    public Output<List<String>> getContainerTags() {
        return this.containerTags == null ? Output.empty() : this.containerTags;
    }

    /**
     * The description of the container distribution configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The destination repository for the container distribution configuration.
     * 
     */
    @Import(name="targetRepository")
      private final @Nullable Output<DistributionConfigurationTargetContainerRepositoryArgs> targetRepository;

    public Output<DistributionConfigurationTargetContainerRepositoryArgs> getTargetRepository() {
        return this.targetRepository == null ? Output.empty() : this.targetRepository;
    }

    public DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs(
        @Nullable Output<List<String>> containerTags,
        @Nullable Output<String> description,
        @Nullable Output<DistributionConfigurationTargetContainerRepositoryArgs> targetRepository) {
        this.containerTags = containerTags;
        this.description = description;
        this.targetRepository = targetRepository;
    }

    private DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs() {
        this.containerTags = Output.empty();
        this.description = Output.empty();
        this.targetRepository = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> containerTags;
        private @Nullable Output<String> description;
        private @Nullable Output<DistributionConfigurationTargetContainerRepositoryArgs> targetRepository;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerTags = defaults.containerTags;
    	      this.description = defaults.description;
    	      this.targetRepository = defaults.targetRepository;
        }

        public Builder containerTags(@Nullable Output<List<String>> containerTags) {
            this.containerTags = containerTags;
            return this;
        }
        public Builder containerTags(@Nullable List<String> containerTags) {
            this.containerTags = Output.ofNullable(containerTags);
            return this;
        }
        public Builder containerTags(String... containerTags) {
            return containerTags(List.of(containerTags));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder targetRepository(@Nullable Output<DistributionConfigurationTargetContainerRepositoryArgs> targetRepository) {
            this.targetRepository = targetRepository;
            return this;
        }
        public Builder targetRepository(@Nullable DistributionConfigurationTargetContainerRepositoryArgs targetRepository) {
            this.targetRepository = Output.ofNullable(targetRepository);
            return this;
        }        public DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs build() {
            return new DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs(containerTags, description, targetRepository);
        }
    }
}
