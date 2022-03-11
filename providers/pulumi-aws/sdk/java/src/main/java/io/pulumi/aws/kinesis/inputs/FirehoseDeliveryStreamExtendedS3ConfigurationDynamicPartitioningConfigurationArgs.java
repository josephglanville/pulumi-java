// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs();

    /**
     * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The length of time during which Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
     * 
     */
    @InputImport(name="retryDuration")
      private final @Nullable Output<Integer> retryDuration;

    public Output<Integer> getRetryDuration() {
        return this.retryDuration == null ? Output.empty() : this.retryDuration;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Integer> retryDuration) {
        this.enabled = enabled;
        this.retryDuration = retryDuration;
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs() {
        this.enabled = Output.empty();
        this.retryDuration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Integer> retryDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retryDuration = defaults.retryDuration;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder retryDuration(@Nullable Output<Integer> retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        public Builder retryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = Output.ofNullable(retryDuration);
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs(enabled, retryDuration);
        }
    }
}
