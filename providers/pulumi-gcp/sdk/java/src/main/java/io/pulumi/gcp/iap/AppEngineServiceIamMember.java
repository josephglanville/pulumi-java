// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.iap.AppEngineServiceIamMemberArgs;
import io.pulumi.gcp.iap.inputs.AppEngineServiceIamMemberState;
import io.pulumi.gcp.iap.outputs.AppEngineServiceIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Identity-Aware Proxy AppEngineService. Each of these resources serves a different use case:
 * 
 * * `gcp.iap.AppEngineServiceIamPolicy`: Authoritative. Sets the IAM policy for the appengineservice and replaces any existing policy already attached.
 * * `gcp.iap.AppEngineServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the appengineservice are preserved.
 * * `gcp.iap.AppEngineServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the appengineservice are preserved.
 * 
 * > **Note:** `gcp.iap.AppEngineServiceIamPolicy` **cannot** be used in conjunction with `gcp.iap.AppEngineServiceIamBinding` and `gcp.iap.AppEngineServiceIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.iap.AppEngineServiceIamBinding` resources **can be** used in conjunction with `gcp.iap.AppEngineServiceIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_iap\_app\_engine\_service\_iam\_policy
 * 
 * With IAM Conditions:
 * ## google\_iap\_app\_engine\_service\_iam\_binding
 * 
 * With IAM Conditions:
 * ## google\_iap\_app\_engine\_service\_iam\_member
 * 
 * With IAM Conditions:
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/iap_web/appengine-{{appId}}/services/{{service}} * {{project}}/{{appId}}/{{service}} * {{appId}}/{{service}} * {{service}} Any variables not passed in the import command will be taken from the provider configuration. Identity-Aware Proxy appengineservice IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/appEngineServiceIamMember:AppEngineServiceIamMember editor "projects/{{project}}/iap_web/appengine-{{appId}}/services/{{service}} roles/iap.httpsResourceAccessor user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/appEngineServiceIamMember:AppEngineServiceIamMember editor "projects/{{project}}/iap_web/appengine-{{appId}}/services/{{service}} roles/iap.httpsResourceAccessor"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/appEngineServiceIamMember:AppEngineServiceIamMember editor projects/{{project}}/iap_web/appengine-{{appId}}/services/{{service}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:iap/appEngineServiceIamMember:AppEngineServiceIamMember")
public class AppEngineServiceIamMember extends io.pulumi.resources.CustomResource {
    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getAppId() {
        return this.appId;
    }
    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="condition", type=AppEngineServiceIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ AppEngineServiceIamMemberCondition> condition;

    /**
     * @return An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AppEngineServiceIamMemberCondition> getCondition() {
        return this.condition;
    }
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
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
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
     * The role that should be applied. Only one
     * `gcp.iap.AppEngineServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.iap.AppEngineServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getService() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppEngineServiceIamMember(String name) {
        this(name, AppEngineServiceIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppEngineServiceIamMember(String name, AppEngineServiceIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppEngineServiceIamMember(String name, AppEngineServiceIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/appEngineServiceIamMember:AppEngineServiceIamMember", name, args == null ? AppEngineServiceIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AppEngineServiceIamMember(String name, Input<String> id, @Nullable AppEngineServiceIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/appEngineServiceIamMember:AppEngineServiceIamMember", name, state, makeResourceOptions(options, id));
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
    public static AppEngineServiceIamMember get(String name, Input<String> id, @Nullable AppEngineServiceIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AppEngineServiceIamMember(name, id, state, options);
    }
}
