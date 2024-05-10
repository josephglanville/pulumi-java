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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs();

    @Import(name="customStatusCode")
    private @Nullable Output<String> customStatusCode;

    public Optional<Output<String>> customStatusCode() {
        return Optional.ofNullable(this.customStatusCode);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="recoveryMethod")
    private @Nullable Output<String> recoveryMethod;

    public Optional<Output<String>> recoveryMethod() {
        return Optional.ofNullable(this.recoveryMethod);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs(GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs $) {
        this.customStatusCode = $.customStatusCode;
        this.locked = $.locked;
        this.recoveryMethod = $.recoveryMethod;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs(Objects.requireNonNull(defaults));
        }

        public Builder customStatusCode(@Nullable Output<String> customStatusCode) {
            $.customStatusCode = customStatusCode;
            return this;
        }

        public Builder customStatusCode(String customStatusCode) {
            return customStatusCode(Output.of(customStatusCode));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder recoveryMethod(@Nullable Output<String> recoveryMethod) {
            $.recoveryMethod = recoveryMethod;
            return this;
        }

        public Builder recoveryMethod(String recoveryMethod) {
            return recoveryMethod(Output.of(recoveryMethod));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryMethodArgs build() {
            return $;
        }
    }

}
