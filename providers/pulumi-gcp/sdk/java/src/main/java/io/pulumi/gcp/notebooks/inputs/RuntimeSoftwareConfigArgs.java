// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeSoftwareConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeSoftwareConfigArgs Empty = new RuntimeSoftwareConfigArgs();

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    @Import(name="customGpuDriverPath")
      private final @Nullable Output<String> customGpuDriverPath;

    public Output<String> getCustomGpuDriverPath() {
        return this.customGpuDriverPath == null ? Codegen.empty() : this.customGpuDriverPath;
    }

    /**
     * Verifies core internal services are running. Default: True.
     * 
     */
    @Import(name="enableHealthMonitoring")
      private final @Nullable Output<Boolean> enableHealthMonitoring;

    public Output<Boolean> getEnableHealthMonitoring() {
        return this.enableHealthMonitoring == null ? Codegen.empty() : this.enableHealthMonitoring;
    }

    /**
     * Runtime will automatically shutdown after idle_shutdown_time.
     * Default: True
     * 
     */
    @Import(name="idleShutdown")
      private final @Nullable Output<Boolean> idleShutdown;

    public Output<Boolean> getIdleShutdown() {
        return this.idleShutdown == null ? Codegen.empty() : this.idleShutdown;
    }

    /**
     * Time in minutes to wait before shuting down runtime.
     * Default: 180 minutes
     * 
     */
    @Import(name="idleShutdownTimeout")
      private final @Nullable Output<Integer> idleShutdownTimeout;

    public Output<Integer> getIdleShutdownTimeout() {
        return this.idleShutdownTimeout == null ? Codegen.empty() : this.idleShutdownTimeout;
    }

    /**
     * Install Nvidia Driver automatically.
     * 
     */
    @Import(name="installGpuDriver")
      private final @Nullable Output<Boolean> installGpuDriver;

    public Output<Boolean> getInstallGpuDriver() {
        return this.installGpuDriver == null ? Codegen.empty() : this.installGpuDriver;
    }

    /**
     * Cron expression in UTC timezone for schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    @Import(name="notebookUpgradeSchedule")
      private final @Nullable Output<String> notebookUpgradeSchedule;

    public Output<String> getNotebookUpgradeSchedule() {
        return this.notebookUpgradeSchedule == null ? Codegen.empty() : this.notebookUpgradeSchedule;
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance
     * fully boots up. The path must be a URL or
     * Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    @Import(name="postStartupScript")
      private final @Nullable Output<String> postStartupScript;

    public Output<String> getPostStartupScript() {
        return this.postStartupScript == null ? Codegen.empty() : this.postStartupScript;
    }

    public RuntimeSoftwareConfigArgs(
        @Nullable Output<String> customGpuDriverPath,
        @Nullable Output<Boolean> enableHealthMonitoring,
        @Nullable Output<Boolean> idleShutdown,
        @Nullable Output<Integer> idleShutdownTimeout,
        @Nullable Output<Boolean> installGpuDriver,
        @Nullable Output<String> notebookUpgradeSchedule,
        @Nullable Output<String> postStartupScript) {
        this.customGpuDriverPath = customGpuDriverPath;
        this.enableHealthMonitoring = enableHealthMonitoring;
        this.idleShutdown = idleShutdown;
        this.idleShutdownTimeout = idleShutdownTimeout;
        this.installGpuDriver = installGpuDriver;
        this.notebookUpgradeSchedule = notebookUpgradeSchedule;
        this.postStartupScript = postStartupScript;
    }

    private RuntimeSoftwareConfigArgs() {
        this.customGpuDriverPath = Codegen.empty();
        this.enableHealthMonitoring = Codegen.empty();
        this.idleShutdown = Codegen.empty();
        this.idleShutdownTimeout = Codegen.empty();
        this.installGpuDriver = Codegen.empty();
        this.notebookUpgradeSchedule = Codegen.empty();
        this.postStartupScript = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeSoftwareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customGpuDriverPath;
        private @Nullable Output<Boolean> enableHealthMonitoring;
        private @Nullable Output<Boolean> idleShutdown;
        private @Nullable Output<Integer> idleShutdownTimeout;
        private @Nullable Output<Boolean> installGpuDriver;
        private @Nullable Output<String> notebookUpgradeSchedule;
        private @Nullable Output<String> postStartupScript;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeSoftwareConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.enableHealthMonitoring = defaults.enableHealthMonitoring;
    	      this.idleShutdown = defaults.idleShutdown;
    	      this.idleShutdownTimeout = defaults.idleShutdownTimeout;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.notebookUpgradeSchedule = defaults.notebookUpgradeSchedule;
    	      this.postStartupScript = defaults.postStartupScript;
        }

        public Builder customGpuDriverPath(@Nullable Output<String> customGpuDriverPath) {
            this.customGpuDriverPath = customGpuDriverPath;
            return this;
        }
        public Builder customGpuDriverPath(@Nullable String customGpuDriverPath) {
            this.customGpuDriverPath = Codegen.ofNullable(customGpuDriverPath);
            return this;
        }
        public Builder enableHealthMonitoring(@Nullable Output<Boolean> enableHealthMonitoring) {
            this.enableHealthMonitoring = enableHealthMonitoring;
            return this;
        }
        public Builder enableHealthMonitoring(@Nullable Boolean enableHealthMonitoring) {
            this.enableHealthMonitoring = Codegen.ofNullable(enableHealthMonitoring);
            return this;
        }
        public Builder idleShutdown(@Nullable Output<Boolean> idleShutdown) {
            this.idleShutdown = idleShutdown;
            return this;
        }
        public Builder idleShutdown(@Nullable Boolean idleShutdown) {
            this.idleShutdown = Codegen.ofNullable(idleShutdown);
            return this;
        }
        public Builder idleShutdownTimeout(@Nullable Output<Integer> idleShutdownTimeout) {
            this.idleShutdownTimeout = idleShutdownTimeout;
            return this;
        }
        public Builder idleShutdownTimeout(@Nullable Integer idleShutdownTimeout) {
            this.idleShutdownTimeout = Codegen.ofNullable(idleShutdownTimeout);
            return this;
        }
        public Builder installGpuDriver(@Nullable Output<Boolean> installGpuDriver) {
            this.installGpuDriver = installGpuDriver;
            return this;
        }
        public Builder installGpuDriver(@Nullable Boolean installGpuDriver) {
            this.installGpuDriver = Codegen.ofNullable(installGpuDriver);
            return this;
        }
        public Builder notebookUpgradeSchedule(@Nullable Output<String> notebookUpgradeSchedule) {
            this.notebookUpgradeSchedule = notebookUpgradeSchedule;
            return this;
        }
        public Builder notebookUpgradeSchedule(@Nullable String notebookUpgradeSchedule) {
            this.notebookUpgradeSchedule = Codegen.ofNullable(notebookUpgradeSchedule);
            return this;
        }
        public Builder postStartupScript(@Nullable Output<String> postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }
        public Builder postStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = Codegen.ofNullable(postStartupScript);
            return this;
        }        public RuntimeSoftwareConfigArgs build() {
            return new RuntimeSoftwareConfigArgs(customGpuDriverPath, enableHealthMonitoring, idleShutdown, idleShutdownTimeout, installGpuDriver, notebookUpgradeSchedule, postStartupScript);
        }
    }
}
