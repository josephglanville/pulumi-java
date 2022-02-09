// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogAnalyticsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogAnalyticsResponse Empty = new LogAnalyticsResponse();

    @InputImport(name="logType")
    private final @Nullable String logType;

    public Optional<String> getLogType() {
        return this.logType == null ? Optional.empty() : Optional.ofNullable(this.logType);
    }

    @InputImport(name="metadata")
    private final @Nullable Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }

    @InputImport(name="workspaceId", required=true)
    private final String workspaceId;

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    @InputImport(name="workspaceKey", required=true)
    private final String workspaceKey;

    public String getWorkspaceKey() {
        return this.workspaceKey;
    }

    @InputImport(name="workspaceResourceId")
    private final @Nullable Map<String,String> workspaceResourceId;

    public Map<String,String> getWorkspaceResourceId() {
        return this.workspaceResourceId == null ? Map.of() : this.workspaceResourceId;
    }

    public LogAnalyticsResponse(
        @Nullable String logType,
        @Nullable Map<String,String> metadata,
        String workspaceId,
        String workspaceKey,
        @Nullable Map<String,String> workspaceResourceId) {
        this.logType = logType;
        this.metadata = metadata;
        this.workspaceId = Objects.requireNonNull(workspaceId, "expected parameter 'workspaceId' to be non-null");
        this.workspaceKey = Objects.requireNonNull(workspaceKey, "expected parameter 'workspaceKey' to be non-null");
        this.workspaceResourceId = workspaceResourceId;
    }

    private LogAnalyticsResponse() {
        this.logType = null;
        this.metadata = Map.of();
        this.workspaceId = null;
        this.workspaceKey = null;
        this.workspaceResourceId = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logType;
        private @Nullable Map<String,String> metadata;
        private String workspaceId;
        private String workspaceKey;
        private @Nullable Map<String,String> workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logType = defaults.logType;
    	      this.metadata = defaults.metadata;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceKey = defaults.workspaceKey;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder setLogType(@Nullable String logType) {
            this.logType = logType;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder setWorkspaceKey(String workspaceKey) {
            this.workspaceKey = Objects.requireNonNull(workspaceKey);
            return this;
        }

        public Builder setWorkspaceResourceId(@Nullable Map<String,String> workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }

        public LogAnalyticsResponse build() {
            return new LogAnalyticsResponse(logType, metadata, workspaceId, workspaceKey, workspaceResourceId);
        }
    }
}
