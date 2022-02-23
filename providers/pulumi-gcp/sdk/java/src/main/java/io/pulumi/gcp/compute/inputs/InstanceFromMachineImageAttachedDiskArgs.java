// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageAttachedDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageAttachedDiskArgs Empty = new InstanceFromMachineImageAttachedDiskArgs();

    @InputImport(name="deviceName")
      private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    @InputImport(name="diskEncryptionKeyRaw")
      private final @Nullable Input<String> diskEncryptionKeyRaw;

    public Input<String> getDiskEncryptionKeyRaw() {
        return this.diskEncryptionKeyRaw == null ? Input.empty() : this.diskEncryptionKeyRaw;
    }

    @InputImport(name="diskEncryptionKeySha256")
      private final @Nullable Input<String> diskEncryptionKeySha256;

    public Input<String> getDiskEncryptionKeySha256() {
        return this.diskEncryptionKeySha256 == null ? Input.empty() : this.diskEncryptionKeySha256;
    }

    @InputImport(name="kmsKeySelfLink")
      private final @Nullable Input<String> kmsKeySelfLink;

    public Input<String> getKmsKeySelfLink() {
        return this.kmsKeySelfLink == null ? Input.empty() : this.kmsKeySelfLink;
    }

    @InputImport(name="mode")
      private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    @InputImport(name="source", required=true)
      private final Input<String> source;

    public Input<String> getSource() {
        return this.source;
    }

    public InstanceFromMachineImageAttachedDiskArgs(
        @Nullable Input<String> deviceName,
        @Nullable Input<String> diskEncryptionKeyRaw,
        @Nullable Input<String> diskEncryptionKeySha256,
        @Nullable Input<String> kmsKeySelfLink,
        @Nullable Input<String> mode,
        Input<String> source) {
        this.deviceName = deviceName;
        this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
        this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.mode = mode;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private InstanceFromMachineImageAttachedDiskArgs() {
        this.deviceName = Input.empty();
        this.diskEncryptionKeyRaw = Input.empty();
        this.diskEncryptionKeySha256 = Input.empty();
        this.kmsKeySelfLink = Input.empty();
        this.mode = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageAttachedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deviceName;
        private @Nullable Input<String> diskEncryptionKeyRaw;
        private @Nullable Input<String> diskEncryptionKeySha256;
        private @Nullable Input<String> kmsKeySelfLink;
        private @Nullable Input<String> mode;
        private Input<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageAttachedDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeyRaw = defaults.diskEncryptionKeyRaw;
    	      this.diskEncryptionKeySha256 = defaults.diskEncryptionKeySha256;
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setDiskEncryptionKeyRaw(@Nullable Input<String> diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
            return this;
        }

        public Builder setDiskEncryptionKeyRaw(@Nullable String diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = Input.ofNullable(diskEncryptionKeyRaw);
            return this;
        }

        public Builder setDiskEncryptionKeySha256(@Nullable Input<String> diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
            return this;
        }

        public Builder setDiskEncryptionKeySha256(@Nullable String diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = Input.ofNullable(diskEncryptionKeySha256);
            return this;
        }

        public Builder setKmsKeySelfLink(@Nullable Input<String> kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        public Builder setKmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = Input.ofNullable(kmsKeySelfLink);
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setSource(Input<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }
        public InstanceFromMachineImageAttachedDiskArgs build() {
            return new InstanceFromMachineImageAttachedDiskArgs(deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, kmsKeySelfLink, mode, source);
        }
    }
}
