// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.metastore_v1beta.inputs.DataCatalogConfigArgs;
import io.pulumi.googlenative.metastore_v1beta.inputs.DataplexConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how metastore metadata should be integrated with external services.
 * 
 */
public final class MetadataIntegrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataIntegrationArgs Empty = new MetadataIntegrationArgs();

    /**
     * The integration config for the Data Catalog service.
     * 
     */
    @Import(name="dataCatalogConfig")
      private final @Nullable Output<DataCatalogConfigArgs> dataCatalogConfig;

    public Output<DataCatalogConfigArgs> getDataCatalogConfig() {
        return this.dataCatalogConfig == null ? Codegen.empty() : this.dataCatalogConfig;
    }

    /**
     * The integration config for the Dataplex service.
     * 
     */
    @Import(name="dataplexConfig")
      private final @Nullable Output<DataplexConfigArgs> dataplexConfig;

    public Output<DataplexConfigArgs> getDataplexConfig() {
        return this.dataplexConfig == null ? Codegen.empty() : this.dataplexConfig;
    }

    public MetadataIntegrationArgs(
        @Nullable Output<DataCatalogConfigArgs> dataCatalogConfig,
        @Nullable Output<DataplexConfigArgs> dataplexConfig) {
        this.dataCatalogConfig = dataCatalogConfig;
        this.dataplexConfig = dataplexConfig;
    }

    private MetadataIntegrationArgs() {
        this.dataCatalogConfig = Codegen.empty();
        this.dataplexConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataCatalogConfigArgs> dataCatalogConfig;
        private @Nullable Output<DataplexConfigArgs> dataplexConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataIntegrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogConfig = defaults.dataCatalogConfig;
    	      this.dataplexConfig = defaults.dataplexConfig;
        }

        public Builder dataCatalogConfig(@Nullable Output<DataCatalogConfigArgs> dataCatalogConfig) {
            this.dataCatalogConfig = dataCatalogConfig;
            return this;
        }
        public Builder dataCatalogConfig(@Nullable DataCatalogConfigArgs dataCatalogConfig) {
            this.dataCatalogConfig = Codegen.ofNullable(dataCatalogConfig);
            return this;
        }
        public Builder dataplexConfig(@Nullable Output<DataplexConfigArgs> dataplexConfig) {
            this.dataplexConfig = dataplexConfig;
            return this;
        }
        public Builder dataplexConfig(@Nullable DataplexConfigArgs dataplexConfig) {
            this.dataplexConfig = Codegen.ofNullable(dataplexConfig);
            return this;
        }        public MetadataIntegrationArgs build() {
            return new MetadataIntegrationArgs(dataCatalogConfig, dataplexConfig);
        }
    }
}
