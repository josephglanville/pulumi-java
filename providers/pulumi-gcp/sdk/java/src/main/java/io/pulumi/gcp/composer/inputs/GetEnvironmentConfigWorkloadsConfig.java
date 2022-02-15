// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.composer.inputs.GetEnvironmentConfigWorkloadsConfigScheduler;
import io.pulumi.gcp.composer.inputs.GetEnvironmentConfigWorkloadsConfigWebServer;
import io.pulumi.gcp.composer.inputs.GetEnvironmentConfigWorkloadsConfigWorker;
import java.util.List;
import java.util.Objects;


public final class GetEnvironmentConfigWorkloadsConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigWorkloadsConfig Empty = new GetEnvironmentConfigWorkloadsConfig();

    @InputImport(name="schedulers", required=true)
    private final List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers;

    public List<GetEnvironmentConfigWorkloadsConfigScheduler> getSchedulers() {
        return this.schedulers;
    }

    @InputImport(name="webServers", required=true)
    private final List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers;

    public List<GetEnvironmentConfigWorkloadsConfigWebServer> getWebServers() {
        return this.webServers;
    }

    @InputImport(name="workers", required=true)
    private final List<GetEnvironmentConfigWorkloadsConfigWorker> workers;

    public List<GetEnvironmentConfigWorkloadsConfigWorker> getWorkers() {
        return this.workers;
    }

    public GetEnvironmentConfigWorkloadsConfig(
        List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers,
        List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers,
        List<GetEnvironmentConfigWorkloadsConfigWorker> workers) {
        this.schedulers = Objects.requireNonNull(schedulers, "expected parameter 'schedulers' to be non-null");
        this.webServers = Objects.requireNonNull(webServers, "expected parameter 'webServers' to be non-null");
        this.workers = Objects.requireNonNull(workers, "expected parameter 'workers' to be non-null");
    }

    private GetEnvironmentConfigWorkloadsConfig() {
        this.schedulers = List.of();
        this.webServers = List.of();
        this.workers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers;
        private List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers;
        private List<GetEnvironmentConfigWorkloadsConfigWorker> workers;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWorkloadsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedulers = defaults.schedulers;
    	      this.webServers = defaults.webServers;
    	      this.workers = defaults.workers;
        }

        public Builder setSchedulers(List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers) {
            this.schedulers = Objects.requireNonNull(schedulers);
            return this;
        }

        public Builder setWebServers(List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers) {
            this.webServers = Objects.requireNonNull(webServers);
            return this;
        }

        public Builder setWorkers(List<GetEnvironmentConfigWorkloadsConfigWorker> workers) {
            this.workers = Objects.requireNonNull(workers);
            return this;
        }

        public GetEnvironmentConfigWorkloadsConfig build() {
            return new GetEnvironmentConfigWorkloadsConfig(schedulers, webServers, workers);
        }
    }
}