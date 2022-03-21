// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v1.inputs.WidgetResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines the layout properties and content for a row.
 * 
 */
public final class RowResponse extends io.pulumi.resources.InvokeArgs {

    public static final RowResponse Empty = new RowResponse();

    /**
     * The relative weight of this row. The row weight is used to adjust the height of rows on the screen (relative to peers). Greater the weight, greater the height of the row on the screen. If omitted, a value of 1 is used while rendering.
     * 
     */
    @Import(name="weight", required=true)
      private final String weight;

    public String getWeight() {
        return this.weight;
    }

    /**
     * The display widgets arranged horizontally in this row.
     * 
     */
    @Import(name="widgets", required=true)
      private final List<WidgetResponse> widgets;

    public List<WidgetResponse> getWidgets() {
        return this.widgets;
    }

    public RowResponse(
        String weight,
        List<WidgetResponse> widgets) {
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
        this.widgets = Objects.requireNonNull(widgets, "expected parameter 'widgets' to be non-null");
    }

    private RowResponse() {
        this.weight = null;
        this.widgets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String weight;
        private List<WidgetResponse> widgets;

        public Builder() {
    	      // Empty
        }

        public Builder(RowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weight = defaults.weight;
    	      this.widgets = defaults.widgets;
        }

        public Builder weight(String weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public Builder widgets(List<WidgetResponse> widgets) {
            this.widgets = Objects.requireNonNull(widgets);
            return this;
        }
        public Builder widgets(WidgetResponse... widgets) {
            return widgets(List.of(widgets));
        }        public RowResponse build() {
            return new RowResponse(weight, widgets);
        }
    }
}
