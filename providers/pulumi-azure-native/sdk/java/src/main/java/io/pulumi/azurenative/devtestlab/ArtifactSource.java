// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.ArtifactSourceArgs;
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
 * Properties of an artifact source.
 * API Version: 2018-09-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devtestlab:ArtifactSource {artifactSourceName} /subscriptions/{subscriptionId}/resourceGroups/resourceGroupName/providers/Microsoft.DevTestLab/labs/{labName}/artifactsources/{artifactSourceName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:devtestlab:ArtifactSource")
public class ArtifactSource extends io.pulumi.resources.CustomResource {
    /**
     * The folder containing Azure Resource Manager templates.
     * 
     */
    @OutputExport(name="armTemplateFolderPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> armTemplateFolderPath;

    /**
     * @return The folder containing Azure Resource Manager templates.
     * 
     */
    public Output</* @Nullable */ String> getArmTemplateFolderPath() {
        return this.armTemplateFolderPath;
    }
    /**
     * The artifact source's branch reference.
     * 
     */
    @OutputExport(name="branchRef", type=String.class, parameters={})
    private Output</* @Nullable */ String> branchRef;

    /**
     * @return The artifact source's branch reference.
     * 
     */
    public Output</* @Nullable */ String> getBranchRef() {
        return this.branchRef;
    }
    /**
     * The artifact source's creation date.
     * 
     */
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The artifact source's creation date.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The artifact source's display name.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The artifact source's display name.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The folder containing artifacts.
     * 
     */
    @OutputExport(name="folderPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> folderPath;

    /**
     * @return The folder containing artifacts.
     * 
     */
    public Output</* @Nullable */ String> getFolderPath() {
        return this.folderPath;
    }
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The security token to authenticate to the artifact source.
     * 
     */
    @OutputExport(name="securityToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityToken;

    /**
     * @return The security token to authenticate to the artifact source.
     * 
     */
    public Output</* @Nullable */ String> getSecurityToken() {
        return this.securityToken;
    }
    /**
     * The artifact source's type.
     * 
     */
    @OutputExport(name="sourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceType;

    /**
     * @return The artifact source's type.
     * 
     */
    public Output</* @Nullable */ String> getSourceType() {
        return this.sourceType;
    }
    /**
     * Indicates if the artifact source is enabled (values: Enabled, Disabled).
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Indicates if the artifact source is enabled (values: Enabled, Disabled).
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * The tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
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
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output<String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * The artifact source's URI.
     * 
     */
    @OutputExport(name="uri", type=String.class, parameters={})
    private Output</* @Nullable */ String> uri;

    /**
     * @return The artifact source's URI.
     * 
     */
    public Output</* @Nullable */ String> getUri() {
        return this.uri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ArtifactSource(String name) {
        this(name, ArtifactSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ArtifactSource(String name, ArtifactSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ArtifactSource(String name, ArtifactSourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:ArtifactSource", name, args == null ? ArtifactSourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ArtifactSource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:ArtifactSource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20150521preview:ArtifactSource").build()),
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20160515:ArtifactSource").build()),
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20180915:ArtifactSource").build())
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
    public static ArtifactSource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ArtifactSource(name, id, options);
    }
}
