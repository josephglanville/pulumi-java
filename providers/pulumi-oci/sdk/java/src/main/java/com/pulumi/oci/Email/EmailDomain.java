// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Email;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Email.EmailDomainArgs;
import com.pulumi.oci.Email.inputs.EmailDomainState;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Email Domain resource in Oracle Cloud Infrastructure Email service.
 * 
 * Creates a new email domain. Avoid entering confidential information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EmailDomains can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Email/emailDomain:EmailDomain test_email_domain &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Email/emailDomain:EmailDomain")
public class EmailDomain extends com.pulumi.resources.CustomResource {
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DKIM key that will be used to sign mail sent from this email domain.
     * 
     */
    @Export(name="activeDkimId", type=String.class, parameters={})
    private Output<String> activeDkimId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DKIM key that will be used to sign mail sent from this email domain.
     * 
     */
    public Output<String> activeDkimId() {
        return this.activeDkimId;
    }
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment for this email domain.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment for this email domain.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) A string that describes the details about the domain. It does not have to be unique, and you can change it. Avoid entering confidential information.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) A string that describes the details about the domain. It does not have to be unique, and you can change it. Avoid entering confidential information.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * Value of the SPF field. For more information about SPF, please see [SPF Authentication](https://docs.cloud.oracle.com/iaas/Content/Email/Concepts/overview.htm#components).
     * 
     */
    @Export(name="isSpf", type=Boolean.class, parameters={})
    private Output<Boolean> isSpf;

    /**
     * @return Value of the SPF field. For more information about SPF, please see [SPF Authentication](https://docs.cloud.oracle.com/iaas/Content/Email/Concepts/overview.htm#components).
     * 
     */
    public Output<Boolean> isSpf() {
        return this.isSpf;
    }
    /**
     * The name of the email domain in the Internet Domain Name System (DNS). The email domain name must be unique in the region for this tenancy. Domain names limited to ASCII characters use alphanumeric, dash (&#34;-&#34;), and dot (&#34;.&#34;) characters. The dash and dot are only allowed between alphanumeric characters. For details, please see: https://tools.ietf.org/html/rfc5321#section-4.1.2 Non-ASCII domain names should adopt IDNA2008 normalization (RFC 5891-5892).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the email domain in the Internet Domain Name System (DNS). The email domain name must be unique in the region for this tenancy. Domain names limited to ASCII characters use alphanumeric, dash (&#34;-&#34;), and dot (&#34;.&#34;) characters. The dash and dot are only allowed between alphanumeric characters. For details, please see: https://tools.ietf.org/html/rfc5321#section-4.1.2 Non-ASCII domain names should adopt IDNA2008 normalization (RFC 5891-5892).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The current state of the email domain.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the email domain.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * The time the email domain was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format, &#34;YYYY-MM-ddThh:mmZ&#34;.  Example: `2021-02-12T22:47:12.613Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time the email domain was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format, &#34;YYYY-MM-ddThh:mmZ&#34;.  Example: `2021-02-12T22:47:12.613Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailDomain(String name) {
        this(name, EmailDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailDomain(String name, EmailDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailDomain(String name, EmailDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Email/emailDomain:EmailDomain", name, args == null ? EmailDomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EmailDomain(String name, Output<String> id, @Nullable EmailDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Email/emailDomain:EmailDomain", name, state, makeResourceOptions(options, id));
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
    public static EmailDomain get(String name, Output<String> id, @Nullable EmailDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailDomain(name, id, state, options);
    }
}
