// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudresourcemanager_v3.TagKeyArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new TagKey. If another request with the same parameters is sent while the original request is in process, the second request will receive an error. A maximum of 300 TagKeys can exist under a parent at any given time.
 * 
 */
@ResourceType(type="google-native:cloudresourcemanager/v3:TagKey")
public class TagKey extends io.pulumi.resources.CustomResource {
    /**
     * Creation time.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. User-assigned description of the TagKey. Must not exceed 256 characters. Read-write.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. User-assigned description of the TagKey. Must not exceed 256 characters. Read-write.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagKeyRequest for details.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagKeyRequest for details.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Immutable. The resource name for a TagKey. Must be in the format `tagKeys/{tag_key_id}`, where `tag_key_id` is the generated numeric id for the TagKey.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The resource name for a TagKey. Must be in the format `tagKeys/{tag_key_id}`, where `tag_key_id` is the generated numeric id for the TagKey.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Immutable. Namespaced name of the TagKey.
     * 
     */
    @OutputExport(name="namespacedName", type=String.class, parameters={})
    private Output<String> namespacedName;

    /**
     * @return Immutable. Namespaced name of the TagKey.
     * 
     */
    public Output<String> getNamespacedName() {
        return this.namespacedName;
    }
    /**
     * Immutable. The resource name of the new TagKey's parent. Must be of the form `organizations/{org_id}`.
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return Immutable. The resource name of the new TagKey's parent. Must be of the form `organizations/{org_id}`.
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * Immutable. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace. The short name must be 1-63 characters, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @OutputExport(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return Immutable. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace. The short name must be 1-63 characters, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    public Output<String> getShortName() {
        return this.shortName;
    }
    /**
     * Update time.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Update time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagKey(String name) {
        this(name, TagKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagKey(String name, TagKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagKey(String name, TagKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudresourcemanager/v3:TagKey", name, args == null ? TagKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TagKey(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudresourcemanager/v3:TagKey", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static TagKey get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagKey(name, id, options);
    }
}
