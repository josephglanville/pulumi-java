// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.AATPDataConnectorArgs;
import io.pulumi.azurenative.securityinsights.outputs.AlertsDataTypeOfDataConnectorResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents AATP (Azure Advanced Threat Protection) data connector.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:AATPDataConnector 73e01a99-5cd7-4139-a149-9f2736ff2ab5 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/dataConnectors/73e01a99-5cd7-4139-a149-9f2736ff2ab5 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:AATPDataConnector")
public class AATPDataConnector extends io.pulumi.resources.CustomResource {
    /**
     * The available data types for the connector.
     * 
     */
    @Export(name="dataTypes", type=AlertsDataTypeOfDataConnectorResponse.class, parameters={})
    private Output</* @Nullable */ AlertsDataTypeOfDataConnectorResponse> dataTypes;

    /**
     * @return The available data types for the connector.
     * 
     */
    public Output</* @Nullable */ AlertsDataTypeOfDataConnectorResponse> getDataTypes() {
        return this.dataTypes;
    }
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * The kind of the data connector
     * Expected value is 'AzureAdvancedThreatProtection'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the data connector
     * Expected value is 'AzureAdvancedThreatProtection'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The tenant id to connect to, and get the data from.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return The tenant id to connect to, and get the data from.
     * 
     */
    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AATPDataConnector(String name) {
        this(name, AATPDataConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AATPDataConnector(String name, AATPDataConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AATPDataConnector(String name, AATPDataConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:AATPDataConnector", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private AATPDataConnector(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:AATPDataConnector", name, null, makeResourceOptions(options, id));
    }

    private static AATPDataConnectorArgs makeArgs(AATPDataConnectorArgs args) {
        var builder = args == null ? AATPDataConnectorArgs.builder() : AATPDataConnectorArgs.builder(args);
        return builder
            .kind("AzureAdvancedThreatProtection")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20190101preview:AATPDataConnector").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20200101:AATPDataConnector").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210301preview:AATPDataConnector").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:AATPDataConnector").build())
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
    public static AATPDataConnector get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AATPDataConnector(name, id, options);
    }
}
