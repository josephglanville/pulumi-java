// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.redshift.SnapshotScheduleAssociationArgs;
import io.pulumi.aws.redshift.inputs.SnapshotScheduleAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * Redshift Snapshot Schedule Association can be imported using the `<cluster-identifier>/<schedule-identifier>`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:redshift/snapshotScheduleAssociation:SnapshotScheduleAssociation default tf-redshift-cluster/tf-redshift-snapshot-schedule
 * ```
 * 
 */
@ResourceType(type="aws:redshift/snapshotScheduleAssociation:SnapshotScheduleAssociation")
public class SnapshotScheduleAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The cluster identifier.
     * 
     */
    @Export(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier.
     * 
     */
    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The snapshot schedule identifier.
     * 
     */
    @Export(name="scheduleIdentifier", type=String.class, parameters={})
    private Output<String> scheduleIdentifier;

    /**
     * @return The snapshot schedule identifier.
     * 
     */
    public Output<String> getScheduleIdentifier() {
        return this.scheduleIdentifier;
    }

    public interface BuilderApplicator {
        public void apply(SnapshotScheduleAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.redshift.SnapshotScheduleAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.redshift.SnapshotScheduleAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SnapshotScheduleAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SnapshotScheduleAssociation(String name) {
        this(name, SnapshotScheduleAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnapshotScheduleAssociation(String name, SnapshotScheduleAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnapshotScheduleAssociation(String name, SnapshotScheduleAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/snapshotScheduleAssociation:SnapshotScheduleAssociation", name, args == null ? SnapshotScheduleAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SnapshotScheduleAssociation(String name, Output<String> id, @Nullable SnapshotScheduleAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/snapshotScheduleAssociation:SnapshotScheduleAssociation", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SnapshotScheduleAssociation get(String name, Output<String> id, @Nullable SnapshotScheduleAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SnapshotScheduleAssociation(name, id, state, options);
    }
}
