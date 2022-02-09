// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.RouteResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InferenceContainerPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final InferenceContainerPropertiesResponse Empty = new InferenceContainerPropertiesResponse();

    @InputImport(name="livenessRoute")
    private final @Nullable RouteResponse livenessRoute;

    public Optional<RouteResponse> getLivenessRoute() {
        return this.livenessRoute == null ? Optional.empty() : Optional.ofNullable(this.livenessRoute);
    }

    @InputImport(name="readinessRoute")
    private final @Nullable RouteResponse readinessRoute;

    public Optional<RouteResponse> getReadinessRoute() {
        return this.readinessRoute == null ? Optional.empty() : Optional.ofNullable(this.readinessRoute);
    }

    @InputImport(name="scoringRoute")
    private final @Nullable RouteResponse scoringRoute;

    public Optional<RouteResponse> getScoringRoute() {
        return this.scoringRoute == null ? Optional.empty() : Optional.ofNullable(this.scoringRoute);
    }

    public InferenceContainerPropertiesResponse(
        @Nullable RouteResponse livenessRoute,
        @Nullable RouteResponse readinessRoute,
        @Nullable RouteResponse scoringRoute) {
        this.livenessRoute = livenessRoute;
        this.readinessRoute = readinessRoute;
        this.scoringRoute = scoringRoute;
    }

    private InferenceContainerPropertiesResponse() {
        this.livenessRoute = null;
        this.readinessRoute = null;
        this.scoringRoute = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InferenceContainerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RouteResponse livenessRoute;
        private @Nullable RouteResponse readinessRoute;
        private @Nullable RouteResponse scoringRoute;

        public Builder() {
    	      // Empty
        }

        public Builder(InferenceContainerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.livenessRoute = defaults.livenessRoute;
    	      this.readinessRoute = defaults.readinessRoute;
    	      this.scoringRoute = defaults.scoringRoute;
        }

        public Builder setLivenessRoute(@Nullable RouteResponse livenessRoute) {
            this.livenessRoute = livenessRoute;
            return this;
        }

        public Builder setReadinessRoute(@Nullable RouteResponse readinessRoute) {
            this.readinessRoute = readinessRoute;
            return this;
        }

        public Builder setScoringRoute(@Nullable RouteResponse scoringRoute) {
            this.scoringRoute = scoringRoute;
            return this;
        }

        public InferenceContainerPropertiesResponse build() {
            return new InferenceContainerPropertiesResponse(livenessRoute, readinessRoute, scoringRoute);
        }
    }
}
