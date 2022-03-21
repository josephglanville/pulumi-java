// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTestablePermissionsPermission {
    /**
     * Whether the corresponding API has been enabled for the resource.
     * 
     */
    private final Boolean apiDisabled;
    /**
     * The level of support for custom roles. Can be one of `"NOT_SUPPORTED"`, `"SUPPORTED"`, `"TESTING"`. Default is `"SUPPORTED"`
     * 
     */
    private final String customSupportLevel;
    /**
     * Name of the permission.
     * 
     */
    private final String name;
    /**
     * Release stage of the permission.
     * 
     */
    private final String stage;
    /**
     * Human readable title of the permission.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GetTestablePermissionsPermission(
        @CustomType.Parameter("apiDisabled") Boolean apiDisabled,
        @CustomType.Parameter("customSupportLevel") String customSupportLevel,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("stage") String stage,
        @CustomType.Parameter("title") String title) {
        this.apiDisabled = apiDisabled;
        this.customSupportLevel = customSupportLevel;
        this.name = name;
        this.stage = stage;
        this.title = title;
    }

    /**
     * Whether the corresponding API has been enabled for the resource.
     * 
    */
    public Boolean getApiDisabled() {
        return this.apiDisabled;
    }
    /**
     * The level of support for custom roles. Can be one of `"NOT_SUPPORTED"`, `"SUPPORTED"`, `"TESTING"`. Default is `"SUPPORTED"`
     * 
    */
    public String getCustomSupportLevel() {
        return this.customSupportLevel;
    }
    /**
     * Name of the permission.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Release stage of the permission.
     * 
    */
    public String getStage() {
        return this.stage;
    }
    /**
     * Human readable title of the permission.
     * 
    */
    public String getTitle() {
        return this.title;
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

        public Builder apiDisabled(Boolean apiDisabled) {
            this.apiDisabled = Objects.requireNonNull(apiDisabled);
            return this;
        }
        public Builder customSupportLevel(String customSupportLevel) {
            this.customSupportLevel = Objects.requireNonNull(customSupportLevel);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder stage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GetTestablePermissionsPermission build() {
            return new GetTestablePermissionsPermission(apiDisabled, customSupportLevel, name, stage, title);
        }
    }
}
