// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigPreemptibleWorkerConfigDiskConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterConfigPreemptibleWorkerConfig {
    /**
     * Disk Config
     * 
     */
    private final @Nullable ClusterClusterConfigPreemptibleWorkerConfigDiskConfig diskConfig;
    private final @Nullable List<String> instanceNames;
    /**
     * Specifies the number of preemptible nodes to create.
     * Defaults to 0.
     * 
     */
    private final @Nullable Integer numInstances;

    @CustomType.Constructor
    private ClusterClusterConfigPreemptibleWorkerConfig(
        @CustomType.Parameter("diskConfig") @Nullable ClusterClusterConfigPreemptibleWorkerConfigDiskConfig diskConfig,
        @CustomType.Parameter("instanceNames") @Nullable List<String> instanceNames,
        @CustomType.Parameter("numInstances") @Nullable Integer numInstances) {
        this.diskConfig = diskConfig;
        this.instanceNames = instanceNames;
        this.numInstances = numInstances;
    }

    /**
     * Disk Config
     * 
    */
    public Optional<ClusterClusterConfigPreemptibleWorkerConfigDiskConfig> getDiskConfig() {
        return Optional.ofNullable(this.diskConfig);
    }
    public List<String> getInstanceNames() {
        return this.instanceNames == null ? List.of() : this.instanceNames;
    }
    /**
     * Specifies the number of preemptible nodes to create.
     * Defaults to 0.
     * 
    */
    public Optional<Integer> getNumInstances() {
        return Optional.ofNullable(this.numInstances);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigPreemptibleWorkerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterClusterConfigPreemptibleWorkerConfigDiskConfig diskConfig;
        private @Nullable List<String> instanceNames;
        private @Nullable Integer numInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigPreemptibleWorkerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfig = defaults.diskConfig;
    	      this.instanceNames = defaults.instanceNames;
    	      this.numInstances = defaults.numInstances;
        }

        public Builder diskConfig(@Nullable ClusterClusterConfigPreemptibleWorkerConfigDiskConfig diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }
        public Builder instanceNames(@Nullable List<String> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }
        public Builder instanceNames(String... instanceNames) {
            return instanceNames(List.of(instanceNames));
        }
        public Builder numInstances(@Nullable Integer numInstances) {
            this.numInstances = numInstances;
            return this;
        }        public ClusterClusterConfigPreemptibleWorkerConfig build() {
            return new ClusterClusterConfigPreemptibleWorkerConfig(diskConfig, instanceNames, numInstances);
        }
    }
}
