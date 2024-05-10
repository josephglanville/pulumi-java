// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlusCloudletPolicy;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus();

    @Import(name="cloudletPolicy")
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlusCloudletPolicy cloudletPolicy;

    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlusCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="javaScriptInsertionRule")
    private @Nullable String javaScriptInsertionRule;

    public Optional<String> javaScriptInsertionRule() {
        return Optional.ofNullable(this.javaScriptInsertionRule);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="mediaMathPrefix")
    private @Nullable String mediaMathPrefix;

    public Optional<String> mediaMathPrefix() {
        return Optional.ofNullable(this.mediaMathPrefix);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus(GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus $) {
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
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus(Objects.requireNonNull(defaults));
        }

        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlusCloudletPolicy cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder javaScriptInsertionRule(@Nullable String javaScriptInsertionRule) {
            $.javaScriptInsertionRule = javaScriptInsertionRule;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder mediaMathPrefix(@Nullable String mediaMathPrefix) {
            $.mediaMathPrefix = mediaMathPrefix;
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlus build() {
            return $;
        }
    }

}
