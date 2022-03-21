// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v1.enums.TextFormat;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A widget that displays textual content.
 * 
 */
public final class TextArgs extends io.pulumi.resources.ResourceArgs {

    public static final TextArgs Empty = new TextArgs();

    /**
     * The text content to be displayed.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Output.empty() : this.content;
    }

    /**
     * How the text content is formatted.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<TextFormat> format;

    public Output<TextFormat> getFormat() {
        return this.format == null ? Output.empty() : this.format;
    }

    public TextArgs(
        @Nullable Output<String> content,
        @Nullable Output<TextFormat> format) {
        this.content = content;
        this.format = format;
    }

    private TextArgs() {
        this.content = Output.empty();
        this.format = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<TextFormat> format;

        public Builder() {
    	      // Empty
        }

        public Builder(TextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.format = defaults.format;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Output.ofNullable(content);
            return this;
        }
        public Builder format(@Nullable Output<TextFormat> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable TextFormat format) {
            this.format = Output.ofNullable(format);
            return this;
        }        public TextArgs build() {
            return new TextArgs(content, format);
        }
    }
}
