// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.docker.outputs.ServiceTaskSpecPlacementPlatform;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecPlacement {
    private final @Nullable List<String> constraints;
    private final @Nullable Integer maxReplicas;
    private final @Nullable List<ServiceTaskSpecPlacementPlatform> platforms;
    private final @Nullable List<String> prefs;

    @CustomType.Constructor
    private ServiceTaskSpecPlacement(
        @CustomType.Parameter("constraints") @Nullable List<String> constraints,
        @CustomType.Parameter("maxReplicas") @Nullable Integer maxReplicas,
        @CustomType.Parameter("platforms") @Nullable List<ServiceTaskSpecPlacementPlatform> platforms,
        @CustomType.Parameter("prefs") @Nullable List<String> prefs) {
        this.constraints = constraints;
        this.maxReplicas = maxReplicas;
        this.platforms = platforms;
        this.prefs = prefs;
    }

    public List<String> getConstraints() {
        return this.constraints == null ? List.of() : this.constraints;
    }
    public Optional<Integer> getMaxReplicas() {
        return Optional.ofNullable(this.maxReplicas);
    }
    public List<ServiceTaskSpecPlacementPlatform> getPlatforms() {
        return this.platforms == null ? List.of() : this.platforms;
    }
    public List<String> getPrefs() {
        return this.prefs == null ? List.of() : this.prefs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecPlacement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> constraints;
        private @Nullable Integer maxReplicas;
        private @Nullable List<ServiceTaskSpecPlacementPlatform> platforms;
        private @Nullable List<String> prefs;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecPlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraints = defaults.constraints;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.platforms = defaults.platforms;
    	      this.prefs = defaults.prefs;
        }

        public Builder constraints(@Nullable List<String> constraints) {
            this.constraints = constraints;
            return this;
        }
        public Builder constraints(String... constraints) {
            return constraints(List.of(constraints));
        }
        public Builder maxReplicas(@Nullable Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Builder platforms(@Nullable List<ServiceTaskSpecPlacementPlatform> platforms) {
            this.platforms = platforms;
            return this;
        }
        public Builder platforms(ServiceTaskSpecPlacementPlatform... platforms) {
            return platforms(List.of(platforms));
        }
        public Builder prefs(@Nullable List<String> prefs) {
            this.prefs = prefs;
            return this;
        }
        public Builder prefs(String... prefs) {
            return prefs(List.of(prefs));
        }        public ServiceTaskSpecPlacement build() {
            return new ServiceTaskSpecPlacement(constraints, maxReplicas, platforms, prefs);
        }
    }
}