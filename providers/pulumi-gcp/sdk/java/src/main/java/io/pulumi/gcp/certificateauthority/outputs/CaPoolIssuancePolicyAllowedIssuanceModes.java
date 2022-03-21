// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class CaPoolIssuancePolicyAllowedIssuanceModes {
    /**
     * When true, allows callers to create Certificates by specifying a CertificateConfig.
     * 
     */
    private final Boolean allowConfigBasedIssuance;
    /**
     * When true, allows callers to create Certificates by specifying a CSR.
     * 
     */
    private final Boolean allowCsrBasedIssuance;

    @CustomType.Constructor
    private CaPoolIssuancePolicyAllowedIssuanceModes(
        @CustomType.Parameter("allowConfigBasedIssuance") Boolean allowConfigBasedIssuance,
        @CustomType.Parameter("allowCsrBasedIssuance") Boolean allowCsrBasedIssuance) {
        this.allowConfigBasedIssuance = allowConfigBasedIssuance;
        this.allowCsrBasedIssuance = allowCsrBasedIssuance;
    }

    /**
     * When true, allows callers to create Certificates by specifying a CertificateConfig.
     * 
    */
    public Boolean getAllowConfigBasedIssuance() {
        return this.allowConfigBasedIssuance;
    }
    /**
     * When true, allows callers to create Certificates by specifying a CSR.
     * 
    */
    public Boolean getAllowCsrBasedIssuance() {
        return this.allowCsrBasedIssuance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyAllowedIssuanceModes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowConfigBasedIssuance;
        private Boolean allowCsrBasedIssuance;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyAllowedIssuanceModes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowConfigBasedIssuance = defaults.allowConfigBasedIssuance;
    	      this.allowCsrBasedIssuance = defaults.allowCsrBasedIssuance;
        }

        public Builder allowConfigBasedIssuance(Boolean allowConfigBasedIssuance) {
            this.allowConfigBasedIssuance = Objects.requireNonNull(allowConfigBasedIssuance);
            return this;
        }
        public Builder allowCsrBasedIssuance(Boolean allowCsrBasedIssuance) {
            this.allowCsrBasedIssuance = Objects.requireNonNull(allowCsrBasedIssuance);
            return this;
        }        public CaPoolIssuancePolicyAllowedIssuanceModes build() {
            return new CaPoolIssuancePolicyAllowedIssuanceModes(allowConfigBasedIssuance, allowCsrBasedIssuance);
        }
    }
}
