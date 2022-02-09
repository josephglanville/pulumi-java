// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnlineEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final OnlineEndpointResponse Empty = new OnlineEndpointResponse();

    @InputImport(name="authMode", required=true)
    private final String authMode;

    public String getAuthMode() {
        return this.authMode;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="properties")
    private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="scoringUri", required=true)
    private final String scoringUri;

    public String getScoringUri() {
        return this.scoringUri;
    }

    @InputImport(name="swaggerUri", required=true)
    private final String swaggerUri;

    public String getSwaggerUri() {
        return this.swaggerUri;
    }

    @InputImport(name="target")
    private final @Nullable String target;

    public Optional<String> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    @InputImport(name="traffic")
    private final @Nullable Map<String,Integer> traffic;

    public Map<String,Integer> getTraffic() {
        return this.traffic == null ? Map.of() : this.traffic;
    }

    public OnlineEndpointResponse(
        String authMode,
        @Nullable String description,
        @Nullable Map<String,String> properties,
        String provisioningState,
        String scoringUri,
        String swaggerUri,
        @Nullable String target,
        @Nullable Map<String,Integer> traffic) {
        this.authMode = Objects.requireNonNull(authMode, "expected parameter 'authMode' to be non-null");
        this.description = description;
        this.properties = properties;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.scoringUri = Objects.requireNonNull(scoringUri, "expected parameter 'scoringUri' to be non-null");
        this.swaggerUri = Objects.requireNonNull(swaggerUri, "expected parameter 'swaggerUri' to be non-null");
        this.target = target;
        this.traffic = traffic;
    }

    private OnlineEndpointResponse() {
        this.authMode = null;
        this.description = null;
        this.properties = Map.of();
        this.provisioningState = null;
        this.scoringUri = null;
        this.swaggerUri = null;
        this.target = null;
        this.traffic = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnlineEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authMode;
        private @Nullable String description;
        private @Nullable Map<String,String> properties;
        private String provisioningState;
        private String scoringUri;
        private String swaggerUri;
        private @Nullable String target;
        private @Nullable Map<String,Integer> traffic;

        public Builder() {
    	      // Empty
        }

        public Builder(OnlineEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authMode = defaults.authMode;
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scoringUri = defaults.scoringUri;
    	      this.swaggerUri = defaults.swaggerUri;
    	      this.target = defaults.target;
    	      this.traffic = defaults.traffic;
        }

        public Builder setAuthMode(String authMode) {
            this.authMode = Objects.requireNonNull(authMode);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setScoringUri(String scoringUri) {
            this.scoringUri = Objects.requireNonNull(scoringUri);
            return this;
        }

        public Builder setSwaggerUri(String swaggerUri) {
            this.swaggerUri = Objects.requireNonNull(swaggerUri);
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public Builder setTraffic(@Nullable Map<String,Integer> traffic) {
            this.traffic = traffic;
            return this;
        }

        public OnlineEndpointResponse build() {
            return new OnlineEndpointResponse(authMode, description, properties, provisioningState, scoringUri, swaggerUri, target, traffic);
        }
    }
}
