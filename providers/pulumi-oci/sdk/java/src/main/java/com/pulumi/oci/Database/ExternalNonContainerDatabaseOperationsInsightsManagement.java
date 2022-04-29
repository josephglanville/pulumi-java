// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Database.ExternalNonContainerDatabaseOperationsInsightsManagementArgs;
import com.pulumi.oci.Database.inputs.ExternalNonContainerDatabaseOperationsInsightsManagementState;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource provides the External Non Container Database Operations Insights Management resource in Oracle Cloud Infrastructure Database service.
 * 
 * Enable Operations Insights for the external non-container database.
 * When deleting this resource block , we call disable if it was in enabled state .
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Import is not supported for this resource.
 * 
 */
@ResourceType(type="oci:Database/externalNonContainerDatabaseOperationsInsightsManagement:ExternalNonContainerDatabaseOperationsInsightsManagement")
public class ExternalNonContainerDatabaseOperationsInsightsManagement extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) Enabling OPSI on External non-container Databases . Requires boolean value &#34;true&#34; or &#34;false&#34;.
     * 
     */
    @Export(name="enableOperationsInsights", type=Boolean.class, parameters={})
    private Output<Boolean> enableOperationsInsights;

    /**
     * @return (Updatable) Enabling OPSI on External non-container Databases . Requires boolean value &#34;true&#34; or &#34;false&#34;.
     * 
     */
    public Output<Boolean> enableOperationsInsights() {
        return this.enableOperationsInsights;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
     * 
     */
    @Export(name="externalDatabaseConnectorId", type=String.class, parameters={})
    private Output<String> externalDatabaseConnectorId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
     * 
     */
    public Output<String> externalDatabaseConnectorId() {
        return this.externalDatabaseConnectorId;
    }
    /**
     * The external non-container database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Export(name="externalNonContainerDatabaseId", type=String.class, parameters={})
    private Output<String> externalNonContainerDatabaseId;

    /**
     * @return The external non-container database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> externalNonContainerDatabaseId() {
        return this.externalNonContainerDatabaseId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExternalNonContainerDatabaseOperationsInsightsManagement(String name) {
        this(name, ExternalNonContainerDatabaseOperationsInsightsManagementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalNonContainerDatabaseOperationsInsightsManagement(String name, ExternalNonContainerDatabaseOperationsInsightsManagementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalNonContainerDatabaseOperationsInsightsManagement(String name, ExternalNonContainerDatabaseOperationsInsightsManagementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Database/externalNonContainerDatabaseOperationsInsightsManagement:ExternalNonContainerDatabaseOperationsInsightsManagement", name, args == null ? ExternalNonContainerDatabaseOperationsInsightsManagementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExternalNonContainerDatabaseOperationsInsightsManagement(String name, Output<String> id, @Nullable ExternalNonContainerDatabaseOperationsInsightsManagementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Database/externalNonContainerDatabaseOperationsInsightsManagement:ExternalNonContainerDatabaseOperationsInsightsManagement", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ExternalNonContainerDatabaseOperationsInsightsManagement get(String name, Output<String> id, @Nullable ExternalNonContainerDatabaseOperationsInsightsManagementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalNonContainerDatabaseOperationsInsightsManagement(name, id, state, options);
    }
}
