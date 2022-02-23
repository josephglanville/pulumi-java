// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Kubernetes role compute resource
 * 
 */
public final class KubernetesRoleComputeResponse extends io.pulumi.resources.InvokeArgs {

    public static final KubernetesRoleComputeResponse Empty = new KubernetesRoleComputeResponse();

    /**
     * Memory in bytes
     * 
     */
    @InputImport(name="memoryInBytes", required=true)
      private final Double memoryInBytes;

    public Double getMemoryInBytes() {
        return this.memoryInBytes;
    }

    /**
     * Processor count
     * 
     */
    @InputImport(name="processorCount", required=true)
      private final Integer processorCount;

    public Integer getProcessorCount() {
        return this.processorCount;
    }

    /**
     * VM profile
     * 
     */
    @InputImport(name="vmProfile", required=true)
      private final String vmProfile;

    public String getVmProfile() {
        return this.vmProfile;
    }

    public KubernetesRoleComputeResponse(
        Double memoryInBytes,
        Integer processorCount,
        String vmProfile) {
        this.memoryInBytes = Objects.requireNonNull(memoryInBytes, "expected parameter 'memoryInBytes' to be non-null");
        this.processorCount = Objects.requireNonNull(processorCount, "expected parameter 'processorCount' to be non-null");
        this.vmProfile = Objects.requireNonNull(vmProfile, "expected parameter 'vmProfile' to be non-null");
    }

    private KubernetesRoleComputeResponse() {
        this.memoryInBytes = null;
        this.processorCount = null;
        this.vmProfile = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleComputeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double memoryInBytes;
        private Integer processorCount;
        private String vmProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleComputeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryInBytes = defaults.memoryInBytes;
    	      this.processorCount = defaults.processorCount;
    	      this.vmProfile = defaults.vmProfile;
        }

        public Builder setMemoryInBytes(Double memoryInBytes) {
            this.memoryInBytes = Objects.requireNonNull(memoryInBytes);
            return this;
        }

        public Builder setProcessorCount(Integer processorCount) {
            this.processorCount = Objects.requireNonNull(processorCount);
            return this;
        }

        public Builder setVmProfile(String vmProfile) {
            this.vmProfile = Objects.requireNonNull(vmProfile);
            return this;
        }
        public KubernetesRoleComputeResponse build() {
            return new KubernetesRoleComputeResponse(memoryInBytes, processorCount, vmProfile);
        }
    }
}
