// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodePoolNetworkConfig {
    /**
     * Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified.
     * 
     */
    private final @Nullable Boolean createPodRange;
    /**
     * The IP address range for pod IPs in this node pool. Only applicable if createPodRange is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14) to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14) to pick a specific range to use.
     * 
     */
    private final @Nullable String podIpv4CidrBlock;
    /**
     * The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID.
     * 
     */
    private final String podRange;

    @CustomType.Constructor
    private ClusterNodePoolNetworkConfig(
        @CustomType.Parameter("createPodRange") @Nullable Boolean createPodRange,
        @CustomType.Parameter("podIpv4CidrBlock") @Nullable String podIpv4CidrBlock,
        @CustomType.Parameter("podRange") String podRange) {
        this.createPodRange = createPodRange;
        this.podIpv4CidrBlock = podIpv4CidrBlock;
        this.podRange = podRange;
    }

    /**
     * Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified.
     * 
    */
    public Optional<Boolean> getCreatePodRange() {
        return Optional.ofNullable(this.createPodRange);
    }
    /**
     * The IP address range for pod IPs in this node pool. Only applicable if createPodRange is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14) to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14) to pick a specific range to use.
     * 
    */
    public Optional<String> getPodIpv4CidrBlock() {
        return Optional.ofNullable(this.podIpv4CidrBlock);
    }
    /**
     * The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID.
     * 
    */
    public String getPodRange() {
        return this.podRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean createPodRange;
        private @Nullable String podIpv4CidrBlock;
        private String podRange;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPodRange = defaults.createPodRange;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        public Builder createPodRange(@Nullable Boolean createPodRange) {
            this.createPodRange = createPodRange;
            return this;
        }
        public Builder podIpv4CidrBlock(@Nullable String podIpv4CidrBlock) {
            this.podIpv4CidrBlock = podIpv4CidrBlock;
            return this;
        }
        public Builder podRange(String podRange) {
            this.podRange = Objects.requireNonNull(podRange);
            return this;
        }        public ClusterNodePoolNetworkConfig build() {
            return new ClusterNodePoolNetworkConfig(createPodRange, podIpv4CidrBlock, podRange);
        }
    }
}
