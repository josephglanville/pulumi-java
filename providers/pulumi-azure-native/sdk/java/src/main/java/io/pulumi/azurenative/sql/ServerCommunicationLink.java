// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ServerCommunicationLinkArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Server communication link.
 * API Version: 2014-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ServerCommunicationLink link1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-7398/providers/Microsoft.Sql/servers/sqlcrudtest-4645/communicationLinks/link1 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerCommunicationLink")
public class ServerCommunicationLink extends io.pulumi.resources.CustomResource {
    /**
     * Communication link kind.  This property is used for Azure Portal metadata.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Communication link kind.  This property is used for Azure Portal metadata.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Communication link location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Communication link location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of the partner server.
     * 
     */
    @OutputExport(name="partnerServer", type=String.class, parameters={})
    private Output<String> partnerServer;

    /**
     * @return The name of the partner server.
     * 
     */
    public Output<String> getPartnerServer() {
        return this.partnerServer;
    }
    /**
     * The state.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state.
     * 
     */
    public Output<String> getState() {
        return this.state;
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
    public ServerCommunicationLink(String name) {
        this(name, ServerCommunicationLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerCommunicationLink(String name, ServerCommunicationLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerCommunicationLink(String name, ServerCommunicationLinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerCommunicationLink", name, args == null ? ServerCommunicationLinkArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServerCommunicationLink(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerCommunicationLink", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20140401:ServerCommunicationLink").build())
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
    public static ServerCommunicationLink get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerCommunicationLink(name, id, options);
    }
}
