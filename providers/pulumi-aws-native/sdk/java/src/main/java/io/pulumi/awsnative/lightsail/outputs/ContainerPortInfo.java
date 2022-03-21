// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerPortInfo {
    private final @Nullable String port;
    private final @Nullable String protocol;

    @CustomType.Constructor
    private ContainerPortInfo(
        @CustomType.Parameter("port") @Nullable String port,
        @CustomType.Parameter("protocol") @Nullable String protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    public Optional<String> getPort() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String port;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPortInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }        public ContainerPortInfo build() {
            return new ContainerPortInfo(port, protocol);
        }
    }
}
