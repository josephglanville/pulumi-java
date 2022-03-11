// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FirewallPolicyRuleNetworkProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule of type nat.
 * 
 */
public final class NatRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NatRuleArgs Empty = new NatRuleArgs();

    /**
     * Description of the rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @InputImport(name="destinationAddresses")
      private final @Nullable Output<List<String>> destinationAddresses;

    public Output<List<String>> getDestinationAddresses() {
        return this.destinationAddresses == null ? Output.empty() : this.destinationAddresses;
    }

    /**
     * List of destination ports.
     * 
     */
    @InputImport(name="destinationPorts")
      private final @Nullable Output<List<String>> destinationPorts;

    public Output<List<String>> getDestinationPorts() {
        return this.destinationPorts == null ? Output.empty() : this.destinationPorts;
    }

    /**
     * Array of FirewallPolicyRuleNetworkProtocols.
     * 
     */
    @InputImport(name="ipProtocols")
      private final @Nullable Output<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols;

    public Output<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> getIpProtocols() {
        return this.ipProtocols == null ? Output.empty() : this.ipProtocols;
    }

    /**
     * Name of the rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Rule Type.
     * Expected value is 'NatRule'.
     * 
     */
    @InputImport(name="ruleType", required=true)
      private final Output<String> ruleType;

    public Output<String> getRuleType() {
        return this.ruleType;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @InputImport(name="sourceAddresses")
      private final @Nullable Output<List<String>> sourceAddresses;

    public Output<List<String>> getSourceAddresses() {
        return this.sourceAddresses == null ? Output.empty() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @InputImport(name="sourceIpGroups")
      private final @Nullable Output<List<String>> sourceIpGroups;

    public Output<List<String>> getSourceIpGroups() {
        return this.sourceIpGroups == null ? Output.empty() : this.sourceIpGroups;
    }

    /**
     * The translated address for this NAT rule.
     * 
     */
    @InputImport(name="translatedAddress")
      private final @Nullable Output<String> translatedAddress;

    public Output<String> getTranslatedAddress() {
        return this.translatedAddress == null ? Output.empty() : this.translatedAddress;
    }

    /**
     * The translated FQDN for this NAT rule.
     * 
     */
    @InputImport(name="translatedFqdn")
      private final @Nullable Output<String> translatedFqdn;

    public Output<String> getTranslatedFqdn() {
        return this.translatedFqdn == null ? Output.empty() : this.translatedFqdn;
    }

    /**
     * The translated port for this NAT rule.
     * 
     */
    @InputImport(name="translatedPort")
      private final @Nullable Output<String> translatedPort;

    public Output<String> getTranslatedPort() {
        return this.translatedPort == null ? Output.empty() : this.translatedPort;
    }

    public NatRuleArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> destinationAddresses,
        @Nullable Output<List<String>> destinationPorts,
        @Nullable Output<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols,
        @Nullable Output<String> name,
        Output<String> ruleType,
        @Nullable Output<List<String>> sourceAddresses,
        @Nullable Output<List<String>> sourceIpGroups,
        @Nullable Output<String> translatedAddress,
        @Nullable Output<String> translatedFqdn,
        @Nullable Output<String> translatedPort) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.translatedAddress = translatedAddress;
        this.translatedFqdn = translatedFqdn;
        this.translatedPort = translatedPort;
    }

    private NatRuleArgs() {
        this.description = Output.empty();
        this.destinationAddresses = Output.empty();
        this.destinationPorts = Output.empty();
        this.ipProtocols = Output.empty();
        this.name = Output.empty();
        this.ruleType = Output.empty();
        this.sourceAddresses = Output.empty();
        this.sourceIpGroups = Output.empty();
        this.translatedAddress = Output.empty();
        this.translatedFqdn = Output.empty();
        this.translatedPort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> destinationAddresses;
        private @Nullable Output<List<String>> destinationPorts;
        private @Nullable Output<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols;
        private @Nullable Output<String> name;
        private Output<String> ruleType;
        private @Nullable Output<List<String>> sourceAddresses;
        private @Nullable Output<List<String>> sourceIpGroups;
        private @Nullable Output<String> translatedAddress;
        private @Nullable Output<String> translatedFqdn;
        private @Nullable Output<String> translatedPort;

        public Builder() {
    	      // Empty
        }

        public Builder(NatRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleType = defaults.ruleType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.translatedAddress = defaults.translatedAddress;
    	      this.translatedFqdn = defaults.translatedFqdn;
    	      this.translatedPort = defaults.translatedPort;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }

        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = Output.ofNullable(destinationAddresses);
            return this;
        }

        public Builder destinationPorts(@Nullable Output<List<String>> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = Output.ofNullable(destinationPorts);
            return this;
        }

        public Builder ipProtocols(@Nullable Output<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }

        public Builder ipProtocols(@Nullable List<Either<String,FirewallPolicyRuleNetworkProtocol>> ipProtocols) {
            this.ipProtocols = Output.ofNullable(ipProtocols);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder ruleType(Output<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder ruleType(String ruleType) {
            this.ruleType = Output.of(Objects.requireNonNull(ruleType));
            return this;
        }

        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = Output.ofNullable(sourceAddresses);
            return this;
        }

        public Builder sourceIpGroups(@Nullable Output<List<String>> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }

        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = Output.ofNullable(sourceIpGroups);
            return this;
        }

        public Builder translatedAddress(@Nullable Output<String> translatedAddress) {
            this.translatedAddress = translatedAddress;
            return this;
        }

        public Builder translatedAddress(@Nullable String translatedAddress) {
            this.translatedAddress = Output.ofNullable(translatedAddress);
            return this;
        }

        public Builder translatedFqdn(@Nullable Output<String> translatedFqdn) {
            this.translatedFqdn = translatedFqdn;
            return this;
        }

        public Builder translatedFqdn(@Nullable String translatedFqdn) {
            this.translatedFqdn = Output.ofNullable(translatedFqdn);
            return this;
        }

        public Builder translatedPort(@Nullable Output<String> translatedPort) {
            this.translatedPort = translatedPort;
            return this;
        }

        public Builder translatedPort(@Nullable String translatedPort) {
            this.translatedPort = Output.ofNullable(translatedPort);
            return this;
        }
        public NatRuleArgs build() {
            return new NatRuleArgs(description, destinationAddresses, destinationPorts, ipProtocols, name, ruleType, sourceAddresses, sourceIpGroups, translatedAddress, translatedFqdn, translatedPort);
        }
    }
}
