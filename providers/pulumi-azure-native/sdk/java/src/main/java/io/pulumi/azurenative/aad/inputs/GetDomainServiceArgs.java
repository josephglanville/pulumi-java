// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDomainServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainServiceArgs Empty = new GetDomainServiceArgs();

    /**
     * The name of the domain service.
     * 
     */
    @InputImport(name="domainServiceName", required=true)
      private final String domainServiceName;

    public String getDomainServiceName() {
        return this.domainServiceName;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDomainServiceArgs(
        String domainServiceName,
        String resourceGroupName) {
        this.domainServiceName = Objects.requireNonNull(domainServiceName, "expected parameter 'domainServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDomainServiceArgs() {
        this.domainServiceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainServiceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainServiceName = defaults.domainServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDomainServiceName(String domainServiceName) {
            this.domainServiceName = Objects.requireNonNull(domainServiceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetDomainServiceArgs build() {
            return new GetDomainServiceArgs(domainServiceName, resourceGroupName);
        }
    }
}
