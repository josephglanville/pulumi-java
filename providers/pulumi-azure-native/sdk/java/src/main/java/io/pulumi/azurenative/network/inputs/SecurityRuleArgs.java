// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.SecurityRuleAccess;
import io.pulumi.azurenative.network.enums.SecurityRuleDirection;
import io.pulumi.azurenative.network.enums.SecurityRuleProtocol;
import io.pulumi.azurenative.network.inputs.ApplicationSecurityGroupArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network security rule.
 * 
 */
public final class SecurityRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityRuleArgs Empty = new SecurityRuleArgs();

    /**
     * The network traffic is allowed or denied.
     * 
     */
    @InputImport(name="access", required=true)
      private final Output<Either<String,SecurityRuleAccess>> access;

    public Output<Either<String,SecurityRuleAccess>> getAccess() {
        return this.access;
    }

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The destination address prefix. CIDR or destination IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     * 
     */
    @InputImport(name="destinationAddressPrefix")
      private final @Nullable Output<String> destinationAddressPrefix;

    public Output<String> getDestinationAddressPrefix() {
        return this.destinationAddressPrefix == null ? Output.empty() : this.destinationAddressPrefix;
    }

    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    @InputImport(name="destinationAddressPrefixes")
      private final @Nullable Output<List<String>> destinationAddressPrefixes;

    public Output<List<String>> getDestinationAddressPrefixes() {
        return this.destinationAddressPrefixes == null ? Output.empty() : this.destinationAddressPrefixes;
    }

    /**
     * The application security group specified as destination.
     * 
     */
    @InputImport(name="destinationApplicationSecurityGroups")
      private final @Nullable Output<List<ApplicationSecurityGroupArgs>> destinationApplicationSecurityGroups;

    public Output<List<ApplicationSecurityGroupArgs>> getDestinationApplicationSecurityGroups() {
        return this.destinationApplicationSecurityGroups == null ? Output.empty() : this.destinationApplicationSecurityGroups;
    }

    /**
     * The destination port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    @InputImport(name="destinationPortRange")
      private final @Nullable Output<String> destinationPortRange;

    public Output<String> getDestinationPortRange() {
        return this.destinationPortRange == null ? Output.empty() : this.destinationPortRange;
    }

    /**
     * The destination port ranges.
     * 
     */
    @InputImport(name="destinationPortRanges")
      private final @Nullable Output<List<String>> destinationPortRanges;

    public Output<List<String>> getDestinationPortRanges() {
        return this.destinationPortRanges == null ? Output.empty() : this.destinationPortRanges;
    }

    /**
     * The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    @InputImport(name="direction", required=true)
      private final Output<Either<String,SecurityRuleDirection>> direction;

    public Output<Either<String,SecurityRuleDirection>> getDirection() {
        return this.direction;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * Network protocol this rule applies to.
     * 
     */
    @InputImport(name="protocol", required=true)
      private final Output<Either<String,SecurityRuleProtocol>> protocol;

    public Output<Either<String,SecurityRuleProtocol>> getProtocol() {
        return this.protocol;
    }

    /**
     * The CIDR or source IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from.
     * 
     */
    @InputImport(name="sourceAddressPrefix")
      private final @Nullable Output<String> sourceAddressPrefix;

    public Output<String> getSourceAddressPrefix() {
        return this.sourceAddressPrefix == null ? Output.empty() : this.sourceAddressPrefix;
    }

    /**
     * The CIDR or source IP ranges.
     * 
     */
    @InputImport(name="sourceAddressPrefixes")
      private final @Nullable Output<List<String>> sourceAddressPrefixes;

    public Output<List<String>> getSourceAddressPrefixes() {
        return this.sourceAddressPrefixes == null ? Output.empty() : this.sourceAddressPrefixes;
    }

    /**
     * The application security group specified as source.
     * 
     */
    @InputImport(name="sourceApplicationSecurityGroups")
      private final @Nullable Output<List<ApplicationSecurityGroupArgs>> sourceApplicationSecurityGroups;

    public Output<List<ApplicationSecurityGroupArgs>> getSourceApplicationSecurityGroups() {
        return this.sourceApplicationSecurityGroups == null ? Output.empty() : this.sourceApplicationSecurityGroups;
    }

    /**
     * The source port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    @InputImport(name="sourcePortRange")
      private final @Nullable Output<String> sourcePortRange;

    public Output<String> getSourcePortRange() {
        return this.sourcePortRange == null ? Output.empty() : this.sourcePortRange;
    }

    /**
     * The source port ranges.
     * 
     */
    @InputImport(name="sourcePortRanges")
      private final @Nullable Output<List<String>> sourcePortRanges;

    public Output<List<String>> getSourcePortRanges() {
        return this.sourcePortRanges == null ? Output.empty() : this.sourcePortRanges;
    }

    /**
     * The type of the resource.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public SecurityRuleArgs(
        Output<Either<String,SecurityRuleAccess>> access,
        @Nullable Output<String> description,
        @Nullable Output<String> destinationAddressPrefix,
        @Nullable Output<List<String>> destinationAddressPrefixes,
        @Nullable Output<List<ApplicationSecurityGroupArgs>> destinationApplicationSecurityGroups,
        @Nullable Output<String> destinationPortRange,
        @Nullable Output<List<String>> destinationPortRanges,
        Output<Either<String,SecurityRuleDirection>> direction,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<Integer> priority,
        Output<Either<String,SecurityRuleProtocol>> protocol,
        @Nullable Output<String> sourceAddressPrefix,
        @Nullable Output<List<String>> sourceAddressPrefixes,
        @Nullable Output<List<ApplicationSecurityGroupArgs>> sourceApplicationSecurityGroups,
        @Nullable Output<String> sourcePortRange,
        @Nullable Output<List<String>> sourcePortRanges,
        @Nullable Output<String> type) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.description = description;
        this.destinationAddressPrefix = destinationAddressPrefix;
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
        this.destinationPortRange = destinationPortRange;
        this.destinationPortRanges = destinationPortRanges;
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.sourceAddressPrefix = sourceAddressPrefix;
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
        this.sourcePortRange = sourcePortRange;
        this.sourcePortRanges = sourcePortRanges;
        this.type = type;
    }

    private SecurityRuleArgs() {
        this.access = Output.empty();
        this.description = Output.empty();
        this.destinationAddressPrefix = Output.empty();
        this.destinationAddressPrefixes = Output.empty();
        this.destinationApplicationSecurityGroups = Output.empty();
        this.destinationPortRange = Output.empty();
        this.destinationPortRanges = Output.empty();
        this.direction = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
        this.priority = Output.empty();
        this.protocol = Output.empty();
        this.sourceAddressPrefix = Output.empty();
        this.sourceAddressPrefixes = Output.empty();
        this.sourceApplicationSecurityGroups = Output.empty();
        this.sourcePortRange = Output.empty();
        this.sourcePortRanges = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,SecurityRuleAccess>> access;
        private @Nullable Output<String> description;
        private @Nullable Output<String> destinationAddressPrefix;
        private @Nullable Output<List<String>> destinationAddressPrefixes;
        private @Nullable Output<List<ApplicationSecurityGroupArgs>> destinationApplicationSecurityGroups;
        private @Nullable Output<String> destinationPortRange;
        private @Nullable Output<List<String>> destinationPortRanges;
        private Output<Either<String,SecurityRuleDirection>> direction;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> priority;
        private Output<Either<String,SecurityRuleProtocol>> protocol;
        private @Nullable Output<String> sourceAddressPrefix;
        private @Nullable Output<List<String>> sourceAddressPrefixes;
        private @Nullable Output<List<ApplicationSecurityGroupArgs>> sourceApplicationSecurityGroups;
        private @Nullable Output<String> sourcePortRange;
        private @Nullable Output<List<String>> sourcePortRanges;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationAddressPrefix = defaults.destinationAddressPrefix;
    	      this.destinationAddressPrefixes = defaults.destinationAddressPrefixes;
    	      this.destinationApplicationSecurityGroups = defaults.destinationApplicationSecurityGroups;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.direction = defaults.direction;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourceAddressPrefixes = defaults.sourceAddressPrefixes;
    	      this.sourceApplicationSecurityGroups = defaults.sourceApplicationSecurityGroups;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.type = defaults.type;
        }

        public Builder access(Output<Either<String,SecurityRuleAccess>> access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder access(Either<String,SecurityRuleAccess> access) {
            this.access = Output.of(Objects.requireNonNull(access));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder destinationAddressPrefix(@Nullable Output<String> destinationAddressPrefix) {
            this.destinationAddressPrefix = destinationAddressPrefix;
            return this;
        }

        public Builder destinationAddressPrefix(@Nullable String destinationAddressPrefix) {
            this.destinationAddressPrefix = Output.ofNullable(destinationAddressPrefix);
            return this;
        }

        public Builder destinationAddressPrefixes(@Nullable Output<List<String>> destinationAddressPrefixes) {
            this.destinationAddressPrefixes = destinationAddressPrefixes;
            return this;
        }

        public Builder destinationAddressPrefixes(@Nullable List<String> destinationAddressPrefixes) {
            this.destinationAddressPrefixes = Output.ofNullable(destinationAddressPrefixes);
            return this;
        }

        public Builder destinationApplicationSecurityGroups(@Nullable Output<List<ApplicationSecurityGroupArgs>> destinationApplicationSecurityGroups) {
            this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
            return this;
        }

        public Builder destinationApplicationSecurityGroups(@Nullable List<ApplicationSecurityGroupArgs> destinationApplicationSecurityGroups) {
            this.destinationApplicationSecurityGroups = Output.ofNullable(destinationApplicationSecurityGroups);
            return this;
        }

        public Builder destinationPortRange(@Nullable Output<String> destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }

        public Builder destinationPortRange(@Nullable String destinationPortRange) {
            this.destinationPortRange = Output.ofNullable(destinationPortRange);
            return this;
        }

        public Builder destinationPortRanges(@Nullable Output<List<String>> destinationPortRanges) {
            this.destinationPortRanges = destinationPortRanges;
            return this;
        }

        public Builder destinationPortRanges(@Nullable List<String> destinationPortRanges) {
            this.destinationPortRanges = Output.ofNullable(destinationPortRanges);
            return this;
        }

        public Builder direction(Output<Either<String,SecurityRuleDirection>> direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder direction(Either<String,SecurityRuleDirection> direction) {
            this.direction = Output.of(Objects.requireNonNull(direction));
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
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

        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }

        public Builder protocol(Output<Either<String,SecurityRuleProtocol>> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder protocol(Either<String,SecurityRuleProtocol> protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }

        public Builder sourceAddressPrefix(@Nullable Output<String> sourceAddressPrefix) {
            this.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }

        public Builder sourceAddressPrefix(@Nullable String sourceAddressPrefix) {
            this.sourceAddressPrefix = Output.ofNullable(sourceAddressPrefix);
            return this;
        }

        public Builder sourceAddressPrefixes(@Nullable Output<List<String>> sourceAddressPrefixes) {
            this.sourceAddressPrefixes = sourceAddressPrefixes;
            return this;
        }

        public Builder sourceAddressPrefixes(@Nullable List<String> sourceAddressPrefixes) {
            this.sourceAddressPrefixes = Output.ofNullable(sourceAddressPrefixes);
            return this;
        }

        public Builder sourceApplicationSecurityGroups(@Nullable Output<List<ApplicationSecurityGroupArgs>> sourceApplicationSecurityGroups) {
            this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
            return this;
        }

        public Builder sourceApplicationSecurityGroups(@Nullable List<ApplicationSecurityGroupArgs> sourceApplicationSecurityGroups) {
            this.sourceApplicationSecurityGroups = Output.ofNullable(sourceApplicationSecurityGroups);
            return this;
        }

        public Builder sourcePortRange(@Nullable Output<String> sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        public Builder sourcePortRange(@Nullable String sourcePortRange) {
            this.sourcePortRange = Output.ofNullable(sourcePortRange);
            return this;
        }

        public Builder sourcePortRanges(@Nullable Output<List<String>> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }

        public Builder sourcePortRanges(@Nullable List<String> sourcePortRanges) {
            this.sourcePortRanges = Output.ofNullable(sourcePortRanges);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public SecurityRuleArgs build() {
            return new SecurityRuleArgs(access, description, destinationAddressPrefix, destinationAddressPrefixes, destinationApplicationSecurityGroups, destinationPortRange, destinationPortRanges, direction, id, name, priority, protocol, sourceAddressPrefix, sourceAddressPrefixes, sourceApplicationSecurityGroups, sourcePortRange, sourcePortRanges, type);
        }
    }
}
