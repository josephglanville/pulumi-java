// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.outputs;

import io.pulumi.aws.synthetics.outputs.CanaryArtifactConfigS3Encryption;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CanaryArtifactConfig {
    /**
     * Configuration of the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See S3 Encryption.
     * 
     */
    private final @Nullable CanaryArtifactConfigS3Encryption s3Encryption;

    @CustomType.Constructor
    private CanaryArtifactConfig(@CustomType.Parameter("s3Encryption") @Nullable CanaryArtifactConfigS3Encryption s3Encryption) {
        this.s3Encryption = s3Encryption;
    }

    /**
     * Configuration of the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See S3 Encryption.
     * 
    */
    public Optional<CanaryArtifactConfigS3Encryption> getS3Encryption() {
        return Optional.ofNullable(this.s3Encryption);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryArtifactConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CanaryArtifactConfigS3Encryption s3Encryption;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryArtifactConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Encryption = defaults.s3Encryption;
        }

        public Builder s3Encryption(@Nullable CanaryArtifactConfigS3Encryption s3Encryption) {
            this.s3Encryption = s3Encryption;
            return this;
        }        public CanaryArtifactConfig build() {
            return new CanaryArtifactConfig(s3Encryption);
        }
    }
}
