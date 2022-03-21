// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.gkehub_v1.outputs.AppDevExperienceFeatureStateResponse;
import io.pulumi.googlenative.gkehub_v1.outputs.FeatureStateResponse;
import java.util.Objects;

@CustomType
public final class CommonFeatureStateResponse {
    /**
     * Appdevexperience specific state.
     * 
     */
    private final AppDevExperienceFeatureStateResponse appdevexperience;
    /**
     * The "running state" of the Feature in this Hub.
     * 
     */
    private final FeatureStateResponse state;

    @CustomType.Constructor
    private CommonFeatureStateResponse(
        @CustomType.Parameter("appdevexperience") AppDevExperienceFeatureStateResponse appdevexperience,
        @CustomType.Parameter("state") FeatureStateResponse state) {
        this.appdevexperience = appdevexperience;
        this.state = state;
    }

    /**
     * Appdevexperience specific state.
     * 
    */
    public AppDevExperienceFeatureStateResponse getAppdevexperience() {
        return this.appdevexperience;
    }
    /**
     * The "running state" of the Feature in this Hub.
     * 
    */
    public FeatureStateResponse getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonFeatureStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppDevExperienceFeatureStateResponse appdevexperience;
        private FeatureStateResponse state;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonFeatureStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appdevexperience = defaults.appdevexperience;
    	      this.state = defaults.state;
        }

        public Builder appdevexperience(AppDevExperienceFeatureStateResponse appdevexperience) {
            this.appdevexperience = Objects.requireNonNull(appdevexperience);
            return this;
        }
        public Builder state(FeatureStateResponse state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public CommonFeatureStateResponse build() {
            return new CommonFeatureStateResponse(appdevexperience, state);
        }
    }
}
