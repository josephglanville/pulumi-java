// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTargetPoolArgs Empty = new GetTargetPoolArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    @Import(name="targetPool", required=true)
      private final String targetPool;

    public String getTargetPool() {
        return this.targetPool;
    }

    public GetTargetPoolArgs(
        @Nullable String project,
        String region,
        String targetPool) {
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.targetPool = Objects.requireNonNull(targetPool, "expected parameter 'targetPool' to be non-null");
    }

    private GetTargetPoolArgs() {
        this.project = null;
        this.region = null;
        this.targetPool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String region;
        private String targetPool;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.targetPool = defaults.targetPool;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder targetPool(String targetPool) {
            this.targetPool = Objects.requireNonNull(targetPool);
            return this;
        }        public GetTargetPoolArgs build() {
            return new GetTargetPoolArgs(project, region, targetPool);
        }
    }
}
