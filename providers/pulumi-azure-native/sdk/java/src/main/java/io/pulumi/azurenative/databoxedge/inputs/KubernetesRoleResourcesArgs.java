// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.KubernetesRoleComputeArgs;
import io.pulumi.azurenative.databoxedge.inputs.KubernetesRoleStorageArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Kubernetes role resources
 * 
 */
public final class KubernetesRoleResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KubernetesRoleResourcesArgs Empty = new KubernetesRoleResourcesArgs();

    /**
     * Kubernetes role compute resource
     * 
     */
    @InputImport(name="compute", required=true)
      private final Input<KubernetesRoleComputeArgs> compute;

    public Input<KubernetesRoleComputeArgs> getCompute() {
        return this.compute;
    }

    /**
     * Kubernetes role storage resource
     * 
     */
    @InputImport(name="storage")
      private final @Nullable Input<KubernetesRoleStorageArgs> storage;

    public Input<KubernetesRoleStorageArgs> getStorage() {
        return this.storage == null ? Input.empty() : this.storage;
    }

    public KubernetesRoleResourcesArgs(
        Input<KubernetesRoleComputeArgs> compute,
        @Nullable Input<KubernetesRoleStorageArgs> storage) {
        this.compute = Objects.requireNonNull(compute, "expected parameter 'compute' to be non-null");
        this.storage = storage;
    }

    private KubernetesRoleResourcesArgs() {
        this.compute = Input.empty();
        this.storage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<KubernetesRoleComputeArgs> compute;
        private @Nullable Input<KubernetesRoleStorageArgs> storage;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compute = defaults.compute;
    	      this.storage = defaults.storage;
        }

        public Builder setCompute(Input<KubernetesRoleComputeArgs> compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }

        public Builder setCompute(KubernetesRoleComputeArgs compute) {
            this.compute = Input.of(Objects.requireNonNull(compute));
            return this;
        }

        public Builder setStorage(@Nullable Input<KubernetesRoleStorageArgs> storage) {
            this.storage = storage;
            return this;
        }

        public Builder setStorage(@Nullable KubernetesRoleStorageArgs storage) {
            this.storage = Input.ofNullable(storage);
            return this;
        }
        public KubernetesRoleResourcesArgs build() {
            return new KubernetesRoleResourcesArgs(compute, storage);
        }
    }
}
