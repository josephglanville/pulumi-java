// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventSourceMappingFilterCriteriaFilter {
    /**
     * A filter pattern up to 4096 characters. See [Filter Rule Syntax](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax).
     * 
     */
    private final @Nullable String pattern;

    @OutputCustomType.Constructor
    private EventSourceMappingFilterCriteriaFilter(@OutputCustomType.Parameter("pattern") @Nullable String pattern) {
        this.pattern = pattern;
    }

    /**
     * A filter pattern up to 4096 characters. See [Filter Rule Syntax](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax).
     * 
    */
    public Optional<String> getPattern() {
        return Optional.ofNullable(this.pattern);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingFilterCriteriaFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingFilterCriteriaFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
        }

        public Builder setPattern(@Nullable String pattern) {
            this.pattern = pattern;
            return this;
        }
        public EventSourceMappingFilterCriteriaFilter build() {
            return new EventSourceMappingFilterCriteriaFilter(pattern);
        }
    }
}
