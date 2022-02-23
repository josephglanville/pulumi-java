// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A class representing follower database request.
 * 
 */
public final class FollowerDatabaseDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final FollowerDatabaseDefinitionResponse Empty = new FollowerDatabaseDefinitionResponse();

    /**
     * Resource name of the attached database configuration in the follower cluster.
     * 
     */
    @InputImport(name="attachedDatabaseConfigurationName", required=true)
      private final String attachedDatabaseConfigurationName;

    public String getAttachedDatabaseConfigurationName() {
        return this.attachedDatabaseConfigurationName;
    }

    /**
     * Resource id of the cluster that follows a database owned by this cluster.
     * 
     */
    @InputImport(name="clusterResourceId", required=true)
      private final String clusterResourceId;

    public String getClusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * The database name owned by this cluster that was followed. * in case following all databases.
     * 
     */
    @InputImport(name="databaseName", required=true)
      private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    public FollowerDatabaseDefinitionResponse(
        String attachedDatabaseConfigurationName,
        String clusterResourceId,
        String databaseName) {
        this.attachedDatabaseConfigurationName = Objects.requireNonNull(attachedDatabaseConfigurationName, "expected parameter 'attachedDatabaseConfigurationName' to be non-null");
        this.clusterResourceId = Objects.requireNonNull(clusterResourceId, "expected parameter 'clusterResourceId' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
    }

    private FollowerDatabaseDefinitionResponse() {
        this.attachedDatabaseConfigurationName = null;
        this.clusterResourceId = null;
        this.databaseName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FollowerDatabaseDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachedDatabaseConfigurationName;
        private String clusterResourceId;
        private String databaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(FollowerDatabaseDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedDatabaseConfigurationName = defaults.attachedDatabaseConfigurationName;
    	      this.clusterResourceId = defaults.clusterResourceId;
    	      this.databaseName = defaults.databaseName;
        }

        public Builder setAttachedDatabaseConfigurationName(String attachedDatabaseConfigurationName) {
            this.attachedDatabaseConfigurationName = Objects.requireNonNull(attachedDatabaseConfigurationName);
            return this;
        }

        public Builder setClusterResourceId(String clusterResourceId) {
            this.clusterResourceId = Objects.requireNonNull(clusterResourceId);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public FollowerDatabaseDefinitionResponse build() {
            return new FollowerDatabaseDefinitionResponse(attachedDatabaseConfigurationName, clusterResourceId, databaseName);
        }
    }
}
