// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerAllDownNetStorageArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerCloudletPolicyArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMapArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs();

    @Import(name="allDownNetStorage")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerAllDownNetStorageArgs> allDownNetStorage;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerAllDownNetStorageArgs>> allDownNetStorage() {
        return Optional.ofNullable(this.allDownNetStorage);
    }

    @Import(name="allDownNetStorageFile")
    private @Nullable Output<String> allDownNetStorageFile;

    public Optional<Output<String>> allDownNetStorageFile() {
        return Optional.ofNullable(this.allDownNetStorageFile);
    }

    @Import(name="allDownStatusCode")
    private @Nullable Output<String> allDownStatusCode;

    public Optional<Output<String>> allDownStatusCode() {
        return Optional.ofNullable(this.allDownStatusCode);
    }

    @Import(name="allDownTitle")
    private @Nullable Output<String> allDownTitle;

    public Optional<Output<String>> allDownTitle() {
        return Optional.ofNullable(this.allDownTitle);
    }

    @Import(name="allowCachePrefresh")
    private @Nullable Output<Boolean> allowCachePrefresh;

    public Optional<Output<Boolean>> allowCachePrefresh() {
        return Optional.ofNullable(this.allowCachePrefresh);
    }

    @Import(name="cachedContentTitle")
    private @Nullable Output<String> cachedContentTitle;

    public Optional<Output<String>> cachedContentTitle() {
        return Optional.ofNullable(this.cachedContentTitle);
    }

    @Import(name="cloudletPolicy")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerCloudletPolicyArgs> cloudletPolicy;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerCloudletPolicyArgs>> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="failoverAttemptsThreshold")
    private @Nullable Output<Integer> failoverAttemptsThreshold;

    public Optional<Output<Integer>> failoverAttemptsThreshold() {
        return Optional.ofNullable(this.failoverAttemptsThreshold);
    }

    @Import(name="failoverMode")
    private @Nullable Output<String> failoverMode;

    public Optional<Output<String>> failoverMode() {
        return Optional.ofNullable(this.failoverMode);
    }

    @Import(name="failoverOriginMaps")
    private @Nullable Output<List<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMapArgs>> failoverOriginMaps;

    public Optional<Output<List<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMapArgs>>> failoverOriginMaps() {
        return Optional.ofNullable(this.failoverOriginMaps);
    }

    @Import(name="failoverStatusCodes")
    private @Nullable Output<List<String>> failoverStatusCodes;

    public Optional<Output<List<String>>> failoverStatusCodes() {
        return Optional.ofNullable(this.failoverStatusCodes);
    }

    @Import(name="failoverTitle")
    private @Nullable Output<String> failoverTitle;

    public Optional<Output<String>> failoverTitle() {
        return Optional.ofNullable(this.failoverTitle);
    }

    @Import(name="label")
    private @Nullable Output<String> label;

    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="originCookieName")
    private @Nullable Output<String> originCookieName;

    public Optional<Output<String>> originCookieName() {
        return Optional.ofNullable(this.originCookieName);
    }

    @Import(name="specifyStickinessCookieDomain")
    private @Nullable Output<Boolean> specifyStickinessCookieDomain;

    public Optional<Output<Boolean>> specifyStickinessCookieDomain() {
        return Optional.ofNullable(this.specifyStickinessCookieDomain);
    }

    @Import(name="stickinessCookieAutomaticSalt")
    private @Nullable Output<Boolean> stickinessCookieAutomaticSalt;

    public Optional<Output<Boolean>> stickinessCookieAutomaticSalt() {
        return Optional.ofNullable(this.stickinessCookieAutomaticSalt);
    }

    @Import(name="stickinessCookieDomain")
    private @Nullable Output<String> stickinessCookieDomain;

    public Optional<Output<String>> stickinessCookieDomain() {
        return Optional.ofNullable(this.stickinessCookieDomain);
    }

    @Import(name="stickinessCookieSalt")
    private @Nullable Output<String> stickinessCookieSalt;

    public Optional<Output<String>> stickinessCookieSalt() {
        return Optional.ofNullable(this.stickinessCookieSalt);
    }

    @Import(name="stickinessCookieSetHttpOnlyFlag")
    private @Nullable Output<Boolean> stickinessCookieSetHttpOnlyFlag;

    public Optional<Output<Boolean>> stickinessCookieSetHttpOnlyFlag() {
        return Optional.ofNullable(this.stickinessCookieSetHttpOnlyFlag);
    }

    @Import(name="stickinessCookieType")
    private @Nullable Output<String> stickinessCookieType;

    public Optional<Output<String>> stickinessCookieType() {
        return Optional.ofNullable(this.stickinessCookieType);
    }

    @Import(name="stickinessDuration")
    private @Nullable Output<String> stickinessDuration;

    public Optional<Output<String>> stickinessDuration() {
        return Optional.ofNullable(this.stickinessDuration);
    }

    @Import(name="stickinessExpirationDate")
    private @Nullable Output<String> stickinessExpirationDate;

    public Optional<Output<String>> stickinessExpirationDate() {
        return Optional.ofNullable(this.stickinessExpirationDate);
    }

    @Import(name="stickinessRefresh")
    private @Nullable Output<Boolean> stickinessRefresh;

    public Optional<Output<Boolean>> stickinessRefresh() {
        return Optional.ofNullable(this.stickinessRefresh);
    }

    @Import(name="stickinessTitle")
    private @Nullable Output<String> stickinessTitle;

    public Optional<Output<String>> stickinessTitle() {
        return Optional.ofNullable(this.stickinessTitle);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs $) {
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
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        public Builder allDownNetStorage(@Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerAllDownNetStorageArgs> allDownNetStorage) {
            $.allDownNetStorage = allDownNetStorage;
            return this;
        }

        public Builder allDownNetStorage(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerAllDownNetStorageArgs allDownNetStorage) {
            return allDownNetStorage(Output.of(allDownNetStorage));
        }

        public Builder allDownNetStorageFile(@Nullable Output<String> allDownNetStorageFile) {
            $.allDownNetStorageFile = allDownNetStorageFile;
            return this;
        }

        public Builder allDownNetStorageFile(String allDownNetStorageFile) {
            return allDownNetStorageFile(Output.of(allDownNetStorageFile));
        }

        public Builder allDownStatusCode(@Nullable Output<String> allDownStatusCode) {
            $.allDownStatusCode = allDownStatusCode;
            return this;
        }

        public Builder allDownStatusCode(String allDownStatusCode) {
            return allDownStatusCode(Output.of(allDownStatusCode));
        }

        public Builder allDownTitle(@Nullable Output<String> allDownTitle) {
            $.allDownTitle = allDownTitle;
            return this;
        }

        public Builder allDownTitle(String allDownTitle) {
            return allDownTitle(Output.of(allDownTitle));
        }

        public Builder allowCachePrefresh(@Nullable Output<Boolean> allowCachePrefresh) {
            $.allowCachePrefresh = allowCachePrefresh;
            return this;
        }

        public Builder allowCachePrefresh(Boolean allowCachePrefresh) {
            return allowCachePrefresh(Output.of(allowCachePrefresh));
        }

        public Builder cachedContentTitle(@Nullable Output<String> cachedContentTitle) {
            $.cachedContentTitle = cachedContentTitle;
            return this;
        }

        public Builder cachedContentTitle(String cachedContentTitle) {
            return cachedContentTitle(Output.of(cachedContentTitle));
        }

        public Builder cloudletPolicy(@Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerCloudletPolicyArgs> cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder cloudletPolicy(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerCloudletPolicyArgs cloudletPolicy) {
            return cloudletPolicy(Output.of(cloudletPolicy));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder failoverAttemptsThreshold(@Nullable Output<Integer> failoverAttemptsThreshold) {
            $.failoverAttemptsThreshold = failoverAttemptsThreshold;
            return this;
        }

        public Builder failoverAttemptsThreshold(Integer failoverAttemptsThreshold) {
            return failoverAttemptsThreshold(Output.of(failoverAttemptsThreshold));
        }

        public Builder failoverMode(@Nullable Output<String> failoverMode) {
            $.failoverMode = failoverMode;
            return this;
        }

        public Builder failoverMode(String failoverMode) {
            return failoverMode(Output.of(failoverMode));
        }

        public Builder failoverOriginMaps(@Nullable Output<List<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMapArgs>> failoverOriginMaps) {
            $.failoverOriginMaps = failoverOriginMaps;
            return this;
        }

        public Builder failoverOriginMaps(List<GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMapArgs> failoverOriginMaps) {
            return failoverOriginMaps(Output.of(failoverOriginMaps));
        }

        public Builder failoverOriginMaps(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMapArgs... failoverOriginMaps) {
            return failoverOriginMaps(List.of(failoverOriginMaps));
        }

        public Builder failoverStatusCodes(@Nullable Output<List<String>> failoverStatusCodes) {
            $.failoverStatusCodes = failoverStatusCodes;
            return this;
        }

        public Builder failoverStatusCodes(List<String> failoverStatusCodes) {
            return failoverStatusCodes(Output.of(failoverStatusCodes));
        }

        public Builder failoverStatusCodes(String... failoverStatusCodes) {
            return failoverStatusCodes(List.of(failoverStatusCodes));
        }

        public Builder failoverTitle(@Nullable Output<String> failoverTitle) {
            $.failoverTitle = failoverTitle;
            return this;
        }

        public Builder failoverTitle(String failoverTitle) {
            return failoverTitle(Output.of(failoverTitle));
        }

        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder originCookieName(@Nullable Output<String> originCookieName) {
            $.originCookieName = originCookieName;
            return this;
        }

        public Builder originCookieName(String originCookieName) {
            return originCookieName(Output.of(originCookieName));
        }

        public Builder specifyStickinessCookieDomain(@Nullable Output<Boolean> specifyStickinessCookieDomain) {
            $.specifyStickinessCookieDomain = specifyStickinessCookieDomain;
            return this;
        }

        public Builder specifyStickinessCookieDomain(Boolean specifyStickinessCookieDomain) {
            return specifyStickinessCookieDomain(Output.of(specifyStickinessCookieDomain));
        }

        public Builder stickinessCookieAutomaticSalt(@Nullable Output<Boolean> stickinessCookieAutomaticSalt) {
            $.stickinessCookieAutomaticSalt = stickinessCookieAutomaticSalt;
            return this;
        }

        public Builder stickinessCookieAutomaticSalt(Boolean stickinessCookieAutomaticSalt) {
            return stickinessCookieAutomaticSalt(Output.of(stickinessCookieAutomaticSalt));
        }

        public Builder stickinessCookieDomain(@Nullable Output<String> stickinessCookieDomain) {
            $.stickinessCookieDomain = stickinessCookieDomain;
            return this;
        }

        public Builder stickinessCookieDomain(String stickinessCookieDomain) {
            return stickinessCookieDomain(Output.of(stickinessCookieDomain));
        }

        public Builder stickinessCookieSalt(@Nullable Output<String> stickinessCookieSalt) {
            $.stickinessCookieSalt = stickinessCookieSalt;
            return this;
        }

        public Builder stickinessCookieSalt(String stickinessCookieSalt) {
            return stickinessCookieSalt(Output.of(stickinessCookieSalt));
        }

        public Builder stickinessCookieSetHttpOnlyFlag(@Nullable Output<Boolean> stickinessCookieSetHttpOnlyFlag) {
            $.stickinessCookieSetHttpOnlyFlag = stickinessCookieSetHttpOnlyFlag;
            return this;
        }

        public Builder stickinessCookieSetHttpOnlyFlag(Boolean stickinessCookieSetHttpOnlyFlag) {
            return stickinessCookieSetHttpOnlyFlag(Output.of(stickinessCookieSetHttpOnlyFlag));
        }

        public Builder stickinessCookieType(@Nullable Output<String> stickinessCookieType) {
            $.stickinessCookieType = stickinessCookieType;
            return this;
        }

        public Builder stickinessCookieType(String stickinessCookieType) {
            return stickinessCookieType(Output.of(stickinessCookieType));
        }

        public Builder stickinessDuration(@Nullable Output<String> stickinessDuration) {
            $.stickinessDuration = stickinessDuration;
            return this;
        }

        public Builder stickinessDuration(String stickinessDuration) {
            return stickinessDuration(Output.of(stickinessDuration));
        }

        public Builder stickinessExpirationDate(@Nullable Output<String> stickinessExpirationDate) {
            $.stickinessExpirationDate = stickinessExpirationDate;
            return this;
        }

        public Builder stickinessExpirationDate(String stickinessExpirationDate) {
            return stickinessExpirationDate(Output.of(stickinessExpirationDate));
        }

        public Builder stickinessRefresh(@Nullable Output<Boolean> stickinessRefresh) {
            $.stickinessRefresh = stickinessRefresh;
            return this;
        }

        public Builder stickinessRefresh(Boolean stickinessRefresh) {
            return stickinessRefresh(Output.of(stickinessRefresh));
        }

        public Builder stickinessTitle(@Nullable Output<String> stickinessTitle) {
            $.stickinessTitle = stickinessTitle;
            return this;
        }

        public Builder stickinessTitle(String stickinessTitle) {
            return stickinessTitle(Output.of(stickinessTitle));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerArgs build() {
            return $;
        }
    }

}
