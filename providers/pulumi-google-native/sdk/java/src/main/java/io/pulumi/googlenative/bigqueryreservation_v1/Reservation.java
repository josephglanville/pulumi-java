// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryreservation_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigqueryreservation_v1.ReservationArgs;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new reservation resource.
 * 
 */
@ResourceType(type="google-native:bigqueryreservation/v1:Reservation")
public class Reservation extends io.pulumi.resources.CustomResource {
    /**
     * Creation time of the reservation.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Creation time of the reservation.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
     * 
     */
    @OutputExport(name="ignoreIdleSlots", type=Boolean.class, parameters={})
    private Output<Boolean> ignoreIdleSlots;

    /**
     * @return If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
     * 
     */
    public Output<Boolean> getIgnoreIdleSlots() {
        return this.ignoreIdleSlots;
    }
    /**
     * The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation's slot capacity exceed the project's slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project's slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
     * 
     */
    @OutputExport(name="slotCapacity", type=String.class, parameters={})
    private Output<String> slotCapacity;

    /**
     * @return Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation's slot capacity exceed the project's slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project's slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
     * 
     */
    public Output<String> getSlotCapacity() {
        return this.slotCapacity;
    }
    /**
     * Last update time of the reservation.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Last update time of the reservation.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ReservationArgs.Builder a);
    }
    private static io.pulumi.googlenative.bigqueryreservation_v1.ReservationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.bigqueryreservation_v1.ReservationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Reservation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Reservation(String name) {
        this(name, ReservationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Reservation(String name, @Nullable ReservationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Reservation(String name, @Nullable ReservationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigqueryreservation/v1:Reservation", name, args == null ? ReservationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Reservation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigqueryreservation/v1:Reservation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Reservation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Reservation(name, id, options);
    }
}
