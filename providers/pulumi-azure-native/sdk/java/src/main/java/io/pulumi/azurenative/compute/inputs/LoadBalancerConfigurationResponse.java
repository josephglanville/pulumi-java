// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.LoadBalancerConfigurationPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerConfigurationResponse Empty = new LoadBalancerConfigurationResponse();

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="properties", required=true)
    private final LoadBalancerConfigurationPropertiesResponse properties;

    public LoadBalancerConfigurationPropertiesResponse getProperties() {
        return this.properties;
    }

    public LoadBalancerConfigurationResponse(
        @Nullable String id,
        String name,
        LoadBalancerConfigurationPropertiesResponse properties) {
        this.id = id;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private LoadBalancerConfigurationResponse() {
        this.id = null;
        this.name = null;
        this.properties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String name;
        private LoadBalancerConfigurationPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(LoadBalancerConfigurationPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public LoadBalancerConfigurationResponse build() {
            return new LoadBalancerConfigurationResponse(id, name, properties);
        }
    }
}
