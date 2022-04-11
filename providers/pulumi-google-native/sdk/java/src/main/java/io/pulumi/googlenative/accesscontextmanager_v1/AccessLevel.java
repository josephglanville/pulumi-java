// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.accesscontextmanager_v1.AccessLevelArgs;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.BasicLevelResponse;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.CustomLevelResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an access level. The long-running operation from this RPC has a successful status after the access level propagates to long-lasting storage. If access levels contain errors, an error response is returned for the first error encountered.
 * 
 */
@ResourceType(type="google-native:accesscontextmanager/v1:AccessLevel")
public class AccessLevel extends io.pulumi.resources.CustomResource {
    /**
     * A `BasicLevel` composed of `Conditions`.
     * 
     */
    @Export(name="basic", type=BasicLevelResponse.class, parameters={})
    private Output<BasicLevelResponse> basic;

    /**
     * @return A `BasicLevel` composed of `Conditions`.
     * 
     */
    public Output<BasicLevelResponse> getBasic() {
        return this.basic;
    }
    /**
     * A `CustomLevel` written in the Common Expression Language.
     * 
     */
    @Export(name="custom", type=CustomLevelResponse.class, parameters={})
    private Output<CustomLevelResponse> custom;

    /**
     * @return A `CustomLevel` written in the Common Expression Language.
     * 
     */
    public Output<CustomLevelResponse> getCustom() {
        return this.custom;
    }
    /**
     * Description of the `AccessLevel` and its use. Does not affect behavior.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the `AccessLevel` and its use. Does not affect behavior.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{access_policy}/accessLevels/{access_level}`. The maximum length of the `access_level` component is 50 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{access_policy}/accessLevels/{access_level}`. The maximum length of the `access_level` component is 50 characters.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return Human readable title. Must be unique within the Policy.
     * 
     */
    public Output<String> getTitle() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessLevel(String name) {
        this(name, AccessLevelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessLevel(String name, AccessLevelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessLevel(String name, AccessLevelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:accesscontextmanager/v1:AccessLevel", name, args == null ? AccessLevelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessLevel(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:accesscontextmanager/v1:AccessLevel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static AccessLevel get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessLevel(name, id, options);
    }
}
