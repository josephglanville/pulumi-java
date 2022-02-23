// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.ConnectionCloudSqlCredentialArgs;
import java.lang.String;
import java.util.Objects;


public final class ConnectionCloudSqlArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionCloudSqlArgs Empty = new ConnectionCloudSqlArgs();

    /**
     * Cloud SQL properties.
     * Structure is documented below.
     * 
     */
    @InputImport(name="credential", required=true)
      private final Input<ConnectionCloudSqlCredentialArgs> credential;

    public Input<ConnectionCloudSqlCredentialArgs> getCredential() {
        return this.credential;
    }

    /**
     * Database name.
     * 
     */
    @InputImport(name="database", required=true)
      private final Input<String> database;

    public Input<String> getDatabase() {
        return this.database;
    }

    /**
     * Cloud SQL instance ID in the form project:location:instance.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Type of the Cloud SQL database.
     * Possible values are `DATABASE_TYPE_UNSPECIFIED`, `POSTGRES`, and `MYSQL`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ConnectionCloudSqlArgs(
        Input<ConnectionCloudSqlCredentialArgs> credential,
        Input<String> database,
        Input<String> instanceId,
        Input<String> type) {
        this.credential = Objects.requireNonNull(credential, "expected parameter 'credential' to be non-null");
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ConnectionCloudSqlArgs() {
        this.credential = Input.empty();
        this.database = Input.empty();
        this.instanceId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionCloudSqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ConnectionCloudSqlCredentialArgs> credential;
        private Input<String> database;
        private Input<String> instanceId;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionCloudSqlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.database = defaults.database;
    	      this.instanceId = defaults.instanceId;
    	      this.type = defaults.type;
        }

        public Builder setCredential(Input<ConnectionCloudSqlCredentialArgs> credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder setCredential(ConnectionCloudSqlCredentialArgs credential) {
            this.credential = Input.of(Objects.requireNonNull(credential));
            return this;
        }

        public Builder setDatabase(Input<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setDatabase(String database) {
            this.database = Input.of(Objects.requireNonNull(database));
            return this;
        }

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ConnectionCloudSqlArgs build() {
            return new ConnectionCloudSqlArgs(credential, database, instanceId, type);
        }
    }
}
