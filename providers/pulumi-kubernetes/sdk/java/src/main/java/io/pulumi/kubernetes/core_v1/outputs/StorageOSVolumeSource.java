// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.LocalObjectReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageOSVolumeSource {
    private final @Nullable String fsType;
    private final @Nullable Boolean readOnly;
    private final @Nullable LocalObjectReference secretRef;
    private final @Nullable String volumeName;
    private final @Nullable String volumeNamespace;

    @OutputCustomType.Constructor({"fsType","readOnly","secretRef","volumeName","volumeNamespace"})
    private StorageOSVolumeSource(
        @Nullable String fsType,
        @Nullable Boolean readOnly,
        @Nullable LocalObjectReference secretRef,
        @Nullable String volumeName,
        @Nullable String volumeNamespace) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeName = volumeName;
        this.volumeNamespace = volumeNamespace;
    }

    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public Optional<LocalObjectReference> getSecretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    public Optional<String> getVolumeName() {
        return Optional.ofNullable(this.volumeName);
    }
    public Optional<String> getVolumeNamespace() {
        return Optional.ofNullable(this.volumeNamespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageOSVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable Boolean readOnly;
        private @Nullable LocalObjectReference secretRef;
        private @Nullable String volumeName;
        private @Nullable String volumeNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageOSVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeName = defaults.volumeName;
    	      this.volumeNamespace = defaults.volumeNamespace;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSecretRef(@Nullable LocalObjectReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setVolumeName(@Nullable String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public Builder setVolumeNamespace(@Nullable String volumeNamespace) {
            this.volumeNamespace = volumeNamespace;
            return this;
        }

        public StorageOSVolumeSource build() {
            return new StorageOSVolumeSource(fsType, readOnly, secretRef, volumeName, volumeNamespace);
        }
    }
}