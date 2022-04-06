// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventSourceMappingFilterCriteriaFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingFilterCriteriaFilterGetArgs Empty = new EventSourceMappingFilterCriteriaFilterGetArgs();

    /**
     * A filter pattern up to 4096 characters. See [Filter Rule Syntax](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax).
     * 
     */
    @Import(name="pattern")
      private final @Nullable Output<String> pattern;

    public Output<String> getPattern() {
        return this.pattern == null ? Output.empty() : this.pattern;
    }

    public EventSourceMappingFilterCriteriaFilterGetArgs(@Nullable Output<String> pattern) {
        this.pattern = pattern;
    }

    private EventSourceMappingFilterCriteriaFilterGetArgs() {
        this.pattern = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingFilterCriteriaFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingFilterCriteriaFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
        }

        public Builder pattern(@Nullable Output<String> pattern) {
            this.pattern = pattern;
            return this;
        }
        public Builder pattern(@Nullable String pattern) {
            this.pattern = Output.ofNullable(pattern);
            return this;
        }        public EventSourceMappingFilterCriteriaFilterGetArgs build() {
            return new EventSourceMappingFilterCriteriaFilterGetArgs(pattern);
        }
    }
}