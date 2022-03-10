// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InventoryDestinationBucketEncryptionSseKms {
    /**
     * The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
     * 
     */
    private final String keyId;

    @OutputCustomType.Constructor
    private InventoryDestinationBucketEncryptionSseKms(@OutputCustomType.Parameter("keyId") String keyId) {
        this.keyId = keyId;
    }

    /**
     * The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
     * 
    */
    public String getKeyId() {
        return this.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryDestinationBucketEncryptionSseKms defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryDestinationBucketEncryptionSseKms defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public InventoryDestinationBucketEncryptionSseKms build() {
            return new InventoryDestinationBucketEncryptionSseKms(keyId);
        }
    }
}
