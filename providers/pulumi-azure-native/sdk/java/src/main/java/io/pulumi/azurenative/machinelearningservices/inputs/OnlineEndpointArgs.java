// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.EndpointAuthMode;
import io.pulumi.azurenative.machinelearningservices.inputs.EndpointAuthKeysArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Online endpoint configuration
 * 
 */
public final class OnlineEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final OnlineEndpointArgs Empty = new OnlineEndpointArgs();

    /**
     * Inference endpoint authentication mode type
     * 
     */
    @Import(name="authMode", required=true)
      private final Output<Either<String,EndpointAuthMode>> authMode;

    public Output<Either<String,EndpointAuthMode>> getAuthMode() {
        return this.authMode;
    }

    /**
     * Description of the inference endpoint.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * EndpointAuthKeys to set initially on an Endpoint.
     * This property will always be returned as null. AuthKey values must be retrieved using the ListKeys API.
     * 
     */
    @Import(name="keys")
      private final @Nullable Output<EndpointAuthKeysArgs> keys;

    public Output<EndpointAuthKeysArgs> getKeys() {
        return this.keys == null ? Output.empty() : this.keys;
    }

    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * ARM resource ID of the compute if it exists.
     * optional
     * 
     */
    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> getTarget() {
        return this.target == null ? Output.empty() : this.target;
    }

    /**
     * Traffic rules on how the traffic will be routed across deployments.
     * 
     */
    @Import(name="traffic")
      private final @Nullable Output<Map<String,Integer>> traffic;

    public Output<Map<String,Integer>> getTraffic() {
        return this.traffic == null ? Output.empty() : this.traffic;
    }

    public OnlineEndpointArgs(
        Output<Either<String,EndpointAuthMode>> authMode,
        @Nullable Output<String> description,
        @Nullable Output<EndpointAuthKeysArgs> keys,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<String> target,
        @Nullable Output<Map<String,Integer>> traffic) {
        this.authMode = Objects.requireNonNull(authMode, "expected parameter 'authMode' to be non-null");
        this.description = description;
        this.keys = keys;
        this.properties = properties;
        this.target = target;
        this.traffic = traffic;
    }

    private OnlineEndpointArgs() {
        this.authMode = Output.empty();
        this.description = Output.empty();
        this.keys = Output.empty();
        this.properties = Output.empty();
        this.target = Output.empty();
        this.traffic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnlineEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,EndpointAuthMode>> authMode;
        private @Nullable Output<String> description;
        private @Nullable Output<EndpointAuthKeysArgs> keys;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<String> target;
        private @Nullable Output<Map<String,Integer>> traffic;

        public Builder() {
    	      // Empty
        }

        public Builder(OnlineEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authMode = defaults.authMode;
    	      this.description = defaults.description;
    	      this.keys = defaults.keys;
    	      this.properties = defaults.properties;
    	      this.target = defaults.target;
    	      this.traffic = defaults.traffic;
        }

        public Builder authMode(Output<Either<String,EndpointAuthMode>> authMode) {
            this.authMode = Objects.requireNonNull(authMode);
            return this;
        }
        public Builder authMode(Either<String,EndpointAuthMode> authMode) {
            this.authMode = Output.of(Objects.requireNonNull(authMode));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder keys(@Nullable Output<EndpointAuthKeysArgs> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(@Nullable EndpointAuthKeysArgs keys) {
            this.keys = Output.ofNullable(keys);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Output.ofNullable(target);
            return this;
        }
        public Builder traffic(@Nullable Output<Map<String,Integer>> traffic) {
            this.traffic = traffic;
            return this;
        }
        public Builder traffic(@Nullable Map<String,Integer> traffic) {
            this.traffic = Output.ofNullable(traffic);
            return this;
        }        public OnlineEndpointArgs build() {
            return new OnlineEndpointArgs(authMode, description, keys, properties, target, traffic);
        }
    }
}
