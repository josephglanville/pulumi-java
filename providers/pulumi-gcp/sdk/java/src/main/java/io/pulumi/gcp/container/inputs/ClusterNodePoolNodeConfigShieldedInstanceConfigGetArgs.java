// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs Empty = new ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs();

    /**
     * Defines if the instance has integrity monitoring enabled.
     * 
     */
    @Import(name="enableIntegrityMonitoring")
      private final @Nullable Output<Boolean> enableIntegrityMonitoring;

    public Output<Boolean> getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring == null ? Output.empty() : this.enableIntegrityMonitoring;
    }

    /**
     * Defines if the instance has Secure Boot enabled.
     * 
     */
    @Import(name="enableSecureBoot")
      private final @Nullable Output<Boolean> enableSecureBoot;

    public Output<Boolean> getEnableSecureBoot() {
        return this.enableSecureBoot == null ? Output.empty() : this.enableSecureBoot;
    }

    public ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs(
        @Nullable Output<Boolean> enableIntegrityMonitoring,
        @Nullable Output<Boolean> enableSecureBoot) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
    }

    private ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs() {
        this.enableIntegrityMonitoring = Output.empty();
        this.enableSecureBoot = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableIntegrityMonitoring;
        private @Nullable Output<Boolean> enableSecureBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
        }

        public Builder enableIntegrityMonitoring(@Nullable Output<Boolean> enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }
        public Builder enableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Output.ofNullable(enableIntegrityMonitoring);
            return this;
        }
        public Builder enableSecureBoot(@Nullable Output<Boolean> enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }
        public Builder enableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = Output.ofNullable(enableSecureBoot);
            return this;
        }        public ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs build() {
            return new ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs(enableIntegrityMonitoring, enableSecureBoot);
        }
    }
}
