// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.KubernetesRoleComputeArgs;
import io.pulumi.azurenative.databoxedge.inputs.KubernetesRoleStorageArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="compute", required=true)
      private final Output<KubernetesRoleComputeArgs> compute;

    public Output<KubernetesRoleComputeArgs> getCompute() {
        return this.compute;
    }

    /**
     * Kubernetes role storage resource
     * 
     */
    @Import(name="storage")
      private final @Nullable Output<KubernetesRoleStorageArgs> storage;

    public Output<KubernetesRoleStorageArgs> getStorage() {
        return this.storage == null ? Codegen.empty() : this.storage;
    }

    public KubernetesRoleResourcesArgs(
        Output<KubernetesRoleComputeArgs> compute,
        @Nullable Output<KubernetesRoleStorageArgs> storage) {
        this.compute = Objects.requireNonNull(compute, "expected parameter 'compute' to be non-null");
        this.storage = storage;
    }

    private KubernetesRoleResourcesArgs() {
        this.compute = Codegen.empty();
        this.storage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<KubernetesRoleComputeArgs> compute;
        private @Nullable Output<KubernetesRoleStorageArgs> storage;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compute = defaults.compute;
    	      this.storage = defaults.storage;
        }

        public Builder compute(Output<KubernetesRoleComputeArgs> compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }
        public Builder compute(KubernetesRoleComputeArgs compute) {
            this.compute = Output.of(Objects.requireNonNull(compute));
            return this;
        }
        public Builder storage(@Nullable Output<KubernetesRoleStorageArgs> storage) {
            this.storage = storage;
            return this;
        }
        public Builder storage(@Nullable KubernetesRoleStorageArgs storage) {
            this.storage = Codegen.ofNullable(storage);
            return this;
        }        public KubernetesRoleResourcesArgs build() {
            return new KubernetesRoleResourcesArgs(compute, storage);
        }
    }
}
