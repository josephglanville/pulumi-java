// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockCustomResponseArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclDefaultActionBlockArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclDefaultActionBlockArgs Empty = new WebAclDefaultActionBlockArgs();

    /**
     * Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    @Import(name="customResponse")
      private final @Nullable Output<WebAclDefaultActionBlockCustomResponseArgs> customResponse;

    public Output<WebAclDefaultActionBlockCustomResponseArgs> getCustomResponse() {
        return this.customResponse == null ? Output.empty() : this.customResponse;
    }

    public WebAclDefaultActionBlockArgs(@Nullable Output<WebAclDefaultActionBlockCustomResponseArgs> customResponse) {
        this.customResponse = customResponse;
    }

    private WebAclDefaultActionBlockArgs() {
        this.customResponse = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclDefaultActionBlockCustomResponseArgs> customResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclDefaultActionBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponse = defaults.customResponse;
        }

        public Builder customResponse(@Nullable Output<WebAclDefaultActionBlockCustomResponseArgs> customResponse) {
            this.customResponse = customResponse;
            return this;
        }
        public Builder customResponse(@Nullable WebAclDefaultActionBlockCustomResponseArgs customResponse) {
            this.customResponse = Output.ofNullable(customResponse);
            return this;
        }        public WebAclDefaultActionBlockArgs build() {
            return new WebAclDefaultActionBlockArgs(customResponse);
        }
    }
}
