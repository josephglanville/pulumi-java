// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.cdn.enums.EnabledState;
import io.pulumi.azurenative.cdn.inputs.HealthProbeParametersArgs;
import io.pulumi.azurenative.cdn.inputs.LoadBalancingSettingsParametersArgs;
import io.pulumi.azurenative.cdn.inputs.ResponseBasedOriginErrorDetectionParametersArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AFDOriginGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final AFDOriginGroupArgs Empty = new AFDOriginGroupArgs();

    /**
     * Health probe settings to the origin that is used to determine the health of the origin.
     * 
     */
    @Import(name="healthProbeSettings")
      private final @Nullable Output<HealthProbeParametersArgs> healthProbeSettings;

    public Output<HealthProbeParametersArgs> getHealthProbeSettings() {
        return this.healthProbeSettings == null ? Output.empty() : this.healthProbeSettings;
    }

    /**
     * Load balancing settings for a backend pool
     * 
     */
    @Import(name="loadBalancingSettings")
      private final @Nullable Output<LoadBalancingSettingsParametersArgs> loadBalancingSettings;

    public Output<LoadBalancingSettingsParametersArgs> getLoadBalancingSettings() {
        return this.loadBalancingSettings == null ? Output.empty() : this.loadBalancingSettings;
    }

    /**
     * Name of the origin group which is unique within the endpoint.
     * 
     */
    @Import(name="originGroupName")
      private final @Nullable Output<String> originGroupName;

    public Output<String> getOriginGroupName() {
        return this.originGroupName == null ? Output.empty() : this.originGroupName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
      private final Output<String> profileName;

    public Output<String> getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The JSON object that contains the properties to determine origin health using real requests/responses. This property is currently not supported.
     * 
     */
    @Import(name="responseBasedAfdOriginErrorDetectionSettings")
      private final @Nullable Output<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedAfdOriginErrorDetectionSettings;

    public Output<ResponseBasedOriginErrorDetectionParametersArgs> getResponseBasedAfdOriginErrorDetectionSettings() {
        return this.responseBasedAfdOriginErrorDetectionSettings == null ? Output.empty() : this.responseBasedAfdOriginErrorDetectionSettings;
    }

    /**
     * Whether to allow session affinity on this host. Valid options are 'Enabled' or 'Disabled'
     * 
     */
    @Import(name="sessionAffinityState")
      private final @Nullable Output<Either<String,EnabledState>> sessionAffinityState;

    public Output<Either<String,EnabledState>> getSessionAffinityState() {
        return this.sessionAffinityState == null ? Output.empty() : this.sessionAffinityState;
    }

    /**
     * Time in minutes to shift the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins. This property is currently not supported.
     * 
     */
    @Import(name="trafficRestorationTimeToHealedOrNewEndpointsInMinutes")
      private final @Nullable Output<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

    public Output<Integer> getTrafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes == null ? Output.empty() : this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    public AFDOriginGroupArgs(
        @Nullable Output<HealthProbeParametersArgs> healthProbeSettings,
        @Nullable Output<LoadBalancingSettingsParametersArgs> loadBalancingSettings,
        @Nullable Output<String> originGroupName,
        Output<String> profileName,
        Output<String> resourceGroupName,
        @Nullable Output<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedAfdOriginErrorDetectionSettings,
        @Nullable Output<Either<String,EnabledState>> sessionAffinityState,
        @Nullable Output<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        this.healthProbeSettings = healthProbeSettings;
        this.loadBalancingSettings = loadBalancingSettings;
        this.originGroupName = originGroupName;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.responseBasedAfdOriginErrorDetectionSettings = responseBasedAfdOriginErrorDetectionSettings;
        this.sessionAffinityState = sessionAffinityState;
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    private AFDOriginGroupArgs() {
        this.healthProbeSettings = Output.empty();
        this.loadBalancingSettings = Output.empty();
        this.originGroupName = Output.empty();
        this.profileName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.responseBasedAfdOriginErrorDetectionSettings = Output.empty();
        this.sessionAffinityState = Output.empty();
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AFDOriginGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HealthProbeParametersArgs> healthProbeSettings;
        private @Nullable Output<LoadBalancingSettingsParametersArgs> loadBalancingSettings;
        private @Nullable Output<String> originGroupName;
        private Output<String> profileName;
        private Output<String> resourceGroupName;
        private @Nullable Output<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedAfdOriginErrorDetectionSettings;
        private @Nullable Output<Either<String,EnabledState>> sessionAffinityState;
        private @Nullable Output<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(AFDOriginGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthProbeSettings = defaults.healthProbeSettings;
    	      this.loadBalancingSettings = defaults.loadBalancingSettings;
    	      this.originGroupName = defaults.originGroupName;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.responseBasedAfdOriginErrorDetectionSettings = defaults.responseBasedAfdOriginErrorDetectionSettings;
    	      this.sessionAffinityState = defaults.sessionAffinityState;
    	      this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = defaults.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
        }

        public Builder healthProbeSettings(@Nullable Output<HealthProbeParametersArgs> healthProbeSettings) {
            this.healthProbeSettings = healthProbeSettings;
            return this;
        }
        public Builder healthProbeSettings(@Nullable HealthProbeParametersArgs healthProbeSettings) {
            this.healthProbeSettings = Output.ofNullable(healthProbeSettings);
            return this;
        }
        public Builder loadBalancingSettings(@Nullable Output<LoadBalancingSettingsParametersArgs> loadBalancingSettings) {
            this.loadBalancingSettings = loadBalancingSettings;
            return this;
        }
        public Builder loadBalancingSettings(@Nullable LoadBalancingSettingsParametersArgs loadBalancingSettings) {
            this.loadBalancingSettings = Output.ofNullable(loadBalancingSettings);
            return this;
        }
        public Builder originGroupName(@Nullable Output<String> originGroupName) {
            this.originGroupName = originGroupName;
            return this;
        }
        public Builder originGroupName(@Nullable String originGroupName) {
            this.originGroupName = Output.ofNullable(originGroupName);
            return this;
        }
        public Builder profileName(Output<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        public Builder profileName(String profileName) {
            this.profileName = Output.of(Objects.requireNonNull(profileName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder responseBasedAfdOriginErrorDetectionSettings(@Nullable Output<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedAfdOriginErrorDetectionSettings) {
            this.responseBasedAfdOriginErrorDetectionSettings = responseBasedAfdOriginErrorDetectionSettings;
            return this;
        }
        public Builder responseBasedAfdOriginErrorDetectionSettings(@Nullable ResponseBasedOriginErrorDetectionParametersArgs responseBasedAfdOriginErrorDetectionSettings) {
            this.responseBasedAfdOriginErrorDetectionSettings = Output.ofNullable(responseBasedAfdOriginErrorDetectionSettings);
            return this;
        }
        public Builder sessionAffinityState(@Nullable Output<Either<String,EnabledState>> sessionAffinityState) {
            this.sessionAffinityState = sessionAffinityState;
            return this;
        }
        public Builder sessionAffinityState(@Nullable Either<String,EnabledState> sessionAffinityState) {
            this.sessionAffinityState = Output.ofNullable(sessionAffinityState);
            return this;
        }
        public Builder trafficRestorationTimeToHealedOrNewEndpointsInMinutes(@Nullable Output<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
            this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
            return this;
        }
        public Builder trafficRestorationTimeToHealedOrNewEndpointsInMinutes(@Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
            this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = Output.ofNullable(trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
            return this;
        }        public AFDOriginGroupArgs build() {
            return new AFDOriginGroupArgs(healthProbeSettings, loadBalancingSettings, originGroupName, profileName, resourceGroupName, responseBasedAfdOriginErrorDetectionSettings, sessionAffinityState, trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        }
    }
}
