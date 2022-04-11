// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.KeySigningKeyArgs;
import io.pulumi.aws.route53.inputs.KeySigningKeyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Route 53 Key Signing Key. To manage Domain Name System Security Extensions (DNSSEC) for a Hosted Zone, see the `aws.route53.HostedZoneDnsSec` resource. For more information about managing DNSSEC in Route 53, see the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_route53_key_signing_key` resources can be imported by using the Route 53 Hosted Zone identifier and KMS Key identifier, separated by a comma (`,`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/keySigningKey:KeySigningKey example Z1D633PJN98FT9,example
 * ```
 * 
 */
@ResourceType(type="aws:route53/keySigningKey:KeySigningKey")
public class KeySigningKey extends io.pulumi.resources.CustomResource {
    /**
     * A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
     * 
     */
    @Export(name="digestAlgorithmMnemonic", type=String.class, parameters={})
    private Output<String> digestAlgorithmMnemonic;

    /**
     * @return A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
     * 
     */
    public Output<String> getDigestAlgorithmMnemonic() {
        return this.digestAlgorithmMnemonic;
    }
    /**
     * An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
     * 
     */
    @Export(name="digestAlgorithmType", type=Integer.class, parameters={})
    private Output<Integer> digestAlgorithmType;

    /**
     * @return An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
     * 
     */
    public Output<Integer> getDigestAlgorithmType() {
        return this.digestAlgorithmType;
    }
    /**
     * A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by the DNS system.
     * 
     */
    @Export(name="digestValue", type=String.class, parameters={})
    private Output<String> digestValue;

    /**
     * @return A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by the DNS system.
     * 
     */
    public Output<String> getDigestValue() {
        return this.digestValue;
    }
    /**
     * A string that represents a DNSKEY record.
     * 
     */
    @Export(name="dnskeyRecord", type=String.class, parameters={})
    private Output<String> dnskeyRecord;

    /**
     * @return A string that represents a DNSKEY record.
     * 
     */
    public Output<String> getDnskeyRecord() {
        return this.dnskeyRecord;
    }
    /**
     * A string that represents a delegation signer (DS) record.
     * 
     */
    @Export(name="dsRecord", type=String.class, parameters={})
    private Output<String> dsRecord;

    /**
     * @return A string that represents a delegation signer (DS) record.
     * 
     */
    public Output<String> getDsRecord() {
        return this.dsRecord;
    }
    /**
     * An integer that specifies how the key is used. For key-signing key (KSK), this value is always 257.
     * 
     */
    @Export(name="flag", type=Integer.class, parameters={})
    private Output<Integer> flag;

    /**
     * @return An integer that specifies how the key is used. For key-signing key (KSK), this value is always 257.
     * 
     */
    public Output<Integer> getFlag() {
        return this.flag;
    }
    /**
     * Identifier of the Route 53 Hosted Zone.
     * 
     */
    @Export(name="hostedZoneId", type=String.class, parameters={})
    private Output<String> hostedZoneId;

    /**
     * @return Identifier of the Route 53 Hosted Zone.
     * 
     */
    public Output<String> getHostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
     * 
     */
    @Export(name="keyManagementServiceArn", type=String.class, parameters={})
    private Output<String> keyManagementServiceArn;

    /**
     * @return Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
     * 
     */
    public Output<String> getKeyManagementServiceArn() {
        return this.keyManagementServiceArn;
    }
    /**
     * An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is described in [RFC-4034 Appendix B](https://tools.ietf.org/rfc/rfc4034.txt).
     * 
     */
    @Export(name="keyTag", type=Integer.class, parameters={})
    private Output<Integer> keyTag;

    /**
     * @return An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is described in [RFC-4034 Appendix B](https://tools.ietf.org/rfc/rfc4034.txt).
     * 
     */
    public Output<Integer> getKeyTag() {
        return this.keyTag;
    }
    /**
     * Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The public key, represented as a Base64 encoding, as required by [RFC-4034 Page 5](https://tools.ietf.org/rfc/rfc4034.txt).
     * 
     */
    @Export(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return The public key, represented as a Base64 encoding, as required by [RFC-4034 Page 5](https://tools.ietf.org/rfc/rfc4034.txt).
     * 
     */
    public Output<String> getPublicKey() {
        return this.publicKey;
    }
    /**
     * A string used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
     * 
     */
    @Export(name="signingAlgorithmMnemonic", type=String.class, parameters={})
    private Output<String> signingAlgorithmMnemonic;

    /**
     * @return A string used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
     * 
     */
    public Output<String> getSigningAlgorithmMnemonic() {
        return this.signingAlgorithmMnemonic;
    }
    /**
     * An integer used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
     * 
     */
    @Export(name="signingAlgorithmType", type=Integer.class, parameters={})
    private Output<Integer> signingAlgorithmType;

    /**
     * @return An integer used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
     * 
     */
    public Output<Integer> getSigningAlgorithmType() {
        return this.signingAlgorithmType;
    }
    /**
     * Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeySigningKey(String name) {
        this(name, KeySigningKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeySigningKey(String name, KeySigningKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeySigningKey(String name, KeySigningKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/keySigningKey:KeySigningKey", name, args == null ? KeySigningKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KeySigningKey(String name, Output<String> id, @Nullable KeySigningKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/keySigningKey:KeySigningKey", name, state, makeResourceOptions(options, id));
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
    public static KeySigningKey get(String name, Output<String> id, @Nullable KeySigningKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KeySigningKey(name, id, state, options);
    }
}
