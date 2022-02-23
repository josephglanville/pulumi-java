// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.LabPlanArgs;
import io.pulumi.azurenative.labservices.outputs.AutoShutdownProfileResponse;
import io.pulumi.azurenative.labservices.outputs.ConnectionProfileResponse;
import io.pulumi.azurenative.labservices.outputs.LabPlanNetworkProfileResponse;
import io.pulumi.azurenative.labservices.outputs.SupportInfoResponse;
import io.pulumi.azurenative.labservices.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Lab Plans act as a permission container for creating labs via labs.azure.com. Additionally, they can provide a set of default configurations that will apply at the time of creating a lab, but these defaults can still be overwritten.
 * API Version: 2021-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:labservices:LabPlan testlabplan /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.LabServices/labPlans/testlabplan 
 * ```
 * 
 */
@ResourceType(type="azure-native:labservices:LabPlan")
public class LabPlan extends io.pulumi.resources.CustomResource {
    /**
     * The allowed regions for the lab creator to use when creating labs using this lab plan.
     * 
     */
    @OutputExport(name="allowedRegions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedRegions;

    /**
     * @return The allowed regions for the lab creator to use when creating labs using this lab plan.
     * 
     */
    public Output</* @Nullable */ List<String>> getAllowedRegions() {
        return this.allowedRegions;
    }
    /**
     * The default lab shutdown profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    @OutputExport(name="defaultAutoShutdownProfile", type=AutoShutdownProfileResponse.class, parameters={})
    private Output</* @Nullable */ AutoShutdownProfileResponse> defaultAutoShutdownProfile;

    /**
     * @return The default lab shutdown profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    public Output</* @Nullable */ AutoShutdownProfileResponse> getDefaultAutoShutdownProfile() {
        return this.defaultAutoShutdownProfile;
    }
    /**
     * The default lab connection profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    @OutputExport(name="defaultConnectionProfile", type=ConnectionProfileResponse.class, parameters={})
    private Output</* @Nullable */ ConnectionProfileResponse> defaultConnectionProfile;

    /**
     * @return The default lab connection profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    public Output</* @Nullable */ ConnectionProfileResponse> getDefaultConnectionProfile() {
        return this.defaultConnectionProfile;
    }
    /**
     * The lab plan network profile. To enforce lab network policies they must be defined here and cannot be changed when there are existing labs associated with this lab plan.
     * 
     */
    @OutputExport(name="defaultNetworkProfile", type=LabPlanNetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ LabPlanNetworkProfileResponse> defaultNetworkProfile;

    /**
     * @return The lab plan network profile. To enforce lab network policies they must be defined here and cannot be changed when there are existing labs associated with this lab plan.
     * 
     */
    public Output</* @Nullable */ LabPlanNetworkProfileResponse> getDefaultNetworkProfile() {
        return this.defaultNetworkProfile;
    }
    /**
     * Base Url of the lms instance this lab plan can link lab rosters against.
     * 
     */
    @OutputExport(name="linkedLmsInstance", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkedLmsInstance;

    /**
     * @return Base Url of the lms instance this lab plan can link lab rosters against.
     * 
     */
    public Output</* @Nullable */ String> getLinkedLmsInstance() {
        return this.linkedLmsInstance;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Current provisioning state of the lab plan.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Current provisioning state of the lab plan.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource ID of the Shared Image Gallery attached to this lab plan. When saving a lab template virtual machine image it will be persisted in this gallery. Shared images from the gallery can be made available to use when creating new labs.
     * 
     */
    @OutputExport(name="sharedGalleryId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sharedGalleryId;

    /**
     * @return Resource ID of the Shared Image Gallery attached to this lab plan. When saving a lab template virtual machine image it will be persisted in this gallery. Shared images from the gallery can be made available to use when creating new labs.
     * 
     */
    public Output</* @Nullable */ String> getSharedGalleryId() {
        return this.sharedGalleryId;
    }
    /**
     * Support contact information and instructions for users of the lab plan. This information is displayed to lab owners and virtual machine users for all labs in the lab plan.
     * 
     */
    @OutputExport(name="supportInfo", type=SupportInfoResponse.class, parameters={})
    private Output</* @Nullable */ SupportInfoResponse> supportInfo;

    /**
     * @return Support contact information and instructions for users of the lab plan. This information is displayed to lab owners and virtual machine users for all labs in the lab plan.
     * 
     */
    public Output</* @Nullable */ SupportInfoResponse> getSupportInfo() {
        return this.supportInfo;
    }
    /**
     * Metadata pertaining to creation and last modification of the lab plan.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the lab plan.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LabPlan(String name) {
        this(name, LabPlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LabPlan(String name, LabPlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LabPlan(String name, LabPlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:LabPlan", name, args == null ? LabPlanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LabPlan(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:LabPlan", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:labservices/v20211001preview:LabPlan").build()),
                Input.of(Alias.builder().setType("azure-native:labservices/v20211115preview:LabPlan").build())
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
    public static LabPlan get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LabPlan(name, id, options);
    }
}
