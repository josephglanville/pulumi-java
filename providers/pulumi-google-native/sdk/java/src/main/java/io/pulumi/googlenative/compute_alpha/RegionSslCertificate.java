// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.RegionSslCertificateArgs;
import io.pulumi.googlenative.compute_alpha.outputs.SslCertificateManagedSslCertificateResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SslCertificateSelfManagedSslCertificateResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a SslCertificate resource in the specified project and region using the data included in the request
 * 
 */
@ResourceType(type="google-native:compute/alpha:RegionSslCertificate")
public class RegionSslCertificate extends io.pulumi.resources.CustomResource {
    /**
     * A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
    private Output<String> certificate;

    /**
     * @return A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    public Output<String> getCertificate() {
        return this.certificate;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Expire time of the certificate. RFC3339
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return Expire time of the certificate. RFC3339
     * 
     */
    public Output<String> getExpireTime() {
        return this.expireTime;
    }
    /**
     * Type of the resource. Always compute#sslCertificate for SSL certificates.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#sslCertificate for SSL certificates.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Configuration and status of a managed SSL certificate.
     * 
     */
    @Export(name="managed", type=SslCertificateManagedSslCertificateResponse.class, parameters={})
    private Output<SslCertificateManagedSslCertificateResponse> managed;

    /**
     * @return Configuration and status of a managed SSL certificate.
     * 
     */
    public Output<SslCertificateManagedSslCertificateResponse> getManaged() {
        return this.managed;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
     * 
     */
    @Export(name="privateKey", type=String.class, parameters={})
    private Output<String> privateKey;

    /**
     * @return A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
     * 
     */
    public Output<String> getPrivateKey() {
        return this.privateKey;
    }
    /**
     * URL of the region where the regional SSL Certificate resides. This field is not applicable to global SSL Certificate.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the regional SSL Certificate resides. This field is not applicable to global SSL Certificate.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * [Output only] Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return [Output only] Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Configuration and status of a self-managed SSL certificate.
     * 
     */
    @Export(name="selfManaged", type=SslCertificateSelfManagedSslCertificateResponse.class, parameters={})
    private Output<SslCertificateSelfManagedSslCertificateResponse> selfManaged;

    /**
     * @return Configuration and status of a self-managed SSL certificate.
     * 
     */
    public Output<SslCertificateSelfManagedSslCertificateResponse> getSelfManaged() {
        return this.selfManaged;
    }
    /**
     * Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    @Export(name="subjectAlternativeNames", type=List.class, parameters={String.class})
    private Output<List<String>> subjectAlternativeNames;

    /**
     * @return Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    public Output<List<String>> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }
    /**
     * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionSslCertificate(String name) {
        this(name, RegionSslCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionSslCertificate(String name, RegionSslCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionSslCertificate(String name, RegionSslCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:RegionSslCertificate", name, args == null ? RegionSslCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionSslCertificate(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:RegionSslCertificate", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegionSslCertificate get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionSslCertificate(name, id, options);
    }
}
