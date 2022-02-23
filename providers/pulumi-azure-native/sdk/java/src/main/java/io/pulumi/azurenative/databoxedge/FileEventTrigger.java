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
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Trigger details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:FileEventTrigger trigger1 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/triggers/trigger1 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:FileEventTrigger")
public class FileEventTrigger extends io.pulumi.resources.CustomResource {
    /**
     * A custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of the module.
     * 
     */
    @OutputExport(name="customContextTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> customContextTag;

    /**
     * @return A custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of the module.
     * 
     */
    public Output</* @Nullable */ String> getCustomContextTag() {
        return this.customContextTag;
    }
    /**
     * Trigger Kind.
     * Expected value is 'FileEvent'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Trigger Kind.
     * Expected value is 'FileEvent'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The object name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Role sink info.
     * 
     */
    @OutputExport(name="sinkInfo", type=RoleSinkInfoResponse.class, parameters={})
    private Output<RoleSinkInfoResponse> sinkInfo;

    /**
     * @return Role sink info.
     * 
     */
    public Output<RoleSinkInfoResponse> getSinkInfo() {
        return this.sinkInfo;
    }
    /**
     * File event source details.
     * 
     */
    @OutputExport(name="sourceInfo", type=FileSourceInfoResponse.class, parameters={})
    private Output<FileSourceInfoResponse> sourceInfo;

    /**
     * @return File event source details.
     * 
     */
    public Output<FileSourceInfoResponse> getSourceInfo() {
        return this.sourceInfo;
    }
    /**
     * Trigger in DataBoxEdge Resource
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Trigger in DataBoxEdge Resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileEventTrigger(String name) {
        this(name, FileEventTriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileEventTrigger(String name, FileEventTriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
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

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FileEventTrigger get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FileEventTrigger(name, id, options);
    }
}
