// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageTableCardCellResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageTableCardRowResponse {
    /**
     * Optional. List of cells that make up this row.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells;
    /**
     * Optional. Whether to add a visual divider after this row.
     * 
     */
    private final Boolean dividerAfter;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageTableCardRowResponse(
        @CustomType.Parameter("cells") List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells,
        @CustomType.Parameter("dividerAfter") Boolean dividerAfter) {
        this.cells = cells;
        this.dividerAfter = dividerAfter;
    }

    /**
     * Optional. List of cells that make up this row.
     * 
    */
    public List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> getCells() {
        return this.cells;
    }
    /**
     * Optional. Whether to add a visual divider after this row.
     * 
    */
    public Boolean getDividerAfter() {
        return this.dividerAfter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTableCardRowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells;
        private Boolean dividerAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTableCardRowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cells = defaults.cells;
    	      this.dividerAfter = defaults.dividerAfter;
        }

        public Builder cells(List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells) {
            this.cells = Objects.requireNonNull(cells);
            return this;
        }
        public Builder cells(GoogleCloudDialogflowV2IntentMessageTableCardCellResponse... cells) {
            return cells(List.of(cells));
        }
        public Builder dividerAfter(Boolean dividerAfter) {
            this.dividerAfter = Objects.requireNonNull(dividerAfter);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageTableCardRowResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageTableCardRowResponse(cells, dividerAfter);
        }
    }
}
