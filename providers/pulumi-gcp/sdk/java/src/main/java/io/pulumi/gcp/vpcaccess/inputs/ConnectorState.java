// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vpcaccess.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.vpcaccess.inputs.ConnectorSubnetGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorState extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorState Empty = new ConnectorState();

    /**
     * The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    @Import(name="ipCidrRange")
      private final @Nullable Output<String> ipCidrRange;

    public Output<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Output.empty() : this.ipCidrRange;
    }

    /**
     * Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Output.empty() : this.machineType;
    }

    /**
     * Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    @Import(name="maxInstances")
      private final @Nullable Output<Integer> maxInstances;

    public Output<Integer> getMaxInstances() {
        return this.maxInstances == null ? Output.empty() : this.maxInstances;
    }

    /**
     * Maximum throughput of the connector in Mbps, must be greater than `min_throughput`. Default is 300.
     * 
     */
    @Import(name="maxThroughput")
      private final @Nullable Output<Integer> maxThroughput;

    public Output<Integer> getMaxThroughput() {
        return this.maxThroughput == null ? Output.empty() : this.maxThroughput;
    }

    /**
     * Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    @Import(name="minInstances")
      private final @Nullable Output<Integer> minInstances;

    public Output<Integer> getMinInstances() {
        return this.minInstances == null ? Output.empty() : this.minInstances;
    }

    /**
     * Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    @Import(name="minThroughput")
      private final @Nullable Output<Integer> minThroughput;

    public Output<Integer> getMinThroughput() {
        return this.minThroughput == null ? Output.empty() : this.minThroughput;
    }

    /**
     * Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
     * https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Name or self_link of the VPC network. Required if `ip_cidr_range` is set.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
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

    /**
     * Region where the VPC Access connector resides. If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The fully qualified name of this VPC connector
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    /**
     * State of the VPC access connector.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * The subnet in which to house the connector
     * Structure is documented below.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<ConnectorSubnetGetArgs> subnet;

    public Output<ConnectorSubnetGetArgs> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
    }

    public ConnectorState(
        @Nullable Output<String> ipCidrRange,
        @Nullable Output<String> machineType,
        @Nullable Output<Integer> maxInstances,
        @Nullable Output<Integer> maxThroughput,
        @Nullable Output<Integer> minInstances,
        @Nullable Output<Integer> minThroughput,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> state,
        @Nullable Output<ConnectorSubnetGetArgs> subnet) {
        this.ipCidrRange = ipCidrRange;
        this.machineType = machineType;
        this.maxInstances = maxInstances;
        this.maxThroughput = maxThroughput;
        this.minInstances = minInstances;
        this.minThroughput = minThroughput;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
        this.state = state;
        this.subnet = subnet;
    }

    private ConnectorState() {
        this.ipCidrRange = Output.empty();
        this.machineType = Output.empty();
        this.maxInstances = Output.empty();
        this.maxThroughput = Output.empty();
        this.minInstances = Output.empty();
        this.minThroughput = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.selfLink = Output.empty();
        this.state = Output.empty();
        this.subnet = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipCidrRange;
        private @Nullable Output<String> machineType;
        private @Nullable Output<Integer> maxInstances;
        private @Nullable Output<Integer> maxThroughput;
        private @Nullable Output<Integer> minInstances;
        private @Nullable Output<Integer> minThroughput;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> state;
        private @Nullable Output<ConnectorSubnetGetArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.machineType = defaults.machineType;
    	      this.maxInstances = defaults.maxInstances;
    	      this.maxThroughput = defaults.maxThroughput;
    	      this.minInstances = defaults.minInstances;
    	      this.minThroughput = defaults.minThroughput;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.state = defaults.state;
    	      this.subnet = defaults.subnet;
        }

        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }
        public Builder ipCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Output.ofNullable(ipCidrRange);
            return this;
        }
        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = Output.ofNullable(machineType);
            return this;
        }
        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Output.ofNullable(maxInstances);
            return this;
        }
        public Builder maxThroughput(@Nullable Output<Integer> maxThroughput) {
            this.maxThroughput = maxThroughput;
            return this;
        }
        public Builder maxThroughput(@Nullable Integer maxThroughput) {
            this.maxThroughput = Output.ofNullable(maxThroughput);
            return this;
        }
        public Builder minInstances(@Nullable Output<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = Output.ofNullable(minInstances);
            return this;
        }
        public Builder minThroughput(@Nullable Output<Integer> minThroughput) {
            this.minThroughput = minThroughput;
            return this;
        }
        public Builder minThroughput(@Nullable Integer minThroughput) {
            this.minThroughput = Output.ofNullable(minThroughput);
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
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder subnet(@Nullable Output<ConnectorSubnetGetArgs> subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnet(@Nullable ConnectorSubnetGetArgs subnet) {
            this.subnet = Output.ofNullable(subnet);
            return this;
        }        public ConnectorState build() {
            return new ConnectorState(ipCidrRange, machineType, maxInstances, maxThroughput, minInstances, minThroughput, name, network, project, region, selfLink, state, subnet);
        }
    }
}
