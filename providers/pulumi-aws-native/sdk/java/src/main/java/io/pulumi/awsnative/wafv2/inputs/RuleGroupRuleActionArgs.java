// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionAllowPropertiesArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionBlockPropertiesArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionCaptchaPropertiesArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionCountPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Action taken when Rule matches its condition.
 * 
 */
public final class RuleGroupRuleActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionArgs Empty = new RuleGroupRuleActionArgs();

    /**
     * Allow traffic towards application.
     * 
     */
    @Import(name="allow")
      private final @Nullable Output<RuleGroupRuleActionAllowPropertiesArgs> allow;

    public Output<RuleGroupRuleActionAllowPropertiesArgs> getAllow() {
        return this.allow == null ? Output.empty() : this.allow;
    }

    /**
     * Block traffic towards application.
     * 
     */
    @Import(name="block")
      private final @Nullable Output<RuleGroupRuleActionBlockPropertiesArgs> block;

    public Output<RuleGroupRuleActionBlockPropertiesArgs> getBlock() {
        return this.block == null ? Output.empty() : this.block;
    }

    /**
     * Checks valid token exists with request.
     * 
     */
    @Import(name="captcha")
      private final @Nullable Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha;

    public Output<RuleGroupRuleActionCaptchaPropertiesArgs> getCaptcha() {
        return this.captcha == null ? Output.empty() : this.captcha;
    }

    /**
     * Count traffic towards application.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<RuleGroupRuleActionCountPropertiesArgs> count;

    public Output<RuleGroupRuleActionCountPropertiesArgs> getCount() {
        return this.count == null ? Output.empty() : this.count;
    }

    public RuleGroupRuleActionArgs(
        @Nullable Output<RuleGroupRuleActionAllowPropertiesArgs> allow,
        @Nullable Output<RuleGroupRuleActionBlockPropertiesArgs> block,
        @Nullable Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha,
        @Nullable Output<RuleGroupRuleActionCountPropertiesArgs> count) {
        this.allow = allow;
        this.block = block;
        this.captcha = captcha;
        this.count = count;
    }

    private RuleGroupRuleActionArgs() {
        this.allow = Output.empty();
        this.block = Output.empty();
        this.captcha = Output.empty();
        this.count = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleActionAllowPropertiesArgs> allow;
        private @Nullable Output<RuleGroupRuleActionBlockPropertiesArgs> block;
        private @Nullable Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha;
        private @Nullable Output<RuleGroupRuleActionCountPropertiesArgs> count;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.captcha = defaults.captcha;
    	      this.count = defaults.count;
        }

        public Builder allow(@Nullable Output<RuleGroupRuleActionAllowPropertiesArgs> allow) {
            this.allow = allow;
            return this;
        }
        public Builder allow(@Nullable RuleGroupRuleActionAllowPropertiesArgs allow) {
            this.allow = Output.ofNullable(allow);
            return this;
        }
        public Builder block(@Nullable Output<RuleGroupRuleActionBlockPropertiesArgs> block) {
            this.block = block;
            return this;
        }
        public Builder block(@Nullable RuleGroupRuleActionBlockPropertiesArgs block) {
            this.block = Output.ofNullable(block);
            return this;
        }
        public Builder captcha(@Nullable Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha) {
            this.captcha = captcha;
            return this;
        }
        public Builder captcha(@Nullable RuleGroupRuleActionCaptchaPropertiesArgs captcha) {
            this.captcha = Output.ofNullable(captcha);
            return this;
        }
        public Builder count(@Nullable Output<RuleGroupRuleActionCountPropertiesArgs> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable RuleGroupRuleActionCountPropertiesArgs count) {
            this.count = Output.ofNullable(count);
            return this;
        }        public RuleGroupRuleActionArgs build() {
            return new RuleGroupRuleActionArgs(allow, block, captcha, count);
        }
    }
}
