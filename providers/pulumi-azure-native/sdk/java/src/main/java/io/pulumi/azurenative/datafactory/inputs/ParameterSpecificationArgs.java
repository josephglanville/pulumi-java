// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.ParameterType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterSpecificationArgs Empty = new ParameterSpecificationArgs();

    @InputImport(name="defaultValue")
    private final @Nullable Input<Object> defaultValue;

    public Input<Object> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    @InputImport(name="type", required=true)
    private final Input<Either<String,ParameterType>> type;

    public Input<Either<String,ParameterType>> getType() {
        return this.type;
    }

    public ParameterSpecificationArgs(
        @Nullable Input<Object> defaultValue,
        Input<Either<String,ParameterType>> type) {
        this.defaultValue = defaultValue;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ParameterSpecificationArgs() {
        this.defaultValue = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> defaultValue;
        private Input<Either<String,ParameterType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.type = defaults.type;
        }

        public Builder setDefaultValue(@Nullable Input<Object> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable Object defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder setType(Input<Either<String,ParameterType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,ParameterType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ParameterSpecificationArgs build() {
            return new ParameterSpecificationArgs(defaultValue, type);
        }
    }
}
