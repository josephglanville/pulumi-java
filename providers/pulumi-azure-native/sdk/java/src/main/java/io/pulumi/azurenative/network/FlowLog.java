// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.FlowLogArgs;
import io.pulumi.azurenative.network.outputs.FlowLogFormatParametersResponse;
import io.pulumi.azurenative.network.outputs.RetentionPolicyParametersResponse;
import io.pulumi.azurenative.network.outputs.TrafficAnalyticsPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A flow log resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:FlowLog Microsoft.Networkdesmond-rgdesmondcentral-nsg /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkWatchers/nw/FlowLogs/fl 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:FlowLog")
public class FlowLog extends io.pulumi.resources.CustomResource {
    /**
     * Flag to enable/disable flow logging.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Flag to enable/disable flow logging.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Parameters that define the configuration of traffic analytics.
     * 
     */
    @OutputExport(name="flowAnalyticsConfiguration", type=TrafficAnalyticsPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ TrafficAnalyticsPropertiesResponse> flowAnalyticsConfiguration;

    /**
     * @return Parameters that define the configuration of traffic analytics.
     * 
     */
    public Output</* @Nullable */ TrafficAnalyticsPropertiesResponse> getFlowAnalyticsConfiguration() {
        return this.flowAnalyticsConfiguration;
    }
    /**
     * Parameters that define the flow log format.
     * 
     */
    @OutputExport(name="format", type=FlowLogFormatParametersResponse.class, parameters={})
    private Output</* @Nullable */ FlowLogFormatParametersResponse> format;

    /**
     * @return Parameters that define the flow log format.
     * 
     */
    public Output</* @Nullable */ FlowLogFormatParametersResponse> getFormat() {
        return this.format;
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
     * The provisioning state of the flow log.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the flow log.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Parameters that define the retention policy for flow log.
     * 
     */
    @OutputExport(name="retentionPolicy", type=RetentionPolicyParametersResponse.class, parameters={})
    private Output</* @Nullable */ RetentionPolicyParametersResponse> retentionPolicy;

    /**
     * @return Parameters that define the retention policy for flow log.
     * 
     */
    public Output</* @Nullable */ RetentionPolicyParametersResponse> getRetentionPolicy() {
        return this.retentionPolicy;
    }
    /**
     * ID of the storage account which is used to store the flow log.
     * 
     */
    @OutputExport(name="storageId", type=String.class, parameters={})
    private Output<String> storageId;

    /**
     * @return ID of the storage account which is used to store the flow log.
     * 
     */
    public Output<String> getStorageId() {
        return this.storageId;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Guid of network security group to which flow log will be applied.
     * 
     */
    @OutputExport(name="targetResourceGuid", type=String.class, parameters={})
    private Output<String> targetResourceGuid;

    /**
     * @return Guid of network security group to which flow log will be applied.
     * 
     */
    public Output<String> getTargetResourceGuid() {
        return this.targetResourceGuid;
    }
    /**
     * ID of network security group to which flow log will be applied.
     * 
     */
    @OutputExport(name="targetResourceId", type=String.class, parameters={})
    private Output<String> targetResourceId;

    /**
     * @return ID of network security group to which flow log will be applied.
     * 
     */
    public Output<String> getTargetResourceId() {
        return this.targetResourceId;
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
    public FlowLog(String name) {
        this(name, FlowLogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlowLog(String name, FlowLogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlowLog(String name, FlowLogArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:FlowLog", name, args == null ? FlowLogArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FlowLog(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:FlowLog", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20191101:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:FlowLog").build())
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
    public static FlowLog get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FlowLog(name, id, options);
    }
}
