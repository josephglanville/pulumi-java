// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetCryptoKeyArgs;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetCryptoKeyVersionArgs;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetEkmConnectionArgs;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetEkmConnectionIamPolicyArgs;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetImportJobArgs;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetKeyRingArgs;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetKeyRingCryptoKeyIamPolicyArgs;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetKeyRingIamPolicyArgs;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetKeyRingImportJobIamPolicyArgs;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetCryptoKeyResult;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetCryptoKeyVersionResult;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetEkmConnectionIamPolicyResult;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetEkmConnectionResult;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetImportJobResult;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetKeyRingCryptoKeyIamPolicyResult;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetKeyRingIamPolicyResult;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetKeyRingImportJobIamPolicyResult;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetKeyRingResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudkms_v1Functions {
    /**
     * Returns metadata for a given CryptoKey, as well as its primary CryptoKeyVersion.
     * 
     */
    public static CompletableFuture<GetCryptoKeyResult> getCryptoKey(GetCryptoKeyArgs args) {
        return getCryptoKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCryptoKeyResult> getCryptoKey(GetCryptoKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getCryptoKey", TypeShape.of(GetCryptoKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given CryptoKeyVersion.
     * 
     */
    public static CompletableFuture<GetCryptoKeyVersionResult> getCryptoKeyVersion(GetCryptoKeyVersionArgs args) {
        return getCryptoKeyVersion(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCryptoKeyVersionResult> getCryptoKeyVersion(GetCryptoKeyVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getCryptoKeyVersion", TypeShape.of(GetCryptoKeyVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given EkmConnection.
     * 
     */
    public static CompletableFuture<GetEkmConnectionResult> getEkmConnection(GetEkmConnectionArgs args) {
        return getEkmConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEkmConnectionResult> getEkmConnection(GetEkmConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getEkmConnection", TypeShape.of(GetEkmConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetEkmConnectionIamPolicyResult> getEkmConnectionIamPolicy(GetEkmConnectionIamPolicyArgs args) {
        return getEkmConnectionIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEkmConnectionIamPolicyResult> getEkmConnectionIamPolicy(GetEkmConnectionIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getEkmConnectionIamPolicy", TypeShape.of(GetEkmConnectionIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given ImportJob.
     * 
     */
    public static CompletableFuture<GetImportJobResult> getImportJob(GetImportJobArgs args) {
        return getImportJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImportJobResult> getImportJob(GetImportJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getImportJob", TypeShape.of(GetImportJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given KeyRing.
     * 
     */
    public static CompletableFuture<GetKeyRingResult> getKeyRing(GetKeyRingArgs args) {
        return getKeyRing(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKeyRingResult> getKeyRing(GetKeyRingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getKeyRing", TypeShape.of(GetKeyRingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetKeyRingCryptoKeyIamPolicyResult> getKeyRingCryptoKeyIamPolicy(GetKeyRingCryptoKeyIamPolicyArgs args) {
        return getKeyRingCryptoKeyIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKeyRingCryptoKeyIamPolicyResult> getKeyRingCryptoKeyIamPolicy(GetKeyRingCryptoKeyIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getKeyRingCryptoKeyIamPolicy", TypeShape.of(GetKeyRingCryptoKeyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetKeyRingIamPolicyResult> getKeyRingIamPolicy(GetKeyRingIamPolicyArgs args) {
        return getKeyRingIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKeyRingIamPolicyResult> getKeyRingIamPolicy(GetKeyRingIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getKeyRingIamPolicy", TypeShape.of(GetKeyRingIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetKeyRingImportJobIamPolicyResult> getKeyRingImportJobIamPolicy(GetKeyRingImportJobIamPolicyArgs args) {
        return getKeyRingImportJobIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKeyRingImportJobIamPolicyResult> getKeyRingImportJobIamPolicy(GetKeyRingImportJobIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getKeyRingImportJobIamPolicy", TypeShape.of(GetKeyRingImportJobIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
