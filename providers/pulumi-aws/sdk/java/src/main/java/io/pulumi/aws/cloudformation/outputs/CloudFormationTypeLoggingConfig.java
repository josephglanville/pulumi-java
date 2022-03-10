// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudFormationTypeLoggingConfig {
    /**
     * Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type's handlers.
     * 
     */
    private final String logGroupName;
    /**
     * Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
     * 
     */
    private final String logRoleArn;

    @OutputCustomType.Constructor
    private CloudFormationTypeLoggingConfig(
        @OutputCustomType.Parameter("logGroupName") String logGroupName,
        @OutputCustomType.Parameter("logRoleArn") String logRoleArn) {
        this.logGroupName = logGroupName;
        this.logRoleArn = logRoleArn;
    }

    /**
     * Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type's handlers.
     * 
    */
    public String getLogGroupName() {
        return this.logGroupName;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
     * 
    */
    public String getLogRoleArn() {
        return this.logRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFormationTypeLoggingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logGroupName;
        private String logRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFormationTypeLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.logRoleArn = defaults.logRoleArn;
        }

        public Builder setLogGroupName(String logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder setLogRoleArn(String logRoleArn) {
            this.logRoleArn = Objects.requireNonNull(logRoleArn);
            return this;
        }
        public CloudFormationTypeLoggingConfig build() {
            return new CloudFormationTypeLoggingConfig(logGroupName, logRoleArn);
        }
    }
}
