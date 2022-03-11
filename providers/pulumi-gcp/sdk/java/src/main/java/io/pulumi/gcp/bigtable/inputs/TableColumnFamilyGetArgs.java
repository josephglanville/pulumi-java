// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TableColumnFamilyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableColumnFamilyGetArgs Empty = new TableColumnFamilyGetArgs();

    /**
     * The name of the column family.
     * 
     */
    @InputImport(name="family", required=true)
      private final Output<String> family;

    public Output<String> getFamily() {
        return this.family;
    }

    public TableColumnFamilyGetArgs(Output<String> family) {
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
    }

    private TableColumnFamilyGetArgs() {
        this.family = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableColumnFamilyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> family;

        public Builder() {
    	      // Empty
        }

        public Builder(TableColumnFamilyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
        }

        public Builder family(Output<String> family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }

        public Builder family(String family) {
            this.family = Output.of(Objects.requireNonNull(family));
            return this;
        }
        public TableColumnFamilyGetArgs build() {
            return new TableColumnFamilyGetArgs(family);
        }
    }
}
