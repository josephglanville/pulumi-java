// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceAttachedDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAttachedDiskArgs Empty = new InstanceAttachedDiskArgs();

    /**
     * Name with which the attached disk will be accessible
     * under `/dev/disk/by-id/google-*`
     * 
     */
    @InputImport(name="deviceName")
      private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * A 256-bit [customer-supplied encryption key]
     * (https://cloud.google.com/compute/docs/disks/customer-supplied-encryption),
     * encoded in [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * to encrypt this disk. Only one of `kms_key_self_link` and `disk_encryption_key_raw` may be set.
     * 
     */
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

    /**
     * The self_link of the encryption key that is
     * stored in Google Cloud KMS to encrypt this disk. Only one of `kms_key_self_link`
     * and `disk_encryption_key_raw` may be set.
     * 
     */
    @InputImport(name="kmsKeySelfLink")
      private final @Nullable Input<String> kmsKeySelfLink;

    public Input<String> getKmsKeySelfLink() {
        return this.kmsKeySelfLink == null ? Input.empty() : this.kmsKeySelfLink;
    }

    /**
     * Either "READ_ONLY" or "READ_WRITE", defaults to "READ_WRITE"
     * If you have a persistent disk with data that you want to share
     * between multiple instances, detach it from any read-write instances and
     * attach it to one or more instances in read-only mode.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The name or self_link of the disk to attach to this instance.
     * 
     */
    @InputImport(name="source", required=true)
      private final Input<String> source;

    public Input<String> getSource() {
        return this.source;
    }

    public InstanceAttachedDiskArgs(
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

    private InstanceAttachedDiskArgs() {
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

    public static Builder builder(InstanceAttachedDiskArgs defaults) {
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

        public Builder(InstanceAttachedDiskArgs defaults) {
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
        public InstanceAttachedDiskArgs build() {
            return new InstanceAttachedDiskArgs(deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, kmsKeySelfLink, mode, source);
        }
    }
}
