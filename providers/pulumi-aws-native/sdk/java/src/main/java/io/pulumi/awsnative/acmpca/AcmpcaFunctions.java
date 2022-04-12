// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.acmpca.inputs.GetCertificateArgs;
import io.pulumi.awsnative.acmpca.inputs.GetCertificateAuthorityActivationArgs;
import io.pulumi.awsnative.acmpca.inputs.GetCertificateAuthorityArgs;
import io.pulumi.awsnative.acmpca.inputs.GetPermissionArgs;
import io.pulumi.awsnative.acmpca.outputs.GetCertificateAuthorityActivationResult;
import io.pulumi.awsnative.acmpca.outputs.GetCertificateAuthorityResult;
import io.pulumi.awsnative.acmpca.outputs.GetCertificateResult;
import io.pulumi.awsnative.acmpca.outputs.GetPermissionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AcmpcaFunctions {
    /**
     * A certificate issued via a private certificate authority
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:acmpca:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Private certificate authority.
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityResult> getCertificateAuthority(GetCertificateAuthorityArgs args) {
        return getCertificateAuthority(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCertificateAuthorityResult> getCertificateAuthority(GetCertificateAuthorityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:acmpca:getCertificateAuthority", TypeShape.of(GetCertificateAuthorityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Used to install the certificate authority certificate and update the certificate authority status.
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityActivationResult> getCertificateAuthorityActivation(GetCertificateAuthorityActivationArgs args) {
        return getCertificateAuthorityActivation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCertificateAuthorityActivationResult> getCertificateAuthorityActivation(GetCertificateAuthorityActivationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:acmpca:getCertificateAuthorityActivation", TypeShape.of(GetCertificateAuthorityActivationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Permission set on private certificate authority
     * 
     */
    public static CompletableFuture<GetPermissionResult> getPermission(GetPermissionArgs args) {
        return getPermission(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPermissionResult> getPermission(GetPermissionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:acmpca:getPermission", TypeShape.of(GetPermissionResult.class), args, Utilities.withVersion(options));
    }
}
