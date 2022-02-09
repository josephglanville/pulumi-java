// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayAutoscaleConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayAutoscaleConfigurationResponse Empty = new ApplicationGatewayAutoscaleConfigurationResponse();

    @InputImport(name="maxCapacity")
    private final @Nullable Integer maxCapacity;

    public Optional<Integer> getMaxCapacity() {
        return this.maxCapacity == null ? Optional.empty() : Optional.ofNullable(this.maxCapacity);
    }

    @InputImport(name="minCapacity", required=true)
    private final Integer minCapacity;

    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    public ApplicationGatewayAutoscaleConfigurationResponse(
        @Nullable Integer maxCapacity,
        Integer minCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = Objects.requireNonNull(minCapacity, "expected parameter 'minCapacity' to be non-null");
    }

    private ApplicationGatewayAutoscaleConfigurationResponse() {
        this.maxCapacity = null;
        this.minCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayAutoscaleConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxCapacity;
        private Integer minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayAutoscaleConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder setMaxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public Builder setMinCapacity(Integer minCapacity) {
            this.minCapacity = Objects.requireNonNull(minCapacity);
            return this;
        }

        public ApplicationGatewayAutoscaleConfigurationResponse build() {
            return new ApplicationGatewayAutoscaleConfigurationResponse(maxCapacity, minCapacity);
        }
    }
}
