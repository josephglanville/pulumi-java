// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyServerPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProxyServerPropertiesArgs Empty = new ProxyServerPropertiesArgs();

    @InputImport(name="ip")
    private final @Nullable Input<String> ip;

    public Input<String> getIp() {
        return this.ip == null ? Input.empty() : this.ip;
    }

    @InputImport(name="port")
    private final @Nullable Input<String> port;

    public Input<String> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public ProxyServerPropertiesArgs(
        @Nullable Input<String> ip,
        @Nullable Input<String> port) {
        this.ip = ip;
        this.port = port;
    }

    private ProxyServerPropertiesArgs() {
        this.ip = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyServerPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ip;
        private @Nullable Input<String> port;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyServerPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.port = defaults.port;
        }

        public Builder setIp(@Nullable Input<String> ip) {
            this.ip = ip;
            return this;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = Input.ofNullable(ip);
            return this;
        }

        public Builder setPort(@Nullable Input<String> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable String port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public ProxyServerPropertiesArgs build() {
            return new ProxyServerPropertiesArgs(ip, port);
        }
    }
}
