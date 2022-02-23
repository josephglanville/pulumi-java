// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThemeFontArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeFontArgs Empty = new ThemeFontArgs();

    @InputImport(name="fontFamily")
      private final @Nullable Input<String> fontFamily;

    public Input<String> getFontFamily() {
        return this.fontFamily == null ? Input.empty() : this.fontFamily;
    }

    public ThemeFontArgs(@Nullable Input<String> fontFamily) {
        this.fontFamily = fontFamily;
    }

    private ThemeFontArgs() {
        this.fontFamily = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeFontArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fontFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeFontArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fontFamily = defaults.fontFamily;
        }

        public Builder setFontFamily(@Nullable Input<String> fontFamily) {
            this.fontFamily = fontFamily;
            return this;
        }

        public Builder setFontFamily(@Nullable String fontFamily) {
            this.fontFamily = Input.ofNullable(fontFamily);
            return this;
        }
        public ThemeFontArgs build() {
            return new ThemeFontArgs(fontFamily);
        }
    }
}
