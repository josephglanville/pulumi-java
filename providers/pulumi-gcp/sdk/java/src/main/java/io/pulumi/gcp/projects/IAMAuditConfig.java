// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.projects.IAMAuditConfigArgs;
import io.pulumi.gcp.projects.inputs.IAMAuditConfigState;
import io.pulumi.gcp.projects.outputs.IAMAuditConfigAuditLogConfig;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Four different resources help you manage your IAM policy for a project. Each of these resources serves a different use case:
 * 
 * * `gcp.projects.IAMPolicy`: Authoritative. Sets the IAM policy for the project and replaces any existing policy already attached.
 * * `gcp.projects.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the project are preserved.
 * * `gcp.projects.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the project are preserved.
 * * `gcp.projects.IAMAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
 * 
 * > **Note:** `gcp.projects.IAMPolicy` **cannot** be used in conjunction with `gcp.projects.IAMBinding`, `gcp.projects.IAMMember`, or `gcp.projects.IAMAuditConfig` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.projects.IAMBinding` resources **can be** used in conjunction with `gcp.projects.IAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * > **Note:** The underlying API method `projects.setIamPolicy` has a lot of constraints which are documented [here](https://cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
 *    IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning 400 error code so please review these if you encounter errors with this resource.
 * 
 * ## google\_project\_iam\_policy
 * 
 * > **Be careful!** You can accidentally lock yourself out of your project
 *    using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
 *    from anyone without organization-level access to the project. Proceed with caution.
 *    It's not recommended to use `gcp.projects.IAMPolicy` with your provider project
 *    to avoid locking yourself out, and it should generally only be used with projects
 *    fully managed by this provider. If you do use this resource, it is recommended to **import** the policy before
 *    applying the change.
 * 
 * With IAM Conditions:
 * 
 * ## google\_project\_iam\_binding
 * 
 * With IAM Conditions:
 * 
 * ## google\_project\_iam\_member
 * 
 * With IAM Conditions:
 * 
 * ## google\_project\_iam\_audit\_config
 * 
 * ## Import
 * 
 * IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
 * 
 * This member resource can be imported using the `project_id`, role, and member e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project "your-project-id roles/viewer user:foo@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role.
 * 
 * This binding resource can be imported using the `project_id` and role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project "your-project-id roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question.
 * 
 * This policy resource can be imported using the `project_id`.
 * 
 * ```sh
 *  $ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project your-project-id
 * ```
 * 
 *  IAM audit config imports use the identifier of the resource in question and the service, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project "your-project-id foo.googleapis.com"
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:projects/iAMAuditConfig:IAMAuditConfig")
public class IAMAuditConfig extends io.pulumi.resources.CustomResource {
    /**
     * The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * 
     */
    @Export(name="auditLogConfigs", type=List.class, parameters={IAMAuditConfigAuditLogConfig.class})
    private Output<List<IAMAuditConfigAuditLogConfig>> auditLogConfigs;

    /**
     * @return The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * 
     */
    public Output<List<IAMAuditConfigAuditLogConfig>> getAuditLogConfigs() {
        return this.auditLogConfigs;
    }
    /**
     * (Computed) The etag of the project's IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the project's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The project id of the target project. This is not
     * inferred from the provider.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project id of the target project. This is not
     * inferred from the provider.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
     * 
     */
    @Export(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
     * 
     */
    public Output<String> getService() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMAuditConfig(String name) {
        this(name, IAMAuditConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMAuditConfig(String name, IAMAuditConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMAuditConfig(String name, IAMAuditConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/iAMAuditConfig:IAMAuditConfig", name, args == null ? IAMAuditConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IAMAuditConfig(String name, Output<String> id, @Nullable IAMAuditConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/iAMAuditConfig:IAMAuditConfig", name, state, makeResourceOptions(options, id));
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
    public static IAMAuditConfig get(String name, Output<String> id, @Nullable IAMAuditConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IAMAuditConfig(name, id, state, options);
    }
}
