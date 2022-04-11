// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigSchedulerGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigWebServerGetArgs;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigWorkloadsConfigWorkerGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentConfigWorkloadsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigWorkloadsConfigGetArgs Empty = new EnvironmentConfigWorkloadsConfigGetArgs();

    @Import(name="scheduler")
      private final @Nullable Output<EnvironmentConfigWorkloadsConfigSchedulerGetArgs> scheduler;

    public Output<EnvironmentConfigWorkloadsConfigSchedulerGetArgs> getScheduler() {
        return this.scheduler == null ? Codegen.empty() : this.scheduler;
    }

    @Import(name="webServer")
      private final @Nullable Output<EnvironmentConfigWorkloadsConfigWebServerGetArgs> webServer;

    public Output<EnvironmentConfigWorkloadsConfigWebServerGetArgs> getWebServer() {
        return this.webServer == null ? Codegen.empty() : this.webServer;
    }

    @Import(name="worker")
      private final @Nullable Output<EnvironmentConfigWorkloadsConfigWorkerGetArgs> worker;

    public Output<EnvironmentConfigWorkloadsConfigWorkerGetArgs> getWorker() {
        return this.worker == null ? Codegen.empty() : this.worker;
    }

    public EnvironmentConfigWorkloadsConfigGetArgs(
        @Nullable Output<EnvironmentConfigWorkloadsConfigSchedulerGetArgs> scheduler,
        @Nullable Output<EnvironmentConfigWorkloadsConfigWebServerGetArgs> webServer,
        @Nullable Output<EnvironmentConfigWorkloadsConfigWorkerGetArgs> worker) {
        this.scheduler = scheduler;
        this.webServer = webServer;
        this.worker = worker;
    }

    private EnvironmentConfigWorkloadsConfigGetArgs() {
        this.scheduler = Codegen.empty();
        this.webServer = Codegen.empty();
        this.worker = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigWorkloadsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EnvironmentConfigWorkloadsConfigSchedulerGetArgs> scheduler;
        private @Nullable Output<EnvironmentConfigWorkloadsConfigWebServerGetArgs> webServer;
        private @Nullable Output<EnvironmentConfigWorkloadsConfigWorkerGetArgs> worker;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigWorkloadsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduler = defaults.scheduler;
    	      this.webServer = defaults.webServer;
    	      this.worker = defaults.worker;
        }

        public Builder scheduler(@Nullable Output<EnvironmentConfigWorkloadsConfigSchedulerGetArgs> scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public Builder scheduler(@Nullable EnvironmentConfigWorkloadsConfigSchedulerGetArgs scheduler) {
            this.scheduler = Codegen.ofNullable(scheduler);
            return this;
        }
        public Builder webServer(@Nullable Output<EnvironmentConfigWorkloadsConfigWebServerGetArgs> webServer) {
            this.webServer = webServer;
            return this;
        }
        public Builder webServer(@Nullable EnvironmentConfigWorkloadsConfigWebServerGetArgs webServer) {
            this.webServer = Codegen.ofNullable(webServer);
            return this;
        }
        public Builder worker(@Nullable Output<EnvironmentConfigWorkloadsConfigWorkerGetArgs> worker) {
            this.worker = worker;
            return this;
        }
        public Builder worker(@Nullable EnvironmentConfigWorkloadsConfigWorkerGetArgs worker) {
            this.worker = Codegen.ofNullable(worker);
            return this;
        }        public EnvironmentConfigWorkloadsConfigGetArgs build() {
            return new EnvironmentConfigWorkloadsConfigGetArgs(scheduler, webServer, worker);
        }
    }
}
