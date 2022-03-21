// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupSocketAddress extends io.pulumi.resources.InvokeArgs {

    public static final DataflowEndpointGroupSocketAddress Empty = new DataflowEndpointGroupSocketAddress();

    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @Import(name="port")
      private final @Nullable Integer port;

    public Optional<Integer> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    public DataflowEndpointGroupSocketAddress(
        @Nullable String name,
        @Nullable Integer port) {
        this.name = name;
        this.port = port;
    }

    private DataflowEndpointGroupSocketAddress() {
        this.name = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataflowEndpointGroupSocketAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataflowEndpointGroupSocketAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }        public DataflowEndpointGroupSocketAddress build() {
            return new DataflowEndpointGroupSocketAddress(name, port);
        }
    }
}
