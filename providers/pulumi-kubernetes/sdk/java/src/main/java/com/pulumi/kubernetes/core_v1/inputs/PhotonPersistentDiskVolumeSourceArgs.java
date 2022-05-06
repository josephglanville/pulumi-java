// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a Photon Controller persistent disk resource.
 * 
 */
public final class PhotonPersistentDiskVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PhotonPersistentDiskVolumeSourceArgs Empty = new PhotonPersistentDiskVolumeSourceArgs();

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    @Import(name="fsType")
    private @Nullable Output<String> fsType;

    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    public Optional<Output<String>> fsType() {
        return Optional.ofNullable(this.fsType);
    }

    /**
     * pdID is the ID that identifies Photon Controller persistent disk
     * 
     */
    @Import(name="pdID", required=true)
    private Output<String> pdID;

    /**
     * @return pdID is the ID that identifies Photon Controller persistent disk
     * 
     */
    public Output<String> pdID() {
        return this.pdID;
    }

    private PhotonPersistentDiskVolumeSourceArgs() {}

    private PhotonPersistentDiskVolumeSourceArgs(PhotonPersistentDiskVolumeSourceArgs $) {
        this.fsType = $.fsType;
        this.pdID = $.pdID;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PhotonPersistentDiskVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PhotonPersistentDiskVolumeSourceArgs $;

        public Builder() {
            $ = new PhotonPersistentDiskVolumeSourceArgs();
        }

        public Builder(PhotonPersistentDiskVolumeSourceArgs defaults) {
            $ = new PhotonPersistentDiskVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fsType fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder fsType(@Nullable Output<String> fsType) {
            $.fsType = fsType;
            return this;
        }

        /**
         * @param fsType fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder fsType(String fsType) {
            return fsType(Output.of(fsType));
        }

        /**
         * @param pdID pdID is the ID that identifies Photon Controller persistent disk
         * 
         * @return builder
         * 
         */
        public Builder pdID(Output<String> pdID) {
            $.pdID = pdID;
            return this;
        }

        /**
         * @param pdID pdID is the ID that identifies Photon Controller persistent disk
         * 
         * @return builder
         * 
         */
        public Builder pdID(String pdID) {
            return pdID(Output.of(pdID));
        }

        public PhotonPersistentDiskVolumeSourceArgs build() {
            $.pdID = Objects.requireNonNull($.pdID, "expected parameter 'pdID' to be non-null");
            return $;
        }
    }

}
