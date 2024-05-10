// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerAllDownNetStorage;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerCloudletPolicy;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer();

    @Import(name="allDownNetStorage")
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerAllDownNetStorage allDownNetStorage;

    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerAllDownNetStorage> allDownNetStorage() {
        return Optional.ofNullable(this.allDownNetStorage);
    }

    @Import(name="allDownNetStorageFile")
    private @Nullable String allDownNetStorageFile;

    public Optional<String> allDownNetStorageFile() {
        return Optional.ofNullable(this.allDownNetStorageFile);
    }

    @Import(name="allDownStatusCode")
    private @Nullable String allDownStatusCode;

    public Optional<String> allDownStatusCode() {
        return Optional.ofNullable(this.allDownStatusCode);
    }

    @Import(name="allDownTitle")
    private @Nullable String allDownTitle;

    public Optional<String> allDownTitle() {
        return Optional.ofNullable(this.allDownTitle);
    }

    @Import(name="allowCachePrefresh")
    private @Nullable Boolean allowCachePrefresh;

    public Optional<Boolean> allowCachePrefresh() {
        return Optional.ofNullable(this.allowCachePrefresh);
    }

    @Import(name="cachedContentTitle")
    private @Nullable String cachedContentTitle;

    public Optional<String> cachedContentTitle() {
        return Optional.ofNullable(this.cachedContentTitle);
    }

    @Import(name="cloudletPolicy")
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerCloudletPolicy cloudletPolicy;

    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="failoverAttemptsThreshold")
    private @Nullable Integer failoverAttemptsThreshold;

    public Optional<Integer> failoverAttemptsThreshold() {
        return Optional.ofNullable(this.failoverAttemptsThreshold);
    }

    @Import(name="failoverMode")
    private @Nullable String failoverMode;

    public Optional<String> failoverMode() {
        return Optional.ofNullable(this.failoverMode);
    }

    @Import(name="failoverOriginMaps")
    private @Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap> failoverOriginMaps;

    public Optional<List<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap>> failoverOriginMaps() {
        return Optional.ofNullable(this.failoverOriginMaps);
    }

    @Import(name="failoverStatusCodes")
    private @Nullable List<String> failoverStatusCodes;

    public Optional<List<String>> failoverStatusCodes() {
        return Optional.ofNullable(this.failoverStatusCodes);
    }

    @Import(name="failoverTitle")
    private @Nullable String failoverTitle;

    public Optional<String> failoverTitle() {
        return Optional.ofNullable(this.failoverTitle);
    }

    @Import(name="label")
    private @Nullable String label;

    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="originCookieName")
    private @Nullable String originCookieName;

    public Optional<String> originCookieName() {
        return Optional.ofNullable(this.originCookieName);
    }

    @Import(name="specifyStickinessCookieDomain")
    private @Nullable Boolean specifyStickinessCookieDomain;

    public Optional<Boolean> specifyStickinessCookieDomain() {
        return Optional.ofNullable(this.specifyStickinessCookieDomain);
    }

    @Import(name="stickinessCookieAutomaticSalt")
    private @Nullable Boolean stickinessCookieAutomaticSalt;

    public Optional<Boolean> stickinessCookieAutomaticSalt() {
        return Optional.ofNullable(this.stickinessCookieAutomaticSalt);
    }

    @Import(name="stickinessCookieDomain")
    private @Nullable String stickinessCookieDomain;

    public Optional<String> stickinessCookieDomain() {
        return Optional.ofNullable(this.stickinessCookieDomain);
    }

    @Import(name="stickinessCookieSalt")
    private @Nullable String stickinessCookieSalt;

    public Optional<String> stickinessCookieSalt() {
        return Optional.ofNullable(this.stickinessCookieSalt);
    }

    @Import(name="stickinessCookieSetHttpOnlyFlag")
    private @Nullable Boolean stickinessCookieSetHttpOnlyFlag;

    public Optional<Boolean> stickinessCookieSetHttpOnlyFlag() {
        return Optional.ofNullable(this.stickinessCookieSetHttpOnlyFlag);
    }

    @Import(name="stickinessCookieType")
    private @Nullable String stickinessCookieType;

    public Optional<String> stickinessCookieType() {
        return Optional.ofNullable(this.stickinessCookieType);
    }

    @Import(name="stickinessDuration")
    private @Nullable String stickinessDuration;

    public Optional<String> stickinessDuration() {
        return Optional.ofNullable(this.stickinessDuration);
    }

    @Import(name="stickinessExpirationDate")
    private @Nullable String stickinessExpirationDate;

    public Optional<String> stickinessExpirationDate() {
        return Optional.ofNullable(this.stickinessExpirationDate);
    }

    @Import(name="stickinessRefresh")
    private @Nullable Boolean stickinessRefresh;

    public Optional<Boolean> stickinessRefresh() {
        return Optional.ofNullable(this.stickinessRefresh);
    }

    @Import(name="stickinessTitle")
    private @Nullable String stickinessTitle;

    public Optional<String> stickinessTitle() {
        return Optional.ofNullable(this.stickinessTitle);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer $) {
        this.allDownNetStorage = $.allDownNetStorage;
        this.allDownNetStorageFile = $.allDownNetStorageFile;
        this.allDownStatusCode = $.allDownStatusCode;
        this.allDownTitle = $.allDownTitle;
        this.allowCachePrefresh = $.allowCachePrefresh;
        this.cachedContentTitle = $.cachedContentTitle;
        this.cloudletPolicy = $.cloudletPolicy;
        this.enabled = $.enabled;
        this.failoverAttemptsThreshold = $.failoverAttemptsThreshold;
        this.failoverMode = $.failoverMode;
        this.failoverOriginMaps = $.failoverOriginMaps;
        this.failoverStatusCodes = $.failoverStatusCodes;
        this.failoverTitle = $.failoverTitle;
        this.label = $.label;
        this.locked = $.locked;
        this.originCookieName = $.originCookieName;
        this.specifyStickinessCookieDomain = $.specifyStickinessCookieDomain;
        this.stickinessCookieAutomaticSalt = $.stickinessCookieAutomaticSalt;
        this.stickinessCookieDomain = $.stickinessCookieDomain;
        this.stickinessCookieSalt = $.stickinessCookieSalt;
        this.stickinessCookieSetHttpOnlyFlag = $.stickinessCookieSetHttpOnlyFlag;
        this.stickinessCookieType = $.stickinessCookieType;
        this.stickinessDuration = $.stickinessDuration;
        this.stickinessExpirationDate = $.stickinessExpirationDate;
        this.stickinessRefresh = $.stickinessRefresh;
        this.stickinessTitle = $.stickinessTitle;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer(Objects.requireNonNull(defaults));
        }

        public Builder allDownNetStorage(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerAllDownNetStorage allDownNetStorage) {
            $.allDownNetStorage = allDownNetStorage;
            return this;
        }

        public Builder allDownNetStorageFile(@Nullable String allDownNetStorageFile) {
            $.allDownNetStorageFile = allDownNetStorageFile;
            return this;
        }

        public Builder allDownStatusCode(@Nullable String allDownStatusCode) {
            $.allDownStatusCode = allDownStatusCode;
            return this;
        }

        public Builder allDownTitle(@Nullable String allDownTitle) {
            $.allDownTitle = allDownTitle;
            return this;
        }

        public Builder allowCachePrefresh(@Nullable Boolean allowCachePrefresh) {
            $.allowCachePrefresh = allowCachePrefresh;
            return this;
        }

        public Builder cachedContentTitle(@Nullable String cachedContentTitle) {
            $.cachedContentTitle = cachedContentTitle;
            return this;
        }

        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerCloudletPolicy cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder failoverAttemptsThreshold(@Nullable Integer failoverAttemptsThreshold) {
            $.failoverAttemptsThreshold = failoverAttemptsThreshold;
            return this;
        }

        public Builder failoverMode(@Nullable String failoverMode) {
            $.failoverMode = failoverMode;
            return this;
        }

        public Builder failoverOriginMaps(@Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap> failoverOriginMaps) {
            $.failoverOriginMaps = failoverOriginMaps;
            return this;
        }

        public Builder failoverOriginMaps(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap... failoverOriginMaps) {
            return failoverOriginMaps(List.of(failoverOriginMaps));
        }

        public Builder failoverStatusCodes(@Nullable List<String> failoverStatusCodes) {
            $.failoverStatusCodes = failoverStatusCodes;
            return this;
        }

        public Builder failoverStatusCodes(String... failoverStatusCodes) {
            return failoverStatusCodes(List.of(failoverStatusCodes));
        }

        public Builder failoverTitle(@Nullable String failoverTitle) {
            $.failoverTitle = failoverTitle;
            return this;
        }

        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder originCookieName(@Nullable String originCookieName) {
            $.originCookieName = originCookieName;
            return this;
        }

        public Builder specifyStickinessCookieDomain(@Nullable Boolean specifyStickinessCookieDomain) {
            $.specifyStickinessCookieDomain = specifyStickinessCookieDomain;
            return this;
        }

        public Builder stickinessCookieAutomaticSalt(@Nullable Boolean stickinessCookieAutomaticSalt) {
            $.stickinessCookieAutomaticSalt = stickinessCookieAutomaticSalt;
            return this;
        }

        public Builder stickinessCookieDomain(@Nullable String stickinessCookieDomain) {
            $.stickinessCookieDomain = stickinessCookieDomain;
            return this;
        }

        public Builder stickinessCookieSalt(@Nullable String stickinessCookieSalt) {
            $.stickinessCookieSalt = stickinessCookieSalt;
            return this;
        }

        public Builder stickinessCookieSetHttpOnlyFlag(@Nullable Boolean stickinessCookieSetHttpOnlyFlag) {
            $.stickinessCookieSetHttpOnlyFlag = stickinessCookieSetHttpOnlyFlag;
            return this;
        }

        public Builder stickinessCookieType(@Nullable String stickinessCookieType) {
            $.stickinessCookieType = stickinessCookieType;
            return this;
        }

        public Builder stickinessDuration(@Nullable String stickinessDuration) {
            $.stickinessDuration = stickinessDuration;
            return this;
        }

        public Builder stickinessExpirationDate(@Nullable String stickinessExpirationDate) {
            $.stickinessExpirationDate = stickinessExpirationDate;
            return this;
        }

        public Builder stickinessRefresh(@Nullable Boolean stickinessRefresh) {
            $.stickinessRefresh = stickinessRefresh;
            return this;
        }

        public Builder stickinessTitle(@Nullable String stickinessTitle) {
            $.stickinessTitle = stickinessTitle;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancer build() {
            return $;
        }
    }

}
