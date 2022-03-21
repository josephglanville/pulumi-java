// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHyperVSiteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHyperVSiteArgs Empty = new GetHyperVSiteArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Site name.
     * 
     */
    @Import(name="siteName", required=true)
      private final String siteName;

    public String getSiteName() {
        return this.siteName;
    }

    public GetHyperVSiteArgs(
        String resourceGroupName,
        String siteName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteName = Objects.requireNonNull(siteName, "expected parameter 'siteName' to be non-null");
    }

    private GetHyperVSiteArgs() {
        this.resourceGroupName = null;
        this.siteName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHyperVSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String siteName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHyperVSiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteName = defaults.siteName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder siteName(String siteName) {
            this.siteName = Objects.requireNonNull(siteName);
            return this;
        }        public GetHyperVSiteArgs build() {
            return new GetHyperVSiteArgs(resourceGroupName, siteName);
        }
    }
}
