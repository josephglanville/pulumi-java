// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class AdvancedMachineFeaturesResponse {
    private final Boolean enableNestedVirtualization;
    private final Boolean enableUefiNetworking;
    private final Integer numaNodeCount;
    private final Integer threadsPerCore;
    private final Integer visibleCoreCount;

    @OutputCustomType.Constructor({"enableNestedVirtualization","enableUefiNetworking","numaNodeCount","threadsPerCore","visibleCoreCount"})
    private AdvancedMachineFeaturesResponse(
        Boolean enableNestedVirtualization,
        Boolean enableUefiNetworking,
        Integer numaNodeCount,
        Integer threadsPerCore,
        Integer visibleCoreCount) {
        this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization);
        this.enableUefiNetworking = Objects.requireNonNull(enableUefiNetworking);
        this.numaNodeCount = Objects.requireNonNull(numaNodeCount);
        this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
        this.visibleCoreCount = Objects.requireNonNull(visibleCoreCount);
    }

    public Boolean getEnableNestedVirtualization() {
        return this.enableNestedVirtualization;
    }
    public Boolean getEnableUefiNetworking() {
        return this.enableUefiNetworking;
    }
    public Integer getNumaNodeCount() {
        return this.numaNodeCount;
    }
    public Integer getThreadsPerCore() {
        return this.threadsPerCore;
    }
    public Integer getVisibleCoreCount() {
        return this.visibleCoreCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedMachineFeaturesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableNestedVirtualization;
        private Boolean enableUefiNetworking;
        private Integer numaNodeCount;
        private Integer threadsPerCore;
        private Integer visibleCoreCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedMachineFeaturesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.enableUefiNetworking = defaults.enableUefiNetworking;
    	      this.numaNodeCount = defaults.numaNodeCount;
    	      this.threadsPerCore = defaults.threadsPerCore;
    	      this.visibleCoreCount = defaults.visibleCoreCount;
        }

        public Builder setEnableNestedVirtualization(Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization);
            return this;
        }

        public Builder setEnableUefiNetworking(Boolean enableUefiNetworking) {
            this.enableUefiNetworking = Objects.requireNonNull(enableUefiNetworking);
            return this;
        }

        public Builder setNumaNodeCount(Integer numaNodeCount) {
            this.numaNodeCount = Objects.requireNonNull(numaNodeCount);
            return this;
        }

        public Builder setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
            return this;
        }

        public Builder setVisibleCoreCount(Integer visibleCoreCount) {
            this.visibleCoreCount = Objects.requireNonNull(visibleCoreCount);
            return this;
        }

        public AdvancedMachineFeaturesResponse build() {
            return new AdvancedMachineFeaturesResponse(enableNestedVirtualization, enableUefiNetworking, numaNodeCount, threadsPerCore, visibleCoreCount);
        }
    }
}