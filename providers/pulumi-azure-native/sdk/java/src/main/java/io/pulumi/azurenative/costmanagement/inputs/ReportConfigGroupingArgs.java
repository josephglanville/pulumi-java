// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.ReportConfigColumnType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The group by expression to be used in the report.
 * 
 */
public final class ReportConfigGroupingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportConfigGroupingArgs Empty = new ReportConfigGroupingArgs();

    /**
     * The name of the column to group. This version supports subscription lowest possible grain.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Has type of the column to group.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<Either<String,ReportConfigColumnType>> type;

    public Input<Either<String,ReportConfigColumnType>> getType() {
        return this.type;
    }

    public ReportConfigGroupingArgs(
        Input<String> name,
        Input<Either<String,ReportConfigColumnType>> type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ReportConfigGroupingArgs() {
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigGroupingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<Either<String,ReportConfigColumnType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigGroupingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setType(Input<Either<String,ReportConfigColumnType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,ReportConfigColumnType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ReportConfigGroupingArgs build() {
            return new ReportConfigGroupingArgs(name, type);
        }
    }
}
