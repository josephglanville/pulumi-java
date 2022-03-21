// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleActionAllowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionAllowArgs Empty = new WebAclRuleActionAllowArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @Import(name="customRequestHandling")
      private final @Nullable Output<WebAclRuleActionAllowCustomRequestHandlingArgs> customRequestHandling;

    public Output<WebAclRuleActionAllowCustomRequestHandlingArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Output.empty() : this.customRequestHandling;
    }

    public WebAclRuleActionAllowArgs(@Nullable Output<WebAclRuleActionAllowCustomRequestHandlingArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private WebAclRuleActionAllowArgs() {
        this.customRequestHandling = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionAllowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleActionAllowCustomRequestHandlingArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionAllowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable Output<WebAclRuleActionAllowCustomRequestHandlingArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public Builder customRequestHandling(@Nullable WebAclRuleActionAllowCustomRequestHandlingArgs customRequestHandling) {
            this.customRequestHandling = Output.ofNullable(customRequestHandling);
            return this;
        }        public WebAclRuleActionAllowArgs build() {
            return new WebAclRuleActionAllowArgs(customRequestHandling);
        }
    }
}
