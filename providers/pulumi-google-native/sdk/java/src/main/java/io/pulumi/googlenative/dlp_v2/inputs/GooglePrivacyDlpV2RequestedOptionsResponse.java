// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectJobConfigResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectTemplateResponse;
import java.util.Objects;


/**
 * Snapshot of the inspection configuration.
 * 
 */
public final class GooglePrivacyDlpV2RequestedOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2RequestedOptionsResponse Empty = new GooglePrivacyDlpV2RequestedOptionsResponse();

    /**
     * Inspect config.
     * 
     */
    @Import(name="jobConfig", required=true)
      private final GooglePrivacyDlpV2InspectJobConfigResponse jobConfig;

    public GooglePrivacyDlpV2InspectJobConfigResponse getJobConfig() {
        return this.jobConfig;
    }

    /**
     * If run with an InspectTemplate, a snapshot of its state at the time of this run.
     * 
     */
    @Import(name="snapshotInspectTemplate", required=true)
      private final GooglePrivacyDlpV2InspectTemplateResponse snapshotInspectTemplate;

    public GooglePrivacyDlpV2InspectTemplateResponse getSnapshotInspectTemplate() {
        return this.snapshotInspectTemplate;
    }

    public GooglePrivacyDlpV2RequestedOptionsResponse(
        GooglePrivacyDlpV2InspectJobConfigResponse jobConfig,
        GooglePrivacyDlpV2InspectTemplateResponse snapshotInspectTemplate) {
        this.jobConfig = Objects.requireNonNull(jobConfig, "expected parameter 'jobConfig' to be non-null");
        this.snapshotInspectTemplate = Objects.requireNonNull(snapshotInspectTemplate, "expected parameter 'snapshotInspectTemplate' to be non-null");
    }

    private GooglePrivacyDlpV2RequestedOptionsResponse() {
        this.jobConfig = null;
        this.snapshotInspectTemplate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RequestedOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InspectJobConfigResponse jobConfig;
        private GooglePrivacyDlpV2InspectTemplateResponse snapshotInspectTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RequestedOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobConfig = defaults.jobConfig;
    	      this.snapshotInspectTemplate = defaults.snapshotInspectTemplate;
        }

        public Builder jobConfig(GooglePrivacyDlpV2InspectJobConfigResponse jobConfig) {
            this.jobConfig = Objects.requireNonNull(jobConfig);
            return this;
        }
        public Builder snapshotInspectTemplate(GooglePrivacyDlpV2InspectTemplateResponse snapshotInspectTemplate) {
            this.snapshotInspectTemplate = Objects.requireNonNull(snapshotInspectTemplate);
            return this;
        }        public GooglePrivacyDlpV2RequestedOptionsResponse build() {
            return new GooglePrivacyDlpV2RequestedOptionsResponse(jobConfig, snapshotInspectTemplate);
        }
    }
}
