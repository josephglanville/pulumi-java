// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs();

    /**
     * Characters to not transform when masking.
     * 
     */
    @Import(name="charactersToSkip")
      private final @Nullable Output<String> charactersToSkip;

    public Output<String> getCharactersToSkip() {
        return this.charactersToSkip == null ? Codegen.empty() : this.charactersToSkip;
    }

    /**
     * Common characters to not transform when masking. Useful to avoid removing punctuation.
     * Possible values are `NUMERIC`, `ALPHA_UPPER_CASE`, `ALPHA_LOWER_CASE`, `PUNCTUATION`, and `WHITESPACE`.
     * 
     */
    @Import(name="commonCharactersToIgnore")
      private final @Nullable Output<String> commonCharactersToIgnore;

    public Output<String> getCommonCharactersToIgnore() {
        return this.commonCharactersToIgnore == null ? Codegen.empty() : this.commonCharactersToIgnore;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs(
        @Nullable Output<String> charactersToSkip,
        @Nullable Output<String> commonCharactersToIgnore) {
        this.charactersToSkip = charactersToSkip;
        this.commonCharactersToIgnore = commonCharactersToIgnore;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs() {
        this.charactersToSkip = Codegen.empty();
        this.commonCharactersToIgnore = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> charactersToSkip;
        private @Nullable Output<String> commonCharactersToIgnore;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToSkip = defaults.charactersToSkip;
    	      this.commonCharactersToIgnore = defaults.commonCharactersToIgnore;
        }

        public Builder charactersToSkip(@Nullable Output<String> charactersToSkip) {
            this.charactersToSkip = charactersToSkip;
            return this;
        }
        public Builder charactersToSkip(@Nullable String charactersToSkip) {
            this.charactersToSkip = Codegen.ofNullable(charactersToSkip);
            return this;
        }
        public Builder commonCharactersToIgnore(@Nullable Output<String> commonCharactersToIgnore) {
            this.commonCharactersToIgnore = commonCharactersToIgnore;
            return this;
        }
        public Builder commonCharactersToIgnore(@Nullable String commonCharactersToIgnore) {
            this.commonCharactersToIgnore = Codegen.ofNullable(commonCharactersToIgnore);
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs(charactersToSkip, commonCharactersToIgnore);
        }
    }
}
