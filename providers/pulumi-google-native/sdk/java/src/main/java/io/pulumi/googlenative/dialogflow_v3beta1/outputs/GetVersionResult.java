// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1NluSettingsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVersionResult {
    /**
     * Create time of the version.
     * 
     */
    private final String createTime;
    /**
     * The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    private final String description;
    /**
     * The human-readable name of the version. Limit of 64 characters.
     * 
     */
    private final String displayName;
    /**
     * Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
     * 
     */
    private final String name;
    /**
     * The NLU settings of the flow at version creation.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1NluSettingsResponse nluSettings;
    /**
     * The state of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetVersionResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nluSettings") GoogleCloudDialogflowCxV3beta1NluSettingsResponse nluSettings,
        @CustomType.Parameter("state") String state) {
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.nluSettings = nluSettings;
        this.state = state;
    }

    /**
     * Create time of the version.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the version. Limit of 64 characters.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The NLU settings of the flow at version creation.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1NluSettingsResponse getNluSettings() {
        return this.nluSettings;
    }
    /**
     * The state of this version. This field is read-only and cannot be set by create and update methods.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private String name;
        private GoogleCloudDialogflowCxV3beta1NluSettingsResponse nluSettings;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.nluSettings = defaults.nluSettings;
    	      this.state = defaults.state;
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nluSettings(GoogleCloudDialogflowCxV3beta1NluSettingsResponse nluSettings) {
            this.nluSettings = Objects.requireNonNull(nluSettings);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetVersionResult build() {
            return new GetVersionResult(createTime, description, displayName, name, nluSettings, state);
        }
    }
}
