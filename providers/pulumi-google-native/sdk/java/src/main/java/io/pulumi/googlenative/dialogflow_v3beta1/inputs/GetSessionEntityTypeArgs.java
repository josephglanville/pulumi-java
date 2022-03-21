// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSessionEntityTypeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSessionEntityTypeArgs Empty = new GetSessionEntityTypeArgs();

    @Import(name="agentId", required=true)
      private final String agentId;

    public String getAgentId() {
        return this.agentId;
    }

    @Import(name="entityTypeId", required=true)
      private final String entityTypeId;

    public String getEntityTypeId() {
        return this.entityTypeId;
    }

    @Import(name="environmentId", required=true)
      private final String environmentId;

    public String getEnvironmentId() {
        return this.environmentId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="sessionId", required=true)
      private final String sessionId;

    public String getSessionId() {
        return this.sessionId;
    }

    public GetSessionEntityTypeArgs(
        String agentId,
        String entityTypeId,
        String environmentId,
        String location,
        @Nullable String project,
        String sessionId) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.entityTypeId = Objects.requireNonNull(entityTypeId, "expected parameter 'entityTypeId' to be non-null");
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.sessionId = Objects.requireNonNull(sessionId, "expected parameter 'sessionId' to be non-null");
    }

    private GetSessionEntityTypeArgs() {
        this.agentId = null;
        this.entityTypeId = null;
        this.environmentId = null;
        this.location = null;
        this.project = null;
        this.sessionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSessionEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private String entityTypeId;
        private String environmentId;
        private String location;
        private @Nullable String project;
        private String sessionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSessionEntityTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.entityTypeId = defaults.entityTypeId;
    	      this.environmentId = defaults.environmentId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.sessionId = defaults.sessionId;
        }

        public Builder agentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }
        public Builder entityTypeId(String entityTypeId) {
            this.entityTypeId = Objects.requireNonNull(entityTypeId);
            return this;
        }
        public Builder environmentId(String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder sessionId(String sessionId) {
            this.sessionId = Objects.requireNonNull(sessionId);
            return this;
        }        public GetSessionEntityTypeArgs build() {
            return new GetSessionEntityTypeArgs(agentId, entityTypeId, environmentId, location, project, sessionId);
        }
    }
}
