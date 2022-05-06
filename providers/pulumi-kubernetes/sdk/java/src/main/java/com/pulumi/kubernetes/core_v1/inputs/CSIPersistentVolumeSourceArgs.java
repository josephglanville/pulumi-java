// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.SecretReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents storage that is managed by an external CSI volume driver (Beta feature)
 * 
 */
public final class CSIPersistentVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CSIPersistentVolumeSourceArgs Empty = new CSIPersistentVolumeSourceArgs();

    /**
     * controllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    @Import(name="controllerExpandSecretRef")
    private @Nullable Output<SecretReferenceArgs> controllerExpandSecretRef;

    /**
     * @return controllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    public Optional<Output<SecretReferenceArgs>> controllerExpandSecretRef() {
        return Optional.ofNullable(this.controllerExpandSecretRef);
    }

    /**
     * controllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    @Import(name="controllerPublishSecretRef")
    private @Nullable Output<SecretReferenceArgs> controllerPublishSecretRef;

    /**
     * @return controllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    public Optional<Output<SecretReferenceArgs>> controllerPublishSecretRef() {
        return Optional.ofNullable(this.controllerPublishSecretRef);
    }

    /**
     * driver is the name of the driver to use for this volume. Required.
     * 
     */
    @Import(name="driver", required=true)
    private Output<String> driver;

    /**
     * @return driver is the name of the driver to use for this volume. Required.
     * 
     */
    public Output<String> driver() {
        return this.driver;
    }

    /**
     * fsType to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;.
     * 
     */
    @Import(name="fsType")
    private @Nullable Output<String> fsType;

    /**
     * @return fsType to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;.
     * 
     */
    public Optional<Output<String>> fsType() {
        return Optional.ofNullable(this.fsType);
    }

    /**
     * nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    @Import(name="nodePublishSecretRef")
    private @Nullable Output<SecretReferenceArgs> nodePublishSecretRef;

    /**
     * @return nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    public Optional<Output<SecretReferenceArgs>> nodePublishSecretRef() {
        return Optional.ofNullable(this.nodePublishSecretRef);
    }

    /**
     * nodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    @Import(name="nodeStageSecretRef")
    private @Nullable Output<SecretReferenceArgs> nodeStageSecretRef;

    /**
     * @return nodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    public Optional<Output<SecretReferenceArgs>> nodeStageSecretRef() {
        return Optional.ofNullable(this.nodeStageSecretRef);
    }

    /**
     * readOnly value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return readOnly value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * volumeAttributes of the volume to publish.
     * 
     */
    @Import(name="volumeAttributes")
    private @Nullable Output<Map<String,String>> volumeAttributes;

    /**
     * @return volumeAttributes of the volume to publish.
     * 
     */
    public Optional<Output<Map<String,String>>> volumeAttributes() {
        return Optional.ofNullable(this.volumeAttributes);
    }

    /**
     * volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
     * 
     */
    @Import(name="volumeHandle", required=true)
    private Output<String> volumeHandle;

    /**
     * @return volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
     * 
     */
    public Output<String> volumeHandle() {
        return this.volumeHandle;
    }

    private CSIPersistentVolumeSourceArgs() {}

    private CSIPersistentVolumeSourceArgs(CSIPersistentVolumeSourceArgs $) {
        this.controllerExpandSecretRef = $.controllerExpandSecretRef;
        this.controllerPublishSecretRef = $.controllerPublishSecretRef;
        this.driver = $.driver;
        this.fsType = $.fsType;
        this.nodePublishSecretRef = $.nodePublishSecretRef;
        this.nodeStageSecretRef = $.nodeStageSecretRef;
        this.readOnly = $.readOnly;
        this.volumeAttributes = $.volumeAttributes;
        this.volumeHandle = $.volumeHandle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CSIPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CSIPersistentVolumeSourceArgs $;

        public Builder() {
            $ = new CSIPersistentVolumeSourceArgs();
        }

        public Builder(CSIPersistentVolumeSourceArgs defaults) {
            $ = new CSIPersistentVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param controllerExpandSecretRef controllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * 
         * @return builder
         * 
         */
        public Builder controllerExpandSecretRef(@Nullable Output<SecretReferenceArgs> controllerExpandSecretRef) {
            $.controllerExpandSecretRef = controllerExpandSecretRef;
            return this;
        }

        /**
         * @param controllerExpandSecretRef controllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * 
         * @return builder
         * 
         */
        public Builder controllerExpandSecretRef(SecretReferenceArgs controllerExpandSecretRef) {
            return controllerExpandSecretRef(Output.of(controllerExpandSecretRef));
        }

        /**
         * @param controllerPublishSecretRef controllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * 
         * @return builder
         * 
         */
        public Builder controllerPublishSecretRef(@Nullable Output<SecretReferenceArgs> controllerPublishSecretRef) {
            $.controllerPublishSecretRef = controllerPublishSecretRef;
            return this;
        }

        /**
         * @param controllerPublishSecretRef controllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * 
         * @return builder
         * 
         */
        public Builder controllerPublishSecretRef(SecretReferenceArgs controllerPublishSecretRef) {
            return controllerPublishSecretRef(Output.of(controllerPublishSecretRef));
        }

        /**
         * @param driver driver is the name of the driver to use for this volume. Required.
         * 
         * @return builder
         * 
         */
        public Builder driver(Output<String> driver) {
            $.driver = driver;
            return this;
        }

        /**
         * @param driver driver is the name of the driver to use for this volume. Required.
         * 
         * @return builder
         * 
         */
        public Builder driver(String driver) {
            return driver(Output.of(driver));
        }

        /**
         * @param fsType fsType to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;.
         * 
         * @return builder
         * 
         */
        public Builder fsType(@Nullable Output<String> fsType) {
            $.fsType = fsType;
            return this;
        }

        /**
         * @param fsType fsType to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;.
         * 
         * @return builder
         * 
         */
        public Builder fsType(String fsType) {
            return fsType(Output.of(fsType));
        }

        /**
         * @param nodePublishSecretRef nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * 
         * @return builder
         * 
         */
        public Builder nodePublishSecretRef(@Nullable Output<SecretReferenceArgs> nodePublishSecretRef) {
            $.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }

        /**
         * @param nodePublishSecretRef nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * 
         * @return builder
         * 
         */
        public Builder nodePublishSecretRef(SecretReferenceArgs nodePublishSecretRef) {
            return nodePublishSecretRef(Output.of(nodePublishSecretRef));
        }

        /**
         * @param nodeStageSecretRef nodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * 
         * @return builder
         * 
         */
        public Builder nodeStageSecretRef(@Nullable Output<SecretReferenceArgs> nodeStageSecretRef) {
            $.nodeStageSecretRef = nodeStageSecretRef;
            return this;
        }

        /**
         * @param nodeStageSecretRef nodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * 
         * @return builder
         * 
         */
        public Builder nodeStageSecretRef(SecretReferenceArgs nodeStageSecretRef) {
            return nodeStageSecretRef(Output.of(nodeStageSecretRef));
        }

        /**
         * @param readOnly readOnly value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly readOnly value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param volumeAttributes volumeAttributes of the volume to publish.
         * 
         * @return builder
         * 
         */
        public Builder volumeAttributes(@Nullable Output<Map<String,String>> volumeAttributes) {
            $.volumeAttributes = volumeAttributes;
            return this;
        }

        /**
         * @param volumeAttributes volumeAttributes of the volume to publish.
         * 
         * @return builder
         * 
         */
        public Builder volumeAttributes(Map<String,String> volumeAttributes) {
            return volumeAttributes(Output.of(volumeAttributes));
        }

        /**
         * @param volumeHandle volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
         * 
         * @return builder
         * 
         */
        public Builder volumeHandle(Output<String> volumeHandle) {
            $.volumeHandle = volumeHandle;
            return this;
        }

        /**
         * @param volumeHandle volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
         * 
         * @return builder
         * 
         */
        public Builder volumeHandle(String volumeHandle) {
            return volumeHandle(Output.of(volumeHandle));
        }

        public CSIPersistentVolumeSourceArgs build() {
            $.driver = Objects.requireNonNull($.driver, "expected parameter 'driver' to be non-null");
            $.volumeHandle = Objects.requireNonNull($.volumeHandle, "expected parameter 'volumeHandle' to be non-null");
            return $;
        }
    }

}
