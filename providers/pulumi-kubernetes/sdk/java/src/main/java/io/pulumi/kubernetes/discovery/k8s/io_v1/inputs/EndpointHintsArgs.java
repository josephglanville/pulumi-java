// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.discovery.k8s.io_v1.inputs.ForZoneArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EndpointHints provides hints describing how an endpoint should be consumed.
 * 
 */
public final class EndpointHintsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointHintsArgs Empty = new EndpointHintsArgs();

    /**
     * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
     * 
     */
    @InputImport(name="forZones")
      private final @Nullable Input<List<ForZoneArgs>> forZones;

    public Input<List<ForZoneArgs>> getForZones() {
        return this.forZones == null ? Input.empty() : this.forZones;
    }

    public EndpointHintsArgs(@Nullable Input<List<ForZoneArgs>> forZones) {
        this.forZones = forZones;
    }

    private EndpointHintsArgs() {
        this.forZones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointHintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ForZoneArgs>> forZones;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointHintsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forZones = defaults.forZones;
        }

        public Builder setForZones(@Nullable Input<List<ForZoneArgs>> forZones) {
            this.forZones = forZones;
            return this;
        }

        public Builder setForZones(@Nullable List<ForZoneArgs> forZones) {
            this.forZones = Input.ofNullable(forZones);
            return this;
        }
        public EndpointHintsArgs build() {
            return new EndpointHintsArgs(forZones);
        }
    }
}
