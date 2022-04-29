// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.CertificatesManagement.CaBundleArgs;
import com.pulumi.oci.CertificatesManagement.inputs.CaBundleState;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Ca Bundle resource in Oracle Cloud Infrastructure Certificates Management service.
 * 
 * Creates a new CA bundle according to the details of the request.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CaBundles can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:CertificatesManagement/caBundle:CaBundle test_ca_bundle &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:CertificatesManagement/caBundle:CaBundle")
public class CaBundle extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) Certificates (in PEM format) to include in the CA bundle.
     * 
     */
    @Export(name="caBundlePem", type=String.class, parameters={})
    private Output<String> caBundlePem;

    /**
     * @return (Updatable) Certificates (in PEM format) to include in the CA bundle.
     * 
     */
    public Output<String> caBundlePem() {
        return this.caBundlePem;
    }
    /**
     * (Updatable) The OCID of the compartment for the CA bundle.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment for the CA bundle.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
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
     * (Updatable) A brief description of the CA bundle.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) A brief description of the CA bundle.
     * 
     */
    public Output<String> description() {
        return this.description;
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
     * Additional information about the current lifecycle state of the CA bundle.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return Additional information about the current lifecycle state of the CA bundle.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * A user-friendly name for the CA bundle. Names are unique within a compartment. Avoid entering confidential information. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-friendly name for the CA bundle. Names are unique within a compartment. Avoid entering confidential information. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The current lifecycle state of the CA bundle.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current lifecycle state of the CA bundle.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A property indicating when the CA bundle was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return A property indicating when the CA bundle was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CaBundle(String name) {
        this(name, CaBundleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CaBundle(String name, CaBundleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CaBundle(String name, CaBundleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:CertificatesManagement/caBundle:CaBundle", name, args == null ? CaBundleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CaBundle(String name, Output<String> id, @Nullable CaBundleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:CertificatesManagement/caBundle:CaBundle", name, state, makeResourceOptions(options, id));
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
    public static CaBundle get(String name, Output<String> id, @Nullable CaBundleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CaBundle(name, id, state, options);
    }
}
