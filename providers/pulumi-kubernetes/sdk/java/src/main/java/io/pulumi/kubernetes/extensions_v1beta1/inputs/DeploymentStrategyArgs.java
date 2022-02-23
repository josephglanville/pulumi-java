// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.RollingUpdateDeploymentArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DeploymentStrategy describes how to replace existing pods with new ones.
 * 
 */
public final class DeploymentStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentStrategyArgs Empty = new DeploymentStrategyArgs();

    /**
     * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
     * 
     */
    @InputImport(name="rollingUpdate")
      private final @Nullable Input<RollingUpdateDeploymentArgs> rollingUpdate;

    public Input<RollingUpdateDeploymentArgs> getRollingUpdate() {
        return this.rollingUpdate == null ? Input.empty() : this.rollingUpdate;
    }

    /**
     * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public DeploymentStrategyArgs(
        @Nullable Input<RollingUpdateDeploymentArgs> rollingUpdate,
        @Nullable Input<String> type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    private DeploymentStrategyArgs() {
        this.rollingUpdate = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RollingUpdateDeploymentArgs> rollingUpdate;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder setRollingUpdate(@Nullable Input<RollingUpdateDeploymentArgs> rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        public Builder setRollingUpdate(@Nullable RollingUpdateDeploymentArgs rollingUpdate) {
            this.rollingUpdate = Input.ofNullable(rollingUpdate);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public DeploymentStrategyArgs build() {
            return new DeploymentStrategyArgs(rollingUpdate, type);
        }
    }
}
