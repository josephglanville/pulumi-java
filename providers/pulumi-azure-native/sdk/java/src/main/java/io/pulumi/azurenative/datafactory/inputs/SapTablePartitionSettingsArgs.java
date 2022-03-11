// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings that will be leveraged for SAP table source partitioning.
 * 
 */
public final class SapTablePartitionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapTablePartitionSettingsArgs Empty = new SapTablePartitionSettingsArgs();

    /**
     * The maximum value of partitions the table will be split into. Type: integer (or Expression with resultType string).
     * 
     */
    @InputImport(name="maxPartitionsNumber")
      private final @Nullable Output<Object> maxPartitionsNumber;

    public Output<Object> getMaxPartitionsNumber() {
        return this.maxPartitionsNumber == null ? Output.empty() : this.maxPartitionsNumber;
    }

    /**
     * The name of the column that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionColumnName")
      private final @Nullable Output<Object> partitionColumnName;

    public Output<Object> getPartitionColumnName() {
        return this.partitionColumnName == null ? Output.empty() : this.partitionColumnName;
    }

    /**
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionLowerBound")
      private final @Nullable Output<Object> partitionLowerBound;

    public Output<Object> getPartitionLowerBound() {
        return this.partitionLowerBound == null ? Output.empty() : this.partitionLowerBound;
    }

    /**
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionUpperBound")
      private final @Nullable Output<Object> partitionUpperBound;

    public Output<Object> getPartitionUpperBound() {
        return this.partitionUpperBound == null ? Output.empty() : this.partitionUpperBound;
    }

    public SapTablePartitionSettingsArgs(
        @Nullable Output<Object> maxPartitionsNumber,
        @Nullable Output<Object> partitionColumnName,
        @Nullable Output<Object> partitionLowerBound,
        @Nullable Output<Object> partitionUpperBound) {
        this.maxPartitionsNumber = maxPartitionsNumber;
        this.partitionColumnName = partitionColumnName;
        this.partitionLowerBound = partitionLowerBound;
        this.partitionUpperBound = partitionUpperBound;
    }

    private SapTablePartitionSettingsArgs() {
        this.maxPartitionsNumber = Output.empty();
        this.partitionColumnName = Output.empty();
        this.partitionLowerBound = Output.empty();
        this.partitionUpperBound = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapTablePartitionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> maxPartitionsNumber;
        private @Nullable Output<Object> partitionColumnName;
        private @Nullable Output<Object> partitionLowerBound;
        private @Nullable Output<Object> partitionUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(SapTablePartitionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPartitionsNumber = defaults.maxPartitionsNumber;
    	      this.partitionColumnName = defaults.partitionColumnName;
    	      this.partitionLowerBound = defaults.partitionLowerBound;
    	      this.partitionUpperBound = defaults.partitionUpperBound;
        }

        public Builder maxPartitionsNumber(@Nullable Output<Object> maxPartitionsNumber) {
            this.maxPartitionsNumber = maxPartitionsNumber;
            return this;
        }

        public Builder maxPartitionsNumber(@Nullable Object maxPartitionsNumber) {
            this.maxPartitionsNumber = Output.ofNullable(maxPartitionsNumber);
            return this;
        }

        public Builder partitionColumnName(@Nullable Output<Object> partitionColumnName) {
            this.partitionColumnName = partitionColumnName;
            return this;
        }

        public Builder partitionColumnName(@Nullable Object partitionColumnName) {
            this.partitionColumnName = Output.ofNullable(partitionColumnName);
            return this;
        }

        public Builder partitionLowerBound(@Nullable Output<Object> partitionLowerBound) {
            this.partitionLowerBound = partitionLowerBound;
            return this;
        }

        public Builder partitionLowerBound(@Nullable Object partitionLowerBound) {
            this.partitionLowerBound = Output.ofNullable(partitionLowerBound);
            return this;
        }

        public Builder partitionUpperBound(@Nullable Output<Object> partitionUpperBound) {
            this.partitionUpperBound = partitionUpperBound;
            return this;
        }

        public Builder partitionUpperBound(@Nullable Object partitionUpperBound) {
            this.partitionUpperBound = Output.ofNullable(partitionUpperBound);
            return this;
        }
        public SapTablePartitionSettingsArgs build() {
            return new SapTablePartitionSettingsArgs(maxPartitionsNumber, partitionColumnName, partitionLowerBound, partitionUpperBound);
        }
    }
}
