// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.KustoClusterDataSetMappingArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Kusto cluster data set mapping
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:KustoClusterDataSetMapping datasetMappingName1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/consumerAccount/shareSubscriptions/ShareSubscription1/dataSetMappings/datasetMappingName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:KustoClusterDataSetMapping")
public class KustoClusterDataSetMapping extends io.pulumi.resources.CustomResource {
    /**
     * The id of the source data set.
     * 
     */
    @OutputExport(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return The id of the source data set.
     * 
     */
    public Output<String> getDataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
     */
    @OutputExport(name="dataSetMappingStatus", type=String.class, parameters={})
    private Output<String> dataSetMappingStatus;

    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    public Output<String> getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * Kind of data set mapping.
     * Expected value is 'KustoCluster'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is 'KustoCluster'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource id of the sink kusto cluster.
     * 
     */
    @OutputExport(name="kustoClusterResourceId", type=String.class, parameters={})
    private Output<String> kustoClusterResourceId;

    /**
     * @return Resource id of the sink kusto cluster.
     * 
     */
    public Output<String> getKustoClusterResourceId() {
        return this.kustoClusterResourceId;
    }
    /**
     * Location of the sink kusto cluster.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the sink kusto cluster.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Name of the azure resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KustoClusterDataSetMapping(String name) {
        this(name, KustoClusterDataSetMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KustoClusterDataSetMapping(String name, KustoClusterDataSetMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KustoClusterDataSetMapping(String name, KustoClusterDataSetMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:KustoClusterDataSetMapping", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private KustoClusterDataSetMapping(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:KustoClusterDataSetMapping", name, null, makeResourceOptions(options, id));
    }

    private static KustoClusterDataSetMappingArgs makeArgs(KustoClusterDataSetMappingArgs args) {
        var builder = args == null ? KustoClusterDataSetMappingArgs.builder() : KustoClusterDataSetMappingArgs.builder(args);
        return builder
            .setKind("KustoCluster")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:KustoClusterDataSetMapping").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:KustoClusterDataSetMapping").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:KustoClusterDataSetMapping").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:KustoClusterDataSetMapping").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:KustoClusterDataSetMapping").build())
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
    public static KustoClusterDataSetMapping get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KustoClusterDataSetMapping(name, id, options);
    }
}
