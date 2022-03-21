// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.inputs.NetworkIpamConfigGetArgs;
import io.pulumi.docker.inputs.NetworkLabelGetArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkState Empty = new NetworkState();

    /**
     * Enable manual container attachment to the network.
     * 
     */
    @Import(name="attachable")
      private final @Nullable Output<Boolean> attachable;

    public Output<Boolean> getAttachable() {
        return this.attachable == null ? Output.empty() : this.attachable;
    }

    /**
     * Requests daemon to check for networks with same name.
     * 
     */
    @Import(name="checkDuplicate")
      private final @Nullable Output<Boolean> checkDuplicate;

    public Output<Boolean> getCheckDuplicate() {
        return this.checkDuplicate == null ? Output.empty() : this.checkDuplicate;
    }

    /**
     * The driver of the Docker network. Possible values are `bridge`, `host`, `overlay`, `macvlan`. See [network
     * docs](https://docs.docker.com/network/#network-drivers) for more details.
     * 
     */
    @Import(name="driver")
      private final @Nullable Output<String> driver;

    public Output<String> getDriver() {
        return this.driver == null ? Output.empty() : this.driver;
    }

    /**
     * Create swarm routing-mesh network. Defaults to `false`.
     * 
     */
    @Import(name="ingress")
      private final @Nullable Output<Boolean> ingress;

    public Output<Boolean> getIngress() {
        return this.ingress == null ? Output.empty() : this.ingress;
    }

    /**
     * Whether the network is internal.
     * 
     */
    @Import(name="internal")
      private final @Nullable Output<Boolean> internal;

    public Output<Boolean> getInternal() {
        return this.internal == null ? Output.empty() : this.internal;
    }

    /**
     * The IPAM configuration options
     * 
     */
    @Import(name="ipamConfigs")
      private final @Nullable Output<List<NetworkIpamConfigGetArgs>> ipamConfigs;

    public Output<List<NetworkIpamConfigGetArgs>> getIpamConfigs() {
        return this.ipamConfigs == null ? Output.empty() : this.ipamConfigs;
    }

    /**
     * Driver used by the custom IP scheme of the network. Defaults to `default`
     * 
     */
    @Import(name="ipamDriver")
      private final @Nullable Output<String> ipamDriver;

    public Output<String> getIpamDriver() {
        return this.ipamDriver == null ? Output.empty() : this.ipamDriver;
    }

    /**
     * Enable IPv6 networking. Defaults to `false`.
     * 
     */
    @Import(name="ipv6")
      private final @Nullable Output<Boolean> ipv6;

    public Output<Boolean> getIpv6() {
        return this.ipv6 == null ? Output.empty() : this.ipv6;
    }

    /**
     * User-defined key/value metadata
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<NetworkLabelGetArgs>> labels;

    public Output<List<NetworkLabelGetArgs>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The name of the Docker network.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Only available with bridge networks. See [bridge options
     * docs](https://docs.docker.com/engine/reference/commandline/network_create/#bridge-driver-options) for more details.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<Map<String,Object>> options;

    public Output<Map<String,Object>> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    /**
     * Scope of the network. One of `swarm`, `global`, or `local`.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    public NetworkState(
        @Nullable Output<Boolean> attachable,
        @Nullable Output<Boolean> checkDuplicate,
        @Nullable Output<String> driver,
        @Nullable Output<Boolean> ingress,
        @Nullable Output<Boolean> internal,
        @Nullable Output<List<NetworkIpamConfigGetArgs>> ipamConfigs,
        @Nullable Output<String> ipamDriver,
        @Nullable Output<Boolean> ipv6,
        @Nullable Output<List<NetworkLabelGetArgs>> labels,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,Object>> options,
        @Nullable Output<String> scope) {
        this.attachable = attachable;
        this.checkDuplicate = checkDuplicate;
        this.driver = driver;
        this.ingress = ingress;
        this.internal = internal;
        this.ipamConfigs = ipamConfigs;
        this.ipamDriver = ipamDriver;
        this.ipv6 = ipv6;
        this.labels = labels;
        this.name = name;
        this.options = options;
        this.scope = scope;
    }

    private NetworkState() {
        this.attachable = Output.empty();
        this.checkDuplicate = Output.empty();
        this.driver = Output.empty();
        this.ingress = Output.empty();
        this.internal = Output.empty();
        this.ipamConfigs = Output.empty();
        this.ipamDriver = Output.empty();
        this.ipv6 = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.options = Output.empty();
        this.scope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> attachable;
        private @Nullable Output<Boolean> checkDuplicate;
        private @Nullable Output<String> driver;
        private @Nullable Output<Boolean> ingress;
        private @Nullable Output<Boolean> internal;
        private @Nullable Output<List<NetworkIpamConfigGetArgs>> ipamConfigs;
        private @Nullable Output<String> ipamDriver;
        private @Nullable Output<Boolean> ipv6;
        private @Nullable Output<List<NetworkLabelGetArgs>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,Object>> options;
        private @Nullable Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachable = defaults.attachable;
    	      this.checkDuplicate = defaults.checkDuplicate;
    	      this.driver = defaults.driver;
    	      this.ingress = defaults.ingress;
    	      this.internal = defaults.internal;
    	      this.ipamConfigs = defaults.ipamConfigs;
    	      this.ipamDriver = defaults.ipamDriver;
    	      this.ipv6 = defaults.ipv6;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.scope = defaults.scope;
        }

        public Builder attachable(@Nullable Output<Boolean> attachable) {
            this.attachable = attachable;
            return this;
        }
        public Builder attachable(@Nullable Boolean attachable) {
            this.attachable = Output.ofNullable(attachable);
            return this;
        }
        public Builder checkDuplicate(@Nullable Output<Boolean> checkDuplicate) {
            this.checkDuplicate = checkDuplicate;
            return this;
        }
        public Builder checkDuplicate(@Nullable Boolean checkDuplicate) {
            this.checkDuplicate = Output.ofNullable(checkDuplicate);
            return this;
        }
        public Builder driver(@Nullable Output<String> driver) {
            this.driver = driver;
            return this;
        }
        public Builder driver(@Nullable String driver) {
            this.driver = Output.ofNullable(driver);
            return this;
        }
        public Builder ingress(@Nullable Output<Boolean> ingress) {
            this.ingress = ingress;
            return this;
        }
        public Builder ingress(@Nullable Boolean ingress) {
            this.ingress = Output.ofNullable(ingress);
            return this;
        }
        public Builder internal(@Nullable Output<Boolean> internal) {
            this.internal = internal;
            return this;
        }
        public Builder internal(@Nullable Boolean internal) {
            this.internal = Output.ofNullable(internal);
            return this;
        }
        public Builder ipamConfigs(@Nullable Output<List<NetworkIpamConfigGetArgs>> ipamConfigs) {
            this.ipamConfigs = ipamConfigs;
            return this;
        }
        public Builder ipamConfigs(@Nullable List<NetworkIpamConfigGetArgs> ipamConfigs) {
            this.ipamConfigs = Output.ofNullable(ipamConfigs);
            return this;
        }
        public Builder ipamConfigs(NetworkIpamConfigGetArgs... ipamConfigs) {
            return ipamConfigs(List.of(ipamConfigs));
        }
        public Builder ipamDriver(@Nullable Output<String> ipamDriver) {
            this.ipamDriver = ipamDriver;
            return this;
        }
        public Builder ipamDriver(@Nullable String ipamDriver) {
            this.ipamDriver = Output.ofNullable(ipamDriver);
            return this;
        }
        public Builder ipv6(@Nullable Output<Boolean> ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public Builder ipv6(@Nullable Boolean ipv6) {
            this.ipv6 = Output.ofNullable(ipv6);
            return this;
        }
        public Builder labels(@Nullable Output<List<NetworkLabelGetArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<NetworkLabelGetArgs> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder labels(NetworkLabelGetArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder options(@Nullable Output<Map<String,Object>> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable Map<String,Object> options) {
            this.options = Output.ofNullable(options);
            return this;
        }
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }        public NetworkState build() {
            return new NetworkState(attachable, checkDuplicate, driver, ingress, internal, ipamConfigs, ipamDriver, ipv6, labels, name, options, scope);
        }
    }
}
