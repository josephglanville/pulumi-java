// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetClusterNodeConfigShieldedInstanceConfig {
    private final Boolean enableIntegrityMonitoring;
    private final Boolean enableSecureBoot;

    @CustomType.Constructor
    private GetClusterNodeConfigShieldedInstanceConfig(
        @CustomType.Parameter("enableIntegrityMonitoring") Boolean enableIntegrityMonitoring,
        @CustomType.Parameter("enableSecureBoot") Boolean enableSecureBoot) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
    }

    public Boolean getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }
    public Boolean getEnableSecureBoot() {
        return this.enableSecureBoot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableIntegrityMonitoring;
        private Boolean enableSecureBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfigShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
        }

        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
            return this;
        }
        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
            return this;
        }        public GetClusterNodeConfigShieldedInstanceConfig build() {
            return new GetClusterNodeConfigShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot);
        }
    }
}
