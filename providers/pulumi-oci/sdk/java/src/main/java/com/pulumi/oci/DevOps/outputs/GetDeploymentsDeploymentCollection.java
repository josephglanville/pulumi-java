// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetDeploymentsDeploymentCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentsDeploymentCollection {
    /**
     * @return A list of stage predecessors for a stage.
     * 
     */
    private final List<GetDeploymentsDeploymentCollectionItem> items;

    @CustomType.Constructor
    private GetDeploymentsDeploymentCollection(@CustomType.Parameter("items") List<GetDeploymentsDeploymentCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return A list of stage predecessors for a stage.
     * 
     */
    public List<GetDeploymentsDeploymentCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentsDeploymentCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDeploymentsDeploymentCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentsDeploymentCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetDeploymentsDeploymentCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetDeploymentsDeploymentCollectionItem... items) {
            return items(List.of(items));
        }        public GetDeploymentsDeploymentCollection build() {
            return new GetDeploymentsDeploymentCollection(items);
        }
    }
}
