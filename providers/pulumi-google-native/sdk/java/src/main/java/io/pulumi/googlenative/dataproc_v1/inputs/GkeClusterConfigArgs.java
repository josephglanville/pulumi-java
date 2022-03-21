// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1.inputs.NamespacedGkeDeploymentTargetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The cluster's GKE config.
 * 
 */
public final class GkeClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GkeClusterConfigArgs Empty = new GkeClusterConfigArgs();

    /**
     * Optional. A target for the deployment.
     * 
     */
    @Import(name="namespacedGkeDeploymentTarget")
      private final @Nullable Output<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget;

    public Output<NamespacedGkeDeploymentTargetArgs> getNamespacedGkeDeploymentTarget() {
        return this.namespacedGkeDeploymentTarget == null ? Output.empty() : this.namespacedGkeDeploymentTarget;
    }

    public GkeClusterConfigArgs(@Nullable Output<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget) {
        this.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
    }

    private GkeClusterConfigArgs() {
        this.namespacedGkeDeploymentTarget = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespacedGkeDeploymentTarget = defaults.namespacedGkeDeploymentTarget;
        }

        public Builder namespacedGkeDeploymentTarget(@Nullable Output<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget) {
            this.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
            return this;
        }
        public Builder namespacedGkeDeploymentTarget(@Nullable NamespacedGkeDeploymentTargetArgs namespacedGkeDeploymentTarget) {
            this.namespacedGkeDeploymentTarget = Output.ofNullable(namespacedGkeDeploymentTarget);
            return this;
        }        public GkeClusterConfigArgs build() {
            return new GkeClusterConfigArgs(namespacedGkeDeploymentTarget);
        }
    }
}
