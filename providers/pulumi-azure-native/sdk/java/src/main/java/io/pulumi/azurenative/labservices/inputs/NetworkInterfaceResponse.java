// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class NetworkInterfaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceResponse Empty = new NetworkInterfaceResponse();

    @InputImport(name="privateIpAddress", required=true)
    private final String privateIpAddress;

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    @InputImport(name="rdpAuthority", required=true)
    private final String rdpAuthority;

    public String getRdpAuthority() {
        return this.rdpAuthority;
    }

    @InputImport(name="sshAuthority", required=true)
    private final String sshAuthority;

    public String getSshAuthority() {
        return this.sshAuthority;
    }

    @InputImport(name="username", required=true)
    private final String username;

    public String getUsername() {
        return this.username;
    }

    public NetworkInterfaceResponse(
        String privateIpAddress,
        String rdpAuthority,
        String sshAuthority,
        String username) {
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
        this.rdpAuthority = Objects.requireNonNull(rdpAuthority, "expected parameter 'rdpAuthority' to be non-null");
        this.sshAuthority = Objects.requireNonNull(sshAuthority, "expected parameter 'sshAuthority' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private NetworkInterfaceResponse() {
        this.privateIpAddress = null;
        this.rdpAuthority = null;
        this.sshAuthority = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateIpAddress;
        private String rdpAuthority;
        private String sshAuthority;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.rdpAuthority = defaults.rdpAuthority;
    	      this.sshAuthority = defaults.sshAuthority;
    	      this.username = defaults.username;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setRdpAuthority(String rdpAuthority) {
            this.rdpAuthority = Objects.requireNonNull(rdpAuthority);
            return this;
        }

        public Builder setSshAuthority(String sshAuthority) {
            this.sshAuthority = Objects.requireNonNull(sshAuthority);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(privateIpAddress, rdpAuthority, sshAuthority, username);
        }
    }
}
