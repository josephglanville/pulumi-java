// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.kms.inputs.GetKMSCryptoKeyArgs;
import io.pulumi.gcp.kms.inputs.GetKMSCryptoKeyVersionArgs;
import io.pulumi.gcp.kms.inputs.GetKMSKeyRingArgs;
import io.pulumi.gcp.kms.inputs.GetKMSSecretArgs;
import io.pulumi.gcp.kms.inputs.GetKMSSecretAsymmetricArgs;
import io.pulumi.gcp.kms.inputs.GetKMSSecretCiphertextArgs;
import io.pulumi.gcp.kms.outputs.GetKMSCryptoKeyResult;
import io.pulumi.gcp.kms.outputs.GetKMSCryptoKeyVersionResult;
import io.pulumi.gcp.kms.outputs.GetKMSKeyRingResult;
import io.pulumi.gcp.kms.outputs.GetKMSSecretAsymmetricResult;
import io.pulumi.gcp.kms.outputs.GetKMSSecretCiphertextResult;
import io.pulumi.gcp.kms.outputs.GetKMSSecretResult;
import java.util.concurrent.CompletableFuture;

public final class KmsFunctions {
    /**
     * Provides access to a Google Cloud Platform KMS CryptoKey. For more information see
     * [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key)
     * and
     * [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys).
     * 
     * A CryptoKey is an interface to key material which can be used to encrypt and decrypt data. A CryptoKey belongs to a
     * Google Cloud KMS KeyRing.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetKMSCryptoKeyResult> getKMSCryptoKey(GetKMSCryptoKeyArgs args) {
        return getKMSCryptoKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKMSCryptoKeyResult> getKMSCryptoKey(GetKMSCryptoKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:kms/getKMSCryptoKey:getKMSCryptoKey", TypeShape.of(GetKMSCryptoKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides access to a Google Cloud Platform KMS CryptoKeyVersion. For more information see
     * [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_version)
     * and
     * [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions).
     * 
     * A CryptoKeyVersion represents an individual cryptographic key, and the associated key material.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetKMSCryptoKeyVersionResult> getKMSCryptoKeyVersion(GetKMSCryptoKeyVersionArgs args) {
        return getKMSCryptoKeyVersion(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKMSCryptoKeyVersionResult> getKMSCryptoKeyVersion(GetKMSCryptoKeyVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:kms/getKMSCryptoKeyVersion:getKMSCryptoKeyVersion", TypeShape.of(GetKMSCryptoKeyVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides access to Google Cloud Platform KMS KeyRing. For more information see
     * [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_ring)
     * and
     * [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).
     * 
     * A KeyRing is a grouping of CryptoKeys for organizational purposes. A KeyRing belongs to a Google Cloud Platform Project
     * and resides in a specific location.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetKMSKeyRingResult> getKMSKeyRing(GetKMSKeyRingArgs args) {
        return getKMSKeyRing(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKMSKeyRingResult> getKMSKeyRing(GetKMSKeyRingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:kms/getKMSKeyRing:getKMSKeyRing", TypeShape.of(GetKMSKeyRingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source allows you to use data encrypted with Google Cloud KMS
     * within your resource definitions.
     * 
     * For more information see
     * [the official documentation](https://cloud.google.com/kms/docs/encrypt-decrypt).
     * 
     * > **NOTE:** Using this data provider will allow you to conceal secret data within your
     * resource definitions, but it does not take care of protecting that data in the
     * logging output, plan output, or state output.  Please take care to secure your secret
     * data outside of resource definitions.
     * 
     */
    public static CompletableFuture<GetKMSSecretResult> getKMSSecret(GetKMSSecretArgs args) {
        return getKMSSecret(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKMSSecretResult> getKMSSecret(GetKMSSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:kms/getKMSSecret:getKMSSecret", TypeShape.of(GetKMSSecretResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetKMSSecretAsymmetricResult> getKMSSecretAsymmetric(GetKMSSecretAsymmetricArgs args) {
        return getKMSSecretAsymmetric(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKMSSecretAsymmetricResult> getKMSSecretAsymmetric(GetKMSSecretAsymmetricArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:kms/getKMSSecretAsymmetric:getKMSSecretAsymmetric", TypeShape.of(GetKMSSecretAsymmetricResult.class), args, Utilities.withVersion(options));
    }
    /**
     * !> **Warning:** This data source is deprecated. Use the `gcp.kms.SecretCiphertext` **resource** instead.
     * 
     * This data source allows you to encrypt data with Google Cloud KMS and use the
     * ciphertext within your resource definitions.
     * 
     * For more information see
     * [the official documentation](https://cloud.google.com/kms/docs/encrypt-decrypt).
     * 
     * > **NOTE:** Using this data source will allow you to conceal secret data within your
     * resource definitions, but it does not take care of protecting that data in the
     * logging output, plan output, or state output.  Please take care to secure your secret
     * data outside of resource definitions.
     * 
     */
    public static CompletableFuture<GetKMSSecretCiphertextResult> getKMSSecretCiphertext(GetKMSSecretCiphertextArgs args) {
        return getKMSSecretCiphertext(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKMSSecretCiphertextResult> getKMSSecretCiphertext(GetKMSSecretCiphertextArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:kms/getKMSSecretCiphertext:getKMSSecretCiphertext", TypeShape.of(GetKMSSecretCiphertextResult.class), args, Utilities.withVersion(options));
    }
}