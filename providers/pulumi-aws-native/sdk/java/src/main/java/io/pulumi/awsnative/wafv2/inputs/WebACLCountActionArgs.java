// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLCustomRequestHandlingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Allow traffic towards application.
 * 
 */
public final class WebACLCountActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLCountActionArgs Empty = new WebACLCountActionArgs();

    @Import(name="customRequestHandling")
      private final @Nullable Output<WebACLCustomRequestHandlingArgs> customRequestHandling;

    public Output<WebACLCustomRequestHandlingArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Output.empty() : this.customRequestHandling;
    }

    public WebACLCountActionArgs(@Nullable Output<WebACLCustomRequestHandlingArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private WebACLCountActionArgs() {
        this.customRequestHandling = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLCountActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebACLCustomRequestHandlingArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLCountActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable Output<WebACLCustomRequestHandlingArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public Builder customRequestHandling(@Nullable WebACLCustomRequestHandlingArgs customRequestHandling) {
            this.customRequestHandling = Output.ofNullable(customRequestHandling);
            return this;
        }        public WebACLCountActionArgs build() {
            return new WebACLCountActionArgs(customRequestHandling);
        }
    }
}
