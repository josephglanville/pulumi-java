// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.DeploymentDeploymentArgumentsItem;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentDeploymentArguments {
    /**
     * @return List of arguments provided at the time of deployment.
     * 
     */
    private final @Nullable List<DeploymentDeploymentArgumentsItem> items;

    @CustomType.Constructor
    private DeploymentDeploymentArguments(@CustomType.Parameter("items") @Nullable List<DeploymentDeploymentArgumentsItem> items) {
        this.items = items;
    }

    /**
     * @return List of arguments provided at the time of deployment.
     * 
     */
    public List<DeploymentDeploymentArgumentsItem> items() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentDeploymentArguments defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DeploymentDeploymentArgumentsItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentDeploymentArguments defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable List<DeploymentDeploymentArgumentsItem> items) {
            this.items = items;
            return this;
        }
        public Builder items(DeploymentDeploymentArgumentsItem... items) {
            return items(List.of(items));
        }        public DeploymentDeploymentArguments build() {
            return new DeploymentDeploymentArguments(items);
        }
    }
}
