// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v3.enums.ContentMatcherMatcher;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Optional. Used to perform content matching. This allows matching based on substrings and regular expressions, together with their negations. Only the first 4 MB of an HTTP or HTTPS check's response (and the first 1 MB of a TCP check's response) are examined for purposes of content matching.
 * 
 */
public final class ContentMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentMatcherArgs Empty = new ContentMatcherArgs();

    /**
     * String or regex content to match. Maximum 1024 bytes. An empty content string indicates no content matching is to be performed.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Codegen.empty() : this.content;
    }

    /**
     * The type of content matcher that will be applied to the server output, compared to the content string when the check is run.
     * 
     */
    @Import(name="matcher")
      private final @Nullable Output<ContentMatcherMatcher> matcher;

    public Output<ContentMatcherMatcher> getMatcher() {
        return this.matcher == null ? Codegen.empty() : this.matcher;
    }

    public ContentMatcherArgs(
        @Nullable Output<String> content,
        @Nullable Output<ContentMatcherMatcher> matcher) {
        this.content = content;
        this.matcher = matcher;
    }

    private ContentMatcherArgs() {
        this.content = Codegen.empty();
        this.matcher = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<ContentMatcherMatcher> matcher;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.matcher = defaults.matcher;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Codegen.ofNullable(content);
            return this;
        }
        public Builder matcher(@Nullable Output<ContentMatcherMatcher> matcher) {
            this.matcher = matcher;
            return this;
        }
        public Builder matcher(@Nullable ContentMatcherMatcher matcher) {
            this.matcher = Codegen.ofNullable(matcher);
            return this;
        }        public ContentMatcherArgs build() {
            return new ContentMatcherArgs(content, matcher);
        }
    }
}
