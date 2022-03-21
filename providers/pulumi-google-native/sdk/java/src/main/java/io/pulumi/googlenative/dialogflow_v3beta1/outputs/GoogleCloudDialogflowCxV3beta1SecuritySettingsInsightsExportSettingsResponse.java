// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse {
    /**
     * If enabled, we will automatically exports conversations to Insights and Insights runs its analyzers.
     * 
     */
    private final Boolean enableInsightsExport;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse(@CustomType.Parameter("enableInsightsExport") Boolean enableInsightsExport) {
        this.enableInsightsExport = enableInsightsExport;
    }

    /**
     * If enabled, we will automatically exports conversations to Insights and Insights runs its analyzers.
     * 
    */
    public Boolean getEnableInsightsExport() {
        return this.enableInsightsExport;
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
