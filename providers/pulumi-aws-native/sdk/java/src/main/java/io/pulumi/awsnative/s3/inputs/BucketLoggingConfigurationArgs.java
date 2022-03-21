// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLoggingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLoggingConfigurationArgs Empty = new BucketLoggingConfigurationArgs();

    /**
     * The name of an Amazon S3 bucket where Amazon S3 store server access log files. You can store log files in any bucket that you own. By default, logs are stored in the bucket where the LoggingConfiguration property is defined.
     * 
     */
    @Import(name="destinationBucketName")
      private final @Nullable Output<String> destinationBucketName;

    public Output<String> getDestinationBucketName() {
        return this.destinationBucketName == null ? Output.empty() : this.destinationBucketName;
    }

    @Import(name="logFilePrefix")
      private final @Nullable Output<String> logFilePrefix;

    public Output<String> getLogFilePrefix() {
        return this.logFilePrefix == null ? Output.empty() : this.logFilePrefix;
    }

    public BucketLoggingConfigurationArgs(
        @Nullable Output<String> destinationBucketName,
        @Nullable Output<String> logFilePrefix) {
        this.destinationBucketName = destinationBucketName;
        this.logFilePrefix = logFilePrefix;
    }

    private BucketLoggingConfigurationArgs() {
        this.destinationBucketName = Output.empty();
        this.logFilePrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> destinationBucketName;
        private @Nullable Output<String> logFilePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationBucketName = defaults.destinationBucketName;
    	      this.logFilePrefix = defaults.logFilePrefix;
        }

        public Builder destinationBucketName(@Nullable Output<String> destinationBucketName) {
            this.destinationBucketName = destinationBucketName;
            return this;
        }
        public Builder destinationBucketName(@Nullable String destinationBucketName) {
            this.destinationBucketName = Output.ofNullable(destinationBucketName);
            return this;
        }
        public Builder logFilePrefix(@Nullable Output<String> logFilePrefix) {
            this.logFilePrefix = logFilePrefix;
            return this;
        }
        public Builder logFilePrefix(@Nullable String logFilePrefix) {
            this.logFilePrefix = Output.ofNullable(logFilePrefix);
            return this;
        }        public BucketLoggingConfigurationArgs build() {
            return new BucketLoggingConfigurationArgs(destinationBucketName, logFilePrefix);
        }
    }
}
