// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceAccountArgs Empty = new GetServiceAccountArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="serviceAccountId", required=true)
      private final String serviceAccountId;

    public String getServiceAccountId() {
        return this.serviceAccountId;
    }

    public GetServiceAccountArgs(
        @Nullable String project,
        String serviceAccountId) {
        this.project = project;
        this.serviceAccountId = Objects.requireNonNull(serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
    }

    private GetServiceAccountArgs() {
        this.project = null;
        this.serviceAccountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String serviceAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.serviceAccountId = defaults.serviceAccountId;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder serviceAccountId(String serviceAccountId) {
            this.serviceAccountId = Objects.requireNonNull(serviceAccountId);
            return this;
        }        public GetServiceAccountArgs build() {
            return new GetServiceAccountArgs(project, serviceAccountId);
        }
    }
}
