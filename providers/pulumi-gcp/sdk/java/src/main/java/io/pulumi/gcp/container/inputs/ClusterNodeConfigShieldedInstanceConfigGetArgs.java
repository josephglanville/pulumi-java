// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodeConfigShieldedInstanceConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigShieldedInstanceConfigGetArgs Empty = new ClusterNodeConfigShieldedInstanceConfigGetArgs();

    /**
     * Defines if the instance has integrity monitoring enabled.
     * 
     */
    @Import(name="enableIntegrityMonitoring")
      private final @Nullable Output<Boolean> enableIntegrityMonitoring;

    public Output<Boolean> getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring == null ? Codegen.empty() : this.enableIntegrityMonitoring;
    }

    /**
     * Defines if the instance has Secure Boot enabled.
     * 
     */
    @Import(name="enableSecureBoot")
      private final @Nullable Output<Boolean> enableSecureBoot;

    public Output<Boolean> getEnableSecureBoot() {
        return this.enableSecureBoot == null ? Codegen.empty() : this.enableSecureBoot;
    }

    public ClusterNodeConfigShieldedInstanceConfigGetArgs(
        @Nullable Output<Boolean> enableIntegrityMonitoring,
        @Nullable Output<Boolean> enableSecureBoot) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
    }

    private ClusterNodeConfigShieldedInstanceConfigGetArgs() {
        this.enableIntegrityMonitoring = Codegen.empty();
        this.enableSecureBoot = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigShieldedInstanceConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableIntegrityMonitoring;
        private @Nullable Output<Boolean> enableSecureBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigShieldedInstanceConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
        }

        public Builder enableIntegrityMonitoring(@Nullable Output<Boolean> enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }
        public Builder enableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Codegen.ofNullable(enableIntegrityMonitoring);
            return this;
        }
        public Builder enableSecureBoot(@Nullable Output<Boolean> enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }
        public Builder enableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = Codegen.ofNullable(enableSecureBoot);
            return this;
        }        public ClusterNodeConfigShieldedInstanceConfigGetArgs build() {
            return new ClusterNodeConfigShieldedInstanceConfigGetArgs(enableIntegrityMonitoring, enableSecureBoot);
        }
    }
}
