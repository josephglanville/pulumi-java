// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListManagedClusterAccessProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListManagedClusterAccessProfileArgs Empty = new ListManagedClusterAccessProfileArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceName", required=true)
    private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    @InputImport(name="roleName", required=true)
    private final String roleName;

    public String getRoleName() {
        return this.roleName;
    }

    public ListManagedClusterAccessProfileArgs(
        String resourceGroupName,
        String resourceName,
        String roleName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.roleName = Objects.requireNonNull(roleName, "expected parameter 'roleName' to be non-null");
    }

    private ListManagedClusterAccessProfileArgs() {
        this.resourceGroupName = null;
        this.resourceName = null;
        this.roleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListManagedClusterAccessProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String resourceName;
        private String roleName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListManagedClusterAccessProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.roleName = defaults.roleName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }

        public ListManagedClusterAccessProfileArgs build() {
            return new ListManagedClusterAccessProfileArgs(resourceGroupName, resourceName, roleName);
        }
    }
}
