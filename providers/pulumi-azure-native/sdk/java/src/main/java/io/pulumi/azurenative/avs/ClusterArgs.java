// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.avs.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    @InputImport(name="clusterName")
    private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    @InputImport(name="clusterSize", required=true)
    private final Input<Integer> clusterSize;

    public Input<Integer> getClusterSize() {
        return this.clusterSize;
    }

    @InputImport(name="privateCloudName", required=true)
    private final Input<String> privateCloudName;

    public Input<String> getPrivateCloudName() {
        return this.privateCloudName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sku", required=true)
    private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    public ClusterArgs(
        @Nullable Input<String> clusterName,
        Input<Integer> clusterSize,
        Input<String> privateCloudName,
        Input<String> resourceGroupName,
        Input<SkuArgs> sku) {
        this.clusterName = clusterName;
        this.clusterSize = Objects.requireNonNull(clusterSize, "expected parameter 'clusterSize' to be non-null");
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private ClusterArgs() {
        this.clusterName = Input.empty();
        this.clusterSize = Input.empty();
        this.privateCloudName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterName;
        private Input<Integer> clusterSize;
        private Input<String> privateCloudName;
        private Input<String> resourceGroupName;
        private Input<SkuArgs> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterSize = defaults.clusterSize;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
        }

        public Builder setClusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder setClusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder setClusterSize(Input<Integer> clusterSize) {
            this.clusterSize = Objects.requireNonNull(clusterSize);
            return this;
        }

        public Builder setClusterSize(Integer clusterSize) {
            this.clusterSize = Input.of(Objects.requireNonNull(clusterSize));
            return this;
        }

        public Builder setPrivateCloudName(Input<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Input.of(Objects.requireNonNull(privateCloudName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public ClusterArgs build() {
            return new ClusterArgs(clusterName, clusterSize, privateCloudName, resourceGroupName, sku);
        }
    }
}
