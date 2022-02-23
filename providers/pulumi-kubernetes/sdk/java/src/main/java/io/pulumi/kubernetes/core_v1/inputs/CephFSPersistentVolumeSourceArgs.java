// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.SecretReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
public final class CephFSPersistentVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CephFSPersistentVolumeSourceArgs Empty = new CephFSPersistentVolumeSourceArgs();

    /**
     * Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @InputImport(name="monitors", required=true)
      private final Input<List<String>> monitors;

    public Input<List<String>> getMonitors() {
        return this.monitors;
    }

    /**
     * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @InputImport(name="readOnly")
      private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    /**
     * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @InputImport(name="secretFile")
      private final @Nullable Input<String> secretFile;

    public Input<String> getSecretFile() {
        return this.secretFile == null ? Input.empty() : this.secretFile;
    }

    /**
     * Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @InputImport(name="secretRef")
      private final @Nullable Input<SecretReferenceArgs> secretRef;

    public Input<SecretReferenceArgs> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    /**
     * Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @InputImport(name="user")
      private final @Nullable Input<String> user;

    public Input<String> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    public CephFSPersistentVolumeSourceArgs(
        Input<List<String>> monitors,
        @Nullable Input<String> path,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<String> secretFile,
        @Nullable Input<SecretReferenceArgs> secretRef,
        @Nullable Input<String> user) {
        this.monitors = Objects.requireNonNull(monitors, "expected parameter 'monitors' to be non-null");
        this.path = path;
        this.readOnly = readOnly;
        this.secretFile = secretFile;
        this.secretRef = secretRef;
        this.user = user;
    }

    private CephFSPersistentVolumeSourceArgs() {
        this.monitors = Input.empty();
        this.path = Input.empty();
        this.readOnly = Input.empty();
        this.secretFile = Input.empty();
        this.secretRef = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CephFSPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> monitors;
        private @Nullable Input<String> path;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<String> secretFile;
        private @Nullable Input<SecretReferenceArgs> secretRef;
        private @Nullable Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(CephFSPersistentVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitors = defaults.monitors;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.secretFile = defaults.secretFile;
    	      this.secretRef = defaults.secretRef;
    	      this.user = defaults.user;
        }

        public Builder setMonitors(Input<List<String>> monitors) {
            this.monitors = Objects.requireNonNull(monitors);
            return this;
        }

        public Builder setMonitors(List<String> monitors) {
            this.monitors = Input.of(Objects.requireNonNull(monitors));
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder setSecretFile(@Nullable Input<String> secretFile) {
            this.secretFile = secretFile;
            return this;
        }

        public Builder setSecretFile(@Nullable String secretFile) {
            this.secretFile = Input.ofNullable(secretFile);
            return this;
        }

        public Builder setSecretRef(@Nullable Input<SecretReferenceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setSecretRef(@Nullable SecretReferenceArgs secretRef) {
            this.secretRef = Input.ofNullable(secretRef);
            return this;
        }

        public Builder setUser(@Nullable Input<String> user) {
            this.user = user;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = Input.ofNullable(user);
            return this;
        }
        public CephFSPersistentVolumeSourceArgs build() {
            return new CephFSPersistentVolumeSourceArgs(monitors, path, readOnly, secretFile, secretRef, user);
        }
    }
}
