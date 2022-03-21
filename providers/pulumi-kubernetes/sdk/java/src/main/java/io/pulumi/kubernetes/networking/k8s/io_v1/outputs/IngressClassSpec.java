// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.IngressClassParametersReference;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressClassSpec {
    /**
     * Controller refers to the name of the controller that should handle this class. This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
     * 
     */
    private final @Nullable String controller;
    /**
     * Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
     * 
     */
    private final @Nullable IngressClassParametersReference parameters;

    @CustomType.Constructor
    private IngressClassSpec(
        @CustomType.Parameter("controller") @Nullable String controller,
        @CustomType.Parameter("parameters") @Nullable IngressClassParametersReference parameters) {
        this.controller = controller;
        this.parameters = parameters;
    }

    /**
     * Controller refers to the name of the controller that should handle this class. This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
     * 
    */
    public Optional<String> getController() {
        return Optional.ofNullable(this.controller);
    }
    /**
     * Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
     * 
    */
    public Optional<IngressClassParametersReference> getParameters() {
        return Optional.ofNullable(this.parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressClassSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String controller;
        private @Nullable IngressClassParametersReference parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressClassSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controller = defaults.controller;
    	      this.parameters = defaults.parameters;
        }

        public Builder controller(@Nullable String controller) {
            this.controller = controller;
            return this;
        }
        public Builder parameters(@Nullable IngressClassParametersReference parameters) {
            this.parameters = parameters;
            return this;
        }        public IngressClassSpec build() {
            return new IngressClassSpec(controller, parameters);
        }
    }
}
