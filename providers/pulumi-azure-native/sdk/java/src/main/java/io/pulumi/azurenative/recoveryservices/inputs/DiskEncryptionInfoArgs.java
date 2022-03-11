// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.DiskEncryptionKeyInfoArgs;
import io.pulumi.azurenative.recoveryservices.inputs.KeyEncryptionKeyInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Recovery disk encryption info (BEK and KEK).
 * 
 */
public final class DiskEncryptionInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionInfoArgs Empty = new DiskEncryptionInfoArgs();

    /**
     * The recovery KeyVault reference for secret.
     * 
     */
    @InputImport(name="diskEncryptionKeyInfo")
      private final @Nullable Output<DiskEncryptionKeyInfoArgs> diskEncryptionKeyInfo;

    public Output<DiskEncryptionKeyInfoArgs> getDiskEncryptionKeyInfo() {
        return this.diskEncryptionKeyInfo == null ? Output.empty() : this.diskEncryptionKeyInfo;
    }

    /**
     * The recovery KeyVault reference for key.
     * 
     */
    @InputImport(name="keyEncryptionKeyInfo")
      private final @Nullable Output<KeyEncryptionKeyInfoArgs> keyEncryptionKeyInfo;

    public Output<KeyEncryptionKeyInfoArgs> getKeyEncryptionKeyInfo() {
        return this.keyEncryptionKeyInfo == null ? Output.empty() : this.keyEncryptionKeyInfo;
    }

    public DiskEncryptionInfoArgs(
        @Nullable Output<DiskEncryptionKeyInfoArgs> diskEncryptionKeyInfo,
        @Nullable Output<KeyEncryptionKeyInfoArgs> keyEncryptionKeyInfo) {
        this.diskEncryptionKeyInfo = diskEncryptionKeyInfo;
        this.keyEncryptionKeyInfo = keyEncryptionKeyInfo;
    }

    private DiskEncryptionInfoArgs() {
        this.diskEncryptionKeyInfo = Output.empty();
        this.keyEncryptionKeyInfo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DiskEncryptionKeyInfoArgs> diskEncryptionKeyInfo;
        private @Nullable Output<KeyEncryptionKeyInfoArgs> keyEncryptionKeyInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKeyInfo = defaults.diskEncryptionKeyInfo;
    	      this.keyEncryptionKeyInfo = defaults.keyEncryptionKeyInfo;
        }

        public Builder diskEncryptionKeyInfo(@Nullable Output<DiskEncryptionKeyInfoArgs> diskEncryptionKeyInfo) {
            this.diskEncryptionKeyInfo = diskEncryptionKeyInfo;
            return this;
        }

        public Builder diskEncryptionKeyInfo(@Nullable DiskEncryptionKeyInfoArgs diskEncryptionKeyInfo) {
            this.diskEncryptionKeyInfo = Output.ofNullable(diskEncryptionKeyInfo);
            return this;
        }

        public Builder keyEncryptionKeyInfo(@Nullable Output<KeyEncryptionKeyInfoArgs> keyEncryptionKeyInfo) {
            this.keyEncryptionKeyInfo = keyEncryptionKeyInfo;
            return this;
        }

        public Builder keyEncryptionKeyInfo(@Nullable KeyEncryptionKeyInfoArgs keyEncryptionKeyInfo) {
            this.keyEncryptionKeyInfo = Output.ofNullable(keyEncryptionKeyInfo);
            return this;
        }
        public DiskEncryptionInfoArgs build() {
            return new DiskEncryptionInfoArgs(diskEncryptionKeyInfo, keyEncryptionKeyInfo);
        }
    }
}
