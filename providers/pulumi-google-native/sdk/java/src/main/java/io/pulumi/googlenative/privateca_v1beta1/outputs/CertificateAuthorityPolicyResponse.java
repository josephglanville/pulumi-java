// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.privateca_v1beta1.outputs.AllowedConfigListResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.AllowedSubjectAltNamesResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.IssuanceModesResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.ReusableConfigWrapperResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.SubjectResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CertificateAuthorityPolicyResponse {
    /**
     * Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
     * 
     */
    private final List<String> allowedCommonNames;
    /**
     * Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
     * 
     */
    private final AllowedConfigListResponse allowedConfigList;
    /**
     * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
     */
    private final IssuanceModesResponse allowedIssuanceModes;
    /**
     * Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
     * 
     */
    private final List<SubjectResponse> allowedLocationsAndOrganizations;
    /**
     * Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
     * 
     */
    private final AllowedSubjectAltNamesResponse allowedSans;
    /**
     * Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate's requested maximum_lifetime, the effective lifetime will be explicitly truncated.
     * 
     */
    private final String maximumLifetime;
    /**
     * Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
     * 
     */
    private final ReusableConfigWrapperResponse overwriteConfigValues;

    @CustomType.Constructor
    private CertificateAuthorityPolicyResponse(
        @CustomType.Parameter("allowedCommonNames") List<String> allowedCommonNames,
        @CustomType.Parameter("allowedConfigList") AllowedConfigListResponse allowedConfigList,
        @CustomType.Parameter("allowedIssuanceModes") IssuanceModesResponse allowedIssuanceModes,
        @CustomType.Parameter("allowedLocationsAndOrganizations") List<SubjectResponse> allowedLocationsAndOrganizations,
        @CustomType.Parameter("allowedSans") AllowedSubjectAltNamesResponse allowedSans,
        @CustomType.Parameter("maximumLifetime") String maximumLifetime,
        @CustomType.Parameter("overwriteConfigValues") ReusableConfigWrapperResponse overwriteConfigValues) {
        this.allowedCommonNames = allowedCommonNames;
        this.allowedConfigList = allowedConfigList;
        this.allowedIssuanceModes = allowedIssuanceModes;
        this.allowedLocationsAndOrganizations = allowedLocationsAndOrganizations;
        this.allowedSans = allowedSans;
        this.maximumLifetime = maximumLifetime;
        this.overwriteConfigValues = overwriteConfigValues;
    }

    /**
     * Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
     * 
    */
    public List<String> getAllowedCommonNames() {
        return this.allowedCommonNames;
    }
    /**
     * Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
     * 
    */
    public AllowedConfigListResponse getAllowedConfigList() {
        return this.allowedConfigList;
    }
    /**
     * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
    */
    public IssuanceModesResponse getAllowedIssuanceModes() {
        return this.allowedIssuanceModes;
    }
    /**
     * Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
     * 
    */
    public List<SubjectResponse> getAllowedLocationsAndOrganizations() {
        return this.allowedLocationsAndOrganizations;
    }
    /**
     * Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
     * 
    */
    public AllowedSubjectAltNamesResponse getAllowedSans() {
        return this.allowedSans;
    }
    /**
     * Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate's requested maximum_lifetime, the effective lifetime will be explicitly truncated.
     * 
    */
    public String getMaximumLifetime() {
        return this.maximumLifetime;
    }
    /**
     * Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
     * 
    */
    public ReusableConfigWrapperResponse getOverwriteConfigValues() {
        return this.overwriteConfigValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedCommonNames;
        private AllowedConfigListResponse allowedConfigList;
        private IssuanceModesResponse allowedIssuanceModes;
        private List<SubjectResponse> allowedLocationsAndOrganizations;
        private AllowedSubjectAltNamesResponse allowedSans;
        private String maximumLifetime;
        private ReusableConfigWrapperResponse overwriteConfigValues;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCommonNames = defaults.allowedCommonNames;
    	      this.allowedConfigList = defaults.allowedConfigList;
    	      this.allowedIssuanceModes = defaults.allowedIssuanceModes;
    	      this.allowedLocationsAndOrganizations = defaults.allowedLocationsAndOrganizations;
    	      this.allowedSans = defaults.allowedSans;
    	      this.maximumLifetime = defaults.maximumLifetime;
    	      this.overwriteConfigValues = defaults.overwriteConfigValues;
        }

        public Builder allowedCommonNames(List<String> allowedCommonNames) {
            this.allowedCommonNames = Objects.requireNonNull(allowedCommonNames);
            return this;
        }
        public Builder allowedCommonNames(String... allowedCommonNames) {
            return allowedCommonNames(List.of(allowedCommonNames));
        }
        public Builder allowedConfigList(AllowedConfigListResponse allowedConfigList) {
            this.allowedConfigList = Objects.requireNonNull(allowedConfigList);
            return this;
        }
        public Builder allowedIssuanceModes(IssuanceModesResponse allowedIssuanceModes) {
            this.allowedIssuanceModes = Objects.requireNonNull(allowedIssuanceModes);
            return this;
        }
        public Builder allowedLocationsAndOrganizations(List<SubjectResponse> allowedLocationsAndOrganizations) {
            this.allowedLocationsAndOrganizations = Objects.requireNonNull(allowedLocationsAndOrganizations);
            return this;
        }
        public Builder allowedLocationsAndOrganizations(SubjectResponse... allowedLocationsAndOrganizations) {
            return allowedLocationsAndOrganizations(List.of(allowedLocationsAndOrganizations));
        }
        public Builder allowedSans(AllowedSubjectAltNamesResponse allowedSans) {
            this.allowedSans = Objects.requireNonNull(allowedSans);
            return this;
        }
        public Builder maximumLifetime(String maximumLifetime) {
            this.maximumLifetime = Objects.requireNonNull(maximumLifetime);
            return this;
        }
        public Builder overwriteConfigValues(ReusableConfigWrapperResponse overwriteConfigValues) {
            this.overwriteConfigValues = Objects.requireNonNull(overwriteConfigValues);
            return this;
        }        public CertificateAuthorityPolicyResponse build() {
            return new CertificateAuthorityPolicyResponse(allowedCommonNames, allowedConfigList, allowedIssuanceModes, allowedLocationsAndOrganizations, allowedSans, maximumLifetime, overwriteConfigValues);
        }
    }
}
