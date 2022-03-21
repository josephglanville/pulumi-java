// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionHealthCheckServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionHealthCheckServiceArgs Empty = new GetRegionHealthCheckServiceArgs();

    @Import(name="healthCheckService", required=true)
      private final String healthCheckService;

    public String getHealthCheckService() {
        return this.healthCheckService;
    }

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

    public GetRegionHealthCheckServiceArgs(
        String healthCheckService,
        @Nullable String project,
        String region) {
        this.healthCheckService = Objects.requireNonNull(healthCheckService, "expected parameter 'healthCheckService' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetRegionHealthCheckServiceArgs() {
        this.healthCheckService = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionHealthCheckServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String healthCheckService;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionHealthCheckServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckService = defaults.healthCheckService;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder healthCheckService(String healthCheckService) {
            this.healthCheckService = Objects.requireNonNull(healthCheckService);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetRegionHealthCheckServiceArgs build() {
            return new GetRegionHealthCheckServiceArgs(healthCheckService, project, region);
        }
    }
}
