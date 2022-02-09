// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ConnectionMonitorEndpointFilterType;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorEndpointFilterItemArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionMonitorEndpointFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorEndpointFilterArgs Empty = new ConnectionMonitorEndpointFilterArgs();

    @InputImport(name="items")
    private final @Nullable Input<List<ConnectionMonitorEndpointFilterItemArgs>> items;

    public Input<List<ConnectionMonitorEndpointFilterItemArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    @InputImport(name="type")
    private final @Nullable Input<Either<String,ConnectionMonitorEndpointFilterType>> type;

    public Input<Either<String,ConnectionMonitorEndpointFilterType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ConnectionMonitorEndpointFilterArgs(
        @Nullable Input<List<ConnectionMonitorEndpointFilterItemArgs>> items,
        @Nullable Input<Either<String,ConnectionMonitorEndpointFilterType>> type) {
        this.items = items;
        this.type = type;
    }

    private ConnectionMonitorEndpointFilterArgs() {
        this.items = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ConnectionMonitorEndpointFilterItemArgs>> items;
        private @Nullable Input<Either<String,ConnectionMonitorEndpointFilterType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.type = defaults.type;
        }

        public Builder setItems(@Nullable Input<List<ConnectionMonitorEndpointFilterItemArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable List<ConnectionMonitorEndpointFilterItemArgs> items) {
            this.items = Input.ofNullable(items);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,ConnectionMonitorEndpointFilterType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ConnectionMonitorEndpointFilterType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public ConnectionMonitorEndpointFilterArgs build() {
            return new ConnectionMonitorEndpointFilterArgs(items, type);
        }
    }
}
