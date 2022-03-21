// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogStreamArgs Empty = new LogStreamArgs();

    /**
     * The name of the log group under which the log stream is to be created.
     * 
     */
    @Import(name="logGroupName", required=true)
      private final Output<String> logGroupName;

    public Output<String> getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public LogStreamArgs(
        Output<String> logGroupName,
        @Nullable Output<String> name) {
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.name = name;
    }

    private LogStreamArgs() {
        this.logGroupName = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> logGroupName;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LogStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.name = defaults.name;
        }

        public Builder logGroupName(Output<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }
        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Output.of(Objects.requireNonNull(logGroupName));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public LogStreamArgs build() {
            return new LogStreamArgs(logGroupName, name);
        }
    }
}
