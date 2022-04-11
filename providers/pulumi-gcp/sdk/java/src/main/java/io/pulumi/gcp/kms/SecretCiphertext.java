// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.kms.SecretCiphertextArgs;
import io.pulumi.gcp.kms.inputs.SecretCiphertextState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Encrypts secret data with Google Cloud KMS and provides access to the ciphertext.
 * 
 * > **NOTE:** Using this resource will allow you to conceal secret data within your
 * resource definitions, but it does not take care of protecting that data in the
 * logging output, plan output, or state output.  Please take care to secure your secret
 * data outside of resource definitions.
 * 
 * To get more information about SecretCiphertext, see:
 * 
 * * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys/encrypt)
 * * How-to Guides
 *     * [Encrypting and decrypting data with a symmetric key](https://cloud.google.com/kms/docs/encrypt-decrypt)
 * 
 * > **Warning:** All arguments including `plaintext` and `additional_authenticated_data` will be stored in the raw
 * state as plain-text. [Read more about secrets in state](https://www.pulumi.com/docs/intro/concepts/programming-model/#secrets).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:kms/secretCiphertext:SecretCiphertext")
public class SecretCiphertext extends io.pulumi.resources.CustomResource {
    /**
     * The additional authenticated data used for integrity checks during encryption and decryption.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="additionalAuthenticatedData", type=String.class, parameters={})
    private Output</* @Nullable */ String> additionalAuthenticatedData;

    /**
     * @return The additional authenticated data used for integrity checks during encryption and decryption.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output</* @Nullable */ String> getAdditionalAuthenticatedData() {
        return this.additionalAuthenticatedData;
    }
    /**
     * Contains the result of encrypting the provided plaintext, encoded in base64.
     * 
     */
    @Export(name="ciphertext", type=String.class, parameters={})
    private Output<String> ciphertext;

    /**
     * @return Contains the result of encrypting the provided plaintext, encoded in base64.
     * 
     */
    public Output<String> getCiphertext() {
        return this.ciphertext;
    }
    /**
     * The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}'`
     * 
     */
    @Export(name="cryptoKey", type=String.class, parameters={})
    private Output<String> cryptoKey;

    /**
     * @return The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}'`
     * 
     */
    public Output<String> getCryptoKey() {
        return this.cryptoKey;
    }
    /**
     * The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="plaintext", type=String.class, parameters={})
    private Output<String> plaintext;

    /**
     * @return The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> getPlaintext() {
        return this.plaintext;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretCiphertext(String name) {
        this(name, SecretCiphertextArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretCiphertext(String name, SecretCiphertextArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretCiphertext(String name, SecretCiphertextArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/secretCiphertext:SecretCiphertext", name, args == null ? SecretCiphertextArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretCiphertext(String name, Output<String> id, @Nullable SecretCiphertextState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/secretCiphertext:SecretCiphertext", name, state, makeResourceOptions(options, id));
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
    public static SecretCiphertext get(String name, Output<String> id, @Nullable SecretCiphertextState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecretCiphertext(name, id, state, options);
    }
}
