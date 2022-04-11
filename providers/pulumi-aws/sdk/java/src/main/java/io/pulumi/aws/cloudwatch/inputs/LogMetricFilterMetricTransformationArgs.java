// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogMetricFilterMetricTransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogMetricFilterMetricTransformationArgs Empty = new LogMetricFilterMetricTransformationArgs();

    /**
     * The value to emit when a filter pattern does not match a log event. Conflicts with `dimensions`.
     * 
     */
    @Import(name="defaultValue")
      private final @Nullable Output<String> defaultValue;

    public Output<String> getDefaultValue() {
        return this.defaultValue == null ? Codegen.empty() : this.defaultValue;
    }

    /**
     * Map of fields to use as dimensions for the metric. Up to 3 dimensions are allowed. Conflicts with `default_value`.
     * 
     */
    @Import(name="dimensions")
      private final @Nullable Output<Map<String,String>> dimensions;

    public Output<Map<String,String>> getDimensions() {
        return this.dimensions == null ? Codegen.empty() : this.dimensions;
    }

    /**
     * The name of the CloudWatch metric to which the monitored log information should be published (e.g., `ErrorCount`)
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The destination namespace of the CloudWatch metric.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace;
    }

    /**
     * The unit to assign to the metric. If you omit this, the unit is set as `None`.
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> getUnit() {
        return this.unit == null ? Codegen.empty() : this.unit;
    }

    /**
     * What to publish to the metric. For example, if you're counting the occurrences of a particular term like "Error", the value will be "1" for each occurrence. If you're counting the bytes transferred the published value will be the value in the log event.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public LogMetricFilterMetricTransformationArgs(
        @Nullable Output<String> defaultValue,
        @Nullable Output<Map<String,String>> dimensions,
        Output<String> name,
        Output<String> namespace,
        @Nullable Output<String> unit,
        Output<String> value) {
        this.defaultValue = defaultValue;
        this.dimensions = dimensions;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.unit = unit;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private LogMetricFilterMetricTransformationArgs() {
        this.defaultValue = Codegen.empty();
        this.dimensions = Codegen.empty();
        this.name = Codegen.empty();
        this.namespace = Codegen.empty();
        this.unit = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMetricFilterMetricTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> defaultValue;
        private @Nullable Output<Map<String,String>> dimensions;
        private Output<String> name;
        private Output<String> namespace;
        private @Nullable Output<String> unit;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(LogMetricFilterMetricTransformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.dimensions = defaults.dimensions;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = Codegen.ofNullable(defaultValue);
            return this;
        }
        public Builder dimensions(@Nullable Output<Map<String,String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = Codegen.ofNullable(dimensions);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder namespace(Output<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }
        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = Codegen.ofNullable(unit);
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public LogMetricFilterMetricTransformationArgs build() {
            return new LogMetricFilterMetricTransformationArgs(defaultValue, dimensions, name, namespace, unit, value);
        }
    }
}
