// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.NetworkProfileArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterResourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterResourcePropertiesArgs Empty = new ClusterResourcePropertiesArgs();

    @InputImport(name="networkProfile")
    private final @Nullable Input<NetworkProfileArgs> networkProfile;

    public Input<NetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Input.empty() : this.networkProfile;
    }

    public ClusterResourcePropertiesArgs(@Nullable Input<NetworkProfileArgs> networkProfile) {
        this.networkProfile = networkProfile;
    }

    private ClusterResourcePropertiesArgs() {
        this.networkProfile = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NetworkProfileArgs> networkProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterResourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkProfile = defaults.networkProfile;
        }

        public Builder setNetworkProfile(@Nullable Input<NetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setNetworkProfile(@Nullable NetworkProfileArgs networkProfile) {
            this.networkProfile = Input.ofNullable(networkProfile);
            return this;
        }

        public ClusterResourcePropertiesArgs build() {
            return new ClusterResourcePropertiesArgs(networkProfile);
        }
    }
}