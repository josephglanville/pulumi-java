// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.InboundEndpointProtocol;
import io.pulumi.azurenative.batch.inputs.NetworkSecurityGroupRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InboundNatPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final InboundNatPoolArgs Empty = new InboundNatPoolArgs();

    /**
     * This must be unique within a Batch pool. Acceptable values are between 1 and 65535 except for 22, 3389, 29876 and 29877 as these are reserved. If any reserved values are provided the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="backendPort", required=true)
      private final Input<Integer> backendPort;

    public Input<Integer> getBackendPort() {
        return this.backendPort;
    }

    /**
     * Acceptable values range between 1 and 65534 except ports from 50000 to 55000 which are reserved by the Batch service. All ranges within a pool must be distinct and cannot overlap. If any reserved or overlapping values are provided the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="frontendPortRangeEnd", required=true)
      private final Input<Integer> frontendPortRangeEnd;

    public Input<Integer> getFrontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * Acceptable values range between 1 and 65534 except ports from 50000 to 55000 which are reserved. All ranges within a pool must be distinct and cannot overlap. If any reserved or overlapping values are provided the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="frontendPortRangeStart", required=true)
      private final Input<Integer> frontendPortRangeStart;

    public Input<Integer> getFrontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * The name must be unique within a Batch pool, can contain letters, numbers, underscores, periods, and hyphens. Names must start with a letter or number, must end with a letter, number, or underscore, and cannot exceed 77 characters.  If any invalid values are provided the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The maximum number of rules that can be specified across all the endpoints on a Batch pool is 25. If no network security group rules are specified, a default rule will be created to allow inbound access to the specified backendPort. If the maximum number of network security group rules is exceeded the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="networkSecurityGroupRules")
      private final @Nullable Input<List<NetworkSecurityGroupRuleArgs>> networkSecurityGroupRules;

    public Input<List<NetworkSecurityGroupRuleArgs>> getNetworkSecurityGroupRules() {
        return this.networkSecurityGroupRules == null ? Input.empty() : this.networkSecurityGroupRules;
    }

    @InputImport(name="protocol", required=true)
      private final Input<InboundEndpointProtocol> protocol;

    public Input<InboundEndpointProtocol> getProtocol() {
        return this.protocol;
    }

    public InboundNatPoolArgs(
        Input<Integer> backendPort,
        Input<Integer> frontendPortRangeEnd,
        Input<Integer> frontendPortRangeStart,
        Input<String> name,
        @Nullable Input<List<NetworkSecurityGroupRuleArgs>> networkSecurityGroupRules,
        Input<InboundEndpointProtocol> protocol) {
        this.backendPort = Objects.requireNonNull(backendPort, "expected parameter 'backendPort' to be non-null");
        this.frontendPortRangeEnd = Objects.requireNonNull(frontendPortRangeEnd, "expected parameter 'frontendPortRangeEnd' to be non-null");
        this.frontendPortRangeStart = Objects.requireNonNull(frontendPortRangeStart, "expected parameter 'frontendPortRangeStart' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.networkSecurityGroupRules = networkSecurityGroupRules;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private InboundNatPoolArgs() {
        this.backendPort = Input.empty();
        this.frontendPortRangeEnd = Input.empty();
        this.frontendPortRangeStart = Input.empty();
        this.name = Input.empty();
        this.networkSecurityGroupRules = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundNatPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> backendPort;
        private Input<Integer> frontendPortRangeEnd;
        private Input<Integer> frontendPortRangeStart;
        private Input<String> name;
        private @Nullable Input<List<NetworkSecurityGroupRuleArgs>> networkSecurityGroupRules;
        private Input<InboundEndpointProtocol> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundNatPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.frontendPortRangeEnd = defaults.frontendPortRangeEnd;
    	      this.frontendPortRangeStart = defaults.frontendPortRangeStart;
    	      this.name = defaults.name;
    	      this.networkSecurityGroupRules = defaults.networkSecurityGroupRules;
    	      this.protocol = defaults.protocol;
        }

        public Builder setBackendPort(Input<Integer> backendPort) {
            this.backendPort = Objects.requireNonNull(backendPort);
            return this;
        }

        public Builder setBackendPort(Integer backendPort) {
            this.backendPort = Input.of(Objects.requireNonNull(backendPort));
            return this;
        }

        public Builder setFrontendPortRangeEnd(Input<Integer> frontendPortRangeEnd) {
            this.frontendPortRangeEnd = Objects.requireNonNull(frontendPortRangeEnd);
            return this;
        }

        public Builder setFrontendPortRangeEnd(Integer frontendPortRangeEnd) {
            this.frontendPortRangeEnd = Input.of(Objects.requireNonNull(frontendPortRangeEnd));
            return this;
        }

        public Builder setFrontendPortRangeStart(Input<Integer> frontendPortRangeStart) {
            this.frontendPortRangeStart = Objects.requireNonNull(frontendPortRangeStart);
            return this;
        }

        public Builder setFrontendPortRangeStart(Integer frontendPortRangeStart) {
            this.frontendPortRangeStart = Input.of(Objects.requireNonNull(frontendPortRangeStart));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNetworkSecurityGroupRules(@Nullable Input<List<NetworkSecurityGroupRuleArgs>> networkSecurityGroupRules) {
            this.networkSecurityGroupRules = networkSecurityGroupRules;
            return this;
        }

        public Builder setNetworkSecurityGroupRules(@Nullable List<NetworkSecurityGroupRuleArgs> networkSecurityGroupRules) {
            this.networkSecurityGroupRules = Input.ofNullable(networkSecurityGroupRules);
            return this;
        }

        public Builder setProtocol(Input<InboundEndpointProtocol> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(InboundEndpointProtocol protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }
        public InboundNatPoolArgs build() {
            return new InboundNatPoolArgs(backendPort, frontendPortRangeEnd, frontendPortRangeStart, name, networkSecurityGroupRules, protocol);
        }
    }
}
