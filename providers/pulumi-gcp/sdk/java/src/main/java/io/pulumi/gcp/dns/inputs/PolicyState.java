// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigGetArgs;
import io.pulumi.gcp.dns.inputs.PolicyNetworkGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyState extends io.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    /**
     * Sets an alternative name server for the associated networks.
     * When specified, all DNS queries are forwarded to a name server that you choose.
     * Names such as .internal are not available when an alternative name server is specified.
     * Structure is documented below.
     * 
     */
    @Import(name="alternativeNameServerConfig")
      private final @Nullable Output<PolicyAlternativeNameServerConfigGetArgs> alternativeNameServerConfig;

    public Output<PolicyAlternativeNameServerConfigGetArgs> getAlternativeNameServerConfig() {
        return this.alternativeNameServerConfig == null ? Output.empty() : this.alternativeNameServerConfig;
    }

    /**
     * A textual description field. Defaults to 'Managed by Pulumi'.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Allows networks bound to this policy to receive DNS queries sent
     * by VMs or applications over VPN connections. When enabled, a
     * virtual IP address will be allocated from each of the sub-networks
     * that are bound to this policy.
     * 
     */
    @Import(name="enableInboundForwarding")
      private final @Nullable Output<Boolean> enableInboundForwarding;

    public Output<Boolean> getEnableInboundForwarding() {
        return this.enableInboundForwarding == null ? Output.empty() : this.enableInboundForwarding;
    }

    /**
     * Controls whether logging is enabled for the networks bound to this policy.
     * Defaults to no logging if not set.
     * 
     */
    @Import(name="enableLogging")
      private final @Nullable Output<Boolean> enableLogging;

    public Output<Boolean> getEnableLogging() {
        return this.enableLogging == null ? Output.empty() : this.enableLogging;
    }

    /**
     * User assigned name for this policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * List of network names specifying networks to which this policy is applied.
     * Structure is documented below.
     * 
     */
    @Import(name="networks")
      private final @Nullable Output<List<PolicyNetworkGetArgs>> networks;

    public Output<List<PolicyNetworkGetArgs>> getNetworks() {
        return this.networks == null ? Output.empty() : this.networks;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public PolicyState(
        @Nullable Output<PolicyAlternativeNameServerConfigGetArgs> alternativeNameServerConfig,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableInboundForwarding,
        @Nullable Output<Boolean> enableLogging,
        @Nullable Output<String> name,
        @Nullable Output<List<PolicyNetworkGetArgs>> networks,
        @Nullable Output<String> project) {
        this.alternativeNameServerConfig = alternativeNameServerConfig;
        this.description = description;
        this.enableInboundForwarding = enableInboundForwarding;
        this.enableLogging = enableLogging;
        this.name = name;
        this.networks = networks;
        this.project = project;
    }

    private PolicyState() {
        this.alternativeNameServerConfig = Output.empty();
        this.description = Output.empty();
        this.enableInboundForwarding = Output.empty();
        this.enableLogging = Output.empty();
        this.name = Output.empty();
        this.networks = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PolicyAlternativeNameServerConfigGetArgs> alternativeNameServerConfig;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableInboundForwarding;
        private @Nullable Output<Boolean> enableLogging;
        private @Nullable Output<String> name;
        private @Nullable Output<List<PolicyNetworkGetArgs>> networks;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeNameServerConfig = defaults.alternativeNameServerConfig;
    	      this.description = defaults.description;
    	      this.enableInboundForwarding = defaults.enableInboundForwarding;
    	      this.enableLogging = defaults.enableLogging;
    	      this.name = defaults.name;
    	      this.networks = defaults.networks;
    	      this.project = defaults.project;
        }

        public Builder alternativeNameServerConfig(@Nullable Output<PolicyAlternativeNameServerConfigGetArgs> alternativeNameServerConfig) {
            this.alternativeNameServerConfig = alternativeNameServerConfig;
            return this;
        }
        public Builder alternativeNameServerConfig(@Nullable PolicyAlternativeNameServerConfigGetArgs alternativeNameServerConfig) {
            this.alternativeNameServerConfig = Output.ofNullable(alternativeNameServerConfig);
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
        public Builder enableInboundForwarding(@Nullable Output<Boolean> enableInboundForwarding) {
            this.enableInboundForwarding = enableInboundForwarding;
            return this;
        }
        public Builder enableInboundForwarding(@Nullable Boolean enableInboundForwarding) {
            this.enableInboundForwarding = Output.ofNullable(enableInboundForwarding);
            return this;
        }
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }
        public Builder enableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Output.ofNullable(enableLogging);
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
        public Builder networks(@Nullable Output<List<PolicyNetworkGetArgs>> networks) {
            this.networks = networks;
            return this;
        }
        public Builder networks(@Nullable List<PolicyNetworkGetArgs> networks) {
            this.networks = Output.ofNullable(networks);
            return this;
        }
        public Builder networks(PolicyNetworkGetArgs... networks) {
            return networks(List.of(networks));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public PolicyState build() {
            return new PolicyState(alternativeNameServerConfig, description, enableInboundForwarding, enableLogging, name, networks, project);
        }
    }
}
