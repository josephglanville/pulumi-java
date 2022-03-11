// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationHlsEncryptionArgs;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationHlsManifestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) packaging configuration.
 * 
 */
public final class PackagingConfigurationHlsPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationHlsPackageArgs Empty = new PackagingConfigurationHlsPackageArgs();

    @InputImport(name="encryption")
      private final @Nullable Output<PackagingConfigurationHlsEncryptionArgs> encryption;

    public Output<PackagingConfigurationHlsEncryptionArgs> getEncryption() {
        return this.encryption == null ? Output.empty() : this.encryption;
    }

    /**
     * A list of HLS manifest configurations.
     * 
     */
    @InputImport(name="hlsManifests", required=true)
      private final Output<List<PackagingConfigurationHlsManifestArgs>> hlsManifests;

    public Output<List<PackagingConfigurationHlsManifestArgs>> getHlsManifests() {
        return this.hlsManifests;
    }

    @InputImport(name="segmentDurationSeconds")
      private final @Nullable Output<Integer> segmentDurationSeconds;

    public Output<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Output.empty() : this.segmentDurationSeconds;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     */
    @InputImport(name="useAudioRenditionGroup")
      private final @Nullable Output<Boolean> useAudioRenditionGroup;

    public Output<Boolean> getUseAudioRenditionGroup() {
        return this.useAudioRenditionGroup == null ? Output.empty() : this.useAudioRenditionGroup;
    }

    public PackagingConfigurationHlsPackageArgs(
        @Nullable Output<PackagingConfigurationHlsEncryptionArgs> encryption,
        Output<List<PackagingConfigurationHlsManifestArgs>> hlsManifests,
        @Nullable Output<Integer> segmentDurationSeconds,
        @Nullable Output<Boolean> useAudioRenditionGroup) {
        this.encryption = encryption;
        this.hlsManifests = Objects.requireNonNull(hlsManifests, "expected parameter 'hlsManifests' to be non-null");
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.useAudioRenditionGroup = useAudioRenditionGroup;
    }

    private PackagingConfigurationHlsPackageArgs() {
        this.encryption = Output.empty();
        this.hlsManifests = Output.empty();
        this.segmentDurationSeconds = Output.empty();
        this.useAudioRenditionGroup = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationHlsPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PackagingConfigurationHlsEncryptionArgs> encryption;
        private Output<List<PackagingConfigurationHlsManifestArgs>> hlsManifests;
        private @Nullable Output<Integer> segmentDurationSeconds;
        private @Nullable Output<Boolean> useAudioRenditionGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationHlsPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.hlsManifests = defaults.hlsManifests;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.useAudioRenditionGroup = defaults.useAudioRenditionGroup;
        }

        public Builder encryption(@Nullable Output<PackagingConfigurationHlsEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder encryption(@Nullable PackagingConfigurationHlsEncryptionArgs encryption) {
            this.encryption = Output.ofNullable(encryption);
            return this;
        }

        public Builder hlsManifests(Output<List<PackagingConfigurationHlsManifestArgs>> hlsManifests) {
            this.hlsManifests = Objects.requireNonNull(hlsManifests);
            return this;
        }

        public Builder hlsManifests(List<PackagingConfigurationHlsManifestArgs> hlsManifests) {
            this.hlsManifests = Output.of(Objects.requireNonNull(hlsManifests));
            return this;
        }

        public Builder segmentDurationSeconds(@Nullable Output<Integer> segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = Output.ofNullable(segmentDurationSeconds);
            return this;
        }

        public Builder useAudioRenditionGroup(@Nullable Output<Boolean> useAudioRenditionGroup) {
            this.useAudioRenditionGroup = useAudioRenditionGroup;
            return this;
        }

        public Builder useAudioRenditionGroup(@Nullable Boolean useAudioRenditionGroup) {
            this.useAudioRenditionGroup = Output.ofNullable(useAudioRenditionGroup);
            return this;
        }
        public PackagingConfigurationHlsPackageArgs build() {
            return new PackagingConfigurationHlsPackageArgs(encryption, hlsManifests, segmentDurationSeconds, useAudioRenditionGroup);
        }
    }
}
