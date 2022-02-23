// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalNetworkEndpointState extends io.pulumi.resources.ResourceArgs {

    public static final GlobalNetworkEndpointState Empty = new GlobalNetworkEndpointState();

    /**
     * Fully qualified domain name of network endpoint.
     * This can only be specified when network_endpoint_type of the NEG is INTERNET_FQDN_PORT.
     * 
     */
    @InputImport(name="fqdn")
      private final @Nullable Input<String> fqdn;

    public Input<String> getFqdn() {
        return this.fqdn == null ? Input.empty() : this.fqdn;
    }

    /**
     * The global network endpoint group this endpoint is part of.
     * 
     */
    @InputImport(name="globalNetworkEndpointGroup")
      private final @Nullable Input<String> globalNetworkEndpointGroup;

    public Input<String> getGlobalNetworkEndpointGroup() {
        return this.globalNetworkEndpointGroup == null ? Input.empty() : this.globalNetworkEndpointGroup;
    }

    /**
     * IPv4 address external endpoint.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * Port number of the external endpoint.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
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

    public GlobalNetworkEndpointState(
        @Nullable Input<String> fqdn,
        @Nullable Input<String> globalNetworkEndpointGroup,
        @Nullable Input<String> ipAddress,
        @Nullable Input<Integer> port,
        @Nullable Input<String> project) {
        this.fqdn = fqdn;
        this.globalNetworkEndpointGroup = globalNetworkEndpointGroup;
        this.ipAddress = ipAddress;
        this.port = port;
        this.project = project;
    }

    private GlobalNetworkEndpointState() {
        this.fqdn = Input.empty();
        this.globalNetworkEndpointGroup = Input.empty();
        this.ipAddress = Input.empty();
        this.port = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalNetworkEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fqdn;
        private @Nullable Input<String> globalNetworkEndpointGroup;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalNetworkEndpointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.globalNetworkEndpointGroup = defaults.globalNetworkEndpointGroup;
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
        }

        public Builder setFqdn(@Nullable Input<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = Input.ofNullable(fqdn);
            return this;
        }

        public Builder setGlobalNetworkEndpointGroup(@Nullable Input<String> globalNetworkEndpointGroup) {
            this.globalNetworkEndpointGroup = globalNetworkEndpointGroup;
            return this;
        }

        public Builder setGlobalNetworkEndpointGroup(@Nullable String globalNetworkEndpointGroup) {
            this.globalNetworkEndpointGroup = Input.ofNullable(globalNetworkEndpointGroup);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
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
        public GlobalNetworkEndpointState build() {
            return new GlobalNetworkEndpointState(fqdn, globalNetworkEndpointGroup, ipAddress, port, project);
        }
    }
}
