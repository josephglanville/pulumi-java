// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.baremetalsolution_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.baremetalsolution_v2.SnapshotSchedulePolicyArgs;
import io.pulumi.googlenative.baremetalsolution_v2.outputs.ScheduleResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a snapshot schedule policy in the specified project.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:baremetalsolution/v2:SnapshotSchedulePolicy")
public class SnapshotSchedulePolicy extends io.pulumi.resources.CustomResource {
    /**
     * The description of the snapshot schedule policy.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the snapshot schedule policy.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Labels as key value pairs.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels as key value pairs.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name of the snapshot schedule policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the snapshot schedule policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The snapshot schedules contained in this policy. You can specify a maximum of 5 schedules.
     * 
     */
    @Export(name="schedules", type=List.class, parameters={ScheduleResponse.class})
    private Output<List<ScheduleResponse>> schedules;

    /**
     * @return The snapshot schedules contained in this policy. You can specify a maximum of 5 schedules.
     * 
     */
    public Output<List<ScheduleResponse>> getSchedules() {
        return this.schedules;
    }

    public interface BuilderApplicator {
        public void apply(SnapshotSchedulePolicyArgs.Builder a);
    }
    private static io.pulumi.googlenative.baremetalsolution_v2.SnapshotSchedulePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.baremetalsolution_v2.SnapshotSchedulePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SnapshotSchedulePolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SnapshotSchedulePolicy(String name) {
        this(name, SnapshotSchedulePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnapshotSchedulePolicy(String name, SnapshotSchedulePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnapshotSchedulePolicy(String name, SnapshotSchedulePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:baremetalsolution/v2:SnapshotSchedulePolicy", name, args == null ? SnapshotSchedulePolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SnapshotSchedulePolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:baremetalsolution/v2:SnapshotSchedulePolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static SnapshotSchedulePolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SnapshotSchedulePolicy(name, id, options);
    }
}
