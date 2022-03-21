// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerAutoHealingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerAutoHealingPolicyArgs Empty = new InstanceGroupManagerAutoHealingPolicyArgs();

    /**
     * The URL for the health check that signals autohealing.
     * 
     */
    @Import(name="healthCheck")
      private final @Nullable Output<String> healthCheck;

    public Output<String> getHealthCheck() {
        return this.healthCheck == null ? Output.empty() : this.healthCheck;
    }

    /**
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * 
     */
    @Import(name="initialDelaySec")
      private final @Nullable Output<Integer> initialDelaySec;

    public Output<Integer> getInitialDelaySec() {
        return this.initialDelaySec == null ? Output.empty() : this.initialDelaySec;
    }

    public InstanceGroupManagerAutoHealingPolicyArgs(
        @Nullable Output<String> healthCheck,
        @Nullable Output<Integer> initialDelaySec) {
        this.healthCheck = healthCheck;
        this.initialDelaySec = initialDelaySec;
    }

    private InstanceGroupManagerAutoHealingPolicyArgs() {
        this.healthCheck = Output.empty();
        this.initialDelaySec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAutoHealingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> healthCheck;
        private @Nullable Output<Integer> initialDelaySec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheck = defaults.healthCheck;
    	      this.initialDelaySec = defaults.initialDelaySec;
        }

        public Builder healthCheck(@Nullable Output<String> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public Builder healthCheck(@Nullable String healthCheck) {
            this.healthCheck = Output.ofNullable(healthCheck);
            return this;
        }
        public Builder initialDelaySec(@Nullable Output<Integer> initialDelaySec) {
            this.initialDelaySec = initialDelaySec;
            return this;
        }
        public Builder initialDelaySec(@Nullable Integer initialDelaySec) {
            this.initialDelaySec = Output.ofNullable(initialDelaySec);
            return this;
        }        public InstanceGroupManagerAutoHealingPolicyArgs build() {
            return new InstanceGroupManagerAutoHealingPolicyArgs(healthCheck, initialDelaySec);
        }
    }
}
