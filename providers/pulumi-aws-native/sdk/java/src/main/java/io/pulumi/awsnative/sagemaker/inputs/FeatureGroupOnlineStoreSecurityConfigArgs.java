// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupOnlineStoreSecurityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupOnlineStoreSecurityConfigArgs Empty = new FeatureGroupOnlineStoreSecurityConfigArgs();

    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    public FeatureGroupOnlineStoreSecurityConfigArgs(@Nullable Output<String> kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    private FeatureGroupOnlineStoreSecurityConfigArgs() {
        this.kmsKeyId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOnlineStoreSecurityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOnlineStoreSecurityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }        public FeatureGroupOnlineStoreSecurityConfigArgs build() {
            return new FeatureGroupOnlineStoreSecurityConfigArgs(kmsKeyId);
        }
    }
}
