// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvValueFromArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvArgs Empty = new ServiceTemplateSpecContainerEnvArgs();

    /**
     * Volume's name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Variable references $(VAR_NAME) are expanded
     * using the previous defined environment variables in the container and
     * any route environment variables. If a variable cannot be resolved,
     * the reference in the input string will be unchanged. The $(VAR_NAME)
     * syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
     * references will never be expanded, regardless of whether the variable
     * exists or not.
     * Defaults to "".
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    /**
     * Source for the environment variable's value. Only supports secret_key_ref.
     * Structure is documented below.
     * 
     */
    @InputImport(name="valueFrom")
      private final @Nullable Input<ServiceTemplateSpecContainerEnvValueFromArgs> valueFrom;

    public Input<ServiceTemplateSpecContainerEnvValueFromArgs> getValueFrom() {
        return this.valueFrom == null ? Input.empty() : this.valueFrom;
    }

    public ServiceTemplateSpecContainerEnvArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> value,
        @Nullable Input<ServiceTemplateSpecContainerEnvValueFromArgs> valueFrom) {
        this.name = name;
        this.value = value;
        this.valueFrom = valueFrom;
    }

    private ServiceTemplateSpecContainerEnvArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
        this.valueFrom = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> value;
        private @Nullable Input<ServiceTemplateSpecContainerEnvValueFromArgs> valueFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueFrom = defaults.valueFrom;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public Builder setValueFrom(@Nullable Input<ServiceTemplateSpecContainerEnvValueFromArgs> valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }

        public Builder setValueFrom(@Nullable ServiceTemplateSpecContainerEnvValueFromArgs valueFrom) {
            this.valueFrom = Input.ofNullable(valueFrom);
            return this;
        }
        public ServiceTemplateSpecContainerEnvArgs build() {
            return new ServiceTemplateSpecContainerEnvArgs(name, value, valueFrom);
        }
    }
}
