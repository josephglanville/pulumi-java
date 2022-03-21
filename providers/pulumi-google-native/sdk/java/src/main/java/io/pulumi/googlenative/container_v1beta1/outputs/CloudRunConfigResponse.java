// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudRunConfigResponse {
    /**
     * Whether Cloud Run addon is enabled for this cluster.
     * 
     */
    private final Boolean disabled;
    /**
     * Which load balancer type is installed for Cloud Run.
     * 
     */
    private final String loadBalancerType;

    @CustomType.Constructor
    private CloudRunConfigResponse(
        @CustomType.Parameter("disabled") Boolean disabled,
        @CustomType.Parameter("loadBalancerType") String loadBalancerType) {
        this.disabled = disabled;
        this.loadBalancerType = loadBalancerType;
    }

    /**
     * Whether Cloud Run addon is enabled for this cluster.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }
    /**
     * Which load balancer type is installed for Cloud Run.
     * 
    */
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRunConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;
        private String loadBalancerType;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudRunConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.loadBalancerType = defaults.loadBalancerType;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder loadBalancerType(String loadBalancerType) {
            this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
            return this;
        }        public CloudRunConfigResponse build() {
            return new CloudRunConfigResponse(disabled, loadBalancerType);
        }
    }
}
