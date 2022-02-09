// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkHubArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkHubArgs Empty = new GetPrivateLinkHubArgs();

    @InputImport(name="privateLinkHubName", required=true)
    private final String privateLinkHubName;

    public String getPrivateLinkHubName() {
        return this.privateLinkHubName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPrivateLinkHubArgs(
        String privateLinkHubName,
        String resourceGroupName) {
        this.privateLinkHubName = Objects.requireNonNull(privateLinkHubName, "expected parameter 'privateLinkHubName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPrivateLinkHubArgs() {
        this.privateLinkHubName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateLinkHubName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateLinkHubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkHubName = defaults.privateLinkHubName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPrivateLinkHubName(String privateLinkHubName) {
            this.privateLinkHubName = Objects.requireNonNull(privateLinkHubName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetPrivateLinkHubArgs build() {
            return new GetPrivateLinkHubArgs(privateLinkHubName, resourceGroupName);
        }
    }
}
