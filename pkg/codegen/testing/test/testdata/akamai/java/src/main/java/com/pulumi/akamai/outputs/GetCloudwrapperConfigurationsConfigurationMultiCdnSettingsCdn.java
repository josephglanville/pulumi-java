// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdn {
    private @Nullable List<GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey> cdnAuthKeys;
    private String cdnCode;
    private Boolean enabled;
    private Boolean httpsOnly;
    private List<String> ipAclCidrs;

    private GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdn() {}
    public List<GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey> cdnAuthKeys() {
        return this.cdnAuthKeys == null ? List.of() : this.cdnAuthKeys;
    }
    public String cdnCode() {
        return this.cdnCode;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }
    public List<String> ipAclCidrs() {
        return this.ipAclCidrs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey> cdnAuthKeys;
        private String cdnCode;
        private Boolean enabled;
        private Boolean httpsOnly;
        private List<String> ipAclCidrs;
        public Builder() {}
        public Builder(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnAuthKeys = defaults.cdnAuthKeys;
    	      this.cdnCode = defaults.cdnCode;
    	      this.enabled = defaults.enabled;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.ipAclCidrs = defaults.ipAclCidrs;
        }

        @CustomType.Setter
        public Builder cdnAuthKeys(@Nullable List<GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey> cdnAuthKeys) {

            this.cdnAuthKeys = cdnAuthKeys;
            return this;
        }
        public Builder cdnAuthKeys(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey... cdnAuthKeys) {
            return cdnAuthKeys(List.of(cdnAuthKeys));
        }
        @CustomType.Setter
        public Builder cdnCode(String cdnCode) {
            if (cdnCode == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdn", "cdnCode");
            }
            this.cdnCode = cdnCode;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdn", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder httpsOnly(Boolean httpsOnly) {
            if (httpsOnly == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdn", "httpsOnly");
            }
            this.httpsOnly = httpsOnly;
            return this;
        }
        @CustomType.Setter
        public Builder ipAclCidrs(List<String> ipAclCidrs) {
            if (ipAclCidrs == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdn", "ipAclCidrs");
            }
            this.ipAclCidrs = ipAclCidrs;
            return this;
        }
        public Builder ipAclCidrs(String... ipAclCidrs) {
            return ipAclCidrs(List.of(ipAclCidrs));
        }
        public GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdn build() {
            final var _resultValue = new GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdn();
            _resultValue.cdnAuthKeys = cdnAuthKeys;
            _resultValue.cdnCode = cdnCode;
            _resultValue.enabled = enabled;
            _resultValue.httpsOnly = httpsOnly;
            _resultValue.ipAclCidrs = ipAclCidrs;
            return _resultValue;
        }
    }
}
