// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.NetworkInsightsAccessScopeProtocol;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAccessScopePacketHeaderStatementRequest {
    private final @Nullable List<String> destinationAddresses;
    private final @Nullable List<String> destinationPorts;
    private final @Nullable List<String> destinationPrefixLists;
    private final @Nullable List<NetworkInsightsAccessScopeProtocol> protocols;
    private final @Nullable List<String> sourceAddresses;
    private final @Nullable List<String> sourcePorts;
    private final @Nullable List<String> sourcePrefixLists;

    @CustomType.Constructor
    private NetworkInsightsAccessScopePacketHeaderStatementRequest(
        @CustomType.Parameter("destinationAddresses") @Nullable List<String> destinationAddresses,
        @CustomType.Parameter("destinationPorts") @Nullable List<String> destinationPorts,
        @CustomType.Parameter("destinationPrefixLists") @Nullable List<String> destinationPrefixLists,
        @CustomType.Parameter("protocols") @Nullable List<NetworkInsightsAccessScopeProtocol> protocols,
        @CustomType.Parameter("sourceAddresses") @Nullable List<String> sourceAddresses,
        @CustomType.Parameter("sourcePorts") @Nullable List<String> sourcePorts,
        @CustomType.Parameter("sourcePrefixLists") @Nullable List<String> sourcePrefixLists) {
        this.destinationAddresses = destinationAddresses;
        this.destinationPorts = destinationPorts;
        this.destinationPrefixLists = destinationPrefixLists;
        this.protocols = protocols;
        this.sourceAddresses = sourceAddresses;
        this.sourcePorts = sourcePorts;
        this.sourcePrefixLists = sourcePrefixLists;
    }

    public List<String> getDestinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }
    public List<String> getDestinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }
    public List<String> getDestinationPrefixLists() {
        return this.destinationPrefixLists == null ? List.of() : this.destinationPrefixLists;
    }
    public List<NetworkInsightsAccessScopeProtocol> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }
    public List<String> getSourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    public List<String> getSourcePorts() {
        return this.sourcePorts == null ? List.of() : this.sourcePorts;
    }
    public List<String> getSourcePrefixLists() {
        return this.sourcePrefixLists == null ? List.of() : this.sourcePrefixLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopePacketHeaderStatementRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationPorts;
        private @Nullable List<String> destinationPrefixLists;
        private @Nullable List<NetworkInsightsAccessScopeProtocol> protocols;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourcePorts;
        private @Nullable List<String> sourcePrefixLists;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopePacketHeaderStatementRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.destinationPrefixLists = defaults.destinationPrefixLists;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourcePorts = defaults.sourcePorts;
    	      this.sourcePrefixLists = defaults.sourcePrefixLists;
        }

        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder destinationPrefixLists(@Nullable List<String> destinationPrefixLists) {
            this.destinationPrefixLists = destinationPrefixLists;
            return this;
        }
        public Builder destinationPrefixLists(String... destinationPrefixLists) {
            return destinationPrefixLists(List.of(destinationPrefixLists));
        }
        public Builder protocols(@Nullable List<NetworkInsightsAccessScopeProtocol> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(NetworkInsightsAccessScopeProtocol... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourcePorts(@Nullable List<String> sourcePorts) {
            this.sourcePorts = sourcePorts;
            return this;
        }
        public Builder sourcePorts(String... sourcePorts) {
            return sourcePorts(List.of(sourcePorts));
        }
        public Builder sourcePrefixLists(@Nullable List<String> sourcePrefixLists) {
            this.sourcePrefixLists = sourcePrefixLists;
            return this;
        }
        public Builder sourcePrefixLists(String... sourcePrefixLists) {
            return sourcePrefixLists(List.of(sourcePrefixLists));
        }        public NetworkInsightsAccessScopePacketHeaderStatementRequest build() {
            return new NetworkInsightsAccessScopePacketHeaderStatementRequest(destinationAddresses, destinationPorts, destinationPrefixLists, protocols, sourceAddresses, sourcePorts, sourcePrefixLists);
        }
    }
}
