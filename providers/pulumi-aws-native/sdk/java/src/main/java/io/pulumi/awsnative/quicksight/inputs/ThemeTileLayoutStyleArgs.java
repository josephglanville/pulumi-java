// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.ThemeGutterStyleArgs;
import io.pulumi.awsnative.quicksight.inputs.ThemeMarginStyleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The display options for the layout of tiles on a sheet.</p>
 * 
 */
public final class ThemeTileLayoutStyleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeTileLayoutStyleArgs Empty = new ThemeTileLayoutStyleArgs();

    @Import(name="gutter")
      private final @Nullable Output<ThemeGutterStyleArgs> gutter;

    public Output<ThemeGutterStyleArgs> getGutter() {
        return this.gutter == null ? Codegen.empty() : this.gutter;
    }

    @Import(name="margin")
      private final @Nullable Output<ThemeMarginStyleArgs> margin;

    public Output<ThemeMarginStyleArgs> getMargin() {
        return this.margin == null ? Codegen.empty() : this.margin;
    }

    public ThemeTileLayoutStyleArgs(
        @Nullable Output<ThemeGutterStyleArgs> gutter,
        @Nullable Output<ThemeMarginStyleArgs> margin) {
        this.gutter = gutter;
        this.margin = margin;
    }

    private ThemeTileLayoutStyleArgs() {
        this.gutter = Codegen.empty();
        this.margin = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeTileLayoutStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ThemeGutterStyleArgs> gutter;
        private @Nullable Output<ThemeMarginStyleArgs> margin;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeTileLayoutStyleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gutter = defaults.gutter;
    	      this.margin = defaults.margin;
        }

        public Builder gutter(@Nullable Output<ThemeGutterStyleArgs> gutter) {
            this.gutter = gutter;
            return this;
        }
        public Builder gutter(@Nullable ThemeGutterStyleArgs gutter) {
            this.gutter = Codegen.ofNullable(gutter);
            return this;
        }
        public Builder margin(@Nullable Output<ThemeMarginStyleArgs> margin) {
            this.margin = margin;
            return this;
        }
        public Builder margin(@Nullable ThemeMarginStyleArgs margin) {
            this.margin = Codegen.ofNullable(margin);
            return this;
        }        public ThemeTileLayoutStyleArgs build() {
            return new ThemeTileLayoutStyleArgs(gutter, margin);
        }
    }
}
