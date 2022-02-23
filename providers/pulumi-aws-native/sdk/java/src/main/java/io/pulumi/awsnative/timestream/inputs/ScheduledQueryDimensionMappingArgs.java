// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.awsnative.timestream.enums.ScheduledQueryDimensionValueType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * This type is used to map column(s) from the query result to a dimension in the destination table.
 * 
 */
public final class ScheduledQueryDimensionMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryDimensionMappingArgs Empty = new ScheduledQueryDimensionMappingArgs();

    @InputImport(name="dimensionValueType", required=true)
      private final Input<ScheduledQueryDimensionValueType> dimensionValueType;

    public Input<ScheduledQueryDimensionValueType> getDimensionValueType() {
        return this.dimensionValueType;
    }

    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public ScheduledQueryDimensionMappingArgs(
        Input<ScheduledQueryDimensionValueType> dimensionValueType,
        Input<String> name) {
        this.dimensionValueType = Objects.requireNonNull(dimensionValueType, "expected parameter 'dimensionValueType' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ScheduledQueryDimensionMappingArgs() {
        this.dimensionValueType = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryDimensionMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ScheduledQueryDimensionValueType> dimensionValueType;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryDimensionMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionValueType = defaults.dimensionValueType;
    	      this.name = defaults.name;
        }

        public Builder setDimensionValueType(Input<ScheduledQueryDimensionValueType> dimensionValueType) {
            this.dimensionValueType = Objects.requireNonNull(dimensionValueType);
            return this;
        }

        public Builder setDimensionValueType(ScheduledQueryDimensionValueType dimensionValueType) {
            this.dimensionValueType = Input.of(Objects.requireNonNull(dimensionValueType));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public ScheduledQueryDimensionMappingArgs build() {
            return new ScheduledQueryDimensionMappingArgs(dimensionValueType, name);
        }
    }
}
