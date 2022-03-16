// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.DatastoreArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1DatastoreConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create a Datastore for an org
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Datastore")
public class Datastore extends io.pulumi.resources.CustomResource {
    /**
     * Datastore create time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Datastore create time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Datastore Configurations.
     * 
     */
    @Export(name="datastoreConfig", type=GoogleCloudApigeeV1DatastoreConfigResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1DatastoreConfigResponse> datastoreConfig;

    /**
     * @return Datastore Configurations.
     * 
     */
    public Output<GoogleCloudApigeeV1DatastoreConfigResponse> getDatastoreConfig() {
        return this.datastoreConfig;
    }
    /**
     * Display name in UI
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name in UI
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Datastore last update time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
     */
    @Export(name="lastUpdateTime", type=String.class, parameters={})
    private Output<String> lastUpdateTime;

    /**
     * @return Datastore last update time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
     */
    public Output<String> getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    /**
     * Organization that the datastore belongs to
     * 
     */
    @Export(name="org", type=String.class, parameters={})
    private Output<String> org;

    /**
     * @return Organization that the datastore belongs to
     * 
     */
    public Output<String> getOrg() {
        return this.org;
    }
    /**
     * Resource link of Datastore. Example: `/organizations/{org}/analytics/datastores/{uuid}`
     * 
     */
    @Export(name="self", type=String.class, parameters={})
    private Output<String> self;

    /**
     * @return Resource link of Datastore. Example: `/organizations/{org}/analytics/datastores/{uuid}`
     * 
     */
    public Output<String> getSelf() {
        return this.self;
    }
    /**
     * Destination storage type. Supported types `gcs` or `bigquery`.
     * 
     */
    @Export(name="targetType", type=String.class, parameters={})
    private Output<String> targetType;

    /**
     * @return Destination storage type. Supported types `gcs` or `bigquery`.
     * 
     */
    public Output<String> getTargetType() {
        return this.targetType;
    }

    public interface BuilderApplicator {
        public void apply(DatastoreArgs.Builder a);
    }
    private static io.pulumi.googlenative.apigee_v1.DatastoreArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apigee_v1.DatastoreArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Datastore(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Datastore(String name) {
        this(name, DatastoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Datastore(String name, DatastoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Datastore(String name, DatastoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Datastore", name, args == null ? DatastoreArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Datastore(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Datastore", name, null, makeResourceOptions(options, id));
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
    public static Datastore get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Datastore(name, id, options);
    }
}
