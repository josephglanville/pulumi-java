// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiLogConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiLogConfigGetArgs Empty = new GraphQLApiLogConfigGetArgs();

    /**
     * Amazon Resource Name of the service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     * 
     */
    @InputImport(name="cloudwatchLogsRoleArn", required=true)
      private final Output<String> cloudwatchLogsRoleArn;

    public Output<String> getCloudwatchLogsRoleArn() {
        return this.cloudwatchLogsRoleArn;
    }

    /**
     * Set to TRUE to exclude sections that contain information such as headers, context, and evaluated mapping templates, regardless of logging  level. Valid values: `true`, `false`. Default value: `false`
     * 
     */
    @InputImport(name="excludeVerboseContent")
      private final @Nullable Output<Boolean> excludeVerboseContent;

    public Output<Boolean> getExcludeVerboseContent() {
        return this.excludeVerboseContent == null ? Output.empty() : this.excludeVerboseContent;
    }

    /**
     * Field logging level. Valid values: `ALL`, `ERROR`, `NONE`.
     * 
     */
    @InputImport(name="fieldLogLevel", required=true)
      private final Output<String> fieldLogLevel;

    public Output<String> getFieldLogLevel() {
        return this.fieldLogLevel;
    }

    public GraphQLApiLogConfigGetArgs(
        Output<String> cloudwatchLogsRoleArn,
        @Nullable Output<Boolean> excludeVerboseContent,
        Output<String> fieldLogLevel) {
        this.cloudwatchLogsRoleArn = Objects.requireNonNull(cloudwatchLogsRoleArn, "expected parameter 'cloudwatchLogsRoleArn' to be non-null");
        this.excludeVerboseContent = excludeVerboseContent;
        this.fieldLogLevel = Objects.requireNonNull(fieldLogLevel, "expected parameter 'fieldLogLevel' to be non-null");
    }

    private GraphQLApiLogConfigGetArgs() {
        this.cloudwatchLogsRoleArn = Output.empty();
        this.excludeVerboseContent = Output.empty();
        this.fieldLogLevel = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiLogConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cloudwatchLogsRoleArn;
        private @Nullable Output<Boolean> excludeVerboseContent;
        private Output<String> fieldLogLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiLogConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogsRoleArn = defaults.cloudwatchLogsRoleArn;
    	      this.excludeVerboseContent = defaults.excludeVerboseContent;
    	      this.fieldLogLevel = defaults.fieldLogLevel;
        }

        public Builder cloudwatchLogsRoleArn(Output<String> cloudwatchLogsRoleArn) {
            this.cloudwatchLogsRoleArn = Objects.requireNonNull(cloudwatchLogsRoleArn);
            return this;
        }

        public Builder cloudwatchLogsRoleArn(String cloudwatchLogsRoleArn) {
            this.cloudwatchLogsRoleArn = Output.of(Objects.requireNonNull(cloudwatchLogsRoleArn));
            return this;
        }

        public Builder excludeVerboseContent(@Nullable Output<Boolean> excludeVerboseContent) {
            this.excludeVerboseContent = excludeVerboseContent;
            return this;
        }

        public Builder excludeVerboseContent(@Nullable Boolean excludeVerboseContent) {
            this.excludeVerboseContent = Output.ofNullable(excludeVerboseContent);
            return this;
        }

        public Builder fieldLogLevel(Output<String> fieldLogLevel) {
            this.fieldLogLevel = Objects.requireNonNull(fieldLogLevel);
            return this;
        }

        public Builder fieldLogLevel(String fieldLogLevel) {
            this.fieldLogLevel = Output.of(Objects.requireNonNull(fieldLogLevel));
            return this;
        }
        public GraphQLApiLogConfigGetArgs build() {
            return new GraphQLApiLogConfigGetArgs(cloudwatchLogsRoleArn, excludeVerboseContent, fieldLogLevel);
        }
    }
}
