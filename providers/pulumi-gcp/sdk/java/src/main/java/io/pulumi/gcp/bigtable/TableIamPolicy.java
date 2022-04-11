// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigtable.TableIamPolicyArgs;
import io.pulumi.gcp.bigtable.inputs.TableIamPolicyState;
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
 *  $ pulumi import gcp:bigtable/tableIamPolicy:TableIamPolicy editor "projects/{project}/tables/{table}"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/tableIamPolicy:TableIamPolicy editor "projects/{project}/tables/{table} roles/editor"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/tableIamPolicy:TableIamPolicy editor "projects/{project}/tables/{table} roles/editor user:jane@example.com"
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:bigtable/tableIamPolicy:TableIamPolicy")
public class TableIamPolicy extends io.pulumi.resources.CustomResource {
    /**
     * (Computed) The etag of the tables's IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
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
    @Export(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The name or relative resource id of the instance that owns the table.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    /**
     * The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> getPolicyData() {
        return this.policyData;
    }
    /**
     * The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
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
     * The name or relative resource id of the table to manage IAM policies for.
     * 
     */
    @Export(name="table", type=String.class, parameters={})
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
    public TableIamPolicy(String name) {
        this(name, TableIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TableIamPolicy(String name, TableIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TableIamPolicy(String name, TableIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/tableIamPolicy:TableIamPolicy", name, args == null ? TableIamPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TableIamPolicy(String name, Output<String> id, @Nullable TableIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/tableIamPolicy:TableIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static TableIamPolicy get(String name, Output<String> id, @Nullable TableIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TableIamPolicy(name, id, state, options);
    }
}
