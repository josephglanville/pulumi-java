// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput {
    /**
     * The ARN of the destination Lambda function to write to.
     * 
     */
    private final String resourceArn;

    @OutputCustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput(@OutputCustomType.Parameter("resourceArn") String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * The ARN of the destination Lambda function to write to.
     * 
    */
    public String getResourceArn() {
        return this.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput(resourceArn);
        }
    }
}
