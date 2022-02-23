// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.enums.RuntimeVersion;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Deployment settings payload
 * 
 */
public final class DeploymentSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentSettingsArgs Empty = new DeploymentSettingsArgs();

    /**
     * Required CPU, basic tier should be 1, standard tier should be in range (1, 4)
     * 
     */
    @InputImport(name="cpu")
      private final @Nullable Input<Integer> cpu;

    public Input<Integer> getCpu() {
        return this.cpu == null ? Input.empty() : this.cpu;
    }

    /**
     * Collection of environment variables
     * 
     */
    @InputImport(name="environmentVariables")
      private final @Nullable Input<Map<String,String>> environmentVariables;

    public Input<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * JVM parameter
     * 
     */
    @InputImport(name="jvmOptions")
      private final @Nullable Input<String> jvmOptions;

    public Input<String> getJvmOptions() {
        return this.jvmOptions == null ? Input.empty() : this.jvmOptions;
    }

    /**
     * Required Memory size in GB, basic tier should be in range (1, 2), standard tier should be in range (1, 8)
     * 
     */
    @InputImport(name="memoryInGB")
      private final @Nullable Input<Integer> memoryInGB;

    public Input<Integer> getMemoryInGB() {
        return this.memoryInGB == null ? Input.empty() : this.memoryInGB;
    }

    /**
     * The path to the .NET executable relative to zip root
     * 
     */
    @InputImport(name="netCoreMainEntryPath")
      private final @Nullable Input<String> netCoreMainEntryPath;

    public Input<String> getNetCoreMainEntryPath() {
        return this.netCoreMainEntryPath == null ? Input.empty() : this.netCoreMainEntryPath;
    }

    /**
     * Runtime version
     * 
     */
    @InputImport(name="runtimeVersion")
      private final @Nullable Input<Either<String,RuntimeVersion>> runtimeVersion;

    public Input<Either<String,RuntimeVersion>> getRuntimeVersion() {
        return this.runtimeVersion == null ? Input.empty() : this.runtimeVersion;
    }

    public DeploymentSettingsArgs(
        @Nullable Input<Integer> cpu,
        @Nullable Input<Map<String,String>> environmentVariables,
        @Nullable Input<String> jvmOptions,
        @Nullable Input<Integer> memoryInGB,
        @Nullable Input<String> netCoreMainEntryPath,
        @Nullable Input<Either<String,RuntimeVersion>> runtimeVersion) {
        this.cpu = cpu == null ? Input.ofNullable(1) : cpu;
        this.environmentVariables = environmentVariables;
        this.jvmOptions = jvmOptions;
        this.memoryInGB = memoryInGB == null ? Input.ofNullable(1) : memoryInGB;
        this.netCoreMainEntryPath = netCoreMainEntryPath;
        this.runtimeVersion = runtimeVersion == null ? Input.ofLeft("Java_8") : runtimeVersion;
    }

    private DeploymentSettingsArgs() {
        this.cpu = Input.empty();
        this.environmentVariables = Input.empty();
        this.jvmOptions = Input.empty();
        this.memoryInGB = Input.empty();
        this.netCoreMainEntryPath = Input.empty();
        this.runtimeVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cpu;
        private @Nullable Input<Map<String,String>> environmentVariables;
        private @Nullable Input<String> jvmOptions;
        private @Nullable Input<Integer> memoryInGB;
        private @Nullable Input<String> netCoreMainEntryPath;
        private @Nullable Input<Either<String,RuntimeVersion>> runtimeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.jvmOptions = defaults.jvmOptions;
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.netCoreMainEntryPath = defaults.netCoreMainEntryPath;
    	      this.runtimeVersion = defaults.runtimeVersion;
        }

        public Builder setCpu(@Nullable Input<Integer> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setCpu(@Nullable Integer cpu) {
            this.cpu = Input.ofNullable(cpu);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setJvmOptions(@Nullable Input<String> jvmOptions) {
            this.jvmOptions = jvmOptions;
            return this;
        }

        public Builder setJvmOptions(@Nullable String jvmOptions) {
            this.jvmOptions = Input.ofNullable(jvmOptions);
            return this;
        }

        public Builder setMemoryInGB(@Nullable Input<Integer> memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }

        public Builder setMemoryInGB(@Nullable Integer memoryInGB) {
            this.memoryInGB = Input.ofNullable(memoryInGB);
            return this;
        }

        public Builder setNetCoreMainEntryPath(@Nullable Input<String> netCoreMainEntryPath) {
            this.netCoreMainEntryPath = netCoreMainEntryPath;
            return this;
        }

        public Builder setNetCoreMainEntryPath(@Nullable String netCoreMainEntryPath) {
            this.netCoreMainEntryPath = Input.ofNullable(netCoreMainEntryPath);
            return this;
        }

        public Builder setRuntimeVersion(@Nullable Input<Either<String,RuntimeVersion>> runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }

        public Builder setRuntimeVersion(@Nullable Either<String,RuntimeVersion> runtimeVersion) {
            this.runtimeVersion = Input.ofNullable(runtimeVersion);
            return this;
        }
        public DeploymentSettingsArgs build() {
            return new DeploymentSettingsArgs(cpu, environmentVariables, jvmOptions, memoryInGB, netCoreMainEntryPath, runtimeVersion);
        }
    }
}
