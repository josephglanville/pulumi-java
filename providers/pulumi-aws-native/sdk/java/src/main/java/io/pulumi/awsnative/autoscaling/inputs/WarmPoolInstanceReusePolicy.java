// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WarmPoolInstanceReusePolicy extends io.pulumi.resources.InvokeArgs {

    public static final WarmPoolInstanceReusePolicy Empty = new WarmPoolInstanceReusePolicy();

    @InputImport(name="reuseOnScaleIn")
    private final @Nullable Boolean reuseOnScaleIn;

    public Optional<Boolean> getReuseOnScaleIn() {
        return this.reuseOnScaleIn == null ? Optional.empty() : Optional.ofNullable(this.reuseOnScaleIn);
    }

    public WarmPoolInstanceReusePolicy(@Nullable Boolean reuseOnScaleIn) {
        this.reuseOnScaleIn = reuseOnScaleIn;
    }

    private WarmPoolInstanceReusePolicy() {
        this.reuseOnScaleIn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WarmPoolInstanceReusePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean reuseOnScaleIn;

        public Builder() {
    	      // Empty
        }

        public Builder(WarmPoolInstanceReusePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reuseOnScaleIn = defaults.reuseOnScaleIn;
        }

        public Builder setReuseOnScaleIn(@Nullable Boolean reuseOnScaleIn) {
            this.reuseOnScaleIn = reuseOnScaleIn;
            return this;
        }

        public WarmPoolInstanceReusePolicy build() {
            return new WarmPoolInstanceReusePolicy(reuseOnScaleIn);
        }
    }
}