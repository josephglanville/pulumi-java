// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs();

    @Import(name="destinationHostname")
    private @Nullable Output<String> destinationHostname;

    public Optional<Output<String>> destinationHostname() {
        return Optional.ofNullable(this.destinationHostname);
    }

    @Import(name="destinationHostnameOther")
    private @Nullable Output<String> destinationHostnameOther;

    public Optional<Output<String>> destinationHostnameOther() {
        return Optional.ofNullable(this.destinationHostnameOther);
    }

    @Import(name="destinationHostnameSibling")
    private @Nullable Output<String> destinationHostnameSibling;

    public Optional<Output<String>> destinationHostnameSibling() {
        return Optional.ofNullable(this.destinationHostnameSibling);
    }

    @Import(name="destinationHostnameSubdomain")
    private @Nullable Output<String> destinationHostnameSubdomain;

    public Optional<Output<String>> destinationHostnameSubdomain() {
        return Optional.ofNullable(this.destinationHostnameSubdomain);
    }

    @Import(name="destinationPath")
    private @Nullable Output<String> destinationPath;

    public Optional<Output<String>> destinationPath() {
        return Optional.ofNullable(this.destinationPath);
    }

    @Import(name="destinationPathOther")
    private @Nullable Output<String> destinationPathOther;

    public Optional<Output<String>> destinationPathOther() {
        return Optional.ofNullable(this.destinationPathOther);
    }

    @Import(name="destinationPathPrefix")
    private @Nullable Output<String> destinationPathPrefix;

    public Optional<Output<String>> destinationPathPrefix() {
        return Optional.ofNullable(this.destinationPathPrefix);
    }

    @Import(name="destinationPathSuffix")
    private @Nullable Output<String> destinationPathSuffix;

    public Optional<Output<String>> destinationPathSuffix() {
        return Optional.ofNullable(this.destinationPathSuffix);
    }

    @Import(name="destinationPathSuffixStatus")
    private @Nullable Output<String> destinationPathSuffixStatus;

    public Optional<Output<String>> destinationPathSuffixStatus() {
        return Optional.ofNullable(this.destinationPathSuffixStatus);
    }

    @Import(name="destinationProtocol")
    private @Nullable Output<String> destinationProtocol;

    public Optional<Output<String>> destinationProtocol() {
        return Optional.ofNullable(this.destinationProtocol);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="mobileDefaultChoice")
    private @Nullable Output<String> mobileDefaultChoice;

    public Optional<Output<String>> mobileDefaultChoice() {
        return Optional.ofNullable(this.mobileDefaultChoice);
    }

    @Import(name="queryString")
    private @Nullable Output<String> queryString;

    public Optional<Output<String>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    @Import(name="responseCode")
    private @Nullable Output<Integer> responseCode;

    public Optional<Output<Integer>> responseCode() {
        return Optional.ofNullable(this.responseCode);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs(GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs $) {
        this.destinationHostname = $.destinationHostname;
        this.destinationHostnameOther = $.destinationHostnameOther;
        this.destinationHostnameSibling = $.destinationHostnameSibling;
        this.destinationHostnameSubdomain = $.destinationHostnameSubdomain;
        this.destinationPath = $.destinationPath;
        this.destinationPathOther = $.destinationPathOther;
        this.destinationPathPrefix = $.destinationPathPrefix;
        this.destinationPathSuffix = $.destinationPathSuffix;
        this.destinationPathSuffixStatus = $.destinationPathSuffixStatus;
        this.destinationProtocol = $.destinationProtocol;
        this.locked = $.locked;
        this.mobileDefaultChoice = $.mobileDefaultChoice;
        this.queryString = $.queryString;
        this.responseCode = $.responseCode;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationHostname(@Nullable Output<String> destinationHostname) {
            $.destinationHostname = destinationHostname;
            return this;
        }

        public Builder destinationHostname(String destinationHostname) {
            return destinationHostname(Output.of(destinationHostname));
        }

        public Builder destinationHostnameOther(@Nullable Output<String> destinationHostnameOther) {
            $.destinationHostnameOther = destinationHostnameOther;
            return this;
        }

        public Builder destinationHostnameOther(String destinationHostnameOther) {
            return destinationHostnameOther(Output.of(destinationHostnameOther));
        }

        public Builder destinationHostnameSibling(@Nullable Output<String> destinationHostnameSibling) {
            $.destinationHostnameSibling = destinationHostnameSibling;
            return this;
        }

        public Builder destinationHostnameSibling(String destinationHostnameSibling) {
            return destinationHostnameSibling(Output.of(destinationHostnameSibling));
        }

        public Builder destinationHostnameSubdomain(@Nullable Output<String> destinationHostnameSubdomain) {
            $.destinationHostnameSubdomain = destinationHostnameSubdomain;
            return this;
        }

        public Builder destinationHostnameSubdomain(String destinationHostnameSubdomain) {
            return destinationHostnameSubdomain(Output.of(destinationHostnameSubdomain));
        }

        public Builder destinationPath(@Nullable Output<String> destinationPath) {
            $.destinationPath = destinationPath;
            return this;
        }

        public Builder destinationPath(String destinationPath) {
            return destinationPath(Output.of(destinationPath));
        }

        public Builder destinationPathOther(@Nullable Output<String> destinationPathOther) {
            $.destinationPathOther = destinationPathOther;
            return this;
        }

        public Builder destinationPathOther(String destinationPathOther) {
            return destinationPathOther(Output.of(destinationPathOther));
        }

        public Builder destinationPathPrefix(@Nullable Output<String> destinationPathPrefix) {
            $.destinationPathPrefix = destinationPathPrefix;
            return this;
        }

        public Builder destinationPathPrefix(String destinationPathPrefix) {
            return destinationPathPrefix(Output.of(destinationPathPrefix));
        }

        public Builder destinationPathSuffix(@Nullable Output<String> destinationPathSuffix) {
            $.destinationPathSuffix = destinationPathSuffix;
            return this;
        }

        public Builder destinationPathSuffix(String destinationPathSuffix) {
            return destinationPathSuffix(Output.of(destinationPathSuffix));
        }

        public Builder destinationPathSuffixStatus(@Nullable Output<String> destinationPathSuffixStatus) {
            $.destinationPathSuffixStatus = destinationPathSuffixStatus;
            return this;
        }

        public Builder destinationPathSuffixStatus(String destinationPathSuffixStatus) {
            return destinationPathSuffixStatus(Output.of(destinationPathSuffixStatus));
        }

        public Builder destinationProtocol(@Nullable Output<String> destinationProtocol) {
            $.destinationProtocol = destinationProtocol;
            return this;
        }

        public Builder destinationProtocol(String destinationProtocol) {
            return destinationProtocol(Output.of(destinationProtocol));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder mobileDefaultChoice(@Nullable Output<String> mobileDefaultChoice) {
            $.mobileDefaultChoice = mobileDefaultChoice;
            return this;
        }

        public Builder mobileDefaultChoice(String mobileDefaultChoice) {
            return mobileDefaultChoice(Output.of(mobileDefaultChoice));
        }

        public Builder queryString(@Nullable Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder responseCode(@Nullable Output<Integer> responseCode) {
            $.responseCode = responseCode;
            return this;
        }

        public Builder responseCode(Integer responseCode) {
            return responseCode(Output.of(responseCode));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorRedirectArgs build() {
            return $;
        }
    }

}
