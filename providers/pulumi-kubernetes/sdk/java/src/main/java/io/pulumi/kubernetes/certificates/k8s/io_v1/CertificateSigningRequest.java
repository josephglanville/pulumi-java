// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.certificates.k8s.io_v1.CertificateSigningRequestArgs;
import io.pulumi.kubernetes.certificates.k8s.io_v1.outputs.CertificateSigningRequestSpec;
import io.pulumi.kubernetes.certificates.k8s.io_v1.outputs.CertificateSigningRequestStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * CertificateSigningRequest objects provide a mechanism to obtain x509 certificates by submitting a certificate signing request, and having it asynchronously approved and issued.
 * 
 * Kubelets use this API to obtain:
 *  1. client certificates to authenticate to kube-apiserver (with the "kubernetes.io/kube-apiserver-client-kubelet" signerName).
 *  2. serving certificates for TLS endpoints kube-apiserver can connect to securely (with the "kubernetes.io/kubelet-serving" signerName).
 * 
 * This API can be used to request client certificates to authenticate to kube-apiserver (with the "kubernetes.io/kube-apiserver-client" signerName), or to obtain certificates from custom non-Kubernetes signers.
 * 
 */
@ResourceType(type="kubernetes:certificates.k8s.io/v1:CertificateSigningRequest")
public class CertificateSigningRequest extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * spec contains the certificate request, and is immutable after creation. Only the request, signerName, expirationSeconds, and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users.
     * 
     */
    @Export(name="spec", type=CertificateSigningRequestSpec.class, parameters={})
    private Output<CertificateSigningRequestSpec> spec;

    /**
     * @return spec contains the certificate request, and is immutable after creation. Only the request, signerName, expirationSeconds, and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users.
     * 
     */
    public Output<CertificateSigningRequestSpec> getSpec() {
        return this.spec;
    }
    /**
     * status contains information about whether the request is approved or denied, and the certificate issued by the signer, or the failure condition indicating signer failure.
     * 
     */
    @Export(name="status", type=CertificateSigningRequestStatus.class, parameters={})
    private Output</* @Nullable */ CertificateSigningRequestStatus> status;

    /**
     * @return status contains information about whether the request is approved or denied, and the certificate issued by the signer, or the failure condition indicating signer failure.
     * 
     */
    public Output</* @Nullable */ CertificateSigningRequestStatus> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(CertificateSigningRequestArgs.Builder a);
    }
    private static io.pulumi.kubernetes.certificates.k8s.io_v1.CertificateSigningRequestArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.certificates.k8s.io_v1.CertificateSigningRequestArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CertificateSigningRequest(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateSigningRequest(String name) {
        this(name, CertificateSigningRequestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateSigningRequest(String name, CertificateSigningRequestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateSigningRequest(String name, CertificateSigningRequestArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:certificates.k8s.io/v1:CertificateSigningRequest", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private CertificateSigningRequest(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:certificates.k8s.io/v1:CertificateSigningRequest", name, null, makeResourceOptions(options, id));
    }

    private static CertificateSigningRequestArgs makeArgs(CertificateSigningRequestArgs args) {
        var builder = args == null ? CertificateSigningRequestArgs.builder() : CertificateSigningRequestArgs.builder(args);
        return builder
            .apiVersion("certificates.k8s.io/v1")
            .kind("CertificateSigningRequest")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:certificates.k8s.io/v1beta1:CertificateSigningRequest").build())
            ))
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
    public static CertificateSigningRequest get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CertificateSigningRequest(name, id, options);
    }
}
