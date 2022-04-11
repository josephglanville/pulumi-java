// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KnowledgeBaseServerSideEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final KnowledgeBaseServerSideEncryptionConfigurationArgs Empty = new KnowledgeBaseServerSideEncryptionConfigurationArgs();

    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    public KnowledgeBaseServerSideEncryptionConfigurationArgs(@Nullable Output<String> kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    private KnowledgeBaseServerSideEncryptionConfigurationArgs() {
        this.kmsKeyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseServerSideEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseServerSideEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }        public KnowledgeBaseServerSideEncryptionConfigurationArgs build() {
            return new KnowledgeBaseServerSideEncryptionConfigurationArgs(kmsKeyId);
        }
    }
}
