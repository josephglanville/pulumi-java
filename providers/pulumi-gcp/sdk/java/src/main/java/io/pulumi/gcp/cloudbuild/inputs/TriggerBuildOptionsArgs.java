// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildOptionsVolumeArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildOptionsArgs Empty = new TriggerBuildOptionsArgs();

    /**
     * Requested disk size for the VM that runs the build. Note that this is NOT "disk free";
     * some of the space will be used by the operating system and build utilities.
     * Also note that this is the minimum disk size that will be allocated for the build --
     * the build may run with a larger disk than requested. At present, the maximum disk size
     * is 1000GB; builds that request more than the maximum are rejected with an error.
     * 
     */
    @InputImport(name="diskSizeGb")
      private final @Nullable Input<Integer> diskSizeGb;

    public Input<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Input.empty() : this.diskSizeGb;
    }

    /**
     * Option to specify whether or not to apply bash style string operations to the substitutions.
     * NOTE this is always enabled for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    @InputImport(name="dynamicSubstitutions")
      private final @Nullable Input<Boolean> dynamicSubstitutions;

    public Input<Boolean> getDynamicSubstitutions() {
        return this.dynamicSubstitutions == null ? Input.empty() : this.dynamicSubstitutions;
    }

    /**
     * A list of global environment variable definitions that will exist for all build steps
     * in this build. If a variable is defined in both globally and in a build step,
     * the variable will use the build step value.
     * The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
     */
    @InputImport(name="envs")
      private final @Nullable Input<List<String>> envs;

    public Input<List<String>> getEnvs() {
        return this.envs == null ? Input.empty() : this.envs;
    }

    /**
     * Option to define build log streaming behavior to Google Cloud Storage.
     * Possible values are `STREAM_DEFAULT`, `STREAM_ON`, and `STREAM_OFF`.
     * 
     */
    @InputImport(name="logStreamingOption")
      private final @Nullable Input<String> logStreamingOption;

    public Input<String> getLogStreamingOption() {
        return this.logStreamingOption == null ? Input.empty() : this.logStreamingOption;
    }

    /**
     * Option to specify the logging mode, which determines if and where build logs are stored.
     * Possible values are `LOGGING_UNSPECIFIED`, `LEGACY`, `GCS_ONLY`, `STACKDRIVER_ONLY`, and `NONE`.
     * 
     */
    @InputImport(name="logging")
      private final @Nullable Input<String> logging;

    public Input<String> getLogging() {
        return this.logging == null ? Input.empty() : this.logging;
    }

    /**
     * Compute Engine machine type on which to run the build.
     * Possible values are `UNSPECIFIED`, `N1_HIGHCPU_8`, `N1_HIGHCPU_32`, `E2_HIGHCPU_8`, and `E2_HIGHCPU_32`.
     * 
     */
    @InputImport(name="machineType")
      private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * Requested verifiability options.
     * Possible values are `NOT_VERIFIED` and `VERIFIED`.
     * 
     */
    @InputImport(name="requestedVerifyOption")
      private final @Nullable Input<String> requestedVerifyOption;

    public Input<String> getRequestedVerifyOption() {
        return this.requestedVerifyOption == null ? Input.empty() : this.requestedVerifyOption;
    }

    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build's Secret. These variables
     * will be available to all build steps in this build.
     * 
     */
    @InputImport(name="secretEnvs")
      private final @Nullable Input<List<String>> secretEnvs;

    public Input<List<String>> getSecretEnvs() {
        return this.secretEnvs == null ? Input.empty() : this.secretEnvs;
    }

    /**
     * Requested hash for SourceProvenance.
     * Each value may be one of `NONE`, `SHA256`, and `MD5`.
     * 
     */
    @InputImport(name="sourceProvenanceHashes")
      private final @Nullable Input<List<String>> sourceProvenanceHashes;

    public Input<List<String>> getSourceProvenanceHashes() {
        return this.sourceProvenanceHashes == null ? Input.empty() : this.sourceProvenanceHashes;
    }

    /**
     * Option to specify behavior when there is an error in the substitution checks.
     * NOTE this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden
     * in the build configuration file.
     * Possible values are `MUST_MATCH` and `ALLOW_LOOSE`.
     * 
     */
    @InputImport(name="substitutionOption")
      private final @Nullable Input<String> substitutionOption;

    public Input<String> getSubstitutionOption() {
        return this.substitutionOption == null ? Input.empty() : this.substitutionOption;
    }

    /**
     * Global list of volumes to mount for ALL build steps
     * Each volume is created as an empty volume prior to starting the build process.
     * Upon completion of the build, volumes and their contents are discarded. Global
     * volume names and paths cannot conflict with the volumes defined a build step.
     * Using a global volume in a build with only one step is not valid as it is indicative
     * of a build request with an incorrect configuration.
     * Structure is documented below.
     * 
     */
    @InputImport(name="volumes")
      private final @Nullable Input<List<TriggerBuildOptionsVolumeArgs>> volumes;

    public Input<List<TriggerBuildOptionsVolumeArgs>> getVolumes() {
        return this.volumes == null ? Input.empty() : this.volumes;
    }

    /**
     * Option to specify a WorkerPool for the build. Format projects/{project}/workerPools/{workerPool}
     * This field is experimental.
     * 
     */
    @InputImport(name="workerPool")
      private final @Nullable Input<String> workerPool;

    public Input<String> getWorkerPool() {
        return this.workerPool == null ? Input.empty() : this.workerPool;
    }

    public TriggerBuildOptionsArgs(
        @Nullable Input<Integer> diskSizeGb,
        @Nullable Input<Boolean> dynamicSubstitutions,
        @Nullable Input<List<String>> envs,
        @Nullable Input<String> logStreamingOption,
        @Nullable Input<String> logging,
        @Nullable Input<String> machineType,
        @Nullable Input<String> requestedVerifyOption,
        @Nullable Input<List<String>> secretEnvs,
        @Nullable Input<List<String>> sourceProvenanceHashes,
        @Nullable Input<String> substitutionOption,
        @Nullable Input<List<TriggerBuildOptionsVolumeArgs>> volumes,
        @Nullable Input<String> workerPool) {
        this.diskSizeGb = diskSizeGb;
        this.dynamicSubstitutions = dynamicSubstitutions;
        this.envs = envs;
        this.logStreamingOption = logStreamingOption;
        this.logging = logging;
        this.machineType = machineType;
        this.requestedVerifyOption = requestedVerifyOption;
        this.secretEnvs = secretEnvs;
        this.sourceProvenanceHashes = sourceProvenanceHashes;
        this.substitutionOption = substitutionOption;
        this.volumes = volumes;
        this.workerPool = workerPool;
    }

    private TriggerBuildOptionsArgs() {
        this.diskSizeGb = Input.empty();
        this.dynamicSubstitutions = Input.empty();
        this.envs = Input.empty();
        this.logStreamingOption = Input.empty();
        this.logging = Input.empty();
        this.machineType = Input.empty();
        this.requestedVerifyOption = Input.empty();
        this.secretEnvs = Input.empty();
        this.sourceProvenanceHashes = Input.empty();
        this.substitutionOption = Input.empty();
        this.volumes = Input.empty();
        this.workerPool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> diskSizeGb;
        private @Nullable Input<Boolean> dynamicSubstitutions;
        private @Nullable Input<List<String>> envs;
        private @Nullable Input<String> logStreamingOption;
        private @Nullable Input<String> logging;
        private @Nullable Input<String> machineType;
        private @Nullable Input<String> requestedVerifyOption;
        private @Nullable Input<List<String>> secretEnvs;
        private @Nullable Input<List<String>> sourceProvenanceHashes;
        private @Nullable Input<String> substitutionOption;
        private @Nullable Input<List<TriggerBuildOptionsVolumeArgs>> volumes;
        private @Nullable Input<String> workerPool;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.dynamicSubstitutions = defaults.dynamicSubstitutions;
    	      this.envs = defaults.envs;
    	      this.logStreamingOption = defaults.logStreamingOption;
    	      this.logging = defaults.logging;
    	      this.machineType = defaults.machineType;
    	      this.requestedVerifyOption = defaults.requestedVerifyOption;
    	      this.secretEnvs = defaults.secretEnvs;
    	      this.sourceProvenanceHashes = defaults.sourceProvenanceHashes;
    	      this.substitutionOption = defaults.substitutionOption;
    	      this.volumes = defaults.volumes;
    	      this.workerPool = defaults.workerPool;
        }

        public Builder setDiskSizeGb(@Nullable Input<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Input.ofNullable(diskSizeGb);
            return this;
        }

        public Builder setDynamicSubstitutions(@Nullable Input<Boolean> dynamicSubstitutions) {
            this.dynamicSubstitutions = dynamicSubstitutions;
            return this;
        }

        public Builder setDynamicSubstitutions(@Nullable Boolean dynamicSubstitutions) {
            this.dynamicSubstitutions = Input.ofNullable(dynamicSubstitutions);
            return this;
        }

        public Builder setEnvs(@Nullable Input<List<String>> envs) {
            this.envs = envs;
            return this;
        }

        public Builder setEnvs(@Nullable List<String> envs) {
            this.envs = Input.ofNullable(envs);
            return this;
        }

        public Builder setLogStreamingOption(@Nullable Input<String> logStreamingOption) {
            this.logStreamingOption = logStreamingOption;
            return this;
        }

        public Builder setLogStreamingOption(@Nullable String logStreamingOption) {
            this.logStreamingOption = Input.ofNullable(logStreamingOption);
            return this;
        }

        public Builder setLogging(@Nullable Input<String> logging) {
            this.logging = logging;
            return this;
        }

        public Builder setLogging(@Nullable String logging) {
            this.logging = Input.ofNullable(logging);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setRequestedVerifyOption(@Nullable Input<String> requestedVerifyOption) {
            this.requestedVerifyOption = requestedVerifyOption;
            return this;
        }

        public Builder setRequestedVerifyOption(@Nullable String requestedVerifyOption) {
            this.requestedVerifyOption = Input.ofNullable(requestedVerifyOption);
            return this;
        }

        public Builder setSecretEnvs(@Nullable Input<List<String>> secretEnvs) {
            this.secretEnvs = secretEnvs;
            return this;
        }

        public Builder setSecretEnvs(@Nullable List<String> secretEnvs) {
            this.secretEnvs = Input.ofNullable(secretEnvs);
            return this;
        }

        public Builder setSourceProvenanceHashes(@Nullable Input<List<String>> sourceProvenanceHashes) {
            this.sourceProvenanceHashes = sourceProvenanceHashes;
            return this;
        }

        public Builder setSourceProvenanceHashes(@Nullable List<String> sourceProvenanceHashes) {
            this.sourceProvenanceHashes = Input.ofNullable(sourceProvenanceHashes);
            return this;
        }

        public Builder setSubstitutionOption(@Nullable Input<String> substitutionOption) {
            this.substitutionOption = substitutionOption;
            return this;
        }

        public Builder setSubstitutionOption(@Nullable String substitutionOption) {
            this.substitutionOption = Input.ofNullable(substitutionOption);
            return this;
        }

        public Builder setVolumes(@Nullable Input<List<TriggerBuildOptionsVolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder setVolumes(@Nullable List<TriggerBuildOptionsVolumeArgs> volumes) {
            this.volumes = Input.ofNullable(volumes);
            return this;
        }

        public Builder setWorkerPool(@Nullable Input<String> workerPool) {
            this.workerPool = workerPool;
            return this;
        }

        public Builder setWorkerPool(@Nullable String workerPool) {
            this.workerPool = Input.ofNullable(workerPool);
            return this;
        }
        public TriggerBuildOptionsArgs build() {
            return new TriggerBuildOptionsArgs(diskSizeGb, dynamicSubstitutions, envs, logStreamingOption, logging, machineType, requestedVerifyOption, secretEnvs, sourceProvenanceHashes, substitutionOption, volumes, workerPool);
        }
    }
}
