// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigquery.ReservationArgs;
import io.pulumi.gcp.bigquery.inputs.ReservationState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A reservation is a mechanism used to guarantee BigQuery slots to users.
 * 
 * To get more information about Reservation, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/reservations/rest/v1beta1/projects.locations.reservations/create)
 * * How-to Guides
 *     * [Introduction to Reservations](https://cloud.google.com/bigquery/docs/reservations-intro)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Reservation can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/reservation:Reservation default projects/{{project}}/locations/{{location}}/reservations/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/reservation:Reservation default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/reservation:Reservation default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/reservation:Reservation")
public class Reservation extends io.pulumi.resources.CustomResource {
    /**
     * If false, any query using this reservation will use idle slots from other reservations within
     * the same admin project. If true, a query using this reservation will execute with the slot
     * capacity specified above at most.
     * 
     */
    @OutputExport(name="ignoreIdleSlots", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreIdleSlots;

    /**
     * @return If false, any query using this reservation will use idle slots from other reservations within
     * the same admin project. If true, a query using this reservation will execute with the slot
     * capacity specified above at most.
     * 
     */
    public Output</* @Nullable */ Boolean> getIgnoreIdleSlots() {
        return this.ignoreIdleSlots;
    }
    /**
     * The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the reservation. This field must only contain alphanumeric characters or dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the reservation. This field must only contain alphanumeric characters or dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the
     * unit of parallelism. Queries using this reservation might use more slots during runtime if ignoreIdleSlots is set to false.
     * 
     */
    @OutputExport(name="slotCapacity", type=Integer.class, parameters={})
    private Output<Integer> slotCapacity;

    /**
     * @return Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the
     * unit of parallelism. Queries using this reservation might use more slots during runtime if ignoreIdleSlots is set to false.
     * 
     */
    public Output<Integer> getSlotCapacity() {
        return this.slotCapacity;
    }

    public interface BuilderApplicator {
        public void apply(ReservationArgs.Builder a);
    }
    private static io.pulumi.gcp.bigquery.ReservationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.bigquery.ReservationArgs.builder();
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
    public Reservation(String name, ReservationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Reservation(String name, ReservationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/reservation:Reservation", name, args == null ? ReservationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Reservation(String name, Output<String> id, @Nullable ReservationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/reservation:Reservation", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Reservation get(String name, Output<String> id, @Nullable ReservationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Reservation(name, id, state, options);
    }
}
