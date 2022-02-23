// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceVersionLoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceVersionLoggingConfigArgs Empty = new ResourceVersionLoggingConfigArgs();

    /**
     * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type's handlers.
     * 
     */
    @InputImport(name="logGroupName")
      private final @Nullable Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName == null ? Input.empty() : this.logGroupName;
    }

    /**
     * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * 
     */
    @InputImport(name="logRoleArn")
      private final @Nullable Input<String> logRoleArn;

    public Input<String> getLogRoleArn() {
        return this.logRoleArn == null ? Input.empty() : this.logRoleArn;
    }

    public ResourceVersionLoggingConfigArgs(
        @Nullable Input<String> logGroupName,
        @Nullable Input<String> logRoleArn) {
        this.logGroupName = logGroupName;
        this.logRoleArn = logRoleArn;
    }

    private ResourceVersionLoggingConfigArgs() {
        this.logGroupName = Input.empty();
        this.logRoleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceVersionLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> logGroupName;
        private @Nullable Input<String> logRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceVersionLoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.logRoleArn = defaults.logRoleArn;
        }

        public Builder setLogGroupName(@Nullable Input<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = Input.ofNullable(logGroupName);
            return this;
        }

        public Builder setLogRoleArn(@Nullable Input<String> logRoleArn) {
            this.logRoleArn = logRoleArn;
            return this;
        }

        public Builder setLogRoleArn(@Nullable String logRoleArn) {
            this.logRoleArn = Input.ofNullable(logRoleArn);
            return this;
        }
        public ResourceVersionLoggingConfigArgs build() {
            return new ResourceVersionLoggingConfigArgs(logGroupName, logRoleArn);
        }
    }
}
