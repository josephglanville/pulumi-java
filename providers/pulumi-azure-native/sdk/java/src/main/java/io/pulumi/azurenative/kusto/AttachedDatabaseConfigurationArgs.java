// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.DefaultPrincipalsModificationKind;
import io.pulumi.azurenative.kusto.inputs.TableLevelSharingPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttachedDatabaseConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttachedDatabaseConfigurationArgs Empty = new AttachedDatabaseConfigurationArgs();

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
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The resource id of the cluster where the databases you would like to attach reside.
     * 
     */
    @Import(name="clusterResourceId", required=true)
      private final Output<String> clusterResourceId;

    public Output<String> getClusterResourceId() {
        return this.clusterResourceId;
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
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
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

    /**
     * Table level sharing specifications
     * 
     */
    @Import(name="tableLevelSharingProperties")
      private final @Nullable Output<TableLevelSharingPropertiesArgs> tableLevelSharingProperties;

    public Output<TableLevelSharingPropertiesArgs> getTableLevelSharingProperties() {
        return this.tableLevelSharingProperties == null ? Output.empty() : this.tableLevelSharingProperties;
    }

    public AttachedDatabaseConfigurationArgs(
        @Nullable Output<String> attachedDatabaseConfigurationName,
        Output<String> clusterName,
        Output<String> clusterResourceId,
        Output<String> databaseName,
        Output<Either<String,DefaultPrincipalsModificationKind>> defaultPrincipalsModificationKind,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<TableLevelSharingPropertiesArgs> tableLevelSharingProperties) {
        this.attachedDatabaseConfigurationName = attachedDatabaseConfigurationName;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterResourceId = Objects.requireNonNull(clusterResourceId, "expected parameter 'clusterResourceId' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.defaultPrincipalsModificationKind = Objects.requireNonNull(defaultPrincipalsModificationKind, "expected parameter 'defaultPrincipalsModificationKind' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tableLevelSharingProperties = tableLevelSharingProperties;
    }

    private AttachedDatabaseConfigurationArgs() {
        this.attachedDatabaseConfigurationName = Output.empty();
        this.clusterName = Output.empty();
        this.clusterResourceId = Output.empty();
        this.databaseName = Output.empty();
        this.defaultPrincipalsModificationKind = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tableLevelSharingProperties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDatabaseConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> attachedDatabaseConfigurationName;
        private Output<String> clusterName;
        private Output<String> clusterResourceId;
        private Output<String> databaseName;
        private Output<Either<String,DefaultPrincipalsModificationKind>> defaultPrincipalsModificationKind;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<TableLevelSharingPropertiesArgs> tableLevelSharingProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDatabaseConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedDatabaseConfigurationName = defaults.attachedDatabaseConfigurationName;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterResourceId = defaults.clusterResourceId;
    	      this.databaseName = defaults.databaseName;
    	      this.defaultPrincipalsModificationKind = defaults.defaultPrincipalsModificationKind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tableLevelSharingProperties = defaults.tableLevelSharingProperties;
        }

        public Builder attachedDatabaseConfigurationName(@Nullable Output<String> attachedDatabaseConfigurationName) {
            this.attachedDatabaseConfigurationName = attachedDatabaseConfigurationName;
            return this;
        }
        public Builder attachedDatabaseConfigurationName(@Nullable String attachedDatabaseConfigurationName) {
            this.attachedDatabaseConfigurationName = Output.ofNullable(attachedDatabaseConfigurationName);
            return this;
        }
        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder clusterResourceId(Output<String> clusterResourceId) {
            this.clusterResourceId = Objects.requireNonNull(clusterResourceId);
            return this;
        }
        public Builder clusterResourceId(String clusterResourceId) {
            this.clusterResourceId = Output.of(Objects.requireNonNull(clusterResourceId));
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
        }        public AttachedDatabaseConfigurationArgs build() {
            return new AttachedDatabaseConfigurationArgs(attachedDatabaseConfigurationName, clusterName, clusterResourceId, databaseName, defaultPrincipalsModificationKind, location, resourceGroupName, tableLevelSharingProperties);
        }
    }
}
