// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSqlManagedInstanceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlManagedInstanceArgs Empty = new GetSqlManagedInstanceArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sqlManagedInstanceName", required=true)
    private final String sqlManagedInstanceName;

    public String getSqlManagedInstanceName() {
        return this.sqlManagedInstanceName;
    }

    public GetSqlManagedInstanceArgs(
        String resourceGroupName,
        String sqlManagedInstanceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlManagedInstanceName = Objects.requireNonNull(sqlManagedInstanceName, "expected parameter 'sqlManagedInstanceName' to be non-null");
    }

    private GetSqlManagedInstanceArgs() {
        this.resourceGroupName = null;
        this.sqlManagedInstanceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String sqlManagedInstanceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlManagedInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlManagedInstanceName = defaults.sqlManagedInstanceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSqlManagedInstanceName(String sqlManagedInstanceName) {
            this.sqlManagedInstanceName = Objects.requireNonNull(sqlManagedInstanceName);
            return this;
        }

        public GetSqlManagedInstanceArgs build() {
            return new GetSqlManagedInstanceArgs(resourceGroupName, sqlManagedInstanceName);
        }
    }
}
