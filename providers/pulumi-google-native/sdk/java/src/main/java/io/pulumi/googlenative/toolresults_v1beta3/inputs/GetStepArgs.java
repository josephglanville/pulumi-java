// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStepArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStepArgs Empty = new GetStepArgs();

    @Import(name="executionId", required=true)
      private final String executionId;

    public String getExecutionId() {
        return this.executionId;
    }

    @Import(name="historyId", required=true)
      private final String historyId;

    public String getHistoryId() {
        return this.historyId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="stepId", required=true)
      private final String stepId;

    public String getStepId() {
        return this.stepId;
    }

    public GetStepArgs(
        String executionId,
        String historyId,
        @Nullable String project,
        String stepId) {
        this.executionId = Objects.requireNonNull(executionId, "expected parameter 'executionId' to be non-null");
        this.historyId = Objects.requireNonNull(historyId, "expected parameter 'historyId' to be non-null");
        this.project = project;
        this.stepId = Objects.requireNonNull(stepId, "expected parameter 'stepId' to be non-null");
    }

    private GetStepArgs() {
        this.executionId = null;
        this.historyId = null;
        this.project = null;
        this.stepId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executionId;
        private String historyId;
        private @Nullable String project;
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionId = defaults.executionId;
    	      this.historyId = defaults.historyId;
    	      this.project = defaults.project;
    	      this.stepId = defaults.stepId;
        }

        public Builder executionId(String executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }
        public Builder historyId(String historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder stepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }        public GetStepArgs build() {
            return new GetStepArgs(executionId, historyId, project, stepId);
        }
    }
}
