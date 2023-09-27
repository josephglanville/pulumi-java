// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FuncWithSecretsResult {
    private String ciphertext;
    private String cryptoKey;
    private String id;
    private String plaintext;

    private FuncWithSecretsResult() {}
    public String ciphertext() {
        return this.ciphertext;
    }
    public String cryptoKey() {
        return this.cryptoKey;
    }
    public String id() {
        return this.id;
    }
    public String plaintext() {
        return this.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FuncWithSecretsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ciphertext;
        private String cryptoKey;
        private String id;
        private String plaintext;
        public Builder() {}
        public Builder(FuncWithSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciphertext = defaults.ciphertext;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.id = defaults.id;
    	      this.plaintext = defaults.plaintext;
        }

        @CustomType.Setter
        public Builder ciphertext(String ciphertext) {
            if (ciphertext == null) {
                throw new MissingRequiredPropertyException("FuncWithSecretsResult", "ciphertext");
            }
            this.ciphertext = ciphertext;
            return this;
        }
        @CustomType.Setter
        public Builder cryptoKey(String cryptoKey) {
            if (cryptoKey == null) {
                throw new MissingRequiredPropertyException("FuncWithSecretsResult", "cryptoKey");
            }
            this.cryptoKey = cryptoKey;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
                throw new MissingRequiredPropertyException("FuncWithSecretsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder plaintext(String plaintext) {
            if (plaintext == null) {
                throw new MissingRequiredPropertyException("FuncWithSecretsResult", "plaintext");
            }
            this.plaintext = plaintext;
            return this;
        }
        public FuncWithSecretsResult build() {
            final var o = new FuncWithSecretsResult();
            o.ciphertext = ciphertext;
            o.cryptoKey = cryptoKey;
            o.id = id;
            o.plaintext = plaintext;
            return o;
        }
    }
}
