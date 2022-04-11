// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.ThemeTileLayoutStyleArgs;
import io.pulumi.awsnative.quicksight.inputs.ThemeTileStyleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The theme display options for sheets. </p>
 * 
 */
public final class ThemeSheetStyleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeSheetStyleArgs Empty = new ThemeSheetStyleArgs();

    @Import(name="tile")
      private final @Nullable Output<ThemeTileStyleArgs> tile;

    public Output<ThemeTileStyleArgs> getTile() {
        return this.tile == null ? Codegen.empty() : this.tile;
    }

    @Import(name="tileLayout")
      private final @Nullable Output<ThemeTileLayoutStyleArgs> tileLayout;

    public Output<ThemeTileLayoutStyleArgs> getTileLayout() {
        return this.tileLayout == null ? Codegen.empty() : this.tileLayout;
    }

    public ThemeSheetStyleArgs(
        @Nullable Output<ThemeTileStyleArgs> tile,
        @Nullable Output<ThemeTileLayoutStyleArgs> tileLayout) {
        this.tile = tile;
        this.tileLayout = tileLayout;
    }

    private ThemeSheetStyleArgs() {
        this.tile = Codegen.empty();
        this.tileLayout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeSheetStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ThemeTileStyleArgs> tile;
        private @Nullable Output<ThemeTileLayoutStyleArgs> tileLayout;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeSheetStyleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tile = defaults.tile;
    	      this.tileLayout = defaults.tileLayout;
        }

        public Builder tile(@Nullable Output<ThemeTileStyleArgs> tile) {
            this.tile = tile;
            return this;
        }
        public Builder tile(@Nullable ThemeTileStyleArgs tile) {
            this.tile = Codegen.ofNullable(tile);
            return this;
        }
        public Builder tileLayout(@Nullable Output<ThemeTileLayoutStyleArgs> tileLayout) {
            this.tileLayout = tileLayout;
            return this;
        }
        public Builder tileLayout(@Nullable ThemeTileLayoutStyleArgs tileLayout) {
            this.tileLayout = Codegen.ofNullable(tileLayout);
            return this;
        }        public ThemeSheetStyleArgs build() {
            return new ThemeSheetStyleArgs(tile, tileLayout);
        }
    }
}
