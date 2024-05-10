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


public final class GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs Empty = new GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs();

    @Import(name="bandwidthValues")
    private @Nullable Output<List<String>> bandwidthValues;

    public Optional<Output<List<String>>> bandwidthValues() {
        return Optional.ofNullable(this.bandwidthValues);
    }

    @Import(name="checkIps")
    private @Nullable Output<String> checkIps;

    public Optional<Output<String>> checkIps() {
        return Optional.ofNullable(this.checkIps);
    }

    @Import(name="field")
    private @Nullable Output<String> field;

    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

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

    @Import(name="networkTypeValues")
    private @Nullable Output<List<String>> networkTypeValues;

    public Optional<Output<List<String>>> networkTypeValues() {
        return Optional.ofNullable(this.networkTypeValues);
    }

    @Import(name="networkValues")
    private @Nullable Output<List<String>> networkValues;

    public Optional<Output<List<String>>> networkValues() {
        return Optional.ofNullable(this.networkValues);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="useOnlyFirstXForwardedForIp")
    private @Nullable Output<Boolean> useOnlyFirstXForwardedForIp;

    public Optional<Output<Boolean>> useOnlyFirstXForwardedForIp() {
        return Optional.ofNullable(this.useOnlyFirstXForwardedForIp);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs(GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs $) {
        this.bandwidthValues = $.bandwidthValues;
        this.checkIps = $.checkIps;
        this.field = $.field;
        this.locked = $.locked;
        this.matchOperator = $.matchOperator;
        this.networkTypeValues = $.networkTypeValues;
        this.networkValues = $.networkValues;
        this.templateUuid = $.templateUuid;
        this.useOnlyFirstXForwardedForIp = $.useOnlyFirstXForwardedForIp;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder bandwidthValues(@Nullable Output<List<String>> bandwidthValues) {
            $.bandwidthValues = bandwidthValues;
            return this;
        }

        public Builder bandwidthValues(List<String> bandwidthValues) {
            return bandwidthValues(Output.of(bandwidthValues));
        }

        public Builder bandwidthValues(String... bandwidthValues) {
            return bandwidthValues(List.of(bandwidthValues));
        }

        public Builder checkIps(@Nullable Output<String> checkIps) {
            $.checkIps = checkIps;
            return this;
        }

        public Builder checkIps(String checkIps) {
            return checkIps(Output.of(checkIps));
        }

        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        public Builder field(String field) {
            return field(Output.of(field));
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

        public Builder networkTypeValues(@Nullable Output<List<String>> networkTypeValues) {
            $.networkTypeValues = networkTypeValues;
            return this;
        }

        public Builder networkTypeValues(List<String> networkTypeValues) {
            return networkTypeValues(Output.of(networkTypeValues));
        }

        public Builder networkTypeValues(String... networkTypeValues) {
            return networkTypeValues(List.of(networkTypeValues));
        }

        public Builder networkValues(@Nullable Output<List<String>> networkValues) {
            $.networkValues = networkValues;
            return this;
        }

        public Builder networkValues(List<String> networkValues) {
            return networkValues(Output.of(networkValues));
        }

        public Builder networkValues(String... networkValues) {
            return networkValues(List.of(networkValues));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder useOnlyFirstXForwardedForIp(@Nullable Output<Boolean> useOnlyFirstXForwardedForIp) {
            $.useOnlyFirstXForwardedForIp = useOnlyFirstXForwardedForIp;
            return this;
        }

        public Builder useOnlyFirstXForwardedForIp(Boolean useOnlyFirstXForwardedForIp) {
            return useOnlyFirstXForwardedForIp(Output.of(useOnlyFirstXForwardedForIp));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230105CriterionUserNetworkArgs build() {
            return $;
        }
    }

}
