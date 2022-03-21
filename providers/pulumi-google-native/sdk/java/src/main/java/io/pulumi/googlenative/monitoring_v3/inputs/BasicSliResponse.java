// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v3.inputs.AvailabilityCriteriaResponse;
import io.pulumi.googlenative.monitoring_v3.inputs.LatencyCriteriaResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An SLI measuring performance on a well-known service type. Performance will be computed on the basis of pre-defined metrics. The type of the service_resource determines the metrics to use and the service_resource.labels and metric_labels are used to construct a monitoring filter to filter that metric down to just the data relevant to this service.
 * 
 */
public final class BasicSliResponse extends io.pulumi.resources.InvokeArgs {

    public static final BasicSliResponse Empty = new BasicSliResponse();

    /**
     * Good service is defined to be the count of requests made to this service that return successfully.
     * 
     */
    @Import(name="availability", required=true)
      private final AvailabilityCriteriaResponse availability;

    public AvailabilityCriteriaResponse getAvailability() {
        return this.availability;
    }

    /**
     * Good service is defined to be the count of requests made to this service that are fast enough with respect to latency.threshold.
     * 
     */
    @Import(name="latency", required=true)
      private final LatencyCriteriaResponse latency;

    public LatencyCriteriaResponse getLatency() {
        return this.latency;
    }

    /**
     * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry from other locations will not be used to calculate performance for this SLI. If omitted, this SLI applies to all locations in which the Service has activity. For service types that don't support breaking down by location, setting this field will result in an error.
     * 
     */
    @Import(name="location", required=true)
      private final List<String> location;

    public List<String> getLocation() {
        return this.location;
    }

    /**
     * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from other methods will not be used to calculate performance for this SLI. If omitted, this SLI applies to all the Service's methods. For service types that don't support breaking down by method, setting this field will result in an error.
     * 
     */
    @Import(name="method", required=true)
      private final List<String> method;

    public List<String> getMethod() {
        return this.method;
    }

    /**
     * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry from other API versions will not be used to calculate performance for this SLI. If omitted, this SLI applies to all API versions. For service types that don't support breaking down by version, setting this field will result in an error.
     * 
     */
    @Import(name="version", required=true)
      private final List<String> version;

    public List<String> getVersion() {
        return this.version;
    }

    public BasicSliResponse(
        AvailabilityCriteriaResponse availability,
        LatencyCriteriaResponse latency,
        List<String> location,
        List<String> method,
        List<String> version) {
        this.availability = Objects.requireNonNull(availability, "expected parameter 'availability' to be non-null");
        this.latency = Objects.requireNonNull(latency, "expected parameter 'latency' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private BasicSliResponse() {
        this.availability = null;
        this.latency = null;
        this.location = List.of();
        this.method = List.of();
        this.version = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicSliResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityCriteriaResponse availability;
        private LatencyCriteriaResponse latency;
        private List<String> location;
        private List<String> method;
        private List<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicSliResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.latency = defaults.latency;
    	      this.location = defaults.location;
    	      this.method = defaults.method;
    	      this.version = defaults.version;
        }

        public Builder availability(AvailabilityCriteriaResponse availability) {
            this.availability = Objects.requireNonNull(availability);
            return this;
        }
        public Builder latency(LatencyCriteriaResponse latency) {
            this.latency = Objects.requireNonNull(latency);
            return this;
        }
        public Builder location(List<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String... location) {
            return location(List.of(location));
        }
        public Builder method(List<String> method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        public Builder method(String... method) {
            return method(List.of(method));
        }
        public Builder version(List<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String... version) {
            return version(List.of(version));
        }        public BasicSliResponse build() {
            return new BasicSliResponse(availability, latency, location, method, version);
        }
    }
}
