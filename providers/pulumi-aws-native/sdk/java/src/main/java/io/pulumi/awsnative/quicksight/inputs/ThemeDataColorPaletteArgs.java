// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The theme colors that are used for data colors in charts. The colors description is a
 *             hexadecimal color code that consists of six alphanumerical characters, prefixed with
 *                 <code>#</code>, for example #37BFF5. </p>
 * 
 */
public final class ThemeDataColorPaletteArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeDataColorPaletteArgs Empty = new ThemeDataColorPaletteArgs();

    /**
     * <p>The hexadecimal codes for the colors.</p>
     * 
     */
    @InputImport(name="colors")
      private final @Nullable Output<List<String>> colors;

    public Output<List<String>> getColors() {
        return this.colors == null ? Output.empty() : this.colors;
    }

    /**
     * <p>The hexadecimal code of a color that applies to charts where a lack of data is
     *             highlighted.</p>
     * 
     */
    @InputImport(name="emptyFillColor")
      private final @Nullable Output<String> emptyFillColor;

    public Output<String> getEmptyFillColor() {
        return this.emptyFillColor == null ? Output.empty() : this.emptyFillColor;
    }

    /**
     * <p>The minimum and maximum hexadecimal codes that describe a color gradient. </p>
     * 
     */
    @InputImport(name="minMaxGradient")
      private final @Nullable Output<List<String>> minMaxGradient;

    public Output<List<String>> getMinMaxGradient() {
        return this.minMaxGradient == null ? Output.empty() : this.minMaxGradient;
    }

    public ThemeDataColorPaletteArgs(
        @Nullable Output<List<String>> colors,
        @Nullable Output<String> emptyFillColor,
        @Nullable Output<List<String>> minMaxGradient) {
        this.colors = colors;
        this.emptyFillColor = emptyFillColor;
        this.minMaxGradient = minMaxGradient;
    }

    private ThemeDataColorPaletteArgs() {
        this.colors = Output.empty();
        this.emptyFillColor = Output.empty();
        this.minMaxGradient = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeDataColorPaletteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> colors;
        private @Nullable Output<String> emptyFillColor;
        private @Nullable Output<List<String>> minMaxGradient;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeDataColorPaletteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
    	      this.emptyFillColor = defaults.emptyFillColor;
    	      this.minMaxGradient = defaults.minMaxGradient;
        }

        public Builder colors(@Nullable Output<List<String>> colors) {
            this.colors = colors;
            return this;
        }

        public Builder colors(@Nullable List<String> colors) {
            this.colors = Output.ofNullable(colors);
            return this;
        }

        public Builder emptyFillColor(@Nullable Output<String> emptyFillColor) {
            this.emptyFillColor = emptyFillColor;
            return this;
        }

        public Builder emptyFillColor(@Nullable String emptyFillColor) {
            this.emptyFillColor = Output.ofNullable(emptyFillColor);
            return this;
        }

        public Builder minMaxGradient(@Nullable Output<List<String>> minMaxGradient) {
            this.minMaxGradient = minMaxGradient;
            return this;
        }

        public Builder minMaxGradient(@Nullable List<String> minMaxGradient) {
            this.minMaxGradient = Output.ofNullable(minMaxGradient);
            return this;
        }
        public ThemeDataColorPaletteArgs build() {
            return new ThemeDataColorPaletteArgs(colors, emptyFillColor, minMaxGradient);
        }
    }
}
