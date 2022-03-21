// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datamigration_v1.inputs.SslConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies connection parameters required specifically for PostgreSQL databases.
 * 
 */
public final class PostgreSqlConnectionProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final PostgreSqlConnectionProfileResponse Empty = new PostgreSqlConnectionProfileResponse();

    /**
     * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source.
     * 
     */
    @Import(name="cloudSqlId", required=true)
      private final String cloudSqlId;

    public String getCloudSqlId() {
        return this.cloudSqlId;
    }

    /**
     * The IP or hostname of the source PostgreSQL database.
     * 
     */
    @Import(name="host", required=true)
      private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is encrypted when stored in Database Migration Service.
     * 
     */
    @Import(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * Indicates If this connection profile password is stored.
     * 
     */
    @Import(name="passwordSet", required=true)
      private final Boolean passwordSet;

    public Boolean getPasswordSet() {
        return this.passwordSet;
    }

    /**
     * The network port of the source PostgreSQL database.
     * 
     */
    @Import(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * SSL configuration for the destination to connect to the source database.
     * 
     */
    @Import(name="ssl", required=true)
      private final SslConfigResponse ssl;

    public SslConfigResponse getSsl() {
        return this.ssl;
    }

    /**
     * The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service.
     * 
     */
    @Import(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public PostgreSqlConnectionProfileResponse(
        String cloudSqlId,
        String host,
        String password,
        Boolean passwordSet,
        Integer port,
        SslConfigResponse ssl,
        String username) {
        this.cloudSqlId = Objects.requireNonNull(cloudSqlId, "expected parameter 'cloudSqlId' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.passwordSet = Objects.requireNonNull(passwordSet, "expected parameter 'passwordSet' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.ssl = Objects.requireNonNull(ssl, "expected parameter 'ssl' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private PostgreSqlConnectionProfileResponse() {
        this.cloudSqlId = null;
        this.host = null;
        this.password = null;
        this.passwordSet = null;
        this.port = null;
        this.ssl = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgreSqlConnectionProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudSqlId;
        private String host;
        private String password;
        private Boolean passwordSet;
        private Integer port;
        private SslConfigResponse ssl;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgreSqlConnectionProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlId = defaults.cloudSqlId;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.passwordSet = defaults.passwordSet;
    	      this.port = defaults.port;
    	      this.ssl = defaults.ssl;
    	      this.username = defaults.username;
        }

        public Builder cloudSqlId(String cloudSqlId) {
            this.cloudSqlId = Objects.requireNonNull(cloudSqlId);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder passwordSet(Boolean passwordSet) {
            this.passwordSet = Objects.requireNonNull(passwordSet);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder ssl(SslConfigResponse ssl) {
            this.ssl = Objects.requireNonNull(ssl);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public PostgreSqlConnectionProfileResponse build() {
            return new PostgreSqlConnectionProfileResponse(cloudSqlId, host, password, passwordSet, port, ssl, username);
        }
    }
}
