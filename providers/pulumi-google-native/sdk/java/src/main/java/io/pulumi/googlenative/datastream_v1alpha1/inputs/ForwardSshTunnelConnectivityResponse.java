// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Forward SSH Tunnel connectivity.
 * 
 */
public final class ForwardSshTunnelConnectivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ForwardSshTunnelConnectivityResponse Empty = new ForwardSshTunnelConnectivityResponse();

    /**
     * Hostname for the SSH tunnel.
     * 
     */
    @Import(name="hostname", required=true)
      private final String hostname;

    public String getHostname() {
        return this.hostname;
    }

    /**
     * Input only. SSH password.
     * 
     */
    @Import(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * Port for the SSH tunnel, default value is 22.
     * 
     */
    @Import(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * Input only. SSH private key.
     * 
     */
    @Import(name="privateKey", required=true)
      private final String privateKey;

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * Username for the SSH tunnel.
     * 
     */
    @Import(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public ForwardSshTunnelConnectivityResponse(
        String hostname,
        String password,
        Integer port,
        String privateKey,
        String username) {
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.privateKey = Objects.requireNonNull(privateKey, "expected parameter 'privateKey' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private ForwardSshTunnelConnectivityResponse() {
        this.hostname = null;
        this.password = null;
        this.port = null;
        this.privateKey = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardSshTunnelConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostname;
        private String password;
        private Integer port;
        private String privateKey;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardSshTunnelConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.privateKey = defaults.privateKey;
    	      this.username = defaults.username;
        }

        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public ForwardSshTunnelConnectivityResponse build() {
            return new ForwardSshTunnelConnectivityResponse(hostname, password, port, privateKey, username);
        }
    }
}
