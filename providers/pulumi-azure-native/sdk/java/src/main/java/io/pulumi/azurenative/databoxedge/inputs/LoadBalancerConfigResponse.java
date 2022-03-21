// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Load balancer configuration
 * 
 */
public final class LoadBalancerConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerConfigResponse Empty = new LoadBalancerConfigResponse();

    /**
     * Load balancer type
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Load balancer version
     * 
     */
    @Import(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public LoadBalancerConfigResponse(
        String type,
        String version) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private LoadBalancerConfigResponse() {
        this.type = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public LoadBalancerConfigResponse build() {
            return new LoadBalancerConfigResponse(type, version);
        }
    }
}
