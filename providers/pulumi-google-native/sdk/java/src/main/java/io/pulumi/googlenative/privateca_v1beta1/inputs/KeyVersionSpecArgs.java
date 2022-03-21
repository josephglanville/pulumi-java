// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.privateca_v1beta1.enums.KeyVersionSpecAlgorithm;
import java.lang.String;
import java.util.Objects;


/**
 * A Cloud KMS key configuration that a CertificateAuthority will use.
 * 
 */
public final class KeyVersionSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVersionSpecArgs Empty = new KeyVersionSpecArgs();

    /**
     * The algorithm to use for creating a managed Cloud KMS key for a for a simplified experience. All managed keys will be have their ProtectionLevel as `HSM`.
     * 
     */
    @Import(name="algorithm", required=true)
      private final Output<KeyVersionSpecAlgorithm> algorithm;

    public Output<KeyVersionSpecAlgorithm> getAlgorithm() {
        return this.algorithm;
    }

    /**
     * The resource name for an existing Cloud KMS CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`. This option enables full flexibility in the key's capabilities and properties.
     * 
     */
    @Import(name="cloudKmsKeyVersion", required=true)
      private final Output<String> cloudKmsKeyVersion;

    public Output<String> getCloudKmsKeyVersion() {
        return this.cloudKmsKeyVersion;
    }

    public KeyVersionSpecArgs(
        Output<KeyVersionSpecAlgorithm> algorithm,
        Output<String> cloudKmsKeyVersion) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.cloudKmsKeyVersion = Objects.requireNonNull(cloudKmsKeyVersion, "expected parameter 'cloudKmsKeyVersion' to be non-null");
    }

    private KeyVersionSpecArgs() {
        this.algorithm = Output.empty();
        this.cloudKmsKeyVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVersionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<KeyVersionSpecAlgorithm> algorithm;
        private Output<String> cloudKmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVersionSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.cloudKmsKeyVersion = defaults.cloudKmsKeyVersion;
        }

        public Builder algorithm(Output<KeyVersionSpecAlgorithm> algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder algorithm(KeyVersionSpecAlgorithm algorithm) {
            this.algorithm = Output.of(Objects.requireNonNull(algorithm));
            return this;
        }
        public Builder cloudKmsKeyVersion(Output<String> cloudKmsKeyVersion) {
            this.cloudKmsKeyVersion = Objects.requireNonNull(cloudKmsKeyVersion);
            return this;
        }
        public Builder cloudKmsKeyVersion(String cloudKmsKeyVersion) {
            this.cloudKmsKeyVersion = Output.of(Objects.requireNonNull(cloudKmsKeyVersion));
            return this;
        }        public KeyVersionSpecArgs build() {
            return new KeyVersionSpecArgs(algorithm, cloudKmsKeyVersion);
        }
    }
}
