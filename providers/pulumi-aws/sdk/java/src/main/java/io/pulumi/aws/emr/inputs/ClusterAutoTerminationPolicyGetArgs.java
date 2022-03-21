// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterAutoTerminationPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAutoTerminationPolicyGetArgs Empty = new ClusterAutoTerminationPolicyGetArgs();

    /**
     * Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can specify a minimum of `60` seconds and a maximum of `604800` seconds (seven days).
     * 
     */
    @Import(name="idleTimeout")
      private final @Nullable Output<Integer> idleTimeout;

    public Output<Integer> getIdleTimeout() {
        return this.idleTimeout == null ? Output.empty() : this.idleTimeout;
    }

    public ClusterAutoTerminationPolicyGetArgs(@Nullable Output<Integer> idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    private ClusterAutoTerminationPolicyGetArgs() {
        this.idleTimeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAutoTerminationPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> idleTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAutoTerminationPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTimeout = defaults.idleTimeout;
        }

        public Builder idleTimeout(@Nullable Output<Integer> idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Builder idleTimeout(@Nullable Integer idleTimeout) {
            this.idleTimeout = Output.ofNullable(idleTimeout);
            return this;
        }        public ClusterAutoTerminationPolicyGetArgs build() {
            return new ClusterAutoTerminationPolicyGetArgs(idleTimeout);
        }
    }
}
