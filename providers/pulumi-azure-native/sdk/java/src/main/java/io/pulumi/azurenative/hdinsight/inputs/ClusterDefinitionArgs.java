// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The cluster definition.
 * 
 */
public final class ClusterDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterDefinitionArgs Empty = new ClusterDefinitionArgs();

    /**
     * The link to the blueprint.
     * 
     */
    @InputImport(name="blueprint")
      private final @Nullable Input<String> blueprint;

    public Input<String> getBlueprint() {
        return this.blueprint == null ? Input.empty() : this.blueprint;
    }

    /**
     * The versions of different services in the cluster.
     * 
     */
    @InputImport(name="componentVersion")
      private final @Nullable Input<Map<String,String>> componentVersion;

    public Input<Map<String,String>> getComponentVersion() {
        return this.componentVersion == null ? Input.empty() : this.componentVersion;
    }

    /**
     * The cluster configurations.
     * 
     */
    @InputImport(name="configurations")
      private final @Nullable Input<Object> configurations;

    public Input<Object> getConfigurations() {
        return this.configurations == null ? Input.empty() : this.configurations;
    }

    /**
     * The type of cluster.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    public ClusterDefinitionArgs(
        @Nullable Input<String> blueprint,
        @Nullable Input<Map<String,String>> componentVersion,
        @Nullable Input<Object> configurations,
        @Nullable Input<String> kind) {
        this.blueprint = blueprint;
        this.componentVersion = componentVersion;
        this.configurations = configurations;
        this.kind = kind;
    }

    private ClusterDefinitionArgs() {
        this.blueprint = Input.empty();
        this.componentVersion = Input.empty();
        this.configurations = Input.empty();
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> blueprint;
        private @Nullable Input<Map<String,String>> componentVersion;
        private @Nullable Input<Object> configurations;
        private @Nullable Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprint = defaults.blueprint;
    	      this.componentVersion = defaults.componentVersion;
    	      this.configurations = defaults.configurations;
    	      this.kind = defaults.kind;
        }

        public Builder setBlueprint(@Nullable Input<String> blueprint) {
            this.blueprint = blueprint;
            return this;
        }

        public Builder setBlueprint(@Nullable String blueprint) {
            this.blueprint = Input.ofNullable(blueprint);
            return this;
        }

        public Builder setComponentVersion(@Nullable Input<Map<String,String>> componentVersion) {
            this.componentVersion = componentVersion;
            return this;
        }

        public Builder setComponentVersion(@Nullable Map<String,String> componentVersion) {
            this.componentVersion = Input.ofNullable(componentVersion);
            return this;
        }

        public Builder setConfigurations(@Nullable Input<Object> configurations) {
            this.configurations = configurations;
            return this;
        }

        public Builder setConfigurations(@Nullable Object configurations) {
            this.configurations = Input.ofNullable(configurations);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }
        public ClusterDefinitionArgs build() {
            return new ClusterDefinitionArgs(blueprint, componentVersion, configurations, kind);
        }
    }
}
