// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs();

    /**
     * Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    @Import(name="gcePdKmsKeyName")
      private final @Nullable Output<String> gcePdKmsKeyName;

    public Output<String> getGcePdKmsKeyName() {
        return this.gcePdKmsKeyName == null ? Codegen.empty() : this.gcePdKmsKeyName;
    }

    public WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs(@Nullable Output<String> gcePdKmsKeyName) {
        this.gcePdKmsKeyName = gcePdKmsKeyName;
    }

    private WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs() {
        this.gcePdKmsKeyName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> gcePdKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcePdKmsKeyName = defaults.gcePdKmsKeyName;
        }

        public Builder gcePdKmsKeyName(@Nullable Output<String> gcePdKmsKeyName) {
            this.gcePdKmsKeyName = gcePdKmsKeyName;
            return this;
        }
        public Builder gcePdKmsKeyName(@Nullable String gcePdKmsKeyName) {
            this.gcePdKmsKeyName = Codegen.ofNullable(gcePdKmsKeyName);
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs(gcePdKmsKeyName);
        }
    }
}
