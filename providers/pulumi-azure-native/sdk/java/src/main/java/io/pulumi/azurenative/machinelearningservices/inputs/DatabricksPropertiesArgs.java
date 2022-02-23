// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabricksPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabricksPropertiesArgs Empty = new DatabricksPropertiesArgs();

    /**
     * Databricks access token
     * 
     */
    @InputImport(name="databricksAccessToken")
      private final @Nullable Input<String> databricksAccessToken;

    public Input<String> getDatabricksAccessToken() {
        return this.databricksAccessToken == null ? Input.empty() : this.databricksAccessToken;
    }

    /**
     * Workspace Url
     * 
     */
    @InputImport(name="workspaceUrl")
      private final @Nullable Input<String> workspaceUrl;

    public Input<String> getWorkspaceUrl() {
        return this.workspaceUrl == null ? Input.empty() : this.workspaceUrl;
    }

    public DatabricksPropertiesArgs(
        @Nullable Input<String> databricksAccessToken,
        @Nullable Input<String> workspaceUrl) {
        this.databricksAccessToken = databricksAccessToken;
        this.workspaceUrl = workspaceUrl;
    }

    private DatabricksPropertiesArgs() {
        this.databricksAccessToken = Input.empty();
        this.workspaceUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabricksPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> databricksAccessToken;
        private @Nullable Input<String> workspaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabricksPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databricksAccessToken = defaults.databricksAccessToken;
    	      this.workspaceUrl = defaults.workspaceUrl;
        }

        public Builder setDatabricksAccessToken(@Nullable Input<String> databricksAccessToken) {
            this.databricksAccessToken = databricksAccessToken;
            return this;
        }

        public Builder setDatabricksAccessToken(@Nullable String databricksAccessToken) {
            this.databricksAccessToken = Input.ofNullable(databricksAccessToken);
            return this;
        }

        public Builder setWorkspaceUrl(@Nullable Input<String> workspaceUrl) {
            this.workspaceUrl = workspaceUrl;
            return this;
        }

        public Builder setWorkspaceUrl(@Nullable String workspaceUrl) {
            this.workspaceUrl = Input.ofNullable(workspaceUrl);
            return this;
        }
        public DatabricksPropertiesArgs build() {
            return new DatabricksPropertiesArgs(databricksAccessToken, workspaceUrl);
        }
    }
}
