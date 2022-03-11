// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.awsnative.timestream.enums.ScheduledQueryMixedMeasureMappingMeasureValueType;
import io.pulumi.awsnative.timestream.inputs.ScheduledQueryMultiMeasureAttributeMappingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MixedMeasureMappings are mappings that can be used to ingest data into a mixture of narrow and multi measures in the derived table.
 * 
 */
public final class ScheduledQueryMixedMeasureMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryMixedMeasureMappingArgs Empty = new ScheduledQueryMixedMeasureMappingArgs();

    @InputImport(name="measureName")
      private final @Nullable Output<String> measureName;

    public Output<String> getMeasureName() {
        return this.measureName == null ? Output.empty() : this.measureName;
    }

    @InputImport(name="measureValueType", required=true)
      private final Output<ScheduledQueryMixedMeasureMappingMeasureValueType> measureValueType;

    public Output<ScheduledQueryMixedMeasureMappingMeasureValueType> getMeasureValueType() {
        return this.measureValueType;
    }

    @InputImport(name="multiMeasureAttributeMappings")
      private final @Nullable Output<List<ScheduledQueryMultiMeasureAttributeMappingArgs>> multiMeasureAttributeMappings;

    public Output<List<ScheduledQueryMultiMeasureAttributeMappingArgs>> getMultiMeasureAttributeMappings() {
        return this.multiMeasureAttributeMappings == null ? Output.empty() : this.multiMeasureAttributeMappings;
    }

    @InputImport(name="sourceColumn")
      private final @Nullable Output<String> sourceColumn;

    public Output<String> getSourceColumn() {
        return this.sourceColumn == null ? Output.empty() : this.sourceColumn;
    }

    @InputImport(name="targetMeasureName")
      private final @Nullable Output<String> targetMeasureName;

    public Output<String> getTargetMeasureName() {
        return this.targetMeasureName == null ? Output.empty() : this.targetMeasureName;
    }

    public ScheduledQueryMixedMeasureMappingArgs(
        @Nullable Output<String> measureName,
        Output<ScheduledQueryMixedMeasureMappingMeasureValueType> measureValueType,
        @Nullable Output<List<ScheduledQueryMultiMeasureAttributeMappingArgs>> multiMeasureAttributeMappings,
        @Nullable Output<String> sourceColumn,
        @Nullable Output<String> targetMeasureName) {
        this.measureName = measureName;
        this.measureValueType = Objects.requireNonNull(measureValueType, "expected parameter 'measureValueType' to be non-null");
        this.multiMeasureAttributeMappings = multiMeasureAttributeMappings;
        this.sourceColumn = sourceColumn;
        this.targetMeasureName = targetMeasureName;
    }

    private ScheduledQueryMixedMeasureMappingArgs() {
        this.measureName = Output.empty();
        this.measureValueType = Output.empty();
        this.multiMeasureAttributeMappings = Output.empty();
        this.sourceColumn = Output.empty();
        this.targetMeasureName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryMixedMeasureMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> measureName;
        private Output<ScheduledQueryMixedMeasureMappingMeasureValueType> measureValueType;
        private @Nullable Output<List<ScheduledQueryMultiMeasureAttributeMappingArgs>> multiMeasureAttributeMappings;
        private @Nullable Output<String> sourceColumn;
        private @Nullable Output<String> targetMeasureName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryMixedMeasureMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.measureName = defaults.measureName;
    	      this.measureValueType = defaults.measureValueType;
    	      this.multiMeasureAttributeMappings = defaults.multiMeasureAttributeMappings;
    	      this.sourceColumn = defaults.sourceColumn;
    	      this.targetMeasureName = defaults.targetMeasureName;
        }

        public Builder measureName(@Nullable Output<String> measureName) {
            this.measureName = measureName;
            return this;
        }

        public Builder measureName(@Nullable String measureName) {
            this.measureName = Output.ofNullable(measureName);
            return this;
        }

        public Builder measureValueType(Output<ScheduledQueryMixedMeasureMappingMeasureValueType> measureValueType) {
            this.measureValueType = Objects.requireNonNull(measureValueType);
            return this;
        }

        public Builder measureValueType(ScheduledQueryMixedMeasureMappingMeasureValueType measureValueType) {
            this.measureValueType = Output.of(Objects.requireNonNull(measureValueType));
            return this;
        }

        public Builder multiMeasureAttributeMappings(@Nullable Output<List<ScheduledQueryMultiMeasureAttributeMappingArgs>> multiMeasureAttributeMappings) {
            this.multiMeasureAttributeMappings = multiMeasureAttributeMappings;
            return this;
        }

        public Builder multiMeasureAttributeMappings(@Nullable List<ScheduledQueryMultiMeasureAttributeMappingArgs> multiMeasureAttributeMappings) {
            this.multiMeasureAttributeMappings = Output.ofNullable(multiMeasureAttributeMappings);
            return this;
        }

        public Builder sourceColumn(@Nullable Output<String> sourceColumn) {
            this.sourceColumn = sourceColumn;
            return this;
        }

        public Builder sourceColumn(@Nullable String sourceColumn) {
            this.sourceColumn = Output.ofNullable(sourceColumn);
            return this;
        }

        public Builder targetMeasureName(@Nullable Output<String> targetMeasureName) {
            this.targetMeasureName = targetMeasureName;
            return this;
        }

        public Builder targetMeasureName(@Nullable String targetMeasureName) {
            this.targetMeasureName = Output.ofNullable(targetMeasureName);
            return this;
        }
        public ScheduledQueryMixedMeasureMappingArgs build() {
            return new ScheduledQueryMixedMeasureMappingArgs(measureName, measureValueType, multiMeasureAttributeMappings, sourceColumn, targetMeasureName);
        }
    }
}
