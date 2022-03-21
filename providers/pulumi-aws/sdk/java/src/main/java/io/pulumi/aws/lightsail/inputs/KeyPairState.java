// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyPairState extends io.pulumi.resources.ResourceArgs {

    public static final KeyPairState Empty = new KeyPairState();

    /**
     * The ARN of the Lightsail key pair
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The MD5 public key fingerprint for the encrypted
     * private key
     * 
     */
    @Import(name="encryptedFingerprint")
      private final @Nullable Output<String> encryptedFingerprint;

    public Output<String> getEncryptedFingerprint() {
        return this.encryptedFingerprint == null ? Output.empty() : this.encryptedFingerprint;
    }

    /**
     * the private key material, base 64 encoded and
     * encrypted with the given `pgp_key`. This is only populated when creating a new
     * key and `pgp_key` is supplied
     * 
     */
    @Import(name="encryptedPrivateKey")
      private final @Nullable Output<String> encryptedPrivateKey;

    public Output<String> getEncryptedPrivateKey() {
        return this.encryptedPrivateKey == null ? Output.empty() : this.encryptedPrivateKey;
    }

    /**
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * 
     */
    @Import(name="fingerprint")
      private final @Nullable Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint == null ? Output.empty() : this.fingerprint;
    }

    /**
     * The name of the Lightsail Key Pair. If omitted, a unique
     * name will be generated by this provider
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Output.empty() : this.namePrefix;
    }

    /**
     * An optional PGP key to encrypt the resulting private
     * key material. Only used when creating a new key pair
     * 
     */
    @Import(name="pgpKey")
      private final @Nullable Output<String> pgpKey;

    public Output<String> getPgpKey() {
        return this.pgpKey == null ? Output.empty() : this.pgpKey;
    }

    /**
     * the private key, base64 encoded. This is only populated
     * when creating a new key, and when no `pgp_key` is provided
     * 
     */
    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey == null ? Output.empty() : this.privateKey;
    }

    /**
     * The public key material. This public key will be
     * imported into Lightsail
     * 
     */
    @Import(name="publicKey")
      private final @Nullable Output<String> publicKey;

    public Output<String> getPublicKey() {
        return this.publicKey == null ? Output.empty() : this.publicKey;
    }

    public KeyPairState(
        @Nullable Output<String> arn,
        @Nullable Output<String> encryptedFingerprint,
        @Nullable Output<String> encryptedPrivateKey,
        @Nullable Output<String> fingerprint,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> pgpKey,
        @Nullable Output<String> privateKey,
        @Nullable Output<String> publicKey) {
        this.arn = arn;
        this.encryptedFingerprint = encryptedFingerprint;
        this.encryptedPrivateKey = encryptedPrivateKey;
        this.fingerprint = fingerprint;
        this.name = name;
        this.namePrefix = namePrefix;
        this.pgpKey = pgpKey;
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    private KeyPairState() {
        this.arn = Output.empty();
        this.encryptedFingerprint = Output.empty();
        this.encryptedPrivateKey = Output.empty();
        this.fingerprint = Output.empty();
        this.name = Output.empty();
        this.namePrefix = Output.empty();
        this.pgpKey = Output.empty();
        this.privateKey = Output.empty();
        this.publicKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyPairState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> encryptedFingerprint;
        private @Nullable Output<String> encryptedPrivateKey;
        private @Nullable Output<String> fingerprint;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> pgpKey;
        private @Nullable Output<String> privateKey;
        private @Nullable Output<String> publicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyPairState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.encryptedFingerprint = defaults.encryptedFingerprint;
    	      this.encryptedPrivateKey = defaults.encryptedPrivateKey;
    	      this.fingerprint = defaults.fingerprint;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.pgpKey = defaults.pgpKey;
    	      this.privateKey = defaults.privateKey;
    	      this.publicKey = defaults.publicKey;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder encryptedFingerprint(@Nullable Output<String> encryptedFingerprint) {
            this.encryptedFingerprint = encryptedFingerprint;
            return this;
        }
        public Builder encryptedFingerprint(@Nullable String encryptedFingerprint) {
            this.encryptedFingerprint = Output.ofNullable(encryptedFingerprint);
            return this;
        }
        public Builder encryptedPrivateKey(@Nullable Output<String> encryptedPrivateKey) {
            this.encryptedPrivateKey = encryptedPrivateKey;
            return this;
        }
        public Builder encryptedPrivateKey(@Nullable String encryptedPrivateKey) {
            this.encryptedPrivateKey = Output.ofNullable(encryptedPrivateKey);
            return this;
        }
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = Output.ofNullable(fingerprint);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Output.ofNullable(namePrefix);
            return this;
        }
        public Builder pgpKey(@Nullable Output<String> pgpKey) {
            this.pgpKey = pgpKey;
            return this;
        }
        public Builder pgpKey(@Nullable String pgpKey) {
            this.pgpKey = Output.ofNullable(pgpKey);
            return this;
        }
        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Output.ofNullable(privateKey);
            return this;
        }
        public Builder publicKey(@Nullable Output<String> publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = Output.ofNullable(publicKey);
            return this;
        }        public KeyPairState build() {
            return new KeyPairState(arn, encryptedFingerprint, encryptedPrivateKey, fingerprint, name, namePrefix, pgpKey, privateKey, publicKey);
        }
    }
}
