// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs Empty = new GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs();

    @InputImport(name="enableInsightsExport")
    private final @Nullable Input<Boolean> enableInsightsExport;

    public Input<Boolean> getEnableInsightsExport() {
        return this.enableInsightsExport == null ? Input.empty() : this.enableInsightsExport;
    }

    public GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs(@Nullable Input<Boolean> enableInsightsExport) {
        this.enableInsightsExport = enableInsightsExport;
    }

    private GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs() {
        this.enableInsightsExport = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableInsightsExport;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInsightsExport = defaults.enableInsightsExport;
        }

        public Builder setEnableInsightsExport(@Nullable Input<Boolean> enableInsightsExport) {
            this.enableInsightsExport = enableInsightsExport;
            return this;
        }

        public Builder setEnableInsightsExport(@Nullable Boolean enableInsightsExport) {
            this.enableInsightsExport = Input.ofNullable(enableInsightsExport);
            return this;
        }

        public GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs build() {
            return new GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs(enableInsightsExport);
        }
    }
}