// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Analytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Analytics.AnalyticsInstanceVanityUrlArgs;
import com.pulumi.oci.Analytics.inputs.AnalyticsInstanceVanityUrlState;
import com.pulumi.oci.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Analytics Instance Vanity Url resource in Oracle Cloud Infrastructure Analytics service.
 * 
 * Allows specifying a custom host name to be used to access the analytics instance.  This requires prior setup of DNS entry and certificate
 * for this host.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AnalyticsInstanceVanityUrls can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Analytics/analyticsInstanceVanityUrl:AnalyticsInstanceVanityUrl test_analytics_instance_vanity_url &#34;analyticsInstances/{analyticsInstanceId}/vanityUrls/{vanityUrlKey}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Analytics/analyticsInstanceVanityUrl:AnalyticsInstanceVanityUrl")
public class AnalyticsInstanceVanityUrl extends com.pulumi.resources.CustomResource {
    /**
     * The OCID of the AnalyticsInstance.
     * 
     */
    @Export(name="analyticsInstanceId", type=String.class, parameters={})
    private Output<String> analyticsInstanceId;

    /**
     * @return The OCID of the AnalyticsInstance.
     * 
     */
    public Output<String> analyticsInstanceId() {
        return this.analyticsInstanceId;
    }
    /**
     * (Updatable) PEM CA certificate(s) for HTTPS connections. This may include multiple PEM certificates.
     * 
     */
    @Export(name="caCertificate", type=String.class, parameters={})
    private Output<String> caCertificate;

    /**
     * @return (Updatable) PEM CA certificate(s) for HTTPS connections. This may include multiple PEM certificates.
     * 
     */
    public Output<String> caCertificate() {
        return this.caCertificate;
    }
    /**
     * Optional description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Optional description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * List of fully qualified hostnames supported by this vanity URL definition (max of 3).
     * 
     */
    @Export(name="hosts", type=List.class, parameters={String.class})
    private Output<List<String>> hosts;

    /**
     * @return List of fully qualified hostnames supported by this vanity URL definition (max of 3).
     * 
     */
    public Output<List<String>> hosts() {
        return this.hosts;
    }
    /**
     * (Updatable) Passphrase for the PEM Private key (if any).
     * 
     */
    @Export(name="passphrase", type=String.class, parameters={})
    private Output</* @Nullable */ String> passphrase;

    /**
     * @return (Updatable) Passphrase for the PEM Private key (if any).
     * 
     */
    public Output<Optional<String>> passphrase() {
        return Codegen.optional(this.passphrase);
    }
    /**
     * (Updatable) PEM Private key for HTTPS connections.
     * 
     */
    @Export(name="privateKey", type=String.class, parameters={})
    private Output<String> privateKey;

    /**
     * @return (Updatable) PEM Private key for HTTPS connections.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }
    /**
     * (Updatable) PEM certificate for HTTPS connections.
     * 
     */
    @Export(name="publicCertificate", type=String.class, parameters={})
    private Output<String> publicCertificate;

    /**
     * @return (Updatable) PEM certificate for HTTPS connections.
     * 
     */
    public Output<String> publicCertificate() {
        return this.publicCertificate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AnalyticsInstanceVanityUrl(String name) {
        this(name, AnalyticsInstanceVanityUrlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AnalyticsInstanceVanityUrl(String name, AnalyticsInstanceVanityUrlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AnalyticsInstanceVanityUrl(String name, AnalyticsInstanceVanityUrlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Analytics/analyticsInstanceVanityUrl:AnalyticsInstanceVanityUrl", name, args == null ? AnalyticsInstanceVanityUrlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AnalyticsInstanceVanityUrl(String name, Output<String> id, @Nullable AnalyticsInstanceVanityUrlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Analytics/analyticsInstanceVanityUrl:AnalyticsInstanceVanityUrl", name, state, makeResourceOptions(options, id));
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
    public static AnalyticsInstanceVanityUrl get(String name, Output<String> id, @Nullable AnalyticsInstanceVanityUrlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AnalyticsInstanceVanityUrl(name, id, state, options);
    }
}
