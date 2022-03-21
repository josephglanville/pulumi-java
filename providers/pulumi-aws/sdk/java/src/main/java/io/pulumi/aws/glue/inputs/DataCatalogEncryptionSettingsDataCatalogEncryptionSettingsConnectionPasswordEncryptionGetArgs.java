// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs Empty = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs();

    /**
     * A KMS key ARN that is used to encrypt the connection password. If connection password protection is enabled, the caller of CreateConnection and UpdateConnection needs at least `kms:Encrypt` permission on the specified AWS KMS key, to encrypt passwords before storing them in the Data Catalog.
     * 
     */
    @Import(name="awsKmsKeyId")
      private final @Nullable Output<String> awsKmsKeyId;

    public Output<String> getAwsKmsKeyId() {
        return this.awsKmsKeyId == null ? Output.empty() : this.awsKmsKeyId;
    }

    /**
     * When set to `true`, passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently of the catalog encryption.
     * 
     */
    @Import(name="returnConnectionPasswordEncrypted", required=true)
      private final Output<Boolean> returnConnectionPasswordEncrypted;

    public Output<Boolean> getReturnConnectionPasswordEncrypted() {
        return this.returnConnectionPasswordEncrypted;
    }

    public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs(
        @Nullable Output<String> awsKmsKeyId,
        Output<Boolean> returnConnectionPasswordEncrypted) {
        this.awsKmsKeyId = awsKmsKeyId;
        this.returnConnectionPasswordEncrypted = Objects.requireNonNull(returnConnectionPasswordEncrypted, "expected parameter 'returnConnectionPasswordEncrypted' to be non-null");
    }

    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs() {
        this.awsKmsKeyId = Output.empty();
        this.returnConnectionPasswordEncrypted = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> awsKmsKeyId;
        private Output<Boolean> returnConnectionPasswordEncrypted;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsKmsKeyId = defaults.awsKmsKeyId;
    	      this.returnConnectionPasswordEncrypted = defaults.returnConnectionPasswordEncrypted;
        }

        public Builder awsKmsKeyId(@Nullable Output<String> awsKmsKeyId) {
            this.awsKmsKeyId = awsKmsKeyId;
            return this;
        }
        public Builder awsKmsKeyId(@Nullable String awsKmsKeyId) {
            this.awsKmsKeyId = Output.ofNullable(awsKmsKeyId);
            return this;
        }
        public Builder returnConnectionPasswordEncrypted(Output<Boolean> returnConnectionPasswordEncrypted) {
            this.returnConnectionPasswordEncrypted = Objects.requireNonNull(returnConnectionPasswordEncrypted);
            return this;
        }
        public Builder returnConnectionPasswordEncrypted(Boolean returnConnectionPasswordEncrypted) {
            this.returnConnectionPasswordEncrypted = Output.of(Objects.requireNonNull(returnConnectionPasswordEncrypted));
            return this;
        }        public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs build() {
            return new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs(awsKmsKeyId, returnConnectionPasswordEncrypted);
        }
    }
}
