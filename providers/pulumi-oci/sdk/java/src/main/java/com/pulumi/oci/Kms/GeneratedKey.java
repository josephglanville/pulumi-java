// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Kms.GeneratedKeyArgs;
import com.pulumi.oci.Kms.inputs.GeneratedKeyState;
import com.pulumi.oci.Kms.outputs.GeneratedKeyKeyShape;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Generated Key resource in Oracle Cloud Infrastructure Kms service.
 * 
 * Generates a key that you can use to encrypt or decrypt data.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Import is not supported for this resource.
 * 
 */
@ResourceType(type="oci:Kms/generatedKey:GeneratedKey")
public class GeneratedKey extends com.pulumi.resources.CustomResource {
    /**
     * Information that can be used to provide an encryption context for the encrypted data. The length of the string representation of the associated data must be fewer than 4096 characters.
     * 
     */
    @Export(name="associatedData", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> associatedData;

    /**
     * @return Information that can be used to provide an encryption context for the encrypted data. The length of the string representation of the associated data must be fewer than 4096 characters.
     * 
     */
    public Output<Optional<Map<String,Object>>> associatedData() {
        return Codegen.optional(this.associatedData);
    }
    /**
     * The encrypted data encryption key generated from a master encryption key.
     * 
     */
    @Export(name="ciphertext", type=String.class, parameters={})
    private Output<String> ciphertext;

    /**
     * @return The encrypted data encryption key generated from a master encryption key.
     * 
     */
    public Output<String> ciphertext() {
        return this.ciphertext;
    }
    /**
     * The service endpoint to perform cryptographic operations against. Cryptographic operations include &#39;Encrypt,&#39; &#39;Decrypt,&#39; and &#39;GenerateDataEncryptionKey&#39; operations. see Vault Crypto endpoint.
     * 
     */
    @Export(name="cryptoEndpoint", type=String.class, parameters={})
    private Output<String> cryptoEndpoint;

    /**
     * @return The service endpoint to perform cryptographic operations against. Cryptographic operations include &#39;Encrypt,&#39; &#39;Decrypt,&#39; and &#39;GenerateDataEncryptionKey&#39; operations. see Vault Crypto endpoint.
     * 
     */
    public Output<String> cryptoEndpoint() {
        return this.cryptoEndpoint;
    }
    /**
     * If true, the generated key is also returned unencrypted.
     * 
     */
    @Export(name="includePlaintextKey", type=Boolean.class, parameters={})
    private Output<Boolean> includePlaintextKey;

    /**
     * @return If true, the generated key is also returned unencrypted.
     * 
     */
    public Output<Boolean> includePlaintextKey() {
        return this.includePlaintextKey;
    }
    /**
     * The OCID of the master encryption key to encrypt the generated data encryption key with.
     * 
     */
    @Export(name="keyId", type=String.class, parameters={})
    private Output<String> keyId;

    /**
     * @return The OCID of the master encryption key to encrypt the generated data encryption key with.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }
    /**
     * The cryptographic properties of a key.
     * 
     */
    @Export(name="keyShape", type=GeneratedKeyKeyShape.class, parameters={})
    private Output<GeneratedKeyKeyShape> keyShape;

    /**
     * @return The cryptographic properties of a key.
     * 
     */
    public Output<GeneratedKeyKeyShape> keyShape() {
        return this.keyShape;
    }
    /**
     * Information that provides context for audit logging. You can provide this additional data by formatting it as key-value pairs to include in audit logs when audit logging is enabled.
     * 
     */
    @Export(name="loggingContext", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> loggingContext;

    /**
     * @return Information that provides context for audit logging. You can provide this additional data by formatting it as key-value pairs to include in audit logs when audit logging is enabled.
     * 
     */
    public Output<Optional<Map<String,Object>>> loggingContext() {
        return Codegen.optional(this.loggingContext);
    }
    /**
     * The plaintext data encryption key, a base64-encoded sequence of random bytes, which is included if the [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/iaas/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey) request includes the `includePlaintextKey` parameter and sets its value to &#34;true&#34;.
     * 
     */
    @Export(name="plaintext", type=String.class, parameters={})
    private Output<String> plaintext;

    /**
     * @return The plaintext data encryption key, a base64-encoded sequence of random bytes, which is included if the [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/iaas/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey) request includes the `includePlaintextKey` parameter and sets its value to &#34;true&#34;.
     * 
     */
    public Output<String> plaintext() {
        return this.plaintext;
    }
    /**
     * The checksum of the plaintext data encryption key, which is included if the [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/iaas/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey) request includes the `includePlaintextKey` parameter and sets its value to &#34;true&#34;.
     * 
     */
    @Export(name="plaintextChecksum", type=String.class, parameters={})
    private Output<String> plaintextChecksum;

    /**
     * @return The checksum of the plaintext data encryption key, which is included if the [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/iaas/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey) request includes the `includePlaintextKey` parameter and sets its value to &#34;true&#34;.
     * 
     */
    public Output<String> plaintextChecksum() {
        return this.plaintextChecksum;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GeneratedKey(String name) {
        this(name, GeneratedKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GeneratedKey(String name, GeneratedKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GeneratedKey(String name, GeneratedKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Kms/generatedKey:GeneratedKey", name, args == null ? GeneratedKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GeneratedKey(String name, Output<String> id, @Nullable GeneratedKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Kms/generatedKey:GeneratedKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static GeneratedKey get(String name, Output<String> id, @Nullable GeneratedKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GeneratedKey(name, id, state, options);
    }
}
