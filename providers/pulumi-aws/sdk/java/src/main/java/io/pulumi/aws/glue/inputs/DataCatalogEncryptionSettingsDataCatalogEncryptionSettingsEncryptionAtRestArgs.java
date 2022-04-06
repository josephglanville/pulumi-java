// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs Empty = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs();

    /**
     * The encryption-at-rest mode for encrypting Data Catalog data. Valid values are `DISABLED` and `SSE-KMS`.
     * 
     */
    @Import(name="catalogEncryptionMode", required=true)
      private final Output<String> catalogEncryptionMode;

    public Output<String> getCatalogEncryptionMode() {
        return this.catalogEncryptionMode;
    }

    /**
     * The ARN of the AWS KMS key to use for encryption at rest.
     * 
     */
    @Import(name="sseAwsKmsKeyId")
      private final @Nullable Output<String> sseAwsKmsKeyId;

    public Output<String> getSseAwsKmsKeyId() {
        return this.sseAwsKmsKeyId == null ? Output.empty() : this.sseAwsKmsKeyId;
    }

    public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs(
        Output<String> catalogEncryptionMode,
        @Nullable Output<String> sseAwsKmsKeyId) {
        this.catalogEncryptionMode = Objects.requireNonNull(catalogEncryptionMode, "expected parameter 'catalogEncryptionMode' to be non-null");
        this.sseAwsKmsKeyId = sseAwsKmsKeyId;
    }

    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs() {
        this.catalogEncryptionMode = Output.empty();
        this.sseAwsKmsKeyId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> catalogEncryptionMode;
        private @Nullable Output<String> sseAwsKmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogEncryptionMode = defaults.catalogEncryptionMode;
    	      this.sseAwsKmsKeyId = defaults.sseAwsKmsKeyId;
        }

        public Builder catalogEncryptionMode(Output<String> catalogEncryptionMode) {
            this.catalogEncryptionMode = Objects.requireNonNull(catalogEncryptionMode);
            return this;
        }
        public Builder catalogEncryptionMode(String catalogEncryptionMode) {
            this.catalogEncryptionMode = Output.of(Objects.requireNonNull(catalogEncryptionMode));
            return this;
        }
        public Builder sseAwsKmsKeyId(@Nullable Output<String> sseAwsKmsKeyId) {
            this.sseAwsKmsKeyId = sseAwsKmsKeyId;
            return this;
        }
        public Builder sseAwsKmsKeyId(@Nullable String sseAwsKmsKeyId) {
            this.sseAwsKmsKeyId = Output.ofNullable(sseAwsKmsKeyId);
            return this;
        }        public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs build() {
            return new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs(catalogEncryptionMode, sseAwsKmsKeyId);
        }
    }
}