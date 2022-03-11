// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachesIscsiVolumeState extends io.pulumi.resources.ResourceArgs {

    public static final CachesIscsiVolumeState Empty = new CachesIscsiVolumeState();

    /**
     * Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Whether mutual CHAP is enabled for the iSCSI target.
     * 
     */
    @InputImport(name="chapEnabled")
      private final @Nullable Output<Boolean> chapEnabled;

    public Output<Boolean> getChapEnabled() {
        return this.chapEnabled == null ? Output.empty() : this.chapEnabled;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @InputImport(name="gatewayArn")
      private final @Nullable Output<String> gatewayArn;

    public Output<String> getGatewayArn() {
        return this.gatewayArn == null ? Output.empty() : this.gatewayArn;
    }

    /**
     * Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
     * 
     */
    @InputImport(name="kmsEncrypted")
      private final @Nullable Output<Boolean> kmsEncrypted;

    public Output<Boolean> getKmsEncrypted() {
        return this.kmsEncrypted == null ? Output.empty() : this.kmsEncrypted;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kms_encrypted` is set.
     * 
     */
    @InputImport(name="kmsKey")
      private final @Nullable Output<String> kmsKey;

    public Output<String> getKmsKey() {
        return this.kmsKey == null ? Output.empty() : this.kmsKey;
    }

    /**
     * Logical disk number.
     * 
     */
    @InputImport(name="lunNumber")
      private final @Nullable Output<Integer> lunNumber;

    public Output<Integer> getLunNumber() {
        return this.lunNumber == null ? Output.empty() : this.lunNumber;
    }

    /**
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     * 
     */
    @InputImport(name="networkInterfaceId")
      private final @Nullable Output<String> networkInterfaceId;

    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Output.empty() : this.networkInterfaceId;
    }

    /**
     * The port used to communicate with iSCSI targets.
     * 
     */
    @InputImport(name="networkInterfacePort")
      private final @Nullable Output<Integer> networkInterfacePort;

    public Output<Integer> getNetworkInterfacePort() {
        return this.networkInterfacePort == null ? Output.empty() : this.networkInterfacePort;
    }

    /**
     * The snapshot ID of the snapshot to restore as the new cached volumeE.g., `snap-1122aabb`.
     * 
     */
    @InputImport(name="snapshotId")
      private final @Nullable Output<String> snapshotId;

    public Output<String> getSnapshotId() {
        return this.snapshotId == null ? Output.empty() : this.snapshotId;
    }

    /**
     * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volume_size_in_bytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
     * 
     */
    @InputImport(name="sourceVolumeArn")
      private final @Nullable Output<String> sourceVolumeArn;

    public Output<String> getSourceVolumeArn() {
        return this.sourceVolumeArn == null ? Output.empty() : this.sourceVolumeArn;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Target Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
     * 
     */
    @InputImport(name="targetArn")
      private final @Nullable Output<String> targetArn;

    public Output<String> getTargetArn() {
        return this.targetArn == null ? Output.empty() : this.targetArn;
    }

    /**
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     * 
     */
    @InputImport(name="targetName")
      private final @Nullable Output<String> targetName;

    public Output<String> getTargetName() {
        return this.targetName == null ? Output.empty() : this.targetName;
    }

    /**
     * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    @InputImport(name="volumeArn")
      private final @Nullable Output<String> volumeArn;

    public Output<String> getVolumeArn() {
        return this.volumeArn == null ? Output.empty() : this.volumeArn;
    }

    /**
     * Volume ID, e.g. `vol-12345678`.
     * 
     */
    @InputImport(name="volumeId")
      private final @Nullable Output<String> volumeId;

    public Output<String> getVolumeId() {
        return this.volumeId == null ? Output.empty() : this.volumeId;
    }

    /**
     * The size of the volume in bytes.
     * 
     */
    @InputImport(name="volumeSizeInBytes")
      private final @Nullable Output<Integer> volumeSizeInBytes;

    public Output<Integer> getVolumeSizeInBytes() {
        return this.volumeSizeInBytes == null ? Output.empty() : this.volumeSizeInBytes;
    }

    public CachesIscsiVolumeState(
        @Nullable Output<String> arn,
        @Nullable Output<Boolean> chapEnabled,
        @Nullable Output<String> gatewayArn,
        @Nullable Output<Boolean> kmsEncrypted,
        @Nullable Output<String> kmsKey,
        @Nullable Output<Integer> lunNumber,
        @Nullable Output<String> networkInterfaceId,
        @Nullable Output<Integer> networkInterfacePort,
        @Nullable Output<String> snapshotId,
        @Nullable Output<String> sourceVolumeArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> targetArn,
        @Nullable Output<String> targetName,
        @Nullable Output<String> volumeArn,
        @Nullable Output<String> volumeId,
        @Nullable Output<Integer> volumeSizeInBytes) {
        this.arn = arn;
        this.chapEnabled = chapEnabled;
        this.gatewayArn = gatewayArn;
        this.kmsEncrypted = kmsEncrypted;
        this.kmsKey = kmsKey;
        this.lunNumber = lunNumber;
        this.networkInterfaceId = networkInterfaceId;
        this.networkInterfacePort = networkInterfacePort;
        this.snapshotId = snapshotId;
        this.sourceVolumeArn = sourceVolumeArn;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.targetArn = targetArn;
        this.targetName = targetName;
        this.volumeArn = volumeArn;
        this.volumeId = volumeId;
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    private CachesIscsiVolumeState() {
        this.arn = Output.empty();
        this.chapEnabled = Output.empty();
        this.gatewayArn = Output.empty();
        this.kmsEncrypted = Output.empty();
        this.kmsKey = Output.empty();
        this.lunNumber = Output.empty();
        this.networkInterfaceId = Output.empty();
        this.networkInterfacePort = Output.empty();
        this.snapshotId = Output.empty();
        this.sourceVolumeArn = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.targetArn = Output.empty();
        this.targetName = Output.empty();
        this.volumeArn = Output.empty();
        this.volumeId = Output.empty();
        this.volumeSizeInBytes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachesIscsiVolumeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Boolean> chapEnabled;
        private @Nullable Output<String> gatewayArn;
        private @Nullable Output<Boolean> kmsEncrypted;
        private @Nullable Output<String> kmsKey;
        private @Nullable Output<Integer> lunNumber;
        private @Nullable Output<String> networkInterfaceId;
        private @Nullable Output<Integer> networkInterfacePort;
        private @Nullable Output<String> snapshotId;
        private @Nullable Output<String> sourceVolumeArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> targetArn;
        private @Nullable Output<String> targetName;
        private @Nullable Output<String> volumeArn;
        private @Nullable Output<String> volumeId;
        private @Nullable Output<Integer> volumeSizeInBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(CachesIscsiVolumeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.chapEnabled = defaults.chapEnabled;
    	      this.gatewayArn = defaults.gatewayArn;
    	      this.kmsEncrypted = defaults.kmsEncrypted;
    	      this.kmsKey = defaults.kmsKey;
    	      this.lunNumber = defaults.lunNumber;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.networkInterfacePort = defaults.networkInterfacePort;
    	      this.snapshotId = defaults.snapshotId;
    	      this.sourceVolumeArn = defaults.sourceVolumeArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.targetArn = defaults.targetArn;
    	      this.targetName = defaults.targetName;
    	      this.volumeArn = defaults.volumeArn;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeSizeInBytes = defaults.volumeSizeInBytes;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder chapEnabled(@Nullable Output<Boolean> chapEnabled) {
            this.chapEnabled = chapEnabled;
            return this;
        }

        public Builder chapEnabled(@Nullable Boolean chapEnabled) {
            this.chapEnabled = Output.ofNullable(chapEnabled);
            return this;
        }

        public Builder gatewayArn(@Nullable Output<String> gatewayArn) {
            this.gatewayArn = gatewayArn;
            return this;
        }

        public Builder gatewayArn(@Nullable String gatewayArn) {
            this.gatewayArn = Output.ofNullable(gatewayArn);
            return this;
        }

        public Builder kmsEncrypted(@Nullable Output<Boolean> kmsEncrypted) {
            this.kmsEncrypted = kmsEncrypted;
            return this;
        }

        public Builder kmsEncrypted(@Nullable Boolean kmsEncrypted) {
            this.kmsEncrypted = Output.ofNullable(kmsEncrypted);
            return this;
        }

        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Output.ofNullable(kmsKey);
            return this;
        }

        public Builder lunNumber(@Nullable Output<Integer> lunNumber) {
            this.lunNumber = lunNumber;
            return this;
        }

        public Builder lunNumber(@Nullable Integer lunNumber) {
            this.lunNumber = Output.ofNullable(lunNumber);
            return this;
        }

        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Output.ofNullable(networkInterfaceId);
            return this;
        }

        public Builder networkInterfacePort(@Nullable Output<Integer> networkInterfacePort) {
            this.networkInterfacePort = networkInterfacePort;
            return this;
        }

        public Builder networkInterfacePort(@Nullable Integer networkInterfacePort) {
            this.networkInterfacePort = Output.ofNullable(networkInterfacePort);
            return this;
        }

        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = Output.ofNullable(snapshotId);
            return this;
        }

        public Builder sourceVolumeArn(@Nullable Output<String> sourceVolumeArn) {
            this.sourceVolumeArn = sourceVolumeArn;
            return this;
        }

        public Builder sourceVolumeArn(@Nullable String sourceVolumeArn) {
            this.sourceVolumeArn = Output.ofNullable(sourceVolumeArn);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder targetArn(@Nullable Output<String> targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = Output.ofNullable(targetArn);
            return this;
        }

        public Builder targetName(@Nullable Output<String> targetName) {
            this.targetName = targetName;
            return this;
        }

        public Builder targetName(@Nullable String targetName) {
            this.targetName = Output.ofNullable(targetName);
            return this;
        }

        public Builder volumeArn(@Nullable Output<String> volumeArn) {
            this.volumeArn = volumeArn;
            return this;
        }

        public Builder volumeArn(@Nullable String volumeArn) {
            this.volumeArn = Output.ofNullable(volumeArn);
            return this;
        }

        public Builder volumeId(@Nullable Output<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = Output.ofNullable(volumeId);
            return this;
        }

        public Builder volumeSizeInBytes(@Nullable Output<Integer> volumeSizeInBytes) {
            this.volumeSizeInBytes = volumeSizeInBytes;
            return this;
        }

        public Builder volumeSizeInBytes(@Nullable Integer volumeSizeInBytes) {
            this.volumeSizeInBytes = Output.ofNullable(volumeSizeInBytes);
            return this;
        }
        public CachesIscsiVolumeState build() {
            return new CachesIscsiVolumeState(arn, chapEnabled, gatewayArn, kmsEncrypted, kmsKey, lunNumber, networkInterfaceId, networkInterfacePort, snapshotId, sourceVolumeArn, tags, tagsAll, targetArn, targetName, volumeArn, volumeId, volumeSizeInBytes);
        }
    }
}
