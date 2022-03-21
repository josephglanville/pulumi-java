// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Settings for exporting conversations to [Insights](https://cloud.google.com/contact-center/insights/docs).
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse Empty = new GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse();

    /**
     * If enabled, we will automatically exports conversations to Insights and Insights runs its analyzers.
     * 
     */
    @Import(name="enableInsightsExport", required=true)
      private final Boolean enableInsightsExport;

    public Boolean getEnableInsightsExport() {
        return this.enableInsightsExport;
    }

    public GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse(Boolean enableInsightsExport) {
        this.enableInsightsExport = Objects.requireNonNull(enableInsightsExport, "expected parameter 'enableInsightsExport' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse() {
        this.enableInsightsExport = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableInsightsExport;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInsightsExport = defaults.enableInsightsExport;
        }

        public Builder enableInsightsExport(Boolean enableInsightsExport) {
            this.enableInsightsExport = Objects.requireNonNull(enableInsightsExport);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse(enableInsightsExport);
        }
    }
}
