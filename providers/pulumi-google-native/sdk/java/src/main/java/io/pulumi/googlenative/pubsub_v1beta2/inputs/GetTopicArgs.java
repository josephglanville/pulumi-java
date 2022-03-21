// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTopicArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTopicArgs Empty = new GetTopicArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="topicId", required=true)
      private final String topicId;

    public String getTopicId() {
        return this.topicId;
    }

    public GetTopicArgs(
        @Nullable String project,
        String topicId) {
        this.project = project;
        this.topicId = Objects.requireNonNull(topicId, "expected parameter 'topicId' to be non-null");
    }

    private GetTopicArgs() {
        this.project = null;
        this.topicId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String topicId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.topicId = defaults.topicId;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder topicId(String topicId) {
            this.topicId = Objects.requireNonNull(topicId);
            return this;
        }        public GetTopicArgs build() {
            return new GetTopicArgs(project, topicId);
        }
    }
}
