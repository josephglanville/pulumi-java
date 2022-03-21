// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Extra network settings. Only applicable in the App Engine flexible environment.
 * 
 */
public final class NetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkArgs Empty = new NetworkArgs();

    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="forwardedPorts")
      private final @Nullable Output<List<String>> forwardedPorts;

    public Output<List<String>> getForwardedPorts() {
        return this.forwardedPorts == null ? Output.empty() : this.forwardedPorts;
    }

    /**
     * Tag to apply to the instance during creation. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="instanceTag")
      private final @Nullable Output<String> instanceTag;

    public Output<String> getInstanceTag() {
        return this.instanceTag == null ? Output.empty() : this.instanceTag;
    }

    /**
     * Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Enable session affinity. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="sessionAffinity")
      private final @Nullable Output<Boolean> sessionAffinity;

    public Output<Boolean> getSessionAffinity() {
        return this.sessionAffinity == null ? Output.empty() : this.sessionAffinity;
    }

    /**
     * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is specified, a network name will also be required unless it is for the default network. If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network. If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
     * 
     */
    @Import(name="subnetworkName")
      private final @Nullable Output<String> subnetworkName;

    public Output<String> getSubnetworkName() {
        return this.subnetworkName == null ? Output.empty() : this.subnetworkName;
    }

    public NetworkArgs(
        @Nullable Output<List<String>> forwardedPorts,
        @Nullable Output<String> instanceTag,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> sessionAffinity,
        @Nullable Output<String> subnetworkName) {
        this.forwardedPorts = forwardedPorts;
        this.instanceTag = instanceTag;
        this.name = name;
        this.sessionAffinity = sessionAffinity;
        this.subnetworkName = subnetworkName;
    }

    private NetworkArgs() {
        this.forwardedPorts = Output.empty();
        this.instanceTag = Output.empty();
        this.name = Output.empty();
        this.sessionAffinity = Output.empty();
        this.subnetworkName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> forwardedPorts;
        private @Nullable Output<String> instanceTag;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> sessionAffinity;
        private @Nullable Output<String> subnetworkName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardedPorts = defaults.forwardedPorts;
    	      this.instanceTag = defaults.instanceTag;
    	      this.name = defaults.name;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.subnetworkName = defaults.subnetworkName;
        }

        public Builder forwardedPorts(@Nullable Output<List<String>> forwardedPorts) {
            this.forwardedPorts = forwardedPorts;
            return this;
        }
        public Builder forwardedPorts(@Nullable List<String> forwardedPorts) {
            this.forwardedPorts = Output.ofNullable(forwardedPorts);
            return this;
        }
        public Builder forwardedPorts(String... forwardedPorts) {
            return forwardedPorts(List.of(forwardedPorts));
        }
        public Builder instanceTag(@Nullable Output<String> instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }
        public Builder instanceTag(@Nullable String instanceTag) {
            this.instanceTag = Output.ofNullable(instanceTag);
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
        public Builder sessionAffinity(@Nullable Output<Boolean> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        public Builder sessionAffinity(@Nullable Boolean sessionAffinity) {
            this.sessionAffinity = Output.ofNullable(sessionAffinity);
            return this;
        }
        public Builder subnetworkName(@Nullable Output<String> subnetworkName) {
            this.subnetworkName = subnetworkName;
            return this;
        }
        public Builder subnetworkName(@Nullable String subnetworkName) {
            this.subnetworkName = Output.ofNullable(subnetworkName);
            return this;
        }        public NetworkArgs build() {
            return new NetworkArgs(forwardedPorts, instanceTag, name, sessionAffinity, subnetworkName);
        }
    }
}
