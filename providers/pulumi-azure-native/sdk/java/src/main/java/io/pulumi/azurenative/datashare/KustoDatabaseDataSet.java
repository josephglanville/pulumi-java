// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.KustoDatabaseDataSetArgs;
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
 * A kusto database data set.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:KustoDatabaseDataSet dataset1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/sourceAccount/shares/share1/dataSets/dataset1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:KustoDatabaseDataSet")
public class KustoDatabaseDataSet extends io.pulumi.resources.CustomResource {
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
     * Expected value is 'KustoDatabase'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is 'KustoDatabase'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource id of the kusto database.
     * 
     */
    @OutputExport(name="kustoDatabaseResourceId", type=String.class, parameters={})
    private Output<String> kustoDatabaseResourceId;

    /**
     * @return Resource id of the kusto database.
     * 
     */
    public Output<String> getKustoDatabaseResourceId() {
        return this.kustoDatabaseResourceId;
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
     * Provisioning state of the kusto database data set.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the kusto database data set.
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
    public KustoDatabaseDataSet(String name) {
        this(name, KustoDatabaseDataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KustoDatabaseDataSet(String name, KustoDatabaseDataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KustoDatabaseDataSet(String name, KustoDatabaseDataSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:KustoDatabaseDataSet", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private KustoDatabaseDataSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:KustoDatabaseDataSet", name, null, makeResourceOptions(options, id));
    }

    private static KustoDatabaseDataSetArgs makeArgs(KustoDatabaseDataSetArgs args) {
        var builder = args == null ? KustoDatabaseDataSetArgs.builder() : KustoDatabaseDataSetArgs.builder(args);
        return builder
            .setKind("KustoDatabase")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:KustoDatabaseDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:KustoDatabaseDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:KustoDatabaseDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:KustoDatabaseDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:KustoDatabaseDataSet").build())
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
    public static KustoDatabaseDataSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KustoDatabaseDataSet(name, id, options);
    }
}
