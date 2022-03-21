// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceHealthCheckCustomConfig {
    /**
     * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
     */
    private final @Nullable Integer failureThreshold;

    @CustomType.Constructor
    private ServiceHealthCheckCustomConfig(@CustomType.Parameter("failureThreshold") @Nullable Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
    */
    public Optional<Integer> getFailureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHealthCheckCustomConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failureThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceHealthCheckCustomConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
        }

        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }        public ServiceHealthCheckCustomConfig build() {
            return new ServiceHealthCheckCustomConfig(failureThreshold);
        }
    }
}
