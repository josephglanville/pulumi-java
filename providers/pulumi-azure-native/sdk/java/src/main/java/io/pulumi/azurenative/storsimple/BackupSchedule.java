// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.BackupScheduleArgs;
import io.pulumi.azurenative.storsimple.outputs.ScheduleRecurrenceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:storsimple:BackupSchedule")
public class BackupSchedule extends io.pulumi.resources.CustomResource {
    @OutputExport(name="backupType", type=String.class, parameters={})
    private Output<String> backupType;

    public Output<String> getBackupType() {
        return this.backupType;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="lastSuccessfulRun", type=String.class, parameters={})
    private Output<String> lastSuccessfulRun;

    public Output<String> getLastSuccessfulRun() {
        return this.lastSuccessfulRun;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="retentionCount", type=Double.class, parameters={})
    private Output<Double> retentionCount;

    public Output<Double> getRetentionCount() {
        return this.retentionCount;
    }
    @OutputExport(name="scheduleRecurrence", type=ScheduleRecurrenceResponse.class, parameters={})
    private Output<ScheduleRecurrenceResponse> scheduleRecurrence;

    public Output<ScheduleRecurrenceResponse> getScheduleRecurrence() {
        return this.scheduleRecurrence;
    }
    @OutputExport(name="scheduleStatus", type=String.class, parameters={})
    private Output<String> scheduleStatus;

    public Output<String> getScheduleStatus() {
        return this.scheduleStatus;
    }
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public BackupSchedule(String name, BackupScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:BackupSchedule", name, args == null ? BackupScheduleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackupSchedule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:BackupSchedule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storsimple/v20170601:BackupSchedule").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static BackupSchedule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackupSchedule(name, id, options);
    }
}
