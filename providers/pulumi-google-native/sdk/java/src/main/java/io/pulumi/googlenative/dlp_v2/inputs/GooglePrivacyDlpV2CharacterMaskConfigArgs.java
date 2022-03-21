// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CharsToIgnoreArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Partially mask a string by replacing a given number of characters with a fixed character. Masking can start from the beginning or end of the string. This can be used on data of any type (numbers, longs, and so on) and when de-identifying structured data we'll attempt to preserve the original data's type. (This allows you to take a long like 123 and modify it to a string like **3.
 * 
 */
public final class GooglePrivacyDlpV2CharacterMaskConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CharacterMaskConfigArgs Empty = new GooglePrivacyDlpV2CharacterMaskConfigArgs();

    /**
     * When masking a string, items in this list will be skipped when replacing characters. For example, if the input string is `555-555-5555` and you instruct Cloud DLP to skip `-` and mask 5 characters with `*`, Cloud DLP returns `***-**5-5555`.
     * 
     */
    @Import(name="charactersToIgnore")
      private final @Nullable Output<List<GooglePrivacyDlpV2CharsToIgnoreArgs>> charactersToIgnore;

    public Output<List<GooglePrivacyDlpV2CharsToIgnoreArgs>> getCharactersToIgnore() {
        return this.charactersToIgnore == null ? Output.empty() : this.charactersToIgnore;
    }

    /**
     * Character to use to mask the sensitive values—for example, `*` for an alphabetic string such as a name, or `0` for a numeric string such as ZIP code or credit card number. This string must have a length of 1. If not supplied, this value defaults to `*` for strings, and `0` for digits.
     * 
     */
    @Import(name="maskingCharacter")
      private final @Nullable Output<String> maskingCharacter;

    public Output<String> getMaskingCharacter() {
        return this.maskingCharacter == null ? Output.empty() : this.maskingCharacter;
    }

    /**
     * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally.
     * 
     */
    @Import(name="numberToMask")
      private final @Nullable Output<Integer> numberToMask;

    public Output<Integer> getNumberToMask() {
        return this.numberToMask == null ? Output.empty() : this.numberToMask;
    }

    /**
     * Mask characters in reverse order. For example, if `masking_character` is `0`, `number_to_mask` is `14`, and `reverse_order` is `false`, then the input string `1234-5678-9012-3456` is masked as `00000000000000-3456`. If `masking_character` is `*`, `number_to_mask` is `3`, and `reverse_order` is `true`, then the string `12345` is masked as `12***`.
     * 
     */
    @Import(name="reverseOrder")
      private final @Nullable Output<Boolean> reverseOrder;

    public Output<Boolean> getReverseOrder() {
        return this.reverseOrder == null ? Output.empty() : this.reverseOrder;
    }

    public GooglePrivacyDlpV2CharacterMaskConfigArgs(
        @Nullable Output<List<GooglePrivacyDlpV2CharsToIgnoreArgs>> charactersToIgnore,
        @Nullable Output<String> maskingCharacter,
        @Nullable Output<Integer> numberToMask,
        @Nullable Output<Boolean> reverseOrder) {
        this.charactersToIgnore = charactersToIgnore;
        this.maskingCharacter = maskingCharacter;
        this.numberToMask = numberToMask;
        this.reverseOrder = reverseOrder;
    }

    private GooglePrivacyDlpV2CharacterMaskConfigArgs() {
        this.charactersToIgnore = Output.empty();
        this.maskingCharacter = Output.empty();
        this.numberToMask = Output.empty();
        this.reverseOrder = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CharacterMaskConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GooglePrivacyDlpV2CharsToIgnoreArgs>> charactersToIgnore;
        private @Nullable Output<String> maskingCharacter;
        private @Nullable Output<Integer> numberToMask;
        private @Nullable Output<Boolean> reverseOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CharacterMaskConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToIgnore = defaults.charactersToIgnore;
    	      this.maskingCharacter = defaults.maskingCharacter;
    	      this.numberToMask = defaults.numberToMask;
    	      this.reverseOrder = defaults.reverseOrder;
        }

        public Builder charactersToIgnore(@Nullable Output<List<GooglePrivacyDlpV2CharsToIgnoreArgs>> charactersToIgnore) {
            this.charactersToIgnore = charactersToIgnore;
            return this;
        }
        public Builder charactersToIgnore(@Nullable List<GooglePrivacyDlpV2CharsToIgnoreArgs> charactersToIgnore) {
            this.charactersToIgnore = Output.ofNullable(charactersToIgnore);
            return this;
        }
        public Builder charactersToIgnore(GooglePrivacyDlpV2CharsToIgnoreArgs... charactersToIgnore) {
            return charactersToIgnore(List.of(charactersToIgnore));
        }
        public Builder maskingCharacter(@Nullable Output<String> maskingCharacter) {
            this.maskingCharacter = maskingCharacter;
            return this;
        }
        public Builder maskingCharacter(@Nullable String maskingCharacter) {
            this.maskingCharacter = Output.ofNullable(maskingCharacter);
            return this;
        }
        public Builder numberToMask(@Nullable Output<Integer> numberToMask) {
            this.numberToMask = numberToMask;
            return this;
        }
        public Builder numberToMask(@Nullable Integer numberToMask) {
            this.numberToMask = Output.ofNullable(numberToMask);
            return this;
        }
        public Builder reverseOrder(@Nullable Output<Boolean> reverseOrder) {
            this.reverseOrder = reverseOrder;
            return this;
        }
        public Builder reverseOrder(@Nullable Boolean reverseOrder) {
            this.reverseOrder = Output.ofNullable(reverseOrder);
            return this;
        }        public GooglePrivacyDlpV2CharacterMaskConfigArgs build() {
            return new GooglePrivacyDlpV2CharacterMaskConfigArgs(charactersToIgnore, maskingCharacter, numberToMask, reverseOrder);
        }
    }
}
