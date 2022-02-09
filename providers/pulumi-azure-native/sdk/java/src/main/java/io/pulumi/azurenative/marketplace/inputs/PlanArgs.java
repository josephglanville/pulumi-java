// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace.inputs;

import io.pulumi.azurenative.marketplace.enums.Accessibility;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlanArgs Empty = new PlanArgs();

    @InputImport(name="accessibility")
    private final @Nullable Input<Either<String,Accessibility>> accessibility;

    public Input<Either<String,Accessibility>> getAccessibility() {
        return this.accessibility == null ? Input.empty() : this.accessibility;
    }

    public PlanArgs(@Nullable Input<Either<String,Accessibility>> accessibility) {
        this.accessibility = accessibility;
    }

    private PlanArgs() {
        this.accessibility = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,Accessibility>> accessibility;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessibility = defaults.accessibility;
        }

        public Builder setAccessibility(@Nullable Input<Either<String,Accessibility>> accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        public Builder setAccessibility(@Nullable Either<String,Accessibility> accessibility) {
            this.accessibility = Input.ofNullable(accessibility);
            return this;
        }

        public PlanArgs build() {
            return new PlanArgs(accessibility);
        }
    }
}
