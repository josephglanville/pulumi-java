// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQueueIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetQueueIamPolicyArgs Empty = new GetQueueIamPolicyArgs();

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

    @Import(name="queueId", required=true)
      private final String queueId;

    public String getQueueId() {
        return this.queueId;
    }

    public GetQueueIamPolicyArgs(
        String location,
        @Nullable String project,
        String queueId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.queueId = Objects.requireNonNull(queueId, "expected parameter 'queueId' to be non-null");
    }

    private GetQueueIamPolicyArgs() {
        this.location = null;
        this.project = null;
        this.queueId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String queueId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.queueId = defaults.queueId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder queueId(String queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }        public GetQueueIamPolicyArgs build() {
            return new GetQueueIamPolicyArgs(location, project, queueId);
        }
    }
}
