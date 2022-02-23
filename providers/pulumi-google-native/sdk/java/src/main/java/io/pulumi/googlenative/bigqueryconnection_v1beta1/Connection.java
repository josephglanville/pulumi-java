// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryconnection_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigqueryconnection_v1beta1.ConnectionArgs;
import io.pulumi.googlenative.bigqueryconnection_v1beta1.outputs.CloudSqlPropertiesResponse;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new connection.
 * 
 */
@ResourceType(type="google-native:bigqueryconnection/v1beta1:Connection")
public class Connection extends io.pulumi.resources.CustomResource {
    /**
     * Cloud SQL properties.
     * 
     */
    @OutputExport(name="cloudSql", type=CloudSqlPropertiesResponse.class, parameters={})
    private Output<CloudSqlPropertiesResponse> cloudSql;

    /**
     * @return Cloud SQL properties.
     * 
     */
    public Output<CloudSqlPropertiesResponse> getCloudSql() {
        return this.cloudSql;
    }
    /**
     * The creation timestamp of the connection.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The creation timestamp of the connection.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * User provided description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User provided description.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * User provided display name for the connection.
     * 
     */
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    /**
     * @return User provided display name for the connection.
     * 
     */
    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * True, if credential is configured for this connection.
     * 
     */
    @OutputExport(name="hasCredential", type=Boolean.class, parameters={})
    private Output<Boolean> hasCredential;

    /**
     * @return True, if credential is configured for this connection.
     * 
     */
    public Output<Boolean> getHasCredential() {
        return this.hasCredential;
    }
    /**
     * The last update timestamp of the connection.
     * 
     */
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return The last update timestamp of the connection.
     * 
     */
    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The resource name of the connection in the form of: `projects/{project_id}/locations/{location_id}/connections/{connection_id}`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the connection in the form of: `projects/{project_id}/locations/{location_id}/connections/{connection_id}`
     * 
     */
    public Output<String> getName() {
        return this.name;
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
    public Connection(String name, @Nullable ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, @Nullable ConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigqueryconnection/v1beta1:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Connection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigqueryconnection/v1beta1:Connection", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Connection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, options);
    }
}
