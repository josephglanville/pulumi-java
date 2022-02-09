// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureFirewallNetworkRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFirewallNetworkRuleResponse Empty = new AzureFirewallNetworkRuleResponse();

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="destinationAddresses")
    private final @Nullable List<String> destinationAddresses;

    public List<String> getDestinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }

    @InputImport(name="destinationFqdns")
    private final @Nullable List<String> destinationFqdns;

    public List<String> getDestinationFqdns() {
        return this.destinationFqdns == null ? List.of() : this.destinationFqdns;
    }

    @InputImport(name="destinationIpGroups")
    private final @Nullable List<String> destinationIpGroups;

    public List<String> getDestinationIpGroups() {
        return this.destinationIpGroups == null ? List.of() : this.destinationIpGroups;
    }

    @InputImport(name="destinationPorts")
    private final @Nullable List<String> destinationPorts;

    public List<String> getDestinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="protocols")
    private final @Nullable List<String> protocols;

    public List<String> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }

    @InputImport(name="sourceAddresses")
    private final @Nullable List<String> sourceAddresses;

    public List<String> getSourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }

    @InputImport(name="sourceIpGroups")
    private final @Nullable List<String> sourceIpGroups;

    public List<String> getSourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }

    public AzureFirewallNetworkRuleResponse(
        @Nullable String description,
        @Nullable List<String> destinationAddresses,
        @Nullable List<String> destinationFqdns,
        @Nullable List<String> destinationIpGroups,
        @Nullable List<String> destinationPorts,
        @Nullable String name,
        @Nullable List<String> protocols,
        @Nullable List<String> sourceAddresses,
        @Nullable List<String> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationFqdns = destinationFqdns;
        this.destinationIpGroups = destinationIpGroups;
        this.destinationPorts = destinationPorts;
        this.name = name;
        this.protocols = protocols;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    private AzureFirewallNetworkRuleResponse() {
        this.description = null;
        this.destinationAddresses = List.of();
        this.destinationFqdns = List.of();
        this.destinationIpGroups = List.of();
        this.destinationPorts = List.of();
        this.name = null;
        this.protocols = List.of();
        this.sourceAddresses = List.of();
        this.sourceIpGroups = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationFqdns;
        private @Nullable List<String> destinationIpGroups;
        private @Nullable List<String> destinationPorts;
        private @Nullable String name;
        private @Nullable List<String> protocols;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationFqdns = defaults.destinationFqdns;
    	      this.destinationIpGroups = defaults.destinationIpGroups;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDestinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }

        public Builder setDestinationFqdns(@Nullable List<String> destinationFqdns) {
            this.destinationFqdns = destinationFqdns;
            return this;
        }

        public Builder setDestinationIpGroups(@Nullable List<String> destinationIpGroups) {
            this.destinationIpGroups = destinationIpGroups;
            return this;
        }

        public Builder setDestinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProtocols(@Nullable List<String> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setSourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder setSourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }

        public AzureFirewallNetworkRuleResponse build() {
            return new AzureFirewallNetworkRuleResponse(description, destinationAddresses, destinationFqdns, destinationIpGroups, destinationPorts, name, protocols, sourceAddresses, sourceIpGroups);
        }
    }
}
