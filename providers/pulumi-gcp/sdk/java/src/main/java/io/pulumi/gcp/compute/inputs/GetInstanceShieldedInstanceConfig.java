// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class GetInstanceShieldedInstanceConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceShieldedInstanceConfig Empty = new GetInstanceShieldedInstanceConfig();

    @InputImport(name="enableIntegrityMonitoring", required=true)
      private final Boolean enableIntegrityMonitoring;

    public Boolean getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }

    @InputImport(name="enableSecureBoot", required=true)
      private final Boolean enableSecureBoot;

    public Boolean getEnableSecureBoot() {
        return this.enableSecureBoot;
    }

    @InputImport(name="enableVtpm", required=true)
      private final Boolean enableVtpm;

    public Boolean getEnableVtpm() {
        return this.enableVtpm;
    }

    public GetInstanceShieldedInstanceConfig(
        Boolean enableIntegrityMonitoring,
        Boolean enableSecureBoot,
        Boolean enableVtpm) {
        this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring, "expected parameter 'enableIntegrityMonitoring' to be non-null");
        this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot, "expected parameter 'enableSecureBoot' to be non-null");
        this.enableVtpm = Objects.requireNonNull(enableVtpm, "expected parameter 'enableVtpm' to be non-null");
    }

    private GetInstanceShieldedInstanceConfig() {
        this.enableIntegrityMonitoring = null;
        this.enableSecureBoot = null;
        this.enableVtpm = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableIntegrityMonitoring;
        private Boolean enableSecureBoot;
        private Boolean enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder setEnableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
            return this;
        }

        public Builder setEnableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
            return this;
        }

        public Builder setEnableVtpm(Boolean enableVtpm) {
            this.enableVtpm = Objects.requireNonNull(enableVtpm);
            return this;
        }
        public GetInstanceShieldedInstanceConfig build() {
            return new GetInstanceShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
