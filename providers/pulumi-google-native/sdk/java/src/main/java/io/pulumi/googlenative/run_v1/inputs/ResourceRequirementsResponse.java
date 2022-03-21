// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * ResourceRequirements describes the compute resource requirements.
 * 
 */
public final class ResourceRequirementsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceRequirementsResponse Empty = new ResourceRequirementsResponse();

    /**
     * (Optional) Only memory and CPU are supported. Limits describes the maximum amount of compute resources allowed. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    @Import(name="limits", required=true)
      private final Map<String,String> limits;

    public Map<String,String> getLimits() {
        return this.limits;
    }

    /**
     * (Optional) Only memory and CPU are supported. Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    @Import(name="requests", required=true)
      private final Map<String,String> requests;

    public Map<String,String> getRequests() {
        return this.requests;
    }

    public ResourceRequirementsResponse(
        Map<String,String> limits,
        Map<String,String> requests) {
        this.limits = Objects.requireNonNull(limits, "expected parameter 'limits' to be non-null");
        this.requests = Objects.requireNonNull(requests, "expected parameter 'requests' to be non-null");
    }

    private ResourceRequirementsResponse() {
        this.limits = Map.of();
        this.requests = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> limits;
        private Map<String,String> requests;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder limits(Map<String,String> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }
        public Builder requests(Map<String,String> requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }        public ResourceRequirementsResponse build() {
            return new ResourceRequirementsResponse(limits, requests);
        }
    }
}
