// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1.inputs.MaterialArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.SlsaBuilderArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.SlsaMetadataArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.SlsaRecipeArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SlsaProvenanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SlsaProvenanceArgs Empty = new SlsaProvenanceArgs();

    /**
     * required
     * 
     */
    @Import(name="builder")
      private final @Nullable Output<SlsaBuilderArgs> builder;

    public Output<SlsaBuilderArgs> getBuilder() {
        return this.builder == null ? Codegen.empty() : this.builder;
    }

    /**
     * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
     */
    @Import(name="materials")
      private final @Nullable Output<List<MaterialArgs>> materials;

    public Output<List<MaterialArgs>> getMaterials() {
        return this.materials == null ? Codegen.empty() : this.materials;
    }

    @Import(name="metadata")
      private final @Nullable Output<SlsaMetadataArgs> metadata;

    public Output<SlsaMetadataArgs> getMetadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
     * 
     */
    @Import(name="recipe")
      private final @Nullable Output<SlsaRecipeArgs> recipe;

    public Output<SlsaRecipeArgs> getRecipe() {
        return this.recipe == null ? Codegen.empty() : this.recipe;
    }

    public SlsaProvenanceArgs(
        @Nullable Output<SlsaBuilderArgs> builder,
        @Nullable Output<List<MaterialArgs>> materials,
        @Nullable Output<SlsaMetadataArgs> metadata,
        @Nullable Output<SlsaRecipeArgs> recipe) {
        this.builder = builder;
        this.materials = materials;
        this.metadata = metadata;
        this.recipe = recipe;
    }

    private SlsaProvenanceArgs() {
        this.builder = Codegen.empty();
        this.materials = Codegen.empty();
        this.metadata = Codegen.empty();
        this.recipe = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaProvenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SlsaBuilderArgs> builder;
        private @Nullable Output<List<MaterialArgs>> materials;
        private @Nullable Output<SlsaMetadataArgs> metadata;
        private @Nullable Output<SlsaRecipeArgs> recipe;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaProvenanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builder = defaults.builder;
    	      this.materials = defaults.materials;
    	      this.metadata = defaults.metadata;
    	      this.recipe = defaults.recipe;
        }

        public Builder builder(@Nullable Output<SlsaBuilderArgs> builder) {
            this.builder = builder;
            return this;
        }
        public Builder builder(@Nullable SlsaBuilderArgs builder) {
            this.builder = Codegen.ofNullable(builder);
            return this;
        }
        public Builder materials(@Nullable Output<List<MaterialArgs>> materials) {
            this.materials = materials;
            return this;
        }
        public Builder materials(@Nullable List<MaterialArgs> materials) {
            this.materials = Codegen.ofNullable(materials);
            return this;
        }
        public Builder materials(MaterialArgs... materials) {
            return materials(List.of(materials));
        }
        public Builder metadata(@Nullable Output<SlsaMetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable SlsaMetadataArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder recipe(@Nullable Output<SlsaRecipeArgs> recipe) {
            this.recipe = recipe;
            return this;
        }
        public Builder recipe(@Nullable SlsaRecipeArgs recipe) {
            this.recipe = Codegen.ofNullable(recipe);
            return this;
        }        public SlsaProvenanceArgs build() {
            return new SlsaProvenanceArgs(builder, materials, metadata, recipe);
        }
    }
}
