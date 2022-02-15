// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.outputs;

import io.pulumi.awsnative.healthlake.outputs.FHIRDatastoreKmsEncryptionConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class FHIRDatastoreSseConfiguration {
    private final FHIRDatastoreKmsEncryptionConfig kmsEncryptionConfig;

    @OutputCustomType.Constructor({"kmsEncryptionConfig"})
    private FHIRDatastoreSseConfiguration(FHIRDatastoreKmsEncryptionConfig kmsEncryptionConfig) {
        this.kmsEncryptionConfig = Objects.requireNonNull(kmsEncryptionConfig);
    }

    public FHIRDatastoreKmsEncryptionConfig getKmsEncryptionConfig() {
        return this.kmsEncryptionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FHIRDatastoreSseConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FHIRDatastoreKmsEncryptionConfig kmsEncryptionConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FHIRDatastoreSseConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsEncryptionConfig = defaults.kmsEncryptionConfig;
        }

        public Builder setKmsEncryptionConfig(FHIRDatastoreKmsEncryptionConfig kmsEncryptionConfig) {
            this.kmsEncryptionConfig = Objects.requireNonNull(kmsEncryptionConfig);
            return this;
        }

        public FHIRDatastoreSseConfiguration build() {
            return new FHIRDatastoreSseConfiguration(kmsEncryptionConfig);
        }
    }
}