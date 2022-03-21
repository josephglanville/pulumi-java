// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ClusterNodeConfigLinuxNodeConfig {
    /**
     * The Linux kernel parameters to be applied to the nodes
     * and all pods running on the nodes. Specified as a map from the key, such as
     * `net.core.wmem_max`, to a string value.
     * 
     */
    private final Map<String,String> sysctls;

    @CustomType.Constructor
    private ClusterNodeConfigLinuxNodeConfig(@CustomType.Parameter("sysctls") Map<String,String> sysctls) {
        this.sysctls = sysctls;
    }

    /**
     * The Linux kernel parameters to be applied to the nodes
     * and all pods running on the nodes. Specified as a map from the key, such as
     * `net.core.wmem_max`, to a string value.
     * 
    */
    public Map<String,String> getSysctls() {
        return this.sysctls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigLinuxNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> sysctls;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigLinuxNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sysctls = defaults.sysctls;
        }

        public Builder sysctls(Map<String,String> sysctls) {
            this.sysctls = Objects.requireNonNull(sysctls);
            return this;
        }        public ClusterNodeConfigLinuxNodeConfig build() {
            return new ClusterNodeConfigLinuxNodeConfig(sysctls);
        }
    }
}
