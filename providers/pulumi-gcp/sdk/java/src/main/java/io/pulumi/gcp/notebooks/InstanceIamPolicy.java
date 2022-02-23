// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.notebooks.InstanceIamPolicyArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Cloud AI Notebooks Instance. Each of these resources serves a different use case:
 * 
 * * `gcp.notebooks.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
 * * `gcp.notebooks.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
 * * `gcp.notebooks.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
 * 
 * > **Note:** `gcp.notebooks.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.InstanceIamBinding` and `gcp.notebooks.InstanceIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.notebooks.InstanceIamBinding` resources **can be** used in conjunction with `gcp.notebooks.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_notebooks\_instance\_iam\_policy
 * 
 * ## google\_notebooks\_instance\_iam\_binding
 * 
 * ## google\_notebooks\_instance\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/instances/{{instance_name}} * {{project}}/{{location}}/{{instance_name}} * {{location}}/{{instance_name}} * {{instance_name}} Any variables not passed in the import command will be taken from the provider configuration. Cloud AI Notebooks instance IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/instanceIamPolicy:InstanceIamPolicy editor "projects/{{project}}/locations/{{location}}/instances/{{instance_name}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/instanceIamPolicy:InstanceIamPolicy editor "projects/{{project}}/locations/{{location}}/instances/{{instance_name}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/instanceIamPolicy:InstanceIamPolicy editor projects/{{project}}/locations/{{location}}/instances/{{instance_name}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:notebooks/instanceIamPolicy:InstanceIamPolicy")
public class InstanceIamPolicy extends io.pulumi.resources.CustomResource {
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="instanceName", type=String.class, parameters={})
    private Output<String> instanceName;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getInstanceName() {
        return this.instanceName;
    }
    /**
     * A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> getPolicyData() {
        return this.policyData;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceIamPolicy(String name) {
        this(name, InstanceIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceIamPolicy(String name, InstanceIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceIamPolicy(String name, InstanceIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/instanceIamPolicy:InstanceIamPolicy", name, args == null ? InstanceIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private InstanceIamPolicy(String name, Input<String> id, @Nullable InstanceIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/instanceIamPolicy:InstanceIamPolicy", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceIamPolicy get(String name, Input<String> id, @Nullable InstanceIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceIamPolicy(name, id, state, options);
    }
}
