// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.notificationhubs.NamespaceArgs;
import io.pulumi.azurenative.notificationhubs.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Description of a Namespace resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:notificationhubs:Namespace sdk-Namespace-2924 /subscriptions/29cfa613-cbbc-4512-b1d6-1b3a92c7fa40/resourceGroups/ArunMonocle/providers/Microsoft.NotificationHubs/namespaces/sdk-Namespace-2924 
 * ```
 * 
 */
@ResourceType(type="azure-native:notificationhubs:Namespace")
public class Namespace extends io.pulumi.resources.CustomResource {
    /**
     * The time the namespace was created.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdAt;

    /**
     * @return The time the namespace was created.
     * 
     */
    public Output</* @Nullable */ String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Whether or not the namespace is set as Critical.
     * 
     */
    @OutputExport(name="critical", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> critical;

    /**
     * @return Whether or not the namespace is set as Critical.
     * 
     */
    public Output</* @Nullable */ Boolean> getCritical() {
        return this.critical;
    }
    /**
     * Data center for the namespace
     * 
     */
    @OutputExport(name="dataCenter", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataCenter;

    /**
     * @return Data center for the namespace
     * 
     */
    public Output</* @Nullable */ String> getDataCenter() {
        return this.dataCenter;
    }
    /**
     * Whether or not the namespace is currently enabled.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether or not the namespace is currently enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Identifier for Azure Insights metrics
     * 
     */
    @OutputExport(name="metricId", type=String.class, parameters={})
    private Output<String> metricId;

    /**
     * @return Identifier for Azure Insights metrics
     * 
     */
    public Output<String> getMetricId() {
        return this.metricId;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The namespace type.
     * 
     */
    @OutputExport(name="namespaceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespaceType;

    /**
     * @return The namespace type.
     * 
     */
    public Output</* @Nullable */ String> getNamespaceType() {
        return this.namespaceType;
    }
    /**
     * Provisioning state of the Namespace.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Provisioning state of the Namespace.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Specifies the targeted region in which the namespace should be created. It can be any of the following values: Australia East, Australia Southeast, Central US, East US, East US 2, West US, North Central US, South Central US, East Asia, Southeast Asia, Brazil South, Japan East, Japan West, North Europe, West Europe
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return Specifies the targeted region in which the namespace should be created. It can be any of the following values: Australia East, Australia Southeast, Central US, East US, East US 2, West US, North Central US, South Central US, East Asia, Southeast Asia, Brazil South, Japan East, Japan West, North Europe, West Europe
     * 
     */
    public Output</* @Nullable */ String> getRegion() {
        return this.region;
    }
    /**
     * ScaleUnit where the namespace gets created
     * 
     */
    @OutputExport(name="scaleUnit", type=String.class, parameters={})
    private Output</* @Nullable */ String> scaleUnit;

    /**
     * @return ScaleUnit where the namespace gets created
     * 
     */
    public Output</* @Nullable */ String> getScaleUnit() {
        return this.scaleUnit;
    }
    /**
     * Endpoint you can use to perform NotificationHub operations.
     * 
     */
    @OutputExport(name="serviceBusEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusEndpoint;

    /**
     * @return Endpoint you can use to perform NotificationHub operations.
     * 
     */
    public Output</* @Nullable */ String> getServiceBusEndpoint() {
        return this.serviceBusEndpoint;
    }
    /**
     * The sku of the created namespace
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku of the created namespace
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 = Suspended4 = Deleting
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 = Suspended4 = Deleting
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * The Id of the Azure subscription associated with the namespace.
     * 
     */
    @OutputExport(name="subscriptionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subscriptionId;

    /**
     * @return The Id of the Azure subscription associated with the namespace.
     * 
     */
    public Output</* @Nullable */ String> getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The time the namespace was updated.
     * 
     */
    @OutputExport(name="updatedAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> updatedAt;

    /**
     * @return The time the namespace was updated.
     * 
     */
    public Output</* @Nullable */ String> getUpdatedAt() {
        return this.updatedAt;
    }

    public interface BuilderApplicator {
        public void apply(NamespaceArgs.Builder a);
    }
    private static io.pulumi.azurenative.notificationhubs.NamespaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.notificationhubs.NamespaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Namespace(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Namespace(String name) {
        this(name, NamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Namespace(String name, NamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Namespace(String name, NamespaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:notificationhubs:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Namespace(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:notificationhubs:Namespace", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:notificationhubs/v20140901:Namespace").build()),
                Output.of(Alias.builder().setType("azure-native:notificationhubs/v20160301:Namespace").build()),
                Output.of(Alias.builder().setType("azure-native:notificationhubs/v20170401:Namespace").build())
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
    public static Namespace get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, options);
    }
}
