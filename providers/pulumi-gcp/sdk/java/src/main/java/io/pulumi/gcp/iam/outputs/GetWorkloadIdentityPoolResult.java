// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkloadIdentityPoolResult {
    private final String description;
    private final Boolean disabled;
    private final String displayName;
    private final String id;
    private final String name;
    private final @Nullable String project;
    private final String state;
    private final String workloadIdentityPoolId;

    @OutputCustomType.Constructor({"description","disabled","displayName","id","name","project","state","workloadIdentityPoolId"})
    private GetWorkloadIdentityPoolResult(
        String description,
        Boolean disabled,
        String displayName,
        String id,
        String name,
        @Nullable String project,
        String state,
        String workloadIdentityPoolId) {
        this.description = Objects.requireNonNull(description);
        this.disabled = Objects.requireNonNull(disabled);
        this.displayName = Objects.requireNonNull(displayName);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.project = project;
        this.state = Objects.requireNonNull(state);
        this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId);
    }

    public String getDescription() {
        return this.description;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getState() {
        return this.state;
    }
    public String getWorkloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadIdentityPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private Boolean disabled;
        private String displayName;
        private String id;
        private String name;
        private @Nullable String project;
        private String state;
        private String workloadIdentityPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadIdentityPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
    	      this.workloadIdentityPoolId = defaults.workloadIdentityPoolId;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setWorkloadIdentityPoolId(String workloadIdentityPoolId) {
            this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId);
            return this;
        }

        public GetWorkloadIdentityPoolResult build() {
            return new GetWorkloadIdentityPoolResult(description, disabled, displayName, id, name, project, state, workloadIdentityPoolId);
        }
    }
}