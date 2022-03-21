// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.inputs;

import io.pulumi.azurenative.dbformysql.enums.InfrastructureEncryption;
import io.pulumi.azurenative.dbformysql.enums.MinimalTlsVersionEnum;
import io.pulumi.azurenative.dbformysql.enums.PublicNetworkAccessEnum;
import io.pulumi.azurenative.dbformysql.enums.ServerVersion;
import io.pulumi.azurenative.dbformysql.enums.SslEnforcementEnum;
import io.pulumi.azurenative.dbformysql.inputs.StorageProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties to create a new replica.
 * 
 */
public final class ServerPropertiesForReplicaArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerPropertiesForReplicaArgs Empty = new ServerPropertiesForReplicaArgs();

    /**
     * The mode to create a new server.
     * Expected value is 'Replica'.
     * 
     */
    @Import(name="createMode", required=true)
      private final Output<String> createMode;

    public Output<String> getCreateMode() {
        return this.createMode;
    }

    /**
     * Status showing whether the server enabled infrastructure encryption.
     * 
     */
    @Import(name="infrastructureEncryption")
      private final @Nullable Output<Either<String,InfrastructureEncryption>> infrastructureEncryption;

    public Output<Either<String,InfrastructureEncryption>> getInfrastructureEncryption() {
        return this.infrastructureEncryption == null ? Output.empty() : this.infrastructureEncryption;
    }

    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    @Import(name="minimalTlsVersion")
      private final @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;

    public Output<Either<String,MinimalTlsVersionEnum>> getMinimalTlsVersion() {
        return this.minimalTlsVersion == null ? Output.empty() : this.minimalTlsVersion;
    }

    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccessEnum>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Output.empty() : this.publicNetworkAccess;
    }

    /**
     * The master server id to create replica from.
     * 
     */
    @Import(name="sourceServerId", required=true)
      private final Output<String> sourceServerId;

    public Output<String> getSourceServerId() {
        return this.sourceServerId;
    }

    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @Import(name="sslEnforcement")
      private final @Nullable Output<SslEnforcementEnum> sslEnforcement;

    public Output<SslEnforcementEnum> getSslEnforcement() {
        return this.sslEnforcement == null ? Output.empty() : this.sslEnforcement;
    }

    /**
     * Storage profile of a server.
     * 
     */
    @Import(name="storageProfile")
      private final @Nullable Output<StorageProfileArgs> storageProfile;

    public Output<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile == null ? Output.empty() : this.storageProfile;
    }

    /**
     * Server version.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Either<String,ServerVersion>> version;

    public Output<Either<String,ServerVersion>> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ServerPropertiesForReplicaArgs(
        Output<String> createMode,
        @Nullable Output<Either<String,InfrastructureEncryption>> infrastructureEncryption,
        @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion,
        @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess,
        Output<String> sourceServerId,
        @Nullable Output<SslEnforcementEnum> sslEnforcement,
        @Nullable Output<StorageProfileArgs> storageProfile,
        @Nullable Output<Either<String,ServerVersion>> version) {
        this.createMode = Objects.requireNonNull(createMode, "expected parameter 'createMode' to be non-null");
        this.infrastructureEncryption = infrastructureEncryption;
        this.minimalTlsVersion = minimalTlsVersion;
        this.publicNetworkAccess = publicNetworkAccess;
        this.sourceServerId = Objects.requireNonNull(sourceServerId, "expected parameter 'sourceServerId' to be non-null");
        this.sslEnforcement = sslEnforcement;
        this.storageProfile = storageProfile;
        this.version = version;
    }

    private ServerPropertiesForReplicaArgs() {
        this.createMode = Output.empty();
        this.infrastructureEncryption = Output.empty();
        this.minimalTlsVersion = Output.empty();
        this.publicNetworkAccess = Output.empty();
        this.sourceServerId = Output.empty();
        this.sslEnforcement = Output.empty();
        this.storageProfile = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPropertiesForReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> createMode;
        private @Nullable Output<Either<String,InfrastructureEncryption>> infrastructureEncryption;
        private @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;
        private @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;
        private Output<String> sourceServerId;
        private @Nullable Output<SslEnforcementEnum> sslEnforcement;
        private @Nullable Output<StorageProfileArgs> storageProfile;
        private @Nullable Output<Either<String,ServerVersion>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPropertiesForReplicaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createMode = defaults.createMode;
    	      this.infrastructureEncryption = defaults.infrastructureEncryption;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.sourceServerId = defaults.sourceServerId;
    	      this.sslEnforcement = defaults.sslEnforcement;
    	      this.storageProfile = defaults.storageProfile;
    	      this.version = defaults.version;
        }

        public Builder createMode(Output<String> createMode) {
            this.createMode = Objects.requireNonNull(createMode);
            return this;
        }
        public Builder createMode(String createMode) {
            this.createMode = Output.of(Objects.requireNonNull(createMode));
            return this;
        }
        public Builder infrastructureEncryption(@Nullable Output<Either<String,InfrastructureEncryption>> infrastructureEncryption) {
            this.infrastructureEncryption = infrastructureEncryption;
            return this;
        }
        public Builder infrastructureEncryption(@Nullable Either<String,InfrastructureEncryption> infrastructureEncryption) {
            this.infrastructureEncryption = Output.ofNullable(infrastructureEncryption);
            return this;
        }
        public Builder minimalTlsVersion(@Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }
        public Builder minimalTlsVersion(@Nullable Either<String,MinimalTlsVersionEnum> minimalTlsVersion) {
            this.minimalTlsVersion = Output.ofNullable(minimalTlsVersion);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccessEnum> publicNetworkAccess) {
            this.publicNetworkAccess = Output.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder sourceServerId(Output<String> sourceServerId) {
            this.sourceServerId = Objects.requireNonNull(sourceServerId);
            return this;
        }
        public Builder sourceServerId(String sourceServerId) {
            this.sourceServerId = Output.of(Objects.requireNonNull(sourceServerId));
            return this;
        }
        public Builder sslEnforcement(@Nullable Output<SslEnforcementEnum> sslEnforcement) {
            this.sslEnforcement = sslEnforcement;
            return this;
        }
        public Builder sslEnforcement(@Nullable SslEnforcementEnum sslEnforcement) {
            this.sslEnforcement = Output.ofNullable(sslEnforcement);
            return this;
        }
        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }
        public Builder storageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Output.ofNullable(storageProfile);
            return this;
        }
        public Builder version(@Nullable Output<Either<String,ServerVersion>> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Either<String,ServerVersion> version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public ServerPropertiesForReplicaArgs build() {
            return new ServerPropertiesForReplicaArgs(createMode, infrastructureEncryption, minimalTlsVersion, publicNetworkAccess, sourceServerId, sslEnforcement, storageProfile, version);
        }
    }
}
