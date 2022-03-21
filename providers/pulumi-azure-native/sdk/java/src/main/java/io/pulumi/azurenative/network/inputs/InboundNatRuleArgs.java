// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.TransportProtocol;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Inbound NAT rule of the load balancer.
 * 
 */
public final class InboundNatRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final InboundNatRuleArgs Empty = new InboundNatRuleArgs();

    /**
     * The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     * 
     */
    @Import(name="backendPort")
      private final @Nullable Output<Integer> backendPort;

    public Output<Integer> getBackendPort() {
        return this.backendPort == null ? Output.empty() : this.backendPort;
    }

    /**
     * Configures a virtual machine's endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     * 
     */
    @Import(name="enableFloatingIP")
      private final @Nullable Output<Boolean> enableFloatingIP;

    public Output<Boolean> getEnableFloatingIP() {
        return this.enableFloatingIP == null ? Output.empty() : this.enableFloatingIP;
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
      private final @Nullable Output<Boolean> enableTcpReset;

    public Output<Boolean> getEnableTcpReset() {
        return this.enableTcpReset == null ? Output.empty() : this.enableTcpReset;
    }

    /**
     * A reference to frontend IP addresses.
     * 
     */
    @Import(name="frontendIPConfiguration")
      private final @Nullable Output<SubResourceArgs> frontendIPConfiguration;

    public Output<SubResourceArgs> getFrontendIPConfiguration() {
        return this.frontendIPConfiguration == null ? Output.empty() : this.frontendIPConfiguration;
    }

    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534.
     * 
     */
    @Import(name="frontendPort")
      private final @Nullable Output<Integer> frontendPort;

    public Output<Integer> getFrontendPort() {
        return this.frontendPort == null ? Output.empty() : this.frontendPort;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
      private final @Nullable Output<Integer> idleTimeoutInMinutes;

    public Output<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Output.empty() : this.idleTimeoutInMinutes;
    }

    /**
     * The name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<Either<String,TransportProtocol>> protocol;

    public Output<Either<String,TransportProtocol>> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    public InboundNatRuleArgs(
        @Nullable Output<Integer> backendPort,
        @Nullable Output<Boolean> enableFloatingIP,
        @Nullable Output<Boolean> enableTcpReset,
        @Nullable Output<SubResourceArgs> frontendIPConfiguration,
        @Nullable Output<Integer> frontendPort,
        @Nullable Output<String> id,
        @Nullable Output<Integer> idleTimeoutInMinutes,
        @Nullable Output<String> name,
        @Nullable Output<Either<String,TransportProtocol>> protocol) {
        this.backendPort = backendPort;
        this.enableFloatingIP = enableFloatingIP;
        this.enableTcpReset = enableTcpReset;
        this.frontendIPConfiguration = frontendIPConfiguration;
        this.frontendPort = frontendPort;
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.name = name;
        this.protocol = protocol;
    }

    private InboundNatRuleArgs() {
        this.backendPort = Output.empty();
        this.enableFloatingIP = Output.empty();
        this.enableTcpReset = Output.empty();
        this.frontendIPConfiguration = Output.empty();
        this.frontendPort = Output.empty();
        this.id = Output.empty();
        this.idleTimeoutInMinutes = Output.empty();
        this.name = Output.empty();
        this.protocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> backendPort;
        private @Nullable Output<Boolean> enableFloatingIP;
        private @Nullable Output<Boolean> enableTcpReset;
        private @Nullable Output<SubResourceArgs> frontendIPConfiguration;
        private @Nullable Output<Integer> frontendPort;
        private @Nullable Output<String> id;
        private @Nullable Output<Integer> idleTimeoutInMinutes;
        private @Nullable Output<String> name;
        private @Nullable Output<Either<String,TransportProtocol>> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundNatRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.enableFloatingIP = defaults.enableFloatingIP;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.frontendIPConfiguration = defaults.frontendIPConfiguration;
    	      this.frontendPort = defaults.frontendPort;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder backendPort(@Nullable Output<Integer> backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Builder backendPort(@Nullable Integer backendPort) {
            this.backendPort = Output.ofNullable(backendPort);
            return this;
        }
        public Builder enableFloatingIP(@Nullable Output<Boolean> enableFloatingIP) {
            this.enableFloatingIP = enableFloatingIP;
            return this;
        }
        public Builder enableFloatingIP(@Nullable Boolean enableFloatingIP) {
            this.enableFloatingIP = Output.ofNullable(enableFloatingIP);
            return this;
        }
        public Builder enableTcpReset(@Nullable Output<Boolean> enableTcpReset) {
            this.enableTcpReset = enableTcpReset;
            return this;
        }
        public Builder enableTcpReset(@Nullable Boolean enableTcpReset) {
            this.enableTcpReset = Output.ofNullable(enableTcpReset);
            return this;
        }
        public Builder frontendIPConfiguration(@Nullable Output<SubResourceArgs> frontendIPConfiguration) {
            this.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }
        public Builder frontendIPConfiguration(@Nullable SubResourceArgs frontendIPConfiguration) {
            this.frontendIPConfiguration = Output.ofNullable(frontendIPConfiguration);
            return this;
        }
        public Builder frontendPort(@Nullable Output<Integer> frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Builder frontendPort(@Nullable Integer frontendPort) {
            this.frontendPort = Output.ofNullable(frontendPort);
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
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = Output.ofNullable(idleTimeoutInMinutes);
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
        public Builder protocol(@Nullable Output<Either<String,TransportProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable Either<String,TransportProtocol> protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }        public InboundNatRuleArgs build() {
            return new InboundNatRuleArgs(backendPort, enableFloatingIP, enableTcpReset, frontendIPConfiguration, frontendPort, id, idleTimeoutInMinutes, name, protocol);
        }
    }
}
