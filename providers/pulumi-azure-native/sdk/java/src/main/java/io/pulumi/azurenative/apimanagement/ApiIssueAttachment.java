// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ApiIssueAttachmentArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Issue Attachment Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiIssueAttachment 57d2ef278aa04f0888cba3f3 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/57d1f7558aa04f15146d9d8a/issues/57d2ef278aa04f0ad01d6cdc/attachments/57d2ef278aa04f0888cba3f3 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiIssueAttachment")
public class ApiIssueAttachment extends io.pulumi.resources.CustomResource {
    /**
     * An HTTP link or Base64-encoded binary data.
     * 
     */
    @OutputExport(name="content", type=String.class, parameters={})
    private Output<String> content;

    /**
     * @return An HTTP link or Base64-encoded binary data.
     * 
     */
    public Output<String> getContent() {
        return this.content;
    }
    /**
     * Either 'link' if content is provided via an HTTP link or the MIME type of the Base64-encoded binary data provided in the 'content' property.
     * 
     */
    @OutputExport(name="contentFormat", type=String.class, parameters={})
    private Output<String> contentFormat;

    /**
     * @return Either 'link' if content is provided via an HTTP link or the MIME type of the Base64-encoded binary data provided in the 'content' property.
     * 
     */
    public Output<String> getContentFormat() {
        return this.contentFormat;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Filename by which the binary data will be saved.
     * 
     */
    @OutputExport(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return Filename by which the binary data will be saved.
     * 
     */
    public Output<String> getTitle() {
        return this.title;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiIssueAttachment(String name) {
        this(name, ApiIssueAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiIssueAttachment(String name, ApiIssueAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiIssueAttachment(String name, ApiIssueAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiIssueAttachment", name, args == null ? ApiIssueAttachmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiIssueAttachment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiIssueAttachment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:ApiIssueAttachment").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:ApiIssueAttachment").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:ApiIssueAttachment").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:ApiIssueAttachment").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ApiIssueAttachment").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:ApiIssueAttachment").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ApiIssueAttachment").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ApiIssueAttachment").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ApiIssueAttachment").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ApiIssueAttachment").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ApiIssueAttachment").build())
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
    public static ApiIssueAttachment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiIssueAttachment(name, id, options);
    }
}
