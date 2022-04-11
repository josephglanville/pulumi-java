// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.RoleStatus;
import io.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MECRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final MECRoleArgs Empty = new MECRoleArgs();

    /**
     * Activation key of the MEC.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable Output<AsymmetricEncryptedSecretArgs> connectionString;

    public Output<AsymmetricEncryptedSecretArgs> getConnectionString() {
        return this.connectionString == null ? Codegen.empty() : this.connectionString;
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Role type.
     * Expected value is 'MEC'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The role name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Role status.
     * 
     */
    @Import(name="roleStatus", required=true)
      private final Output<Either<String,RoleStatus>> roleStatus;

    public Output<Either<String,RoleStatus>> getRoleStatus() {
        return this.roleStatus;
    }

    public MECRoleArgs(
        @Nullable Output<AsymmetricEncryptedSecretArgs> connectionString,
        Output<String> deviceName,
        Output<String> kind,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        Output<Either<String,RoleStatus>> roleStatus) {
        this.connectionString = connectionString;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roleStatus = Objects.requireNonNull(roleStatus, "expected parameter 'roleStatus' to be non-null");
    }

    private MECRoleArgs() {
        this.connectionString = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.roleStatus = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MECRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AsymmetricEncryptedSecretArgs> connectionString;
        private Output<String> deviceName;
        private Output<String> kind;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private Output<Either<String,RoleStatus>> roleStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(MECRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.deviceName = defaults.deviceName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleStatus = defaults.roleStatus;
        }

        public Builder connectionString(@Nullable Output<AsymmetricEncryptedSecretArgs> connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder connectionString(@Nullable AsymmetricEncryptedSecretArgs connectionString) {
            this.connectionString = Codegen.ofNullable(connectionString);
            return this;
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder roleStatus(Output<Either<String,RoleStatus>> roleStatus) {
            this.roleStatus = Objects.requireNonNull(roleStatus);
            return this;
        }
        public Builder roleStatus(Either<String,RoleStatus> roleStatus) {
            this.roleStatus = Output.of(Objects.requireNonNull(roleStatus));
            return this;
        }        public MECRoleArgs build() {
            return new MECRoleArgs(connectionString, deviceName, kind, name, resourceGroupName, roleStatus);
        }
    }
}
