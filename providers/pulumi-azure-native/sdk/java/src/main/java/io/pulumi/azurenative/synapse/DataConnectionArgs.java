// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.synapse.enums.DataConnectionKind;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataConnectionArgs Empty = new DataConnectionArgs();

    @InputImport(name="dataConnectionName")
    private final @Nullable Input<String> dataConnectionName;

    public Input<String> getDataConnectionName() {
        return this.dataConnectionName == null ? Input.empty() : this.dataConnectionName;
    }

    @InputImport(name="databaseName", required=true)
    private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="kind", required=true)
    private final Input<Either<String,DataConnectionKind>> kind;

    public Input<Either<String,DataConnectionKind>> getKind() {
        return this.kind;
    }

    @InputImport(name="kustoPoolName", required=true)
    private final Input<String> kustoPoolName;

    public Input<String> getKustoPoolName() {
        return this.kustoPoolName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public DataConnectionArgs(
        @Nullable Input<String> dataConnectionName,
        Input<String> databaseName,
        Input<Either<String,DataConnectionKind>> kind,
        Input<String> kustoPoolName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<String> workspaceName) {
        this.dataConnectionName = dataConnectionName;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.kustoPoolName = Objects.requireNonNull(kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private DataConnectionArgs() {
        this.dataConnectionName = Input.empty();
        this.databaseName = Input.empty();
        this.kind = Input.empty();
        this.kustoPoolName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataConnectionName;
        private Input<String> databaseName;
        private Input<Either<String,DataConnectionKind>> kind;
        private Input<String> kustoPoolName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.kind = defaults.kind;
    	      this.kustoPoolName = defaults.kustoPoolName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setDataConnectionName(@Nullable Input<String> dataConnectionName) {
            this.dataConnectionName = dataConnectionName;
            return this;
        }

        public Builder setDataConnectionName(@Nullable String dataConnectionName) {
            this.dataConnectionName = Input.ofNullable(dataConnectionName);
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setKind(Input<Either<String,DataConnectionKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,DataConnectionKind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setKustoPoolName(Input<String> kustoPoolName) {
            this.kustoPoolName = Objects.requireNonNull(kustoPoolName);
            return this;
        }

        public Builder setKustoPoolName(String kustoPoolName) {
            this.kustoPoolName = Input.of(Objects.requireNonNull(kustoPoolName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public DataConnectionArgs build() {
            return new DataConnectionArgs(dataConnectionName, databaseName, kind, kustoPoolName, location, resourceGroupName, workspaceName);
        }
    }
}
