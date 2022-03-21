// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Used with unidirectional glossaries.
 * 
 */
public final class LanguageCodePairResponse extends io.pulumi.resources.InvokeArgs {

    public static final LanguageCodePairResponse Empty = new LanguageCodePairResponse();

    /**
     * The BCP-47 language code of the input text, for example, "en-US". Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    @Import(name="sourceLanguageCode", required=true)
      private final String sourceLanguageCode;

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * The BCP-47 language code for translation output, for example, "zh-CN". Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    @Import(name="targetLanguageCode", required=true)
      private final String targetLanguageCode;

    public String getTargetLanguageCode() {
        return this.targetLanguageCode;
    }

    public LanguageCodePairResponse(
        String sourceLanguageCode,
        String targetLanguageCode) {
        this.sourceLanguageCode = Objects.requireNonNull(sourceLanguageCode, "expected parameter 'sourceLanguageCode' to be non-null");
        this.targetLanguageCode = Objects.requireNonNull(targetLanguageCode, "expected parameter 'targetLanguageCode' to be non-null");
    }

    private LanguageCodePairResponse() {
        this.sourceLanguageCode = null;
        this.targetLanguageCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LanguageCodePairResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceLanguageCode;
        private String targetLanguageCode;

        public Builder() {
    	      // Empty
        }

        public Builder(LanguageCodePairResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceLanguageCode = defaults.sourceLanguageCode;
    	      this.targetLanguageCode = defaults.targetLanguageCode;
        }

        public Builder sourceLanguageCode(String sourceLanguageCode) {
            this.sourceLanguageCode = Objects.requireNonNull(sourceLanguageCode);
            return this;
        }
        public Builder targetLanguageCode(String targetLanguageCode) {
            this.targetLanguageCode = Objects.requireNonNull(targetLanguageCode);
            return this;
        }        public LanguageCodePairResponse build() {
            return new LanguageCodePairResponse(sourceLanguageCode, targetLanguageCode);
        }
    }
}
