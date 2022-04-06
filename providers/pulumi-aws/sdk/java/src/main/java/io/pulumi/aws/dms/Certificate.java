// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.dms.CertificateArgs;
import io.pulumi.aws.dms.inputs.CertificateState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a DMS (Data Migration Service) certificate resource. DMS certificates can be created, deleted, and imported.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Certificates can be imported using the `certificate_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:dms/certificate:Certificate test test-dms-certificate-tf
 * ```
 * 
 */
@ResourceType(type="aws:dms/certificate:Certificate")
public class Certificate extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) for the certificate.
     * 
     */
    @Export(name="certificateArn", type=String.class, parameters={})
    private Output<String> certificateArn;

    /**
     * @return The Amazon Resource Name (ARN) for the certificate.
     * 
     */
    public Output<String> getCertificateArn() {
        return this.certificateArn;
    }
    /**
     * The certificate identifier.
     * 
     */
    @Export(name="certificateId", type=String.class, parameters={})
    private Output<String> certificateId;

    /**
     * @return The certificate identifier.
     * 
     */
    public Output<String> getCertificateId() {
        return this.certificateId;
    }
    /**
     * The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
     * 
     */
    @Export(name="certificatePem", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificatePem;

    /**
     * @return The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
     * 
     */
    public Output</* @Nullable */ String> getCertificatePem() {
        return this.certificatePem;
    }
    /**
     * The contents of the Oracle Wallet certificate for use with SSL, provided as a base64-encoded String. Either `certificate_pem` or `certificate_wallet` must be set.
     * 
     */
    @Export(name="certificateWallet", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateWallet;

    /**
     * @return The contents of the Oracle Wallet certificate for use with SSL, provided as a base64-encoded String. Either `certificate_pem` or `certificate_wallet` must be set.
     * 
     */
    public Output</* @Nullable */ String> getCertificateWallet() {
        return this.certificateWallet;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/certificate:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable CertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/certificate:Certificate", name, state, makeResourceOptions(options, id));
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
    public static Certificate get(String name, Output<String> id, @Nullable CertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}