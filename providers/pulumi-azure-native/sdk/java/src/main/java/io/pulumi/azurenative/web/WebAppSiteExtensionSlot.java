// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppSiteExtensionSlotArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Site Extension Information.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppSiteExtensionSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/siteextensions/{siteExtensionId} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppSiteExtensionSlot")
public class WebAppSiteExtensionSlot extends io.pulumi.resources.CustomResource {
    /**
     * List of authors.
     * 
     */
    @Export(name="authors", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> authors;

    /**
     * @return List of authors.
     * 
     */
    public Output</* @Nullable */ List<String>> getAuthors() {
        return this.authors;
    }
    /**
     * Site Extension comment.
     * 
     */
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return Site Extension comment.
     * 
     */
    public Output</* @Nullable */ String> getComment() {
        return this.comment;
    }
    /**
     * Detailed description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Detailed description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Count of downloads.
     * 
     */
    @Export(name="downloadCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downloadCount;

    /**
     * @return Count of downloads.
     * 
     */
    public Output</* @Nullable */ Integer> getDownloadCount() {
        return this.downloadCount;
    }
    /**
     * Site extension ID.
     * 
     */
    @Export(name="extensionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionId;

    /**
     * @return Site extension ID.
     * 
     */
    public Output</* @Nullable */ String> getExtensionId() {
        return this.extensionId;
    }
    /**
     * Site extension type.
     * 
     */
    @Export(name="extensionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionType;

    /**
     * @return Site extension type.
     * 
     */
    public Output</* @Nullable */ String> getExtensionType() {
        return this.extensionType;
    }
    /**
     * Extension URL.
     * 
     */
    @Export(name="extensionUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionUrl;

    /**
     * @return Extension URL.
     * 
     */
    public Output</* @Nullable */ String> getExtensionUrl() {
        return this.extensionUrl;
    }
    /**
     * Feed URL.
     * 
     */
    @Export(name="feedUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> feedUrl;

    /**
     * @return Feed URL.
     * 
     */
    public Output</* @Nullable */ String> getFeedUrl() {
        return this.feedUrl;
    }
    /**
     * Icon URL.
     * 
     */
    @Export(name="iconUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> iconUrl;

    /**
     * @return Icon URL.
     * 
     */
    public Output</* @Nullable */ String> getIconUrl() {
        return this.iconUrl;
    }
    /**
     * Installed timestamp.
     * 
     */
    @Export(name="installedDateTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> installedDateTime;

    /**
     * @return Installed timestamp.
     * 
     */
    public Output</* @Nullable */ String> getInstalledDateTime() {
        return this.installedDateTime;
    }
    /**
     * Installer command line parameters.
     * 
     */
    @Export(name="installerCommandLineParams", type=String.class, parameters={})
    private Output</* @Nullable */ String> installerCommandLineParams;

    /**
     * @return Installer command line parameters.
     * 
     */
    public Output</* @Nullable */ String> getInstallerCommandLineParams() {
        return this.installerCommandLineParams;
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * License URL.
     * 
     */
    @Export(name="licenseUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseUrl;

    /**
     * @return License URL.
     * 
     */
    public Output</* @Nullable */ String> getLicenseUrl() {
        return this.licenseUrl;
    }
    /**
     * <code>true</code> if the local version is the latest version; <code>false</code> otherwise.
     * 
     */
    @Export(name="localIsLatestVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> localIsLatestVersion;

    /**
     * @return <code>true</code> if the local version is the latest version; <code>false</code> otherwise.
     * 
     */
    public Output</* @Nullable */ Boolean> getLocalIsLatestVersion() {
        return this.localIsLatestVersion;
    }
    /**
     * Local path.
     * 
     */
    @Export(name="localPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> localPath;

    /**
     * @return Local path.
     * 
     */
    public Output</* @Nullable */ String> getLocalPath() {
        return this.localPath;
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Project URL.
     * 
     */
    @Export(name="projectUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectUrl;

    /**
     * @return Project URL.
     * 
     */
    public Output</* @Nullable */ String> getProjectUrl() {
        return this.projectUrl;
    }
    /**
     * Provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Provisioning state.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Published timestamp.
     * 
     */
    @Export(name="publishedDateTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> publishedDateTime;

    /**
     * @return Published timestamp.
     * 
     */
    public Output</* @Nullable */ String> getPublishedDateTime() {
        return this.publishedDateTime;
    }
    /**
     * Summary description.
     * 
     */
    @Export(name="summary", type=String.class, parameters={})
    private Output</* @Nullable */ String> summary;

    /**
     * @return Summary description.
     * 
     */
    public Output</* @Nullable */ String> getSummary() {
        return this.summary;
    }
    @Export(name="title", type=String.class, parameters={})
    private Output</* @Nullable */ String> title;

    public Output</* @Nullable */ String> getTitle() {
        return this.title;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Version information.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Version information.
     * 
     */
    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppSiteExtensionSlot(String name) {
        this(name, WebAppSiteExtensionSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppSiteExtensionSlot(String name, WebAppSiteExtensionSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppSiteExtensionSlot(String name, WebAppSiteExtensionSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSiteExtensionSlot", name, args == null ? WebAppSiteExtensionSlotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppSiteExtensionSlot(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSiteExtensionSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppSiteExtensionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppSiteExtensionSlot").build())
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
    public static WebAppSiteExtensionSlot get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppSiteExtensionSlot(name, id, options);
    }
}
