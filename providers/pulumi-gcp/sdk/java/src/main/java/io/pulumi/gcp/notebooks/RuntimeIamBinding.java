// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.notebooks.RuntimeIamBindingArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeIamBindingState;
import io.pulumi.gcp.notebooks.outputs.RuntimeIamBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Cloud AI Notebooks Runtime. Each of these resources serves a different use case:
 * 
 * * `gcp.notebooks.RuntimeIamPolicy`: Authoritative. Sets the IAM policy for the runtime and replaces any existing policy already attached.
 * * `gcp.notebooks.RuntimeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtime are preserved.
 * * `gcp.notebooks.RuntimeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtime are preserved.
 * 
 * > **Note:** `gcp.notebooks.RuntimeIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.RuntimeIamBinding` and `gcp.notebooks.RuntimeIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.notebooks.RuntimeIamBinding` resources **can be** used in conjunction with `gcp.notebooks.RuntimeIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_notebooks\_runtime\_iam\_policy
 * 
 * ## google\_notebooks\_runtime\_iam\_binding
 * 
 * ## google\_notebooks\_runtime\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} * {{project}}/{{location}}/{{runtime_name}} * {{location}}/{{runtime_name}} * {{runtime_name}} Any variables not passed in the import command will be taken from the provider configuration. Cloud AI Notebooks runtime IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/runtimeIamBinding:RuntimeIamBinding editor "projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/runtimeIamBinding:RuntimeIamBinding editor "projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/runtimeIamBinding:RuntimeIamBinding editor projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:notebooks/runtimeIamBinding:RuntimeIamBinding")
public class RuntimeIamBinding extends io.pulumi.resources.CustomResource {
    @Export(name="condition", type=RuntimeIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ RuntimeIamBindingCondition> condition;

    public Output</* @Nullable */ RuntimeIamBindingCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    @Export(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.notebooks.RuntimeIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.notebooks.RuntimeIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="runtimeName", type=String.class, parameters={})
    private Output<String> runtimeName;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getRuntimeName() {
        return this.runtimeName;
    }

    public interface BuilderApplicator {
        public void apply(RuntimeIamBindingArgs.Builder a);
    }
    private static io.pulumi.gcp.notebooks.RuntimeIamBindingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.notebooks.RuntimeIamBindingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RuntimeIamBinding(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RuntimeIamBinding(String name) {
        this(name, RuntimeIamBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RuntimeIamBinding(String name, RuntimeIamBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuntimeIamBinding(String name, RuntimeIamBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/runtimeIamBinding:RuntimeIamBinding", name, args == null ? RuntimeIamBindingArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RuntimeIamBinding(String name, Output<String> id, @Nullable RuntimeIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/runtimeIamBinding:RuntimeIamBinding", name, state, makeResourceOptions(options, id));
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
    public static RuntimeIamBinding get(String name, Output<String> id, @Nullable RuntimeIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RuntimeIamBinding(name, id, state, options);
    }
}
