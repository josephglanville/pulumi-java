// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class IndexCapacityUnitsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexCapacityUnitsConfigurationArgs Empty = new IndexCapacityUnitsConfigurationArgs();

    @InputImport(name="queryCapacityUnits", required=true)
      private final Output<Integer> queryCapacityUnits;

    public Output<Integer> getQueryCapacityUnits() {
        return this.queryCapacityUnits;
    }

    @InputImport(name="storageCapacityUnits", required=true)
      private final Output<Integer> storageCapacityUnits;

    public Output<Integer> getStorageCapacityUnits() {
        return this.storageCapacityUnits;
    }

    public IndexCapacityUnitsConfigurationArgs(
        Output<Integer> queryCapacityUnits,
        Output<Integer> storageCapacityUnits) {
        this.queryCapacityUnits = Objects.requireNonNull(queryCapacityUnits, "expected parameter 'queryCapacityUnits' to be non-null");
        this.storageCapacityUnits = Objects.requireNonNull(storageCapacityUnits, "expected parameter 'storageCapacityUnits' to be non-null");
    }

    private IndexCapacityUnitsConfigurationArgs() {
        this.queryCapacityUnits = Output.empty();
        this.storageCapacityUnits = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexCapacityUnitsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> queryCapacityUnits;
        private Output<Integer> storageCapacityUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexCapacityUnitsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryCapacityUnits = defaults.queryCapacityUnits;
    	      this.storageCapacityUnits = defaults.storageCapacityUnits;
        }

        public Builder queryCapacityUnits(Output<Integer> queryCapacityUnits) {
            this.queryCapacityUnits = Objects.requireNonNull(queryCapacityUnits);
            return this;
        }

        public Builder queryCapacityUnits(Integer queryCapacityUnits) {
            this.queryCapacityUnits = Output.of(Objects.requireNonNull(queryCapacityUnits));
            return this;
        }

        public Builder storageCapacityUnits(Output<Integer> storageCapacityUnits) {
            this.storageCapacityUnits = Objects.requireNonNull(storageCapacityUnits);
            return this;
        }

        public Builder storageCapacityUnits(Integer storageCapacityUnits) {
            this.storageCapacityUnits = Output.of(Objects.requireNonNull(storageCapacityUnits));
            return this;
        }
        public IndexCapacityUnitsConfigurationArgs build() {
            return new IndexCapacityUnitsConfigurationArgs(queryCapacityUnits, storageCapacityUnits);
        }
    }
}
