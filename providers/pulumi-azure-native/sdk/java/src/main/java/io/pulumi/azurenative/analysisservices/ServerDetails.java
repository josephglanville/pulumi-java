// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.analysisservices.ServerDetailsArgs;
import io.pulumi.azurenative.analysisservices.outputs.GatewayDetailsResponse;
import io.pulumi.azurenative.analysisservices.outputs.IPv4FirewallSettingsResponse;
import io.pulumi.azurenative.analysisservices.outputs.ResourceSkuResponse;
import io.pulumi.azurenative.analysisservices.outputs.ServerAdministratorsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents an instance of an Analysis Services resource.
 * API Version: 2017-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:analysisservices:ServerDetails azsdktest /subscriptions/613192d7-503f-477a-9cfe-4efc3ee2bd60/resourceGroups/TestRG/providers/Microsoft.AnalysisServices/servers/azsdktest 
 * ```
 * 
 */
@ResourceType(type="azure-native:analysisservices:ServerDetails")
public class ServerDetails extends io.pulumi.resources.CustomResource {
    /**
     * A collection of AS server administrators
     * 
     */
    @Export(name="asAdministrators", type=ServerAdministratorsResponse.class, parameters={})
    private Output</* @Nullable */ ServerAdministratorsResponse> asAdministrators;

    /**
     * @return A collection of AS server administrators
     * 
     */
    public Output</* @Nullable */ ServerAdministratorsResponse> getAsAdministrators() {
        return this.asAdministrators;
    }
    /**
     * The SAS container URI to the backup container.
     * 
     */
    @Export(name="backupBlobContainerUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> backupBlobContainerUri;

    /**
     * @return The SAS container URI to the backup container.
     * 
     */
    public Output</* @Nullable */ String> getBackupBlobContainerUri() {
        return this.backupBlobContainerUri;
    }
    /**
     * The gateway details configured for the AS server.
     * 
     */
    @Export(name="gatewayDetails", type=GatewayDetailsResponse.class, parameters={})
    private Output</* @Nullable */ GatewayDetailsResponse> gatewayDetails;

    /**
     * @return The gateway details configured for the AS server.
     * 
     */
    public Output</* @Nullable */ GatewayDetailsResponse> getGatewayDetails() {
        return this.gatewayDetails;
    }
    /**
     * The firewall settings for the AS server.
     * 
     */
    @Export(name="ipV4FirewallSettings", type=IPv4FirewallSettingsResponse.class, parameters={})
    private Output</* @Nullable */ IPv4FirewallSettingsResponse> ipV4FirewallSettings;

    /**
     * @return The firewall settings for the AS server.
     * 
     */
    public Output</* @Nullable */ IPv4FirewallSettingsResponse> getIpV4FirewallSettings() {
        return this.ipV4FirewallSettings;
    }
    /**
     * Location of the Analysis Services resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the Analysis Services resource.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The managed mode of the server (0 = not managed, 1 = managed).
     * 
     */
    @Export(name="managedMode", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> managedMode;

    /**
     * @return The managed mode of the server (0 = not managed, 1 = managed).
     * 
     */
    public Output</* @Nullable */ Integer> getManagedMode() {
        return this.managedMode;
    }
    /**
     * The name of the Analysis Services resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Analysis Services resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current deployment state of Analysis Services resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment state of Analysis Services resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * How the read-write server's participation in the query pool is controlled.<br/>It can have the following values: <ul><li>readOnly - indicates that the read-write server is intended not to participate in query operations</li><li>all - indicates that the read-write server can participate in query operations</li></ul>Specifying readOnly when capacity is 1 results in error.
     * 
     */
    @Export(name="querypoolConnectionMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> querypoolConnectionMode;

    /**
     * @return How the read-write server's participation in the query pool is controlled.<br/>It can have the following values: <ul><li>readOnly - indicates that the read-write server is intended not to participate in query operations</li><li>all - indicates that the read-write server can participate in query operations</li></ul>Specifying readOnly when capacity is 1 results in error.
     * 
     */
    public Output</* @Nullable */ String> getQuerypoolConnectionMode() {
        return this.querypoolConnectionMode;
    }
    /**
     * The full name of the Analysis Services resource.
     * 
     */
    @Export(name="serverFullName", type=String.class, parameters={})
    private Output<String> serverFullName;

    /**
     * @return The full name of the Analysis Services resource.
     * 
     */
    public Output<String> getServerFullName() {
        return this.serverFullName;
    }
    /**
     * The server monitor mode for AS server
     * 
     */
    @Export(name="serverMonitorMode", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> serverMonitorMode;

    /**
     * @return The server monitor mode for AS server
     * 
     */
    public Output</* @Nullable */ Integer> getServerMonitorMode() {
        return this.serverMonitorMode;
    }
    /**
     * The SKU of the Analysis Services resource.
     * 
     */
    @Export(name="sku", type=ResourceSkuResponse.class, parameters={})
    private Output<ResourceSkuResponse> sku;

    /**
     * @return The SKU of the Analysis Services resource.
     * 
     */
    public Output<ResourceSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The current state of Analysis Services resource. The state is to indicate more states outside of resource provisioning.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of Analysis Services resource. The state is to indicate more states outside of resource provisioning.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of additional resource provisioning properties.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the Analysis Services resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the Analysis Services resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ServerDetailsArgs.Builder a);
    }
    private static io.pulumi.azurenative.analysisservices.ServerDetailsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.analysisservices.ServerDetailsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServerDetails(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerDetails(String name) {
        this(name, ServerDetailsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerDetails(String name, ServerDetailsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerDetails(String name, ServerDetailsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:analysisservices:ServerDetails", name, args == null ? ServerDetailsArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ServerDetails(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:analysisservices:ServerDetails", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:analysisservices/v20160516:ServerDetails").build()),
                Output.of(Alias.builder().type("azure-native:analysisservices/v20170714:ServerDetails").build()),
                Output.of(Alias.builder().type("azure-native:analysisservices/v20170801:ServerDetails").build()),
                Output.of(Alias.builder().type("azure-native:analysisservices/v20170801beta:ServerDetails").build())
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
    public static ServerDetails get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerDetails(name, id, options);
    }
}
