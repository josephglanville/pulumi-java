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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs();

    @Import(name="behavior")
    private @Nullable Output<String> behavior;

    public Optional<Output<String>> behavior() {
        return Optional.ofNullable(this.behavior);
    }

    @Import(name="keepQueryString")
    private @Nullable Output<Boolean> keepQueryString;

    public Optional<Output<Boolean>> keepQueryString() {
        return Optional.ofNullable(this.keepQueryString);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="matchMultiple")
    private @Nullable Output<Boolean> matchMultiple;

    public Optional<Output<Boolean>> matchMultiple() {
        return Optional.ofNullable(this.matchMultiple);
    }

    @Import(name="matchRegex")
    private @Nullable Output<String> matchRegex;

    public Optional<Output<String>> matchRegex() {
        return Optional.ofNullable(this.matchRegex);
    }

    @Import(name="targetPath")
    private @Nullable Output<String> targetPath;

    public Optional<Output<String>> targetPath() {
        return Optional.ofNullable(this.targetPath);
    }

    @Import(name="targetPathPrepend")
    private @Nullable Output<String> targetPathPrepend;

    public Optional<Output<String>> targetPathPrepend() {
        return Optional.ofNullable(this.targetPathPrepend);
    }

    @Import(name="targetRegex")
    private @Nullable Output<String> targetRegex;

    public Optional<Output<String>> targetRegex() {
        return Optional.ofNullable(this.targetRegex);
    }

    @Import(name="targetUrl")
    private @Nullable Output<String> targetUrl;

    public Optional<Output<String>> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs(GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs $) {
        this.behavior = $.behavior;
        this.keepQueryString = $.keepQueryString;
        this.locked = $.locked;
        this.match = $.match;
        this.matchMultiple = $.matchMultiple;
        this.matchRegex = $.matchRegex;
        this.targetPath = $.targetPath;
        this.targetPathPrepend = $.targetPathPrepend;
        this.targetRegex = $.targetRegex;
        this.targetUrl = $.targetUrl;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs(Objects.requireNonNull(defaults));
        }

        public Builder behavior(@Nullable Output<String> behavior) {
            $.behavior = behavior;
            return this;
        }

        public Builder behavior(String behavior) {
            return behavior(Output.of(behavior));
        }

        public Builder keepQueryString(@Nullable Output<Boolean> keepQueryString) {
            $.keepQueryString = keepQueryString;
            return this;
        }

        public Builder keepQueryString(Boolean keepQueryString) {
            return keepQueryString(Output.of(keepQueryString));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        public Builder matchMultiple(@Nullable Output<Boolean> matchMultiple) {
            $.matchMultiple = matchMultiple;
            return this;
        }

        public Builder matchMultiple(Boolean matchMultiple) {
            return matchMultiple(Output.of(matchMultiple));
        }

        public Builder matchRegex(@Nullable Output<String> matchRegex) {
            $.matchRegex = matchRegex;
            return this;
        }

        public Builder matchRegex(String matchRegex) {
            return matchRegex(Output.of(matchRegex));
        }

        public Builder targetPath(@Nullable Output<String> targetPath) {
            $.targetPath = targetPath;
            return this;
        }

        public Builder targetPath(String targetPath) {
            return targetPath(Output.of(targetPath));
        }

        public Builder targetPathPrepend(@Nullable Output<String> targetPathPrepend) {
            $.targetPathPrepend = targetPathPrepend;
            return this;
        }

        public Builder targetPathPrepend(String targetPathPrepend) {
            return targetPathPrepend(Output.of(targetPathPrepend));
        }

        public Builder targetRegex(@Nullable Output<String> targetRegex) {
            $.targetRegex = targetRegex;
            return this;
        }

        public Builder targetRegex(String targetRegex) {
            return targetRegex(Output.of(targetRegex));
        }

        public Builder targetUrl(@Nullable Output<String> targetUrl) {
            $.targetUrl = targetUrl;
            return this;
        }

        public Builder targetUrl(String targetUrl) {
            return targetUrl(Output.of(targetUrl));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrlArgs build() {
            return $;
        }
    }

}
