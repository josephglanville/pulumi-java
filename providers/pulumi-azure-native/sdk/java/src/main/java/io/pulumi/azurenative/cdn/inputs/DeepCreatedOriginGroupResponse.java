// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.HealthProbeParametersResponse;
import io.pulumi.azurenative.cdn.inputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.inputs.ResponseBasedOriginErrorDetectionParametersResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeepCreatedOriginGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeepCreatedOriginGroupResponse Empty = new DeepCreatedOriginGroupResponse();

    @InputImport(name="healthProbeSettings")
    private final @Nullable HealthProbeParametersResponse healthProbeSettings;

    public Optional<HealthProbeParametersResponse> getHealthProbeSettings() {
        return this.healthProbeSettings == null ? Optional.empty() : Optional.ofNullable(this.healthProbeSettings);
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="origins", required=true)
    private final List<ResourceReferenceResponse> origins;

    public List<ResourceReferenceResponse> getOrigins() {
        return this.origins;
    }

    @InputImport(name="responseBasedOriginErrorDetectionSettings")
    private final @Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings;

    public Optional<ResponseBasedOriginErrorDetectionParametersResponse> getResponseBasedOriginErrorDetectionSettings() {
        return this.responseBasedOriginErrorDetectionSettings == null ? Optional.empty() : Optional.ofNullable(this.responseBasedOriginErrorDetectionSettings);
    }

    @InputImport(name="trafficRestorationTimeToHealedOrNewEndpointsInMinutes")
    private final @Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

    public Optional<Integer> getTrafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes == null ? Optional.empty() : Optional.ofNullable(this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
    }

    public DeepCreatedOriginGroupResponse(
        @Nullable HealthProbeParametersResponse healthProbeSettings,
        String name,
        List<ResourceReferenceResponse> origins,
        @Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings,
        @Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        this.healthProbeSettings = healthProbeSettings;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.origins = Objects.requireNonNull(origins, "expected parameter 'origins' to be non-null");
        this.responseBasedOriginErrorDetectionSettings = responseBasedOriginErrorDetectionSettings;
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    private DeepCreatedOriginGroupResponse() {
        this.healthProbeSettings = null;
        this.name = null;
        this.origins = List.of();
        this.responseBasedOriginErrorDetectionSettings = null;
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeepCreatedOriginGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HealthProbeParametersResponse healthProbeSettings;
        private String name;
        private List<ResourceReferenceResponse> origins;
        private @Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings;
        private @Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeepCreatedOriginGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthProbeSettings = defaults.healthProbeSettings;
    	      this.name = defaults.name;
    	      this.origins = defaults.origins;
    	      this.responseBasedOriginErrorDetectionSettings = defaults.responseBasedOriginErrorDetectionSettings;
    	      this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = defaults.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
        }

        public Builder setHealthProbeSettings(@Nullable HealthProbeParametersResponse healthProbeSettings) {
            this.healthProbeSettings = healthProbeSettings;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOrigins(List<ResourceReferenceResponse> origins) {
            this.origins = Objects.requireNonNull(origins);
            return this;
        }

        public Builder setResponseBasedOriginErrorDetectionSettings(@Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings) {
            this.responseBasedOriginErrorDetectionSettings = responseBasedOriginErrorDetectionSettings;
            return this;
        }

        public Builder setTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(@Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
            this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
            return this;
        }

        public DeepCreatedOriginGroupResponse build() {
            return new DeepCreatedOriginGroupResponse(healthProbeSettings, name, origins, responseBasedOriginErrorDetectionSettings, trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        }
    }
}
