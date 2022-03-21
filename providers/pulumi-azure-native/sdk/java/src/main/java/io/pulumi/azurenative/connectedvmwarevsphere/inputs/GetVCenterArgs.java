// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVCenterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVCenterArgs Empty = new GetVCenterArgs();

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the vCenter.
     * 
     */
    @Import(name="vcenterName", required=true)
      private final String vcenterName;

    public String getVcenterName() {
        return this.vcenterName;
    }

    public GetVCenterArgs(
        String resourceGroupName,
        String vcenterName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vcenterName = Objects.requireNonNull(vcenterName, "expected parameter 'vcenterName' to be non-null");
    }

    private GetVCenterArgs() {
        this.resourceGroupName = null;
        this.vcenterName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String vcenterName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVCenterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vcenterName = defaults.vcenterName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder vcenterName(String vcenterName) {
            this.vcenterName = Objects.requireNonNull(vcenterName);
            return this;
        }        public GetVCenterArgs build() {
            return new GetVCenterArgs(resourceGroupName, vcenterName);
        }
    }
}
