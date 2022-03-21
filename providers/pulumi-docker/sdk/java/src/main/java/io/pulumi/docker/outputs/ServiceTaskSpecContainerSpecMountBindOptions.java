// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecContainerSpecMountBindOptions {
    private final @Nullable String propagation;

    @CustomType.Constructor
    private ServiceTaskSpecContainerSpecMountBindOptions(@CustomType.Parameter("propagation") @Nullable String propagation) {
        this.propagation = propagation;
    }

    public Optional<String> getPropagation() {
        return Optional.ofNullable(this.propagation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecMountBindOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String propagation;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecMountBindOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propagation = defaults.propagation;
        }

        public Builder propagation(@Nullable String propagation) {
            this.propagation = propagation;
            return this;
        }        public ServiceTaskSpecContainerSpecMountBindOptions build() {
            return new ServiceTaskSpecContainerSpecMountBindOptions(propagation);
        }
    }
}
