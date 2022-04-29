// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.DataCatalog.ConnectionArgs;
import com.pulumi.oci.DataCatalog.inputs.ConnectionState;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Connection resource in Oracle Cloud Infrastructure Data Catalog service.
 * 
 * Creates a new connection.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Connections can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:DataCatalog/connection:Connection test_connection &#34;catalogs/{catalogId}/dataAssets/{dataAssetKey}/connections/{connectionKey}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:DataCatalog/connection:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * Unique catalog identifier.
     * 
     */
    @Export(name="catalogId", type=String.class, parameters={})
    private Output<String> catalogId;

    /**
     * @return Unique catalog identifier.
     * 
     */
    public Output<String> catalogId() {
        return this.catalogId;
    }
    /**
     * OCID of the user who created the connection.
     * 
     */
    @Export(name="createdById", type=String.class, parameters={})
    private Output<String> createdById;

    /**
     * @return OCID of the user who created the connection.
     * 
     */
    public Output<String> createdById() {
        return this.createdById;
    }
    /**
     * Unique data asset key.
     * 
     */
    @Export(name="dataAssetKey", type=String.class, parameters={})
    private Output<String> dataAssetKey;

    /**
     * @return Unique data asset key.
     * 
     */
    public Output<String> dataAssetKey() {
        return this.dataAssetKey;
    }
    /**
     * (Updatable) A description of the connection.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) A description of the connection.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) A user-friendly display name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly display name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) A map of maps that contains the encrypted values for sensitive properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. To determine the set of optional and required properties for a connection type, a query can be done on &#39;/types?type=connection&#39; that returns a collection of all connection types. The appropriate connection type, which will include definitions of all of it&#39;s properties, can be identified from this collection. Example: `{&#34;encProperties&#34;: { &#34;default&#34;: { &#34;password&#34;: &#34;example-password&#34;}}}`
     * 
     */
    @Export(name="encProperties", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> encProperties;

    /**
     * @return (Updatable) A map of maps that contains the encrypted values for sensitive properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. To determine the set of optional and required properties for a connection type, a query can be done on &#39;/types?type=connection&#39; that returns a collection of all connection types. The appropriate connection type, which will include definitions of all of it&#39;s properties, can be identified from this collection. Example: `{&#34;encProperties&#34;: { &#34;default&#34;: { &#34;password&#34;: &#34;example-password&#34;}}}`
     * 
     */
    public Output<Optional<Map<String,Object>>> encProperties() {
        return Codegen.optional(this.encProperties);
    }
    /**
     * Unique external key of this object from the source system.
     * 
     */
    @Export(name="externalKey", type=String.class, parameters={})
    private Output<String> externalKey;

    /**
     * @return Unique external key of this object from the source system.
     * 
     */
    public Output<String> externalKey() {
        return this.externalKey;
    }
    /**
     * (Updatable) Indicates whether this connection is the default connection. The first connection of a data asset defaults to being the default, subsequent connections default to not being the default. If a default connection already exists, then trying to create a connection as the default will fail. In this case the default connection would need to be updated not to be the default and then the new connection can then be created as the default.
     * 
     */
    @Export(name="isDefault", type=Boolean.class, parameters={})
    private Output<Boolean> isDefault;

    /**
     * @return (Updatable) Indicates whether this connection is the default connection. The first connection of a data asset defaults to being the default, subsequent connections default to not being the default. If a default connection already exists, then trying to create a connection as the default will fail. In this case the default connection would need to be updated not to be the default and then the new connection can then be created as the default.
     * 
     */
    public Output<Boolean> isDefault() {
        return this.isDefault;
    }
    /**
     * Unique connection key that is immutable.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return Unique connection key that is immutable.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * A map of maps that contains the properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. Example: `{&#34;properties&#34;: { &#34;default&#34;: { &#34;username&#34;: &#34;user1&#34;}}}`
     * 
     */
    @Export(name="properties", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> properties;

    /**
     * @return A map of maps that contains the properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. Example: `{&#34;properties&#34;: { &#34;default&#34;: { &#34;username&#34;: &#34;user1&#34;}}}`
     * 
     */
    public Output<Map<String,Object>> properties() {
        return this.properties;
    }
    /**
     * The current state of the connection.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the connection.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The date and time the connection was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: `2019-03-25T21:10:29.600Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the connection was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: `2019-03-25T21:10:29.600Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * Time that the connections status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    @Export(name="timeStatusUpdated", type=String.class, parameters={})
    private Output<String> timeStatusUpdated;

    /**
     * @return Time that the connections status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    public Output<String> timeStatusUpdated() {
        return this.timeStatusUpdated;
    }
    /**
     * The last time that any change was made to the connection. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The last time that any change was made to the connection. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * The key of the object type. Type key&#39;s can be found via the &#39;/types&#39; endpoint.
     * 
     */
    @Export(name="typeKey", type=String.class, parameters={})
    private Output<String> typeKey;

    /**
     * @return The key of the object type. Type key&#39;s can be found via the &#39;/types&#39; endpoint.
     * 
     */
    public Output<String> typeKey() {
        return this.typeKey;
    }
    /**
     * OCID of the user who modified the connection.
     * 
     */
    @Export(name="updatedById", type=String.class, parameters={})
    private Output<String> updatedById;

    /**
     * @return OCID of the user who modified the connection.
     * 
     */
    public Output<String> updatedById() {
        return this.updatedById;
    }
    /**
     * URI to the connection instance in the API.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    /**
     * @return URI to the connection instance in the API.
     * 
     */
    public Output<String> uri() {
        return this.uri;
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
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataCatalog/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataCatalog/connection:Connection", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static Connection get(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
