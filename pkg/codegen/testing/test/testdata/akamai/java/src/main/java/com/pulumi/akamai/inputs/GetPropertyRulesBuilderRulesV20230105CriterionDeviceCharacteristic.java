// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic Empty = new GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic();

    @Import(name="booleanValue")
    private @Nullable Boolean booleanValue;

    public Optional<Boolean> booleanValue() {
        return Optional.ofNullable(this.booleanValue);
    }

    @Import(name="characteristic")
    private @Nullable String characteristic;

    public Optional<String> characteristic() {
        return Optional.ofNullable(this.characteristic);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchCaseSensitive")
    private @Nullable Boolean matchCaseSensitive;

    public Optional<Boolean> matchCaseSensitive() {
        return Optional.ofNullable(this.matchCaseSensitive);
    }

    @Import(name="matchWildcard")
    private @Nullable Boolean matchWildcard;

    public Optional<Boolean> matchWildcard() {
        return Optional.ofNullable(this.matchWildcard);
    }

    @Import(name="numericMatchOperator")
    private @Nullable String numericMatchOperator;

    public Optional<String> numericMatchOperator() {
        return Optional.ofNullable(this.numericMatchOperator);
    }

    @Import(name="numericValue")
    private @Nullable Integer numericValue;

    public Optional<Integer> numericValue() {
        return Optional.ofNullable(this.numericValue);
    }

    @Import(name="stringMatchOperator")
    private @Nullable String stringMatchOperator;

    public Optional<String> stringMatchOperator() {
        return Optional.ofNullable(this.stringMatchOperator);
    }

    @Import(name="stringValues")
    private @Nullable List<String> stringValues;

    public Optional<List<String>> stringValues() {
        return Optional.ofNullable(this.stringValues);
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

    @Import(name="versionMatchOperator")
    private @Nullable String versionMatchOperator;

    public Optional<String> versionMatchOperator() {
        return Optional.ofNullable(this.versionMatchOperator);
    }

    @Import(name="versionValue")
    private @Nullable String versionValue;

    public Optional<String> versionValue() {
        return Optional.ofNullable(this.versionValue);
    }

    private GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic(GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic $) {
        this.booleanValue = $.booleanValue;
        this.characteristic = $.characteristic;
        this.locked = $.locked;
        this.matchCaseSensitive = $.matchCaseSensitive;
        this.matchWildcard = $.matchWildcard;
        this.numericMatchOperator = $.numericMatchOperator;
        this.numericValue = $.numericValue;
        this.stringMatchOperator = $.stringMatchOperator;
        this.stringValues = $.stringValues;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.versionMatchOperator = $.versionMatchOperator;
        this.versionValue = $.versionValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic(Objects.requireNonNull(defaults));
        }

        public Builder booleanValue(@Nullable Boolean booleanValue) {
            $.booleanValue = booleanValue;
            return this;
        }

        public Builder characteristic(@Nullable String characteristic) {
            $.characteristic = characteristic;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder matchCaseSensitive(@Nullable Boolean matchCaseSensitive) {
            $.matchCaseSensitive = matchCaseSensitive;
            return this;
        }

        public Builder matchWildcard(@Nullable Boolean matchWildcard) {
            $.matchWildcard = matchWildcard;
            return this;
        }

        public Builder numericMatchOperator(@Nullable String numericMatchOperator) {
            $.numericMatchOperator = numericMatchOperator;
            return this;
        }

        public Builder numericValue(@Nullable Integer numericValue) {
            $.numericValue = numericValue;
            return this;
        }

        public Builder stringMatchOperator(@Nullable String stringMatchOperator) {
            $.stringMatchOperator = stringMatchOperator;
            return this;
        }

        public Builder stringValues(@Nullable List<String> stringValues) {
            $.stringValues = stringValues;
            return this;
        }

        public Builder stringValues(String... stringValues) {
            return stringValues(List.of(stringValues));
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder versionMatchOperator(@Nullable String versionMatchOperator) {
            $.versionMatchOperator = versionMatchOperator;
            return this;
        }

        public Builder versionValue(@Nullable String versionValue) {
            $.versionValue = versionValue;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105CriterionDeviceCharacteristic build() {
            return $;
        }
    }

}
