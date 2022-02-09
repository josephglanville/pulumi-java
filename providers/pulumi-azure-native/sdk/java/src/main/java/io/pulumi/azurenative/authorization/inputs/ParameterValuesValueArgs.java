// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterValuesValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterValuesValueArgs Empty = new ParameterValuesValueArgs();

    @InputImport(name="value")
    private final @Nullable Input<Object> value;

    public Input<Object> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ParameterValuesValueArgs(@Nullable Input<Object> value) {
        this.value = value;
    }

    private ParameterValuesValueArgs() {
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterValuesValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterValuesValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable Input<Object> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public ParameterValuesValueArgs build() {
            return new ParameterValuesValueArgs(value);
        }
    }
}
