// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.xray.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionConfigState extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigState Empty = new EncryptionConfigState();

    /**
     * An AWS KMS customer master key (CMK) ARN.
     * 
     */
    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> getKeyId() {
        return this.keyId == null ? Output.empty() : this.keyId;
    }

    /**
     * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public EncryptionConfigState(
        @Nullable Output<String> keyId,
        @Nullable Output<String> type) {
        this.keyId = keyId;
        this.type = type;
    }

    private EncryptionConfigState() {
        this.keyId = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyId;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.type = defaults.type;
        }

        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = Output.ofNullable(keyId);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public EncryptionConfigState build() {
            return new EncryptionConfigState(keyId, type);
        }
    }
}
