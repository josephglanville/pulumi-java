// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Identity.UserArgs;
import com.pulumi.oci.Identity.inputs.UserState;
import com.pulumi.oci.Identity.outputs.UserCapability;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the User resource in Oracle Cloud Infrastructure Identity service.
 * 
 * Creates a new user in your tenancy. For conceptual information about users, your tenancy, and other
 * IAM Service components, see [Overview of the IAM Service](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
 * 
 * You must specify your tenancy&#39;s OCID as the compartment ID in the request object (remember that the
 * tenancy is simply the root compartment). Notice that IAM resources (users, groups, compartments, and
 * some policies) reside within the tenancy itself, unlike cloud resources such as compute instances,
 * which typically reside within compartments inside the tenancy. For information about OCIDs, see
 * [Resource Identifiers](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
 * 
 * You must also specify a *name* for the user, which must be unique across all users in your tenancy
 * and cannot be changed. Allowed characters: No spaces. Only letters, numerals, hyphens, periods,
 * underscores, +, and @. If you specify a name that&#39;s already in use, you&#39;ll get a 409 error.
 * This name will be the user&#39;s login to the Console. You might want to pick a
 * name that your company&#39;s own identity system (e.g., Active Directory, LDAP, etc.) already uses.
 * If you delete a user and then create a new user with the same name, they&#39;ll be considered different
 * users because they have different OCIDs.
 * 
 * You must also specify a *description* for the user (although it can be an empty string).
 * It does not have to be unique, and you can change it anytime with
 * [UpdateUser](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/User/UpdateUser). You can use the field to provide the user&#39;s
 * full name, a description, a nickname, or other information to generally identify the user.
 * A new user has no permissions until you place the user in one or more groups (see
 * [AddUserToGroup](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/UserGroupMembership/AddUserToGroup)). If the user needs to
 * access the Console, you need to provide the user a password (see
 * [CreateOrResetUIPassword](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/UIPassword/CreateOrResetUIPassword)).
 * If the user needs to access the Oracle Cloud Infrastructure REST API, you need to upload a
 * public API signing key for that user (see
 * [Required Keys and OCIDs](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/apisigningkey.htm) and also
 * [UploadApiKey](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/ApiKey/UploadApiKey)).
 * 
 * **Important:** Make sure to inform the new user which compartment(s) they have access to.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Users can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Identity/user:User test_user &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Identity/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * Properties indicating how the user is allowed to authenticate.
     * 
     */
    @Export(name="capabilities", type=List.class, parameters={UserCapability.class})
    private Output<List<UserCapability>> capabilities;

    /**
     * @return Properties indicating how the user is allowed to authenticate.
     * 
     */
    public Output<List<UserCapability>> capabilities() {
        return this.capabilities;
    }
    /**
     * The OCID of the tenancy containing the user.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return The OCID of the tenancy containing the user.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * DB username of the DB credential. Has to be unique across the tenancy.
     * 
     */
    @Export(name="dbUserName", type=String.class, parameters={})
    private Output<String> dbUserName;

    /**
     * @return DB username of the DB credential. Has to be unique across the tenancy.
     * 
     */
    public Output<String> dbUserName() {
        return this.dbUserName;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) The description you assign to the user during creation. Does not have to be unique, and it&#39;s changeable.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) The description you assign to the user during creation. Does not have to be unique, and it&#39;s changeable.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) The email you assign to the user. Has to be unique across the tenancy.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return (Updatable) The email you assign to the user. Has to be unique across the tenancy.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * Whether the email address has been validated.
     * 
     */
    @Export(name="emailVerified", type=Boolean.class, parameters={})
    private Output<Boolean> emailVerified;

    /**
     * @return Whether the email address has been validated.
     * 
     */
    public Output<Boolean> emailVerified() {
        return this.emailVerified;
    }
    /**
     * Identifier of the user in the identity provider
     * 
     */
    @Export(name="externalIdentifier", type=String.class, parameters={})
    private Output<String> externalIdentifier;

    /**
     * @return Identifier of the user in the identity provider
     * 
     */
    public Output<String> externalIdentifier() {
        return this.externalIdentifier;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * The OCID of the `IdentityProvider` this user belongs to.
     * 
     */
    @Export(name="identityProviderId", type=String.class, parameters={})
    private Output<String> identityProviderId;

    /**
     * @return The OCID of the `IdentityProvider` this user belongs to.
     * 
     */
    public Output<String> identityProviderId() {
        return this.identityProviderId;
    }
    /**
     * Returned only if the user&#39;s `lifecycleState` is INACTIVE. A 16-bit value showing the reason why the user is inactive:
     * * bit 0: SUSPENDED (reserved for future use)
     * * bit 1: DISABLED (reserved for future use)
     * * bit 2: BLOCKED (the user has exceeded the maximum number of failed login attempts for the Console)
     * 
     */
    @Export(name="inactiveState", type=String.class, parameters={})
    private Output<String> inactiveState;

    /**
     * @return Returned only if the user&#39;s `lifecycleState` is INACTIVE. A 16-bit value showing the reason why the user is inactive:
     * * bit 0: SUSPENDED (reserved for future use)
     * * bit 1: DISABLED (reserved for future use)
     * * bit 2: BLOCKED (the user has exceeded the maximum number of failed login attempts for the Console)
     * 
     */
    public Output<String> inactiveState() {
        return this.inactiveState;
    }
    /**
     * The date and time of when the user most recently logged in the format defined by RFC3339 (ex. `2016-08-25T21:10:29.600Z`). If there is no login history, this field is null.
     * 
     */
    @Export(name="lastSuccessfulLoginTime", type=String.class, parameters={})
    private Output<String> lastSuccessfulLoginTime;

    /**
     * @return The date and time of when the user most recently logged in the format defined by RFC3339 (ex. `2016-08-25T21:10:29.600Z`). If there is no login history, this field is null.
     * 
     */
    public Output<String> lastSuccessfulLoginTime() {
        return this.lastSuccessfulLoginTime;
    }
    /**
     * The name you assign to the user during creation. This is the user&#39;s login for the Console. The name must be unique across all users in the tenancy and cannot be changed.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name you assign to the user during creation. This is the user&#39;s login for the Console. The name must be unique across all users in the tenancy and cannot be changed.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The date and time of when the user most recently logged in the format defined by RFC3339 (ex. `2016-08-25T21:10:29.600Z`). If there is no login history, this field is null.
     * 
     */
    @Export(name="previousSuccessfulLoginTime", type=String.class, parameters={})
    private Output<String> previousSuccessfulLoginTime;

    /**
     * @return The date and time of when the user most recently logged in the format defined by RFC3339 (ex. `2016-08-25T21:10:29.600Z`). If there is no login history, this field is null.
     * 
     */
    public Output<String> previousSuccessfulLoginTime() {
        return this.previousSuccessfulLoginTime;
    }
    /**
     * The user&#39;s current state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The user&#39;s current state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Date and time the user was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return Date and time the user was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Identity/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Identity/user:User", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
