// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorEnhancedProxyDetection {
    private @Nullable String anonymousVpn;
    private @Nullable String bestPracticeAction;
    private @Nullable String bestPracticeRedirecturl;
    private @Nullable Boolean detectAnonymousVpn;
    private @Nullable String detectAnonymousVpnAction;
    private @Nullable String detectAnonymousVpnRedirecturl;
    private @Nullable Boolean detectHostingProvider;
    private @Nullable String detectHostingProviderAction;
    private @Nullable String detectHostingProviderRedirecturl;
    private @Nullable Boolean detectPublicProxy;
    private @Nullable String detectPublicProxyAction;
    private @Nullable String detectPublicProxyRedirecturl;
    private @Nullable Boolean detectResidentialProxy;
    private @Nullable String detectResidentialProxyAction;
    private @Nullable String detectResidentialProxyRedirecturl;
    private @Nullable Boolean detectSmartDnsProxy;
    private @Nullable String detectSmartDnsProxyAction;
    private @Nullable String detectSmartDnsProxyRedirecturl;
    private @Nullable Boolean detectTorExitNode;
    private @Nullable String detectTorExitNodeAction;
    private @Nullable String detectTorExitNodeRedirecturl;
    private @Nullable Boolean detectVpnDataCenter;
    private @Nullable String detectVpnDataCenterAction;
    private @Nullable String detectVpnDataCenterRedirecturl;
    private @Nullable String enableConfigurationMode;
    private @Nullable Boolean enabled;
    private @Nullable Boolean forwardHeaderEnrichment;
    private @Nullable String hostingProvider;
    private @Nullable Boolean locked;
    private @Nullable String publicProxy;
    private @Nullable String residentialProxy;
    private @Nullable String smartDnsProxy;
    private @Nullable String templateUuid;
    private @Nullable String torExitNode;
    private @Nullable String uuid;
    private @Nullable String vpnDataCenter;

    private GetPropertyRulesBuilderRulesV20230105BehaviorEnhancedProxyDetection() {}
    public Optional<String> anonymousVpn() {
        return Optional.ofNullable(this.anonymousVpn);
    }
    public Optional<String> bestPracticeAction() {
        return Optional.ofNullable(this.bestPracticeAction);
    }
    public Optional<String> bestPracticeRedirecturl() {
        return Optional.ofNullable(this.bestPracticeRedirecturl);
    }
    public Optional<Boolean> detectAnonymousVpn() {
        return Optional.ofNullable(this.detectAnonymousVpn);
    }
    public Optional<String> detectAnonymousVpnAction() {
        return Optional.ofNullable(this.detectAnonymousVpnAction);
    }
    public Optional<String> detectAnonymousVpnRedirecturl() {
        return Optional.ofNullable(this.detectAnonymousVpnRedirecturl);
    }
    public Optional<Boolean> detectHostingProvider() {
        return Optional.ofNullable(this.detectHostingProvider);
    }
    public Optional<String> detectHostingProviderAction() {
        return Optional.ofNullable(this.detectHostingProviderAction);
    }
    public Optional<String> detectHostingProviderRedirecturl() {
        return Optional.ofNullable(this.detectHostingProviderRedirecturl);
    }
    public Optional<Boolean> detectPublicProxy() {
        return Optional.ofNullable(this.detectPublicProxy);
    }
    public Optional<String> detectPublicProxyAction() {
        return Optional.ofNullable(this.detectPublicProxyAction);
    }
    public Optional<String> detectPublicProxyRedirecturl() {
        return Optional.ofNullable(this.detectPublicProxyRedirecturl);
    }
    public Optional<Boolean> detectResidentialProxy() {
        return Optional.ofNullable(this.detectResidentialProxy);
    }
    public Optional<String> detectResidentialProxyAction() {
        return Optional.ofNullable(this.detectResidentialProxyAction);
    }
    public Optional<String> detectResidentialProxyRedirecturl() {
        return Optional.ofNullable(this.detectResidentialProxyRedirecturl);
    }
    public Optional<Boolean> detectSmartDnsProxy() {
        return Optional.ofNullable(this.detectSmartDnsProxy);
    }
    public Optional<String> detectSmartDnsProxyAction() {
        return Optional.ofNullable(this.detectSmartDnsProxyAction);
    }
    public Optional<String> detectSmartDnsProxyRedirecturl() {
        return Optional.ofNullable(this.detectSmartDnsProxyRedirecturl);
    }
    public Optional<Boolean> detectTorExitNode() {
        return Optional.ofNullable(this.detectTorExitNode);
    }
    public Optional<String> detectTorExitNodeAction() {
        return Optional.ofNullable(this.detectTorExitNodeAction);
    }
    public Optional<String> detectTorExitNodeRedirecturl() {
        return Optional.ofNullable(this.detectTorExitNodeRedirecturl);
    }
    public Optional<Boolean> detectVpnDataCenter() {
        return Optional.ofNullable(this.detectVpnDataCenter);
    }
    public Optional<String> detectVpnDataCenterAction() {
        return Optional.ofNullable(this.detectVpnDataCenterAction);
    }
    public Optional<String> detectVpnDataCenterRedirecturl() {
        return Optional.ofNullable(this.detectVpnDataCenterRedirecturl);
    }
    public Optional<String> enableConfigurationMode() {
        return Optional.ofNullable(this.enableConfigurationMode);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> forwardHeaderEnrichment() {
        return Optional.ofNullable(this.forwardHeaderEnrichment);
    }
    public Optional<String> hostingProvider() {
        return Optional.ofNullable(this.hostingProvider);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> publicProxy() {
        return Optional.ofNullable(this.publicProxy);
    }
    public Optional<String> residentialProxy() {
        return Optional.ofNullable(this.residentialProxy);
    }
    public Optional<String> smartDnsProxy() {
        return Optional.ofNullable(this.smartDnsProxy);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> torExitNode() {
        return Optional.ofNullable(this.torExitNode);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<String> vpnDataCenter() {
        return Optional.ofNullable(this.vpnDataCenter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorEnhancedProxyDetection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String anonymousVpn;
        private @Nullable String bestPracticeAction;
        private @Nullable String bestPracticeRedirecturl;
        private @Nullable Boolean detectAnonymousVpn;
        private @Nullable String detectAnonymousVpnAction;
        private @Nullable String detectAnonymousVpnRedirecturl;
        private @Nullable Boolean detectHostingProvider;
        private @Nullable String detectHostingProviderAction;
        private @Nullable String detectHostingProviderRedirecturl;
        private @Nullable Boolean detectPublicProxy;
        private @Nullable String detectPublicProxyAction;
        private @Nullable String detectPublicProxyRedirecturl;
        private @Nullable Boolean detectResidentialProxy;
        private @Nullable String detectResidentialProxyAction;
        private @Nullable String detectResidentialProxyRedirecturl;
        private @Nullable Boolean detectSmartDnsProxy;
        private @Nullable String detectSmartDnsProxyAction;
        private @Nullable String detectSmartDnsProxyRedirecturl;
        private @Nullable Boolean detectTorExitNode;
        private @Nullable String detectTorExitNodeAction;
        private @Nullable String detectTorExitNodeRedirecturl;
        private @Nullable Boolean detectVpnDataCenter;
        private @Nullable String detectVpnDataCenterAction;
        private @Nullable String detectVpnDataCenterRedirecturl;
        private @Nullable String enableConfigurationMode;
        private @Nullable Boolean enabled;
        private @Nullable Boolean forwardHeaderEnrichment;
        private @Nullable String hostingProvider;
        private @Nullable Boolean locked;
        private @Nullable String publicProxy;
        private @Nullable String residentialProxy;
        private @Nullable String smartDnsProxy;
        private @Nullable String templateUuid;
        private @Nullable String torExitNode;
        private @Nullable String uuid;
        private @Nullable String vpnDataCenter;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorEnhancedProxyDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anonymousVpn = defaults.anonymousVpn;
    	      this.bestPracticeAction = defaults.bestPracticeAction;
    	      this.bestPracticeRedirecturl = defaults.bestPracticeRedirecturl;
    	      this.detectAnonymousVpn = defaults.detectAnonymousVpn;
    	      this.detectAnonymousVpnAction = defaults.detectAnonymousVpnAction;
    	      this.detectAnonymousVpnRedirecturl = defaults.detectAnonymousVpnRedirecturl;
    	      this.detectHostingProvider = defaults.detectHostingProvider;
    	      this.detectHostingProviderAction = defaults.detectHostingProviderAction;
    	      this.detectHostingProviderRedirecturl = defaults.detectHostingProviderRedirecturl;
    	      this.detectPublicProxy = defaults.detectPublicProxy;
    	      this.detectPublicProxyAction = defaults.detectPublicProxyAction;
    	      this.detectPublicProxyRedirecturl = defaults.detectPublicProxyRedirecturl;
    	      this.detectResidentialProxy = defaults.detectResidentialProxy;
    	      this.detectResidentialProxyAction = defaults.detectResidentialProxyAction;
    	      this.detectResidentialProxyRedirecturl = defaults.detectResidentialProxyRedirecturl;
    	      this.detectSmartDnsProxy = defaults.detectSmartDnsProxy;
    	      this.detectSmartDnsProxyAction = defaults.detectSmartDnsProxyAction;
    	      this.detectSmartDnsProxyRedirecturl = defaults.detectSmartDnsProxyRedirecturl;
    	      this.detectTorExitNode = defaults.detectTorExitNode;
    	      this.detectTorExitNodeAction = defaults.detectTorExitNodeAction;
    	      this.detectTorExitNodeRedirecturl = defaults.detectTorExitNodeRedirecturl;
    	      this.detectVpnDataCenter = defaults.detectVpnDataCenter;
    	      this.detectVpnDataCenterAction = defaults.detectVpnDataCenterAction;
    	      this.detectVpnDataCenterRedirecturl = defaults.detectVpnDataCenterRedirecturl;
    	      this.enableConfigurationMode = defaults.enableConfigurationMode;
    	      this.enabled = defaults.enabled;
    	      this.forwardHeaderEnrichment = defaults.forwardHeaderEnrichment;
    	      this.hostingProvider = defaults.hostingProvider;
    	      this.locked = defaults.locked;
    	      this.publicProxy = defaults.publicProxy;
    	      this.residentialProxy = defaults.residentialProxy;
    	      this.smartDnsProxy = defaults.smartDnsProxy;
    	      this.templateUuid = defaults.templateUuid;
    	      this.torExitNode = defaults.torExitNode;
    	      this.uuid = defaults.uuid;
    	      this.vpnDataCenter = defaults.vpnDataCenter;
        }

        @CustomType.Setter
        public Builder anonymousVpn(@Nullable String anonymousVpn) {

            this.anonymousVpn = anonymousVpn;
            return this;
        }
        @CustomType.Setter
        public Builder bestPracticeAction(@Nullable String bestPracticeAction) {

            this.bestPracticeAction = bestPracticeAction;
            return this;
        }
        @CustomType.Setter
        public Builder bestPracticeRedirecturl(@Nullable String bestPracticeRedirecturl) {

            this.bestPracticeRedirecturl = bestPracticeRedirecturl;
            return this;
        }
        @CustomType.Setter
        public Builder detectAnonymousVpn(@Nullable Boolean detectAnonymousVpn) {

            this.detectAnonymousVpn = detectAnonymousVpn;
            return this;
        }
        @CustomType.Setter
        public Builder detectAnonymousVpnAction(@Nullable String detectAnonymousVpnAction) {

            this.detectAnonymousVpnAction = detectAnonymousVpnAction;
            return this;
        }
        @CustomType.Setter
        public Builder detectAnonymousVpnRedirecturl(@Nullable String detectAnonymousVpnRedirecturl) {

            this.detectAnonymousVpnRedirecturl = detectAnonymousVpnRedirecturl;
            return this;
        }
        @CustomType.Setter
        public Builder detectHostingProvider(@Nullable Boolean detectHostingProvider) {

            this.detectHostingProvider = detectHostingProvider;
            return this;
        }
        @CustomType.Setter
        public Builder detectHostingProviderAction(@Nullable String detectHostingProviderAction) {

            this.detectHostingProviderAction = detectHostingProviderAction;
            return this;
        }
        @CustomType.Setter
        public Builder detectHostingProviderRedirecturl(@Nullable String detectHostingProviderRedirecturl) {

            this.detectHostingProviderRedirecturl = detectHostingProviderRedirecturl;
            return this;
        }
        @CustomType.Setter
        public Builder detectPublicProxy(@Nullable Boolean detectPublicProxy) {

            this.detectPublicProxy = detectPublicProxy;
            return this;
        }
        @CustomType.Setter
        public Builder detectPublicProxyAction(@Nullable String detectPublicProxyAction) {

            this.detectPublicProxyAction = detectPublicProxyAction;
            return this;
        }
        @CustomType.Setter
        public Builder detectPublicProxyRedirecturl(@Nullable String detectPublicProxyRedirecturl) {

            this.detectPublicProxyRedirecturl = detectPublicProxyRedirecturl;
            return this;
        }
        @CustomType.Setter
        public Builder detectResidentialProxy(@Nullable Boolean detectResidentialProxy) {

            this.detectResidentialProxy = detectResidentialProxy;
            return this;
        }
        @CustomType.Setter
        public Builder detectResidentialProxyAction(@Nullable String detectResidentialProxyAction) {

            this.detectResidentialProxyAction = detectResidentialProxyAction;
            return this;
        }
        @CustomType.Setter
        public Builder detectResidentialProxyRedirecturl(@Nullable String detectResidentialProxyRedirecturl) {

            this.detectResidentialProxyRedirecturl = detectResidentialProxyRedirecturl;
            return this;
        }
        @CustomType.Setter
        public Builder detectSmartDnsProxy(@Nullable Boolean detectSmartDnsProxy) {

            this.detectSmartDnsProxy = detectSmartDnsProxy;
            return this;
        }
        @CustomType.Setter
        public Builder detectSmartDnsProxyAction(@Nullable String detectSmartDnsProxyAction) {

            this.detectSmartDnsProxyAction = detectSmartDnsProxyAction;
            return this;
        }
        @CustomType.Setter
        public Builder detectSmartDnsProxyRedirecturl(@Nullable String detectSmartDnsProxyRedirecturl) {

            this.detectSmartDnsProxyRedirecturl = detectSmartDnsProxyRedirecturl;
            return this;
        }
        @CustomType.Setter
        public Builder detectTorExitNode(@Nullable Boolean detectTorExitNode) {

            this.detectTorExitNode = detectTorExitNode;
            return this;
        }
        @CustomType.Setter
        public Builder detectTorExitNodeAction(@Nullable String detectTorExitNodeAction) {

            this.detectTorExitNodeAction = detectTorExitNodeAction;
            return this;
        }
        @CustomType.Setter
        public Builder detectTorExitNodeRedirecturl(@Nullable String detectTorExitNodeRedirecturl) {

            this.detectTorExitNodeRedirecturl = detectTorExitNodeRedirecturl;
            return this;
        }
        @CustomType.Setter
        public Builder detectVpnDataCenter(@Nullable Boolean detectVpnDataCenter) {

            this.detectVpnDataCenter = detectVpnDataCenter;
            return this;
        }
        @CustomType.Setter
        public Builder detectVpnDataCenterAction(@Nullable String detectVpnDataCenterAction) {

            this.detectVpnDataCenterAction = detectVpnDataCenterAction;
            return this;
        }
        @CustomType.Setter
        public Builder detectVpnDataCenterRedirecturl(@Nullable String detectVpnDataCenterRedirecturl) {

            this.detectVpnDataCenterRedirecturl = detectVpnDataCenterRedirecturl;
            return this;
        }
        @CustomType.Setter
        public Builder enableConfigurationMode(@Nullable String enableConfigurationMode) {

            this.enableConfigurationMode = enableConfigurationMode;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder forwardHeaderEnrichment(@Nullable Boolean forwardHeaderEnrichment) {

            this.forwardHeaderEnrichment = forwardHeaderEnrichment;
            return this;
        }
        @CustomType.Setter
        public Builder hostingProvider(@Nullable String hostingProvider) {

            this.hostingProvider = hostingProvider;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder publicProxy(@Nullable String publicProxy) {

            this.publicProxy = publicProxy;
            return this;
        }
        @CustomType.Setter
        public Builder residentialProxy(@Nullable String residentialProxy) {

            this.residentialProxy = residentialProxy;
            return this;
        }
        @CustomType.Setter
        public Builder smartDnsProxy(@Nullable String smartDnsProxy) {

            this.smartDnsProxy = smartDnsProxy;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder torExitNode(@Nullable String torExitNode) {

            this.torExitNode = torExitNode;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder vpnDataCenter(@Nullable String vpnDataCenter) {

            this.vpnDataCenter = vpnDataCenter;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorEnhancedProxyDetection build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorEnhancedProxyDetection();
            _resultValue.anonymousVpn = anonymousVpn;
            _resultValue.bestPracticeAction = bestPracticeAction;
            _resultValue.bestPracticeRedirecturl = bestPracticeRedirecturl;
            _resultValue.detectAnonymousVpn = detectAnonymousVpn;
            _resultValue.detectAnonymousVpnAction = detectAnonymousVpnAction;
            _resultValue.detectAnonymousVpnRedirecturl = detectAnonymousVpnRedirecturl;
            _resultValue.detectHostingProvider = detectHostingProvider;
            _resultValue.detectHostingProviderAction = detectHostingProviderAction;
            _resultValue.detectHostingProviderRedirecturl = detectHostingProviderRedirecturl;
            _resultValue.detectPublicProxy = detectPublicProxy;
            _resultValue.detectPublicProxyAction = detectPublicProxyAction;
            _resultValue.detectPublicProxyRedirecturl = detectPublicProxyRedirecturl;
            _resultValue.detectResidentialProxy = detectResidentialProxy;
            _resultValue.detectResidentialProxyAction = detectResidentialProxyAction;
            _resultValue.detectResidentialProxyRedirecturl = detectResidentialProxyRedirecturl;
            _resultValue.detectSmartDnsProxy = detectSmartDnsProxy;
            _resultValue.detectSmartDnsProxyAction = detectSmartDnsProxyAction;
            _resultValue.detectSmartDnsProxyRedirecturl = detectSmartDnsProxyRedirecturl;
            _resultValue.detectTorExitNode = detectTorExitNode;
            _resultValue.detectTorExitNodeAction = detectTorExitNodeAction;
            _resultValue.detectTorExitNodeRedirecturl = detectTorExitNodeRedirecturl;
            _resultValue.detectVpnDataCenter = detectVpnDataCenter;
            _resultValue.detectVpnDataCenterAction = detectVpnDataCenterAction;
            _resultValue.detectVpnDataCenterRedirecturl = detectVpnDataCenterRedirecturl;
            _resultValue.enableConfigurationMode = enableConfigurationMode;
            _resultValue.enabled = enabled;
            _resultValue.forwardHeaderEnrichment = forwardHeaderEnrichment;
            _resultValue.hostingProvider = hostingProvider;
            _resultValue.locked = locked;
            _resultValue.publicProxy = publicProxy;
            _resultValue.residentialProxy = residentialProxy;
            _resultValue.smartDnsProxy = smartDnsProxy;
            _resultValue.templateUuid = templateUuid;
            _resultValue.torExitNode = torExitNode;
            _resultValue.uuid = uuid;
            _resultValue.vpnDataCenter = vpnDataCenter;
            return _resultValue;
        }
    }
}
