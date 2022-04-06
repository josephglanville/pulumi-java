// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookFilterGroupFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookFilterGroupFilterGetArgs Empty = new WebhookFilterGroupFilterGetArgs();

    /**
     * If set to `true`, the specified filter does *not* trigger a build. Defaults to `false`.
     * 
     */
    @Import(name="excludeMatchedPattern")
      private final @Nullable Output<Boolean> excludeMatchedPattern;

    public Output<Boolean> getExcludeMatchedPattern() {
        return this.excludeMatchedPattern == null ? Output.empty() : this.excludeMatchedPattern;
    }

    /**
     * For a filter that uses `EVENT` type, a comma-separated string that specifies one event: `PUSH`, `PULL_REQUEST_CREATED`, `PULL_REQUEST_UPDATED`, `PULL_REQUEST_REOPENED`. `PULL_REQUEST_MERGED` works with GitHub & GitHub Enterprise only. For a filter that uses any of the other filter types, a regular expression.
     * 
     */
    @Import(name="pattern", required=true)
      private final Output<String> pattern;

    public Output<String> getPattern() {
        return this.pattern;
    }

    /**
     * The webhook filter group's type. Valid values for this parameter are: `EVENT`, `BASE_REF`, `HEAD_REF`, `ACTOR_ACCOUNT_ID`, `FILE_PATH`, `COMMIT_MESSAGE`. At least one filter group must specify `EVENT` as its type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WebhookFilterGroupFilterGetArgs(
        @Nullable Output<Boolean> excludeMatchedPattern,
        Output<String> pattern,
        Output<String> type) {
        this.excludeMatchedPattern = excludeMatchedPattern;
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private WebhookFilterGroupFilterGetArgs() {
        this.excludeMatchedPattern = Output.empty();
        this.pattern = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookFilterGroupFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> excludeMatchedPattern;
        private Output<String> pattern;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookFilterGroupFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeMatchedPattern = defaults.excludeMatchedPattern;
    	      this.pattern = defaults.pattern;
    	      this.type = defaults.type;
        }

        public Builder excludeMatchedPattern(@Nullable Output<Boolean> excludeMatchedPattern) {
            this.excludeMatchedPattern = excludeMatchedPattern;
            return this;
        }
        public Builder excludeMatchedPattern(@Nullable Boolean excludeMatchedPattern) {
            this.excludeMatchedPattern = Output.ofNullable(excludeMatchedPattern);
            return this;
        }
        public Builder pattern(Output<String> pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }
        public Builder pattern(String pattern) {
            this.pattern = Output.of(Objects.requireNonNull(pattern));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public WebhookFilterGroupFilterGetArgs build() {
            return new WebhookFilterGroupFilterGetArgs(excludeMatchedPattern, pattern, type);
        }
    }
}