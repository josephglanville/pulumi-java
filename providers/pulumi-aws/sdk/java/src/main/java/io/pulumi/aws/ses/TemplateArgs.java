// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateArgs Empty = new TemplateArgs();

    /**
     * The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
     * 
     */
    @Import(name="html")
      private final @Nullable Output<String> html;

    public Output<String> getHtml() {
        return this.html == null ? Output.empty() : this.html;
    }

    /**
     * The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The subject line of the email.
     * 
     */
    @Import(name="subject")
      private final @Nullable Output<String> subject;

    public Output<String> getSubject() {
        return this.subject == null ? Output.empty() : this.subject;
    }

    /**
     * The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<String> text;

    public Output<String> getText() {
        return this.text == null ? Output.empty() : this.text;
    }

    public TemplateArgs(
        @Nullable Output<String> html,
        @Nullable Output<String> name,
        @Nullable Output<String> subject,
        @Nullable Output<String> text) {
        this.html = html;
        this.name = name;
        this.subject = subject;
        this.text = text;
    }

    private TemplateArgs() {
        this.html = Output.empty();
        this.name = Output.empty();
        this.subject = Output.empty();
        this.text = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> html;
        private @Nullable Output<String> name;
        private @Nullable Output<String> subject;
        private @Nullable Output<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.html = defaults.html;
    	      this.name = defaults.name;
    	      this.subject = defaults.subject;
    	      this.text = defaults.text;
        }

        public Builder html(@Nullable Output<String> html) {
            this.html = html;
            return this;
        }
        public Builder html(@Nullable String html) {
            this.html = Output.ofNullable(html);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder subject(@Nullable Output<String> subject) {
            this.subject = subject;
            return this;
        }
        public Builder subject(@Nullable String subject) {
            this.subject = Output.ofNullable(subject);
            return this;
        }
        public Builder text(@Nullable Output<String> text) {
            this.text = text;
            return this;
        }
        public Builder text(@Nullable String text) {
            this.text = Output.ofNullable(text);
            return this;
        }        public TemplateArgs build() {
            return new TemplateArgs(html, name, subject, text);
        }
    }
}
