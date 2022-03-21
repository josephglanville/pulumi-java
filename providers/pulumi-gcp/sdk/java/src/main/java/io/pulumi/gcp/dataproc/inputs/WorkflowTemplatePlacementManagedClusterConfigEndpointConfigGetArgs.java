// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs();

    /**
     * Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
     * 
     */
    @Import(name="enableHttpPortAccess")
      private final @Nullable Output<Boolean> enableHttpPortAccess;

    public Output<Boolean> getEnableHttpPortAccess() {
        return this.enableHttpPortAccess == null ? Output.empty() : this.enableHttpPortAccess;
    }

    /**
     * - 
     * Output only. The map of port descriptions to URLs. Will only be populated if enable_http_port_access is true.
     * 
     */
    @Import(name="httpPorts")
      private final @Nullable Output<Map<String,String>> httpPorts;

    public Output<Map<String,String>> getHttpPorts() {
        return this.httpPorts == null ? Output.empty() : this.httpPorts;
    }

    public WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs(
        @Nullable Output<Boolean> enableHttpPortAccess,
        @Nullable Output<Map<String,String>> httpPorts) {
        this.enableHttpPortAccess = enableHttpPortAccess;
        this.httpPorts = httpPorts;
    }

    private WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs() {
        this.enableHttpPortAccess = Output.empty();
        this.httpPorts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableHttpPortAccess;
        private @Nullable Output<Map<String,String>> httpPorts;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHttpPortAccess = defaults.enableHttpPortAccess;
    	      this.httpPorts = defaults.httpPorts;
        }

        public Builder enableHttpPortAccess(@Nullable Output<Boolean> enableHttpPortAccess) {
            this.enableHttpPortAccess = enableHttpPortAccess;
            return this;
        }
        public Builder enableHttpPortAccess(@Nullable Boolean enableHttpPortAccess) {
            this.enableHttpPortAccess = Output.ofNullable(enableHttpPortAccess);
            return this;
        }
        public Builder httpPorts(@Nullable Output<Map<String,String>> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public Builder httpPorts(@Nullable Map<String,String> httpPorts) {
            this.httpPorts = Output.ofNullable(httpPorts);
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs(enableHttpPortAccess, httpPorts);
        }
    }
}
