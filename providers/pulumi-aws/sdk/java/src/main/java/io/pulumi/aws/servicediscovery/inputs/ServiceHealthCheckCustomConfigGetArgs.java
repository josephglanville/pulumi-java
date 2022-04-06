// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceHealthCheckCustomConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceHealthCheckCustomConfigGetArgs Empty = new ServiceHealthCheckCustomConfigGetArgs();

    /**
     * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
     */
    @Import(name="failureThreshold")
      private final @Nullable Output<Integer> failureThreshold;

    public Output<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Output.empty() : this.failureThreshold;
    }

    public ServiceHealthCheckCustomConfigGetArgs(@Nullable Output<Integer> failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    private ServiceHealthCheckCustomConfigGetArgs() {
        this.failureThreshold = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHealthCheckCustomConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> failureThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceHealthCheckCustomConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
        }

        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Output.ofNullable(failureThreshold);
            return this;
        }        public ServiceHealthCheckCustomConfigGetArgs build() {
            return new ServiceHealthCheckCustomConfigGetArgs(failureThreshold);
        }
    }
}