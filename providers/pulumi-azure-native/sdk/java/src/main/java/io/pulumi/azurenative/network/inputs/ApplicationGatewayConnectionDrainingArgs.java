// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Connection draining allows open connections to a backend server to be active for a specified time after the backend server got removed from the configuration.
 * 
 */
public final class ApplicationGatewayConnectionDrainingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayConnectionDrainingArgs Empty = new ApplicationGatewayConnectionDrainingArgs();

    /**
     * The number of seconds connection draining is active. Acceptable values are from 1 second to 3600 seconds.
     * 
     */
    @Import(name="drainTimeoutInSec", required=true)
      private final Output<Integer> drainTimeoutInSec;

    public Output<Integer> getDrainTimeoutInSec() {
        return this.drainTimeoutInSec;
    }

    /**
     * Whether connection draining is enabled or not.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    public ApplicationGatewayConnectionDrainingArgs(
        Output<Integer> drainTimeoutInSec,
        Output<Boolean> enabled) {
        this.drainTimeoutInSec = Objects.requireNonNull(drainTimeoutInSec, "expected parameter 'drainTimeoutInSec' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ApplicationGatewayConnectionDrainingArgs() {
        this.drainTimeoutInSec = Codegen.empty();
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayConnectionDrainingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> drainTimeoutInSec;
        private Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayConnectionDrainingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainTimeoutInSec = defaults.drainTimeoutInSec;
    	      this.enabled = defaults.enabled;
        }

        public Builder drainTimeoutInSec(Output<Integer> drainTimeoutInSec) {
            this.drainTimeoutInSec = Objects.requireNonNull(drainTimeoutInSec);
            return this;
        }
        public Builder drainTimeoutInSec(Integer drainTimeoutInSec) {
            this.drainTimeoutInSec = Output.of(Objects.requireNonNull(drainTimeoutInSec));
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }        public ApplicationGatewayConnectionDrainingArgs build() {
            return new ApplicationGatewayConnectionDrainingArgs(drainTimeoutInSec, enabled);
        }
    }
}
