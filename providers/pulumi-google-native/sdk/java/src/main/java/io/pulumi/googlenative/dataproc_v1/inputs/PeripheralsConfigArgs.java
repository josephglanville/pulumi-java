// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1.inputs.SparkHistoryServerConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Auxiliary services configuration for a workload.
 * 
 */
public final class PeripheralsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeripheralsConfigArgs Empty = new PeripheralsConfigArgs();

    /**
     * Optional. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[region]/services/[service_id]
     * 
     */
    @InputImport(name="metastoreService")
      private final @Nullable Output<String> metastoreService;

    public Output<String> getMetastoreService() {
        return this.metastoreService == null ? Output.empty() : this.metastoreService;
    }

    /**
     * Optional. The Spark History Server configuration for the workload.
     * 
     */
    @InputImport(name="sparkHistoryServerConfig")
      private final @Nullable Output<SparkHistoryServerConfigArgs> sparkHistoryServerConfig;

    public Output<SparkHistoryServerConfigArgs> getSparkHistoryServerConfig() {
        return this.sparkHistoryServerConfig == null ? Output.empty() : this.sparkHistoryServerConfig;
    }

    public PeripheralsConfigArgs(
        @Nullable Output<String> metastoreService,
        @Nullable Output<SparkHistoryServerConfigArgs> sparkHistoryServerConfig) {
        this.metastoreService = metastoreService;
        this.sparkHistoryServerConfig = sparkHistoryServerConfig;
    }

    private PeripheralsConfigArgs() {
        this.metastoreService = Output.empty();
        this.sparkHistoryServerConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeripheralsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> metastoreService;
        private @Nullable Output<SparkHistoryServerConfigArgs> sparkHistoryServerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PeripheralsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metastoreService = defaults.metastoreService;
    	      this.sparkHistoryServerConfig = defaults.sparkHistoryServerConfig;
        }

        public Builder metastoreService(@Nullable Output<String> metastoreService) {
            this.metastoreService = metastoreService;
            return this;
        }

        public Builder metastoreService(@Nullable String metastoreService) {
            this.metastoreService = Output.ofNullable(metastoreService);
            return this;
        }

        public Builder sparkHistoryServerConfig(@Nullable Output<SparkHistoryServerConfigArgs> sparkHistoryServerConfig) {
            this.sparkHistoryServerConfig = sparkHistoryServerConfig;
            return this;
        }

        public Builder sparkHistoryServerConfig(@Nullable SparkHistoryServerConfigArgs sparkHistoryServerConfig) {
            this.sparkHistoryServerConfig = Output.ofNullable(sparkHistoryServerConfig);
            return this;
        }
        public PeripheralsConfigArgs build() {
            return new PeripheralsConfigArgs(metastoreService, sparkHistoryServerConfig);
        }
    }
}
