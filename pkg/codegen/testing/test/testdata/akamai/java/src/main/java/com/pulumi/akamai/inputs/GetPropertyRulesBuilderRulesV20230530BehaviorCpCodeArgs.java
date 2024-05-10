// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs();

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

    @Import(name="value")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeValueArgs> value;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeValueArgs>> value() {
        return Optional.ofNullable(this.value);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs(GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs $) {
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs(Objects.requireNonNull(defaults));
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

        public Builder value(@Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeValueArgs> value) {
            $.value = value;
            return this;
        }

        public Builder value(GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeValueArgs value) {
            return value(Output.of(value));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeArgs build() {
            return $;
        }
    }

}
