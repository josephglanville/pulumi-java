// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs();

    @Import(name="accessControl")
    private @Nullable Output<Boolean> accessControl;

    public Optional<Output<Boolean>> accessControl() {
        return Optional.ofNullable(this.accessControl);
    }

    @Import(name="cacheKey")
    private @Nullable Output<Boolean> cacheKey;

    public Optional<Output<Boolean>> cacheKey() {
        return Optional.ofNullable(this.cacheKey);
    }

    @Import(name="caching")
    private @Nullable Output<Boolean> caching;

    public Optional<Output<Boolean>> caching() {
        return Optional.ofNullable(this.caching);
    }

    @Import(name="contentCompressor")
    private @Nullable Output<Boolean> contentCompressor;

    public Optional<Output<Boolean>> contentCompressor() {
        return Optional.ofNullable(this.contentCompressor);
    }

    @Import(name="dynamicWebContent")
    private @Nullable Output<Boolean> dynamicWebContent;

    public Optional<Output<Boolean>> dynamicWebContent() {
        return Optional.ofNullable(this.dynamicWebContent);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="geoLocation")
    private @Nullable Output<Boolean> geoLocation;

    public Optional<Output<Boolean>> geoLocation() {
        return Optional.ofNullable(this.geoLocation);
    }

    @Import(name="ip")
    private @Nullable Output<Boolean> ip;

    public Optional<Output<Boolean>> ip() {
        return Optional.ofNullable(this.ip);
    }

    @Import(name="largeFileDelivery")
    private @Nullable Output<Boolean> largeFileDelivery;

    public Optional<Output<Boolean>> largeFileDelivery() {
        return Optional.ofNullable(this.largeFileDelivery);
    }

    @Import(name="liveVideoDelivery")
    private @Nullable Output<Boolean> liveVideoDelivery;

    public Optional<Output<Boolean>> liveVideoDelivery() {
        return Optional.ofNullable(this.liveVideoDelivery);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="modifyPath")
    private @Nullable Output<Boolean> modifyPath;

    public Optional<Output<Boolean>> modifyPath() {
        return Optional.ofNullable(this.modifyPath);
    }

    @Import(name="onDemandVideoDelivery")
    private @Nullable Output<Boolean> onDemandVideoDelivery;

    public Optional<Output<Boolean>> onDemandVideoDelivery() {
        return Optional.ofNullable(this.onDemandVideoDelivery);
    }

    @Import(name="origin")
    private @Nullable Output<Boolean> origin;

    public Optional<Output<Boolean>> origin() {
        return Optional.ofNullable(this.origin);
    }

    @Import(name="partnerDomainSuffix")
    private @Nullable Output<String> partnerDomainSuffix;

    public Optional<Output<String>> partnerDomainSuffix() {
        return Optional.ofNullable(this.partnerDomainSuffix);
    }

    @Import(name="referrer")
    private @Nullable Output<Boolean> referrer;

    public Optional<Output<Boolean>> referrer() {
        return Optional.ofNullable(this.referrer);
    }

    @Import(name="refreshContent")
    private @Nullable Output<Boolean> refreshContent;

    public Optional<Output<Boolean>> refreshContent() {
        return Optional.ofNullable(this.refreshContent);
    }

    @Import(name="siteFailover")
    private @Nullable Output<Boolean> siteFailover;

    public Optional<Output<Boolean>> siteFailover() {
        return Optional.ofNullable(this.siteFailover);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="tokenAuthorization")
    private @Nullable Output<Boolean> tokenAuthorization;

    public Optional<Output<Boolean>> tokenAuthorization() {
        return Optional.ofNullable(this.tokenAuthorization);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="webApplicationFirewall")
    private @Nullable Output<Boolean> webApplicationFirewall;

    public Optional<Output<Boolean>> webApplicationFirewall() {
        return Optional.ofNullable(this.webApplicationFirewall);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs(GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs $) {
        this.accessControl = $.accessControl;
        this.cacheKey = $.cacheKey;
        this.caching = $.caching;
        this.contentCompressor = $.contentCompressor;
        this.dynamicWebContent = $.dynamicWebContent;
        this.enabled = $.enabled;
        this.geoLocation = $.geoLocation;
        this.ip = $.ip;
        this.largeFileDelivery = $.largeFileDelivery;
        this.liveVideoDelivery = $.liveVideoDelivery;
        this.locked = $.locked;
        this.modifyPath = $.modifyPath;
        this.onDemandVideoDelivery = $.onDemandVideoDelivery;
        this.origin = $.origin;
        this.partnerDomainSuffix = $.partnerDomainSuffix;
        this.referrer = $.referrer;
        this.refreshContent = $.refreshContent;
        this.siteFailover = $.siteFailover;
        this.templateUuid = $.templateUuid;
        this.tokenAuthorization = $.tokenAuthorization;
        this.uuid = $.uuid;
        this.webApplicationFirewall = $.webApplicationFirewall;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessControl(@Nullable Output<Boolean> accessControl) {
            $.accessControl = accessControl;
            return this;
        }

        public Builder accessControl(Boolean accessControl) {
            return accessControl(Output.of(accessControl));
        }

        public Builder cacheKey(@Nullable Output<Boolean> cacheKey) {
            $.cacheKey = cacheKey;
            return this;
        }

        public Builder cacheKey(Boolean cacheKey) {
            return cacheKey(Output.of(cacheKey));
        }

        public Builder caching(@Nullable Output<Boolean> caching) {
            $.caching = caching;
            return this;
        }

        public Builder caching(Boolean caching) {
            return caching(Output.of(caching));
        }

        public Builder contentCompressor(@Nullable Output<Boolean> contentCompressor) {
            $.contentCompressor = contentCompressor;
            return this;
        }

        public Builder contentCompressor(Boolean contentCompressor) {
            return contentCompressor(Output.of(contentCompressor));
        }

        public Builder dynamicWebContent(@Nullable Output<Boolean> dynamicWebContent) {
            $.dynamicWebContent = dynamicWebContent;
            return this;
        }

        public Builder dynamicWebContent(Boolean dynamicWebContent) {
            return dynamicWebContent(Output.of(dynamicWebContent));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder geoLocation(@Nullable Output<Boolean> geoLocation) {
            $.geoLocation = geoLocation;
            return this;
        }

        public Builder geoLocation(Boolean geoLocation) {
            return geoLocation(Output.of(geoLocation));
        }

        public Builder ip(@Nullable Output<Boolean> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(Boolean ip) {
            return ip(Output.of(ip));
        }

        public Builder largeFileDelivery(@Nullable Output<Boolean> largeFileDelivery) {
            $.largeFileDelivery = largeFileDelivery;
            return this;
        }

        public Builder largeFileDelivery(Boolean largeFileDelivery) {
            return largeFileDelivery(Output.of(largeFileDelivery));
        }

        public Builder liveVideoDelivery(@Nullable Output<Boolean> liveVideoDelivery) {
            $.liveVideoDelivery = liveVideoDelivery;
            return this;
        }

        public Builder liveVideoDelivery(Boolean liveVideoDelivery) {
            return liveVideoDelivery(Output.of(liveVideoDelivery));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder modifyPath(@Nullable Output<Boolean> modifyPath) {
            $.modifyPath = modifyPath;
            return this;
        }

        public Builder modifyPath(Boolean modifyPath) {
            return modifyPath(Output.of(modifyPath));
        }

        public Builder onDemandVideoDelivery(@Nullable Output<Boolean> onDemandVideoDelivery) {
            $.onDemandVideoDelivery = onDemandVideoDelivery;
            return this;
        }

        public Builder onDemandVideoDelivery(Boolean onDemandVideoDelivery) {
            return onDemandVideoDelivery(Output.of(onDemandVideoDelivery));
        }

        public Builder origin(@Nullable Output<Boolean> origin) {
            $.origin = origin;
            return this;
        }

        public Builder origin(Boolean origin) {
            return origin(Output.of(origin));
        }

        public Builder partnerDomainSuffix(@Nullable Output<String> partnerDomainSuffix) {
            $.partnerDomainSuffix = partnerDomainSuffix;
            return this;
        }

        public Builder partnerDomainSuffix(String partnerDomainSuffix) {
            return partnerDomainSuffix(Output.of(partnerDomainSuffix));
        }

        public Builder referrer(@Nullable Output<Boolean> referrer) {
            $.referrer = referrer;
            return this;
        }

        public Builder referrer(Boolean referrer) {
            return referrer(Output.of(referrer));
        }

        public Builder refreshContent(@Nullable Output<Boolean> refreshContent) {
            $.refreshContent = refreshContent;
            return this;
        }

        public Builder refreshContent(Boolean refreshContent) {
            return refreshContent(Output.of(refreshContent));
        }

        public Builder siteFailover(@Nullable Output<Boolean> siteFailover) {
            $.siteFailover = siteFailover;
            return this;
        }

        public Builder siteFailover(Boolean siteFailover) {
            return siteFailover(Output.of(siteFailover));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder tokenAuthorization(@Nullable Output<Boolean> tokenAuthorization) {
            $.tokenAuthorization = tokenAuthorization;
            return this;
        }

        public Builder tokenAuthorization(Boolean tokenAuthorization) {
            return tokenAuthorization(Output.of(tokenAuthorization));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public Builder webApplicationFirewall(@Nullable Output<Boolean> webApplicationFirewall) {
            $.webApplicationFirewall = webApplicationFirewall;
            return this;
        }

        public Builder webApplicationFirewall(Boolean webApplicationFirewall) {
            return webApplicationFirewall(Output.of(webApplicationFirewall));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerArgs build() {
            return $;
        }
    }

}
