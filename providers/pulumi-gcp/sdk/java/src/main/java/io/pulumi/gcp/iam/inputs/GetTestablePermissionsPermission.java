// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetTestablePermissionsPermission extends io.pulumi.resources.InvokeArgs {

    public static final GetTestablePermissionsPermission Empty = new GetTestablePermissionsPermission();

    /**
     * Whether the corresponding API has been enabled for the resource.
     * 
     */
    @InputImport(name="apiDisabled", required=true)
      private final Boolean apiDisabled;

    public Boolean getApiDisabled() {
        return this.apiDisabled;
    }

    /**
     * The level of support for custom roles. Can be one of `"NOT_SUPPORTED"`, `"SUPPORTED"`, `"TESTING"`. Default is `"SUPPORTED"`
     * 
     */
    @InputImport(name="customSupportLevel", required=true)
      private final String customSupportLevel;

    public String getCustomSupportLevel() {
        return this.customSupportLevel;
    }

    /**
     * Name of the permission.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Release stage of the permission.
     * 
     */
    @InputImport(name="stage", required=true)
      private final String stage;

    public String getStage() {
        return this.stage;
    }

    /**
     * Human readable title of the permission.
     * 
     */
    @InputImport(name="title", required=true)
      private final String title;

    public String getTitle() {
        return this.title;
    }

    public GetTestablePermissionsPermission(
        Boolean apiDisabled,
        String customSupportLevel,
        String name,
        String stage,
        String title) {
        this.apiDisabled = Objects.requireNonNull(apiDisabled, "expected parameter 'apiDisabled' to be non-null");
        this.customSupportLevel = Objects.requireNonNull(customSupportLevel, "expected parameter 'customSupportLevel' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.stage = Objects.requireNonNull(stage, "expected parameter 'stage' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GetTestablePermissionsPermission() {
        this.apiDisabled = null;
        this.customSupportLevel = null;
        this.name = null;
        this.stage = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestablePermissionsPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean apiDisabled;
        private String customSupportLevel;
        private String name;
        private String stage;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestablePermissionsPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiDisabled = defaults.apiDisabled;
    	      this.customSupportLevel = defaults.customSupportLevel;
    	      this.name = defaults.name;
    	      this.stage = defaults.stage;
    	      this.title = defaults.title;
        }

        public Builder setApiDisabled(Boolean apiDisabled) {
            this.apiDisabled = Objects.requireNonNull(apiDisabled);
            return this;
        }

        public Builder setCustomSupportLevel(String customSupportLevel) {
            this.customSupportLevel = Objects.requireNonNull(customSupportLevel);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GetTestablePermissionsPermission build() {
            return new GetTestablePermissionsPermission(apiDisabled, customSupportLevel, name, stage, title);
        }
    }
}
