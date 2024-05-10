// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105Args;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderArgs Empty = new GetPropertyRulesBuilderArgs();

    @Import(name="rulesV20230105")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230105Args> rulesV20230105;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230105Args>> rulesV20230105() {
        return Optional.ofNullable(this.rulesV20230105);
    }

    @Import(name="rulesV20230530")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230530Args> rulesV20230530;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230530Args>> rulesV20230530() {
        return Optional.ofNullable(this.rulesV20230530);
    }

    private GetPropertyRulesBuilderArgs() {}

    private GetPropertyRulesBuilderArgs(GetPropertyRulesBuilderArgs $) {
        this.rulesV20230105 = $.rulesV20230105;
        this.rulesV20230530 = $.rulesV20230530;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderArgs();
        }

        public Builder(GetPropertyRulesBuilderArgs defaults) {
            $ = new GetPropertyRulesBuilderArgs(Objects.requireNonNull(defaults));
        }

        public Builder rulesV20230105(@Nullable Output<GetPropertyRulesBuilderRulesV20230105Args> rulesV20230105) {
            $.rulesV20230105 = rulesV20230105;
            return this;
        }

        public Builder rulesV20230105(GetPropertyRulesBuilderRulesV20230105Args rulesV20230105) {
            return rulesV20230105(Output.of(rulesV20230105));
        }

        public Builder rulesV20230530(@Nullable Output<GetPropertyRulesBuilderRulesV20230530Args> rulesV20230530) {
            $.rulesV20230530 = rulesV20230530;
            return this;
        }

        public Builder rulesV20230530(GetPropertyRulesBuilderRulesV20230530Args rulesV20230530) {
            return rulesV20230530(Output.of(rulesV20230530));
        }

        public GetPropertyRulesBuilderArgs build() {
            return $;
        }
    }

}
