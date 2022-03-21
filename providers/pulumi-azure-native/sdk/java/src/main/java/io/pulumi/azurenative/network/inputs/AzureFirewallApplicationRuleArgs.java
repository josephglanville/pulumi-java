// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AzureFirewallApplicationRuleProtocolArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of an application rule.
 * 
 */
public final class AzureFirewallApplicationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFirewallApplicationRuleArgs Empty = new AzureFirewallApplicationRuleArgs();

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * List of FQDN Tags for this rule.
     * 
     */
    @Import(name="fqdnTags")
      private final @Nullable Output<List<String>> fqdnTags;

    public Output<List<String>> getFqdnTags() {
        return this.fqdnTags == null ? Output.empty() : this.fqdnTags;
    }

    /**
     * Name of the application rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Array of ApplicationRuleProtocols.
     * 
     */
    @Import(name="protocols")
      private final @Nullable Output<List<AzureFirewallApplicationRuleProtocolArgs>> protocols;

    public Output<List<AzureFirewallApplicationRuleProtocolArgs>> getProtocols() {
        return this.protocols == null ? Output.empty() : this.protocols;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
      private final @Nullable Output<List<String>> sourceAddresses;

    public Output<List<String>> getSourceAddresses() {
        return this.sourceAddresses == null ? Output.empty() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
      private final @Nullable Output<List<String>> sourceIpGroups;

    public Output<List<String>> getSourceIpGroups() {
        return this.sourceIpGroups == null ? Output.empty() : this.sourceIpGroups;
    }

    /**
     * List of FQDNs for this rule.
     * 
     */
    @Import(name="targetFqdns")
      private final @Nullable Output<List<String>> targetFqdns;

    public Output<List<String>> getTargetFqdns() {
        return this.targetFqdns == null ? Output.empty() : this.targetFqdns;
    }

    public AzureFirewallApplicationRuleArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> fqdnTags,
        @Nullable Output<String> name,
        @Nullable Output<List<AzureFirewallApplicationRuleProtocolArgs>> protocols,
        @Nullable Output<List<String>> sourceAddresses,
        @Nullable Output<List<String>> sourceIpGroups,
        @Nullable Output<List<String>> targetFqdns) {
        this.description = description;
        this.fqdnTags = fqdnTags;
        this.name = name;
        this.protocols = protocols;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.targetFqdns = targetFqdns;
    }

    private AzureFirewallApplicationRuleArgs() {
        this.description = Output.empty();
        this.fqdnTags = Output.empty();
        this.name = Output.empty();
        this.protocols = Output.empty();
        this.sourceAddresses = Output.empty();
        this.sourceIpGroups = Output.empty();
        this.targetFqdns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallApplicationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> fqdnTags;
        private @Nullable Output<String> name;
        private @Nullable Output<List<AzureFirewallApplicationRuleProtocolArgs>> protocols;
        private @Nullable Output<List<String>> sourceAddresses;
        private @Nullable Output<List<String>> sourceIpGroups;
        private @Nullable Output<List<String>> targetFqdns;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallApplicationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fqdnTags = defaults.fqdnTags;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.targetFqdns = defaults.targetFqdns;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder fqdnTags(@Nullable Output<List<String>> fqdnTags) {
            this.fqdnTags = fqdnTags;
            return this;
        }
        public Builder fqdnTags(@Nullable List<String> fqdnTags) {
            this.fqdnTags = Output.ofNullable(fqdnTags);
            return this;
        }
        public Builder fqdnTags(String... fqdnTags) {
            return fqdnTags(List.of(fqdnTags));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder protocols(@Nullable Output<List<AzureFirewallApplicationRuleProtocolArgs>> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(@Nullable List<AzureFirewallApplicationRuleProtocolArgs> protocols) {
            this.protocols = Output.ofNullable(protocols);
            return this;
        }
        public Builder protocols(AzureFirewallApplicationRuleProtocolArgs... protocols) {
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
        public Builder sourceIpGroups(@Nullable Output<List<String>> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = Output.ofNullable(sourceIpGroups);
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }
        public Builder targetFqdns(@Nullable Output<List<String>> targetFqdns) {
            this.targetFqdns = targetFqdns;
            return this;
        }
        public Builder targetFqdns(@Nullable List<String> targetFqdns) {
            this.targetFqdns = Output.ofNullable(targetFqdns);
            return this;
        }
        public Builder targetFqdns(String... targetFqdns) {
            return targetFqdns(List.of(targetFqdns));
        }        public AzureFirewallApplicationRuleArgs build() {
            return new AzureFirewallApplicationRuleArgs(description, fqdnTags, name, protocols, sourceAddresses, sourceIpGroups, targetFqdns);
        }
    }
}
