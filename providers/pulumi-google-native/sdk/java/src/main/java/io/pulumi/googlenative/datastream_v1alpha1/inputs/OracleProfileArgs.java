// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle database profile.
 * 
 */
public final class OracleProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleProfileArgs Empty = new OracleProfileArgs();

    /**
     * Connection string attributes
     * 
     */
    @Import(name="connectionAttributes")
      private final @Nullable Output<Map<String,String>> connectionAttributes;

    public Output<Map<String,String>> getConnectionAttributes() {
        return this.connectionAttributes == null ? Codegen.empty() : this.connectionAttributes;
    }

    /**
     * Database for the Oracle connection.
     * 
     */
    @Import(name="databaseService", required=true)
      private final Output<String> databaseService;

    public Output<String> getDatabaseService() {
        return this.databaseService;
    }

    /**
     * Hostname for the Oracle connection.
     * 
     */
    @Import(name="hostname", required=true)
      private final Output<String> hostname;

    public Output<String> getHostname() {
        return this.hostname;
    }

    /**
     * Password for the Oracle connection.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> getPassword() {
        return this.password;
    }

    /**
     * Port for the Oracle connection, default value is 1521.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Username for the Oracle connection.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public OracleProfileArgs(
        @Nullable Output<Map<String,String>> connectionAttributes,
        Output<String> databaseService,
        Output<String> hostname,
        Output<String> password,
        @Nullable Output<Integer> port,
        Output<String> username) {
        this.connectionAttributes = connectionAttributes;
        this.databaseService = Objects.requireNonNull(databaseService, "expected parameter 'databaseService' to be non-null");
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.port = port;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private OracleProfileArgs() {
        this.connectionAttributes = Codegen.empty();
        this.databaseService = Codegen.empty();
        this.hostname = Codegen.empty();
        this.password = Codegen.empty();
        this.port = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> connectionAttributes;
        private Output<String> databaseService;
        private Output<String> hostname;
        private Output<String> password;
        private @Nullable Output<Integer> port;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionAttributes = defaults.connectionAttributes;
    	      this.databaseService = defaults.databaseService;
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.username = defaults.username;
        }

        public Builder connectionAttributes(@Nullable Output<Map<String,String>> connectionAttributes) {
            this.connectionAttributes = connectionAttributes;
            return this;
        }
        public Builder connectionAttributes(@Nullable Map<String,String> connectionAttributes) {
            this.connectionAttributes = Codegen.ofNullable(connectionAttributes);
            return this;
        }
        public Builder databaseService(Output<String> databaseService) {
            this.databaseService = Objects.requireNonNull(databaseService);
            return this;
        }
        public Builder databaseService(String databaseService) {
            this.databaseService = Output.of(Objects.requireNonNull(databaseService));
            return this;
        }
        public Builder hostname(Output<String> hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder hostname(String hostname) {
            this.hostname = Output.of(Objects.requireNonNull(hostname));
            return this;
        }
        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public OracleProfileArgs build() {
            return new OracleProfileArgs(connectionAttributes, databaseService, hostname, password, port, username);
        }
    }
}
