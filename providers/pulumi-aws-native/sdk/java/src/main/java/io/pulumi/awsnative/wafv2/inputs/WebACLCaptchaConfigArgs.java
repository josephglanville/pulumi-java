// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLImmunityTimePropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebACLCaptchaConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLCaptchaConfigArgs Empty = new WebACLCaptchaConfigArgs();

    @Import(name="immunityTimeProperty")
      private final @Nullable Output<WebACLImmunityTimePropertyArgs> immunityTimeProperty;

    public Output<WebACLImmunityTimePropertyArgs> getImmunityTimeProperty() {
        return this.immunityTimeProperty == null ? Output.empty() : this.immunityTimeProperty;
    }

    public WebACLCaptchaConfigArgs(@Nullable Output<WebACLImmunityTimePropertyArgs> immunityTimeProperty) {
        this.immunityTimeProperty = immunityTimeProperty;
    }

    private WebACLCaptchaConfigArgs() {
        this.immunityTimeProperty = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLCaptchaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebACLImmunityTimePropertyArgs> immunityTimeProperty;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLCaptchaConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immunityTimeProperty = defaults.immunityTimeProperty;
        }

        public Builder immunityTimeProperty(@Nullable Output<WebACLImmunityTimePropertyArgs> immunityTimeProperty) {
            this.immunityTimeProperty = immunityTimeProperty;
            return this;
        }
        public Builder immunityTimeProperty(@Nullable WebACLImmunityTimePropertyArgs immunityTimeProperty) {
            this.immunityTimeProperty = Output.ofNullable(immunityTimeProperty);
            return this;
        }        public WebACLCaptchaConfigArgs build() {
            return new WebACLCaptchaConfigArgs(immunityTimeProperty);
        }
    }
}
