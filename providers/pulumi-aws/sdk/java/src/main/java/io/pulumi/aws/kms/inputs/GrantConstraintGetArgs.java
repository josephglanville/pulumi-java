// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GrantConstraintGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GrantConstraintGetArgs Empty = new GrantConstraintGetArgs();

    /**
     * A list of key-value pairs that must match the encryption context in subsequent cryptographic operation requests. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint. Conflicts with `encryption_context_subset`.
     * 
     */
    @Import(name="encryptionContextEquals")
      private final @Nullable Output<Map<String,String>> encryptionContextEquals;

    public Output<Map<String,String>> getEncryptionContextEquals() {
        return this.encryptionContextEquals == null ? Output.empty() : this.encryptionContextEquals;
    }

    /**
     * A list of key-value pairs that must be included in the encryption context of subsequent cryptographic operation requests. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs. Conflicts with `encryption_context_equals`.
     * 
     */
    @Import(name="encryptionContextSubset")
      private final @Nullable Output<Map<String,String>> encryptionContextSubset;

    public Output<Map<String,String>> getEncryptionContextSubset() {
        return this.encryptionContextSubset == null ? Output.empty() : this.encryptionContextSubset;
    }

    public GrantConstraintGetArgs(
        @Nullable Output<Map<String,String>> encryptionContextEquals,
        @Nullable Output<Map<String,String>> encryptionContextSubset) {
        this.encryptionContextEquals = encryptionContextEquals;
        this.encryptionContextSubset = encryptionContextSubset;
    }

    private GrantConstraintGetArgs() {
        this.encryptionContextEquals = Output.empty();
        this.encryptionContextSubset = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrantConstraintGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> encryptionContextEquals;
        private @Nullable Output<Map<String,String>> encryptionContextSubset;

        public Builder() {
    	      // Empty
        }

        public Builder(GrantConstraintGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionContextEquals = defaults.encryptionContextEquals;
    	      this.encryptionContextSubset = defaults.encryptionContextSubset;
        }

        public Builder encryptionContextEquals(@Nullable Output<Map<String,String>> encryptionContextEquals) {
            this.encryptionContextEquals = encryptionContextEquals;
            return this;
        }
        public Builder encryptionContextEquals(@Nullable Map<String,String> encryptionContextEquals) {
            this.encryptionContextEquals = Output.ofNullable(encryptionContextEquals);
            return this;
        }
        public Builder encryptionContextSubset(@Nullable Output<Map<String,String>> encryptionContextSubset) {
            this.encryptionContextSubset = encryptionContextSubset;
            return this;
        }
        public Builder encryptionContextSubset(@Nullable Map<String,String> encryptionContextSubset) {
            this.encryptionContextSubset = Output.ofNullable(encryptionContextSubset);
            return this;
        }        public GrantConstraintGetArgs build() {
            return new GrantConstraintGetArgs(encryptionContextEquals, encryptionContextSubset);
        }
    }
}
