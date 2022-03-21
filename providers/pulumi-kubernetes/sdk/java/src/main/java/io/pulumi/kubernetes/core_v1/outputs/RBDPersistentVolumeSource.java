// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.SecretReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RBDPersistentVolumeSource {
    /**
     * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     * 
     */
    private final @Nullable String fsType;
    /**
     * The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    private final String image;
    /**
     * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    private final @Nullable String keyring;
    /**
     * A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    private final List<String> monitors;
    /**
     * The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    private final @Nullable String pool;
    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    private final @Nullable SecretReference secretRef;
    /**
     * The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    private final @Nullable String user;

    @CustomType.Constructor
    private RBDPersistentVolumeSource(
        @CustomType.Parameter("fsType") @Nullable String fsType,
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("keyring") @Nullable String keyring,
        @CustomType.Parameter("monitors") List<String> monitors,
        @CustomType.Parameter("pool") @Nullable String pool,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("secretRef") @Nullable SecretReference secretRef,
        @CustomType.Parameter("user") @Nullable String user) {
        this.fsType = fsType;
        this.image = image;
        this.keyring = keyring;
        this.monitors = monitors;
        this.pool = pool;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.user = user;
    }

    /**
     * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     * 
    */
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
    */
    public String getImage() {
        return this.image;
    }
    /**
     * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
    */
    public Optional<String> getKeyring() {
        return Optional.ofNullable(this.keyring);
    }
    /**
     * A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
    */
    public List<String> getMonitors() {
        return this.monitors;
    }
    /**
     * The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
    */
    public Optional<String> getPool() {
        return Optional.ofNullable(this.pool);
    }
    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
    */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
    */
    public Optional<SecretReference> getSecretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    /**
     * The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
    */
    public Optional<String> getUser() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RBDPersistentVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private String image;
        private @Nullable String keyring;
        private List<String> monitors;
        private @Nullable String pool;
        private @Nullable Boolean readOnly;
        private @Nullable SecretReference secretRef;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(RBDPersistentVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.image = defaults.image;
    	      this.keyring = defaults.keyring;
    	      this.monitors = defaults.monitors;
    	      this.pool = defaults.pool;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.user = defaults.user;
        }

        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder keyring(@Nullable String keyring) {
            this.keyring = keyring;
            return this;
        }
        public Builder monitors(List<String> monitors) {
            this.monitors = Objects.requireNonNull(monitors);
            return this;
        }
        public Builder monitors(String... monitors) {
            return monitors(List.of(monitors));
        }
        public Builder pool(@Nullable String pool) {
            this.pool = pool;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder secretRef(@Nullable SecretReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }        public RBDPersistentVolumeSource build() {
            return new RBDPersistentVolumeSource(fsType, image, keyring, monitors, pool, readOnly, secretRef, user);
        }
    }
}
