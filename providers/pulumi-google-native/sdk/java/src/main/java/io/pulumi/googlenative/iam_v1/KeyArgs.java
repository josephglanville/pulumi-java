// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.iam_v1.enums.KeyKeyAlgorithm;
import io.pulumi.googlenative.iam_v1.enums.KeyPrivateKeyType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * Which type of key and algorithm to use for the key. The default is currently a 2K RSA key. However this may change in the future.
     * 
     */
    @Import(name="keyAlgorithm")
      private final @Nullable Output<KeyKeyAlgorithm> keyAlgorithm;

    public Output<KeyKeyAlgorithm> getKeyAlgorithm() {
        return this.keyAlgorithm == null ? Codegen.empty() : this.keyAlgorithm;
    }

    /**
     * The output format of the private key. The default value is `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File format.
     * 
     */
    @Import(name="privateKeyType")
      private final @Nullable Output<KeyPrivateKeyType> privateKeyType;

    public Output<KeyPrivateKeyType> getPrivateKeyType() {
        return this.privateKeyType == null ? Codegen.empty() : this.privateKeyType;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="serviceAccountId", required=true)
      private final Output<String> serviceAccountId;

    public Output<String> getServiceAccountId() {
        return this.serviceAccountId;
    }

    public KeyArgs(
        @Nullable Output<KeyKeyAlgorithm> keyAlgorithm,
        @Nullable Output<KeyPrivateKeyType> privateKeyType,
        @Nullable Output<String> project,
        Output<String> serviceAccountId) {
        this.keyAlgorithm = keyAlgorithm;
        this.privateKeyType = privateKeyType;
        this.project = project;
        this.serviceAccountId = Objects.requireNonNull(serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
    }

    private KeyArgs() {
        this.keyAlgorithm = Codegen.empty();
        this.privateKeyType = Codegen.empty();
        this.project = Codegen.empty();
        this.serviceAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<KeyKeyAlgorithm> keyAlgorithm;
        private @Nullable Output<KeyPrivateKeyType> privateKeyType;
        private @Nullable Output<String> project;
        private Output<String> serviceAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyAlgorithm = defaults.keyAlgorithm;
    	      this.privateKeyType = defaults.privateKeyType;
    	      this.project = defaults.project;
    	      this.serviceAccountId = defaults.serviceAccountId;
        }

        public Builder keyAlgorithm(@Nullable Output<KeyKeyAlgorithm> keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }
        public Builder keyAlgorithm(@Nullable KeyKeyAlgorithm keyAlgorithm) {
            this.keyAlgorithm = Codegen.ofNullable(keyAlgorithm);
            return this;
        }
        public Builder privateKeyType(@Nullable Output<KeyPrivateKeyType> privateKeyType) {
            this.privateKeyType = privateKeyType;
            return this;
        }
        public Builder privateKeyType(@Nullable KeyPrivateKeyType privateKeyType) {
            this.privateKeyType = Codegen.ofNullable(privateKeyType);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
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
            return new KeyArgs(keyAlgorithm, privateKeyType, project, serviceAccountId);
        }
    }
}
