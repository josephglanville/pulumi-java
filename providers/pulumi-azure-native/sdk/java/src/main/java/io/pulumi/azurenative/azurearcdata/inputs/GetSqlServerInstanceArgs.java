// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSqlServerInstanceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlServerInstanceArgs Empty = new GetSqlServerInstanceArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sqlServerInstanceName", required=true)
    private final String sqlServerInstanceName;

    public String getSqlServerInstanceName() {
        return this.sqlServerInstanceName;
    }

    public GetSqlServerInstanceArgs(
        String resourceGroupName,
        String sqlServerInstanceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlServerInstanceName = Objects.requireNonNull(sqlServerInstanceName, "expected parameter 'sqlServerInstanceName' to be non-null");
    }

    private GetSqlServerInstanceArgs() {
        this.resourceGroupName = null;
        this.sqlServerInstanceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlServerInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String sqlServerInstanceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlServerInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlServerInstanceName = defaults.sqlServerInstanceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSqlServerInstanceName(String sqlServerInstanceName) {
            this.sqlServerInstanceName = Objects.requireNonNull(sqlServerInstanceName);
            return this;
        }

        public GetSqlServerInstanceArgs build() {
            return new GetSqlServerInstanceArgs(resourceGroupName, sqlServerInstanceName);
        }
    }
}
