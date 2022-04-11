// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * Arbitrary map of values that, when changed, will trigger a new key to be generated.
     * 
     */
    @Import(name="keepers")
      private final @Nullable Output<Map<String,Object>> keepers;

    public Output<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Codegen.empty() : this.keepers;
    }

    /**
     * The algorithm used to generate the key. KEY_ALG_RSA_2048 is the default algorithm.
     * Valid values are listed at
     * [ServiceAccountPrivateKeyType](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys#ServiceAccountKeyAlgorithm)
     * (only used on create)
     * 
     */
    @Import(name="keyAlgorithm")
      private final @Nullable Output<String> keyAlgorithm;

    public Output<String> getKeyAlgorithm() {
        return this.keyAlgorithm == null ? Codegen.empty() : this.keyAlgorithm;
    }

    /**
     * The output format of the private key. TYPE_GOOGLE_CREDENTIALS_FILE is the default output format.
     * 
     */
    @Import(name="privateKeyType")
      private final @Nullable Output<String> privateKeyType;

    public Output<String> getPrivateKeyType() {
        return this.privateKeyType == null ? Codegen.empty() : this.privateKeyType;
    }

    /**
     * Public key data to create a service account key for given service account. The expected format for this field is a base64 encoded X509_PEM and it conflicts with `public_key_type` and `private_key_type`.
     * 
     */
    @Import(name="publicKeyData")
      private final @Nullable Output<String> publicKeyData;

    public Output<String> getPublicKeyData() {
        return this.publicKeyData == null ? Codegen.empty() : this.publicKeyData;
    }

    /**
     * The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
     * 
     */
    @Import(name="publicKeyType")
      private final @Nullable Output<String> publicKeyType;

    public Output<String> getPublicKeyType() {
        return this.publicKeyType == null ? Codegen.empty() : this.publicKeyType;
    }

    /**
     * The Service account id of the Key. This can be a string in the format
     * `{ACCOUNT}` or `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`, where `{ACCOUNT}` is the email address or
     * unique id of the service account. If the `{ACCOUNT}` syntax is used, the project will be inferred from the account.
     * 
     */
    @Import(name="serviceAccountId", required=true)
      private final Output<String> serviceAccountId;

    public Output<String> getServiceAccountId() {
        return this.serviceAccountId;
    }

    public KeyArgs(
        @Nullable Output<Map<String,Object>> keepers,
        @Nullable Output<String> keyAlgorithm,
        @Nullable Output<String> privateKeyType,
        @Nullable Output<String> publicKeyData,
        @Nullable Output<String> publicKeyType,
        Output<String> serviceAccountId) {
        this.keepers = keepers;
        this.keyAlgorithm = keyAlgorithm;
        this.privateKeyType = privateKeyType;
        this.publicKeyData = publicKeyData;
        this.publicKeyType = publicKeyType;
        this.serviceAccountId = Objects.requireNonNull(serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
    }

    private KeyArgs() {
        this.keepers = Codegen.empty();
        this.keyAlgorithm = Codegen.empty();
        this.privateKeyType = Codegen.empty();
        this.publicKeyData = Codegen.empty();
        this.publicKeyType = Codegen.empty();
        this.serviceAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Object>> keepers;
        private @Nullable Output<String> keyAlgorithm;
        private @Nullable Output<String> privateKeyType;
        private @Nullable Output<String> publicKeyData;
        private @Nullable Output<String> publicKeyType;
        private Output<String> serviceAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keepers = defaults.keepers;
    	      this.keyAlgorithm = defaults.keyAlgorithm;
    	      this.privateKeyType = defaults.privateKeyType;
    	      this.publicKeyData = defaults.publicKeyData;
    	      this.publicKeyType = defaults.publicKeyType;
    	      this.serviceAccountId = defaults.serviceAccountId;
        }

        public Builder keepers(@Nullable Output<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }
        public Builder keepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Codegen.ofNullable(keepers);
            return this;
        }
        public Builder keyAlgorithm(@Nullable Output<String> keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }
        public Builder keyAlgorithm(@Nullable String keyAlgorithm) {
            this.keyAlgorithm = Codegen.ofNullable(keyAlgorithm);
            return this;
        }
        public Builder privateKeyType(@Nullable Output<String> privateKeyType) {
            this.privateKeyType = privateKeyType;
            return this;
        }
        public Builder privateKeyType(@Nullable String privateKeyType) {
            this.privateKeyType = Codegen.ofNullable(privateKeyType);
            return this;
        }
        public Builder publicKeyData(@Nullable Output<String> publicKeyData) {
            this.publicKeyData = publicKeyData;
            return this;
        }
        public Builder publicKeyData(@Nullable String publicKeyData) {
            this.publicKeyData = Codegen.ofNullable(publicKeyData);
            return this;
        }
        public Builder publicKeyType(@Nullable Output<String> publicKeyType) {
            this.publicKeyType = publicKeyType;
            return this;
        }
        public Builder publicKeyType(@Nullable String publicKeyType) {
            this.publicKeyType = Codegen.ofNullable(publicKeyType);
            return this;
        }
        public Builder serviceAccountId(Output<String> serviceAccountId) {
            this.serviceAccountId = Objects.requireNonNull(serviceAccountId);
            return this;
        }
        public Builder serviceAccountId(String serviceAccountId) {
            this.serviceAccountId = Output.of(Objects.requireNonNull(serviceAccountId));
            return this;
        }        public KeyArgs build() {
            return new KeyArgs(keepers, keyAlgorithm, privateKeyType, publicKeyData, publicKeyType, serviceAccountId);
        }
    }
}
