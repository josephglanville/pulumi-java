// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UniformInt64RangePartitionSchemeDescriptionResponse {
    /**
     * The number of partitions.
     * 
     */
    private final Integer count;
    /**
     * String indicating the upper bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    private final String highKey;
    /**
     * String indicating the lower bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    private final String lowKey;
    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is 'UniformInt64Range'.
     * 
     */
    private final String partitionScheme;

    @CustomType.Constructor
    private UniformInt64RangePartitionSchemeDescriptionResponse(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("highKey") String highKey,
        @CustomType.Parameter("lowKey") String lowKey,
        @CustomType.Parameter("partitionScheme") String partitionScheme) {
        this.count = count;
        this.highKey = highKey;
        this.lowKey = lowKey;
        this.partitionScheme = partitionScheme;
    }

    /**
     * The number of partitions.
     * 
    */
    public Integer getCount() {
        return this.count;
    }
    /**
     * String indicating the upper bound of the partition key range that
     * should be split between the partition ‘count’
     * 
    */
    public String getHighKey() {
        return this.highKey;
    }
    /**
     * String indicating the lower bound of the partition key range that
     * should be split between the partition ‘count’
     * 
    */
    public String getLowKey() {
        return this.lowKey;
    }
    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is 'UniformInt64Range'.
     * 
    */
    public String getPartitionScheme() {
        return this.partitionScheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniformInt64RangePartitionSchemeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String highKey;
        private String lowKey;
        private String partitionScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(UniformInt64RangePartitionSchemeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.highKey = defaults.highKey;
    	      this.lowKey = defaults.lowKey;
    	      this.partitionScheme = defaults.partitionScheme;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder highKey(String highKey) {
            this.highKey = Objects.requireNonNull(highKey);
            return this;
        }
        public Builder lowKey(String lowKey) {
            this.lowKey = Objects.requireNonNull(lowKey);
            return this;
        }
        public Builder partitionScheme(String partitionScheme) {
            this.partitionScheme = Objects.requireNonNull(partitionScheme);
            return this;
        }        public UniformInt64RangePartitionSchemeDescriptionResponse build() {
            return new UniformInt64RangePartitionSchemeDescriptionResponse(count, highKey, lowKey, partitionScheme);
        }
    }
}
