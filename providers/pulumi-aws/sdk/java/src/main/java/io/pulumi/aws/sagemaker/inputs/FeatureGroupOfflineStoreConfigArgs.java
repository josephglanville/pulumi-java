// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigDataCatalogConfigArgs;
import io.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigS3StorageConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupOfflineStoreConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupOfflineStoreConfigArgs Empty = new FeatureGroupOfflineStoreConfigArgs();

    /**
     * The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
     * 
     */
    @InputImport(name="dataCatalogConfig")
      private final @Nullable Output<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> dataCatalogConfig;

    public Output<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> getDataCatalogConfig() {
        return this.dataCatalogConfig == null ? Output.empty() : this.dataCatalogConfig;
    }

    /**
     * Set to `true` to turn Online Store On.
     * 
     */
    @InputImport(name="disableGlueTableCreation")
      private final @Nullable Output<Boolean> disableGlueTableCreation;

    public Output<Boolean> getDisableGlueTableCreation() {
        return this.disableGlueTableCreation == null ? Output.empty() : this.disableGlueTableCreation;
    }

    /**
     * The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
     * 
     */
    @InputImport(name="s3StorageConfig", required=true)
      private final Output<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig;

    public Output<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> getS3StorageConfig() {
        return this.s3StorageConfig;
    }

    public FeatureGroupOfflineStoreConfigArgs(
        @Nullable Output<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> dataCatalogConfig,
        @Nullable Output<Boolean> disableGlueTableCreation,
        Output<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig) {
        this.dataCatalogConfig = dataCatalogConfig;
        this.disableGlueTableCreation = disableGlueTableCreation;
        this.s3StorageConfig = Objects.requireNonNull(s3StorageConfig, "expected parameter 's3StorageConfig' to be non-null");
    }

    private FeatureGroupOfflineStoreConfigArgs() {
        this.dataCatalogConfig = Output.empty();
        this.disableGlueTableCreation = Output.empty();
        this.s3StorageConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOfflineStoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> dataCatalogConfig;
        private @Nullable Output<Boolean> disableGlueTableCreation;
        private Output<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOfflineStoreConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogConfig = defaults.dataCatalogConfig;
    	      this.disableGlueTableCreation = defaults.disableGlueTableCreation;
    	      this.s3StorageConfig = defaults.s3StorageConfig;
        }

        public Builder dataCatalogConfig(@Nullable Output<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> dataCatalogConfig) {
            this.dataCatalogConfig = dataCatalogConfig;
            return this;
        }

        public Builder dataCatalogConfig(@Nullable FeatureGroupOfflineStoreConfigDataCatalogConfigArgs dataCatalogConfig) {
            this.dataCatalogConfig = Output.ofNullable(dataCatalogConfig);
            return this;
        }

        public Builder disableGlueTableCreation(@Nullable Output<Boolean> disableGlueTableCreation) {
            this.disableGlueTableCreation = disableGlueTableCreation;
            return this;
        }

        public Builder disableGlueTableCreation(@Nullable Boolean disableGlueTableCreation) {
            this.disableGlueTableCreation = Output.ofNullable(disableGlueTableCreation);
            return this;
        }

        public Builder s3StorageConfig(Output<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig) {
            this.s3StorageConfig = Objects.requireNonNull(s3StorageConfig);
            return this;
        }

        public Builder s3StorageConfig(FeatureGroupOfflineStoreConfigS3StorageConfigArgs s3StorageConfig) {
            this.s3StorageConfig = Output.of(Objects.requireNonNull(s3StorageConfig));
            return this;
        }
        public FeatureGroupOfflineStoreConfigArgs build() {
            return new FeatureGroupOfflineStoreConfigArgs(dataCatalogConfig, disableGlueTableCreation, s3StorageConfig);
        }
    }
}
