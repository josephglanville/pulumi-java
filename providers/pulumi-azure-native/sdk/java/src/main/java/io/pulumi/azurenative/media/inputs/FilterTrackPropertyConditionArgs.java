// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.FilterTrackPropertyCompareOperation;
import io.pulumi.azurenative.media.enums.FilterTrackPropertyType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FilterTrackPropertyConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterTrackPropertyConditionArgs Empty = new FilterTrackPropertyConditionArgs();

    @InputImport(name="operation", required=true)
    private final Input<Either<String,FilterTrackPropertyCompareOperation>> operation;

    public Input<Either<String,FilterTrackPropertyCompareOperation>> getOperation() {
        return this.operation;
    }

    @InputImport(name="property", required=true)
    private final Input<Either<String,FilterTrackPropertyType>> property;

    public Input<Either<String,FilterTrackPropertyType>> getProperty() {
        return this.property;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public FilterTrackPropertyConditionArgs(
        Input<Either<String,FilterTrackPropertyCompareOperation>> operation,
        Input<Either<String,FilterTrackPropertyType>> property,
        Input<String> value) {
        this.operation = Objects.requireNonNull(operation, "expected parameter 'operation' to be non-null");
        this.property = Objects.requireNonNull(property, "expected parameter 'property' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private FilterTrackPropertyConditionArgs() {
        this.operation = Input.empty();
        this.property = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterTrackPropertyConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,FilterTrackPropertyCompareOperation>> operation;
        private Input<Either<String,FilterTrackPropertyType>> property;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterTrackPropertyConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operation = defaults.operation;
    	      this.property = defaults.property;
    	      this.value = defaults.value;
        }

        public Builder setOperation(Input<Either<String,FilterTrackPropertyCompareOperation>> operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setOperation(Either<String,FilterTrackPropertyCompareOperation> operation) {
            this.operation = Input.of(Objects.requireNonNull(operation));
            return this;
        }

        public Builder setProperty(Input<Either<String,FilterTrackPropertyType>> property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }

        public Builder setProperty(Either<String,FilterTrackPropertyType> property) {
            this.property = Input.of(Objects.requireNonNull(property));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public FilterTrackPropertyConditionArgs build() {
            return new FilterTrackPropertyConditionArgs(operation, property, value);
        }
    }
}
