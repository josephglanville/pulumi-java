// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingS3LogsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class InfrastructureConfigurationLoggingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InfrastructureConfigurationLoggingGetArgs Empty = new InfrastructureConfigurationLoggingGetArgs();

    /**
     * Configuration block with S3 logging settings. Detailed below.
     * 
     */
    @InputImport(name="s3Logs", required=true)
      private final Output<InfrastructureConfigurationLoggingS3LogsGetArgs> s3Logs;

    public Output<InfrastructureConfigurationLoggingS3LogsGetArgs> getS3Logs() {
        return this.s3Logs;
    }

    public InfrastructureConfigurationLoggingGetArgs(Output<InfrastructureConfigurationLoggingS3LogsGetArgs> s3Logs) {
        this.s3Logs = Objects.requireNonNull(s3Logs, "expected parameter 's3Logs' to be non-null");
    }

    private InfrastructureConfigurationLoggingGetArgs() {
        this.s3Logs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<InfrastructureConfigurationLoggingS3LogsGetArgs> s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationLoggingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder s3Logs(Output<InfrastructureConfigurationLoggingS3LogsGetArgs> s3Logs) {
            this.s3Logs = Objects.requireNonNull(s3Logs);
            return this;
        }

        public Builder s3Logs(InfrastructureConfigurationLoggingS3LogsGetArgs s3Logs) {
            this.s3Logs = Output.of(Objects.requireNonNull(s3Logs));
            return this;
        }
        public InfrastructureConfigurationLoggingGetArgs build() {
            return new InfrastructureConfigurationLoggingGetArgs(s3Logs);
        }
    }
}
