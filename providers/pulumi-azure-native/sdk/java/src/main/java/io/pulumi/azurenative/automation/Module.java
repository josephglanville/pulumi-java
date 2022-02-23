// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.ModuleArgs;
import io.pulumi.azurenative.automation.outputs.ContentLinkResponse;
import io.pulumi.azurenative.automation.outputs.ModuleErrorInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Definition of the module type.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:Module OmsCompositeResources /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/myAutomationAccount33/modules/OmsCompositeResources 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:Module")
public class Module extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets the activity count of the module.
     * 
     */
    @OutputExport(name="activityCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> activityCount;

    /**
     * @return Gets or sets the activity count of the module.
     * 
     */
    public Output</* @Nullable */ Integer> getActivityCount() {
        return this.activityCount;
    }
    /**
     * Gets or sets the contentLink of the module.
     * 
     */
    @OutputExport(name="contentLink", type=ContentLinkResponse.class, parameters={})
    private Output</* @Nullable */ ContentLinkResponse> contentLink;

    /**
     * @return Gets or sets the contentLink of the module.
     * 
     */
    public Output</* @Nullable */ ContentLinkResponse> getContentLink() {
        return this.contentLink;
    }
    /**
     * Gets or sets the creation time.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    /**
     * @return Gets or sets the creation time.
     * 
     */
    public Output</* @Nullable */ String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Gets or sets the description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Gets or sets the error info of the module.
     * 
     */
    @OutputExport(name="error", type=ModuleErrorInfoResponse.class, parameters={})
    private Output</* @Nullable */ ModuleErrorInfoResponse> error;

    /**
     * @return Gets or sets the error info of the module.
     * 
     */
    public Output</* @Nullable */ ModuleErrorInfoResponse> getError() {
        return this.error;
    }
    /**
     * Gets or sets the etag of the resource.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Gets or sets type of module, if its composite or not.
     * 
     */
    @OutputExport(name="isComposite", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isComposite;

    /**
     * @return Gets or sets type of module, if its composite or not.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsComposite() {
        return this.isComposite;
    }
    /**
     * Gets or sets the isGlobal flag of the module.
     * 
     */
    @OutputExport(name="isGlobal", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isGlobal;

    /**
     * @return Gets or sets the isGlobal flag of the module.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsGlobal() {
        return this.isGlobal;
    }
    /**
     * Gets or sets the last modified time.
     * 
     */
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The Azure Region where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The Azure Region where the resource lives
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
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
     * Gets or sets the provisioning state of the module.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Gets or sets the provisioning state of the module.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the size in bytes of the module.
     * 
     */
    @OutputExport(name="sizeInBytes", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> sizeInBytes;

    /**
     * @return Gets or sets the size in bytes of the module.
     * 
     */
    public Output</* @Nullable */ Double> getSizeInBytes() {
        return this.sizeInBytes;
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
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Gets or sets the version of the module.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Gets or sets the version of the module.
     * 
     */
    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Module(String name) {
        this(name, ModuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Module(String name, ModuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Module(String name, ModuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Module", name, args == null ? ModuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Module(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Module", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:automation/v20151031:Module").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20190601:Module").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20200113preview:Module").build())
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
    public static Module get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Module(name, id, options);
    }
}
