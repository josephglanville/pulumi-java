// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterAutoTerminationPolicy {
    /**
     * Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can specify a minimum of `60` seconds and a maximum of `604800` seconds (seven days).
     * 
     */
    private final @Nullable Integer idleTimeout;

    @OutputCustomType.Constructor
    private ClusterAutoTerminationPolicy(@OutputCustomType.Parameter("idleTimeout") @Nullable Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    /**
     * Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can specify a minimum of `60` seconds and a maximum of `604800` seconds (seven days).
     * 
    */
    public Optional<Integer> getIdleTimeout() {
        return Optional.ofNullable(this.idleTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAutoTerminationPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer idleTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAutoTerminationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTimeout = defaults.idleTimeout;
        }

        public Builder setIdleTimeout(@Nullable Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public ClusterAutoTerminationPolicy build() {
            return new ClusterAutoTerminationPolicy(idleTimeout);
        }
    }
}
