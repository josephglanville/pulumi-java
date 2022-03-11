// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BotAliasCloudWatchLogGroupLogDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasCloudWatchLogGroupLogDestinationArgs Empty = new BotAliasCloudWatchLogGroupLogDestinationArgs();

    /**
     * A string used to identify this tag
     * 
     */
    @InputImport(name="cloudWatchLogGroupArn", required=true)
      private final Output<String> cloudWatchLogGroupArn;

    public Output<String> getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * A string containing the value for the tag
     * 
     */
    @InputImport(name="logPrefix", required=true)
      private final Output<String> logPrefix;

    public Output<String> getLogPrefix() {
        return this.logPrefix;
    }

    public BotAliasCloudWatchLogGroupLogDestinationArgs(
        Output<String> cloudWatchLogGroupArn,
        Output<String> logPrefix) {
        this.cloudWatchLogGroupArn = Objects.requireNonNull(cloudWatchLogGroupArn, "expected parameter 'cloudWatchLogGroupArn' to be non-null");
        this.logPrefix = Objects.requireNonNull(logPrefix, "expected parameter 'logPrefix' to be non-null");
    }

    private BotAliasCloudWatchLogGroupLogDestinationArgs() {
        this.cloudWatchLogGroupArn = Output.empty();
        this.logPrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasCloudWatchLogGroupLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cloudWatchLogGroupArn;
        private Output<String> logPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasCloudWatchLogGroupLogDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogGroupArn = defaults.cloudWatchLogGroupArn;
    	      this.logPrefix = defaults.logPrefix;
        }

        public Builder cloudWatchLogGroupArn(Output<String> cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = Objects.requireNonNull(cloudWatchLogGroupArn);
            return this;
        }

        public Builder cloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = Output.of(Objects.requireNonNull(cloudWatchLogGroupArn));
            return this;
        }

        public Builder logPrefix(Output<String> logPrefix) {
            this.logPrefix = Objects.requireNonNull(logPrefix);
            return this;
        }

        public Builder logPrefix(String logPrefix) {
            this.logPrefix = Output.of(Objects.requireNonNull(logPrefix));
            return this;
        }
        public BotAliasCloudWatchLogGroupLogDestinationArgs build() {
            return new BotAliasCloudWatchLogGroupLogDestinationArgs(cloudWatchLogGroupArn, logPrefix);
        }
    }
}
