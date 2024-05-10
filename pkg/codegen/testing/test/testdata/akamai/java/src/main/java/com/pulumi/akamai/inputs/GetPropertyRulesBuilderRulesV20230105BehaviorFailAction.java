// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorFailActionCpCode;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostname;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorFailAction extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorFailAction Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorFailAction();

    @Import(name="actionType")
    private @Nullable String actionType;

    public Optional<String> actionType() {
        return Optional.ofNullable(this.actionType);
    }

    @Import(name="allowFcmParentOverride")
    private @Nullable Boolean allowFcmParentOverride;

    public Optional<Boolean> allowFcmParentOverride() {
        return Optional.ofNullable(this.allowFcmParentOverride);
    }

    @Import(name="cexCustomPath")
    private @Nullable Boolean cexCustomPath;

    public Optional<Boolean> cexCustomPath() {
        return Optional.ofNullable(this.cexCustomPath);
    }

    @Import(name="cexHostname")
    private @Nullable String cexHostname;

    public Optional<String> cexHostname() {
        return Optional.ofNullable(this.cexHostname);
    }

    @Import(name="cexPath")
    private @Nullable String cexPath;

    public Optional<String> cexPath() {
        return Optional.ofNullable(this.cexPath);
    }

    @Import(name="contentCustomPath")
    private @Nullable Boolean contentCustomPath;

    public Optional<Boolean> contentCustomPath() {
        return Optional.ofNullable(this.contentCustomPath);
    }

    @Import(name="contentHostname")
    private @Nullable String contentHostname;

    public Optional<String> contentHostname() {
        return Optional.ofNullable(this.contentHostname);
    }

    @Import(name="contentPath")
    private @Nullable String contentPath;

    public Optional<String> contentPath() {
        return Optional.ofNullable(this.contentPath);
    }

    @Import(name="cpCode")
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorFailActionCpCode cpCode;

    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorFailActionCpCode> cpCode() {
        return Optional.ofNullable(this.cpCode);
    }

    @Import(name="dynamicCustomPath")
    private @Nullable Boolean dynamicCustomPath;

    public Optional<Boolean> dynamicCustomPath() {
        return Optional.ofNullable(this.dynamicCustomPath);
    }

    @Import(name="dynamicMethod")
    private @Nullable String dynamicMethod;

    public Optional<String> dynamicMethod() {
        return Optional.ofNullable(this.dynamicMethod);
    }

    @Import(name="dynamicPath")
    private @Nullable String dynamicPath;

    public Optional<String> dynamicPath() {
        return Optional.ofNullable(this.dynamicPath);
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

    @Import(name="modifyProtocol")
    private @Nullable Boolean modifyProtocol;

    public Optional<Boolean> modifyProtocol() {
        return Optional.ofNullable(this.modifyProtocol);
    }

    @Import(name="netStorageHostname")
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostname netStorageHostname;

    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostname> netStorageHostname() {
        return Optional.ofNullable(this.netStorageHostname);
    }

    @Import(name="netStoragePath")
    private @Nullable String netStoragePath;

    public Optional<String> netStoragePath() {
        return Optional.ofNullable(this.netStoragePath);
    }

    @Import(name="preserveQueryString")
    private @Nullable Boolean preserveQueryString;

    public Optional<Boolean> preserveQueryString() {
        return Optional.ofNullable(this.preserveQueryString);
    }

    @Import(name="protocol")
    private @Nullable String protocol;

    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    @Import(name="redirectCustomPath")
    private @Nullable Boolean redirectCustomPath;

    public Optional<Boolean> redirectCustomPath() {
        return Optional.ofNullable(this.redirectCustomPath);
    }

    @Import(name="redirectHostname")
    private @Nullable String redirectHostname;

    public Optional<String> redirectHostname() {
        return Optional.ofNullable(this.redirectHostname);
    }

    @Import(name="redirectHostnameType")
    private @Nullable String redirectHostnameType;

    public Optional<String> redirectHostnameType() {
        return Optional.ofNullable(this.redirectHostnameType);
    }

    @Import(name="redirectMethod")
    private @Nullable Integer redirectMethod;

    public Optional<Integer> redirectMethod() {
        return Optional.ofNullable(this.redirectMethod);
    }

    @Import(name="redirectPath")
    private @Nullable String redirectPath;

    public Optional<String> redirectPath() {
        return Optional.ofNullable(this.redirectPath);
    }

    @Import(name="saasCnameEnabled")
    private @Nullable Boolean saasCnameEnabled;

    public Optional<Boolean> saasCnameEnabled() {
        return Optional.ofNullable(this.saasCnameEnabled);
    }

    @Import(name="saasCnameLevel")
    private @Nullable Integer saasCnameLevel;

    public Optional<Integer> saasCnameLevel() {
        return Optional.ofNullable(this.saasCnameLevel);
    }

    @Import(name="saasCookie")
    private @Nullable String saasCookie;

    public Optional<String> saasCookie() {
        return Optional.ofNullable(this.saasCookie);
    }

    @Import(name="saasQueryString")
    private @Nullable String saasQueryString;

    public Optional<String> saasQueryString() {
        return Optional.ofNullable(this.saasQueryString);
    }

    @Import(name="saasRegex")
    private @Nullable String saasRegex;

    public Optional<String> saasRegex() {
        return Optional.ofNullable(this.saasRegex);
    }

    @Import(name="saasReplace")
    private @Nullable String saasReplace;

    public Optional<String> saasReplace() {
        return Optional.ofNullable(this.saasReplace);
    }

    @Import(name="saasSuffix")
    private @Nullable String saasSuffix;

    public Optional<String> saasSuffix() {
        return Optional.ofNullable(this.saasSuffix);
    }

    @Import(name="saasType")
    private @Nullable String saasType;

    public Optional<String> saasType() {
        return Optional.ofNullable(this.saasType);
    }

    @Import(name="statusCode")
    private @Nullable Integer statusCode;

    public Optional<Integer> statusCode() {
        return Optional.ofNullable(this.statusCode);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorFailAction() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorFailAction(GetPropertyRulesBuilderRulesV20230105BehaviorFailAction $) {
        this.actionType = $.actionType;
        this.allowFcmParentOverride = $.allowFcmParentOverride;
        this.cexCustomPath = $.cexCustomPath;
        this.cexHostname = $.cexHostname;
        this.cexPath = $.cexPath;
        this.contentCustomPath = $.contentCustomPath;
        this.contentHostname = $.contentHostname;
        this.contentPath = $.contentPath;
        this.cpCode = $.cpCode;
        this.dynamicCustomPath = $.dynamicCustomPath;
        this.dynamicMethod = $.dynamicMethod;
        this.dynamicPath = $.dynamicPath;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.modifyProtocol = $.modifyProtocol;
        this.netStorageHostname = $.netStorageHostname;
        this.netStoragePath = $.netStoragePath;
        this.preserveQueryString = $.preserveQueryString;
        this.protocol = $.protocol;
        this.redirectCustomPath = $.redirectCustomPath;
        this.redirectHostname = $.redirectHostname;
        this.redirectHostnameType = $.redirectHostnameType;
        this.redirectMethod = $.redirectMethod;
        this.redirectPath = $.redirectPath;
        this.saasCnameEnabled = $.saasCnameEnabled;
        this.saasCnameLevel = $.saasCnameLevel;
        this.saasCookie = $.saasCookie;
        this.saasQueryString = $.saasQueryString;
        this.saasRegex = $.saasRegex;
        this.saasReplace = $.saasReplace;
        this.saasSuffix = $.saasSuffix;
        this.saasType = $.saasType;
        this.statusCode = $.statusCode;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorFailAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorFailAction $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorFailAction();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorFailAction defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorFailAction(Objects.requireNonNull(defaults));
        }

        public Builder actionType(@Nullable String actionType) {
            $.actionType = actionType;
            return this;
        }

        public Builder allowFcmParentOverride(@Nullable Boolean allowFcmParentOverride) {
            $.allowFcmParentOverride = allowFcmParentOverride;
            return this;
        }

        public Builder cexCustomPath(@Nullable Boolean cexCustomPath) {
            $.cexCustomPath = cexCustomPath;
            return this;
        }

        public Builder cexHostname(@Nullable String cexHostname) {
            $.cexHostname = cexHostname;
            return this;
        }

        public Builder cexPath(@Nullable String cexPath) {
            $.cexPath = cexPath;
            return this;
        }

        public Builder contentCustomPath(@Nullable Boolean contentCustomPath) {
            $.contentCustomPath = contentCustomPath;
            return this;
        }

        public Builder contentHostname(@Nullable String contentHostname) {
            $.contentHostname = contentHostname;
            return this;
        }

        public Builder contentPath(@Nullable String contentPath) {
            $.contentPath = contentPath;
            return this;
        }

        public Builder cpCode(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorFailActionCpCode cpCode) {
            $.cpCode = cpCode;
            return this;
        }

        public Builder dynamicCustomPath(@Nullable Boolean dynamicCustomPath) {
            $.dynamicCustomPath = dynamicCustomPath;
            return this;
        }

        public Builder dynamicMethod(@Nullable String dynamicMethod) {
            $.dynamicMethod = dynamicMethod;
            return this;
        }

        public Builder dynamicPath(@Nullable String dynamicPath) {
            $.dynamicPath = dynamicPath;
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

        public Builder modifyProtocol(@Nullable Boolean modifyProtocol) {
            $.modifyProtocol = modifyProtocol;
            return this;
        }

        public Builder netStorageHostname(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorFailActionNetStorageHostname netStorageHostname) {
            $.netStorageHostname = netStorageHostname;
            return this;
        }

        public Builder netStoragePath(@Nullable String netStoragePath) {
            $.netStoragePath = netStoragePath;
            return this;
        }

        public Builder preserveQueryString(@Nullable Boolean preserveQueryString) {
            $.preserveQueryString = preserveQueryString;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder redirectCustomPath(@Nullable Boolean redirectCustomPath) {
            $.redirectCustomPath = redirectCustomPath;
            return this;
        }

        public Builder redirectHostname(@Nullable String redirectHostname) {
            $.redirectHostname = redirectHostname;
            return this;
        }

        public Builder redirectHostnameType(@Nullable String redirectHostnameType) {
            $.redirectHostnameType = redirectHostnameType;
            return this;
        }

        public Builder redirectMethod(@Nullable Integer redirectMethod) {
            $.redirectMethod = redirectMethod;
            return this;
        }

        public Builder redirectPath(@Nullable String redirectPath) {
            $.redirectPath = redirectPath;
            return this;
        }

        public Builder saasCnameEnabled(@Nullable Boolean saasCnameEnabled) {
            $.saasCnameEnabled = saasCnameEnabled;
            return this;
        }

        public Builder saasCnameLevel(@Nullable Integer saasCnameLevel) {
            $.saasCnameLevel = saasCnameLevel;
            return this;
        }

        public Builder saasCookie(@Nullable String saasCookie) {
            $.saasCookie = saasCookie;
            return this;
        }

        public Builder saasQueryString(@Nullable String saasQueryString) {
            $.saasQueryString = saasQueryString;
            return this;
        }

        public Builder saasRegex(@Nullable String saasRegex) {
            $.saasRegex = saasRegex;
            return this;
        }

        public Builder saasReplace(@Nullable String saasReplace) {
            $.saasReplace = saasReplace;
            return this;
        }

        public Builder saasSuffix(@Nullable String saasSuffix) {
            $.saasSuffix = saasSuffix;
            return this;
        }

        public Builder saasType(@Nullable String saasType) {
            $.saasType = saasType;
            return this;
        }

        public Builder statusCode(@Nullable Integer statusCode) {
            $.statusCode = statusCode;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorFailAction build() {
            return $;
        }
    }

}
