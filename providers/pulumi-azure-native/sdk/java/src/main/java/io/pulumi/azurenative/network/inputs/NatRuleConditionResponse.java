// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NatRuleConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final NatRuleConditionResponse Empty = new NatRuleConditionResponse();

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

    @InputImport(name="destinationPorts")
    private final @Nullable List<String> destinationPorts;

    public List<String> getDestinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }

    @InputImport(name="ipProtocols")
    private final @Nullable List<String> ipProtocols;

    public List<String> getIpProtocols() {
        return this.ipProtocols == null ? List.of() : this.ipProtocols;
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="ruleConditionType", required=true)
    private final String ruleConditionType;

    public String getRuleConditionType() {
        return this.ruleConditionType;
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

    public NatRuleConditionResponse(
        @Nullable String description,
        @Nullable List<String> destinationAddresses,
        @Nullable List<String> destinationPorts,
        @Nullable List<String> ipProtocols,
        @Nullable String name,
        String ruleConditionType,
        @Nullable List<String> sourceAddresses,
        @Nullable List<String> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleConditionType = Objects.requireNonNull(ruleConditionType, "expected parameter 'ruleConditionType' to be non-null");
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    private NatRuleConditionResponse() {
        this.description = null;
        this.destinationAddresses = List.of();
        this.destinationPorts = List.of();
        this.ipProtocols = List.of();
        this.name = null;
        this.ruleConditionType = null;
        this.sourceAddresses = List.of();
        this.sourceIpGroups = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationPorts;
        private @Nullable List<String> ipProtocols;
        private @Nullable String name;
        private String ruleConditionType;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(NatRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleConditionType = defaults.ruleConditionType;
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

        public Builder setDestinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder setIpProtocols(@Nullable List<String> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = Objects.requireNonNull(ruleConditionType);
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

        public NatRuleConditionResponse build() {
            return new NatRuleConditionResponse(description, destinationAddresses, destinationPorts, ipProtocols, name, ruleConditionType, sourceAddresses, sourceIpGroups);
        }
    }
}
