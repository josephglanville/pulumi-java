// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectConfigResponse;
import java.lang.String;
import java.util.Objects;


public final class GooglePrivacyDlpV2InspectTemplateResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InspectTemplateResponse Empty = new GooglePrivacyDlpV2InspectTemplateResponse();

    @InputImport(name="createTime", required=true)
    private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="inspectConfig", required=true)
    private final GooglePrivacyDlpV2InspectConfigResponse inspectConfig;

    public GooglePrivacyDlpV2InspectConfigResponse getInspectConfig() {
        return this.inspectConfig;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="updateTime", required=true)
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

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setInspectConfig(GooglePrivacyDlpV2InspectConfigResponse inspectConfig) {
            this.inspectConfig = Objects.requireNonNull(inspectConfig);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GooglePrivacyDlpV2InspectTemplateResponse build() {
            return new GooglePrivacyDlpV2InspectTemplateResponse(createTime, description, displayName, inspectConfig, name, updateTime);
        }
    }
}