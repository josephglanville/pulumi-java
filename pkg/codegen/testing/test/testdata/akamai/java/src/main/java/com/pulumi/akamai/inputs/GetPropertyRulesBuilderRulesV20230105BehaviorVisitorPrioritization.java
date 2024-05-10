// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicy;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCode;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorage;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization();

    @Import(name="allowedUserCookieAdvanced")
    private @Nullable Boolean allowedUserCookieAdvanced;

    public Optional<Boolean> allowedUserCookieAdvanced() {
        return Optional.ofNullable(this.allowedUserCookieAdvanced);
    }

    @Import(name="allowedUserCookieAutomaticSalt")
    private @Nullable Boolean allowedUserCookieAutomaticSalt;

    public Optional<Boolean> allowedUserCookieAutomaticSalt() {
        return Optional.ofNullable(this.allowedUserCookieAutomaticSalt);
    }

    @Import(name="allowedUserCookieDomain")
    private @Nullable String allowedUserCookieDomain;

    public Optional<String> allowedUserCookieDomain() {
        return Optional.ofNullable(this.allowedUserCookieDomain);
    }

    @Import(name="allowedUserCookieDomainType")
    private @Nullable String allowedUserCookieDomainType;

    public Optional<String> allowedUserCookieDomainType() {
        return Optional.ofNullable(this.allowedUserCookieDomainType);
    }

    @Import(name="allowedUserCookieDuration")
    private @Nullable Integer allowedUserCookieDuration;

    public Optional<Integer> allowedUserCookieDuration() {
        return Optional.ofNullable(this.allowedUserCookieDuration);
    }

    @Import(name="allowedUserCookieEnabled")
    private @Nullable Boolean allowedUserCookieEnabled;

    public Optional<Boolean> allowedUserCookieEnabled() {
        return Optional.ofNullable(this.allowedUserCookieEnabled);
    }

    @Import(name="allowedUserCookieHttpOnly")
    private @Nullable Boolean allowedUserCookieHttpOnly;

    public Optional<Boolean> allowedUserCookieHttpOnly() {
        return Optional.ofNullable(this.allowedUserCookieHttpOnly);
    }

    @Import(name="allowedUserCookieLabel")
    private @Nullable String allowedUserCookieLabel;

    public Optional<String> allowedUserCookieLabel() {
        return Optional.ofNullable(this.allowedUserCookieLabel);
    }

    @Import(name="allowedUserCookieManagementTitle")
    private @Nullable String allowedUserCookieManagementTitle;

    public Optional<String> allowedUserCookieManagementTitle() {
        return Optional.ofNullable(this.allowedUserCookieManagementTitle);
    }

    @Import(name="allowedUserCookieRefresh")
    private @Nullable Boolean allowedUserCookieRefresh;

    public Optional<Boolean> allowedUserCookieRefresh() {
        return Optional.ofNullable(this.allowedUserCookieRefresh);
    }

    @Import(name="allowedUserCookieSalt")
    private @Nullable String allowedUserCookieSalt;

    public Optional<String> allowedUserCookieSalt() {
        return Optional.ofNullable(this.allowedUserCookieSalt);
    }

    @Import(name="cloudletPolicy")
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicy cloudletPolicy;

    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="userIdentificationByCookie")
    private @Nullable Boolean userIdentificationByCookie;

    public Optional<Boolean> userIdentificationByCookie() {
        return Optional.ofNullable(this.userIdentificationByCookie);
    }

    @Import(name="userIdentificationByHeaders")
    private @Nullable Boolean userIdentificationByHeaders;

    public Optional<Boolean> userIdentificationByHeaders() {
        return Optional.ofNullable(this.userIdentificationByHeaders);
    }

    @Import(name="userIdentificationByIp")
    private @Nullable Boolean userIdentificationByIp;

    public Optional<Boolean> userIdentificationByIp() {
        return Optional.ofNullable(this.userIdentificationByIp);
    }

    @Import(name="userIdentificationByParams")
    private @Nullable Boolean userIdentificationByParams;

    public Optional<Boolean> userIdentificationByParams() {
        return Optional.ofNullable(this.userIdentificationByParams);
    }

    @Import(name="userIdentificationKeyCookie")
    private @Nullable String userIdentificationKeyCookie;

    public Optional<String> userIdentificationKeyCookie() {
        return Optional.ofNullable(this.userIdentificationKeyCookie);
    }

    @Import(name="userIdentificationKeyHeaders")
    private @Nullable List<String> userIdentificationKeyHeaders;

    public Optional<List<String>> userIdentificationKeyHeaders() {
        return Optional.ofNullable(this.userIdentificationKeyHeaders);
    }

    @Import(name="userIdentificationKeyParams")
    private @Nullable List<String> userIdentificationKeyParams;

    public Optional<List<String>> userIdentificationKeyParams() {
        return Optional.ofNullable(this.userIdentificationKeyParams);
    }

    @Import(name="userIdentificationTitle")
    private @Nullable String userIdentificationTitle;

    public Optional<String> userIdentificationTitle() {
        return Optional.ofNullable(this.userIdentificationTitle);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="waitingRoomCacheTtl")
    private @Nullable Integer waitingRoomCacheTtl;

    public Optional<Integer> waitingRoomCacheTtl() {
        return Optional.ofNullable(this.waitingRoomCacheTtl);
    }

    @Import(name="waitingRoomCookieAdvanced")
    private @Nullable Boolean waitingRoomCookieAdvanced;

    public Optional<Boolean> waitingRoomCookieAdvanced() {
        return Optional.ofNullable(this.waitingRoomCookieAdvanced);
    }

    @Import(name="waitingRoomCookieAutomaticSalt")
    private @Nullable Boolean waitingRoomCookieAutomaticSalt;

    public Optional<Boolean> waitingRoomCookieAutomaticSalt() {
        return Optional.ofNullable(this.waitingRoomCookieAutomaticSalt);
    }

    @Import(name="waitingRoomCookieDomain")
    private @Nullable String waitingRoomCookieDomain;

    public Optional<String> waitingRoomCookieDomain() {
        return Optional.ofNullable(this.waitingRoomCookieDomain);
    }

    @Import(name="waitingRoomCookieDomainType")
    private @Nullable String waitingRoomCookieDomainType;

    public Optional<String> waitingRoomCookieDomainType() {
        return Optional.ofNullable(this.waitingRoomCookieDomainType);
    }

    @Import(name="waitingRoomCookieDuration")
    private @Nullable Integer waitingRoomCookieDuration;

    public Optional<Integer> waitingRoomCookieDuration() {
        return Optional.ofNullable(this.waitingRoomCookieDuration);
    }

    @Import(name="waitingRoomCookieEnabled")
    private @Nullable Boolean waitingRoomCookieEnabled;

    public Optional<Boolean> waitingRoomCookieEnabled() {
        return Optional.ofNullable(this.waitingRoomCookieEnabled);
    }

    @Import(name="waitingRoomCookieHttpOnly")
    private @Nullable Boolean waitingRoomCookieHttpOnly;

    public Optional<Boolean> waitingRoomCookieHttpOnly() {
        return Optional.ofNullable(this.waitingRoomCookieHttpOnly);
    }

    @Import(name="waitingRoomCookieLabel")
    private @Nullable String waitingRoomCookieLabel;

    public Optional<String> waitingRoomCookieLabel() {
        return Optional.ofNullable(this.waitingRoomCookieLabel);
    }

    @Import(name="waitingRoomCookieManagementTitle")
    private @Nullable String waitingRoomCookieManagementTitle;

    public Optional<String> waitingRoomCookieManagementTitle() {
        return Optional.ofNullable(this.waitingRoomCookieManagementTitle);
    }

    @Import(name="waitingRoomCookieSalt")
    private @Nullable String waitingRoomCookieSalt;

    public Optional<String> waitingRoomCookieSalt() {
        return Optional.ofNullable(this.waitingRoomCookieSalt);
    }

    @Import(name="waitingRoomCookieShareLabel")
    private @Nullable Boolean waitingRoomCookieShareLabel;

    public Optional<Boolean> waitingRoomCookieShareLabel() {
        return Optional.ofNullable(this.waitingRoomCookieShareLabel);
    }

    @Import(name="waitingRoomCpCode")
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCode waitingRoomCpCode;

    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCode> waitingRoomCpCode() {
        return Optional.ofNullable(this.waitingRoomCpCode);
    }

    @Import(name="waitingRoomDirectory")
    private @Nullable String waitingRoomDirectory;

    public Optional<String> waitingRoomDirectory() {
        return Optional.ofNullable(this.waitingRoomDirectory);
    }

    @Import(name="waitingRoomManagementTitle")
    private @Nullable String waitingRoomManagementTitle;

    public Optional<String> waitingRoomManagementTitle() {
        return Optional.ofNullable(this.waitingRoomManagementTitle);
    }

    @Import(name="waitingRoomNetStorage")
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorage waitingRoomNetStorage;

    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorage> waitingRoomNetStorage() {
        return Optional.ofNullable(this.waitingRoomNetStorage);
    }

    @Import(name="waitingRoomStatusCode")
    private @Nullable Integer waitingRoomStatusCode;

    public Optional<Integer> waitingRoomStatusCode() {
        return Optional.ofNullable(this.waitingRoomStatusCode);
    }

    @Import(name="waitingRoomUseCpCode")
    private @Nullable Boolean waitingRoomUseCpCode;

    public Optional<Boolean> waitingRoomUseCpCode() {
        return Optional.ofNullable(this.waitingRoomUseCpCode);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization $) {
        this.allowedUserCookieAdvanced = $.allowedUserCookieAdvanced;
        this.allowedUserCookieAutomaticSalt = $.allowedUserCookieAutomaticSalt;
        this.allowedUserCookieDomain = $.allowedUserCookieDomain;
        this.allowedUserCookieDomainType = $.allowedUserCookieDomainType;
        this.allowedUserCookieDuration = $.allowedUserCookieDuration;
        this.allowedUserCookieEnabled = $.allowedUserCookieEnabled;
        this.allowedUserCookieHttpOnly = $.allowedUserCookieHttpOnly;
        this.allowedUserCookieLabel = $.allowedUserCookieLabel;
        this.allowedUserCookieManagementTitle = $.allowedUserCookieManagementTitle;
        this.allowedUserCookieRefresh = $.allowedUserCookieRefresh;
        this.allowedUserCookieSalt = $.allowedUserCookieSalt;
        this.cloudletPolicy = $.cloudletPolicy;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.userIdentificationByCookie = $.userIdentificationByCookie;
        this.userIdentificationByHeaders = $.userIdentificationByHeaders;
        this.userIdentificationByIp = $.userIdentificationByIp;
        this.userIdentificationByParams = $.userIdentificationByParams;
        this.userIdentificationKeyCookie = $.userIdentificationKeyCookie;
        this.userIdentificationKeyHeaders = $.userIdentificationKeyHeaders;
        this.userIdentificationKeyParams = $.userIdentificationKeyParams;
        this.userIdentificationTitle = $.userIdentificationTitle;
        this.uuid = $.uuid;
        this.waitingRoomCacheTtl = $.waitingRoomCacheTtl;
        this.waitingRoomCookieAdvanced = $.waitingRoomCookieAdvanced;
        this.waitingRoomCookieAutomaticSalt = $.waitingRoomCookieAutomaticSalt;
        this.waitingRoomCookieDomain = $.waitingRoomCookieDomain;
        this.waitingRoomCookieDomainType = $.waitingRoomCookieDomainType;
        this.waitingRoomCookieDuration = $.waitingRoomCookieDuration;
        this.waitingRoomCookieEnabled = $.waitingRoomCookieEnabled;
        this.waitingRoomCookieHttpOnly = $.waitingRoomCookieHttpOnly;
        this.waitingRoomCookieLabel = $.waitingRoomCookieLabel;
        this.waitingRoomCookieManagementTitle = $.waitingRoomCookieManagementTitle;
        this.waitingRoomCookieSalt = $.waitingRoomCookieSalt;
        this.waitingRoomCookieShareLabel = $.waitingRoomCookieShareLabel;
        this.waitingRoomCpCode = $.waitingRoomCpCode;
        this.waitingRoomDirectory = $.waitingRoomDirectory;
        this.waitingRoomManagementTitle = $.waitingRoomManagementTitle;
        this.waitingRoomNetStorage = $.waitingRoomNetStorage;
        this.waitingRoomStatusCode = $.waitingRoomStatusCode;
        this.waitingRoomUseCpCode = $.waitingRoomUseCpCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization(Objects.requireNonNull(defaults));
        }

        public Builder allowedUserCookieAdvanced(@Nullable Boolean allowedUserCookieAdvanced) {
            $.allowedUserCookieAdvanced = allowedUserCookieAdvanced;
            return this;
        }

        public Builder allowedUserCookieAutomaticSalt(@Nullable Boolean allowedUserCookieAutomaticSalt) {
            $.allowedUserCookieAutomaticSalt = allowedUserCookieAutomaticSalt;
            return this;
        }

        public Builder allowedUserCookieDomain(@Nullable String allowedUserCookieDomain) {
            $.allowedUserCookieDomain = allowedUserCookieDomain;
            return this;
        }

        public Builder allowedUserCookieDomainType(@Nullable String allowedUserCookieDomainType) {
            $.allowedUserCookieDomainType = allowedUserCookieDomainType;
            return this;
        }

        public Builder allowedUserCookieDuration(@Nullable Integer allowedUserCookieDuration) {
            $.allowedUserCookieDuration = allowedUserCookieDuration;
            return this;
        }

        public Builder allowedUserCookieEnabled(@Nullable Boolean allowedUserCookieEnabled) {
            $.allowedUserCookieEnabled = allowedUserCookieEnabled;
            return this;
        }

        public Builder allowedUserCookieHttpOnly(@Nullable Boolean allowedUserCookieHttpOnly) {
            $.allowedUserCookieHttpOnly = allowedUserCookieHttpOnly;
            return this;
        }

        public Builder allowedUserCookieLabel(@Nullable String allowedUserCookieLabel) {
            $.allowedUserCookieLabel = allowedUserCookieLabel;
            return this;
        }

        public Builder allowedUserCookieManagementTitle(@Nullable String allowedUserCookieManagementTitle) {
            $.allowedUserCookieManagementTitle = allowedUserCookieManagementTitle;
            return this;
        }

        public Builder allowedUserCookieRefresh(@Nullable Boolean allowedUserCookieRefresh) {
            $.allowedUserCookieRefresh = allowedUserCookieRefresh;
            return this;
        }

        public Builder allowedUserCookieSalt(@Nullable String allowedUserCookieSalt) {
            $.allowedUserCookieSalt = allowedUserCookieSalt;
            return this;
        }

        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicy cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder userIdentificationByCookie(@Nullable Boolean userIdentificationByCookie) {
            $.userIdentificationByCookie = userIdentificationByCookie;
            return this;
        }

        public Builder userIdentificationByHeaders(@Nullable Boolean userIdentificationByHeaders) {
            $.userIdentificationByHeaders = userIdentificationByHeaders;
            return this;
        }

        public Builder userIdentificationByIp(@Nullable Boolean userIdentificationByIp) {
            $.userIdentificationByIp = userIdentificationByIp;
            return this;
        }

        public Builder userIdentificationByParams(@Nullable Boolean userIdentificationByParams) {
            $.userIdentificationByParams = userIdentificationByParams;
            return this;
        }

        public Builder userIdentificationKeyCookie(@Nullable String userIdentificationKeyCookie) {
            $.userIdentificationKeyCookie = userIdentificationKeyCookie;
            return this;
        }

        public Builder userIdentificationKeyHeaders(@Nullable List<String> userIdentificationKeyHeaders) {
            $.userIdentificationKeyHeaders = userIdentificationKeyHeaders;
            return this;
        }

        public Builder userIdentificationKeyHeaders(String... userIdentificationKeyHeaders) {
            return userIdentificationKeyHeaders(List.of(userIdentificationKeyHeaders));
        }

        public Builder userIdentificationKeyParams(@Nullable List<String> userIdentificationKeyParams) {
            $.userIdentificationKeyParams = userIdentificationKeyParams;
            return this;
        }

        public Builder userIdentificationKeyParams(String... userIdentificationKeyParams) {
            return userIdentificationKeyParams(List.of(userIdentificationKeyParams));
        }

        public Builder userIdentificationTitle(@Nullable String userIdentificationTitle) {
            $.userIdentificationTitle = userIdentificationTitle;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder waitingRoomCacheTtl(@Nullable Integer waitingRoomCacheTtl) {
            $.waitingRoomCacheTtl = waitingRoomCacheTtl;
            return this;
        }

        public Builder waitingRoomCookieAdvanced(@Nullable Boolean waitingRoomCookieAdvanced) {
            $.waitingRoomCookieAdvanced = waitingRoomCookieAdvanced;
            return this;
        }

        public Builder waitingRoomCookieAutomaticSalt(@Nullable Boolean waitingRoomCookieAutomaticSalt) {
            $.waitingRoomCookieAutomaticSalt = waitingRoomCookieAutomaticSalt;
            return this;
        }

        public Builder waitingRoomCookieDomain(@Nullable String waitingRoomCookieDomain) {
            $.waitingRoomCookieDomain = waitingRoomCookieDomain;
            return this;
        }

        public Builder waitingRoomCookieDomainType(@Nullable String waitingRoomCookieDomainType) {
            $.waitingRoomCookieDomainType = waitingRoomCookieDomainType;
            return this;
        }

        public Builder waitingRoomCookieDuration(@Nullable Integer waitingRoomCookieDuration) {
            $.waitingRoomCookieDuration = waitingRoomCookieDuration;
            return this;
        }

        public Builder waitingRoomCookieEnabled(@Nullable Boolean waitingRoomCookieEnabled) {
            $.waitingRoomCookieEnabled = waitingRoomCookieEnabled;
            return this;
        }

        public Builder waitingRoomCookieHttpOnly(@Nullable Boolean waitingRoomCookieHttpOnly) {
            $.waitingRoomCookieHttpOnly = waitingRoomCookieHttpOnly;
            return this;
        }

        public Builder waitingRoomCookieLabel(@Nullable String waitingRoomCookieLabel) {
            $.waitingRoomCookieLabel = waitingRoomCookieLabel;
            return this;
        }

        public Builder waitingRoomCookieManagementTitle(@Nullable String waitingRoomCookieManagementTitle) {
            $.waitingRoomCookieManagementTitle = waitingRoomCookieManagementTitle;
            return this;
        }

        public Builder waitingRoomCookieSalt(@Nullable String waitingRoomCookieSalt) {
            $.waitingRoomCookieSalt = waitingRoomCookieSalt;
            return this;
        }

        public Builder waitingRoomCookieShareLabel(@Nullable Boolean waitingRoomCookieShareLabel) {
            $.waitingRoomCookieShareLabel = waitingRoomCookieShareLabel;
            return this;
        }

        public Builder waitingRoomCpCode(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCode waitingRoomCpCode) {
            $.waitingRoomCpCode = waitingRoomCpCode;
            return this;
        }

        public Builder waitingRoomDirectory(@Nullable String waitingRoomDirectory) {
            $.waitingRoomDirectory = waitingRoomDirectory;
            return this;
        }

        public Builder waitingRoomManagementTitle(@Nullable String waitingRoomManagementTitle) {
            $.waitingRoomManagementTitle = waitingRoomManagementTitle;
            return this;
        }

        public Builder waitingRoomNetStorage(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorage waitingRoomNetStorage) {
            $.waitingRoomNetStorage = waitingRoomNetStorage;
            return this;
        }

        public Builder waitingRoomStatusCode(@Nullable Integer waitingRoomStatusCode) {
            $.waitingRoomStatusCode = waitingRoomStatusCode;
            return this;
        }

        public Builder waitingRoomUseCpCode(@Nullable Boolean waitingRoomUseCpCode) {
            $.waitingRoomUseCpCode = waitingRoomUseCpCode;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization build() {
            return $;
        }
    }

}
