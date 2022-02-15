// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkInterfaceResponse {
    private final String privateIpAddress;
    private final String rdpAuthority;
    private final String sshAuthority;
    private final String username;

    @OutputCustomType.Constructor({"privateIpAddress","rdpAuthority","sshAuthority","username"})
    private NetworkInterfaceResponse(
        String privateIpAddress,
        String rdpAuthority,
        String sshAuthority,
        String username) {
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
        this.rdpAuthority = Objects.requireNonNull(rdpAuthority);
        this.sshAuthority = Objects.requireNonNull(sshAuthority);
        this.username = Objects.requireNonNull(username);
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    public String getRdpAuthority() {
        return this.rdpAuthority;
    }
    public String getSshAuthority() {
        return this.sshAuthority;
    }
    public String getUsername() {
        return this.username;
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