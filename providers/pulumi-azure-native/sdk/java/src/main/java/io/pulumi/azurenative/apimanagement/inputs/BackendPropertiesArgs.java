// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.BackendServiceFabricClusterPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties specific to the Backend Type.
 * 
 */
public final class BackendPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendPropertiesArgs Empty = new BackendPropertiesArgs();

    /**
     * Backend Service Fabric Cluster Properties
     * 
     */
    @Import(name="serviceFabricCluster")
      private final @Nullable Output<BackendServiceFabricClusterPropertiesArgs> serviceFabricCluster;

    public Output<BackendServiceFabricClusterPropertiesArgs> getServiceFabricCluster() {
        return this.serviceFabricCluster == null ? Output.empty() : this.serviceFabricCluster;
    }

    public BackendPropertiesArgs(@Nullable Output<BackendServiceFabricClusterPropertiesArgs> serviceFabricCluster) {
        this.serviceFabricCluster = serviceFabricCluster;
    }

    private BackendPropertiesArgs() {
        this.serviceFabricCluster = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BackendServiceFabricClusterPropertiesArgs> serviceFabricCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceFabricCluster = defaults.serviceFabricCluster;
        }

        public Builder serviceFabricCluster(@Nullable Output<BackendServiceFabricClusterPropertiesArgs> serviceFabricCluster) {
            this.serviceFabricCluster = serviceFabricCluster;
            return this;
        }
        public Builder serviceFabricCluster(@Nullable BackendServiceFabricClusterPropertiesArgs serviceFabricCluster) {
            this.serviceFabricCluster = Output.ofNullable(serviceFabricCluster);
            return this;
        }        public BackendPropertiesArgs build() {
            return new BackendPropertiesArgs(serviceFabricCluster);
        }
    }
}
