// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MarkdownPartMetadataSettingsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MarkdownPartMetadataSettingsSettingsArgs Empty = new MarkdownPartMetadataSettingsSettingsArgs();

    @InputImport(name="content")
    private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    @InputImport(name="markdownSource")
    private final @Nullable Input<Integer> markdownSource;

    public Input<Integer> getMarkdownSource() {
        return this.markdownSource == null ? Input.empty() : this.markdownSource;
    }

    @InputImport(name="markdownUri")
    private final @Nullable Input<String> markdownUri;

    public Input<String> getMarkdownUri() {
        return this.markdownUri == null ? Input.empty() : this.markdownUri;
    }

    @InputImport(name="subtitle")
    private final @Nullable Input<String> subtitle;

    public Input<String> getSubtitle() {
        return this.subtitle == null ? Input.empty() : this.subtitle;
    }

    @InputImport(name="title")
    private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public MarkdownPartMetadataSettingsSettingsArgs(
        @Nullable Input<String> content,
        @Nullable Input<Integer> markdownSource,
        @Nullable Input<String> markdownUri,
        @Nullable Input<String> subtitle,
        @Nullable Input<String> title) {
        this.content = content;
        this.markdownSource = markdownSource;
        this.markdownUri = markdownUri;
        this.subtitle = subtitle;
        this.title = title;
    }

    private MarkdownPartMetadataSettingsSettingsArgs() {
        this.content = Input.empty();
        this.markdownSource = Input.empty();
        this.markdownUri = Input.empty();
        this.subtitle = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MarkdownPartMetadataSettingsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private @Nullable Input<Integer> markdownSource;
        private @Nullable Input<String> markdownUri;
        private @Nullable Input<String> subtitle;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(MarkdownPartMetadataSettingsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.markdownSource = defaults.markdownSource;
    	      this.markdownUri = defaults.markdownUri;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setContent(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder setMarkdownSource(@Nullable Input<Integer> markdownSource) {
            this.markdownSource = markdownSource;
            return this;
        }

        public Builder setMarkdownSource(@Nullable Integer markdownSource) {
            this.markdownSource = Input.ofNullable(markdownSource);
            return this;
        }

        public Builder setMarkdownUri(@Nullable Input<String> markdownUri) {
            this.markdownUri = markdownUri;
            return this;
        }

        public Builder setMarkdownUri(@Nullable String markdownUri) {
            this.markdownUri = Input.ofNullable(markdownUri);
            return this;
        }

        public Builder setSubtitle(@Nullable Input<String> subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder setSubtitle(@Nullable String subtitle) {
            this.subtitle = Input.ofNullable(subtitle);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public MarkdownPartMetadataSettingsSettingsArgs build() {
            return new MarkdownPartMetadataSettingsSettingsArgs(content, markdownSource, markdownUri, subtitle, title);
        }
    }
}
