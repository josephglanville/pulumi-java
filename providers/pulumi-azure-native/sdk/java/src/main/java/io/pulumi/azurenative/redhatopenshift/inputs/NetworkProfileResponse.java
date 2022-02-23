// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NetworkProfile represents a network profile.
 * 
 */
public final class NetworkProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkProfileResponse Empty = new NetworkProfileResponse();

    /**
     * The CIDR used for OpenShift/Kubernetes Pods (immutable).
     * 
     */
    @InputImport(name="podCidr")
      private final @Nullable String podCidr;

    public Optional<String> getPodCidr() {
        return this.podCidr == null ? Optional.empty() : Optional.ofNullable(this.podCidr);
    }

    /**
     * The CIDR used for OpenShift/Kubernetes Services (immutable).
     * 
     */
    @InputImport(name="serviceCidr")
      private final @Nullable String serviceCidr;

    public Optional<String> getServiceCidr() {
        return this.serviceCidr == null ? Optional.empty() : Optional.ofNullable(this.serviceCidr);
    }

    public NetworkProfileResponse(
        @Nullable String podCidr,
        @Nullable String serviceCidr) {
        this.podCidr = podCidr;
        this.serviceCidr = serviceCidr;
    }

    private NetworkProfileResponse() {
        this.podCidr = null;
        this.serviceCidr = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String podCidr;
        private @Nullable String serviceCidr;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podCidr = defaults.podCidr;
    	      this.serviceCidr = defaults.serviceCidr;
        }

        public Builder setPodCidr(@Nullable String podCidr) {
            this.podCidr = podCidr;
            return this;
        }

        public Builder setServiceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public NetworkProfileResponse build() {
            return new NetworkProfileResponse(podCidr, serviceCidr);
        }
    }
}
