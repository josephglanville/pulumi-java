// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cache.PatchScheduleArgs;
import io.pulumi.azurenative.cache.outputs.ScheduleEntryResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Response to put/get patch schedules for Redis cache.
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cache:PatchSchedule default /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Cache/Redis/cache1/patchSchedules/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:cache:PatchSchedule")
public class PatchSchedule extends io.pulumi.resources.CustomResource {
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of patch schedules for a Redis cache.
     * 
     */
    @OutputExport(name="scheduleEntries", type=List.class, parameters={ScheduleEntryResponse.class})
    private Output<List<ScheduleEntryResponse>> scheduleEntries;

    /**
     * @return List of patch schedules for a Redis cache.
     * 
     */
    public Output<List<ScheduleEntryResponse>> getScheduleEntries() {
        return this.scheduleEntries;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PatchSchedule(String name) {
        this(name, PatchScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PatchSchedule(String name, PatchScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PatchSchedule(String name, PatchScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:PatchSchedule", name, args == null ? PatchScheduleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PatchSchedule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:PatchSchedule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cache/v20171001:PatchSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20180301:PatchSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20190701:PatchSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20200601:PatchSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20201201:PatchSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20210601:PatchSchedule").build())
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
    public static PatchSchedule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PatchSchedule(name, id, options);
    }
}
