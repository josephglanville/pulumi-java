// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelectorItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelector {
    /**
     * @return A list of selectors for the instance group. UNION operator is used for combining the instances selected by each selector.
     * 
     */
    private final List<GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelectorItem> items;

    @CustomType.Constructor
    private GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelector(@CustomType.Parameter("items") List<GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelectorItem> items) {
        this.items = items;
    }

    /**
     * @return A list of selectors for the instance group. UNION operator is used for combining the instances selected by each selector.
     * 
     */
    public List<GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelectorItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelectorItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelectorItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelectorItem... items) {
            return items(List.of(items));
        }        public GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelector build() {
            return new GetDeployEnvironmentsDeployEnvironmentCollectionItemComputeInstanceGroupSelector(items);
        }
    }
}
