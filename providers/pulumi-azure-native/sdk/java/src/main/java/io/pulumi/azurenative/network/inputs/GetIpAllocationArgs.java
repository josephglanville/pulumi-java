// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpAllocationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIpAllocationArgs Empty = new GetIpAllocationArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @InputImport(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the IpAllocation.
     * 
     */
    @InputImport(name="ipAllocationName", required=true)
      private final String ipAllocationName;

    public String getIpAllocationName() {
        return this.ipAllocationName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetIpAllocationArgs(
        @Nullable String expand,
        String ipAllocationName,
        String resourceGroupName) {
        this.expand = expand;
        this.ipAllocationName = Objects.requireNonNull(ipAllocationName, "expected parameter 'ipAllocationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetIpAllocationArgs() {
        this.expand = null;
        this.ipAllocationName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String ipAllocationName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpAllocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.ipAllocationName = defaults.ipAllocationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setIpAllocationName(String ipAllocationName) {
            this.ipAllocationName = Objects.requireNonNull(ipAllocationName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetIpAllocationArgs build() {
            return new GetIpAllocationArgs(expand, ipAllocationName, resourceGroupName);
        }
    }
}
