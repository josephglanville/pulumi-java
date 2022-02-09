// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FilterTrackPropertyConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final FilterTrackPropertyConditionResponse Empty = new FilterTrackPropertyConditionResponse();

    @InputImport(name="operation", required=true)
    private final String operation;

    public String getOperation() {
        return this.operation;
    }

    @InputImport(name="property", required=true)
    private final String property;

    public String getProperty() {
        return this.property;
    }

    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public FilterTrackPropertyConditionResponse(
        String operation,
        String property,
        String value) {
        this.operation = Objects.requireNonNull(operation, "expected parameter 'operation' to be non-null");
        this.property = Objects.requireNonNull(property, "expected parameter 'property' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private FilterTrackPropertyConditionResponse() {
        this.operation = null;
        this.property = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterTrackPropertyConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operation;
        private String property;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterTrackPropertyConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operation = defaults.operation;
    	      this.property = defaults.property;
    	      this.value = defaults.value;
        }

        public Builder setOperation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setProperty(String property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public FilterTrackPropertyConditionResponse build() {
            return new FilterTrackPropertyConditionResponse(operation, property, value);
        }
    }
}
