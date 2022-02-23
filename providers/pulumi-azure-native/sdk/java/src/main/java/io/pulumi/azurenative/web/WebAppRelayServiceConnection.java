// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppRelayServiceConnectionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Hybrid Connection for an App Service app.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppRelayServiceConnection myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hybridconnection/{entityName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppRelayServiceConnection")
public class WebAppRelayServiceConnection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="biztalkUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> biztalkUri;

    public Output</* @Nullable */ String> getBiztalkUri() {
        return this.biztalkUri;
    }
    @OutputExport(name="entityConnectionString", type=String.class, parameters={})
    private Output</* @Nullable */ String> entityConnectionString;

    public Output</* @Nullable */ String> getEntityConnectionString() {
        return this.entityConnectionString;
    }
    @OutputExport(name="entityName", type=String.class, parameters={})
    private Output</* @Nullable */ String> entityName;

    public Output</* @Nullable */ String> getEntityName() {
        return this.entityName;
    }
    @OutputExport(name="hostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostname;

    public Output</* @Nullable */ String> getHostname() {
        return this.hostname;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    @OutputExport(name="resourceConnectionString", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceConnectionString;

    public Output</* @Nullable */ String> getResourceConnectionString() {
        return this.resourceConnectionString;
    }
    @OutputExport(name="resourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceType;

    public Output</* @Nullable */ String> getPropResourceType() {
        return this.resourceType;
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
    public WebAppRelayServiceConnection(String name) {
        this(name, WebAppRelayServiceConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppRelayServiceConnection(String name, WebAppRelayServiceConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppRelayServiceConnection(String name, WebAppRelayServiceConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppRelayServiceConnection", name, args == null ? WebAppRelayServiceConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppRelayServiceConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppRelayServiceConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppRelayServiceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppRelayServiceConnection").build())
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
    public static WebAppRelayServiceConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppRelayServiceConnection(name, id, options);
    }
}
