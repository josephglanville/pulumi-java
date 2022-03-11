// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HumanTaskUIUiTemplateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final HumanTaskUIUiTemplateGetArgs Empty = new HumanTaskUIUiTemplateGetArgs();

    /**
     * The content of the Liquid template for the worker user interface.
     * 
     */
    @InputImport(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Output.empty() : this.content;
    }

    /**
     * The SHA-256 digest of the contents of the template.
     * 
     */
    @InputImport(name="contentSha256")
      private final @Nullable Output<String> contentSha256;

    public Output<String> getContentSha256() {
        return this.contentSha256 == null ? Output.empty() : this.contentSha256;
    }

    /**
     * The URL for the user interface template.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public HumanTaskUIUiTemplateGetArgs(
        @Nullable Output<String> content,
        @Nullable Output<String> contentSha256,
        @Nullable Output<String> url) {
        this.content = content;
        this.contentSha256 = contentSha256;
        this.url = url;
    }

    private HumanTaskUIUiTemplateGetArgs() {
        this.content = Output.empty();
        this.contentSha256 = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HumanTaskUIUiTemplateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<String> contentSha256;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(HumanTaskUIUiTemplateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentSha256 = defaults.contentSha256;
    	      this.url = defaults.url;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable String content) {
            this.content = Output.ofNullable(content);
            return this;
        }

        public Builder contentSha256(@Nullable Output<String> contentSha256) {
            this.contentSha256 = contentSha256;
            return this;
        }

        public Builder contentSha256(@Nullable String contentSha256) {
            this.contentSha256 = Output.ofNullable(contentSha256);
            return this;
        }

        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }
        public HumanTaskUIUiTemplateGetArgs build() {
            return new HumanTaskUIUiTemplateGetArgs(content, contentSha256, url);
        }
    }
}
