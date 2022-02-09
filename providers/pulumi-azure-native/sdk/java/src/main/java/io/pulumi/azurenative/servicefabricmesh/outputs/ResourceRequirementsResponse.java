// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.ResourceLimitsResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ResourceRequestsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceRequirementsResponse {
    private final @Nullable ResourceLimitsResponse limits;
    private final ResourceRequestsResponse requests;

    @OutputCustomType.Constructor({"limits","requests"})
    private ResourceRequirementsResponse(
        @Nullable ResourceLimitsResponse limits,
        ResourceRequestsResponse requests) {
        this.limits = limits;
        this.requests = Objects.requireNonNull(requests);
    }

    public Optional<ResourceLimitsResponse> getLimits() {
        return Optional.ofNullable(this.limits);
    }
    public ResourceRequestsResponse getRequests() {
        return this.requests;
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

        public Builder setLimits(@Nullable ResourceLimitsResponse limits) {
            this.limits = limits;
            return this;
        }

        public Builder setRequests(ResourceRequestsResponse requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }

        public ResourceRequirementsResponse build() {
            return new ResourceRequirementsResponse(limits, requests);
        }
    }
}
