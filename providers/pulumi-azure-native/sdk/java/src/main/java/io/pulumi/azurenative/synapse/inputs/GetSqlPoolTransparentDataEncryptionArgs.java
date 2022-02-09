// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSqlPoolTransparentDataEncryptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlPoolTransparentDataEncryptionArgs Empty = new GetSqlPoolTransparentDataEncryptionArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sqlPoolName", required=true)
    private final String sqlPoolName;

    public String getSqlPoolName() {
        return this.sqlPoolName;
    }

    @InputImport(name="transparentDataEncryptionName", required=true)
    private final String transparentDataEncryptionName;

    public String getTransparentDataEncryptionName() {
        return this.transparentDataEncryptionName;
    }

    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetSqlPoolTransparentDataEncryptionArgs(
        String resourceGroupName,
        String sqlPoolName,
        String transparentDataEncryptionName,
        String workspaceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlPoolName = Objects.requireNonNull(sqlPoolName, "expected parameter 'sqlPoolName' to be non-null");
        this.transparentDataEncryptionName = Objects.requireNonNull(transparentDataEncryptionName, "expected parameter 'transparentDataEncryptionName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetSqlPoolTransparentDataEncryptionArgs() {
        this.resourceGroupName = null;
        this.sqlPoolName = null;
        this.transparentDataEncryptionName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlPoolTransparentDataEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String sqlPoolName;
        private String transparentDataEncryptionName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlPoolTransparentDataEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlPoolName = defaults.sqlPoolName;
    	      this.transparentDataEncryptionName = defaults.transparentDataEncryptionName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSqlPoolName(String sqlPoolName) {
            this.sqlPoolName = Objects.requireNonNull(sqlPoolName);
            return this;
        }

        public Builder setTransparentDataEncryptionName(String transparentDataEncryptionName) {
            this.transparentDataEncryptionName = Objects.requireNonNull(transparentDataEncryptionName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetSqlPoolTransparentDataEncryptionArgs build() {
            return new GetSqlPoolTransparentDataEncryptionArgs(resourceGroupName, sqlPoolName, transparentDataEncryptionName, workspaceName);
        }
    }
}
