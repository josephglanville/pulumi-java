// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="alternativeNameServerConfig")
      private final @Nullable Input<PolicyAlternativeNameServerConfigGetArgs> alternativeNameServerConfig;

    public Input<PolicyAlternativeNameServerConfigGetArgs> getAlternativeNameServerConfig() {
        return this.alternativeNameServerConfig == null ? Input.empty() : this.alternativeNameServerConfig;
    }

    /**
     * A textual description field. Defaults to 'Managed by Pulumi'.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Allows networks bound to this policy to receive DNS queries sent
     * by VMs or applications over VPN connections. When enabled, a
     * virtual IP address will be allocated from each of the sub-networks
     * that are bound to this policy.
     * 
     */
    @InputImport(name="enableInboundForwarding")
      private final @Nullable Input<Boolean> enableInboundForwarding;

    public Input<Boolean> getEnableInboundForwarding() {
        return this.enableInboundForwarding == null ? Input.empty() : this.enableInboundForwarding;
    }

    /**
     * Controls whether logging is enabled for the networks bound to this policy.
     * Defaults to no logging if not set.
     * 
     */
    @InputImport(name="enableLogging")
      private final @Nullable Input<Boolean> enableLogging;

    public Input<Boolean> getEnableLogging() {
        return this.enableLogging == null ? Input.empty() : this.enableLogging;
    }

    /**
     * User assigned name for this policy.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * List of network names specifying networks to which this policy is applied.
     * Structure is documented below.
     * 
     */
    @InputImport(name="networks")
      private final @Nullable Input<List<PolicyNetworkGetArgs>> networks;

    public Input<List<PolicyNetworkGetArgs>> getNetworks() {
        return this.networks == null ? Input.empty() : this.networks;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public PolicyState(
        @Nullable Input<PolicyAlternativeNameServerConfigGetArgs> alternativeNameServerConfig,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableInboundForwarding,
        @Nullable Input<Boolean> enableLogging,
        @Nullable Input<String> name,
        @Nullable Input<List<PolicyNetworkGetArgs>> networks,
        @Nullable Input<String> project) {
        this.alternativeNameServerConfig = alternativeNameServerConfig;
        this.description = description;
        this.enableInboundForwarding = enableInboundForwarding;
        this.enableLogging = enableLogging;
        this.name = name;
        this.networks = networks;
        this.project = project;
    }

    private PolicyState() {
        this.alternativeNameServerConfig = Input.empty();
        this.description = Input.empty();
        this.enableInboundForwarding = Input.empty();
        this.enableLogging = Input.empty();
        this.name = Input.empty();
        this.networks = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PolicyAlternativeNameServerConfigGetArgs> alternativeNameServerConfig;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableInboundForwarding;
        private @Nullable Input<Boolean> enableLogging;
        private @Nullable Input<String> name;
        private @Nullable Input<List<PolicyNetworkGetArgs>> networks;
        private @Nullable Input<String> project;

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

        public Builder setAlternativeNameServerConfig(@Nullable Input<PolicyAlternativeNameServerConfigGetArgs> alternativeNameServerConfig) {
            this.alternativeNameServerConfig = alternativeNameServerConfig;
            return this;
        }

        public Builder setAlternativeNameServerConfig(@Nullable PolicyAlternativeNameServerConfigGetArgs alternativeNameServerConfig) {
            this.alternativeNameServerConfig = Input.ofNullable(alternativeNameServerConfig);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnableInboundForwarding(@Nullable Input<Boolean> enableInboundForwarding) {
            this.enableInboundForwarding = enableInboundForwarding;
            return this;
        }

        public Builder setEnableInboundForwarding(@Nullable Boolean enableInboundForwarding) {
            this.enableInboundForwarding = Input.ofNullable(enableInboundForwarding);
            return this;
        }

        public Builder setEnableLogging(@Nullable Input<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }

        public Builder setEnableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Input.ofNullable(enableLogging);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetworks(@Nullable Input<List<PolicyNetworkGetArgs>> networks) {
            this.networks = networks;
            return this;
        }

        public Builder setNetworks(@Nullable List<PolicyNetworkGetArgs> networks) {
            this.networks = Input.ofNullable(networks);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public PolicyState build() {
            return new PolicyState(alternativeNameServerConfig, description, enableInboundForwarding, enableLogging, name, networks, project);
        }
    }
}
