// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableEncryptionConfigurationArgs Empty = new TableEncryptionConfigurationArgs();

    /**
     * The self link or full name of a key which should be used to
     * encrypt this table.  Note that the default bigquery service account will need to have
     * encrypt/decrypt permissions on this key - you may want to see the
     * `gcp.bigquery.getDefaultServiceAccount` datasource and the
     * `gcp.kms.CryptoKeyIAMBinding` resource.
     * 
     */
    @Import(name="kmsKeyName", required=true)
      private final Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    /**
     * The self link or full name of the kms key version used to encrypt this table.
     * 
     */
    @Import(name="kmsKeyVersion")
      private final @Nullable Output<String> kmsKeyVersion;

    public Output<String> getKmsKeyVersion() {
        return this.kmsKeyVersion == null ? Codegen.empty() : this.kmsKeyVersion;
    }

    public TableEncryptionConfigurationArgs(
        Output<String> kmsKeyName,
        @Nullable Output<String> kmsKeyVersion) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
        this.kmsKeyVersion = kmsKeyVersion;
    }

    private TableEncryptionConfigurationArgs() {
        this.kmsKeyName = Codegen.empty();
        this.kmsKeyVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kmsKeyName;
        private @Nullable Output<String> kmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(TableEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyVersion = defaults.kmsKeyVersion;
        }

        public Builder kmsKeyName(Output<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Output.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }
        public Builder kmsKeyVersion(@Nullable Output<String> kmsKeyVersion) {
            this.kmsKeyVersion = kmsKeyVersion;
            return this;
        }
        public Builder kmsKeyVersion(@Nullable String kmsKeyVersion) {
            this.kmsKeyVersion = Codegen.ofNullable(kmsKeyVersion);
            return this;
        }        public TableEncryptionConfigurationArgs build() {
            return new TableEncryptionConfigurationArgs(kmsKeyName, kmsKeyVersion);
        }
    }
}
