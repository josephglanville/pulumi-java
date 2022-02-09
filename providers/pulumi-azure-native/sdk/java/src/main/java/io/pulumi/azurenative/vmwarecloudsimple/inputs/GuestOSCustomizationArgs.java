// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestOSCustomizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestOSCustomizationArgs Empty = new GuestOSCustomizationArgs();

    @InputImport(name="dnsServers")
    private final @Nullable Input<List<String>> dnsServers;

    public Input<List<String>> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    @InputImport(name="hostName")
    private final @Nullable Input<String> hostName;

    public Input<String> getHostName() {
        return this.hostName == null ? Input.empty() : this.hostName;
    }

    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    @InputImport(name="policyId")
    private final @Nullable Input<String> policyId;

    public Input<String> getPolicyId() {
        return this.policyId == null ? Input.empty() : this.policyId;
    }

    @InputImport(name="username")
    private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public GuestOSCustomizationArgs(
        @Nullable Input<List<String>> dnsServers,
        @Nullable Input<String> hostName,
        @Nullable Input<String> password,
        @Nullable Input<String> policyId,
        @Nullable Input<String> username) {
        this.dnsServers = dnsServers;
        this.hostName = hostName;
        this.password = password;
        this.policyId = policyId;
        this.username = username;
    }

    private GuestOSCustomizationArgs() {
        this.dnsServers = Input.empty();
        this.hostName = Input.empty();
        this.password = Input.empty();
        this.policyId = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestOSCustomizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> dnsServers;
        private @Nullable Input<String> hostName;
        private @Nullable Input<String> password;
        private @Nullable Input<String> policyId;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestOSCustomizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
    	      this.hostName = defaults.hostName;
    	      this.password = defaults.password;
    	      this.policyId = defaults.policyId;
    	      this.username = defaults.username;
        }

        public Builder setDnsServers(@Nullable Input<List<String>> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = Input.ofNullable(dnsServers);
            return this;
        }

        public Builder setHostName(@Nullable Input<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setHostName(@Nullable String hostName) {
            this.hostName = Input.ofNullable(hostName);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setPolicyId(@Nullable Input<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = Input.ofNullable(policyId);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }

        public GuestOSCustomizationArgs build() {
            return new GuestOSCustomizationArgs(dnsServers, hostName, password, policyId, username);
        }
    }
}
