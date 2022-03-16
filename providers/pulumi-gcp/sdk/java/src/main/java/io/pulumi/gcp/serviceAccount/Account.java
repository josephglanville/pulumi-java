// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.serviceAccount.AccountArgs;
import io.pulumi.gcp.serviceAccount.inputs.AccountState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows management of a Google Cloud service account.
 * 
 * * [API documentation](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/access/service-accounts)
 * 
 * > **Warning:**  If you delete and recreate a service account, you must reapply any IAM roles that it had before.
 * 
 * > Creation of service accounts is eventually consistent, and that can lead to
 * errors when you try to apply ACLs to service accounts immediately after
 * creation.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Service accounts can be imported using their URI, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/account:Account my_sa projects/my-project/serviceAccounts/my-sa@my-project.iam.gserviceaccount.com
 * ```
 * 
 */
@ResourceType(type="gcp:serviceAccount/account:Account")
public class Account extends io.pulumi.resources.CustomResource {
    /**
     * The account id that is used to generate the service
     * account email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression `a-z`
     * to comply with RFC1035. Changing this forces a new service account to be created.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The account id that is used to generate the service
     * account email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression `a-z`
     * to comply with RFC1035. Changing this forces a new service account to be created.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * A text description of the service account.
     * Must be less than or equal to 256 UTF-8 bytes.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A text description of the service account.
     * Must be less than or equal to 256 UTF-8 bytes.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
     * Must be set after creation to disable a service account.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
     * Must be set after creation to disable a service account.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * The display name for the service account.
     * Can be updated without creating a new resource.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name for the service account.
     * Can be updated without creating a new resource.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The e-mail address of the service account. This value
     * should be referenced from any `gcp.organizations.getIAMPolicy` data sources
     * that would grant the service account privileges.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The e-mail address of the service account. This value
     * should be referenced from any `gcp.organizations.getIAMPolicy` data sources
     * that would grant the service account privileges.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * The fully-qualified name of the service account.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The fully-qualified name of the service account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The unique id of the service account.
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return The unique id of the service account.
     * 
     */
    public Output<String> getUniqueId() {
        return this.uniqueId;
    }

    public interface BuilderApplicator {
        public void apply(AccountArgs.Builder a);
    }
    private static io.pulumi.gcp.serviceAccount.AccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.serviceAccount.AccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Account(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceAccount/account:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Account(String name, Output<String> id, @Nullable AccountState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceAccount/account:Account", name, state, makeResourceOptions(options, id));
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
    public static Account get(String name, Output<String> id, @Nullable AccountState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, state, options);
    }
}
