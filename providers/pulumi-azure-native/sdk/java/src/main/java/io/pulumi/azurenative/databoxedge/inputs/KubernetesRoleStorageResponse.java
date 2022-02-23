// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.KubernetesRoleStorageClassInfoResponse;
import io.pulumi.azurenative.databoxedge.inputs.MountPointMapResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubernetes role storage resource
 * 
 */
public final class KubernetesRoleStorageResponse extends io.pulumi.resources.InvokeArgs {

    public static final KubernetesRoleStorageResponse Empty = new KubernetesRoleStorageResponse();

    /**
     * Mount points of shares in role(s).
     * 
     */
    @InputImport(name="endpoints")
      private final @Nullable List<MountPointMapResponse> endpoints;

    public List<MountPointMapResponse> getEndpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }

    /**
     * Kubernetes storage class info.
     * 
     */
    @InputImport(name="storageClasses", required=true)
      private final List<KubernetesRoleStorageClassInfoResponse> storageClasses;

    public List<KubernetesRoleStorageClassInfoResponse> getStorageClasses() {
        return this.storageClasses;
    }

    public KubernetesRoleStorageResponse(
        @Nullable List<MountPointMapResponse> endpoints,
        List<KubernetesRoleStorageClassInfoResponse> storageClasses) {
        this.endpoints = endpoints;
        this.storageClasses = Objects.requireNonNull(storageClasses, "expected parameter 'storageClasses' to be non-null");
    }

    private KubernetesRoleStorageResponse() {
        this.endpoints = List.of();
        this.storageClasses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleStorageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<MountPointMapResponse> endpoints;
        private List<KubernetesRoleStorageClassInfoResponse> storageClasses;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleStorageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.storageClasses = defaults.storageClasses;
        }

        public Builder setEndpoints(@Nullable List<MountPointMapResponse> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setStorageClasses(List<KubernetesRoleStorageClassInfoResponse> storageClasses) {
            this.storageClasses = Objects.requireNonNull(storageClasses);
            return this;
        }
        public KubernetesRoleStorageResponse build() {
            return new KubernetesRoleStorageResponse(endpoints, storageClasses);
        }
    }
}
