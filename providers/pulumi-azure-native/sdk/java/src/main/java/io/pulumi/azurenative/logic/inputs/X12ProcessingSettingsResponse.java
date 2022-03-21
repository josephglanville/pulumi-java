// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The X12 processing settings.
 * 
 */
public final class X12ProcessingSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final X12ProcessingSettingsResponse Empty = new X12ProcessingSettingsResponse();

    /**
     * The value indicating whether to convert numerical type to implied decimal.
     * 
     */
    @Import(name="convertImpliedDecimal", required=true)
      private final Boolean convertImpliedDecimal;

    public Boolean getConvertImpliedDecimal() {
        return this.convertImpliedDecimal;
    }

    /**
     * The value indicating whether to create empty xml tags for trailing separators.
     * 
     */
    @Import(name="createEmptyXmlTagsForTrailingSeparators", required=true)
      private final Boolean createEmptyXmlTagsForTrailingSeparators;

    public Boolean getCreateEmptyXmlTagsForTrailingSeparators() {
        return this.createEmptyXmlTagsForTrailingSeparators;
    }

    /**
     * The value indicating whether to mask security information.
     * 
     */
    @Import(name="maskSecurityInfo", required=true)
      private final Boolean maskSecurityInfo;

    public Boolean getMaskSecurityInfo() {
        return this.maskSecurityInfo;
    }

    /**
     * The value indicating whether to preserve interchange.
     * 
     */
    @Import(name="preserveInterchange", required=true)
      private final Boolean preserveInterchange;

    public Boolean getPreserveInterchange() {
        return this.preserveInterchange;
    }

    /**
     * The value indicating whether to suspend interchange on error.
     * 
     */
    @Import(name="suspendInterchangeOnError", required=true)
      private final Boolean suspendInterchangeOnError;

    public Boolean getSuspendInterchangeOnError() {
        return this.suspendInterchangeOnError;
    }

    /**
     * The value indicating whether to use dot as decimal separator.
     * 
     */
    @Import(name="useDotAsDecimalSeparator", required=true)
      private final Boolean useDotAsDecimalSeparator;

    public Boolean getUseDotAsDecimalSeparator() {
        return this.useDotAsDecimalSeparator;
    }

    public X12ProcessingSettingsResponse(
        Boolean convertImpliedDecimal,
        Boolean createEmptyXmlTagsForTrailingSeparators,
        Boolean maskSecurityInfo,
        Boolean preserveInterchange,
        Boolean suspendInterchangeOnError,
        Boolean useDotAsDecimalSeparator) {
        this.convertImpliedDecimal = Objects.requireNonNull(convertImpliedDecimal, "expected parameter 'convertImpliedDecimal' to be non-null");
        this.createEmptyXmlTagsForTrailingSeparators = Objects.requireNonNull(createEmptyXmlTagsForTrailingSeparators, "expected parameter 'createEmptyXmlTagsForTrailingSeparators' to be non-null");
        this.maskSecurityInfo = Objects.requireNonNull(maskSecurityInfo, "expected parameter 'maskSecurityInfo' to be non-null");
        this.preserveInterchange = Objects.requireNonNull(preserveInterchange, "expected parameter 'preserveInterchange' to be non-null");
        this.suspendInterchangeOnError = Objects.requireNonNull(suspendInterchangeOnError, "expected parameter 'suspendInterchangeOnError' to be non-null");
        this.useDotAsDecimalSeparator = Objects.requireNonNull(useDotAsDecimalSeparator, "expected parameter 'useDotAsDecimalSeparator' to be non-null");
    }

    private X12ProcessingSettingsResponse() {
        this.convertImpliedDecimal = null;
        this.createEmptyXmlTagsForTrailingSeparators = null;
        this.maskSecurityInfo = null;
        this.preserveInterchange = null;
        this.suspendInterchangeOnError = null;
        this.useDotAsDecimalSeparator = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12ProcessingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean convertImpliedDecimal;
        private Boolean createEmptyXmlTagsForTrailingSeparators;
        private Boolean maskSecurityInfo;
        private Boolean preserveInterchange;
        private Boolean suspendInterchangeOnError;
        private Boolean useDotAsDecimalSeparator;

        public Builder() {
    	      // Empty
        }

        public Builder(X12ProcessingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.convertImpliedDecimal = defaults.convertImpliedDecimal;
    	      this.createEmptyXmlTagsForTrailingSeparators = defaults.createEmptyXmlTagsForTrailingSeparators;
    	      this.maskSecurityInfo = defaults.maskSecurityInfo;
    	      this.preserveInterchange = defaults.preserveInterchange;
    	      this.suspendInterchangeOnError = defaults.suspendInterchangeOnError;
    	      this.useDotAsDecimalSeparator = defaults.useDotAsDecimalSeparator;
        }

        public Builder convertImpliedDecimal(Boolean convertImpliedDecimal) {
            this.convertImpliedDecimal = Objects.requireNonNull(convertImpliedDecimal);
            return this;
        }
        public Builder createEmptyXmlTagsForTrailingSeparators(Boolean createEmptyXmlTagsForTrailingSeparators) {
            this.createEmptyXmlTagsForTrailingSeparators = Objects.requireNonNull(createEmptyXmlTagsForTrailingSeparators);
            return this;
        }
        public Builder maskSecurityInfo(Boolean maskSecurityInfo) {
            this.maskSecurityInfo = Objects.requireNonNull(maskSecurityInfo);
            return this;
        }
        public Builder preserveInterchange(Boolean preserveInterchange) {
            this.preserveInterchange = Objects.requireNonNull(preserveInterchange);
            return this;
        }
        public Builder suspendInterchangeOnError(Boolean suspendInterchangeOnError) {
            this.suspendInterchangeOnError = Objects.requireNonNull(suspendInterchangeOnError);
            return this;
        }
        public Builder useDotAsDecimalSeparator(Boolean useDotAsDecimalSeparator) {
            this.useDotAsDecimalSeparator = Objects.requireNonNull(useDotAsDecimalSeparator);
            return this;
        }        public X12ProcessingSettingsResponse build() {
            return new X12ProcessingSettingsResponse(convertImpliedDecimal, createEmptyXmlTagsForTrailingSeparators, maskSecurityInfo, preserveInterchange, suspendInterchangeOnError, useDotAsDecimalSeparator);
        }
    }
}
