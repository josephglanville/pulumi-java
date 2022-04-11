// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Deprecated] The paths to the mounted TLS Certificates and private key. The paths to the mounted TLS Certificates and private key.
 * 
 */
public final class TlsCertificatePathsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TlsCertificatePathsArgs Empty = new TlsCertificatePathsArgs();

    /**
     * The path to the file holding the client or server TLS certificate to use.
     * 
     */
    @Import(name="certificatePath")
      private final @Nullable Output<String> certificatePath;

    public Output<String> getCertificatePath() {
        return this.certificatePath == null ? Codegen.empty() : this.certificatePath;
    }

    /**
     * The path to the file holding the client or server private key.
     * 
     */
    @Import(name="privateKeyPath")
      private final @Nullable Output<String> privateKeyPath;

    public Output<String> getPrivateKeyPath() {
        return this.privateKeyPath == null ? Codegen.empty() : this.privateKeyPath;
    }

    public TlsCertificatePathsArgs(
        @Nullable Output<String> certificatePath,
        @Nullable Output<String> privateKeyPath) {
        this.certificatePath = certificatePath;
        this.privateKeyPath = privateKeyPath;
    }

    private TlsCertificatePathsArgs() {
        this.certificatePath = Codegen.empty();
        this.privateKeyPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificatePathsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificatePath;
        private @Nullable Output<String> privateKeyPath;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificatePathsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePath = defaults.certificatePath;
    	      this.privateKeyPath = defaults.privateKeyPath;
        }

        public Builder certificatePath(@Nullable Output<String> certificatePath) {
            this.certificatePath = certificatePath;
            return this;
        }
        public Builder certificatePath(@Nullable String certificatePath) {
            this.certificatePath = Codegen.ofNullable(certificatePath);
            return this;
        }
        public Builder privateKeyPath(@Nullable Output<String> privateKeyPath) {
            this.privateKeyPath = privateKeyPath;
            return this;
        }
        public Builder privateKeyPath(@Nullable String privateKeyPath) {
            this.privateKeyPath = Codegen.ofNullable(privateKeyPath);
            return this;
        }        public TlsCertificatePathsArgs build() {
            return new TlsCertificatePathsArgs(certificatePath, privateKeyPath);
        }
    }
}
