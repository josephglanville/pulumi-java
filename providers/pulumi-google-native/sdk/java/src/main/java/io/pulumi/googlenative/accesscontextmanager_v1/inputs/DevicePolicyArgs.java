// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.accesscontextmanager_v1.enums.DevicePolicyAllowedDeviceManagementLevelsItem;
import io.pulumi.googlenative.accesscontextmanager_v1.enums.DevicePolicyAllowedEncryptionStatusesItem;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.OsConstraintArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `DevicePolicy` specifies device specific restrictions necessary to acquire a given access level. A `DevicePolicy` specifies requirements for requests from devices to be granted access levels, it does not do any enforcement on the device. `DevicePolicy` acts as an AND over all specified fields, and each repeated field is an OR over its elements. Any unset fields are ignored. For example, if the proto is { os_type : DESKTOP_WINDOWS, os_type : DESKTOP_LINUX, encryption_status: ENCRYPTED}, then the DevicePolicy will be true for requests originating from encrypted Linux desktops and encrypted Windows desktops.
 * 
 */
public final class DevicePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DevicePolicyArgs Empty = new DevicePolicyArgs();

    /**
     * Allowed device management levels, an empty list allows all management levels.
     * 
     */
    @Import(name="allowedDeviceManagementLevels")
      private final @Nullable Output<List<DevicePolicyAllowedDeviceManagementLevelsItem>> allowedDeviceManagementLevels;

    public Output<List<DevicePolicyAllowedDeviceManagementLevelsItem>> getAllowedDeviceManagementLevels() {
        return this.allowedDeviceManagementLevels == null ? Codegen.empty() : this.allowedDeviceManagementLevels;
    }

    /**
     * Allowed encryptions statuses, an empty list allows all statuses.
     * 
     */
    @Import(name="allowedEncryptionStatuses")
      private final @Nullable Output<List<DevicePolicyAllowedEncryptionStatusesItem>> allowedEncryptionStatuses;

    public Output<List<DevicePolicyAllowedEncryptionStatusesItem>> getAllowedEncryptionStatuses() {
        return this.allowedEncryptionStatuses == null ? Codegen.empty() : this.allowedEncryptionStatuses;
    }

    /**
     * Allowed OS versions, an empty list allows all types and all versions.
     * 
     */
    @Import(name="osConstraints")
      private final @Nullable Output<List<OsConstraintArgs>> osConstraints;

    public Output<List<OsConstraintArgs>> getOsConstraints() {
        return this.osConstraints == null ? Codegen.empty() : this.osConstraints;
    }

    /**
     * Whether the device needs to be approved by the customer admin.
     * 
     */
    @Import(name="requireAdminApproval")
      private final @Nullable Output<Boolean> requireAdminApproval;

    public Output<Boolean> getRequireAdminApproval() {
        return this.requireAdminApproval == null ? Codegen.empty() : this.requireAdminApproval;
    }

    /**
     * Whether the device needs to be corp owned.
     * 
     */
    @Import(name="requireCorpOwned")
      private final @Nullable Output<Boolean> requireCorpOwned;

    public Output<Boolean> getRequireCorpOwned() {
        return this.requireCorpOwned == null ? Codegen.empty() : this.requireCorpOwned;
    }

    /**
     * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
     * 
     */
    @Import(name="requireScreenlock")
      private final @Nullable Output<Boolean> requireScreenlock;

    public Output<Boolean> getRequireScreenlock() {
        return this.requireScreenlock == null ? Codegen.empty() : this.requireScreenlock;
    }

    public DevicePolicyArgs(
        @Nullable Output<List<DevicePolicyAllowedDeviceManagementLevelsItem>> allowedDeviceManagementLevels,
        @Nullable Output<List<DevicePolicyAllowedEncryptionStatusesItem>> allowedEncryptionStatuses,
        @Nullable Output<List<OsConstraintArgs>> osConstraints,
        @Nullable Output<Boolean> requireAdminApproval,
        @Nullable Output<Boolean> requireCorpOwned,
        @Nullable Output<Boolean> requireScreenlock) {
        this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
        this.allowedEncryptionStatuses = allowedEncryptionStatuses;
        this.osConstraints = osConstraints;
        this.requireAdminApproval = requireAdminApproval;
        this.requireCorpOwned = requireCorpOwned;
        this.requireScreenlock = requireScreenlock;
    }

    private DevicePolicyArgs() {
        this.allowedDeviceManagementLevels = Codegen.empty();
        this.allowedEncryptionStatuses = Codegen.empty();
        this.osConstraints = Codegen.empty();
        this.requireAdminApproval = Codegen.empty();
        this.requireCorpOwned = Codegen.empty();
        this.requireScreenlock = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DevicePolicyAllowedDeviceManagementLevelsItem>> allowedDeviceManagementLevels;
        private @Nullable Output<List<DevicePolicyAllowedEncryptionStatusesItem>> allowedEncryptionStatuses;
        private @Nullable Output<List<OsConstraintArgs>> osConstraints;
        private @Nullable Output<Boolean> requireAdminApproval;
        private @Nullable Output<Boolean> requireCorpOwned;
        private @Nullable Output<Boolean> requireScreenlock;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDeviceManagementLevels = defaults.allowedDeviceManagementLevels;
    	      this.allowedEncryptionStatuses = defaults.allowedEncryptionStatuses;
    	      this.osConstraints = defaults.osConstraints;
    	      this.requireAdminApproval = defaults.requireAdminApproval;
    	      this.requireCorpOwned = defaults.requireCorpOwned;
    	      this.requireScreenlock = defaults.requireScreenlock;
        }

        public Builder allowedDeviceManagementLevels(@Nullable Output<List<DevicePolicyAllowedDeviceManagementLevelsItem>> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
            return this;
        }
        public Builder allowedDeviceManagementLevels(@Nullable List<DevicePolicyAllowedDeviceManagementLevelsItem> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = Codegen.ofNullable(allowedDeviceManagementLevels);
            return this;
        }
        public Builder allowedDeviceManagementLevels(DevicePolicyAllowedDeviceManagementLevelsItem... allowedDeviceManagementLevels) {
            return allowedDeviceManagementLevels(List.of(allowedDeviceManagementLevels));
        }
        public Builder allowedEncryptionStatuses(@Nullable Output<List<DevicePolicyAllowedEncryptionStatusesItem>> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = allowedEncryptionStatuses;
            return this;
        }
        public Builder allowedEncryptionStatuses(@Nullable List<DevicePolicyAllowedEncryptionStatusesItem> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = Codegen.ofNullable(allowedEncryptionStatuses);
            return this;
        }
        public Builder allowedEncryptionStatuses(DevicePolicyAllowedEncryptionStatusesItem... allowedEncryptionStatuses) {
            return allowedEncryptionStatuses(List.of(allowedEncryptionStatuses));
        }
        public Builder osConstraints(@Nullable Output<List<OsConstraintArgs>> osConstraints) {
            this.osConstraints = osConstraints;
            return this;
        }
        public Builder osConstraints(@Nullable List<OsConstraintArgs> osConstraints) {
            this.osConstraints = Codegen.ofNullable(osConstraints);
            return this;
        }
        public Builder osConstraints(OsConstraintArgs... osConstraints) {
            return osConstraints(List.of(osConstraints));
        }
        public Builder requireAdminApproval(@Nullable Output<Boolean> requireAdminApproval) {
            this.requireAdminApproval = requireAdminApproval;
            return this;
        }
        public Builder requireAdminApproval(@Nullable Boolean requireAdminApproval) {
            this.requireAdminApproval = Codegen.ofNullable(requireAdminApproval);
            return this;
        }
        public Builder requireCorpOwned(@Nullable Output<Boolean> requireCorpOwned) {
            this.requireCorpOwned = requireCorpOwned;
            return this;
        }
        public Builder requireCorpOwned(@Nullable Boolean requireCorpOwned) {
            this.requireCorpOwned = Codegen.ofNullable(requireCorpOwned);
            return this;
        }
        public Builder requireScreenlock(@Nullable Output<Boolean> requireScreenlock) {
            this.requireScreenlock = requireScreenlock;
            return this;
        }
        public Builder requireScreenlock(@Nullable Boolean requireScreenlock) {
            this.requireScreenlock = Codegen.ofNullable(requireScreenlock);
            return this;
        }        public DevicePolicyArgs build() {
            return new DevicePolicyArgs(allowedDeviceManagementLevels, allowedEncryptionStatuses, osConstraints, requireAdminApproval, requireCorpOwned, requireScreenlock);
        }
    }
}
