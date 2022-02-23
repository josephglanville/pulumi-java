// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs();

    /**
     * Characters to skip when doing de-identification of a value. These will be left alone and skipped.
     * Structure is documented below.
     * 
     */
    @InputImport(name="charactersToIgnores")
      private final @Nullable Input<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs>> charactersToIgnores;

    public Input<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs>> getCharactersToIgnores() {
        return this.charactersToIgnores == null ? Input.empty() : this.charactersToIgnores;
    }

    /**
     * Character to use to mask the sensitive values—for example, * for an alphabetic string such as a name, or 0 for a numeric string
     * such as ZIP code or credit card number. This string must have a length of 1. If not supplied, this value defaults to * for
     * strings, and 0 for digits.
     * 
     */
    @InputImport(name="maskingCharacter")
      private final @Nullable Input<String> maskingCharacter;

    public Input<String> getMaskingCharacter() {
        return this.maskingCharacter == null ? Input.empty() : this.maskingCharacter;
    }

    /**
     * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally.
     * 
     */
    @InputImport(name="numberToMask")
      private final @Nullable Input<Integer> numberToMask;

    public Input<Integer> getNumberToMask() {
        return this.numberToMask == null ? Input.empty() : this.numberToMask;
    }

    /**
     * Mask characters in reverse order. For example, if masking_character is 0, number_to_mask is 14, and reverse_order is `false`, then the
     * input string `1234-5678-9012-3456` is masked as `00000000000000-3456`.
     * 
     */
    @InputImport(name="reverseOrder")
      private final @Nullable Input<Boolean> reverseOrder;

    public Input<Boolean> getReverseOrder() {
        return this.reverseOrder == null ? Input.empty() : this.reverseOrder;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs(
        @Nullable Input<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs>> charactersToIgnores,
        @Nullable Input<String> maskingCharacter,
        @Nullable Input<Integer> numberToMask,
        @Nullable Input<Boolean> reverseOrder) {
        this.charactersToIgnores = charactersToIgnores;
        this.maskingCharacter = maskingCharacter;
        this.numberToMask = numberToMask;
        this.reverseOrder = reverseOrder;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs() {
        this.charactersToIgnores = Input.empty();
        this.maskingCharacter = Input.empty();
        this.numberToMask = Input.empty();
        this.reverseOrder = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs>> charactersToIgnores;
        private @Nullable Input<String> maskingCharacter;
        private @Nullable Input<Integer> numberToMask;
        private @Nullable Input<Boolean> reverseOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToIgnores = defaults.charactersToIgnores;
    	      this.maskingCharacter = defaults.maskingCharacter;
    	      this.numberToMask = defaults.numberToMask;
    	      this.reverseOrder = defaults.reverseOrder;
        }

        public Builder setCharactersToIgnores(@Nullable Input<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs>> charactersToIgnores) {
            this.charactersToIgnores = charactersToIgnores;
            return this;
        }

        public Builder setCharactersToIgnores(@Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs> charactersToIgnores) {
            this.charactersToIgnores = Input.ofNullable(charactersToIgnores);
            return this;
        }

        public Builder setMaskingCharacter(@Nullable Input<String> maskingCharacter) {
            this.maskingCharacter = maskingCharacter;
            return this;
        }

        public Builder setMaskingCharacter(@Nullable String maskingCharacter) {
            this.maskingCharacter = Input.ofNullable(maskingCharacter);
            return this;
        }

        public Builder setNumberToMask(@Nullable Input<Integer> numberToMask) {
            this.numberToMask = numberToMask;
            return this;
        }

        public Builder setNumberToMask(@Nullable Integer numberToMask) {
            this.numberToMask = Input.ofNullable(numberToMask);
            return this;
        }

        public Builder setReverseOrder(@Nullable Input<Boolean> reverseOrder) {
            this.reverseOrder = reverseOrder;
            return this;
        }

        public Builder setReverseOrder(@Nullable Boolean reverseOrder) {
            this.reverseOrder = Input.ofNullable(reverseOrder);
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs(charactersToIgnores, maskingCharacter, numberToMask, reverseOrder);
        }
    }
}
