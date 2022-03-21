// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Throughput for the specified table, which consists of values for ReadCapacityUnits and WriteCapacityUnits
 * 
 */
public final class TableProvisionedThroughputArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableProvisionedThroughputArgs Empty = new TableProvisionedThroughputArgs();

    @Import(name="readCapacityUnits", required=true)
      private final Output<Integer> readCapacityUnits;

    public Output<Integer> getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    @Import(name="writeCapacityUnits", required=true)
      private final Output<Integer> writeCapacityUnits;

    public Output<Integer> getWriteCapacityUnits() {
        return this.writeCapacityUnits;
    }

    public TableProvisionedThroughputArgs(
        Output<Integer> readCapacityUnits,
        Output<Integer> writeCapacityUnits) {
        this.readCapacityUnits = Objects.requireNonNull(readCapacityUnits, "expected parameter 'readCapacityUnits' to be non-null");
        this.writeCapacityUnits = Objects.requireNonNull(writeCapacityUnits, "expected parameter 'writeCapacityUnits' to be non-null");
    }

    private TableProvisionedThroughputArgs() {
        this.readCapacityUnits = Output.empty();
        this.writeCapacityUnits = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableProvisionedThroughputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> readCapacityUnits;
        private Output<Integer> writeCapacityUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(TableProvisionedThroughputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readCapacityUnits = defaults.readCapacityUnits;
    	      this.writeCapacityUnits = defaults.writeCapacityUnits;
        }

        public Builder readCapacityUnits(Output<Integer> readCapacityUnits) {
            this.readCapacityUnits = Objects.requireNonNull(readCapacityUnits);
            return this;
        }
        public Builder readCapacityUnits(Integer readCapacityUnits) {
            this.readCapacityUnits = Output.of(Objects.requireNonNull(readCapacityUnits));
            return this;
        }
        public Builder writeCapacityUnits(Output<Integer> writeCapacityUnits) {
            this.writeCapacityUnits = Objects.requireNonNull(writeCapacityUnits);
            return this;
        }
        public Builder writeCapacityUnits(Integer writeCapacityUnits) {
            this.writeCapacityUnits = Output.of(Objects.requireNonNull(writeCapacityUnits));
            return this;
        }        public TableProvisionedThroughputArgs build() {
            return new TableProvisionedThroughputArgs(readCapacityUnits, writeCapacityUnits);
        }
    }
}
