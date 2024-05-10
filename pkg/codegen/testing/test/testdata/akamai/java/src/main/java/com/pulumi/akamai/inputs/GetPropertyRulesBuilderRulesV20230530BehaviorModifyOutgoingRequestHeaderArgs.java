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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs();

    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="avoidDuplicateHeaders")
    private @Nullable Output<Boolean> avoidDuplicateHeaders;

    public Optional<Output<Boolean>> avoidDuplicateHeaders() {
        return Optional.ofNullable(this.avoidDuplicateHeaders);
    }

    @Import(name="customHeaderName")
    private @Nullable Output<String> customHeaderName;

    public Optional<Output<String>> customHeaderName() {
        return Optional.ofNullable(this.customHeaderName);
    }

    @Import(name="headerValue")
    private @Nullable Output<String> headerValue;

    public Optional<Output<String>> headerValue() {
        return Optional.ofNullable(this.headerValue);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchMultiple")
    private @Nullable Output<Boolean> matchMultiple;

    public Optional<Output<Boolean>> matchMultiple() {
        return Optional.ofNullable(this.matchMultiple);
    }

    @Import(name="newHeaderValue")
    private @Nullable Output<String> newHeaderValue;

    public Optional<Output<String>> newHeaderValue() {
        return Optional.ofNullable(this.newHeaderValue);
    }

    @Import(name="regexHeaderMatch")
    private @Nullable Output<String> regexHeaderMatch;

    public Optional<Output<String>> regexHeaderMatch() {
        return Optional.ofNullable(this.regexHeaderMatch);
    }

    @Import(name="regexHeaderReplace")
    private @Nullable Output<String> regexHeaderReplace;

    public Optional<Output<String>> regexHeaderReplace() {
        return Optional.ofNullable(this.regexHeaderReplace);
    }

    @Import(name="standardAddHeaderName")
    private @Nullable Output<String> standardAddHeaderName;

    public Optional<Output<String>> standardAddHeaderName() {
        return Optional.ofNullable(this.standardAddHeaderName);
    }

    @Import(name="standardDeleteHeaderName")
    private @Nullable Output<String> standardDeleteHeaderName;

    public Optional<Output<String>> standardDeleteHeaderName() {
        return Optional.ofNullable(this.standardDeleteHeaderName);
    }

    @Import(name="standardModifyHeaderName")
    private @Nullable Output<String> standardModifyHeaderName;

    public Optional<Output<String>> standardModifyHeaderName() {
        return Optional.ofNullable(this.standardModifyHeaderName);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs(GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs $) {
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
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder avoidDuplicateHeaders(@Nullable Output<Boolean> avoidDuplicateHeaders) {
            $.avoidDuplicateHeaders = avoidDuplicateHeaders;
            return this;
        }

        public Builder avoidDuplicateHeaders(Boolean avoidDuplicateHeaders) {
            return avoidDuplicateHeaders(Output.of(avoidDuplicateHeaders));
        }

        public Builder customHeaderName(@Nullable Output<String> customHeaderName) {
            $.customHeaderName = customHeaderName;
            return this;
        }

        public Builder customHeaderName(String customHeaderName) {
            return customHeaderName(Output.of(customHeaderName));
        }

        public Builder headerValue(@Nullable Output<String> headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        public Builder headerValue(String headerValue) {
            return headerValue(Output.of(headerValue));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder matchMultiple(@Nullable Output<Boolean> matchMultiple) {
            $.matchMultiple = matchMultiple;
            return this;
        }

        public Builder matchMultiple(Boolean matchMultiple) {
            return matchMultiple(Output.of(matchMultiple));
        }

        public Builder newHeaderValue(@Nullable Output<String> newHeaderValue) {
            $.newHeaderValue = newHeaderValue;
            return this;
        }

        public Builder newHeaderValue(String newHeaderValue) {
            return newHeaderValue(Output.of(newHeaderValue));
        }

        public Builder regexHeaderMatch(@Nullable Output<String> regexHeaderMatch) {
            $.regexHeaderMatch = regexHeaderMatch;
            return this;
        }

        public Builder regexHeaderMatch(String regexHeaderMatch) {
            return regexHeaderMatch(Output.of(regexHeaderMatch));
        }

        public Builder regexHeaderReplace(@Nullable Output<String> regexHeaderReplace) {
            $.regexHeaderReplace = regexHeaderReplace;
            return this;
        }

        public Builder regexHeaderReplace(String regexHeaderReplace) {
            return regexHeaderReplace(Output.of(regexHeaderReplace));
        }

        public Builder standardAddHeaderName(@Nullable Output<String> standardAddHeaderName) {
            $.standardAddHeaderName = standardAddHeaderName;
            return this;
        }

        public Builder standardAddHeaderName(String standardAddHeaderName) {
            return standardAddHeaderName(Output.of(standardAddHeaderName));
        }

        public Builder standardDeleteHeaderName(@Nullable Output<String> standardDeleteHeaderName) {
            $.standardDeleteHeaderName = standardDeleteHeaderName;
            return this;
        }

        public Builder standardDeleteHeaderName(String standardDeleteHeaderName) {
            return standardDeleteHeaderName(Output.of(standardDeleteHeaderName));
        }

        public Builder standardModifyHeaderName(@Nullable Output<String> standardModifyHeaderName) {
            $.standardModifyHeaderName = standardModifyHeaderName;
            return this;
        }

        public Builder standardModifyHeaderName(String standardModifyHeaderName) {
            return standardModifyHeaderName(Output.of(standardModifyHeaderName));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderArgs build() {
            return $;
        }
    }

}
