// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogAnalyticsDestinationResponse {
    private final @Nullable String name;
    private final String workspaceId;
    private final @Nullable String workspaceResourceId;

    @OutputCustomType.Constructor({"name","workspaceId","workspaceResourceId"})
    private LogAnalyticsDestinationResponse(
        @Nullable String name,
        String workspaceId,
        @Nullable String workspaceResourceId) {
        this.name = name;
        this.workspaceId = Objects.requireNonNull(workspaceId);
        this.workspaceResourceId = workspaceResourceId;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }
    public Optional<String> getWorkspaceResourceId() {
        return Optional.ofNullable(this.workspaceResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private String workspaceId;
        private @Nullable String workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder setWorkspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }

        public LogAnalyticsDestinationResponse build() {
            return new LogAnalyticsDestinationResponse(name, workspaceId, workspaceResourceId);
        }
    }
}
