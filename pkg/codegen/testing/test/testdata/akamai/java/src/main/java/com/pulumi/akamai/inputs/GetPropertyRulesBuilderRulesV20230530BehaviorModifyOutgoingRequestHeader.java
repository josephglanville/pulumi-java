// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader();

    @Import(name="action")
    private @Nullable String action;

    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="avoidDuplicateHeaders")
    private @Nullable Boolean avoidDuplicateHeaders;

    public Optional<Boolean> avoidDuplicateHeaders() {
        return Optional.ofNullable(this.avoidDuplicateHeaders);
    }

    @Import(name="customHeaderName")
    private @Nullable String customHeaderName;

    public Optional<String> customHeaderName() {
        return Optional.ofNullable(this.customHeaderName);
    }

    @Import(name="headerValue")
    private @Nullable String headerValue;

    public Optional<String> headerValue() {
        return Optional.ofNullable(this.headerValue);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchMultiple")
    private @Nullable Boolean matchMultiple;

    public Optional<Boolean> matchMultiple() {
        return Optional.ofNullable(this.matchMultiple);
    }

    @Import(name="newHeaderValue")
    private @Nullable String newHeaderValue;

    public Optional<String> newHeaderValue() {
        return Optional.ofNullable(this.newHeaderValue);
    }

    @Import(name="regexHeaderMatch")
    private @Nullable String regexHeaderMatch;

    public Optional<String> regexHeaderMatch() {
        return Optional.ofNullable(this.regexHeaderMatch);
    }

    @Import(name="regexHeaderReplace")
    private @Nullable String regexHeaderReplace;

    public Optional<String> regexHeaderReplace() {
        return Optional.ofNullable(this.regexHeaderReplace);
    }

    @Import(name="standardAddHeaderName")
    private @Nullable String standardAddHeaderName;

    public Optional<String> standardAddHeaderName() {
        return Optional.ofNullable(this.standardAddHeaderName);
    }

    @Import(name="standardDeleteHeaderName")
    private @Nullable String standardDeleteHeaderName;

    public Optional<String> standardDeleteHeaderName() {
        return Optional.ofNullable(this.standardDeleteHeaderName);
    }

    @Import(name="standardModifyHeaderName")
    private @Nullable String standardModifyHeaderName;

    public Optional<String> standardModifyHeaderName() {
        return Optional.ofNullable(this.standardModifyHeaderName);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader(GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader $) {
        this.action = $.action;
        this.avoidDuplicateHeaders = $.avoidDuplicateHeaders;
        this.customHeaderName = $.customHeaderName;
        this.headerValue = $.headerValue;
        this.locked = $.locked;
        this.matchMultiple = $.matchMultiple;
        this.newHeaderValue = $.newHeaderValue;
        this.regexHeaderMatch = $.regexHeaderMatch;
        this.regexHeaderReplace = $.regexHeaderReplace;
        this.standardAddHeaderName = $.standardAddHeaderName;
        this.standardDeleteHeaderName = $.standardDeleteHeaderName;
        this.standardModifyHeaderName = $.standardModifyHeaderName;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable String action) {
            $.action = action;
            return this;
        }

        public Builder avoidDuplicateHeaders(@Nullable Boolean avoidDuplicateHeaders) {
            $.avoidDuplicateHeaders = avoidDuplicateHeaders;
            return this;
        }

        public Builder customHeaderName(@Nullable String customHeaderName) {
            $.customHeaderName = customHeaderName;
            return this;
        }

        public Builder headerValue(@Nullable String headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder matchMultiple(@Nullable Boolean matchMultiple) {
            $.matchMultiple = matchMultiple;
            return this;
        }

        public Builder newHeaderValue(@Nullable String newHeaderValue) {
            $.newHeaderValue = newHeaderValue;
            return this;
        }

        public Builder regexHeaderMatch(@Nullable String regexHeaderMatch) {
            $.regexHeaderMatch = regexHeaderMatch;
            return this;
        }

        public Builder regexHeaderReplace(@Nullable String regexHeaderReplace) {
            $.regexHeaderReplace = regexHeaderReplace;
            return this;
        }

        public Builder standardAddHeaderName(@Nullable String standardAddHeaderName) {
            $.standardAddHeaderName = standardAddHeaderName;
            return this;
        }

        public Builder standardDeleteHeaderName(@Nullable String standardDeleteHeaderName) {
            $.standardDeleteHeaderName = standardDeleteHeaderName;
            return this;
        }

        public Builder standardModifyHeaderName(@Nullable String standardModifyHeaderName) {
            $.standardModifyHeaderName = standardModifyHeaderName;
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeader build() {
            return $;
        }
    }

}
