// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabricksResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final DatabricksResponseProperties Empty = new DatabricksResponseProperties();

    @InputImport(name="databricksAccessToken")
    private final @Nullable String databricksAccessToken;

    public Optional<String> getDatabricksAccessToken() {
        return this.databricksAccessToken == null ? Optional.empty() : Optional.ofNullable(this.databricksAccessToken);
    }

    @InputImport(name="workspaceUrl")
    private final @Nullable String workspaceUrl;

    public Optional<String> getWorkspaceUrl() {
        return this.workspaceUrl == null ? Optional.empty() : Optional.ofNullable(this.workspaceUrl);
    }

    public DatabricksResponseProperties(
        @Nullable String databricksAccessToken,
        @Nullable String workspaceUrl) {
        this.databricksAccessToken = databricksAccessToken;
        this.workspaceUrl = workspaceUrl;
    }

    private DatabricksResponseProperties() {
        this.databricksAccessToken = null;
        this.workspaceUrl = null;
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

        public Builder setDatabricksAccessToken(@Nullable String databricksAccessToken) {
            this.databricksAccessToken = databricksAccessToken;
            return this;
        }

        public Builder setWorkspaceUrl(@Nullable String workspaceUrl) {
            this.workspaceUrl = workspaceUrl;
            return this;
        }

        public DatabricksResponseProperties build() {
            return new DatabricksResponseProperties(databricksAccessToken, workspaceUrl);
        }
    }
}