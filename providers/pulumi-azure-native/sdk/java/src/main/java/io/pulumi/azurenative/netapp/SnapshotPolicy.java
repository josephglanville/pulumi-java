// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.netapp.SnapshotPolicyArgs;
import io.pulumi.azurenative.netapp.outputs.DailyScheduleResponse;
import io.pulumi.azurenative.netapp.outputs.HourlyScheduleResponse;
import io.pulumi.azurenative.netapp.outputs.MonthlyScheduleResponse;
import io.pulumi.azurenative.netapp.outputs.WeeklyScheduleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Snapshot policy information
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:netapp:SnapshotPolicy account1/snapshotPolicy1 /subscriptions/D633CC2E-722B-4AE1-B636-BBD9E4C60ED9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/snapshotPolicies/snapshotPolicy1 
 * ```
 * 
 */
@ResourceType(type="azure-native:netapp:SnapshotPolicy")
public class SnapshotPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Schedule for daily snapshots
     * 
     */
    @OutputExport(name="dailySchedule", type=DailyScheduleResponse.class, parameters={})
    private Output</* @Nullable */ DailyScheduleResponse> dailySchedule;

    /**
     * @return Schedule for daily snapshots
     * 
     */
    public Output</* @Nullable */ DailyScheduleResponse> getDailySchedule() {
        return this.dailySchedule;
    }
    /**
     * The property to decide policy is enabled or not
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return The property to decide policy is enabled or not
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * Schedule for hourly snapshots
     * 
     */
    @OutputExport(name="hourlySchedule", type=HourlyScheduleResponse.class, parameters={})
    private Output</* @Nullable */ HourlyScheduleResponse> hourlySchedule;

    /**
     * @return Schedule for hourly snapshots
     * 
     */
    public Output</* @Nullable */ HourlyScheduleResponse> getHourlySchedule() {
        return this.hourlySchedule;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Schedule for monthly snapshots
     * 
     */
    @OutputExport(name="monthlySchedule", type=MonthlyScheduleResponse.class, parameters={})
    private Output</* @Nullable */ MonthlyScheduleResponse> monthlySchedule;

    /**
     * @return Schedule for monthly snapshots
     * 
     */
    public Output</* @Nullable */ MonthlyScheduleResponse> getMonthlySchedule() {
        return this.monthlySchedule;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Azure lifecycle management
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Azure lifecycle management
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Schedule for weekly snapshots
     * 
     */
    @OutputExport(name="weeklySchedule", type=WeeklyScheduleResponse.class, parameters={})
    private Output</* @Nullable */ WeeklyScheduleResponse> weeklySchedule;

    /**
     * @return Schedule for weekly snapshots
     * 
     */
    public Output</* @Nullable */ WeeklyScheduleResponse> getWeeklySchedule() {
        return this.weeklySchedule;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SnapshotPolicy(String name) {
        this(name, SnapshotPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnapshotPolicy(String name, SnapshotPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnapshotPolicy(String name, SnapshotPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:SnapshotPolicy", name, args == null ? SnapshotPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SnapshotPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:SnapshotPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:netapp/v20200501:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200601:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200701:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200801:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200901:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20201101:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20201201:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210201:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210401:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210401preview:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210601:SnapshotPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210801:SnapshotPolicy").build())
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
    public static SnapshotPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SnapshotPolicy(name, id, options);
    }
}
