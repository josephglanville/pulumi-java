// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.ManagementGroupLogSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagementGroupDiagnosticSettingResult {
    private final @Nullable String eventHubAuthorizationRuleId;
    private final @Nullable String eventHubName;
    private final String id;
    private final @Nullable String location;
    private final @Nullable List<ManagementGroupLogSettingsResponse> logs;
    private final String name;
    private final @Nullable String serviceBusRuleId;
    private final @Nullable String storageAccountId;
    private final String type;
    private final @Nullable String workspaceId;

    @OutputCustomType.Constructor({"eventHubAuthorizationRuleId","eventHubName","id","location","logs","name","serviceBusRuleId","storageAccountId","type","workspaceId"})
    private GetManagementGroupDiagnosticSettingResult(
        @Nullable String eventHubAuthorizationRuleId,
        @Nullable String eventHubName,
        String id,
        @Nullable String location,
        @Nullable List<ManagementGroupLogSettingsResponse> logs,
        String name,
        @Nullable String serviceBusRuleId,
        @Nullable String storageAccountId,
        String type,
        @Nullable String workspaceId) {
        this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
        this.eventHubName = eventHubName;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.logs = logs;
        this.name = Objects.requireNonNull(name);
        this.serviceBusRuleId = serviceBusRuleId;
        this.storageAccountId = storageAccountId;
        this.type = Objects.requireNonNull(type);
        this.workspaceId = workspaceId;
    }

    public Optional<String> getEventHubAuthorizationRuleId() {
        return Optional.ofNullable(this.eventHubAuthorizationRuleId);
    }
    public Optional<String> getEventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public List<ManagementGroupLogSettingsResponse> getLogs() {
        return this.logs == null ? List.of() : this.logs;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getServiceBusRuleId() {
        return Optional.ofNullable(this.serviceBusRuleId);
    }
    public Optional<String> getStorageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getWorkspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagementGroupDiagnosticSettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventHubAuthorizationRuleId;
        private @Nullable String eventHubName;
        private String id;
        private @Nullable String location;
        private @Nullable List<ManagementGroupLogSettingsResponse> logs;
        private String name;
        private @Nullable String serviceBusRuleId;
        private @Nullable String storageAccountId;
        private String type;
        private @Nullable String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementGroupDiagnosticSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubAuthorizationRuleId = defaults.eventHubAuthorizationRuleId;
    	      this.eventHubName = defaults.eventHubName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.logs = defaults.logs;
    	      this.name = defaults.name;
    	      this.serviceBusRuleId = defaults.serviceBusRuleId;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.type = defaults.type;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setEventHubAuthorizationRuleId(@Nullable String eventHubAuthorizationRuleId) {
            this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
            return this;
        }

        public Builder setEventHubName(@Nullable String eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setLogs(@Nullable List<ManagementGroupLogSettingsResponse> logs) {
            this.logs = logs;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setServiceBusRuleId(@Nullable String serviceBusRuleId) {
            this.serviceBusRuleId = serviceBusRuleId;
            return this;
        }

        public Builder setStorageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWorkspaceId(@Nullable String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetManagementGroupDiagnosticSettingResult build() {
            return new GetManagementGroupDiagnosticSettingResult(eventHubAuthorizationRuleId, eventHubName, id, location, logs, name, serviceBusRuleId, storageAccountId, type, workspaceId);
        }
    }
}
