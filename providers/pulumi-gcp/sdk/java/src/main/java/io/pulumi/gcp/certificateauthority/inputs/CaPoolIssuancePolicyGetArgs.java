// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedIssuanceModesGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyIdentityConstraintsGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIssuancePolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyGetArgs Empty = new CaPoolIssuancePolicyGetArgs();

    /**
     * IssuanceModes specifies the allowed ways in which Certificates may be requested from this CaPool.
     * Structure is documented below.
     * 
     */
    @InputImport(name="allowedIssuanceModes")
      private final @Nullable Output<CaPoolIssuancePolicyAllowedIssuanceModesGetArgs> allowedIssuanceModes;

    public Output<CaPoolIssuancePolicyAllowedIssuanceModesGetArgs> getAllowedIssuanceModes() {
        return this.allowedIssuanceModes == null ? Output.empty() : this.allowedIssuanceModes;
    }

    /**
     * If any AllowedKeyType is specified, then the certificate request's public key must match one of the key types listed here.
     * Otherwise, any key may be used.
     * Structure is documented below.
     * 
     */
    @InputImport(name="allowedKeyTypes")
      private final @Nullable Output<List<CaPoolIssuancePolicyAllowedKeyTypeGetArgs>> allowedKeyTypes;

    public Output<List<CaPoolIssuancePolicyAllowedKeyTypeGetArgs>> getAllowedKeyTypes() {
        return this.allowedKeyTypes == null ? Output.empty() : this.allowedKeyTypes;
    }

    /**
     * A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request
     * includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate
     * request uses a CertificateTemplate that defines conflicting predefinedValues for the same properties, the certificate
     * issuance request will fail.
     * Structure is documented below.
     * 
     */
    @InputImport(name="baselineValues")
      private final @Nullable Output<CaPoolIssuancePolicyBaselineValuesGetArgs> baselineValues;

    public Output<CaPoolIssuancePolicyBaselineValuesGetArgs> getBaselineValues() {
        return this.baselineValues == null ? Output.empty() : this.baselineValues;
    }

    /**
     * Describes constraints on identities that may appear in Certificates issued through this CaPool.
     * If this is omitted, then this CaPool will not add restrictions on a certificate's identity.
     * Structure is documented below.
     * 
     */
    @InputImport(name="identityConstraints")
      private final @Nullable Output<CaPoolIssuancePolicyIdentityConstraintsGetArgs> identityConstraints;

    public Output<CaPoolIssuancePolicyIdentityConstraintsGetArgs> getIdentityConstraints() {
        return this.identityConstraints == null ? Output.empty() : this.identityConstraints;
    }

    /**
     * The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority
     * expires before a Certificate's requested maximumLifetime, the effective lifetime will be explicitly truncated to match it.
     * 
     */
    @InputImport(name="maximumLifetime")
      private final @Nullable Output<String> maximumLifetime;

    public Output<String> getMaximumLifetime() {
        return this.maximumLifetime == null ? Output.empty() : this.maximumLifetime;
    }

    public CaPoolIssuancePolicyGetArgs(
        @Nullable Output<CaPoolIssuancePolicyAllowedIssuanceModesGetArgs> allowedIssuanceModes,
        @Nullable Output<List<CaPoolIssuancePolicyAllowedKeyTypeGetArgs>> allowedKeyTypes,
        @Nullable Output<CaPoolIssuancePolicyBaselineValuesGetArgs> baselineValues,
        @Nullable Output<CaPoolIssuancePolicyIdentityConstraintsGetArgs> identityConstraints,
        @Nullable Output<String> maximumLifetime) {
        this.allowedIssuanceModes = allowedIssuanceModes;
        this.allowedKeyTypes = allowedKeyTypes;
        this.baselineValues = baselineValues;
        this.identityConstraints = identityConstraints;
        this.maximumLifetime = maximumLifetime;
    }

    private CaPoolIssuancePolicyGetArgs() {
        this.allowedIssuanceModes = Output.empty();
        this.allowedKeyTypes = Output.empty();
        this.baselineValues = Output.empty();
        this.identityConstraints = Output.empty();
        this.maximumLifetime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CaPoolIssuancePolicyAllowedIssuanceModesGetArgs> allowedIssuanceModes;
        private @Nullable Output<List<CaPoolIssuancePolicyAllowedKeyTypeGetArgs>> allowedKeyTypes;
        private @Nullable Output<CaPoolIssuancePolicyBaselineValuesGetArgs> baselineValues;
        private @Nullable Output<CaPoolIssuancePolicyIdentityConstraintsGetArgs> identityConstraints;
        private @Nullable Output<String> maximumLifetime;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIssuanceModes = defaults.allowedIssuanceModes;
    	      this.allowedKeyTypes = defaults.allowedKeyTypes;
    	      this.baselineValues = defaults.baselineValues;
    	      this.identityConstraints = defaults.identityConstraints;
    	      this.maximumLifetime = defaults.maximumLifetime;
        }

        public Builder allowedIssuanceModes(@Nullable Output<CaPoolIssuancePolicyAllowedIssuanceModesGetArgs> allowedIssuanceModes) {
            this.allowedIssuanceModes = allowedIssuanceModes;
            return this;
        }

        public Builder allowedIssuanceModes(@Nullable CaPoolIssuancePolicyAllowedIssuanceModesGetArgs allowedIssuanceModes) {
            this.allowedIssuanceModes = Output.ofNullable(allowedIssuanceModes);
            return this;
        }

        public Builder allowedKeyTypes(@Nullable Output<List<CaPoolIssuancePolicyAllowedKeyTypeGetArgs>> allowedKeyTypes) {
            this.allowedKeyTypes = allowedKeyTypes;
            return this;
        }

        public Builder allowedKeyTypes(@Nullable List<CaPoolIssuancePolicyAllowedKeyTypeGetArgs> allowedKeyTypes) {
            this.allowedKeyTypes = Output.ofNullable(allowedKeyTypes);
            return this;
        }

        public Builder baselineValues(@Nullable Output<CaPoolIssuancePolicyBaselineValuesGetArgs> baselineValues) {
            this.baselineValues = baselineValues;
            return this;
        }

        public Builder baselineValues(@Nullable CaPoolIssuancePolicyBaselineValuesGetArgs baselineValues) {
            this.baselineValues = Output.ofNullable(baselineValues);
            return this;
        }

        public Builder identityConstraints(@Nullable Output<CaPoolIssuancePolicyIdentityConstraintsGetArgs> identityConstraints) {
            this.identityConstraints = identityConstraints;
            return this;
        }

        public Builder identityConstraints(@Nullable CaPoolIssuancePolicyIdentityConstraintsGetArgs identityConstraints) {
            this.identityConstraints = Output.ofNullable(identityConstraints);
            return this;
        }

        public Builder maximumLifetime(@Nullable Output<String> maximumLifetime) {
            this.maximumLifetime = maximumLifetime;
            return this;
        }

        public Builder maximumLifetime(@Nullable String maximumLifetime) {
            this.maximumLifetime = Output.ofNullable(maximumLifetime);
            return this;
        }
        public CaPoolIssuancePolicyGetArgs build() {
            return new CaPoolIssuancePolicyGetArgs(allowedIssuanceModes, allowedKeyTypes, baselineValues, identityConstraints, maximumLifetime);
        }
    }
}
