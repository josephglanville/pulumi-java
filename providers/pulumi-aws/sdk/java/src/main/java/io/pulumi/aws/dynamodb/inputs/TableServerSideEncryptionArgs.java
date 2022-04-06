// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableServerSideEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableServerSideEncryptionArgs Empty = new TableServerSideEncryptionArgs();

    /**
     * Indicates whether ttl is enabled (true) or disabled (false).
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The ARN of the CMK that should be used for the AWS KMS encryption.
     * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Output.empty() : this.kmsKeyArn;
    }

    public TableServerSideEncryptionArgs(
        Output<Boolean> enabled,
        @Nullable Output<String> kmsKeyArn) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.kmsKeyArn = kmsKeyArn;
    }

    private TableServerSideEncryptionArgs() {
        this.enabled = Output.empty();
        this.kmsKeyArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableServerSideEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enabled;
        private @Nullable Output<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TableServerSideEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Output.ofNullable(kmsKeyArn);
            return this;
        }        public TableServerSideEncryptionArgs build() {
            return new TableServerSideEncryptionArgs(enabled, kmsKeyArn);
        }
    }
}