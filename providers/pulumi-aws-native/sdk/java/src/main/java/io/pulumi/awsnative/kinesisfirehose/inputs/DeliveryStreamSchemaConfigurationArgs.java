// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamSchemaConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamSchemaConfigurationArgs Empty = new DeliveryStreamSchemaConfigurationArgs();

    @InputImport(name="catalogId")
      private final @Nullable Output<String> catalogId;

    public Output<String> getCatalogId() {
        return this.catalogId == null ? Output.empty() : this.catalogId;
    }

    @InputImport(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Output.empty() : this.databaseName;
    }

    @InputImport(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    @InputImport(name="roleARN")
      private final @Nullable Output<String> roleARN;

    public Output<String> getRoleARN() {
        return this.roleARN == null ? Output.empty() : this.roleARN;
    }

    @InputImport(name="tableName")
      private final @Nullable Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName == null ? Output.empty() : this.tableName;
    }

    @InputImport(name="versionId")
      private final @Nullable Output<String> versionId;

    public Output<String> getVersionId() {
        return this.versionId == null ? Output.empty() : this.versionId;
    }

    public DeliveryStreamSchemaConfigurationArgs(
        @Nullable Output<String> catalogId,
        @Nullable Output<String> databaseName,
        @Nullable Output<String> region,
        @Nullable Output<String> roleARN,
        @Nullable Output<String> tableName,
        @Nullable Output<String> versionId) {
        this.catalogId = catalogId;
        this.databaseName = databaseName;
        this.region = region;
        this.roleARN = roleARN;
        this.tableName = tableName;
        this.versionId = versionId;
    }

    private DeliveryStreamSchemaConfigurationArgs() {
        this.catalogId = Output.empty();
        this.databaseName = Output.empty();
        this.region = Output.empty();
        this.roleARN = Output.empty();
        this.tableName = Output.empty();
        this.versionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamSchemaConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> catalogId;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<String> region;
        private @Nullable Output<String> roleARN;
        private @Nullable Output<String> tableName;
        private @Nullable Output<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamSchemaConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.region = defaults.region;
    	      this.roleARN = defaults.roleARN;
    	      this.tableName = defaults.tableName;
    	      this.versionId = defaults.versionId;
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Output.ofNullable(catalogId);
            return this;
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Output.ofNullable(databaseName);
            return this;
        }

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder roleARN(@Nullable Output<String> roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        public Builder roleARN(@Nullable String roleARN) {
            this.roleARN = Output.ofNullable(roleARN);
            return this;
        }

        public Builder tableName(@Nullable Output<String> tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder tableName(@Nullable String tableName) {
            this.tableName = Output.ofNullable(tableName);
            return this;
        }

        public Builder versionId(@Nullable Output<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder versionId(@Nullable String versionId) {
            this.versionId = Output.ofNullable(versionId);
            return this;
        }
        public DeliveryStreamSchemaConfigurationArgs build() {
            return new DeliveryStreamSchemaConfigurationArgs(catalogId, databaseName, region, roleARN, tableName, versionId);
        }
    }
}
