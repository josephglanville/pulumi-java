// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The Edifact agreement validation settings.
 * 
 */
public final class EdifactValidationSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdifactValidationSettingsResponse Empty = new EdifactValidationSettingsResponse();

    /**
     * The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
     */
    @InputImport(name="allowLeadingAndTrailingSpacesAndZeroes", required=true)
      private final Boolean allowLeadingAndTrailingSpacesAndZeroes;

    public Boolean getAllowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * The value indicating whether to check for duplicate group control number.
     * 
     */
    @InputImport(name="checkDuplicateGroupControlNumber", required=true)
      private final Boolean checkDuplicateGroupControlNumber;

    public Boolean getCheckDuplicateGroupControlNumber() {
        return this.checkDuplicateGroupControlNumber;
    }

    /**
     * The value indicating whether to check for duplicate interchange control number.
     * 
     */
    @InputImport(name="checkDuplicateInterchangeControlNumber", required=true)
      private final Boolean checkDuplicateInterchangeControlNumber;

    public Boolean getCheckDuplicateInterchangeControlNumber() {
        return this.checkDuplicateInterchangeControlNumber;
    }

    /**
     * The value indicating whether to check for duplicate transaction set control number.
     * 
     */
    @InputImport(name="checkDuplicateTransactionSetControlNumber", required=true)
      private final Boolean checkDuplicateTransactionSetControlNumber;

    public Boolean getCheckDuplicateTransactionSetControlNumber() {
        return this.checkDuplicateTransactionSetControlNumber;
    }

    /**
     * The validity period of interchange control number.
     * 
     */
    @InputImport(name="interchangeControlNumberValidityDays", required=true)
      private final Integer interchangeControlNumberValidityDays;

    public Integer getInterchangeControlNumberValidityDays() {
        return this.interchangeControlNumberValidityDays;
    }

    /**
     * The trailing separator policy.
     * 
     */
    @InputImport(name="trailingSeparatorPolicy", required=true)
      private final String trailingSeparatorPolicy;

    public String getTrailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }

    /**
     * The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
     */
    @InputImport(name="trimLeadingAndTrailingSpacesAndZeroes", required=true)
      private final Boolean trimLeadingAndTrailingSpacesAndZeroes;

    public Boolean getTrimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * The value indicating whether to validate character set in the message.
     * 
     */
    @InputImport(name="validateCharacterSet", required=true)
      private final Boolean validateCharacterSet;

    public Boolean getValidateCharacterSet() {
        return this.validateCharacterSet;
    }

    /**
     * The value indicating whether to Whether to validate EDI types.
     * 
     */
    @InputImport(name="validateEDITypes", required=true)
      private final Boolean validateEDITypes;

    public Boolean getValidateEDITypes() {
        return this.validateEDITypes;
    }

    /**
     * The value indicating whether to Whether to validate XSD types.
     * 
     */
    @InputImport(name="validateXSDTypes", required=true)
      private final Boolean validateXSDTypes;

    public Boolean getValidateXSDTypes() {
        return this.validateXSDTypes;
    }

    public EdifactValidationSettingsResponse(
        Boolean allowLeadingAndTrailingSpacesAndZeroes,
        Boolean checkDuplicateGroupControlNumber,
        Boolean checkDuplicateInterchangeControlNumber,
        Boolean checkDuplicateTransactionSetControlNumber,
        Integer interchangeControlNumberValidityDays,
        String trailingSeparatorPolicy,
        Boolean trimLeadingAndTrailingSpacesAndZeroes,
        Boolean validateCharacterSet,
        Boolean validateEDITypes,
        Boolean validateXSDTypes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes, "expected parameter 'allowLeadingAndTrailingSpacesAndZeroes' to be non-null");
        this.checkDuplicateGroupControlNumber = Objects.requireNonNull(checkDuplicateGroupControlNumber, "expected parameter 'checkDuplicateGroupControlNumber' to be non-null");
        this.checkDuplicateInterchangeControlNumber = Objects.requireNonNull(checkDuplicateInterchangeControlNumber, "expected parameter 'checkDuplicateInterchangeControlNumber' to be non-null");
        this.checkDuplicateTransactionSetControlNumber = Objects.requireNonNull(checkDuplicateTransactionSetControlNumber, "expected parameter 'checkDuplicateTransactionSetControlNumber' to be non-null");
        this.interchangeControlNumberValidityDays = Objects.requireNonNull(interchangeControlNumberValidityDays, "expected parameter 'interchangeControlNumberValidityDays' to be non-null");
        this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy, "expected parameter 'trailingSeparatorPolicy' to be non-null");
        this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes, "expected parameter 'trimLeadingAndTrailingSpacesAndZeroes' to be non-null");
        this.validateCharacterSet = Objects.requireNonNull(validateCharacterSet, "expected parameter 'validateCharacterSet' to be non-null");
        this.validateEDITypes = Objects.requireNonNull(validateEDITypes, "expected parameter 'validateEDITypes' to be non-null");
        this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes, "expected parameter 'validateXSDTypes' to be non-null");
    }

    private EdifactValidationSettingsResponse() {
        this.allowLeadingAndTrailingSpacesAndZeroes = null;
        this.checkDuplicateGroupControlNumber = null;
        this.checkDuplicateInterchangeControlNumber = null;
        this.checkDuplicateTransactionSetControlNumber = null;
        this.interchangeControlNumberValidityDays = null;
        this.trailingSeparatorPolicy = null;
        this.trimLeadingAndTrailingSpacesAndZeroes = null;
        this.validateCharacterSet = null;
        this.validateEDITypes = null;
        this.validateXSDTypes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactValidationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowLeadingAndTrailingSpacesAndZeroes;
        private Boolean checkDuplicateGroupControlNumber;
        private Boolean checkDuplicateInterchangeControlNumber;
        private Boolean checkDuplicateTransactionSetControlNumber;
        private Integer interchangeControlNumberValidityDays;
        private String trailingSeparatorPolicy;
        private Boolean trimLeadingAndTrailingSpacesAndZeroes;
        private Boolean validateCharacterSet;
        private Boolean validateEDITypes;
        private Boolean validateXSDTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactValidationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLeadingAndTrailingSpacesAndZeroes = defaults.allowLeadingAndTrailingSpacesAndZeroes;
    	      this.checkDuplicateGroupControlNumber = defaults.checkDuplicateGroupControlNumber;
    	      this.checkDuplicateInterchangeControlNumber = defaults.checkDuplicateInterchangeControlNumber;
    	      this.checkDuplicateTransactionSetControlNumber = defaults.checkDuplicateTransactionSetControlNumber;
    	      this.interchangeControlNumberValidityDays = defaults.interchangeControlNumberValidityDays;
    	      this.trailingSeparatorPolicy = defaults.trailingSeparatorPolicy;
    	      this.trimLeadingAndTrailingSpacesAndZeroes = defaults.trimLeadingAndTrailingSpacesAndZeroes;
    	      this.validateCharacterSet = defaults.validateCharacterSet;
    	      this.validateEDITypes = defaults.validateEDITypes;
    	      this.validateXSDTypes = defaults.validateXSDTypes;
        }

        public Builder setAllowLeadingAndTrailingSpacesAndZeroes(Boolean allowLeadingAndTrailingSpacesAndZeroes) {
            this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes);
            return this;
        }

        public Builder setCheckDuplicateGroupControlNumber(Boolean checkDuplicateGroupControlNumber) {
            this.checkDuplicateGroupControlNumber = Objects.requireNonNull(checkDuplicateGroupControlNumber);
            return this;
        }

        public Builder setCheckDuplicateInterchangeControlNumber(Boolean checkDuplicateInterchangeControlNumber) {
            this.checkDuplicateInterchangeControlNumber = Objects.requireNonNull(checkDuplicateInterchangeControlNumber);
            return this;
        }

        public Builder setCheckDuplicateTransactionSetControlNumber(Boolean checkDuplicateTransactionSetControlNumber) {
            this.checkDuplicateTransactionSetControlNumber = Objects.requireNonNull(checkDuplicateTransactionSetControlNumber);
            return this;
        }

        public Builder setInterchangeControlNumberValidityDays(Integer interchangeControlNumberValidityDays) {
            this.interchangeControlNumberValidityDays = Objects.requireNonNull(interchangeControlNumberValidityDays);
            return this;
        }

        public Builder setTrailingSeparatorPolicy(String trailingSeparatorPolicy) {
            this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy);
            return this;
        }

        public Builder setTrimLeadingAndTrailingSpacesAndZeroes(Boolean trimLeadingAndTrailingSpacesAndZeroes) {
            this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes);
            return this;
        }

        public Builder setValidateCharacterSet(Boolean validateCharacterSet) {
            this.validateCharacterSet = Objects.requireNonNull(validateCharacterSet);
            return this;
        }

        public Builder setValidateEDITypes(Boolean validateEDITypes) {
            this.validateEDITypes = Objects.requireNonNull(validateEDITypes);
            return this;
        }

        public Builder setValidateXSDTypes(Boolean validateXSDTypes) {
            this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes);
            return this;
        }
        public EdifactValidationSettingsResponse build() {
            return new EdifactValidationSettingsResponse(allowLeadingAndTrailingSpacesAndZeroes, checkDuplicateGroupControlNumber, checkDuplicateInterchangeControlNumber, checkDuplicateTransactionSetControlNumber, interchangeControlNumberValidityDays, trailingSeparatorPolicy, trimLeadingAndTrailingSpacesAndZeroes, validateCharacterSet, validateEDITypes, validateXSDTypes);
        }
    }
}
