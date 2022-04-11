// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.communication;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.communication.CommunicationServiceArgs;
import io.pulumi.azurenative.communication.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A class representing a CommunicationService resource.
 * API Version: 2020-08-20.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:communication:CommunicationService MyCommunicationResource /subscriptions/12345/resourceGroups/MyResourceGroup/providers/Microsoft.Communication/CommunicationServices/MyCommunicationResource 
 * ```
 * 
 */
@ResourceType(type="azure-native:communication:CommunicationService")
public class CommunicationService extends io.pulumi.resources.CustomResource {
    /**
     * The location where the communication service stores its data at rest.
     * 
     */
    @Export(name="dataLocation", type=String.class, parameters={})
    private Output<String> dataLocation;

    /**
     * @return The location where the communication service stores its data at rest.
     * 
     */
    public Output<String> getDataLocation() {
        return this.dataLocation;
    }
    /**
     * FQDN of the CommunicationService instance.
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return FQDN of the CommunicationService instance.
     * 
     */
    public Output<String> getHostName() {
        return this.hostName;
    }
    /**
     * The immutable resource Id of the communication service.
     * 
     */
    @Export(name="immutableResourceId", type=String.class, parameters={})
    private Output<String> immutableResourceId;

    /**
     * @return The immutable resource Id of the communication service.
     * 
     */
    public Output<String> getImmutableResourceId() {
        return this.immutableResourceId;
    }
    /**
     * The Azure location where the CommunicationService is running.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The Azure location where the CommunicationService is running.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource ID of an Azure Notification Hub linked to this resource.
     * 
     */
    @Export(name="notificationHubId", type=String.class, parameters={})
    private Output<String> notificationHubId;

    /**
     * @return Resource ID of an Azure Notification Hub linked to this resource.
     * 
     */
    public Output<String> getNotificationHubId() {
        return this.notificationHubId;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Version of the CommunicationService resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Version of the CommunicationService resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CommunicationService(String name) {
        this(name, CommunicationServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CommunicationService(String name, CommunicationServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CommunicationService(String name, CommunicationServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:communication:CommunicationService", name, args == null ? CommunicationServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CommunicationService(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:communication:CommunicationService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:communication/v20200820:CommunicationService").build()),
                Output.of(Alias.builder().type("azure-native:communication/v20200820preview:CommunicationService").build())
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
    public static CommunicationService get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CommunicationService(name, id, options);
    }
}
