// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.SecretReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScaleIOPersistentVolumeSource {
    private final @Nullable String fsType;
    private final String gateway;
    private final @Nullable String protectionDomain;
    private final @Nullable Boolean readOnly;
    private final SecretReference secretRef;
    private final @Nullable Boolean sslEnabled;
    private final @Nullable String storageMode;
    private final @Nullable String storagePool;
    private final String system;
    private final @Nullable String volumeName;

    @OutputCustomType.Constructor({"fsType","gateway","protectionDomain","readOnly","secretRef","sslEnabled","storageMode","storagePool","system","volumeName"})
    private ScaleIOPersistentVolumeSource(
        @Nullable String fsType,
        String gateway,
        @Nullable String protectionDomain,
        @Nullable Boolean readOnly,
        SecretReference secretRef,
        @Nullable Boolean sslEnabled,
        @Nullable String storageMode,
        @Nullable String storagePool,
        String system,
        @Nullable String volumeName) {
        this.fsType = fsType;
        this.gateway = Objects.requireNonNull(gateway);
        this.protectionDomain = protectionDomain;
        this.readOnly = readOnly;
        this.secretRef = Objects.requireNonNull(secretRef);
        this.sslEnabled = sslEnabled;
        this.storageMode = storageMode;
        this.storagePool = storagePool;
        this.system = Objects.requireNonNull(system);
        this.volumeName = volumeName;
    }

    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    public String getGateway() {
        return this.gateway;
    }
    public Optional<String> getProtectionDomain() {
        return Optional.ofNullable(this.protectionDomain);
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public SecretReference getSecretRef() {
        return this.secretRef;
    }
    public Optional<Boolean> getSslEnabled() {
        return Optional.ofNullable(this.sslEnabled);
    }
    public Optional<String> getStorageMode() {
        return Optional.ofNullable(this.storageMode);
    }
    public Optional<String> getStoragePool() {
        return Optional.ofNullable(this.storagePool);
    }
    public String getSystem() {
        return this.system;
    }
    public Optional<String> getVolumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleIOPersistentVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private String gateway;
        private @Nullable String protectionDomain;
        private @Nullable Boolean readOnly;
        private SecretReference secretRef;
        private @Nullable Boolean sslEnabled;
        private @Nullable String storageMode;
        private @Nullable String storagePool;
        private String system;
        private @Nullable String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleIOPersistentVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.gateway = defaults.gateway;
    	      this.protectionDomain = defaults.protectionDomain;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.sslEnabled = defaults.sslEnabled;
    	      this.storageMode = defaults.storageMode;
    	      this.storagePool = defaults.storagePool;
    	      this.system = defaults.system;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setGateway(String gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }

        public Builder setProtectionDomain(@Nullable String protectionDomain) {
            this.protectionDomain = protectionDomain;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSecretRef(SecretReference secretRef) {
            this.secretRef = Objects.requireNonNull(secretRef);
            return this;
        }

        public Builder setSslEnabled(@Nullable Boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }

        public Builder setStorageMode(@Nullable String storageMode) {
            this.storageMode = storageMode;
            return this;
        }

        public Builder setStoragePool(@Nullable String storagePool) {
            this.storagePool = storagePool;
            return this;
        }

        public Builder setSystem(String system) {
            this.system = Objects.requireNonNull(system);
            return this;
        }

        public Builder setVolumeName(@Nullable String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public ScaleIOPersistentVolumeSource build() {
            return new ScaleIOPersistentVolumeSource(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
        }
    }
}
