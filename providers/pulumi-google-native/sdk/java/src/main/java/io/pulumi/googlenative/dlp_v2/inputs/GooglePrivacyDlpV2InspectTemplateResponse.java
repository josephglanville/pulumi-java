// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The inspectTemplate contains a configuration (set of types of sensitive data to be detected) to be used anywhere you otherwise would normally specify InspectConfig. See https://cloud.google.com/dlp/docs/concepts-templates to learn more.
 * 
 */
public final class GooglePrivacyDlpV2InspectTemplateResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InspectTemplateResponse Empty = new GooglePrivacyDlpV2InspectTemplateResponse();

    /**
     * The creation timestamp of an inspectTemplate.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * Short description (max 256 chars).
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Display name (max 256 chars).
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * The core content of the template. Configuration of the scanning process.
     * 
     */
    @Import(name="inspectConfig", required=true)
      private final GooglePrivacyDlpV2InspectConfigResponse inspectConfig;

    public GooglePrivacyDlpV2InspectConfigResponse getInspectConfig() {
        return this.inspectConfig;
    }

    /**
     * The template name. The template will have one of the following formats: `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`;
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The last update timestamp of an inspectTemplate.
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public GooglePrivacyDlpV2InspectTemplateResponse(
        String createTime,
        String description,
        String displayName,
        GooglePrivacyDlpV2InspectConfigResponse inspectConfig,
        String name,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.inspectConfig = Objects.requireNonNull(inspectConfig, "expected parameter 'inspectConfig' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private GooglePrivacyDlpV2InspectTemplateResponse() {
        this.createTime = null;
        this.description = null;
        this.displayName = null;
        this.inspectConfig = null;
        this.name = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private GooglePrivacyDlpV2InspectConfigResponse inspectConfig;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.inspectConfig = defaults.inspectConfig;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder inspectConfig(GooglePrivacyDlpV2InspectConfigResponse inspectConfig) {
            this.inspectConfig = Objects.requireNonNull(inspectConfig);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GooglePrivacyDlpV2InspectTemplateResponse build() {
            return new GooglePrivacyDlpV2InspectTemplateResponse(createTime, description, displayName, inspectConfig, name, updateTime);
        }
    }
}
