// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.gkehub_v1.inputs.StatusResponse;
import java.util.Objects;


/**
 * State for App Dev Exp Feature.
 * 
 */
public final class AppDevExperienceFeatureStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final AppDevExperienceFeatureStateResponse Empty = new AppDevExperienceFeatureStateResponse();

    /**
     * Status of subcomponent that detects configured Service Mesh resources.
     * 
     */
    @Import(name="networkingInstallSucceeded", required=true)
      private final StatusResponse networkingInstallSucceeded;

    public StatusResponse getNetworkingInstallSucceeded() {
        return this.networkingInstallSucceeded;
    }

    public AppDevExperienceFeatureStateResponse(StatusResponse networkingInstallSucceeded) {
        this.networkingInstallSucceeded = Objects.requireNonNull(networkingInstallSucceeded, "expected parameter 'networkingInstallSucceeded' to be non-null");
    }

    private AppDevExperienceFeatureStateResponse() {
        this.networkingInstallSucceeded = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppDevExperienceFeatureStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusResponse networkingInstallSucceeded;

        public Builder() {
    	      // Empty
        }

        public Builder(AppDevExperienceFeatureStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkingInstallSucceeded = defaults.networkingInstallSucceeded;
        }

        public Builder networkingInstallSucceeded(StatusResponse networkingInstallSucceeded) {
            this.networkingInstallSucceeded = Objects.requireNonNull(networkingInstallSucceeded);
            return this;
        }        public AppDevExperienceFeatureStateResponse build() {
            return new AppDevExperienceFeatureStateResponse(networkingInstallSucceeded);
        }
    }
}
