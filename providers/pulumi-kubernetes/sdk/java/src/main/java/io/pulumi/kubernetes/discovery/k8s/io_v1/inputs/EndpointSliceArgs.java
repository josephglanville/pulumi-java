// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.discovery.k8s.io_v1.inputs.EndpointArgs;
import io.pulumi.kubernetes.discovery.k8s.io_v1.inputs.EndpointPortArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
 * 
 */
public final class EndpointSliceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointSliceArgs Empty = new EndpointSliceArgs();

    /**
     * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     * Possible enum values:
     *  - `"FQDN"` represents a FQDN.
     *  - `"IPv4"` represents an IPv4 Address.
     *  - `"IPv6"` represents an IPv6 Address.
     * 
     */
    @Import(name="addressType", required=true)
      private final Output<String> addressType;

    public Output<String> getAddressType() {
        return this.addressType;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * 
     */
    @Import(name="endpoints", required=true)
      private final Output<List<EndpointArgs>> endpoints;

    public Output<List<EndpointArgs>> getEndpoints() {
        return this.endpoints;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Standard object's metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<EndpointPortArgs>> ports;

    public Output<List<EndpointPortArgs>> getPorts() {
        return this.ports == null ? Output.empty() : this.ports;
    }

    public EndpointSliceArgs(
        Output<String> addressType,
        @Nullable Output<String> apiVersion,
        Output<List<EndpointArgs>> endpoints,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<List<EndpointPortArgs>> ports) {
        this.addressType = Objects.requireNonNull(addressType, "expected parameter 'addressType' to be non-null");
        this.apiVersion = apiVersion;
        this.endpoints = Objects.requireNonNull(endpoints, "expected parameter 'endpoints' to be non-null");
        this.kind = kind;
        this.metadata = metadata;
        this.ports = ports;
    }

    private EndpointSliceArgs() {
        this.addressType = Output.empty();
        this.apiVersion = Output.empty();
        this.endpoints = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.ports = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointSliceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> addressType;
        private @Nullable Output<String> apiVersion;
        private Output<List<EndpointArgs>> endpoints;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<List<EndpointPortArgs>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointSliceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressType = defaults.addressType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.endpoints = defaults.endpoints;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.ports = defaults.ports;
        }

        public Builder addressType(Output<String> addressType) {
            this.addressType = Objects.requireNonNull(addressType);
            return this;
        }
        public Builder addressType(String addressType) {
            this.addressType = Output.of(Objects.requireNonNull(addressType));
            return this;
        }
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }
        public Builder endpoints(Output<List<EndpointArgs>> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder endpoints(List<EndpointArgs> endpoints) {
            this.endpoints = Output.of(Objects.requireNonNull(endpoints));
            return this;
        }
        public Builder endpoints(EndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder ports(@Nullable Output<List<EndpointPortArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<EndpointPortArgs> ports) {
            this.ports = Output.ofNullable(ports);
            return this;
        }
        public Builder ports(EndpointPortArgs... ports) {
            return ports(List.of(ports));
        }        public EndpointSliceArgs build() {
            return new EndpointSliceArgs(addressType, apiVersion, endpoints, kind, metadata, ports);
        }
    }
}
