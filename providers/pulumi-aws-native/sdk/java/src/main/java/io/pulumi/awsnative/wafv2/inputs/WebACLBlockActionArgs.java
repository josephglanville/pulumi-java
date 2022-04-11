// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLCustomResponseArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Block traffic towards application.
 * 
 */
public final class WebACLBlockActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLBlockActionArgs Empty = new WebACLBlockActionArgs();

    @Import(name="customResponse")
      private final @Nullable Output<WebACLCustomResponseArgs> customResponse;

    public Output<WebACLCustomResponseArgs> getCustomResponse() {
        return this.customResponse == null ? Codegen.empty() : this.customResponse;
    }

    public WebACLBlockActionArgs(@Nullable Output<WebACLCustomResponseArgs> customResponse) {
        this.customResponse = customResponse;
    }

    private WebACLBlockActionArgs() {
        this.customResponse = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLBlockActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebACLCustomResponseArgs> customResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLBlockActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponse = defaults.customResponse;
        }

        public Builder customResponse(@Nullable Output<WebACLCustomResponseArgs> customResponse) {
            this.customResponse = customResponse;
            return this;
        }
        public Builder customResponse(@Nullable WebACLCustomResponseArgs customResponse) {
            this.customResponse = Codegen.ofNullable(customResponse);
            return this;
        }        public WebACLBlockActionArgs build() {
            return new WebACLBlockActionArgs(customResponse);
        }
    }
}
