// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.CloudErrorResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterPodIdentityResponseProvisioningInfo {
    private final @Nullable CloudErrorResponse error;

    @OutputCustomType.Constructor({"error"})
    private ManagedClusterPodIdentityResponseProvisioningInfo(@Nullable CloudErrorResponse error) {
        this.error = error;
    }

    public Optional<CloudErrorResponse> getError() {
        return Optional.ofNullable(this.error);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPodIdentityResponseProvisioningInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CloudErrorResponse error;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPodIdentityResponseProvisioningInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
        }

        public Builder setError(@Nullable CloudErrorResponse error) {
            this.error = error;
            return this;
        }

        public ManagedClusterPodIdentityResponseProvisioningInfo build() {
            return new ManagedClusterPodIdentityResponseProvisioningInfo(error);
        }
    }
}
