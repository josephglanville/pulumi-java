// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.InfrastructureConfigurationLoggingS3Logs;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class InfrastructureConfigurationLogging {
    /**
     * Configuration block with S3 logging settings. Detailed below.
     * 
     */
    private final InfrastructureConfigurationLoggingS3Logs s3Logs;

    @OutputCustomType.Constructor
    private InfrastructureConfigurationLogging(@OutputCustomType.Parameter("s3Logs") InfrastructureConfigurationLoggingS3Logs s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * Configuration block with S3 logging settings. Detailed below.
     * 
    */
    public InfrastructureConfigurationLoggingS3Logs getS3Logs() {
        return this.s3Logs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfrastructureConfigurationLoggingS3Logs s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder setS3Logs(InfrastructureConfigurationLoggingS3Logs s3Logs) {
            this.s3Logs = Objects.requireNonNull(s3Logs);
            return this;
        }
        public InfrastructureConfigurationLogging build() {
            return new InfrastructureConfigurationLogging(s3Logs);
        }
    }
}
