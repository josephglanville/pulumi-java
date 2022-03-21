// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Commitment for a particular license resource.
 * 
 */
public final class LicenseResourceCommitmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final LicenseResourceCommitmentResponse Empty = new LicenseResourceCommitmentResponse();

    /**
     * The number of licenses purchased.
     * 
     */
    @Import(name="amount", required=true)
      private final String amount;

    public String getAmount() {
        return this.amount;
    }

    /**
     * Specifies the core range of the instance for which this license applies.
     * 
     */
    @Import(name="coresPerLicense", required=true)
      private final String coresPerLicense;

    public String getCoresPerLicense() {
        return this.coresPerLicense;
    }

    /**
     * Any applicable license URI.
     * 
     */
    @Import(name="license", required=true)
      private final String license;

    public String getLicense() {
        return this.license;
    }

    public LicenseResourceCommitmentResponse(
        String amount,
        String coresPerLicense,
        String license) {
        this.amount = Objects.requireNonNull(amount, "expected parameter 'amount' to be non-null");
        this.coresPerLicense = Objects.requireNonNull(coresPerLicense, "expected parameter 'coresPerLicense' to be non-null");
        this.license = Objects.requireNonNull(license, "expected parameter 'license' to be non-null");
    }

    private LicenseResourceCommitmentResponse() {
        this.amount = null;
        this.coresPerLicense = null;
        this.license = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResourceCommitmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String amount;
        private String coresPerLicense;
        private String license;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResourceCommitmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.coresPerLicense = defaults.coresPerLicense;
    	      this.license = defaults.license;
        }

        public Builder amount(String amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }
        public Builder coresPerLicense(String coresPerLicense) {
            this.coresPerLicense = Objects.requireNonNull(coresPerLicense);
            return this;
        }
        public Builder license(String license) {
            this.license = Objects.requireNonNull(license);
            return this;
        }        public LicenseResourceCommitmentResponse build() {
            return new LicenseResourceCommitmentResponse(amount, coresPerLicense, license);
        }
    }
}
