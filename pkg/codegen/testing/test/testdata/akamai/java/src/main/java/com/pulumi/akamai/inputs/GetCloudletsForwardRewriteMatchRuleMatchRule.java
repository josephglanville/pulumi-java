// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettings;
import com.pulumi.akamai.inputs.GetCloudletsForwardRewriteMatchRuleMatchRuleMatch;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsForwardRewriteMatchRuleMatchRule extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsForwardRewriteMatchRuleMatchRule Empty = new GetCloudletsForwardRewriteMatchRuleMatchRule();

    @Import(name="disabled")
    private @Nullable Boolean disabled;

    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    @Import(name="end")
    private @Nullable Integer end;

    public Optional<Integer> end() {
        return Optional.ofNullable(this.end);
    }

    @Import(name="forwardSettings", required=true)
    private GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettings forwardSettings;

    public GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettings forwardSettings() {
        return this.forwardSettings;
    }

    @Import(name="matchUrl")
    private @Nullable String matchUrl;

    public Optional<String> matchUrl() {
        return Optional.ofNullable(this.matchUrl);
    }

    @Import(name="matches")
    private @Nullable List<GetCloudletsForwardRewriteMatchRuleMatchRuleMatch> matches;

    public Optional<List<GetCloudletsForwardRewriteMatchRuleMatchRuleMatch>> matches() {
        return Optional.ofNullable(this.matches);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="start")
    private @Nullable Integer start;

    public Optional<Integer> start() {
        return Optional.ofNullable(this.start);
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private GetCloudletsForwardRewriteMatchRuleMatchRule() {}

    private GetCloudletsForwardRewriteMatchRuleMatchRule(GetCloudletsForwardRewriteMatchRuleMatchRule $) {
        this.disabled = $.disabled;
        this.end = $.end;
        this.forwardSettings = $.forwardSettings;
        this.matchUrl = $.matchUrl;
        this.matches = $.matches;
        this.name = $.name;
        this.start = $.start;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsForwardRewriteMatchRuleMatchRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsForwardRewriteMatchRuleMatchRule $;

        public Builder() {
            $ = new GetCloudletsForwardRewriteMatchRuleMatchRule();
        }

        public Builder(GetCloudletsForwardRewriteMatchRuleMatchRule defaults) {
            $ = new GetCloudletsForwardRewriteMatchRuleMatchRule(Objects.requireNonNull(defaults));
        }

        public Builder disabled(@Nullable Boolean disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder end(@Nullable Integer end) {
            $.end = end;
            return this;
        }

        public Builder forwardSettings(GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettings forwardSettings) {
            $.forwardSettings = forwardSettings;
            return this;
        }

        public Builder matchUrl(@Nullable String matchUrl) {
            $.matchUrl = matchUrl;
            return this;
        }

        public Builder matches(@Nullable List<GetCloudletsForwardRewriteMatchRuleMatchRuleMatch> matches) {
            $.matches = matches;
            return this;
        }

        public Builder matches(GetCloudletsForwardRewriteMatchRuleMatchRuleMatch... matches) {
            return matches(List.of(matches));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder start(@Nullable Integer start) {
            $.start = start;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetCloudletsForwardRewriteMatchRuleMatchRule build() {
            if ($.forwardSettings == null) {
                throw new MissingRequiredPropertyException("GetCloudletsForwardRewriteMatchRuleMatchRule", "forwardSettings");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetCloudletsForwardRewriteMatchRuleMatchRule", "type");
            }
            return $;
        }
    }

}
