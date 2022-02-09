// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.ResourceLimitsArgs;
import io.pulumi.azurenative.containerinstance.inputs.ResourceRequestsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceRequirementsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceRequirementsArgs Empty = new ResourceRequirementsArgs();

    @InputImport(name="limits")
    private final @Nullable Input<ResourceLimitsArgs> limits;

    public Input<ResourceLimitsArgs> getLimits() {
        return this.limits == null ? Input.empty() : this.limits;
    }

    @InputImport(name="requests", required=true)
    private final Input<ResourceRequestsArgs> requests;

    public Input<ResourceRequestsArgs> getRequests() {
        return this.requests;
    }

    public ResourceRequirementsArgs(
        @Nullable Input<ResourceLimitsArgs> limits,
        Input<ResourceRequestsArgs> requests) {
        this.limits = limits;
        this.requests = Objects.requireNonNull(requests, "expected parameter 'requests' to be non-null");
    }

    private ResourceRequirementsArgs() {
        this.limits = Input.empty();
        this.requests = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequirementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceLimitsArgs> limits;
        private Input<ResourceRequestsArgs> requests;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRequirementsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder setLimits(@Nullable Input<ResourceLimitsArgs> limits) {
            this.limits = limits;
            return this;
        }

        public Builder setLimits(@Nullable ResourceLimitsArgs limits) {
            this.limits = Input.ofNullable(limits);
            return this;
        }

        public Builder setRequests(Input<ResourceRequestsArgs> requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }

        public Builder setRequests(ResourceRequestsArgs requests) {
            this.requests = Input.of(Objects.requireNonNull(requests));
            return this;
        }

        public ResourceRequirementsArgs build() {
            return new ResourceRequirementsArgs(limits, requests);
        }
    }
}
