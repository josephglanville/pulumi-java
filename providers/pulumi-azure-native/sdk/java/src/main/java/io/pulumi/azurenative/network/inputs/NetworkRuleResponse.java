// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule of type network.
 * 
 */
public final class NetworkRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkRuleResponse Empty = new NetworkRuleResponse();

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @Import(name="destinationAddresses")
      private final @Nullable List<String> destinationAddresses;

    public List<String> getDestinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }

    /**
     * List of destination FQDNs.
     * 
     */
    @Import(name="destinationFqdns")
      private final @Nullable List<String> destinationFqdns;

    public List<String> getDestinationFqdns() {
        return this.destinationFqdns == null ? List.of() : this.destinationFqdns;
    }

    /**
     * List of destination IpGroups for this rule.
     * 
     */
    @Import(name="destinationIpGroups")
      private final @Nullable List<String> destinationIpGroups;

    public List<String> getDestinationIpGroups() {
        return this.destinationIpGroups == null ? List.of() : this.destinationIpGroups;
    }

    /**
     * List of destination ports.
     * 
     */
    @Import(name="destinationPorts")
      private final @Nullable List<String> destinationPorts;

    public List<String> getDestinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }

    /**
     * Array of FirewallPolicyRuleNetworkProtocols.
     * 
     */
    @Import(name="ipProtocols")
      private final @Nullable List<String> ipProtocols;

    public List<String> getIpProtocols() {
        return this.ipProtocols == null ? List.of() : this.ipProtocols;
    }

    /**
     * Name of the rule.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Rule Type.
     * Expected value is 'NetworkRule'.
     * 
     */
    @Import(name="ruleType", required=true)
      private final String ruleType;

    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
      private final @Nullable List<String> sourceAddresses;

    public List<String> getSourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
      private final @Nullable List<String> sourceIpGroups;

    public List<String> getSourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }

    public NetworkRuleResponse(
        @Nullable String description,
        @Nullable List<String> destinationAddresses,
        @Nullable List<String> destinationFqdns,
        @Nullable List<String> destinationIpGroups,
        @Nullable List<String> destinationPorts,
        @Nullable List<String> ipProtocols,
        @Nullable String name,
        String ruleType,
        @Nullable List<String> sourceAddresses,
        @Nullable List<String> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationFqdns = destinationFqdns;
        this.destinationIpGroups = destinationIpGroups;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    private NetworkRuleResponse() {
        this.description = null;
        this.destinationAddresses = List.of();
        this.destinationFqdns = List.of();
        this.destinationIpGroups = List.of();
        this.destinationPorts = List.of();
        this.ipProtocols = List.of();
        this.name = null;
        this.ruleType = null;
        this.sourceAddresses = List.of();
        this.sourceIpGroups = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationFqdns;
        private @Nullable List<String> destinationIpGroups;
        private @Nullable List<String> destinationPorts;
        private @Nullable List<String> ipProtocols;
        private @Nullable String name;
        private String ruleType;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationFqdns = defaults.destinationFqdns;
    	      this.destinationIpGroups = defaults.destinationIpGroups;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleType = defaults.ruleType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder destinationFqdns(@Nullable List<String> destinationFqdns) {
            this.destinationFqdns = destinationFqdns;
            return this;
        }
        public Builder destinationFqdns(String... destinationFqdns) {
            return destinationFqdns(List.of(destinationFqdns));
        }
        public Builder destinationIpGroups(@Nullable List<String> destinationIpGroups) {
            this.destinationIpGroups = destinationIpGroups;
            return this;
        }
        public Builder destinationIpGroups(String... destinationIpGroups) {
            return destinationIpGroups(List.of(destinationIpGroups));
        }
        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder ipProtocols(@Nullable List<String> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }
        public Builder ipProtocols(String... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }        public NetworkRuleResponse build() {
            return new NetworkRuleResponse(description, destinationAddresses, destinationFqdns, destinationIpGroups, destinationPorts, ipProtocols, name, ruleType, sourceAddresses, sourceIpGroups);
        }
    }
}
