// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ConnectionMonitorWorkspaceSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionMonitorOutputResponse {
    /**
     * Connection monitor output destination type. Currently, only "Workspace" is supported.
     * 
     */
    private final @Nullable String type;
    /**
     * Describes the settings for producing output into a log analytics workspace.
     * 
     */
    private final @Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings;

    @CustomType.Constructor
    private ConnectionMonitorOutputResponse(
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("workspaceSettings") @Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings) {
        this.type = type;
        this.workspaceSettings = workspaceSettings;
    }

    /**
     * Connection monitor output destination type. Currently, only "Workspace" is supported.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Describes the settings for producing output into a log analytics workspace.
     * 
    */
    public Optional<ConnectionMonitorWorkspaceSettingsResponse> getWorkspaceSettings() {
        return Optional.ofNullable(this.workspaceSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.workspaceSettings = defaults.workspaceSettings;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder workspaceSettings(@Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings) {
            this.workspaceSettings = workspaceSettings;
            return this;
        }        public ConnectionMonitorOutputResponse build() {
            return new ConnectionMonitorOutputResponse(type, workspaceSettings);
        }
    }
}
