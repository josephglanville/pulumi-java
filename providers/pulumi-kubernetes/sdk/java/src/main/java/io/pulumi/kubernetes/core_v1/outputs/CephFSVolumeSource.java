// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.LocalObjectReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CephFSVolumeSource {
    /**
     * Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private final List<String> monitors;
    /**
     * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    private final @Nullable String path;
    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private final @Nullable String secretFile;
    /**
     * Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private final @Nullable LocalObjectReference secretRef;
    /**
     * Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private final @Nullable String user;

    @CustomType.Constructor
    private CephFSVolumeSource(
        @CustomType.Parameter("monitors") List<String> monitors,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("secretFile") @Nullable String secretFile,
        @CustomType.Parameter("secretRef") @Nullable LocalObjectReference secretRef,
        @CustomType.Parameter("user") @Nullable String user) {
        this.monitors = monitors;
        this.path = path;
        this.readOnly = readOnly;
        this.secretFile = secretFile;
        this.secretRef = secretRef;
        this.user = user;
    }

    /**
     * Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
    */
    public List<String> getMonitors() {
        return this.monitors;
    }
    /**
     * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
    */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
    */
    public Optional<String> getSecretFile() {
        return Optional.ofNullable(this.secretFile);
    }
    /**
     * Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
    */
    public Optional<LocalObjectReference> getSecretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    /**
     * Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
    */
    public Optional<String> getUser() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CephFSVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> monitors;
        private @Nullable String path;
        private @Nullable Boolean readOnly;
        private @Nullable String secretFile;
        private @Nullable LocalObjectReference secretRef;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(CephFSVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitors = defaults.monitors;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.secretFile = defaults.secretFile;
    	      this.secretRef = defaults.secretRef;
    	      this.user = defaults.user;
        }

        public Builder monitors(List<String> monitors) {
            this.monitors = Objects.requireNonNull(monitors);
            return this;
        }
        public Builder monitors(String... monitors) {
            return monitors(List.of(monitors));
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder secretFile(@Nullable String secretFile) {
            this.secretFile = secretFile;
            return this;
        }
        public Builder secretRef(@Nullable LocalObjectReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }        public CephFSVolumeSource build() {
            return new CephFSVolumeSource(monitors, path, readOnly, secretFile, secretRef, user);
        }
    }
}
