// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyPairState extends io.pulumi.resources.ResourceArgs {

    public static final KeyPairState Empty = new KeyPairState();

    /**
     * The key pair ARN.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
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
     * The name for the key pair.
     * 
     */
    @Import(name="keyName")
      private final @Nullable Output<String> keyName;

    public Output<String> getKeyName() {
        return this.keyName == null ? Output.empty() : this.keyName;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `key_name`.
     * 
     */
    @Import(name="keyNamePrefix")
      private final @Nullable Output<String> keyNamePrefix;

    public Output<String> getKeyNamePrefix() {
        return this.keyNamePrefix == null ? Output.empty() : this.keyNamePrefix;
    }

    /**
     * The key pair ID.
     * 
     */
    @Import(name="keyPairId")
      private final @Nullable Output<String> keyPairId;

    public Output<String> getKeyPairId() {
        return this.keyPairId == null ? Output.empty() : this.keyPairId;
    }

    /**
     * The public key material.
     * 
     */
    @Import(name="publicKey")
      private final @Nullable Output<String> publicKey;

    public Output<String> getPublicKey() {
        return this.publicKey == null ? Output.empty() : this.publicKey;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public KeyPairState(
        @Nullable Output<String> arn,
        @Nullable Output<String> fingerprint,
        @Nullable Output<String> keyName,
        @Nullable Output<String> keyNamePrefix,
        @Nullable Output<String> keyPairId,
        @Nullable Output<String> publicKey,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.fingerprint = fingerprint;
        this.keyName = keyName;
        this.keyNamePrefix = keyNamePrefix;
        this.keyPairId = keyPairId;
        this.publicKey = publicKey;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private KeyPairState() {
        this.arn = Output.empty();
        this.fingerprint = Output.empty();
        this.keyName = Output.empty();
        this.keyNamePrefix = Output.empty();
        this.keyPairId = Output.empty();
        this.publicKey = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyPairState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> fingerprint;
        private @Nullable Output<String> keyName;
        private @Nullable Output<String> keyNamePrefix;
        private @Nullable Output<String> keyPairId;
        private @Nullable Output<String> publicKey;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyPairState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fingerprint = defaults.fingerprint;
    	      this.keyName = defaults.keyName;
    	      this.keyNamePrefix = defaults.keyNamePrefix;
    	      this.keyPairId = defaults.keyPairId;
    	      this.publicKey = defaults.publicKey;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
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
        public Builder keyName(@Nullable Output<String> keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyName(@Nullable String keyName) {
            this.keyName = Output.ofNullable(keyName);
            return this;
        }
        public Builder keyNamePrefix(@Nullable Output<String> keyNamePrefix) {
            this.keyNamePrefix = keyNamePrefix;
            return this;
        }
        public Builder keyNamePrefix(@Nullable String keyNamePrefix) {
            this.keyNamePrefix = Output.ofNullable(keyNamePrefix);
            return this;
        }
        public Builder keyPairId(@Nullable Output<String> keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public Builder keyPairId(@Nullable String keyPairId) {
            this.keyPairId = Output.ofNullable(keyPairId);
            return this;
        }
        public Builder publicKey(@Nullable Output<String> publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = Output.ofNullable(publicKey);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public KeyPairState build() {
            return new KeyPairState(arn, fingerprint, keyName, keyNamePrefix, keyPairId, publicKey, tags, tagsAll);
        }
    }
}