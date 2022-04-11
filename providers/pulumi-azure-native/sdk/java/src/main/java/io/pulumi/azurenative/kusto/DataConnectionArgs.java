// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.DataConnectionKind;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataConnectionArgs Empty = new DataConnectionArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the data connection.
     * 
     */
    @Import(name="dataConnectionName")
      private final @Nullable Output<String> dataConnectionName;

    public Output<String> getDataConnectionName() {
        return this.dataConnectionName == null ? Codegen.empty() : this.dataConnectionName;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Kind of the endpoint for the data connection
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,DataConnectionKind>> kind;

    public Output<Either<String,DataConnectionKind>> getKind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DataConnectionArgs(
        Output<String> clusterName,
        @Nullable Output<String> dataConnectionName,
        Output<String> databaseName,
        Output<Either<String,DataConnectionKind>> kind,
        @Nullable Output<String> location,
        Output<String> resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.dataConnectionName = dataConnectionName;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private DataConnectionArgs() {
        this.clusterName = Codegen.empty();
        this.dataConnectionName = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private @Nullable Output<String> dataConnectionName;
        private Output<String> databaseName;
        private Output<Either<String,DataConnectionKind>> kind;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder dataConnectionName(@Nullable Output<String> dataConnectionName) {
            this.dataConnectionName = dataConnectionName;
            return this;
        }
        public Builder dataConnectionName(@Nullable String dataConnectionName) {
            this.dataConnectionName = Codegen.ofNullable(dataConnectionName);
            return this;
        }
        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder kind(Output<Either<String,DataConnectionKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,DataConnectionKind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public DataConnectionArgs build() {
            return new DataConnectionArgs(clusterName, dataConnectionName, databaseName, kind, location, resourceGroupName);
        }
    }
}
