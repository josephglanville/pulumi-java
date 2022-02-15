// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.SloBasicSliAvailability;
import io.pulumi.gcp.monitoring.outputs.SloBasicSliLatency;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SloBasicSli {
    private final @Nullable SloBasicSliAvailability availability;
    private final @Nullable SloBasicSliLatency latency;
    private final @Nullable List<String> locations;
    private final @Nullable List<String> methods;
    private final @Nullable List<String> versions;

    @OutputCustomType.Constructor({"availability","latency","locations","methods","versions"})
    private SloBasicSli(
        @Nullable SloBasicSliAvailability availability,
        @Nullable SloBasicSliLatency latency,
        @Nullable List<String> locations,
        @Nullable List<String> methods,
        @Nullable List<String> versions) {
        this.availability = availability;
        this.latency = latency;
        this.locations = locations;
        this.methods = methods;
        this.versions = versions;
    }

    public Optional<SloBasicSliAvailability> getAvailability() {
        return Optional.ofNullable(this.availability);
    }
    public Optional<SloBasicSliLatency> getLatency() {
        return Optional.ofNullable(this.latency);
    }
    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }
    public List<String> getMethods() {
        return this.methods == null ? List.of() : this.methods;
    }
    public List<String> getVersions() {
        return this.versions == null ? List.of() : this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloBasicSli defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SloBasicSliAvailability availability;
        private @Nullable SloBasicSliLatency latency;
        private @Nullable List<String> locations;
        private @Nullable List<String> methods;
        private @Nullable List<String> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(SloBasicSli defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.latency = defaults.latency;
    	      this.locations = defaults.locations;
    	      this.methods = defaults.methods;
    	      this.versions = defaults.versions;
        }

        public Builder setAvailability(@Nullable SloBasicSliAvailability availability) {
            this.availability = availability;
            return this;
        }

        public Builder setLatency(@Nullable SloBasicSliLatency latency) {
            this.latency = latency;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setMethods(@Nullable List<String> methods) {
            this.methods = methods;
            return this;
        }

        public Builder setVersions(@Nullable List<String> versions) {
            this.versions = versions;
            return this;
        }

        public SloBasicSli build() {
            return new SloBasicSli(availability, latency, locations, methods, versions);
        }
    }
}