// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabricksResponseProperties {
    /**
     * Databricks access token
     * 
     */
    private final @Nullable String databricksAccessToken;
    /**
     * Workspace Url
     * 
     */
    private final @Nullable String workspaceUrl;

    @CustomType.Constructor
    private DatabricksResponseProperties(
        @CustomType.Parameter("databricksAccessToken") @Nullable String databricksAccessToken,
        @CustomType.Parameter("workspaceUrl") @Nullable String workspaceUrl) {
        this.databricksAccessToken = databricksAccessToken;
        this.workspaceUrl = workspaceUrl;
    }

    /**
     * Databricks access token
     * 
    */
    public Optional<String> getDatabricksAccessToken() {
        return Optional.ofNullable(this.databricksAccessToken);
    }
    /**
     * Workspace Url
     * 
    */
    public Optional<String> getWorkspaceUrl() {
        return Optional.ofNullable(this.workspaceUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabricksResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databricksAccessToken;
        private @Nullable String workspaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabricksResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databricksAccessToken = defaults.databricksAccessToken;
    	      this.workspaceUrl = defaults.workspaceUrl;
        }

        public Builder databricksAccessToken(@Nullable String databricksAccessToken) {
            this.databricksAccessToken = databricksAccessToken;
            return this;
        }
        public Builder workspaceUrl(@Nullable String workspaceUrl) {
            this.workspaceUrl = workspaceUrl;
            return this;
        }        public DatabricksResponseProperties build() {
            return new DatabricksResponseProperties(databricksAccessToken, workspaceUrl);
        }
    }
}
