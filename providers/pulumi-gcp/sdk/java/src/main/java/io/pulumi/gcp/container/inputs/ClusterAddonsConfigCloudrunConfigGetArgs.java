// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterAddonsConfigCloudrunConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAddonsConfigCloudrunConfigGetArgs Empty = new ClusterAddonsConfigCloudrunConfigGetArgs();

    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
     */
    @Import(name="disabled", required=true)
      private final Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled;
    }

    /**
     * The load balancer type of CloudRun ingress service. It is external load balancer by default.
     * Set `load_balancer_type=LOAD_BALANCER_TYPE_INTERNAL` to configure it as internal load balancer.
     * 
     */
    @Import(name="loadBalancerType")
      private final @Nullable Output<String> loadBalancerType;

    public Output<String> getLoadBalancerType() {
        return this.loadBalancerType == null ? Output.empty() : this.loadBalancerType;
    }

    public ClusterAddonsConfigCloudrunConfigGetArgs(
        Output<Boolean> disabled,
        @Nullable Output<String> loadBalancerType) {
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
        this.loadBalancerType = loadBalancerType;
    }

    private ClusterAddonsConfigCloudrunConfigGetArgs() {
        this.disabled = Output.empty();
        this.loadBalancerType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigCloudrunConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> disabled;
        private @Nullable Output<String> loadBalancerType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfigCloudrunConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.loadBalancerType = defaults.loadBalancerType;
        }

        public Builder disabled(Output<Boolean> disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder disabled(Boolean disabled) {
            this.disabled = Output.of(Objects.requireNonNull(disabled));
            return this;
        }
        public Builder loadBalancerType(@Nullable Output<String> loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public Builder loadBalancerType(@Nullable String loadBalancerType) {
            this.loadBalancerType = Output.ofNullable(loadBalancerType);
            return this;
        }        public ClusterAddonsConfigCloudrunConfigGetArgs build() {
            return new ClusterAddonsConfigCloudrunConfigGetArgs(disabled, loadBalancerType);
        }
    }
}
