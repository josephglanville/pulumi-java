// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudEndpointsResponse {
    /**
     * The name of the Cloud Endpoints service underlying this service. Corresponds to the service resource label in the api monitored resource: https://cloud.google.com/monitoring/api/resources#tag_api
     * 
     */
    private final String service;

    @CustomType.Constructor
    private CloudEndpointsResponse(@CustomType.Parameter("service") String service) {
        this.service = service;
    }

    /**
     * The name of the Cloud Endpoints service underlying this service. Corresponds to the service resource label in the api monitored resource: https://cloud.google.com/monitoring/api/resources#tag_api
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public CloudEndpointsResponse build() {
            return new CloudEndpointsResponse(service);
        }
    }
}
