// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.KustoClusterDataSetArgs;
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
 * A kusto cluster data set.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:KustoClusterDataSet dataset1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/sourceAccount/shares/share1/dataSets/dataset1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:KustoClusterDataSet")
public class KustoClusterDataSet extends io.pulumi.resources.CustomResource {
    /**
     * Unique id for identifying a data set resource
     * 
     */
    @OutputExport(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return Unique id for identifying a data set resource
     * 
     */
    public Output<String> getDataSetId() {
        return this.dataSetId;
    }
    /**
     * Kind of data set.
     * Expected value is 'KustoCluster'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is 'KustoCluster'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource id of the kusto cluster.
     * 
     */
    @OutputExport(name="kustoClusterResourceId", type=String.class, parameters={})
    private Output<String> kustoClusterResourceId;

    /**
     * @return Resource id of the kusto cluster.
     * 
     */
    public Output<String> getKustoClusterResourceId() {
        return this.kustoClusterResourceId;
    }
    /**
     * Location of the kusto cluster.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the kusto cluster.
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
     * Provisioning state of the kusto cluster data set.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the kusto cluster data set.
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
    public KustoClusterDataSet(String name) {
        this(name, KustoClusterDataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KustoClusterDataSet(String name, KustoClusterDataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KustoClusterDataSet(String name, KustoClusterDataSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:KustoClusterDataSet", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private KustoClusterDataSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:KustoClusterDataSet", name, null, makeResourceOptions(options, id));
    }

    private static KustoClusterDataSetArgs makeArgs(KustoClusterDataSetArgs args) {
        var builder = args == null ? KustoClusterDataSetArgs.builder() : KustoClusterDataSetArgs.builder(args);
        return builder
            .setKind("KustoCluster")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:KustoClusterDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:KustoClusterDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:KustoClusterDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:KustoClusterDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:KustoClusterDataSet").build())
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
    public static KustoClusterDataSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KustoClusterDataSet(name, id, options);
    }
}
