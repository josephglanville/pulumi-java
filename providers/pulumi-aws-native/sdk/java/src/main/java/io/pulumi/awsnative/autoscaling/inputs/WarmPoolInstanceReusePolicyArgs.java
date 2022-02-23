// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WarmPoolInstanceReusePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final WarmPoolInstanceReusePolicyArgs Empty = new WarmPoolInstanceReusePolicyArgs();

    @InputImport(name="reuseOnScaleIn")
      private final @Nullable Input<Boolean> reuseOnScaleIn;

    public Input<Boolean> getReuseOnScaleIn() {
        return this.reuseOnScaleIn == null ? Input.empty() : this.reuseOnScaleIn;
    }

    public WarmPoolInstanceReusePolicyArgs(@Nullable Input<Boolean> reuseOnScaleIn) {
        this.reuseOnScaleIn = reuseOnScaleIn;
    }

    private WarmPoolInstanceReusePolicyArgs() {
        this.reuseOnScaleIn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WarmPoolInstanceReusePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> reuseOnScaleIn;

        public Builder() {
    	      // Empty
        }

        public Builder(WarmPoolInstanceReusePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reuseOnScaleIn = defaults.reuseOnScaleIn;
        }

        public Builder setReuseOnScaleIn(@Nullable Input<Boolean> reuseOnScaleIn) {
            this.reuseOnScaleIn = reuseOnScaleIn;
            return this;
        }

        public Builder setReuseOnScaleIn(@Nullable Boolean reuseOnScaleIn) {
            this.reuseOnScaleIn = Input.ofNullable(reuseOnScaleIn);
            return this;
        }
        public WarmPoolInstanceReusePolicyArgs build() {
            return new WarmPoolInstanceReusePolicyArgs(reuseOnScaleIn);
        }
    }
}
