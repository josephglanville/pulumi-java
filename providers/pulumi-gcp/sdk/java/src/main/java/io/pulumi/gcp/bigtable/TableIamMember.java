// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigtable.TableIamMemberArgs;
import io.pulumi.gcp.bigtable.inputs.TableIamMemberState;
import io.pulumi.gcp.bigtable.outputs.TableIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage IAM policies on bigtable tables. Each of these resources serves a different use case:
 * 
 * * `gcp.bigtable.TableIamPolicy`: Authoritative. Sets the IAM policy for the tables and replaces any existing policy already attached.
 * * `gcp.bigtable.TableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
 * * `gcp.bigtable.TableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.
 * 
 * > **Note:** `gcp.bigtable.TableIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.TableIamBinding` and `gcp.bigtable.TableIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the table as `gcp.bigtable.TableIamPolicy` replaces the entire policy.
 * 
 * > **Note:** `gcp.bigtable.TableIamBinding` resources **can be** used in conjunction with `gcp.bigtable.TableIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_bigtable\_table\_iam\_policy
 * 
 * ## google\_bigtable\_table\_iam\_binding
 * 
 * ## google\_bigtable\_table\_iam\_member
 * 
 * ## Import
 * 
 * Table IAM resources can be imported using the project, table name, role and/or member.
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/tableIamMember:TableIamMember editor "projects/{project}/tables/{table}"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/tableIamMember:TableIamMember editor "projects/{project}/tables/{table} roles/editor"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/tableIamMember:TableIamMember editor "projects/{project}/tables/{table} roles/editor user:jane@example.com"
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:bigtable/tableIamMember:TableIamMember")
public class TableIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=TableIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ TableIamMemberCondition> condition;

    public Output</* @Nullable */ TableIamMemberCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the tables's IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the tables's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The name or relative resource id of the instance that owns the table.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The name or relative resource id of the instance that owns the table.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    /**
     * The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * The name or relative resource id of the table to manage IAM policies for.
     * 
     */
    @OutputExport(name="table", type=String.class, parameters={})
    private Output<String> table;

    /**
     * @return The name or relative resource id of the table to manage IAM policies for.
     * 
     */
    public Output<String> getTable() {
        return this.table;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TableIamMember(String name) {
        this(name, TableIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TableIamMember(String name, TableIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TableIamMember(String name, TableIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/tableIamMember:TableIamMember", name, args == null ? TableIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TableIamMember(String name, Input<String> id, @Nullable TableIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/tableIamMember:TableIamMember", name, state, makeResourceOptions(options, id));
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
    public static TableIamMember get(String name, Input<String> id, @Nullable TableIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TableIamMember(name, id, state, options);
    }
}
