// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.ResourceLimitsResponse;
import io.pulumi.azurenative.containerinstance.inputs.ResourceRequestsResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The resource requirements.
 * 
 */
public final class ResourceRequirementsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceRequirementsResponse Empty = new ResourceRequirementsResponse();

    /**
     * The resource limits of this container instance.
     * 
     */
    @Import(name="limits")
      private final @Nullable ResourceLimitsResponse limits;

    public Optional<ResourceLimitsResponse> getLimits() {
        return this.limits == null ? Optional.empty() : Optional.ofNullable(this.limits);
    }

    /**
     * The resource requests of this container instance.
     * 
     */
    @Import(name="requests", required=true)
      private final ResourceRequestsResponse requests;

    public ResourceRequestsResponse getRequests() {
        return this.requests;
    }

    public ResourceRequirementsResponse(
        @Nullable ResourceLimitsResponse limits,
        ResourceRequestsResponse requests) {
        this.limits = limits;
        this.requests = Objects.requireNonNull(requests, "expected parameter 'requests' to be non-null");
    }

    private ResourceRequirementsResponse() {
        this.limits = null;
        this.requests = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceLimitsResponse limits;
        private ResourceRequestsResponse requests;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder limits(@Nullable ResourceLimitsResponse limits) {
            this.limits = limits;
            return this;
        }
        public Builder requests(ResourceRequestsResponse requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }        public ResourceRequirementsResponse build() {
            return new ResourceRequirementsResponse(limits, requests);
        }
    }
}
