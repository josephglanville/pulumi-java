// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.maintenance.ConfigurationAssignmentArgs;
import io.pulumi.azurenative.maintenance.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Configuration Assignment
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:maintenance:ConfigurationAssignment workervmConfiguration /subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Compute/virtualMachineScaleSets/smdtest1/providers/Microsoft.Maintenance/configurationAssignments/workervmConfiguration 
 * ```
 * 
 */
@ResourceType(type="azure-native:maintenance:ConfigurationAssignment")
public class ConfigurationAssignment extends io.pulumi.resources.CustomResource {
    /**
     * Location of the resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the resource
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The maintenance configuration Id
     * 
     */
    @Export(name="maintenanceConfigurationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceConfigurationId;

    /**
     * @return The maintenance configuration Id
     * 
     */
    public Output</* @Nullable */ String> getMaintenanceConfigurationId() {
        return this.maintenanceConfigurationId;
    }
    /**
     * Name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The unique resourceId
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return The unique resourceId
     * 
     */
    public Output</* @Nullable */ String> getResourceId() {
        return this.resourceId;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationAssignment(String name) {
        this(name, ConfigurationAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationAssignment(String name, ConfigurationAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationAssignment(String name, ConfigurationAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:maintenance:ConfigurationAssignment", name, args == null ? ConfigurationAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationAssignment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:maintenance:ConfigurationAssignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:maintenance/v20210401preview:ConfigurationAssignment").build()),
                Output.of(Alias.builder().type("azure-native:maintenance/v20210901preview:ConfigurationAssignment").build())
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
    public static ConfigurationAssignment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationAssignment(name, id, options);
    }
}
