// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.privateca_v1.CertificateAuthorityArgs;
import io.pulumi.googlenative.privateca_v1.outputs.AccessUrlsResponse;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateConfigResponse;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateDescriptionResponse;
import io.pulumi.googlenative.privateca_v1.outputs.KeyVersionSpecResponse;
import io.pulumi.googlenative.privateca_v1.outputs.SubordinateConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a new CertificateAuthority in a given Project and Location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:privateca/v1:CertificateAuthority")
public class CertificateAuthority extends io.pulumi.resources.CustomResource {
    /**
     * URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * 
     */
    @OutputExport(name="accessUrls", type=AccessUrlsResponse.class, parameters={})
    private Output<AccessUrlsResponse> accessUrls;

    /**
     * @return URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * 
     */
    public Output<AccessUrlsResponse> getAccessUrls() {
        return this.accessUrls;
    }
    /**
     * A structured description of this CertificateAuthority's CA certificate and its issuers. Ordered as self-to-root.
     * 
     */
    @OutputExport(name="caCertificateDescriptions", type=List.class, parameters={CertificateDescriptionResponse.class})
    private Output<List<CertificateDescriptionResponse>> caCertificateDescriptions;

    /**
     * @return A structured description of this CertificateAuthority's CA certificate and its issuers. Ordered as self-to-root.
     * 
     */
    public Output<List<CertificateDescriptionResponse>> getCaCertificateDescriptions() {
        return this.caCertificateDescriptions;
    }
    /**
     * Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    @OutputExport(name="config", type=CertificateConfigResponse.class, parameters={})
    private Output<CertificateConfigResponse> config;

    /**
     * @return Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    public Output<CertificateConfigResponse> getConfig() {
        return this.config;
    }
    /**
     * The time at which this CertificateAuthority was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this CertificateAuthority was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The time at which this CertificateAuthority was soft deleted, if it is in the DELETED state.
     * 
     */
    @OutputExport(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return The time at which this CertificateAuthority was soft deleted, if it is in the DELETED state.
     * 
     */
    public Output<String> getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * The time at which this CertificateAuthority will be permanently purged, if it is in the DELETED state.
     * 
     */
    @OutputExport(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return The time at which this CertificateAuthority will be permanently purged, if it is in the DELETED state.
     * 
     */
    public Output<String> getExpireTime() {
        return this.expireTime;
    }
    /**
     * Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    @OutputExport(name="gcsBucket", type=String.class, parameters={})
    private Output<String> gcsBucket;

    /**
     * @return Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    public Output<String> getGcsBucket() {
        return this.gcsBucket;
    }
    /**
     * Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    @OutputExport(name="keySpec", type=KeyVersionSpecResponse.class, parameters={})
    private Output<KeyVersionSpecResponse> keySpec;

    /**
     * @return Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    public Output<KeyVersionSpecResponse> getKeySpec() {
        return this.keySpec;
    }
    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Immutable. The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate.
     * 
     */
    @OutputExport(name="lifetime", type=String.class, parameters={})
    private Output<String> lifetime;

    /**
     * @return Immutable. The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate.
     * 
     */
    public Output<String> getLifetime() {
        return this.lifetime;
    }
    /**
     * The resource name for this CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority's certificate.
     * 
     */
    @OutputExport(name="pemCaCertificates", type=List.class, parameters={String.class})
    private Output<List<String>> pemCaCertificates;

    /**
     * @return This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority's certificate.
     * 
     */
    public Output<List<String>> getPemCaCertificates() {
        return this.pemCaCertificates;
    }
    /**
     * The State for this CertificateAuthority.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The State for this CertificateAuthority.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    @OutputExport(name="subordinateConfig", type=SubordinateConfigResponse.class, parameters={})
    private Output<SubordinateConfigResponse> subordinateConfig;

    /**
     * @return Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    public Output<SubordinateConfigResponse> getSubordinateConfig() {
        return this.subordinateConfig;
    }
    /**
     * The CaPool.Tier of the CaPool that includes this CertificateAuthority.
     * 
     */
    @OutputExport(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return The CaPool.Tier of the CaPool that includes this CertificateAuthority.
     * 
     */
    public Output<String> getTier() {
        return this.tier;
    }
    /**
     * Immutable. The Type of this CertificateAuthority.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Immutable. The Type of this CertificateAuthority.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The time at which this CertificateAuthority was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time at which this CertificateAuthority was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateAuthority(String name) {
        this(name, CertificateAuthorityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateAuthority(String name, CertificateAuthorityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateAuthority(String name, CertificateAuthorityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:CertificateAuthority", name, args == null ? CertificateAuthorityArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CertificateAuthority(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:CertificateAuthority", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static CertificateAuthority get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CertificateAuthority(name, id, options);
    }
}
