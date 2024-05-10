// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudwrapperConfigurationMultiCdnSettingsBocc;
import com.pulumi.akamai.outputs.GetCloudwrapperConfigurationMultiCdnSettingsCdn;
import com.pulumi.akamai.outputs.GetCloudwrapperConfigurationMultiCdnSettingsDataStreams;
import com.pulumi.akamai.outputs.GetCloudwrapperConfigurationMultiCdnSettingsOrigin;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudwrapperConfigurationMultiCdnSettings {
    private @Nullable GetCloudwrapperConfigurationMultiCdnSettingsBocc bocc;
    private @Nullable List<GetCloudwrapperConfigurationMultiCdnSettingsCdn> cdns;
    private @Nullable GetCloudwrapperConfigurationMultiCdnSettingsDataStreams dataStreams;
    private Boolean enableSoftAlerts;
    private @Nullable List<GetCloudwrapperConfigurationMultiCdnSettingsOrigin> origins;

    private GetCloudwrapperConfigurationMultiCdnSettings() {}
    public Optional<GetCloudwrapperConfigurationMultiCdnSettingsBocc> bocc() {
        return Optional.ofNullable(this.bocc);
    }
    public List<GetCloudwrapperConfigurationMultiCdnSettingsCdn> cdns() {
        return this.cdns == null ? List.of() : this.cdns;
    }
    public Optional<GetCloudwrapperConfigurationMultiCdnSettingsDataStreams> dataStreams() {
        return Optional.ofNullable(this.dataStreams);
    }
    public Boolean enableSoftAlerts() {
        return this.enableSoftAlerts;
    }
    public List<GetCloudwrapperConfigurationMultiCdnSettingsOrigin> origins() {
        return this.origins == null ? List.of() : this.origins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperConfigurationMultiCdnSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetCloudwrapperConfigurationMultiCdnSettingsBocc bocc;
        private @Nullable List<GetCloudwrapperConfigurationMultiCdnSettingsCdn> cdns;
        private @Nullable GetCloudwrapperConfigurationMultiCdnSettingsDataStreams dataStreams;
        private Boolean enableSoftAlerts;
        private @Nullable List<GetCloudwrapperConfigurationMultiCdnSettingsOrigin> origins;
        public Builder() {}
        public Builder(GetCloudwrapperConfigurationMultiCdnSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bocc = defaults.bocc;
    	      this.cdns = defaults.cdns;
    	      this.dataStreams = defaults.dataStreams;
    	      this.enableSoftAlerts = defaults.enableSoftAlerts;
    	      this.origins = defaults.origins;
        }

        @CustomType.Setter
        public Builder bocc(@Nullable GetCloudwrapperConfigurationMultiCdnSettingsBocc bocc) {

            this.bocc = bocc;
            return this;
        }
        @CustomType.Setter
        public Builder cdns(@Nullable List<GetCloudwrapperConfigurationMultiCdnSettingsCdn> cdns) {

            this.cdns = cdns;
            return this;
        }
        public Builder cdns(GetCloudwrapperConfigurationMultiCdnSettingsCdn... cdns) {
            return cdns(List.of(cdns));
        }
        @CustomType.Setter
        public Builder dataStreams(@Nullable GetCloudwrapperConfigurationMultiCdnSettingsDataStreams dataStreams) {

            this.dataStreams = dataStreams;
            return this;
        }
        @CustomType.Setter
        public Builder enableSoftAlerts(Boolean enableSoftAlerts) {
            if (enableSoftAlerts == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationMultiCdnSettings", "enableSoftAlerts");
            }
            this.enableSoftAlerts = enableSoftAlerts;
            return this;
        }
        @CustomType.Setter
        public Builder origins(@Nullable List<GetCloudwrapperConfigurationMultiCdnSettingsOrigin> origins) {

            this.origins = origins;
            return this;
        }
        public Builder origins(GetCloudwrapperConfigurationMultiCdnSettingsOrigin... origins) {
            return origins(List.of(origins));
        }
        public GetCloudwrapperConfigurationMultiCdnSettings build() {
            final var _resultValue = new GetCloudwrapperConfigurationMultiCdnSettings();
            _resultValue.bocc = bocc;
            _resultValue.cdns = cdns;
            _resultValue.dataStreams = dataStreams;
            _resultValue.enableSoftAlerts = enableSoftAlerts;
            _resultValue.origins = origins;
            return _resultValue;
        }
    }
}
