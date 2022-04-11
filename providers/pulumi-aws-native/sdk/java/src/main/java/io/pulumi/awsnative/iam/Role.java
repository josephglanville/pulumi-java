// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iam.RoleArgs;
import io.pulumi.awsnative.iam.outputs.RolePolicy;
import io.pulumi.awsnative.iam.outputs.RoleTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IAM::Role
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iam:Role")
public class Role extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) for the role.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the role.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The trust policy that is associated with this role.
     * 
     */
    @Export(name="assumeRolePolicyDocument", type=Object.class, parameters={})
    private Output<Object> assumeRolePolicyDocument;

    /**
     * @return The trust policy that is associated with this role.
     * 
     */
    public Output<Object> getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }
    /**
     * A description of the role that you provide.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the role that you provide.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to the role.
     * 
     */
    @Export(name="managedPolicyArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> managedPolicyArns;

    /**
     * @return A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to the role.
     * 
     */
    public Output</* @Nullable */ List<String>> getManagedPolicyArns() {
        return this.managedPolicyArns;
    }
    /**
     * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
     * 
     */
    @Export(name="maxSessionDuration", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxSessionDuration;

    /**
     * @return The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxSessionDuration() {
        return this.maxSessionDuration;
    }
    /**
     * The path to the role.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output</* @Nullable */ String> path;

    /**
     * @return The path to the role.
     * 
     */
    public Output</* @Nullable */ String> getPath() {
        return this.path;
    }
    /**
     * The ARN of the policy used to set the permissions boundary for the role.
     * 
     */
    @Export(name="permissionsBoundary", type=String.class, parameters={})
    private Output</* @Nullable */ String> permissionsBoundary;

    /**
     * @return The ARN of the policy used to set the permissions boundary for the role.
     * 
     */
    public Output</* @Nullable */ String> getPermissionsBoundary() {
        return this.permissionsBoundary;
    }
    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM role.
     * 
     */
    @Export(name="policies", type=List.class, parameters={RolePolicy.class})
    private Output</* @Nullable */ List<RolePolicy>> policies;

    /**
     * @return Adds or updates an inline policy document that is embedded in the specified IAM role.
     * 
     */
    public Output</* @Nullable */ List<RolePolicy>> getPolicies() {
        return this.policies;
    }
    /**
     * The stable and unique string identifying the role.
     * 
     */
    @Export(name="roleId", type=String.class, parameters={})
    private Output<String> roleId;

    /**
     * @return The stable and unique string identifying the role.
     * 
     */
    public Output<String> getRoleId() {
        return this.roleId;
    }
    /**
     * A name for the IAM role, up to 64 characters in length.
     * 
     */
    @Export(name="roleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleName;

    /**
     * @return A name for the IAM role, up to 64 characters in length.
     * 
     */
    public Output</* @Nullable */ String> getRoleName() {
        return this.roleName;
    }
    /**
     * A list of tags that are attached to the role.
     * 
     */
    @Export(name="tags", type=List.class, parameters={RoleTag.class})
    private Output</* @Nullable */ List<RoleTag>> tags;

    /**
     * @return A list of tags that are attached to the role.
     * 
     */
    public Output</* @Nullable */ List<RoleTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Role(String name) {
        this(name, RoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Role(String name, RoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Role(String name, RoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iam:Role", name, args == null ? RoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Role(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iam:Role", name, null, makeResourceOptions(options, id));
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
    public static Role get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Role(name, id, options);
    }
}
