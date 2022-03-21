// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.enums.RuntimeVersion;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="cpu")
      private final @Nullable Output<Integer> cpu;

    public Output<Integer> getCpu() {
        return this.cpu == null ? Output.empty() : this.cpu;
    }

    /**
     * Collection of environment variables
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<Map<String,String>> environmentVariables;

    public Output<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Output.empty() : this.environmentVariables;
    }

    /**
     * JVM parameter
     * 
     */
    @Import(name="jvmOptions")
      private final @Nullable Output<String> jvmOptions;

    public Output<String> getJvmOptions() {
        return this.jvmOptions == null ? Output.empty() : this.jvmOptions;
    }

    /**
     * Required Memory size in GB, basic tier should be in range (1, 2), standard tier should be in range (1, 8)
     * 
     */
    @Import(name="memoryInGB")
      private final @Nullable Output<Integer> memoryInGB;

    public Output<Integer> getMemoryInGB() {
        return this.memoryInGB == null ? Output.empty() : this.memoryInGB;
    }

    /**
     * The path to the .NET executable relative to zip root
     * 
     */
    @Import(name="netCoreMainEntryPath")
      private final @Nullable Output<String> netCoreMainEntryPath;

    public Output<String> getNetCoreMainEntryPath() {
        return this.netCoreMainEntryPath == null ? Output.empty() : this.netCoreMainEntryPath;
    }

    /**
     * Runtime version
     * 
     */
    @Import(name="runtimeVersion")
      private final @Nullable Output<Either<String,RuntimeVersion>> runtimeVersion;

    public Output<Either<String,RuntimeVersion>> getRuntimeVersion() {
        return this.runtimeVersion == null ? Output.empty() : this.runtimeVersion;
    }

    public DeploymentSettingsArgs(
        @Nullable Output<Integer> cpu,
        @Nullable Output<Map<String,String>> environmentVariables,
        @Nullable Output<String> jvmOptions,
        @Nullable Output<Integer> memoryInGB,
        @Nullable Output<String> netCoreMainEntryPath,
        @Nullable Output<Either<String,RuntimeVersion>> runtimeVersion) {
        this.cpu = cpu == null ? Output.ofNullable(1) : cpu;
        this.environmentVariables = environmentVariables;
        this.jvmOptions = jvmOptions;
        this.memoryInGB = memoryInGB == null ? Output.ofNullable(1) : memoryInGB;
        this.netCoreMainEntryPath = netCoreMainEntryPath;
        this.runtimeVersion = runtimeVersion == null ? Output.ofLeft("Java_8") : runtimeVersion;
    }

    private DeploymentSettingsArgs() {
        this.cpu = Output.empty();
        this.environmentVariables = Output.empty();
        this.jvmOptions = Output.empty();
        this.memoryInGB = Output.empty();
        this.netCoreMainEntryPath = Output.empty();
        this.runtimeVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cpu;
        private @Nullable Output<Map<String,String>> environmentVariables;
        private @Nullable Output<String> jvmOptions;
        private @Nullable Output<Integer> memoryInGB;
        private @Nullable Output<String> netCoreMainEntryPath;
        private @Nullable Output<Either<String,RuntimeVersion>> runtimeVersion;

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

        public Builder cpu(@Nullable Output<Integer> cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpu(@Nullable Integer cpu) {
            this.cpu = Output.ofNullable(cpu);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Output.ofNullable(environmentVariables);
            return this;
        }
        public Builder jvmOptions(@Nullable Output<String> jvmOptions) {
            this.jvmOptions = jvmOptions;
            return this;
        }
        public Builder jvmOptions(@Nullable String jvmOptions) {
            this.jvmOptions = Output.ofNullable(jvmOptions);
            return this;
        }
        public Builder memoryInGB(@Nullable Output<Integer> memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }
        public Builder memoryInGB(@Nullable Integer memoryInGB) {
            this.memoryInGB = Output.ofNullable(memoryInGB);
            return this;
        }
        public Builder netCoreMainEntryPath(@Nullable Output<String> netCoreMainEntryPath) {
            this.netCoreMainEntryPath = netCoreMainEntryPath;
            return this;
        }
        public Builder netCoreMainEntryPath(@Nullable String netCoreMainEntryPath) {
            this.netCoreMainEntryPath = Output.ofNullable(netCoreMainEntryPath);
            return this;
        }
        public Builder runtimeVersion(@Nullable Output<Either<String,RuntimeVersion>> runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public Builder runtimeVersion(@Nullable Either<String,RuntimeVersion> runtimeVersion) {
            this.runtimeVersion = Output.ofNullable(runtimeVersion);
            return this;
        }        public DeploymentSettingsArgs build() {
            return new DeploymentSettingsArgs(cpu, environmentVariables, jvmOptions, memoryInGB, netCoreMainEntryPath, runtimeVersion);
        }
    }
}
