// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.certificateauthority.AuthorityArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityState;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityAccessUrl;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityConfig;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityKeySpec;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A CertificateAuthority represents an individual Certificate Authority. A
 * CertificateAuthority can be used to create Certificates.
 * 
 * To get more information about CertificateAuthority, see:
 * 
 * * [API documentation](https://cloud.google.com/certificate-authority-service/docs/reference/rest)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/certificate-authority-service)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CertificateAuthority can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/authority:Authority default projects/{{project}}/locations/{{location}}/caPools/{{pool}}/certificateAuthorities/{{certificate_authority_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/authority:Authority default {{project}}/{{location}}/{{pool}}/{{certificate_authority_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/authority:Authority default {{location}}/{{pool}}/{{certificate_authority_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:certificateauthority/authority:Authority")
public class Authority extends io.pulumi.resources.CustomResource {
    /**
     * URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * 
     */
    @Export(name="accessUrls", type=List.class, parameters={AuthorityAccessUrl.class})
    private Output<List<AuthorityAccessUrl>> accessUrls;

    /**
     * @return URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * 
     */
    public Output<List<AuthorityAccessUrl>> getAccessUrls() {
        return this.accessUrls;
    }
    /**
     * The user provided Resource ID for this Certificate Authority.
     * 
     */
    @Export(name="certificateAuthorityId", type=String.class, parameters={})
    private Output<String> certificateAuthorityId;

    /**
     * @return The user provided Resource ID for this Certificate Authority.
     * 
     */
    public Output<String> getCertificateAuthorityId() {
        return this.certificateAuthorityId;
    }
    /**
     * The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * 
     */
    @Export(name="config", type=AuthorityConfig.class, parameters={})
    private Output<AuthorityConfig> config;

    /**
     * @return The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * 
     */
    public Output<AuthorityConfig> getConfig() {
        return this.config;
    }
    /**
     * The time at which this CertificateAuthority was created. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this CertificateAuthority was created. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The name of a Cloud Storage bucket where this CertificateAuthority will publish content,
     * such as the CA certificate and CRLs. This must be a bucket name, without any prefixes
     * (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named
     * my-bucket, you would simply specify `my-bucket`. If not specified, a managed bucket will be
     * created.
     * 
     */
    @Export(name="gcsBucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> gcsBucket;

    /**
     * @return The name of a Cloud Storage bucket where this CertificateAuthority will publish content,
     * such as the CA certificate and CRLs. This must be a bucket name, without any prefixes
     * (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named
     * my-bucket, you would simply specify `my-bucket`. If not specified, a managed bucket will be
     * created.
     * 
     */
    public Output</* @Nullable */ String> getGcsBucket() {
        return this.gcsBucket;
    }
    /**
     * This field allows the CA to be deleted even if the CA has active certs. Active certs include both unrevoked and unexpired certs.
     * Use with care. Defaults to `false`.
     * 
     */
    @Export(name="ignoreActiveCertificatesOnDeletion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreActiveCertificatesOnDeletion;

    /**
     * @return This field allows the CA to be deleted even if the CA has active certs. Active certs include both unrevoked and unexpired certs.
     * Use with care. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getIgnoreActiveCertificatesOnDeletion() {
        return this.ignoreActiveCertificatesOnDeletion;
    }
    /**
     * Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority
     * is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA
     * certificate. Otherwise, it is used to sign a CSR.
     * Structure is documented below.
     * 
     */
    @Export(name="keySpec", type=AuthorityKeySpec.class, parameters={})
    private Output<AuthorityKeySpec> keySpec;

    /**
     * @return Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority
     * is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA
     * certificate. Otherwise, it is used to sign a CSR.
     * Structure is documented below.
     * 
     */
    public Output<AuthorityKeySpec> getKeySpec() {
        return this.keySpec;
    }
    /**
     * Labels with user-defined metadata.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass":
     * "1.3kg", "count": "3" }.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels with user-defined metadata.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass":
     * "1.3kg", "count": "3" }.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Export(name="lifetime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lifetime;

    /**
     * @return The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Output</* @Nullable */ String> getLifetime() {
        return this.lifetime;
    }
    /**
     * Location of the CertificateAuthority. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the CertificateAuthority. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The resource name for this CertificateAuthority in the format projects/*{@literal /}locations/*{@literal /}certificateAuthorities/*.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this CertificateAuthority in the format projects/*{@literal /}locations/*{@literal /}certificateAuthorities/*.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such
     * that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the
     * current CertificateAuthority's certificate.
     * 
     */
    @Export(name="pemCaCertificates", type=List.class, parameters={String.class})
    private Output<List<String>> pemCaCertificates;

    /**
     * @return This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such
     * that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the
     * current CertificateAuthority's certificate.
     * 
     */
    public Output<List<String>> getPemCaCertificates() {
        return this.pemCaCertificates;
    }
    /**
     * The name of the CaPool this Certificate Authority belongs to.
     * 
     */
    @Export(name="pool", type=String.class, parameters={})
    private Output<String> pool;

    /**
     * @return The name of the CaPool this Certificate Authority belongs to.
     * 
     */
    public Output<String> getPool() {
        return this.pool;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The State for this CertificateAuthority.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The State for this CertificateAuthority.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The Type of this CertificateAuthority.
     * > **Note:** For `SUBORDINATE` Certificate Authorities, they need to
     * be manually activated (via Cloud Console of `gcloud`) before they can
     * issue certificates.
     * Default value is `SELF_SIGNED`.
     * Possible values are `SELF_SIGNED` and `SUBORDINATE`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The Type of this CertificateAuthority.
     * > **Note:** For `SUBORDINATE` Certificate Authorities, they need to
     * be manually activated (via Cloud Console of `gcloud`) before they can
     * issue certificates.
     * Default value is `SELF_SIGNED`.
     * Possible values are `SELF_SIGNED` and `SUBORDINATE`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }
    /**
     * The time at which this CertificateAuthority was updated. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time at which this CertificateAuthority was updated. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Authority(String name) {
        this(name, AuthorityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Authority(String name, AuthorityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Authority(String name, AuthorityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/authority:Authority", name, args == null ? AuthorityArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Authority(String name, Output<String> id, @Nullable AuthorityState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/authority:Authority", name, state, makeResourceOptions(options, id));
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
    public static Authority get(String name, Output<String> id, @Nullable AuthorityState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Authority(name, id, state, options);
    }
}
