// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.awsnative.timestream.enums.ScheduledQueryDimensionValueType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * This type is used to map column(s) from the query result to a dimension in the destination table.
 * 
 */
public final class ScheduledQueryDimensionMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryDimensionMappingArgs Empty = new ScheduledQueryDimensionMappingArgs();

    @Import(name="dimensionValueType", required=true)
      private final Output<ScheduledQueryDimensionValueType> dimensionValueType;

    public Output<ScheduledQueryDimensionValueType> getDimensionValueType() {
        return this.dimensionValueType;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ScheduledQueryDimensionMappingArgs(
        Output<ScheduledQueryDimensionValueType> dimensionValueType,
        Output<String> name) {
        this.dimensionValueType = Objects.requireNonNull(dimensionValueType, "expected parameter 'dimensionValueType' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ScheduledQueryDimensionMappingArgs() {
        this.dimensionValueType = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryDimensionMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ScheduledQueryDimensionValueType> dimensionValueType;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryDimensionMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionValueType = defaults.dimensionValueType;
    	      this.name = defaults.name;
        }

        public Builder dimensionValueType(Output<ScheduledQueryDimensionValueType> dimensionValueType) {
            this.dimensionValueType = Objects.requireNonNull(dimensionValueType);
            return this;
        }
        public Builder dimensionValueType(ScheduledQueryDimensionValueType dimensionValueType) {
            this.dimensionValueType = Output.of(Objects.requireNonNull(dimensionValueType));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ScheduledQueryDimensionMappingArgs build() {
            return new ScheduledQueryDimensionMappingArgs(dimensionValueType, name);
        }
    }
}
