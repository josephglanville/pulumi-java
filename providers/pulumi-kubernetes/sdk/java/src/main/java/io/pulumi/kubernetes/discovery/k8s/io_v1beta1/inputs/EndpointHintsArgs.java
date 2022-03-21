// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.discovery.k8s.io_v1beta1.inputs.ForZoneArgs;
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
     * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing. May contain a maximum of 8 entries.
     * 
     */
    @Import(name="forZones")
      private final @Nullable Output<List<ForZoneArgs>> forZones;

    public Output<List<ForZoneArgs>> getForZones() {
        return this.forZones == null ? Output.empty() : this.forZones;
    }

    public EndpointHintsArgs(@Nullable Output<List<ForZoneArgs>> forZones) {
        this.forZones = forZones;
    }

    private EndpointHintsArgs() {
        this.forZones = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointHintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ForZoneArgs>> forZones;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointHintsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forZones = defaults.forZones;
        }

        public Builder forZones(@Nullable Output<List<ForZoneArgs>> forZones) {
            this.forZones = forZones;
            return this;
        }
        public Builder forZones(@Nullable List<ForZoneArgs> forZones) {
            this.forZones = Output.ofNullable(forZones);
            return this;
        }
        public Builder forZones(ForZoneArgs... forZones) {
            return forZones(List.of(forZones));
        }        public EndpointHintsArgs build() {
            return new EndpointHintsArgs(forZones);
        }
    }
}
