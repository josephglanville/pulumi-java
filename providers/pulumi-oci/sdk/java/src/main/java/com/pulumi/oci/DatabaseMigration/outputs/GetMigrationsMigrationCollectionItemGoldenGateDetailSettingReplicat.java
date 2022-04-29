// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetMigrationsMigrationCollectionItemGoldenGateDetailSettingReplicat {
    /**
     * @return Number of threads used to read trail files (valid for Parallel Replicat)
     * 
     */
    private final Integer mapParallelism;
    /**
     * @return Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
     * 
     */
    private final Integer maxApplyParallelism;
    /**
     * @return Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
     * 
     */
    private final Integer minApplyParallelism;

    @CustomType.Constructor
    private GetMigrationsMigrationCollectionItemGoldenGateDetailSettingReplicat(
        @CustomType.Parameter("mapParallelism") Integer mapParallelism,
        @CustomType.Parameter("maxApplyParallelism") Integer maxApplyParallelism,
        @CustomType.Parameter("minApplyParallelism") Integer minApplyParallelism) {
        this.mapParallelism = mapParallelism;
        this.maxApplyParallelism = maxApplyParallelism;
        this.minApplyParallelism = minApplyParallelism;
    }

    /**
     * @return Number of threads used to read trail files (valid for Parallel Replicat)
     * 
     */
    public Integer mapParallelism() {
        return this.mapParallelism;
    }
    /**
     * @return Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
     * 
     */
    public Integer maxApplyParallelism() {
        return this.maxApplyParallelism;
    }
    /**
     * @return Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
     * 
     */
    public Integer minApplyParallelism() {
        return this.minApplyParallelism;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrationsMigrationCollectionItemGoldenGateDetailSettingReplicat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer mapParallelism;
        private Integer maxApplyParallelism;
        private Integer minApplyParallelism;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrationsMigrationCollectionItemGoldenGateDetailSettingReplicat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mapParallelism = defaults.mapParallelism;
    	      this.maxApplyParallelism = defaults.maxApplyParallelism;
    	      this.minApplyParallelism = defaults.minApplyParallelism;
        }

        public Builder mapParallelism(Integer mapParallelism) {
            this.mapParallelism = Objects.requireNonNull(mapParallelism);
            return this;
        }
        public Builder maxApplyParallelism(Integer maxApplyParallelism) {
            this.maxApplyParallelism = Objects.requireNonNull(maxApplyParallelism);
            return this;
        }
        public Builder minApplyParallelism(Integer minApplyParallelism) {
            this.minApplyParallelism = Objects.requireNonNull(minApplyParallelism);
            return this;
        }        public GetMigrationsMigrationCollectionItemGoldenGateDetailSettingReplicat build() {
            return new GetMigrationsMigrationCollectionItemGoldenGateDetailSettingReplicat(mapParallelism, maxApplyParallelism, minApplyParallelism);
        }
    }
}
