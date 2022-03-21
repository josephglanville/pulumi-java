// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Disk encryption configuration for an instance.
 * 
 */
public final class DiskEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionConfigurationArgs Empty = new DiskEncryptionConfigurationArgs();

    /**
     * This is always `sql#diskEncryptionConfiguration`.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Resource name of KMS key for disk encryption
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Output.empty() : this.kmsKeyName;
    }

    public DiskEncryptionConfigurationArgs(
        @Nullable Output<String> kind,
        @Nullable Output<String> kmsKeyName) {
        this.kind = kind;
        this.kmsKeyName = kmsKeyName;
    }

    private DiskEncryptionConfigurationArgs() {
        this.kind = Output.empty();
        this.kmsKeyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private @Nullable Output<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Output.ofNullable(kmsKeyName);
            return this;
        }        public DiskEncryptionConfigurationArgs build() {
            return new DiskEncryptionConfigurationArgs(kind, kmsKeyName);
        }
    }
}
