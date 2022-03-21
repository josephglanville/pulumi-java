// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1.inputs.ExecStepConfigResponse;
import java.util.Objects;


/**
 * A step that runs an executable for a PatchJob.
 * 
 */
public final class ExecStepResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExecStepResponse Empty = new ExecStepResponse();

    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * 
     */
    @Import(name="linuxExecStepConfig", required=true)
      private final ExecStepConfigResponse linuxExecStepConfig;

    public ExecStepConfigResponse getLinuxExecStepConfig() {
        return this.linuxExecStepConfig;
    }

    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * 
     */
    @Import(name="windowsExecStepConfig", required=true)
      private final ExecStepConfigResponse windowsExecStepConfig;

    public ExecStepConfigResponse getWindowsExecStepConfig() {
        return this.windowsExecStepConfig;
    }

    public ExecStepResponse(
        ExecStepConfigResponse linuxExecStepConfig,
        ExecStepConfigResponse windowsExecStepConfig) {
        this.linuxExecStepConfig = Objects.requireNonNull(linuxExecStepConfig, "expected parameter 'linuxExecStepConfig' to be non-null");
        this.windowsExecStepConfig = Objects.requireNonNull(windowsExecStepConfig, "expected parameter 'windowsExecStepConfig' to be non-null");
    }

    private ExecStepResponse() {
        this.linuxExecStepConfig = null;
        this.windowsExecStepConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecStepConfigResponse linuxExecStepConfig;
        private ExecStepConfigResponse windowsExecStepConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxExecStepConfig = defaults.linuxExecStepConfig;
    	      this.windowsExecStepConfig = defaults.windowsExecStepConfig;
        }

        public Builder linuxExecStepConfig(ExecStepConfigResponse linuxExecStepConfig) {
            this.linuxExecStepConfig = Objects.requireNonNull(linuxExecStepConfig);
            return this;
        }
        public Builder windowsExecStepConfig(ExecStepConfigResponse windowsExecStepConfig) {
            this.windowsExecStepConfig = Objects.requireNonNull(windowsExecStepConfig);
            return this;
        }        public ExecStepResponse build() {
            return new ExecStepResponse(linuxExecStepConfig, windowsExecStepConfig);
        }
    }
}
