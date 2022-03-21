// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs Empty = new ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs();

    /**
     * The Secret to select from.
     * Structure is documented below.
     * 
     */
    @Import(name="localObjectReference")
      private final @Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> localObjectReference;

    public Output<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> getLocalObjectReference() {
        return this.localObjectReference == null ? Output.empty() : this.localObjectReference;
    }

    /**
     * Specify whether the Secret must be defined
     * 
     */
    @Import(name="optional")
      private final @Nullable Output<Boolean> optional;

    public Output<Boolean> getOptional() {
        return this.optional == null ? Output.empty() : this.optional;
    }

    public ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs(
        @Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> localObjectReference,
        @Nullable Output<Boolean> optional) {
        this.localObjectReference = localObjectReference;
        this.optional = optional;
    }

    private ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs() {
        this.localObjectReference = Output.empty();
        this.optional = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> localObjectReference;
        private @Nullable Output<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.optional = defaults.optional;
        }

        public Builder localObjectReference(@Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> localObjectReference) {
            this.localObjectReference = localObjectReference;
            return this;
        }
        public Builder localObjectReference(@Nullable ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs localObjectReference) {
            this.localObjectReference = Output.ofNullable(localObjectReference);
            return this;
        }
        public Builder optional(@Nullable Output<Boolean> optional) {
            this.optional = optional;
            return this;
        }
        public Builder optional(@Nullable Boolean optional) {
            this.optional = Output.ofNullable(optional);
            return this;
        }        public ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs build() {
            return new ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs(localObjectReference, optional);
        }
    }
}
