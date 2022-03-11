// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateAttachedDiskGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateAttachedDiskGetArgs Empty = new InstanceFromTemplateAttachedDiskGetArgs();

    @InputImport(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Output.empty() : this.deviceName;
    }

    @InputImport(name="diskEncryptionKeyRaw")
      private final @Nullable Output<String> diskEncryptionKeyRaw;

    public Output<String> getDiskEncryptionKeyRaw() {
        return this.diskEncryptionKeyRaw == null ? Output.empty() : this.diskEncryptionKeyRaw;
    }

    @InputImport(name="diskEncryptionKeySha256")
      private final @Nullable Output<String> diskEncryptionKeySha256;

    public Output<String> getDiskEncryptionKeySha256() {
        return this.diskEncryptionKeySha256 == null ? Output.empty() : this.diskEncryptionKeySha256;
    }

    @InputImport(name="kmsKeySelfLink")
      private final @Nullable Output<String> kmsKeySelfLink;

    public Output<String> getKmsKeySelfLink() {
        return this.kmsKeySelfLink == null ? Output.empty() : this.kmsKeySelfLink;
    }

    @InputImport(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    @InputImport(name="source", required=true)
      private final Output<String> source;

    public Output<String> getSource() {
        return this.source;
    }

    public InstanceFromTemplateAttachedDiskGetArgs(
        @Nullable Output<String> deviceName,
        @Nullable Output<String> diskEncryptionKeyRaw,
        @Nullable Output<String> diskEncryptionKeySha256,
        @Nullable Output<String> kmsKeySelfLink,
        @Nullable Output<String> mode,
        Output<String> source) {
        this.deviceName = deviceName;
        this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
        this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.mode = mode;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private InstanceFromTemplateAttachedDiskGetArgs() {
        this.deviceName = Output.empty();
        this.diskEncryptionKeyRaw = Output.empty();
        this.diskEncryptionKeySha256 = Output.empty();
        this.kmsKeySelfLink = Output.empty();
        this.mode = Output.empty();
        this.source = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateAttachedDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceName;
        private @Nullable Output<String> diskEncryptionKeyRaw;
        private @Nullable Output<String> diskEncryptionKeySha256;
        private @Nullable Output<String> kmsKeySelfLink;
        private @Nullable Output<String> mode;
        private Output<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateAttachedDiskGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeyRaw = defaults.diskEncryptionKeyRaw;
    	      this.diskEncryptionKeySha256 = defaults.diskEncryptionKeySha256;
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Output.ofNullable(deviceName);
            return this;
        }

        public Builder diskEncryptionKeyRaw(@Nullable Output<String> diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
            return this;
        }

        public Builder diskEncryptionKeyRaw(@Nullable String diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = Output.ofNullable(diskEncryptionKeyRaw);
            return this;
        }

        public Builder diskEncryptionKeySha256(@Nullable Output<String> diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
            return this;
        }

        public Builder diskEncryptionKeySha256(@Nullable String diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = Output.ofNullable(diskEncryptionKeySha256);
            return this;
        }

        public Builder kmsKeySelfLink(@Nullable Output<String> kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        public Builder kmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = Output.ofNullable(kmsKeySelfLink);
            return this;
        }

        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }

        public Builder source(Output<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(String source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public InstanceFromTemplateAttachedDiskGetArgs build() {
            return new InstanceFromTemplateAttachedDiskGetArgs(deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, kmsKeySelfLink, mode, source);
        }
    }
}
