// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ServiceRegistryResourceRequestsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceRegistryResourceRequestsResponse Empty = new ServiceRegistryResourceRequestsResponse();

    @InputImport(name="cpu", required=true)
    private final String cpu;

    public String getCpu() {
        return this.cpu;
    }

    @InputImport(name="instanceCount", required=true)
    private final Integer instanceCount;

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    @InputImport(name="memory", required=true)
    private final String memory;

    public String getMemory() {
        return this.memory;
    }

    public ServiceRegistryResourceRequestsResponse(
        String cpu,
        Integer instanceCount,
        String memory) {
        this.cpu = Objects.requireNonNull(cpu, "expected parameter 'cpu' to be non-null");
        this.instanceCount = Objects.requireNonNull(instanceCount, "expected parameter 'instanceCount' to be non-null");
        this.memory = Objects.requireNonNull(memory, "expected parameter 'memory' to be non-null");
    }

    private ServiceRegistryResourceRequestsResponse() {
        this.cpu = null;
        this.instanceCount = null;
        this.memory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRegistryResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpu;
        private Integer instanceCount;
        private String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceRegistryResourceRequestsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.instanceCount = defaults.instanceCount;
    	      this.memory = defaults.memory;
        }

        public Builder setCpu(String cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setInstanceCount(Integer instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }

        public ServiceRegistryResourceRequestsResponse build() {
            return new ServiceRegistryResourceRequestsResponse(cpu, instanceCount, memory);
        }
    }
}
