// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs();

    /**
     * Kerberos related configuration.
     * 
     */
    @Import(name="kerberosConfig")
      private final @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs> kerberosConfig;

    public Output<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs> getKerberosConfig() {
        return this.kerberosConfig == null ? Output.empty() : this.kerberosConfig;
    }

    public WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs> kerberosConfig) {
        this.kerberosConfig = kerberosConfig;
    }

    private WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs() {
        this.kerberosConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs> kerberosConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosConfig = defaults.kerberosConfig;
        }

        public Builder kerberosConfig(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs> kerberosConfig) {
            this.kerberosConfig = kerberosConfig;
            return this;
        }
        public Builder kerberosConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs kerberosConfig) {
            this.kerberosConfig = Output.ofNullable(kerberosConfig);
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs(kerberosConfig);
        }
    }
}
