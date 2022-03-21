// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSqlVirtualMachineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlVirtualMachineArgs Empty = new GetSqlVirtualMachineArgs();

    /**
     * The child resources to include in the response.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL virtual machine.
     * 
     */
    @Import(name="sqlVirtualMachineName", required=true)
      private final String sqlVirtualMachineName;

    public String getSqlVirtualMachineName() {
        return this.sqlVirtualMachineName;
    }

    public GetSqlVirtualMachineArgs(
        @Nullable String expand,
        String resourceGroupName,
        String sqlVirtualMachineName) {
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlVirtualMachineName = Objects.requireNonNull(sqlVirtualMachineName, "expected parameter 'sqlVirtualMachineName' to be non-null");
    }

    private GetSqlVirtualMachineArgs() {
        this.expand = null;
        this.resourceGroupName = null;
        this.sqlVirtualMachineName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlVirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String resourceGroupName;
        private String sqlVirtualMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlVirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlVirtualMachineName = defaults.sqlVirtualMachineName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder sqlVirtualMachineName(String sqlVirtualMachineName) {
            this.sqlVirtualMachineName = Objects.requireNonNull(sqlVirtualMachineName);
            return this;
        }        public GetSqlVirtualMachineArgs build() {
            return new GetSqlVirtualMachineArgs(expand, resourceGroupName, sqlVirtualMachineName);
        }
    }
}
