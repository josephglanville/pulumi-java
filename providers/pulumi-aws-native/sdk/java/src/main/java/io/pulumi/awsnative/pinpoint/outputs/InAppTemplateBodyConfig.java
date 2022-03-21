// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.pinpoint.outputs;

import io.pulumi.awsnative.pinpoint.enums.InAppTemplateAlignment;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InAppTemplateBodyConfig {
    private final @Nullable InAppTemplateAlignment alignment;
    private final @Nullable String body;
    private final @Nullable String textColor;

    @CustomType.Constructor
    private InAppTemplateBodyConfig(
        @CustomType.Parameter("alignment") @Nullable InAppTemplateAlignment alignment,
        @CustomType.Parameter("body") @Nullable String body,
        @CustomType.Parameter("textColor") @Nullable String textColor) {
        this.alignment = alignment;
        this.body = body;
        this.textColor = textColor;
    }

    public Optional<InAppTemplateAlignment> getAlignment() {
        return Optional.ofNullable(this.alignment);
    }
    public Optional<String> getBody() {
        return Optional.ofNullable(this.body);
    }
    public Optional<String> getTextColor() {
        return Optional.ofNullable(this.textColor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InAppTemplateBodyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InAppTemplateAlignment alignment;
        private @Nullable String body;
        private @Nullable String textColor;

        public Builder() {
    	      // Empty
        }

        public Builder(InAppTemplateBodyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alignment = defaults.alignment;
    	      this.body = defaults.body;
    	      this.textColor = defaults.textColor;
        }

        public Builder alignment(@Nullable InAppTemplateAlignment alignment) {
            this.alignment = alignment;
            return this;
        }
        public Builder body(@Nullable String body) {
            this.body = body;
            return this;
        }
        public Builder textColor(@Nullable String textColor) {
            this.textColor = textColor;
            return this;
        }        public InAppTemplateBodyConfig build() {
            return new InAppTemplateBodyConfig(alignment, body, textColor);
        }
    }
}
