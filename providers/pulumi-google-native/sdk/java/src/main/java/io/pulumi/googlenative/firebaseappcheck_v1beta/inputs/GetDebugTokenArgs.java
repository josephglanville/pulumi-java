// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseappcheck_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDebugTokenArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDebugTokenArgs Empty = new GetDebugTokenArgs();

    @Import(name="appId", required=true)
      private final String appId;

    public String getAppId() {
        return this.appId;
    }

    @Import(name="debugTokenId", required=true)
      private final String debugTokenId;

    public String getDebugTokenId() {
        return this.debugTokenId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDebugTokenArgs(
        String appId,
        String debugTokenId,
        @Nullable String project) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.debugTokenId = Objects.requireNonNull(debugTokenId, "expected parameter 'debugTokenId' to be non-null");
        this.project = project;
    }

    private GetDebugTokenArgs() {
        this.appId = null;
        this.debugTokenId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDebugTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String debugTokenId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDebugTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.debugTokenId = defaults.debugTokenId;
    	      this.project = defaults.project;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder debugTokenId(String debugTokenId) {
            this.debugTokenId = Objects.requireNonNull(debugTokenId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetDebugTokenArgs build() {
            return new GetDebugTokenArgs(appId, debugTokenId, project);
        }
    }
}
