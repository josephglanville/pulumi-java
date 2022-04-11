// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.IotSecuritySolutionArgs;
import io.pulumi.azurenative.security.outputs.AdditionalWorkspacesPropertiesResponse;
import io.pulumi.azurenative.security.outputs.RecommendationConfigurationPropertiesResponse;
import io.pulumi.azurenative.security.outputs.SystemDataResponse;
import io.pulumi.azurenative.security.outputs.UserDefinedResourcesPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * IoT Security solution configuration and resource information.
 * API Version: 2019-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:IotSecuritySolution default /subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/MyGroup/providers/Microsoft.Security/Locations/eastus/IoTSecuritySolutions/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:IotSecuritySolution")
public class IotSecuritySolution extends io.pulumi.resources.CustomResource {
    /**
     * List of additional workspaces
     * 
     */
    @Export(name="additionalWorkspaces", type=List.class, parameters={AdditionalWorkspacesPropertiesResponse.class})
    private Output</* @Nullable */ List<AdditionalWorkspacesPropertiesResponse>> additionalWorkspaces;

    /**
     * @return List of additional workspaces
     * 
     */
    public Output</* @Nullable */ List<AdditionalWorkspacesPropertiesResponse>> getAdditionalWorkspaces() {
        return this.additionalWorkspaces;
    }
    /**
     * List of resources that were automatically discovered as relevant to the security solution.
     * 
     */
    @Export(name="autoDiscoveredResources", type=List.class, parameters={String.class})
    private Output<List<String>> autoDiscoveredResources;

    /**
     * @return List of resources that were automatically discovered as relevant to the security solution.
     * 
     */
    public Output<List<String>> getAutoDiscoveredResources() {
        return this.autoDiscoveredResources;
    }
    /**
     * Disabled data sources. Disabling these data sources compromises the system.
     * 
     */
    @Export(name="disabledDataSources", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> disabledDataSources;

    /**
     * @return Disabled data sources. Disabling these data sources compromises the system.
     * 
     */
    public Output</* @Nullable */ List<String>> getDisabledDataSources() {
        return this.disabledDataSources;
    }
    /**
     * Resource display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Resource display name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * List of additional options for exporting to workspace data.
     * 
     */
    @Export(name="export", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> export;

    /**
     * @return List of additional options for exporting to workspace data.
     * 
     */
    public Output</* @Nullable */ List<String>> getExport() {
        return this.export;
    }
    /**
     * IoT Hub resource IDs
     * 
     */
    @Export(name="iotHubs", type=List.class, parameters={String.class})
    private Output<List<String>> iotHubs;

    /**
     * @return IoT Hub resource IDs
     * 
     */
    public Output<List<String>> getIotHubs() {
        return this.iotHubs;
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of the configuration status for each recommendation type.
     * 
     */
    @Export(name="recommendationsConfiguration", type=List.class, parameters={RecommendationConfigurationPropertiesResponse.class})
    private Output</* @Nullable */ List<RecommendationConfigurationPropertiesResponse>> recommendationsConfiguration;

    /**
     * @return List of the configuration status for each recommendation type.
     * 
     */
    public Output</* @Nullable */ List<RecommendationConfigurationPropertiesResponse>> getRecommendationsConfiguration() {
        return this.recommendationsConfiguration;
    }
    /**
     * Status of the IoT Security solution.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the IoT Security solution.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
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
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
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
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Unmasked IP address logging status
     * 
     */
    @Export(name="unmaskedIpLoggingStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> unmaskedIpLoggingStatus;

    /**
     * @return Unmasked IP address logging status
     * 
     */
    public Output</* @Nullable */ String> getUnmaskedIpLoggingStatus() {
        return this.unmaskedIpLoggingStatus;
    }
    /**
     * Properties of the IoT Security solution's user defined resources.
     * 
     */
    @Export(name="userDefinedResources", type=UserDefinedResourcesPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ UserDefinedResourcesPropertiesResponse> userDefinedResources;

    /**
     * @return Properties of the IoT Security solution's user defined resources.
     * 
     */
    public Output</* @Nullable */ UserDefinedResourcesPropertiesResponse> getUserDefinedResources() {
        return this.userDefinedResources;
    }
    /**
     * Workspace resource ID
     * 
     */
    @Export(name="workspace", type=String.class, parameters={})
    private Output</* @Nullable */ String> workspace;

    /**
     * @return Workspace resource ID
     * 
     */
    public Output</* @Nullable */ String> getWorkspace() {
        return this.workspace;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IotSecuritySolution(String name) {
        this(name, IotSecuritySolutionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IotSecuritySolution(String name, IotSecuritySolutionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IotSecuritySolution(String name, IotSecuritySolutionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:IotSecuritySolution", name, args == null ? IotSecuritySolutionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IotSecuritySolution(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:IotSecuritySolution", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:security/v20170801preview:IotSecuritySolution").build()),
                Output.of(Alias.builder().type("azure-native:security/v20190801:IotSecuritySolution").build())
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
    public static IotSecuritySolution get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IotSecuritySolution(name, id, options);
    }
}
