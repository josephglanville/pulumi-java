// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.GlobalParameterType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


public final class GlobalParameterSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalParameterSpecificationArgs Empty = new GlobalParameterSpecificationArgs();

    @InputImport(name="type", required=true)
    private final Input<Either<String,GlobalParameterType>> type;

    public Input<Either<String,GlobalParameterType>> getType() {
        return this.type;
    }

    @InputImport(name="value", required=true)
    private final Input<Object> value;

    public Input<Object> getValue() {
        return this.value;
    }

    public GlobalParameterSpecificationArgs(
        Input<Either<String,GlobalParameterType>> type,
        Input<Object> value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GlobalParameterSpecificationArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalParameterSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,GlobalParameterType>> type;
        private Input<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalParameterSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(Input<Either<String,GlobalParameterType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,GlobalParameterType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setValue(Input<Object> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(Object value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public GlobalParameterSpecificationArgs build() {
            return new GlobalParameterSpecificationArgs(type, value);
        }
    }
}
