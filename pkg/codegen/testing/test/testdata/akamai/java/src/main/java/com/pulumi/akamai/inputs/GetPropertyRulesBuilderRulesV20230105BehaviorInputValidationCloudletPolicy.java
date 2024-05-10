// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy();

    @Import(name="id")
    private @Nullable Integer id;

    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy(GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy build() {
            return $;
        }
    }

}
