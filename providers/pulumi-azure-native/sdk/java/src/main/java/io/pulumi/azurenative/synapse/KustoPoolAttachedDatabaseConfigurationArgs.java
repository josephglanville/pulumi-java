// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.synapse.enums.DefaultPrincipalsModificationKind;
import io.pulumi.azurenative.synapse.inputs.TableLevelSharingPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KustoPoolAttachedDatabaseConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final KustoPoolAttachedDatabaseConfigurationArgs Empty = new KustoPoolAttachedDatabaseConfigurationArgs();

    /**
     * The name of the attached database configuration.
     * 
     */
    @Import(name="attachedDatabaseConfigurationName")
      private final @Nullable Output<String> attachedDatabaseConfigurationName;

    public Output<String> getAttachedDatabaseConfigurationName() {
        return this.attachedDatabaseConfigurationName == null ? Output.empty() : this.attachedDatabaseConfigurationName;
    }

    /**
     * The name of the database which you would like to attach, use * if you want to follow all current and future databases.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The default principals modification kind
     * 
     */
    @Import(name="defaultPrincipalsModificationKind", required=true)
      private final Output<Either<String,DefaultPrincipalsModificationKind>> defaultPrincipalsModificationKind;

    public Output<Either<String,DefaultPrincipalsModificationKind>> getDefaultPrincipalsModificationKind() {
        return this.defaultPrincipalsModificationKind;
    }

    /**
     * The name of the Kusto pool.
     * 
     */
    @Import(name="kustoPoolName", required=true)
      private final Output<String> kustoPoolName;

    public Output<String> getKustoPoolName() {
        return this.kustoPoolName;
    }

    /**
     * The resource id of the kusto pool where the databases you would like to attach reside.
     * 
     */
    @Import(name="kustoPoolResourceId", required=true)
      private final Output<String> kustoPoolResourceId;

    public Output<String> getKustoPoolResourceId() {
        return this.kustoPoolResourceId;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Table level sharing specifications
     * 
     */
    @Import(name="tableLevelSharingProperties")
      private final @Nullable Output<TableLevelSharingPropertiesArgs> tableLevelSharingProperties;

    public Output<TableLevelSharingPropertiesArgs> getTableLevelSharingProperties() {
        return this.tableLevelSharingProperties == null ? Output.empty() : this.tableLevelSharingProperties;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public KustoPoolAttachedDatabaseConfigurationArgs(
        @Nullable Output<String> attachedDatabaseConfigurationName,
        Output<String> databaseName,
        Output<Either<String,DefaultPrincipalsModificationKind>> defaultPrincipalsModificationKind,
        Output<String> kustoPoolName,
        Output<String> kustoPoolResourceId,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<TableLevelSharingPropertiesArgs> tableLevelSharingProperties,
        Output<String> workspaceName) {
        this.attachedDatabaseConfigurationName = attachedDatabaseConfigurationName;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.defaultPrincipalsModificationKind = Objects.requireNonNull(defaultPrincipalsModificationKind, "expected parameter 'defaultPrincipalsModificationKind' to be non-null");
        this.kustoPoolName = Objects.requireNonNull(kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
        this.kustoPoolResourceId = Objects.requireNonNull(kustoPoolResourceId, "expected parameter 'kustoPoolResourceId' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tableLevelSharingProperties = tableLevelSharingProperties;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private KustoPoolAttachedDatabaseConfigurationArgs() {
        this.attachedDatabaseConfigurationName = Output.empty();
        this.databaseName = Output.empty();
        this.defaultPrincipalsModificationKind = Output.empty();
        this.kustoPoolName = Output.empty();
        this.kustoPoolResourceId = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tableLevelSharingProperties = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KustoPoolAttachedDatabaseConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> attachedDatabaseConfigurationName;
        private Output<String> databaseName;
        private Output<Either<String,DefaultPrincipalsModificationKind>> defaultPrincipalsModificationKind;
        private Output<String> kustoPoolName;
        private Output<String> kustoPoolResourceId;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<TableLevelSharingPropertiesArgs> tableLevelSharingProperties;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(KustoPoolAttachedDatabaseConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedDatabaseConfigurationName = defaults.attachedDatabaseConfigurationName;
    	      this.databaseName = defaults.databaseName;
    	      this.defaultPrincipalsModificationKind = defaults.defaultPrincipalsModificationKind;
    	      this.kustoPoolName = defaults.kustoPoolName;
    	      this.kustoPoolResourceId = defaults.kustoPoolResourceId;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tableLevelSharingProperties = defaults.tableLevelSharingProperties;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder attachedDatabaseConfigurationName(@Nullable Output<String> attachedDatabaseConfigurationName) {
            this.attachedDatabaseConfigurationName = attachedDatabaseConfigurationName;
            return this;
        }
        public Builder attachedDatabaseConfigurationName(@Nullable String attachedDatabaseConfigurationName) {
            this.attachedDatabaseConfigurationName = Output.ofNullable(attachedDatabaseConfigurationName);
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
        public Builder defaultPrincipalsModificationKind(Output<Either<String,DefaultPrincipalsModificationKind>> defaultPrincipalsModificationKind) {
            this.defaultPrincipalsModificationKind = Objects.requireNonNull(defaultPrincipalsModificationKind);
            return this;
        }
        public Builder defaultPrincipalsModificationKind(Either<String,DefaultPrincipalsModificationKind> defaultPrincipalsModificationKind) {
            this.defaultPrincipalsModificationKind = Output.of(Objects.requireNonNull(defaultPrincipalsModificationKind));
            return this;
        }
        public Builder kustoPoolName(Output<String> kustoPoolName) {
            this.kustoPoolName = Objects.requireNonNull(kustoPoolName);
            return this;
        }
        public Builder kustoPoolName(String kustoPoolName) {
            this.kustoPoolName = Output.of(Objects.requireNonNull(kustoPoolName));
            return this;
        }
        public Builder kustoPoolResourceId(Output<String> kustoPoolResourceId) {
            this.kustoPoolResourceId = Objects.requireNonNull(kustoPoolResourceId);
            return this;
        }
        public Builder kustoPoolResourceId(String kustoPoolResourceId) {
            this.kustoPoolResourceId = Output.of(Objects.requireNonNull(kustoPoolResourceId));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tableLevelSharingProperties(@Nullable Output<TableLevelSharingPropertiesArgs> tableLevelSharingProperties) {
            this.tableLevelSharingProperties = tableLevelSharingProperties;
            return this;
        }
        public Builder tableLevelSharingProperties(@Nullable TableLevelSharingPropertiesArgs tableLevelSharingProperties) {
            this.tableLevelSharingProperties = Output.ofNullable(tableLevelSharingProperties);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public KustoPoolAttachedDatabaseConfigurationArgs build() {
            return new KustoPoolAttachedDatabaseConfigurationArgs(attachedDatabaseConfigurationName, databaseName, defaultPrincipalsModificationKind, kustoPoolName, kustoPoolResourceId, location, resourceGroupName, tableLevelSharingProperties, workspaceName);
        }
    }
}
