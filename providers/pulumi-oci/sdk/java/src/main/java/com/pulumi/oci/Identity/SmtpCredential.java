// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Identity.SmtpCredentialArgs;
import com.pulumi.oci.Identity.inputs.SmtpCredentialState;
import com.pulumi.oci.Utilities;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource provides the Smtp Credential resource in Oracle Cloud Infrastructure Identity service.
 * 
 * Creates a new SMTP credential for the specified user. An SMTP credential has an SMTP user name and an SMTP password.
 * You must specify a *description* for the SMTP credential (although it can be an empty string). It does not
 * have to be unique, and you can change it anytime with
 * [UpdateSmtpCredential](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/SmtpCredentialSummary/UpdateSmtpCredential).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SmtpCredentials can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Identity/smtpCredential:SmtpCredential test_smtp_credential &#34;users/{userId}/smtpCredentials/{smtpCredentialId}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Identity/smtpCredential:SmtpCredential")
public class SmtpCredential extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The description you assign to the SMTP credentials during creation. Does not have to be unique, and it&#39;s changeable.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) The description you assign to the SMTP credentials during creation. Does not have to be unique, and it&#39;s changeable.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The detailed status of INACTIVE lifecycleState.
     * 
     */
    @Export(name="inactiveState", type=String.class, parameters={})
    private Output<String> inactiveState;

    /**
     * @return The detailed status of INACTIVE lifecycleState.
     * 
     */
    public Output<String> inactiveState() {
        return this.inactiveState;
    }
    /**
     * The SMTP password.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The SMTP password.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * The credential&#39;s current state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The credential&#39;s current state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Date and time the `SmtpCredential` object was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return Date and time the `SmtpCredential` object was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * Date and time when this credential will expire, in the format defined by RFC3339. Null if it never expires.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Export(name="timeExpires", type=String.class, parameters={})
    private Output<String> timeExpires;

    /**
     * @return Date and time when this credential will expire, in the format defined by RFC3339. Null if it never expires.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Output<String> timeExpires() {
        return this.timeExpires;
    }
    /**
     * The OCID of the user.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return The OCID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * The SMTP user name.
     * 
     */
    @Export(name="username", type=String.class, parameters={})
    private Output<String> username;

    /**
     * @return The SMTP user name.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmtpCredential(String name) {
        this(name, SmtpCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmtpCredential(String name, SmtpCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmtpCredential(String name, SmtpCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Identity/smtpCredential:SmtpCredential", name, args == null ? SmtpCredentialArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SmtpCredential(String name, Output<String> id, @Nullable SmtpCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Identity/smtpCredential:SmtpCredential", name, state, makeResourceOptions(options, id));
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
    public static SmtpCredential get(String name, Output<String> id, @Nullable SmtpCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmtpCredential(name, id, state, options);
    }
}
