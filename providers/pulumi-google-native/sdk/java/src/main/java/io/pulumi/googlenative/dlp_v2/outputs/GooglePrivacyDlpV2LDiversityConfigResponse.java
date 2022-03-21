// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2LDiversityConfigResponse {
    /**
     * Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite key.
     * 
     */
    private final List<GooglePrivacyDlpV2FieldIdResponse> quasiIds;
    /**
     * Sensitive field for computing the l-value.
     * 
     */
    private final GooglePrivacyDlpV2FieldIdResponse sensitiveAttribute;

    @CustomType.Constructor
    private GooglePrivacyDlpV2LDiversityConfigResponse(
        @CustomType.Parameter("quasiIds") List<GooglePrivacyDlpV2FieldIdResponse> quasiIds,
        @CustomType.Parameter("sensitiveAttribute") GooglePrivacyDlpV2FieldIdResponse sensitiveAttribute) {
        this.quasiIds = quasiIds;
        this.sensitiveAttribute = sensitiveAttribute;
    }

    /**
     * Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite key.
     * 
    */
    public List<GooglePrivacyDlpV2FieldIdResponse> getQuasiIds() {
        return this.quasiIds;
    }
    /**
     * Sensitive field for computing the l-value.
     * 
    */
    public GooglePrivacyDlpV2FieldIdResponse getSensitiveAttribute() {
        return this.sensitiveAttribute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LDiversityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2FieldIdResponse> quasiIds;
        private GooglePrivacyDlpV2FieldIdResponse sensitiveAttribute;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2LDiversityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quasiIds = defaults.quasiIds;
    	      this.sensitiveAttribute = defaults.sensitiveAttribute;
        }

        public Builder quasiIds(List<GooglePrivacyDlpV2FieldIdResponse> quasiIds) {
            this.quasiIds = Objects.requireNonNull(quasiIds);
            return this;
        }
        public Builder quasiIds(GooglePrivacyDlpV2FieldIdResponse... quasiIds) {
            return quasiIds(List.of(quasiIds));
        }
        public Builder sensitiveAttribute(GooglePrivacyDlpV2FieldIdResponse sensitiveAttribute) {
            this.sensitiveAttribute = Objects.requireNonNull(sensitiveAttribute);
            return this;
        }        public GooglePrivacyDlpV2LDiversityConfigResponse build() {
            return new GooglePrivacyDlpV2LDiversityConfigResponse(quasiIds, sensitiveAttribute);
        }
    }
}
