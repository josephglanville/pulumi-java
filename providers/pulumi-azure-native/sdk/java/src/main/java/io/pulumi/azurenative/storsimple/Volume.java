// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.VolumeArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:storsimple:Volume")
public class Volume extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessControlRecordIds", type=List.class, parameters={String.class})
    private Output<List<String>> accessControlRecordIds;

    public Output<List<String>> getAccessControlRecordIds() {
        return this.accessControlRecordIds;
    }
    @OutputExport(name="backupPolicyIds", type=List.class, parameters={String.class})
    private Output<List<String>> backupPolicyIds;

    public Output<List<String>> getBackupPolicyIds() {
        return this.backupPolicyIds;
    }
    @OutputExport(name="backupStatus", type=String.class, parameters={})
    private Output<String> backupStatus;

    public Output<String> getBackupStatus() {
        return this.backupStatus;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="monitoringStatus", type=String.class, parameters={})
    private Output<String> monitoringStatus;

    public Output<String> getMonitoringStatus() {
        return this.monitoringStatus;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="operationStatus", type=String.class, parameters={})
    private Output<String> operationStatus;

    public Output<String> getOperationStatus() {
        return this.operationStatus;
    }
    @OutputExport(name="sizeInBytes", type=Double.class, parameters={})
    private Output<Double> sizeInBytes;

    public Output<Double> getSizeInBytes() {
        return this.sizeInBytes;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="volumeContainerId", type=String.class, parameters={})
    private Output<String> volumeContainerId;

    public Output<String> getVolumeContainerId() {
        return this.volumeContainerId;
    }
    @OutputExport(name="volumeStatus", type=String.class, parameters={})
    private Output<String> volumeStatus;

    public Output<String> getVolumeStatus() {
        return this.volumeStatus;
    }
    @OutputExport(name="volumeType", type=String.class, parameters={})
    private Output<String> volumeType;

    public Output<String> getVolumeType() {
        return this.volumeType;
    }

    public Volume(String name, VolumeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Volume(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:Volume", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storsimple/v20170601:Volume").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Volume get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, options);
    }
}
