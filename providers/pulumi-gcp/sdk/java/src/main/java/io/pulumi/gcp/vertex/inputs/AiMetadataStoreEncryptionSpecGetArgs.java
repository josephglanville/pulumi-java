// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AiMetadataStoreEncryptionSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AiMetadataStoreEncryptionSpecGetArgs Empty = new AiMetadataStoreEncryptionSpecGetArgs();

    /**
     * Required. The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource.
     * Has the form: projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key. The key needs to be in the same region as where the resource is created.
     * 
     */
    @InputImport(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Output.empty() : this.kmsKeyName;
    }

    public AiMetadataStoreEncryptionSpecGetArgs(@Nullable Output<String> kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    private AiMetadataStoreEncryptionSpecGetArgs() {
        this.kmsKeyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiMetadataStoreEncryptionSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(AiMetadataStoreEncryptionSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Output.ofNullable(kmsKeyName);
            return this;
        }
        public AiMetadataStoreEncryptionSpecGetArgs build() {
            return new AiMetadataStoreEncryptionSpecGetArgs(kmsKeyName);
        }
    }
}
