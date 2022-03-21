// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedExecutionProperties {
    private final @Nullable Boolean active;

    @CustomType.Constructor
    private ManagedExecutionProperties(@CustomType.Parameter("active") @Nullable Boolean active) {
        this.active = active;
    }

    public Optional<Boolean> getActive() {
        return Optional.ofNullable(this.active);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedExecutionProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean active;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedExecutionProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
        }

        public Builder active(@Nullable Boolean active) {
            this.active = active;
            return this;
        }        public ManagedExecutionProperties build() {
            return new ManagedExecutionProperties(active);
        }
    }
}
