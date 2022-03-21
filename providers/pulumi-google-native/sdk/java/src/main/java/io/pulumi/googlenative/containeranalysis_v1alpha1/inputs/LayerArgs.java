// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.enums.LayerDirective;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Layer holds metadata specific to a layer of a Docker image.
 * 
 */
public final class LayerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LayerArgs Empty = new LayerArgs();

    /**
     * The recovered arguments to the Dockerfile directive.
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<String> arguments;

    public Output<String> getArguments() {
        return this.arguments == null ? Output.empty() : this.arguments;
    }

    /**
     * The recovered Dockerfile directive used to construct this layer.
     * 
     */
    @Import(name="directive")
      private final @Nullable Output<LayerDirective> directive;

    public Output<LayerDirective> getDirective() {
        return this.directive == null ? Output.empty() : this.directive;
    }

    public LayerArgs(
        @Nullable Output<String> arguments,
        @Nullable Output<LayerDirective> directive) {
        this.arguments = arguments;
        this.directive = directive;
    }

    private LayerArgs() {
        this.arguments = Output.empty();
        this.directive = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arguments;
        private @Nullable Output<LayerDirective> directive;

        public Builder() {
    	      // Empty
        }

        public Builder(LayerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.directive = defaults.directive;
        }

        public Builder arguments(@Nullable Output<String> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(@Nullable String arguments) {
            this.arguments = Output.ofNullable(arguments);
            return this;
        }
        public Builder directive(@Nullable Output<LayerDirective> directive) {
            this.directive = directive;
            return this;
        }
        public Builder directive(@Nullable LayerDirective directive) {
            this.directive = Output.ofNullable(directive);
            return this;
        }        public LayerArgs build() {
            return new LayerArgs(arguments, directive);
        }
    }
}
