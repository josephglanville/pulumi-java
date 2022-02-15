// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.FileEventTriggerArgs;
import io.pulumi.azurenative.databoxedge.outputs.FileSourceInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.RoleSinkInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:databoxedge:FileEventTrigger")
public class FileEventTrigger extends io.pulumi.resources.CustomResource {
    @OutputExport(name="customContextTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> customContextTag;

    public Output</* @Nullable */ String> getCustomContextTag() {
        return this.customContextTag;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="sinkInfo", type=RoleSinkInfoResponse.class, parameters={})
    private Output<RoleSinkInfoResponse> sinkInfo;

    public Output<RoleSinkInfoResponse> getSinkInfo() {
        return this.sinkInfo;
    }
    @OutputExport(name="sourceInfo", type=FileSourceInfoResponse.class, parameters={})
    private Output<FileSourceInfoResponse> sourceInfo;

    public Output<FileSourceInfoResponse> getSourceInfo() {
        return this.sourceInfo;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FileEventTrigger(String name, FileEventTriggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:FileEventTrigger", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private FileEventTrigger(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:FileEventTrigger", name, null, makeResourceOptions(options, id));
    }

    private static FileEventTriggerArgs makeArgs(FileEventTriggerArgs args) {
        var builder = args == null ? FileEventTriggerArgs.builder() : FileEventTriggerArgs.builder(args);
        return builder
            .setKind("FileEvent")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190301:FileEventTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190701:FileEventTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190801:FileEventTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200501preview:FileEventTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901:FileEventTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:FileEventTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20201201:FileEventTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201:FileEventTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:FileEventTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601:FileEventTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:FileEventTrigger").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static FileEventTrigger get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FileEventTrigger(name, id, options);
    }
}