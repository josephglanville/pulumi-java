// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.SynapseWorkspaceSqlPoolTableDataSetMappingArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Synapse Workspace Sql Pool Table data set mapping
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:SynapseWorkspaceSqlPoolTableDataSetMapping datasetMappingName1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/consumerAccount/shareSubscriptions/ShareSubscription1/dataSetMappings/datasetMappingName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:SynapseWorkspaceSqlPoolTableDataSetMapping")
public class SynapseWorkspaceSqlPoolTableDataSetMapping extends io.pulumi.resources.CustomResource {
    /**
     * The id of the source data set.
     * 
     */
    @Export(name="dataSetId", type=String.class, parameters={})
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
    @Export(name="dataSetMappingStatus", type=String.class, parameters={})
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
     * Expected value is 'SynapseWorkspaceSqlPoolTable'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is 'SynapseWorkspaceSqlPoolTable'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource id of the Synapse Workspace SQL Pool Table
     * 
     */
    @Export(name="synapseWorkspaceSqlPoolTableResourceId", type=String.class, parameters={})
    private Output<String> synapseWorkspaceSqlPoolTableResourceId;

    /**
     * @return Resource id of the Synapse Workspace SQL Pool Table
     * 
     */
    public Output<String> getSynapseWorkspaceSqlPoolTableResourceId() {
        return this.synapseWorkspaceSqlPoolTableResourceId;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
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
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SynapseWorkspaceSqlPoolTableDataSetMappingArgs.Builder a);
    }
    private static io.pulumi.azurenative.datashare.SynapseWorkspaceSqlPoolTableDataSetMappingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.datashare.SynapseWorkspaceSqlPoolTableDataSetMappingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SynapseWorkspaceSqlPoolTableDataSetMapping(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SynapseWorkspaceSqlPoolTableDataSetMapping(String name) {
        this(name, SynapseWorkspaceSqlPoolTableDataSetMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SynapseWorkspaceSqlPoolTableDataSetMapping(String name, SynapseWorkspaceSqlPoolTableDataSetMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SynapseWorkspaceSqlPoolTableDataSetMapping(String name, SynapseWorkspaceSqlPoolTableDataSetMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:SynapseWorkspaceSqlPoolTableDataSetMapping", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private SynapseWorkspaceSqlPoolTableDataSetMapping(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:SynapseWorkspaceSqlPoolTableDataSetMapping", name, null, makeResourceOptions(options, id));
    }

    private static SynapseWorkspaceSqlPoolTableDataSetMappingArgs makeArgs(SynapseWorkspaceSqlPoolTableDataSetMappingArgs args) {
        var builder = args == null ? SynapseWorkspaceSqlPoolTableDataSetMappingArgs.builder() : SynapseWorkspaceSqlPoolTableDataSetMappingArgs.builder(args);
        return builder
            .kind("SynapseWorkspaceSqlPoolTable")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:SynapseWorkspaceSqlPoolTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:SynapseWorkspaceSqlPoolTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:SynapseWorkspaceSqlPoolTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:SynapseWorkspaceSqlPoolTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:SynapseWorkspaceSqlPoolTableDataSetMapping").build())
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
    public static SynapseWorkspaceSqlPoolTableDataSetMapping get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SynapseWorkspaceSqlPoolTableDataSetMapping(name, id, options);
    }
}
