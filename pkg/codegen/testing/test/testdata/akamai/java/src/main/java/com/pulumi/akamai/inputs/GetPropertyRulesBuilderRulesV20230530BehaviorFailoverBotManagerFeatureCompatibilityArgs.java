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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs();

    @Import(name="compatibility")
    private @Nullable Output<Boolean> compatibility;

    public Optional<Output<Boolean>> compatibility() {
        return Optional.ofNullable(this.compatibility);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs(GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs $) {
        this.compatibility = $.compatibility;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs(Objects.requireNonNull(defaults));
        }

        public Builder compatibility(@Nullable Output<Boolean> compatibility) {
            $.compatibility = compatibility;
            return this;
        }

        public Builder compatibility(Boolean compatibility) {
            return compatibility(Output.of(compatibility));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityArgs build() {
            return $;
        }
    }

}
