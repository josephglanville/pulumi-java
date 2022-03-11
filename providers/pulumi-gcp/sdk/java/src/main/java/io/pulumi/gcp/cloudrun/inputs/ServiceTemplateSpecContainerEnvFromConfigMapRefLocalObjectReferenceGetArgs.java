// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs Empty = new ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs();

    /**
     * Volume's name.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs(Output<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs build() {
            return new ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs(name);
        }
    }
}
