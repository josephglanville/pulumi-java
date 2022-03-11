// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.aws.lex.inputs.BotAliasConversationLogsLogSettingGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotAliasConversationLogsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasConversationLogsGetArgs Empty = new BotAliasConversationLogsGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to write your logs to CloudWatch Logs or an S3 bucket. Must be between 20 and 2048 characters in length.
     * 
     */
    @InputImport(name="iamRoleArn", required=true)
      private final Output<String> iamRoleArn;

    public Output<String> getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * The settings for your conversation logs. You can log text, audio, or both. Attributes are documented under log_settings.
     * 
     */
    @InputImport(name="logSettings")
      private final @Nullable Output<List<BotAliasConversationLogsLogSettingGetArgs>> logSettings;

    public Output<List<BotAliasConversationLogsLogSettingGetArgs>> getLogSettings() {
        return this.logSettings == null ? Output.empty() : this.logSettings;
    }

    public BotAliasConversationLogsGetArgs(
        Output<String> iamRoleArn,
        @Nullable Output<List<BotAliasConversationLogsLogSettingGetArgs>> logSettings) {
        this.iamRoleArn = Objects.requireNonNull(iamRoleArn, "expected parameter 'iamRoleArn' to be non-null");
        this.logSettings = logSettings;
    }

    private BotAliasConversationLogsGetArgs() {
        this.iamRoleArn = Output.empty();
        this.logSettings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasConversationLogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> iamRoleArn;
        private @Nullable Output<List<BotAliasConversationLogsLogSettingGetArgs>> logSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasConversationLogsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.logSettings = defaults.logSettings;
        }

        public Builder iamRoleArn(Output<String> iamRoleArn) {
            this.iamRoleArn = Objects.requireNonNull(iamRoleArn);
            return this;
        }

        public Builder iamRoleArn(String iamRoleArn) {
            this.iamRoleArn = Output.of(Objects.requireNonNull(iamRoleArn));
            return this;
        }

        public Builder logSettings(@Nullable Output<List<BotAliasConversationLogsLogSettingGetArgs>> logSettings) {
            this.logSettings = logSettings;
            return this;
        }

        public Builder logSettings(@Nullable List<BotAliasConversationLogsLogSettingGetArgs> logSettings) {
            this.logSettings = Output.ofNullable(logSettings);
            return this;
        }
        public BotAliasConversationLogsGetArgs build() {
            return new BotAliasConversationLogsGetArgs(iamRoleArn, logSettings);
        }
    }
}
