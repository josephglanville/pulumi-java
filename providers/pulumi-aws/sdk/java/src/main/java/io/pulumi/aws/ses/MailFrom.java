// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.MailFromArgs;
import io.pulumi.aws.ses.inputs.MailFromState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SES domain MAIL FROM resource.
 * 
 * > **NOTE:** For the MAIL FROM domain to be fully usable, this resource should be paired with the `aws.ses.DomainIdentity` resource. To validate the MAIL FROM domain, a DNS MX record is required. To pass SPF checks, a DNS TXT record may also be required. See the [Amazon SES MAIL FROM documentation](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html) for more information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * MAIL FROM domain can be imported using the `domain` attribute, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ses/mailFrom:MailFrom example example.com
 * ```
 * 
 */
@ResourceType(type="aws:ses/mailFrom:MailFrom")
public class MailFrom extends io.pulumi.resources.CustomResource {
    /**
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
     * 
     */
    @Export(name="behaviorOnMxFailure", type=String.class, parameters={})
    private Output</* @Nullable */ String> behaviorOnMxFailure;

    /**
     * @return The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
     * 
     */
    public Output</* @Nullable */ String> getBehaviorOnMxFailure() {
        return this.behaviorOnMxFailure;
    }
    /**
     * Verified domain name to generate DKIM tokens for.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return Verified domain name to generate DKIM tokens for.
     * 
     */
    public Output<String> getDomain() {
        return this.domain;
    }
    /**
     * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
     * 
     */
    @Export(name="mailFromDomain", type=String.class, parameters={})
    private Output<String> mailFromDomain;

    /**
     * @return Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
     * 
     */
    public Output<String> getMailFromDomain() {
        return this.mailFromDomain;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MailFrom(String name) {
        this(name, MailFromArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MailFrom(String name, MailFromArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MailFrom(String name, MailFromArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/mailFrom:MailFrom", name, args == null ? MailFromArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MailFrom(String name, Output<String> id, @Nullable MailFromState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/mailFrom:MailFrom", name, state, makeResourceOptions(options, id));
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
    public static MailFrom get(String name, Output<String> id, @Nullable MailFromState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MailFrom(name, id, state, options);
    }
}
