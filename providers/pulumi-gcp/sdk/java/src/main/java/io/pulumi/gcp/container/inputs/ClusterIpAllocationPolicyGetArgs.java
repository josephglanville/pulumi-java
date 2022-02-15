// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterIpAllocationPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIpAllocationPolicyGetArgs Empty = new ClusterIpAllocationPolicyGetArgs();

    @InputImport(name="clusterIpv4CidrBlock")
    private final @Nullable Input<String> clusterIpv4CidrBlock;

    public Input<String> getClusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock == null ? Input.empty() : this.clusterIpv4CidrBlock;
    }

    @InputImport(name="clusterSecondaryRangeName")
    private final @Nullable Input<String> clusterSecondaryRangeName;

    public Input<String> getClusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName == null ? Input.empty() : this.clusterSecondaryRangeName;
    }

    @InputImport(name="servicesIpv4CidrBlock")
    private final @Nullable Input<String> servicesIpv4CidrBlock;

    public Input<String> getServicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock == null ? Input.empty() : this.servicesIpv4CidrBlock;
    }

    @InputImport(name="servicesSecondaryRangeName")
    private final @Nullable Input<String> servicesSecondaryRangeName;

    public Input<String> getServicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName == null ? Input.empty() : this.servicesSecondaryRangeName;
    }

    public ClusterIpAllocationPolicyGetArgs(
        @Nullable Input<String> clusterIpv4CidrBlock,
        @Nullable Input<String> clusterSecondaryRangeName,
        @Nullable Input<String> servicesIpv4CidrBlock,
        @Nullable Input<String> servicesSecondaryRangeName) {
        this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = clusterSecondaryRangeName;
        this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = servicesSecondaryRangeName;
    }

    private ClusterIpAllocationPolicyGetArgs() {
        this.clusterIpv4CidrBlock = Input.empty();
        this.clusterSecondaryRangeName = Input.empty();
        this.servicesIpv4CidrBlock = Input.empty();
        this.servicesSecondaryRangeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIpAllocationPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterIpv4CidrBlock;
        private @Nullable Input<String> clusterSecondaryRangeName;
        private @Nullable Input<String> servicesIpv4CidrBlock;
        private @Nullable Input<String> servicesSecondaryRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIpAllocationPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIpv4CidrBlock = defaults.clusterIpv4CidrBlock;
    	      this.clusterSecondaryRangeName = defaults.clusterSecondaryRangeName;
    	      this.servicesIpv4CidrBlock = defaults.servicesIpv4CidrBlock;
    	      this.servicesSecondaryRangeName = defaults.servicesSecondaryRangeName;
        }

        public Builder setClusterIpv4CidrBlock(@Nullable Input<String> clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
            return this;
        }

        public Builder setClusterIpv4CidrBlock(@Nullable String clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = Input.ofNullable(clusterIpv4CidrBlock);
            return this;
        }

        public Builder setClusterSecondaryRangeName(@Nullable Input<String> clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = clusterSecondaryRangeName;
            return this;
        }

        public Builder setClusterSecondaryRangeName(@Nullable String clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = Input.ofNullable(clusterSecondaryRangeName);
            return this;
        }

        public Builder setServicesIpv4CidrBlock(@Nullable Input<String> servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
            return this;
        }

        public Builder setServicesIpv4CidrBlock(@Nullable String servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = Input.ofNullable(servicesIpv4CidrBlock);
            return this;
        }

        public Builder setServicesSecondaryRangeName(@Nullable Input<String> servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = servicesSecondaryRangeName;
            return this;
        }

        public Builder setServicesSecondaryRangeName(@Nullable String servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = Input.ofNullable(servicesSecondaryRangeName);
            return this;
        }

        public ClusterIpAllocationPolicyGetArgs build() {
            return new ClusterIpAllocationPolicyGetArgs(clusterIpv4CidrBlock, clusterSecondaryRangeName, servicesIpv4CidrBlock, servicesSecondaryRangeName);
        }
    }
}