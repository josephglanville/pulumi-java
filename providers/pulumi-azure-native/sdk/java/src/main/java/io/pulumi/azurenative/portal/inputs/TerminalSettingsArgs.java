// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.enums.FontSize;
import io.pulumi.azurenative.portal.enums.FontStyle;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for terminal appearance.
 * 
 */
public final class TerminalSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TerminalSettingsArgs Empty = new TerminalSettingsArgs();

    /**
     * Size of terminal font.
     * 
     */
    @InputImport(name="fontSize")
      private final @Nullable Input<Either<String,FontSize>> fontSize;

    public Input<Either<String,FontSize>> getFontSize() {
        return this.fontSize == null ? Input.empty() : this.fontSize;
    }

    /**
     * Style of terminal font.
     * 
     */
    @InputImport(name="fontStyle")
      private final @Nullable Input<Either<String,FontStyle>> fontStyle;

    public Input<Either<String,FontStyle>> getFontStyle() {
        return this.fontStyle == null ? Input.empty() : this.fontStyle;
    }

    public TerminalSettingsArgs(
        @Nullable Input<Either<String,FontSize>> fontSize,
        @Nullable Input<Either<String,FontStyle>> fontStyle) {
        this.fontSize = fontSize;
        this.fontStyle = fontStyle;
    }

    private TerminalSettingsArgs() {
        this.fontSize = Input.empty();
        this.fontStyle = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TerminalSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,FontSize>> fontSize;
        private @Nullable Input<Either<String,FontStyle>> fontStyle;

        public Builder() {
    	      // Empty
        }

        public Builder(TerminalSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fontSize = defaults.fontSize;
    	      this.fontStyle = defaults.fontStyle;
        }

        public Builder setFontSize(@Nullable Input<Either<String,FontSize>> fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public Builder setFontSize(@Nullable Either<String,FontSize> fontSize) {
            this.fontSize = Input.ofNullable(fontSize);
            return this;
        }

        public Builder setFontStyle(@Nullable Input<Either<String,FontStyle>> fontStyle) {
            this.fontStyle = fontStyle;
            return this;
        }

        public Builder setFontStyle(@Nullable Either<String,FontStyle> fontStyle) {
            this.fontStyle = Input.ofNullable(fontStyle);
            return this;
        }
        public TerminalSettingsArgs build() {
            return new TerminalSettingsArgs(fontSize, fontStyle);
        }
    }
}
