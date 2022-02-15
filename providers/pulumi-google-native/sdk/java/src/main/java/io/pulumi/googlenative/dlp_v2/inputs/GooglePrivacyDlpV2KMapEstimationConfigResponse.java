// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2AuxiliaryTableResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TaggedFieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GooglePrivacyDlpV2KMapEstimationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2KMapEstimationConfigResponse Empty = new GooglePrivacyDlpV2KMapEstimationConfigResponse();

    @InputImport(name="auxiliaryTables", required=true)
    private final List<GooglePrivacyDlpV2AuxiliaryTableResponse> auxiliaryTables;

    public List<GooglePrivacyDlpV2AuxiliaryTableResponse> getAuxiliaryTables() {
        return this.auxiliaryTables;
    }

    @InputImport(name="quasiIds", required=true)
    private final List<GooglePrivacyDlpV2TaggedFieldResponse> quasiIds;

    public List<GooglePrivacyDlpV2TaggedFieldResponse> getQuasiIds() {
        return this.quasiIds;
    }

    @InputImport(name="regionCode", required=true)
    private final String regionCode;

    public String getRegionCode() {
        return this.regionCode;
    }

    public GooglePrivacyDlpV2KMapEstimationConfigResponse(
        List<GooglePrivacyDlpV2AuxiliaryTableResponse> auxiliaryTables,
        List<GooglePrivacyDlpV2TaggedFieldResponse> quasiIds,
        String regionCode) {
        this.auxiliaryTables = Objects.requireNonNull(auxiliaryTables, "expected parameter 'auxiliaryTables' to be non-null");
        this.quasiIds = Objects.requireNonNull(quasiIds, "expected parameter 'quasiIds' to be non-null");
        this.regionCode = Objects.requireNonNull(regionCode, "expected parameter 'regionCode' to be non-null");
    }

    private GooglePrivacyDlpV2KMapEstimationConfigResponse() {
        this.auxiliaryTables = List.of();
        this.quasiIds = List.of();
        this.regionCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KMapEstimationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2AuxiliaryTableResponse> auxiliaryTables;
        private List<GooglePrivacyDlpV2TaggedFieldResponse> quasiIds;
        private String regionCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KMapEstimationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryTables = defaults.auxiliaryTables;
    	      this.quasiIds = defaults.quasiIds;
    	      this.regionCode = defaults.regionCode;
        }

        public Builder setAuxiliaryTables(List<GooglePrivacyDlpV2AuxiliaryTableResponse> auxiliaryTables) {
            this.auxiliaryTables = Objects.requireNonNull(auxiliaryTables);
            return this;
        }

        public Builder setQuasiIds(List<GooglePrivacyDlpV2TaggedFieldResponse> quasiIds) {
            this.quasiIds = Objects.requireNonNull(quasiIds);
            return this;
        }

        public Builder setRegionCode(String regionCode) {
            this.regionCode = Objects.requireNonNull(regionCode);
            return this;
        }

        public GooglePrivacyDlpV2KMapEstimationConfigResponse build() {
            return new GooglePrivacyDlpV2KMapEstimationConfigResponse(auxiliaryTables, quasiIds, regionCode);
        }
    }
}