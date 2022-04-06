// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAuthGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAuthGetArgs Empty = new ServiceAuthGetArgs();

    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    @Import(name="serverAddress", required=true)
      private final Output<String> serverAddress;

    public Output<String> getServerAddress() {
        return this.serverAddress;
    }

    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public ServiceAuthGetArgs(
        @Nullable Output<String> password,
        Output<String> serverAddress,
        @Nullable Output<String> username) {
        this.password = password;
        this.serverAddress = Objects.requireNonNull(serverAddress, "expected parameter 'serverAddress' to be non-null");
        this.username = username;
    }

    private ServiceAuthGetArgs() {
        this.password = Output.empty();
        this.serverAddress = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAuthGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private Output<String> serverAddress;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAuthGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.serverAddress = defaults.serverAddress;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder serverAddress(Output<String> serverAddress) {
            this.serverAddress = Objects.requireNonNull(serverAddress);
            return this;
        }
        public Builder serverAddress(String serverAddress) {
            this.serverAddress = Output.of(Objects.requireNonNull(serverAddress));
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }        public ServiceAuthGetArgs build() {
            return new ServiceAuthGetArgs(password, serverAddress, username);
        }
    }
}