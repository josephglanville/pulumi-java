// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionClusterConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Identifies the resources to deploy for a monitoring job.
 * 
 */
public final class ModelQualityJobDefinitionMonitoringResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionMonitoringResourcesArgs Empty = new ModelQualityJobDefinitionMonitoringResourcesArgs();

    @Import(name="clusterConfig", required=true)
      private final Output<ModelQualityJobDefinitionClusterConfigArgs> clusterConfig;

    public Output<ModelQualityJobDefinitionClusterConfigArgs> getClusterConfig() {
        return this.clusterConfig;
    }

    public ModelQualityJobDefinitionMonitoringResourcesArgs(Output<ModelQualityJobDefinitionClusterConfigArgs> clusterConfig) {
        this.clusterConfig = Objects.requireNonNull(clusterConfig, "expected parameter 'clusterConfig' to be non-null");
    }

    private ModelQualityJobDefinitionMonitoringResourcesArgs() {
        this.clusterConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionMonitoringResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ModelQualityJobDefinitionClusterConfigArgs> clusterConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionMonitoringResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
        }

        public Builder clusterConfig(Output<ModelQualityJobDefinitionClusterConfigArgs> clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }
        public Builder clusterConfig(ModelQualityJobDefinitionClusterConfigArgs clusterConfig) {
            this.clusterConfig = Output.of(Objects.requireNonNull(clusterConfig));
            return this;
        }        public ModelQualityJobDefinitionMonitoringResourcesArgs build() {
            return new ModelQualityJobDefinitionMonitoringResourcesArgs(clusterConfig);
        }
    }
}
