// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceNetworkSettingsNetworkSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceNetworkSettingsNetworkSettingsArgs Empty = new ServiceNetworkSettingsNetworkSettingsArgs();

    /**
     * The ingress settings for version or service.
     * Default value is `INGRESS_TRAFFIC_ALLOWED_UNSPECIFIED`.
     * Possible values are `INGRESS_TRAFFIC_ALLOWED_UNSPECIFIED`, `INGRESS_TRAFFIC_ALLOWED_ALL`, `INGRESS_TRAFFIC_ALLOWED_INTERNAL_ONLY`, and `INGRESS_TRAFFIC_ALLOWED_INTERNAL_AND_LB`.
     * 
     */
    @Import(name="ingressTrafficAllowed")
      private final @Nullable Output<String> ingressTrafficAllowed;

    public Output<String> getIngressTrafficAllowed() {
        return this.ingressTrafficAllowed == null ? Output.empty() : this.ingressTrafficAllowed;
    }

    public ServiceNetworkSettingsNetworkSettingsArgs(@Nullable Output<String> ingressTrafficAllowed) {
        this.ingressTrafficAllowed = ingressTrafficAllowed;
    }

    private ServiceNetworkSettingsNetworkSettingsArgs() {
        this.ingressTrafficAllowed = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNetworkSettingsNetworkSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ingressTrafficAllowed;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceNetworkSettingsNetworkSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressTrafficAllowed = defaults.ingressTrafficAllowed;
        }

        public Builder ingressTrafficAllowed(@Nullable Output<String> ingressTrafficAllowed) {
            this.ingressTrafficAllowed = ingressTrafficAllowed;
            return this;
        }
        public Builder ingressTrafficAllowed(@Nullable String ingressTrafficAllowed) {
            this.ingressTrafficAllowed = Output.ofNullable(ingressTrafficAllowed);
            return this;
        }        public ServiceNetworkSettingsNetworkSettingsArgs build() {
            return new ServiceNetworkSettingsNetworkSettingsArgs(ingressTrafficAllowed);
        }
    }
}
