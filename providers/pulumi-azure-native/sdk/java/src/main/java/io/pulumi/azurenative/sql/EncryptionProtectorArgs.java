// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.ServerKeyType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionProtectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionProtectorArgs Empty = new EncryptionProtectorArgs();

    /**
     * Key auto rotation opt-in flag. Either true or false.
     * 
     */
    @Import(name="autoRotationEnabled")
      private final @Nullable Output<Boolean> autoRotationEnabled;

    public Output<Boolean> getAutoRotationEnabled() {
        return this.autoRotationEnabled == null ? Codegen.empty() : this.autoRotationEnabled;
    }

    /**
     * The name of the encryption protector to be updated.
     * 
     */
    @Import(name="encryptionProtectorName")
      private final @Nullable Output<String> encryptionProtectorName;

    public Output<String> getEncryptionProtectorName() {
        return this.encryptionProtectorName == null ? Codegen.empty() : this.encryptionProtectorName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server key.
     * 
     */
    @Import(name="serverKeyName")
      private final @Nullable Output<String> serverKeyName;

    public Output<String> getServerKeyName() {
        return this.serverKeyName == null ? Codegen.empty() : this.serverKeyName;
    }

    /**
     * The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     * 
     */
    @Import(name="serverKeyType", required=true)
      private final Output<Either<String,ServerKeyType>> serverKeyType;

    public Output<Either<String,ServerKeyType>> getServerKeyType() {
        return this.serverKeyType;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    public EncryptionProtectorArgs(
        @Nullable Output<Boolean> autoRotationEnabled,
        @Nullable Output<String> encryptionProtectorName,
        Output<String> resourceGroupName,
        @Nullable Output<String> serverKeyName,
        Output<Either<String,ServerKeyType>> serverKeyType,
        Output<String> serverName) {
        this.autoRotationEnabled = autoRotationEnabled;
        this.encryptionProtectorName = encryptionProtectorName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverKeyName = serverKeyName;
        this.serverKeyType = Objects.requireNonNull(serverKeyType, "expected parameter 'serverKeyType' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private EncryptionProtectorArgs() {
        this.autoRotationEnabled = Codegen.empty();
        this.encryptionProtectorName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serverKeyName = Codegen.empty();
        this.serverKeyType = Codegen.empty();
        this.serverName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionProtectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoRotationEnabled;
        private @Nullable Output<String> encryptionProtectorName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> serverKeyName;
        private Output<Either<String,ServerKeyType>> serverKeyType;
        private Output<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionProtectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRotationEnabled = defaults.autoRotationEnabled;
    	      this.encryptionProtectorName = defaults.encryptionProtectorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverKeyName = defaults.serverKeyName;
    	      this.serverKeyType = defaults.serverKeyType;
    	      this.serverName = defaults.serverName;
        }

        public Builder autoRotationEnabled(@Nullable Output<Boolean> autoRotationEnabled) {
            this.autoRotationEnabled = autoRotationEnabled;
            return this;
        }
        public Builder autoRotationEnabled(@Nullable Boolean autoRotationEnabled) {
            this.autoRotationEnabled = Codegen.ofNullable(autoRotationEnabled);
            return this;
        }
        public Builder encryptionProtectorName(@Nullable Output<String> encryptionProtectorName) {
            this.encryptionProtectorName = encryptionProtectorName;
            return this;
        }
        public Builder encryptionProtectorName(@Nullable String encryptionProtectorName) {
            this.encryptionProtectorName = Codegen.ofNullable(encryptionProtectorName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serverKeyName(@Nullable Output<String> serverKeyName) {
            this.serverKeyName = serverKeyName;
            return this;
        }
        public Builder serverKeyName(@Nullable String serverKeyName) {
            this.serverKeyName = Codegen.ofNullable(serverKeyName);
            return this;
        }
        public Builder serverKeyType(Output<Either<String,ServerKeyType>> serverKeyType) {
            this.serverKeyType = Objects.requireNonNull(serverKeyType);
            return this;
        }
        public Builder serverKeyType(Either<String,ServerKeyType> serverKeyType) {
            this.serverKeyType = Output.of(Objects.requireNonNull(serverKeyType));
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }        public EncryptionProtectorArgs build() {
            return new EncryptionProtectorArgs(autoRotationEnabled, encryptionProtectorName, resourceGroupName, serverKeyName, serverKeyType, serverName);
        }
    }
}
