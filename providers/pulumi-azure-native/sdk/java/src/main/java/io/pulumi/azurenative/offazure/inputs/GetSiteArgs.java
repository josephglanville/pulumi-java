// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSiteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSiteArgs Empty = new GetSiteArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="siteName", required=true)
    private final String siteName;

    public String getSiteName() {
        return this.siteName;
    }

    public GetSiteArgs(
        String resourceGroupName,
        String siteName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteName = Objects.requireNonNull(siteName, "expected parameter 'siteName' to be non-null");
    }

    private GetSiteArgs() {
        this.resourceGroupName = null;
        this.siteName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String siteName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteName = defaults.siteName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSiteName(String siteName) {
            this.siteName = Objects.requireNonNull(siteName);
            return this;
        }

        public GetSiteArgs build() {
            return new GetSiteArgs(resourceGroupName, siteName);
        }
    }
}
