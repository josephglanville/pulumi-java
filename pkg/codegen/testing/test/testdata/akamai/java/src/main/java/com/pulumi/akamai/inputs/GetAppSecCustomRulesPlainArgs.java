// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecCustomRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecCustomRulesPlainArgs Empty = new GetAppSecCustomRulesPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="customRuleId")
    private @Nullable Integer customRuleId;

    public Optional<Integer> customRuleId() {
        return Optional.ofNullable(this.customRuleId);
    }

    private GetAppSecCustomRulesPlainArgs() {}

    private GetAppSecCustomRulesPlainArgs(GetAppSecCustomRulesPlainArgs $) {
        this.configId = $.configId;
        this.customRuleId = $.customRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecCustomRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecCustomRulesPlainArgs $;

        public Builder() {
            $ = new GetAppSecCustomRulesPlainArgs();
        }

        public Builder(GetAppSecCustomRulesPlainArgs defaults) {
            $ = new GetAppSecCustomRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder customRuleId(@Nullable Integer customRuleId) {
            $.customRuleId = customRuleId;
            return this;
        }

        public GetAppSecCustomRulesPlainArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecCustomRulesPlainArgs", "configId");
            }
            return $;
        }
    }

}
