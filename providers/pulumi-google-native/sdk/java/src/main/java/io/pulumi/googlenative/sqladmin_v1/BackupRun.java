// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.sqladmin_v1.BackupRunArgs;
import io.pulumi.googlenative.sqladmin_v1.outputs.DiskEncryptionConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.DiskEncryptionStatusResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.OperationErrorResponse;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="google-native:sqladmin/v1:BackupRun")
public class BackupRun extends io.pulumi.resources.CustomResource {
    @OutputExport(name="backupKind", type=String.class, parameters={})
    private Output<String> backupKind;

    public Output<String> getBackupKind() {
        return this.backupKind;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="diskEncryptionConfiguration", type=DiskEncryptionConfigurationResponse.class, parameters={})
    private Output<DiskEncryptionConfigurationResponse> diskEncryptionConfiguration;

    public Output<DiskEncryptionConfigurationResponse> getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }
    @OutputExport(name="diskEncryptionStatus", type=DiskEncryptionStatusResponse.class, parameters={})
    private Output<DiskEncryptionStatusResponse> diskEncryptionStatus;

    public Output<DiskEncryptionStatusResponse> getDiskEncryptionStatus() {
        return this.diskEncryptionStatus;
    }
    @OutputExport(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime;
    }
    @OutputExport(name="enqueuedTime", type=String.class, parameters={})
    private Output<String> enqueuedTime;

    public Output<String> getEnqueuedTime() {
        return this.enqueuedTime;
    }
    @OutputExport(name="error", type=OperationErrorResponse.class, parameters={})
    private Output<OperationErrorResponse> error;

    public Output<OperationErrorResponse> getError() {
        return this.error;
    }
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    public Output<String> getInstance() {
        return this.instance;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="windowStartTime", type=String.class, parameters={})
    private Output<String> windowStartTime;

    public Output<String> getWindowStartTime() {
        return this.windowStartTime;
    }

    public BackupRun(String name, BackupRunArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1:BackupRun", name, args == null ? BackupRunArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackupRun(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1:BackupRun", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static BackupRun get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackupRun(name, id, options);
    }
}