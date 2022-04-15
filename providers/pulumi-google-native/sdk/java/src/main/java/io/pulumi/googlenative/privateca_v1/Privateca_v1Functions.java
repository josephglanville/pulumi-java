// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.privateca_v1.inputs.GetCaPoolArgs;
import io.pulumi.googlenative.privateca_v1.inputs.GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyArgs;
import io.pulumi.googlenative.privateca_v1.inputs.GetCaPoolIamPolicyArgs;
import io.pulumi.googlenative.privateca_v1.inputs.GetCertificateArgs;
import io.pulumi.googlenative.privateca_v1.inputs.GetCertificateAuthorityArgs;
import io.pulumi.googlenative.privateca_v1.inputs.GetCertificateTemplateArgs;
import io.pulumi.googlenative.privateca_v1.inputs.GetCertificateTemplateIamPolicyArgs;
import io.pulumi.googlenative.privateca_v1.outputs.GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyResult;
import io.pulumi.googlenative.privateca_v1.outputs.GetCaPoolIamPolicyResult;
import io.pulumi.googlenative.privateca_v1.outputs.GetCaPoolResult;
import io.pulumi.googlenative.privateca_v1.outputs.GetCertificateAuthorityResult;
import io.pulumi.googlenative.privateca_v1.outputs.GetCertificateResult;
import io.pulumi.googlenative.privateca_v1.outputs.GetCertificateTemplateIamPolicyResult;
import io.pulumi.googlenative.privateca_v1.outputs.GetCertificateTemplateResult;
import java.util.concurrent.CompletableFuture;

public final class Privateca_v1Functions {
    /**
     * Returns a CaPool.
     * 
     */
    public static CompletableFuture<GetCaPoolResult> getCaPool(GetCaPoolArgs args) {
        return getCaPool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCaPoolResult> getCaPool(GetCaPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1:getCaPool", TypeShape.of(GetCaPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyResult> getCaPoolCertificateAuthorityCertificateRevocationListIamPolicy(GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyArgs args) {
        return getCaPoolCertificateAuthorityCertificateRevocationListIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyResult> getCaPoolCertificateAuthorityCertificateRevocationListIamPolicy(GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1:getCaPoolCertificateAuthorityCertificateRevocationListIamPolicy", TypeShape.of(GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetCaPoolIamPolicyResult> getCaPoolIamPolicy(GetCaPoolIamPolicyArgs args) {
        return getCaPoolIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCaPoolIamPolicyResult> getCaPoolIamPolicy(GetCaPoolIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1:getCaPoolIamPolicy", TypeShape.of(GetCaPoolIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns a Certificate.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns a CertificateAuthority.
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityResult> getCertificateAuthority(GetCertificateAuthorityArgs args) {
        return getCertificateAuthority(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCertificateAuthorityResult> getCertificateAuthority(GetCertificateAuthorityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1:getCertificateAuthority", TypeShape.of(GetCertificateAuthorityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns a CertificateTemplate.
     * 
     */
    public static CompletableFuture<GetCertificateTemplateResult> getCertificateTemplate(GetCertificateTemplateArgs args) {
        return getCertificateTemplate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCertificateTemplateResult> getCertificateTemplate(GetCertificateTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1:getCertificateTemplate", TypeShape.of(GetCertificateTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetCertificateTemplateIamPolicyResult> getCertificateTemplateIamPolicy(GetCertificateTemplateIamPolicyArgs args) {
        return getCertificateTemplateIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCertificateTemplateIamPolicyResult> getCertificateTemplateIamPolicy(GetCertificateTemplateIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1:getCertificateTemplateIamPolicy", TypeShape.of(GetCertificateTemplateIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}