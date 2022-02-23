// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.EventHubDataConnectionArgs;
import io.pulumi.azurenative.synapse.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing an event hub data connection.
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:EventHubDataConnection KustoClusterRPTest4/KustoDatabase8/DataConnections8 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Synapse/workspaces/synapseWorkspaceName/kustopools/KustoClusterRPTest4/Databases/KustoDatabase8/DataConnections/DataConnections8 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:EventHubDataConnection")
public class EventHubDataConnection extends io.pulumi.resources.CustomResource {
    /**
     * The event hub messages compression type
     * 
     */
    @OutputExport(name="compression", type=String.class, parameters={})
    private Output</* @Nullable */ String> compression;

    /**
     * @return The event hub messages compression type
     * 
     */
    public Output</* @Nullable */ String> getCompression() {
        return this.compression;
    }
    /**
     * The event hub consumer group.
     * 
     */
    @OutputExport(name="consumerGroup", type=String.class, parameters={})
    private Output<String> consumerGroup;

    /**
     * @return The event hub consumer group.
     * 
     */
    public Output<String> getConsumerGroup() {
        return this.consumerGroup;
    }
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @OutputExport(name="dataFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataFormat;

    /**
     * @return The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    public Output</* @Nullable */ String> getDataFormat() {
        return this.dataFormat;
    }
    /**
     * The resource ID of the event hub to be used to create a data connection.
     * 
     */
    @OutputExport(name="eventHubResourceId", type=String.class, parameters={})
    private Output<String> eventHubResourceId;

    /**
     * @return The resource ID of the event hub to be used to create a data connection.
     * 
     */
    public Output<String> getEventHubResourceId() {
        return this.eventHubResourceId;
    }
    /**
     * System properties of the event hub
     * 
     */
    @OutputExport(name="eventSystemProperties", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> eventSystemProperties;

    /**
     * @return System properties of the event hub
     * 
     */
    public Output</* @Nullable */ List<String>> getEventSystemProperties() {
        return this.eventSystemProperties;
    }
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'EventHub'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of the endpoint for the data connection
     * Expected value is 'EventHub'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @OutputExport(name="mappingRuleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> mappingRuleName;

    /**
     * @return The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    public Output</* @Nullable */ String> getMappingRuleName() {
        return this.mappingRuleName;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @OutputExport(name="tableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableName;

    /**
     * @return The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    public Output</* @Nullable */ String> getTableName() {
        return this.tableName;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventHubDataConnection(String name) {
        this(name, EventHubDataConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventHubDataConnection(String name, EventHubDataConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventHubDataConnection(String name, EventHubDataConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:EventHubDataConnection", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private EventHubDataConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:EventHubDataConnection", name, null, makeResourceOptions(options, id));
    }

    private static EventHubDataConnectionArgs makeArgs(EventHubDataConnectionArgs args) {
        var builder = args == null ? EventHubDataConnectionArgs.builder() : EventHubDataConnectionArgs.builder(args);
        return builder
            .setKind("EventHub")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:synapse/v20210401preview:EventHubDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601preview:EventHubDataConnection").build())
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
    public static EventHubDataConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventHubDataConnection(name, id, options);
    }
}
