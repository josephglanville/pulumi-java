// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.MachineGroupArgs;
import io.pulumi.azurenative.operationalinsights.outputs.MachineReferenceWithHintsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A user-defined logical grouping of machines.
 * API Version: 2015-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:operationalinsights:MachineGroup ccfbf4bf-dc08-4371-9e9b-00a8d875d45a /subscriptions/63BE4E24-FDF0-4E9C-9342-6A5D5A359722/resourceGroups/rg-sm/providers/Microsoft.OperationalInsights/workspaces/D6F79F14-E563-469B-84B5-9286D2803B2F/machineGroups/ccfbf4bf-dc08-4371-9e9b-00a8d875d45a 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationalinsights:MachineGroup")
public class MachineGroup extends io.pulumi.resources.CustomResource {
    /**
     * Count of machines in this group. The value of count may be bigger than the number of machines in case of the group has been truncated due to exceeding the max number of machines a group can handle.
     * 
     */
    @Export(name="count", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> count;

    /**
     * @return Count of machines in this group. The value of count may be bigger than the number of machines in case of the group has been truncated due to exceeding the max number of machines a group can handle.
     * 
     */
    public Output</* @Nullable */ Integer> getCount() {
        return this.count;
    }
    /**
     * User defined name for the group
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User defined name for the group
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource ETAG.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Resource ETAG.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Type of the machine group
     * 
     */
    @Export(name="groupType", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupType;

    /**
     * @return Type of the machine group
     * 
     */
    public Output</* @Nullable */ String> getGroupType() {
        return this.groupType;
    }
    /**
     * Additional resource type qualifier.
     * Expected value is 'machineGroup'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Additional resource type qualifier.
     * Expected value is 'machineGroup'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * References of the machines in this group. The hints within each reference do not represent the current value of the corresponding fields. They are a snapshot created during the last time the machine group was updated.
     * 
     */
    @Export(name="machines", type=List.class, parameters={MachineReferenceWithHintsResponse.class})
    private Output</* @Nullable */ List<MachineReferenceWithHintsResponse>> machines;

    /**
     * @return References of the machines in this group. The hints within each reference do not represent the current value of the corresponding fields. They are a snapshot created during the last time the machine group was updated.
     * 
     */
    public Output</* @Nullable */ List<MachineReferenceWithHintsResponse>> getMachines() {
        return this.machines;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(MachineGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.operationalinsights.MachineGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.operationalinsights.MachineGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MachineGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MachineGroup(String name) {
        this(name, MachineGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MachineGroup(String name, MachineGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MachineGroup(String name, MachineGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:MachineGroup", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private MachineGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:MachineGroup", name, null, makeResourceOptions(options, id));
    }

    private static MachineGroupArgs makeArgs(MachineGroupArgs args) {
        var builder = args == null ? MachineGroupArgs.builder() : MachineGroupArgs.builder(args);
        return builder
            .kind("machineGroup")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20151101preview:MachineGroup").build())
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
    public static MachineGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MachineGroup(name, id, options);
    }
}
