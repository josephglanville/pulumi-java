// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetClusterNodeConfigLinuxNodeConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodeConfigLinuxNodeConfig Empty = new GetClusterNodeConfigLinuxNodeConfig();

    @Import(name="sysctls", required=true)
      private final Map<String,String> sysctls;

    public Map<String,String> getSysctls() {
        return this.sysctls;
    }

    public GetClusterNodeConfigLinuxNodeConfig(Map<String,String> sysctls) {
        this.sysctls = Objects.requireNonNull(sysctls, "expected parameter 'sysctls' to be non-null");
    }

    private GetClusterNodeConfigLinuxNodeConfig() {
        this.sysctls = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigLinuxNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> sysctls;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfigLinuxNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sysctls = defaults.sysctls;
        }

        public Builder sysctls(Map<String,String> sysctls) {
            this.sysctls = Objects.requireNonNull(sysctls);
            return this;
        }        public GetClusterNodeConfigLinuxNodeConfig build() {
            return new GetClusterNodeConfigLinuxNodeConfig(sysctls);
        }
    }
}
