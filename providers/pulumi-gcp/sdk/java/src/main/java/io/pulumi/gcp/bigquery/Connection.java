// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigquery.ConnectionArgs;
import io.pulumi.gcp.bigquery.inputs.ConnectionState;
import io.pulumi.gcp.bigquery.outputs.ConnectionCloudSql;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A connection allows BigQuery connections to external data sources..
 * 
 * To get more information about Connection, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/bigqueryconnection/rest/v1beta1/projects.locations.connections/create)
 * * How-to Guides
 *     * [Cloud SQL federated queries](https://cloud.google.com/bigquery/docs/cloud-sql-federated-queries)
 * 
 * > **Warning:** All arguments including `cloud_sql.credential.password` will be stored in the raw
 * state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Connection can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/connection:Connection default projects/{{project}}/locations/{{location}}/connections/{{connection_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/connection:Connection default {{project}}/{{location}}/{{connection_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/connection:Connection default {{location}}/{{connection_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/connection:Connection")
public class Connection extends io.pulumi.resources.CustomResource {
    /**
     * Cloud SQL properties.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="cloudSql", type=ConnectionCloudSql.class, parameters={})
    private Output<ConnectionCloudSql> cloudSql;

    /**
     * @return Cloud SQL properties.
     * Structure is documented below.
     * 
     */
    public Output<ConnectionCloudSql> getCloudSql() {
        return this.cloudSql;
    }
    /**
     * Optional connection id that should be assigned to the created connection.
     * 
     */
    @OutputExport(name="connectionId", type=String.class, parameters={})
    private Output<String> connectionId;

    /**
     * @return Optional connection id that should be assigned to the created connection.
     * 
     */
    public Output<String> getConnectionId() {
        return this.connectionId;
    }
    /**
     * A descriptive description for the connection
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A descriptive description for the connection
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A descriptive name for the connection
     * 
     */
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return A descriptive name for the connection
     * 
     */
    public Output</* @Nullable */ String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * True if the connection has credential assigned.
     * 
     */
    @OutputExport(name="hasCredential", type=Boolean.class, parameters={})
    private Output<Boolean> hasCredential;

    /**
     * @return True if the connection has credential assigned.
     * 
     */
    public Output<Boolean> getHasCredential() {
        return this.hasCredential;
    }
    /**
     * The geographic location where the connection should reside.
     * Cloud SQL instance must be in the same location as the connection
     * with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
     * Examples: US, EU, asia-northeast1, us-central1, europe-west1. The default value is US.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geographic location where the connection should reside.
     * Cloud SQL instance must be in the same location as the connection
     * with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
     * Examples: US, EU, asia-northeast1, us-central1, europe-west1. The default value is US.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The resource name of the connection in the form of:
     * "projects/{project_id}/locations/{location_id}/connections/{connectionId}"
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the connection in the form of:
     * "projects/{project_id}/locations/{location_id}/connections/{connectionId}"
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Connection(String name, Input<String> id, @Nullable ConnectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/connection:Connection", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static Connection get(String name, Input<String> id, @Nullable ConnectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
