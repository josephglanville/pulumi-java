// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.ThemeDataColorPalette;
import io.pulumi.awsnative.quicksight.inputs.ThemeSheetStyle;
import io.pulumi.awsnative.quicksight.inputs.ThemeTypography;
import io.pulumi.awsnative.quicksight.inputs.ThemeUIColorPalette;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>The theme configuration. This configuration contains all of the display properties for
 *             a theme.</p>
 * 
 */
public final class ThemeConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ThemeConfiguration Empty = new ThemeConfiguration();

    @InputImport(name="dataColorPalette")
      private final @Nullable ThemeDataColorPalette dataColorPalette;

    public Optional<ThemeDataColorPalette> getDataColorPalette() {
        return this.dataColorPalette == null ? Optional.empty() : Optional.ofNullable(this.dataColorPalette);
    }

    @InputImport(name="sheet")
      private final @Nullable ThemeSheetStyle sheet;

    public Optional<ThemeSheetStyle> getSheet() {
        return this.sheet == null ? Optional.empty() : Optional.ofNullable(this.sheet);
    }

    @InputImport(name="typography")
      private final @Nullable ThemeTypography typography;

    public Optional<ThemeTypography> getTypography() {
        return this.typography == null ? Optional.empty() : Optional.ofNullable(this.typography);
    }

    @InputImport(name="uIColorPalette")
      private final @Nullable ThemeUIColorPalette uIColorPalette;

    public Optional<ThemeUIColorPalette> getUIColorPalette() {
        return this.uIColorPalette == null ? Optional.empty() : Optional.ofNullable(this.uIColorPalette);
    }

    public ThemeConfiguration(
        @Nullable ThemeDataColorPalette dataColorPalette,
        @Nullable ThemeSheetStyle sheet,
        @Nullable ThemeTypography typography,
        @Nullable ThemeUIColorPalette uIColorPalette) {
        this.dataColorPalette = dataColorPalette;
        this.sheet = sheet;
        this.typography = typography;
        this.uIColorPalette = uIColorPalette;
    }

    private ThemeConfiguration() {
        this.dataColorPalette = null;
        this.sheet = null;
        this.typography = null;
        this.uIColorPalette = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ThemeDataColorPalette dataColorPalette;
        private @Nullable ThemeSheetStyle sheet;
        private @Nullable ThemeTypography typography;
        private @Nullable ThemeUIColorPalette uIColorPalette;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataColorPalette = defaults.dataColorPalette;
    	      this.sheet = defaults.sheet;
    	      this.typography = defaults.typography;
    	      this.uIColorPalette = defaults.uIColorPalette;
        }

        public Builder setDataColorPalette(@Nullable ThemeDataColorPalette dataColorPalette) {
            this.dataColorPalette = dataColorPalette;
            return this;
        }

        public Builder setSheet(@Nullable ThemeSheetStyle sheet) {
            this.sheet = sheet;
            return this;
        }

        public Builder setTypography(@Nullable ThemeTypography typography) {
            this.typography = typography;
            return this;
        }

        public Builder setUIColorPalette(@Nullable ThemeUIColorPalette uIColorPalette) {
            this.uIColorPalette = uIColorPalette;
            return this;
        }
        public ThemeConfiguration build() {
            return new ThemeConfiguration(dataColorPalette, sheet, typography, uIColorPalette);
        }
    }
}
