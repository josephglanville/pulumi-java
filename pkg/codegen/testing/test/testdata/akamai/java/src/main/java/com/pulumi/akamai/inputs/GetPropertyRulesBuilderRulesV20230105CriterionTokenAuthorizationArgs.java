// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs Empty = new GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs();

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchOperator")
    private @Nullable Output<String> matchOperator;

    public Optional<Output<String>> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="statusLists")
    private @Nullable Output<List<String>> statusLists;

    public Optional<Output<List<String>>> statusLists() {
        return Optional.ofNullable(this.statusLists);
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

    private GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs(GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs $) {
        this.locked = $.locked;
        this.matchOperator = $.matchOperator;
        this.statusLists = $.statusLists;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder matchOperator(@Nullable Output<String> matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder matchOperator(String matchOperator) {
            return matchOperator(Output.of(matchOperator));
        }

        public Builder statusLists(@Nullable Output<List<String>> statusLists) {
            $.statusLists = statusLists;
            return this;
        }

        public Builder statusLists(List<String> statusLists) {
            return statusLists(Output.of(statusLists));
        }

        public Builder statusLists(String... statusLists) {
            return statusLists(List.of(statusLists));
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

        public GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorizationArgs build() {
            return $;
        }
    }

}
