// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterDefinitionResponse {
    private final @Nullable String blueprint;
    private final @Nullable Map<String,String> componentVersion;
    private final @Nullable Object configurations;
    private final @Nullable String kind;

    @OutputCustomType.Constructor({"blueprint","componentVersion","configurations","kind"})
    private ClusterDefinitionResponse(
        @Nullable String blueprint,
        @Nullable Map<String,String> componentVersion,
        @Nullable Object configurations,
        @Nullable String kind) {
        this.blueprint = blueprint;
        this.componentVersion = componentVersion;
        this.configurations = configurations;
        this.kind = kind;
    }

    public Optional<String> getBlueprint() {
        return Optional.ofNullable(this.blueprint);
    }
    public Map<String,String> getComponentVersion() {
        return this.componentVersion == null ? Map.of() : this.componentVersion;
    }
    public Optional<Object> getConfigurations() {
        return Optional.ofNullable(this.configurations);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blueprint;
        private @Nullable Map<String,String> componentVersion;
        private @Nullable Object configurations;
        private @Nullable String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprint = defaults.blueprint;
    	      this.componentVersion = defaults.componentVersion;
    	      this.configurations = defaults.configurations;
    	      this.kind = defaults.kind;
        }

        public Builder setBlueprint(@Nullable String blueprint) {
            this.blueprint = blueprint;
            return this;
        }

        public Builder setComponentVersion(@Nullable Map<String,String> componentVersion) {
            this.componentVersion = componentVersion;
            return this;
        }

        public Builder setConfigurations(@Nullable Object configurations) {
            this.configurations = configurations;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public ClusterDefinitionResponse build() {
            return new ClusterDefinitionResponse(blueprint, componentVersion, configurations, kind);
        }
    }
}
