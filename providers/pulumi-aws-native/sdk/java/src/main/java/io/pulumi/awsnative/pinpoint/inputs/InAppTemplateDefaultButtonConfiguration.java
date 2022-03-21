// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.pinpoint.inputs;

import io.pulumi.awsnative.pinpoint.enums.InAppTemplateButtonAction;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InAppTemplateDefaultButtonConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final InAppTemplateDefaultButtonConfiguration Empty = new InAppTemplateDefaultButtonConfiguration();

    @Import(name="backgroundColor")
      private final @Nullable String backgroundColor;

    public Optional<String> getBackgroundColor() {
        return this.backgroundColor == null ? Optional.empty() : Optional.ofNullable(this.backgroundColor);
    }

    @Import(name="borderRadius")
      private final @Nullable Integer borderRadius;

    public Optional<Integer> getBorderRadius() {
        return this.borderRadius == null ? Optional.empty() : Optional.ofNullable(this.borderRadius);
    }

    @Import(name="buttonAction")
      private final @Nullable InAppTemplateButtonAction buttonAction;

    public Optional<InAppTemplateButtonAction> getButtonAction() {
        return this.buttonAction == null ? Optional.empty() : Optional.ofNullable(this.buttonAction);
    }

    @Import(name="link")
      private final @Nullable String link;

    public Optional<String> getLink() {
        return this.link == null ? Optional.empty() : Optional.ofNullable(this.link);
    }

    @Import(name="text")
      private final @Nullable String text;

    public Optional<String> getText() {
        return this.text == null ? Optional.empty() : Optional.ofNullable(this.text);
    }

    @Import(name="textColor")
      private final @Nullable String textColor;

    public Optional<String> getTextColor() {
        return this.textColor == null ? Optional.empty() : Optional.ofNullable(this.textColor);
    }

    public InAppTemplateDefaultButtonConfiguration(
        @Nullable String backgroundColor,
        @Nullable Integer borderRadius,
        @Nullable InAppTemplateButtonAction buttonAction,
        @Nullable String link,
        @Nullable String text,
        @Nullable String textColor) {
        this.backgroundColor = backgroundColor;
        this.borderRadius = borderRadius;
        this.buttonAction = buttonAction;
        this.link = link;
        this.text = text;
        this.textColor = textColor;
    }

    private InAppTemplateDefaultButtonConfiguration() {
        this.backgroundColor = null;
        this.borderRadius = null;
        this.buttonAction = null;
        this.link = null;
        this.text = null;
        this.textColor = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InAppTemplateDefaultButtonConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backgroundColor;
        private @Nullable Integer borderRadius;
        private @Nullable InAppTemplateButtonAction buttonAction;
        private @Nullable String link;
        private @Nullable String text;
        private @Nullable String textColor;

        public Builder() {
    	      // Empty
        }

        public Builder(InAppTemplateDefaultButtonConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backgroundColor = defaults.backgroundColor;
    	      this.borderRadius = defaults.borderRadius;
    	      this.buttonAction = defaults.buttonAction;
    	      this.link = defaults.link;
    	      this.text = defaults.text;
    	      this.textColor = defaults.textColor;
        }

        public Builder backgroundColor(@Nullable String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }
        public Builder borderRadius(@Nullable Integer borderRadius) {
            this.borderRadius = borderRadius;
            return this;
        }
        public Builder buttonAction(@Nullable InAppTemplateButtonAction buttonAction) {
            this.buttonAction = buttonAction;
            return this;
        }
        public Builder link(@Nullable String link) {
            this.link = link;
            return this;
        }
        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }
        public Builder textColor(@Nullable String textColor) {
            this.textColor = textColor;
            return this;
        }        public InAppTemplateDefaultButtonConfiguration build() {
            return new InAppTemplateDefaultButtonConfiguration(backgroundColor, borderRadius, buttonAction, link, text, textColor);
        }
    }
}
