// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AlertLambdaConfiguration {
    /**
     * ARN of a Lambda to send alert notifications to.
     * 
     */
    private final String lambdaArn;
    /**
     * ARN of an IAM role that LookoutMetrics should assume to access the Lambda function.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private AlertLambdaConfiguration(
        @CustomType.Parameter("lambdaArn") String lambdaArn,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.lambdaArn = lambdaArn;
        this.roleArn = roleArn;
    }

    /**
     * ARN of a Lambda to send alert notifications to.
     * 
    */
    public String getLambdaArn() {
        return this.lambdaArn;
    }
    /**
     * ARN of an IAM role that LookoutMetrics should assume to access the Lambda function.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertLambdaConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lambdaArn;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertLambdaConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaArn = defaults.lambdaArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder lambdaArn(String lambdaArn) {
            this.lambdaArn = Objects.requireNonNull(lambdaArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public AlertLambdaConfiguration build() {
            return new AlertLambdaConfiguration(lambdaArn, roleArn);
        }
    }
}
