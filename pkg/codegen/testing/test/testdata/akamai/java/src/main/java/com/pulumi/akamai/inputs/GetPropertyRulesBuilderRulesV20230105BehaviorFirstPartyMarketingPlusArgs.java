// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusCloudletPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs();

    @Import(name="cloudletPolicy")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusCloudletPolicyArgs> cloudletPolicy;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusCloudletPolicyArgs>> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="javaScriptInsertionRule")
    private @Nullable Output<String> javaScriptInsertionRule;

    public Optional<Output<String>> javaScriptInsertionRule() {
        return Optional.ofNullable(this.javaScriptInsertionRule);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="mediaMathPrefix")
    private @Nullable Output<String> mediaMathPrefix;

    public Optional<Output<String>> mediaMathPrefix() {
        return Optional.ofNullable(this.mediaMathPrefix);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs(GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs $) {
        this.cloudletPolicy = $.cloudletPolicy;
        this.enabled = $.enabled;
        this.javaScriptInsertionRule = $.javaScriptInsertionRule;
        this.locked = $.locked;
        this.mediaMathPrefix = $.mediaMathPrefix;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudletPolicy(@Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusCloudletPolicyArgs> cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder cloudletPolicy(GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusCloudletPolicyArgs cloudletPolicy) {
            return cloudletPolicy(Output.of(cloudletPolicy));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder javaScriptInsertionRule(@Nullable Output<String> javaScriptInsertionRule) {
            $.javaScriptInsertionRule = javaScriptInsertionRule;
            return this;
        }

        public Builder javaScriptInsertionRule(String javaScriptInsertionRule) {
            return javaScriptInsertionRule(Output.of(javaScriptInsertionRule));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder mediaMathPrefix(@Nullable Output<String> mediaMathPrefix) {
            $.mediaMathPrefix = mediaMathPrefix;
            return this;
        }

        public Builder mediaMathPrefix(String mediaMathPrefix) {
            return mediaMathPrefix(Output.of(mediaMathPrefix));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingPlusArgs build() {
            return $;
        }
    }

}
