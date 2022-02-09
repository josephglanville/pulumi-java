// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ConnectionMonitorWorkspaceSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorOutputResponse {
    private final @Nullable String type;
    private final @Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings;

    @OutputCustomType.Constructor({"type","workspaceSettings"})
    private ConnectionMonitorOutputResponse(
        @Nullable String type,
        @Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings) {
        this.type = type;
        this.workspaceSettings = workspaceSettings;
    }

    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
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

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setWorkspaceSettings(@Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings) {
            this.workspaceSettings = workspaceSettings;
            return this;
        }

        public ConnectionMonitorOutputResponse build() {
            return new ConnectionMonitorOutputResponse(type, workspaceSettings);
        }
    }
}
