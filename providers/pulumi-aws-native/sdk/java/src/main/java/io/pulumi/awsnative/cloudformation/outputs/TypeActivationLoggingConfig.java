// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TypeActivationLoggingConfig {
    /**
     * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type's handlers.
     * 
     */
    private final @Nullable String logGroupName;
    /**
     * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * 
     */
    private final @Nullable String logRoleArn;

    @CustomType.Constructor
    private TypeActivationLoggingConfig(
        @CustomType.Parameter("logGroupName") @Nullable String logGroupName,
        @CustomType.Parameter("logRoleArn") @Nullable String logRoleArn) {
        this.logGroupName = logGroupName;
        this.logRoleArn = logRoleArn;
    }

    /**
     * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type's handlers.
     * 
    */
    public Optional<String> getLogGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }
    /**
     * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * 
    */
    public Optional<String> getLogRoleArn() {
        return Optional.ofNullable(this.logRoleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypeActivationLoggingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logGroupName;
        private @Nullable String logRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TypeActivationLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.logRoleArn = defaults.logRoleArn;
        }

        public Builder logGroupName(@Nullable String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }
        public Builder logRoleArn(@Nullable String logRoleArn) {
            this.logRoleArn = logRoleArn;
            return this;
        }        public TypeActivationLoggingConfig build() {
            return new TypeActivationLoggingConfig(logGroupName, logRoleArn);
        }
    }
}
