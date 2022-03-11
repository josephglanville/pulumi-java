// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.WidgetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A basic layout divides the available space into vertical columns of equal width and arranges a list of widgets using a row-first strategy.
 * 
 */
public final class GridLayoutArgs extends io.pulumi.resources.ResourceArgs {

    public static final GridLayoutArgs Empty = new GridLayoutArgs();

    /**
     * The number of columns into which the view's width is divided. If omitted or set to zero, a system default will be used while rendering.
     * 
     */
    @InputImport(name="columns")
      private final @Nullable Output<String> columns;

    public Output<String> getColumns() {
        return this.columns == null ? Output.empty() : this.columns;
    }

    /**
     * The informational elements that are arranged into the columns row-first.
     * 
     */
    @InputImport(name="widgets")
      private final @Nullable Output<List<WidgetArgs>> widgets;

    public Output<List<WidgetArgs>> getWidgets() {
        return this.widgets == null ? Output.empty() : this.widgets;
    }

    public GridLayoutArgs(
        @Nullable Output<String> columns,
        @Nullable Output<List<WidgetArgs>> widgets) {
        this.columns = columns;
        this.widgets = widgets;
    }

    private GridLayoutArgs() {
        this.columns = Output.empty();
        this.widgets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GridLayoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> columns;
        private @Nullable Output<List<WidgetArgs>> widgets;

        public Builder() {
    	      // Empty
        }

        public Builder(GridLayoutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.widgets = defaults.widgets;
        }

        public Builder columns(@Nullable Output<String> columns) {
            this.columns = columns;
            return this;
        }

        public Builder columns(@Nullable String columns) {
            this.columns = Output.ofNullable(columns);
            return this;
        }

        public Builder widgets(@Nullable Output<List<WidgetArgs>> widgets) {
            this.widgets = widgets;
            return this;
        }

        public Builder widgets(@Nullable List<WidgetArgs> widgets) {
            this.widgets = Output.ofNullable(widgets);
            return this;
        }
        public GridLayoutArgs build() {
            return new GridLayoutArgs(columns, widgets);
        }
    }
}
