// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ConnectionMonitorEndpointFilterItemType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor endpoint filter item.
 * 
 */
public final class ConnectionMonitorEndpointFilterItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorEndpointFilterItemArgs Empty = new ConnectionMonitorEndpointFilterItemArgs();

    /**
     * The address of the filter item.
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> getAddress() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    /**
     * The type of item included in the filter. Currently only 'AgentAddress' is supported.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,ConnectionMonitorEndpointFilterItemType>> type;

    public Output<Either<String,ConnectionMonitorEndpointFilterItemType>> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ConnectionMonitorEndpointFilterItemArgs(
        @Nullable Output<String> address,
        @Nullable Output<Either<String,ConnectionMonitorEndpointFilterItemType>> type) {
        this.address = address;
        this.type = type;
    }

    private ConnectionMonitorEndpointFilterItemArgs() {
        this.address = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointFilterItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<Either<String,ConnectionMonitorEndpointFilterItemType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointFilterItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.type = defaults.type;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,ConnectionMonitorEndpointFilterItemType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,ConnectionMonitorEndpointFilterItemType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ConnectionMonitorEndpointFilterItemArgs build() {
            return new ConnectionMonitorEndpointFilterItemArgs(address, type);
        }
    }
}
