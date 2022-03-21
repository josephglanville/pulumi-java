// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.enums.PgpSignedAttestationContentType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An attestation wrapper with a PGP-compatible signature. This message only supports `ATTACHED` signatures, where the payload that is signed is included alongside the signature itself in the same file.
 * 
 */
public final class PgpSignedAttestationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PgpSignedAttestationArgs Empty = new PgpSignedAttestationArgs();

    /**
     * Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<PgpSignedAttestationContentType> contentType;

    public Output<PgpSignedAttestationContentType> getContentType() {
        return this.contentType == null ? Output.empty() : this.contentType;
    }

    /**
     * The cryptographic fingerprint of the key used to generate the signature, as output by, e.g. `gpg --list-keys`. This should be the version 4, full 160-bit fingerprint, expressed as a 40 character hexidecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details. Implementations may choose to acknowledge "LONG", "SHORT", or other abbreviated key IDs, but only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved from the `fpr` field returned when calling --list-keys with --with-colons. For example: ```gpg --with-colons --with-fingerprint --force-v4-certs \ --list-keys attester@example.com tru::1:1513631572:0:3:1:5 pub:...... fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB:``` Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
     * 
     */
    @Import(name="pgpKeyId")
      private final @Nullable Output<String> pgpKeyId;

    public Output<String> getPgpKeyId() {
        return this.pgpKeyId == null ? Output.empty() : this.pgpKeyId;
    }

    /**
     * The raw content of the signature, as output by GNU Privacy Guard (GPG) or equivalent. Since this message only supports attached signatures, the payload that was signed must be attached. While the signature format supported is dependent on the verification implementation, currently only ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign` rather than `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor --output=signature.gpg payload.json` will create the signature content expected in this field in `signature.gpg` for the `payload.json` attestation payload.
     * 
     */
    @Import(name="signature", required=true)
      private final Output<String> signature;

    public Output<String> getSignature() {
        return this.signature;
    }

    public PgpSignedAttestationArgs(
        @Nullable Output<PgpSignedAttestationContentType> contentType,
        @Nullable Output<String> pgpKeyId,
        Output<String> signature) {
        this.contentType = contentType;
        this.pgpKeyId = pgpKeyId;
        this.signature = Objects.requireNonNull(signature, "expected parameter 'signature' to be non-null");
    }

    private PgpSignedAttestationArgs() {
        this.contentType = Output.empty();
        this.pgpKeyId = Output.empty();
        this.signature = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PgpSignedAttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PgpSignedAttestationContentType> contentType;
        private @Nullable Output<String> pgpKeyId;
        private Output<String> signature;

        public Builder() {
    	      // Empty
        }

        public Builder(PgpSignedAttestationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.pgpKeyId = defaults.pgpKeyId;
    	      this.signature = defaults.signature;
        }

        public Builder contentType(@Nullable Output<PgpSignedAttestationContentType> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable PgpSignedAttestationContentType contentType) {
            this.contentType = Output.ofNullable(contentType);
            return this;
        }
        public Builder pgpKeyId(@Nullable Output<String> pgpKeyId) {
            this.pgpKeyId = pgpKeyId;
            return this;
        }
        public Builder pgpKeyId(@Nullable String pgpKeyId) {
            this.pgpKeyId = Output.ofNullable(pgpKeyId);
            return this;
        }
        public Builder signature(Output<String> signature) {
            this.signature = Objects.requireNonNull(signature);
            return this;
        }
        public Builder signature(String signature) {
            this.signature = Output.of(Objects.requireNonNull(signature));
            return this;
        }        public PgpSignedAttestationArgs build() {
            return new PgpSignedAttestationArgs(contentType, pgpKeyId, signature);
        }
    }
}
