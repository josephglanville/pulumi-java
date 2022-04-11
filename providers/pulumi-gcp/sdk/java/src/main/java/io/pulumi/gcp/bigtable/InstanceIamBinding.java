// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigtable.InstanceIamBindingArgs;
import io.pulumi.gcp.bigtable.inputs.InstanceIamBindingState;
import io.pulumi.gcp.bigtable.outputs.InstanceIamBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage IAM policies on bigtable instances. Each of these resources serves a different use case:
 * 
 * * `gcp.bigtable.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
 * * `gcp.bigtable.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
 * * `gcp.bigtable.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
 * 
 * > **Note:** `gcp.bigtable.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.InstanceIamBinding` and `gcp.bigtable.InstanceIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the instance as `gcp.bigtable.InstanceIamPolicy` replaces the entire policy.
 * 
 * > **Note:** `gcp.bigtable.InstanceIamBinding` resources **can be** used in conjunction with `gcp.bigtable.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_bigtable\_instance\_iam\_policy
 * 
 * ## google\_bigtable\_instance\_iam\_binding
 * 
 * ## google\_bigtable\_instance\_iam\_member
 * 
 * ## Import
 * 
 * Instance IAM resources can be imported using the project, instance name, role and/or member.
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instanceIamBinding:InstanceIamBinding editor "projects/{project}/instances/{instance}"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instanceIamBinding:InstanceIamBinding editor "projects/{project}/instances/{instance} roles/editor"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instanceIamBinding:InstanceIamBinding editor "projects/{project}/instances/{instance} roles/editor user:jane@example.com"
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:bigtable/instanceIamBinding:InstanceIamBinding")
public class InstanceIamBinding extends io.pulumi.resources.CustomResource {
    @Export(name="condition", type=InstanceIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ InstanceIamBindingCondition> condition;

    public Output</* @Nullable */ InstanceIamBindingCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the instances's IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the instances's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    @Export(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    @Export(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    /**
     * The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceIamBinding(String name) {
        this(name, InstanceIamBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceIamBinding(String name, InstanceIamBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceIamBinding(String name, InstanceIamBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/instanceIamBinding:InstanceIamBinding", name, args == null ? InstanceIamBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceIamBinding(String name, Output<String> id, @Nullable InstanceIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/instanceIamBinding:InstanceIamBinding", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceIamBinding get(String name, Output<String> id, @Nullable InstanceIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceIamBinding(name, id, state, options);
    }
}
