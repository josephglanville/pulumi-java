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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs();

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="substringEnd")
    private @Nullable Output<String> substringEnd;

    public Optional<Output<String>> substringEnd() {
        return Optional.ofNullable(this.substringEnd);
    }

    @Import(name="substringStart")
    private @Nullable Output<String> substringStart;

    public Optional<Output<String>> substringStart() {
        return Optional.ofNullable(this.substringStart);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs(GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs $) {
        this.locked = $.locked;
        this.substringEnd = $.substringEnd;
        this.substringStart = $.substringStart;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder substringEnd(@Nullable Output<String> substringEnd) {
            $.substringEnd = substringEnd;
            return this;
        }

        public Builder substringEnd(String substringEnd) {
            return substringEnd(Output.of(substringEnd));
        }

        public Builder substringStart(@Nullable Output<String> substringStart) {
            $.substringStart = substringStart;
            return this;
        }

        public Builder substringStart(String substringStart) {
            return substringStart(Output.of(substringStart));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformationArgs build() {
            return $;
        }
    }

}
