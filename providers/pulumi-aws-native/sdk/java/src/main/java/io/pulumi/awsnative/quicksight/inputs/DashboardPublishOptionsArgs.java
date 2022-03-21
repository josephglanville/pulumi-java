// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.DashboardAdHocFilteringOptionArgs;
import io.pulumi.awsnative.quicksight.inputs.DashboardExportToCSVOptionArgs;
import io.pulumi.awsnative.quicksight.inputs.DashboardSheetControlsOptionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Dashboard publish options.</p>
 * 
 */
public final class DashboardPublishOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardPublishOptionsArgs Empty = new DashboardPublishOptionsArgs();

    @Import(name="adHocFilteringOption")
      private final @Nullable Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption;

    public Output<DashboardAdHocFilteringOptionArgs> getAdHocFilteringOption() {
        return this.adHocFilteringOption == null ? Output.empty() : this.adHocFilteringOption;
    }

    @Import(name="exportToCSVOption")
      private final @Nullable Output<DashboardExportToCSVOptionArgs> exportToCSVOption;

    public Output<DashboardExportToCSVOptionArgs> getExportToCSVOption() {
        return this.exportToCSVOption == null ? Output.empty() : this.exportToCSVOption;
    }

    @Import(name="sheetControlsOption")
      private final @Nullable Output<DashboardSheetControlsOptionArgs> sheetControlsOption;

    public Output<DashboardSheetControlsOptionArgs> getSheetControlsOption() {
        return this.sheetControlsOption == null ? Output.empty() : this.sheetControlsOption;
    }

    public DashboardPublishOptionsArgs(
        @Nullable Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption,
        @Nullable Output<DashboardExportToCSVOptionArgs> exportToCSVOption,
        @Nullable Output<DashboardSheetControlsOptionArgs> sheetControlsOption) {
        this.adHocFilteringOption = adHocFilteringOption;
        this.exportToCSVOption = exportToCSVOption;
        this.sheetControlsOption = sheetControlsOption;
    }

    private DashboardPublishOptionsArgs() {
        this.adHocFilteringOption = Output.empty();
        this.exportToCSVOption = Output.empty();
        this.sheetControlsOption = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPublishOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption;
        private @Nullable Output<DashboardExportToCSVOptionArgs> exportToCSVOption;
        private @Nullable Output<DashboardSheetControlsOptionArgs> sheetControlsOption;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPublishOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adHocFilteringOption = defaults.adHocFilteringOption;
    	      this.exportToCSVOption = defaults.exportToCSVOption;
    	      this.sheetControlsOption = defaults.sheetControlsOption;
        }

        public Builder adHocFilteringOption(@Nullable Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption) {
            this.adHocFilteringOption = adHocFilteringOption;
            return this;
        }
        public Builder adHocFilteringOption(@Nullable DashboardAdHocFilteringOptionArgs adHocFilteringOption) {
            this.adHocFilteringOption = Output.ofNullable(adHocFilteringOption);
            return this;
        }
        public Builder exportToCSVOption(@Nullable Output<DashboardExportToCSVOptionArgs> exportToCSVOption) {
            this.exportToCSVOption = exportToCSVOption;
            return this;
        }
        public Builder exportToCSVOption(@Nullable DashboardExportToCSVOptionArgs exportToCSVOption) {
            this.exportToCSVOption = Output.ofNullable(exportToCSVOption);
            return this;
        }
        public Builder sheetControlsOption(@Nullable Output<DashboardSheetControlsOptionArgs> sheetControlsOption) {
            this.sheetControlsOption = sheetControlsOption;
            return this;
        }
        public Builder sheetControlsOption(@Nullable DashboardSheetControlsOptionArgs sheetControlsOption) {
            this.sheetControlsOption = Output.ofNullable(sheetControlsOption);
            return this;
        }        public DashboardPublishOptionsArgs build() {
            return new DashboardPublishOptionsArgs(adHocFilteringOption, exportToCSVOption, sheetControlsOption);
        }
    }
}
