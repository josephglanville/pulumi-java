// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.NetworkInsightsAccessScopeProtocol;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopePacketHeaderStatementRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopePacketHeaderStatementRequestArgs Empty = new NetworkInsightsAccessScopePacketHeaderStatementRequestArgs();

    @Import(name="destinationAddresses")
      private final @Nullable Output<List<String>> destinationAddresses;

    public Output<List<String>> getDestinationAddresses() {
        return this.destinationAddresses == null ? Output.empty() : this.destinationAddresses;
    }

    @Import(name="destinationPorts")
      private final @Nullable Output<List<String>> destinationPorts;

    public Output<List<String>> getDestinationPorts() {
        return this.destinationPorts == null ? Output.empty() : this.destinationPorts;
    }

    @Import(name="destinationPrefixLists")
      private final @Nullable Output<List<String>> destinationPrefixLists;

    public Output<List<String>> getDestinationPrefixLists() {
        return this.destinationPrefixLists == null ? Output.empty() : this.destinationPrefixLists;
    }

    @Import(name="protocols")
      private final @Nullable Output<List<NetworkInsightsAccessScopeProtocol>> protocols;

    public Output<List<NetworkInsightsAccessScopeProtocol>> getProtocols() {
        return this.protocols == null ? Output.empty() : this.protocols;
    }

    @Import(name="sourceAddresses")
      private final @Nullable Output<List<String>> sourceAddresses;

    public Output<List<String>> getSourceAddresses() {
        return this.sourceAddresses == null ? Output.empty() : this.sourceAddresses;
    }

    @Import(name="sourcePorts")
      private final @Nullable Output<List<String>> sourcePorts;

    public Output<List<String>> getSourcePorts() {
        return this.sourcePorts == null ? Output.empty() : this.sourcePorts;
    }

    @Import(name="sourcePrefixLists")
      private final @Nullable Output<List<String>> sourcePrefixLists;

    public Output<List<String>> getSourcePrefixLists() {
        return this.sourcePrefixLists == null ? Output.empty() : this.sourcePrefixLists;
    }

    public NetworkInsightsAccessScopePacketHeaderStatementRequestArgs(
        @Nullable Output<List<String>> destinationAddresses,
        @Nullable Output<List<String>> destinationPorts,
        @Nullable Output<List<String>> destinationPrefixLists,
        @Nullable Output<List<NetworkInsightsAccessScopeProtocol>> protocols,
        @Nullable Output<List<String>> sourceAddresses,
        @Nullable Output<List<String>> sourcePorts,
        @Nullable Output<List<String>> sourcePrefixLists) {
        this.destinationAddresses = destinationAddresses;
        this.destinationPorts = destinationPorts;
        this.destinationPrefixLists = destinationPrefixLists;
        this.protocols = protocols;
        this.sourceAddresses = sourceAddresses;
        this.sourcePorts = sourcePorts;
        this.sourcePrefixLists = sourcePrefixLists;
    }

    private NetworkInsightsAccessScopePacketHeaderStatementRequestArgs() {
        this.destinationAddresses = Output.empty();
        this.destinationPorts = Output.empty();
        this.destinationPrefixLists = Output.empty();
        this.protocols = Output.empty();
        this.sourceAddresses = Output.empty();
        this.sourcePorts = Output.empty();
        this.sourcePrefixLists = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopePacketHeaderStatementRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> destinationAddresses;
        private @Nullable Output<List<String>> destinationPorts;
        private @Nullable Output<List<String>> destinationPrefixLists;
        private @Nullable Output<List<NetworkInsightsAccessScopeProtocol>> protocols;
        private @Nullable Output<List<String>> sourceAddresses;
        private @Nullable Output<List<String>> sourcePorts;
        private @Nullable Output<List<String>> sourcePrefixLists;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopePacketHeaderStatementRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.destinationPrefixLists = defaults.destinationPrefixLists;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourcePorts = defaults.sourcePorts;
    	      this.sourcePrefixLists = defaults.sourcePrefixLists;
        }

        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = Output.ofNullable(destinationAddresses);
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder destinationPorts(@Nullable Output<List<String>> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = Output.ofNullable(destinationPorts);
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder destinationPrefixLists(@Nullable Output<List<String>> destinationPrefixLists) {
            this.destinationPrefixLists = destinationPrefixLists;
            return this;
        }
        public Builder destinationPrefixLists(@Nullable List<String> destinationPrefixLists) {
            this.destinationPrefixLists = Output.ofNullable(destinationPrefixLists);
            return this;
        }
        public Builder destinationPrefixLists(String... destinationPrefixLists) {
            return destinationPrefixLists(List.of(destinationPrefixLists));
        }
        public Builder protocols(@Nullable Output<List<NetworkInsightsAccessScopeProtocol>> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(@Nullable List<NetworkInsightsAccessScopeProtocol> protocols) {
            this.protocols = Output.ofNullable(protocols);
            return this;
        }
        public Builder protocols(NetworkInsightsAccessScopeProtocol... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = Output.ofNullable(sourceAddresses);
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourcePorts(@Nullable Output<List<String>> sourcePorts) {
            this.sourcePorts = sourcePorts;
            return this;
        }
        public Builder sourcePorts(@Nullable List<String> sourcePorts) {
            this.sourcePorts = Output.ofNullable(sourcePorts);
            return this;
        }
        public Builder sourcePorts(String... sourcePorts) {
            return sourcePorts(List.of(sourcePorts));
        }
        public Builder sourcePrefixLists(@Nullable Output<List<String>> sourcePrefixLists) {
            this.sourcePrefixLists = sourcePrefixLists;
            return this;
        }
        public Builder sourcePrefixLists(@Nullable List<String> sourcePrefixLists) {
            this.sourcePrefixLists = Output.ofNullable(sourcePrefixLists);
            return this;
        }
        public Builder sourcePrefixLists(String... sourcePrefixLists) {
            return sourcePrefixLists(List.of(sourcePrefixLists));
        }        public NetworkInsightsAccessScopePacketHeaderStatementRequestArgs build() {
            return new NetworkInsightsAccessScopePacketHeaderStatementRequestArgs(destinationAddresses, destinationPorts, destinationPrefixLists, protocols, sourceAddresses, sourcePorts, sourcePrefixLists);
        }
    }
}
