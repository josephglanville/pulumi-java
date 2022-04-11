// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.PeriodicTimerEventTriggerArgs;
import io.pulumi.azurenative.databoxedge.outputs.PeriodicTimerSourceInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.RoleSinkInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
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
 * $ pulumi import azure-native:databoxedge:PeriodicTimerEventTrigger trigger1 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/triggers/trigger1 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:PeriodicTimerEventTrigger")
public class PeriodicTimerEventTrigger extends io.pulumi.resources.CustomResource {
    /**
     * A custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of the module.
     * 
     */
    @Export(name="customContextTag", type=String.class, parameters={})
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
     * Expected value is 'PeriodicTimerEvent'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Trigger Kind.
     * Expected value is 'PeriodicTimerEvent'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The object name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Role Sink information.
     * 
     */
    @Export(name="sinkInfo", type=RoleSinkInfoResponse.class, parameters={})
    private Output<RoleSinkInfoResponse> sinkInfo;

    /**
     * @return Role Sink information.
     * 
     */
    public Output<RoleSinkInfoResponse> getSinkInfo() {
        return this.sinkInfo;
    }
    /**
     * Periodic timer details.
     * 
     */
    @Export(name="sourceInfo", type=PeriodicTimerSourceInfoResponse.class, parameters={})
    private Output<PeriodicTimerSourceInfoResponse> sourceInfo;

    /**
     * @return Periodic timer details.
     * 
     */
    public Output<PeriodicTimerSourceInfoResponse> getSourceInfo() {
        return this.sourceInfo;
    }
    /**
     * Trigger in DataBoxEdge Resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
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
    @Export(name="type", type=String.class, parameters={})
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
    public PeriodicTimerEventTrigger(String name) {
        this(name, PeriodicTimerEventTriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PeriodicTimerEventTrigger(String name, PeriodicTimerEventTriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PeriodicTimerEventTrigger(String name, PeriodicTimerEventTriggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:PeriodicTimerEventTrigger", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private PeriodicTimerEventTrigger(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:PeriodicTimerEventTrigger", name, null, makeResourceOptions(options, id));
    }

    private static PeriodicTimerEventTriggerArgs makeArgs(PeriodicTimerEventTriggerArgs args) {
        var builder = args == null ? PeriodicTimerEventTriggerArgs.builder() : PeriodicTimerEventTriggerArgs.builder(args);
        return builder
            .kind("PeriodicTimerEvent")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190301:PeriodicTimerEventTrigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190701:PeriodicTimerEventTrigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190801:PeriodicTimerEventTrigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200501preview:PeriodicTimerEventTrigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901:PeriodicTimerEventTrigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901preview:PeriodicTimerEventTrigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20201201:PeriodicTimerEventTrigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201:PeriodicTimerEventTrigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201preview:PeriodicTimerEventTrigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601:PeriodicTimerEventTrigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601preview:PeriodicTimerEventTrigger").build())
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
    public static PeriodicTimerEventTrigger get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PeriodicTimerEventTrigger(name, id, options);
    }
}
