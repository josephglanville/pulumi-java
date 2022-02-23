// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.EndpointRefArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a network reference in a service.
 * 
 */
public final class NetworkRefArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkRefArgs Empty = new NetworkRefArgs();

    /**
     * A list of endpoints that are exposed on this network.
     * 
     */
    @InputImport(name="endpointRefs")
      private final @Nullable Input<List<EndpointRefArgs>> endpointRefs;

    public Input<List<EndpointRefArgs>> getEndpointRefs() {
        return this.endpointRefs == null ? Input.empty() : this.endpointRefs;
    }

    /**
     * Name of the network
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public NetworkRefArgs(
        @Nullable Input<List<EndpointRefArgs>> endpointRefs,
        @Nullable Input<String> name) {
        this.endpointRefs = endpointRefs;
        this.name = name;
    }

    private NetworkRefArgs() {
        this.endpointRefs = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EndpointRefArgs>> endpointRefs;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRefArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointRefs = defaults.endpointRefs;
    	      this.name = defaults.name;
        }

        public Builder setEndpointRefs(@Nullable Input<List<EndpointRefArgs>> endpointRefs) {
            this.endpointRefs = endpointRefs;
            return this;
        }

        public Builder setEndpointRefs(@Nullable List<EndpointRefArgs> endpointRefs) {
            this.endpointRefs = Input.ofNullable(endpointRefs);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public NetworkRefArgs build() {
            return new NetworkRefArgs(endpointRefs, name);
        }
    }
}
