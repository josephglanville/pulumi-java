// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.discovery.k8s.io_v1beta1.outputs.ForZone;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointHints {
    private final @Nullable List<ForZone> forZones;

    @OutputCustomType.Constructor({"forZones"})
    private EndpointHints(@Nullable List<ForZone> forZones) {
        this.forZones = forZones;
    }

    public List<ForZone> getForZones() {
        return this.forZones == null ? List.of() : this.forZones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointHints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ForZone> forZones;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointHints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forZones = defaults.forZones;
        }

        public Builder setForZones(@Nullable List<ForZone> forZones) {
            this.forZones = forZones;
            return this;
        }

        public EndpointHints build() {
            return new EndpointHints(forZones);
        }
    }
}
