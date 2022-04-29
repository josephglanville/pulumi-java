// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Database.ExternalPluggableDatabaseManagementArgs;
import com.pulumi.oci.Database.inputs.ExternalPluggableDatabaseManagementState;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource provides the External Pluggable Database Management resource in Oracle Cloud Infrastructure Database service.
 * 
 * Enable Database Management Service for the external pluggable database.
 * For more information about the Database Management Service, see
 * [Database Management Service](https://docs.cloud.oracle.com/iaas/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Import is not supported for this resource.
 * 
 */
@ResourceType(type="oci:Database/externalPluggableDatabaseManagement:ExternalPluggableDatabaseManagement")
public class ExternalPluggableDatabaseManagement extends com.pulumi.resources.CustomResource {
    @Export(name="enableManagement", type=Boolean.class, parameters={})
    private Output<Boolean> enableManagement;

    public Output<Boolean> enableManagement() {
        return this.enableManagement;
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
     * The ExternalPluggableDatabaseId [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Export(name="externalPluggableDatabaseId", type=String.class, parameters={})
    private Output<String> externalPluggableDatabaseId;

    /**
     * @return The ExternalPluggableDatabaseId [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> externalPluggableDatabaseId() {
        return this.externalPluggableDatabaseId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExternalPluggableDatabaseManagement(String name) {
        this(name, ExternalPluggableDatabaseManagementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalPluggableDatabaseManagement(String name, ExternalPluggableDatabaseManagementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalPluggableDatabaseManagement(String name, ExternalPluggableDatabaseManagementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Database/externalPluggableDatabaseManagement:ExternalPluggableDatabaseManagement", name, args == null ? ExternalPluggableDatabaseManagementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExternalPluggableDatabaseManagement(String name, Output<String> id, @Nullable ExternalPluggableDatabaseManagementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Database/externalPluggableDatabaseManagement:ExternalPluggableDatabaseManagement", name, state, makeResourceOptions(options, id));
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
    public static ExternalPluggableDatabaseManagement get(String name, Output<String> id, @Nullable ExternalPluggableDatabaseManagementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalPluggableDatabaseManagement(name, id, state, options);
    }
}
