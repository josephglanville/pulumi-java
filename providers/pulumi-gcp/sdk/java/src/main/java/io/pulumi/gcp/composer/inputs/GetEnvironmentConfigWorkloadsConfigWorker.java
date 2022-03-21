// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


public final class GetEnvironmentConfigWorkloadsConfigWorker extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigWorkloadsConfigWorker Empty = new GetEnvironmentConfigWorkloadsConfigWorker();

    @Import(name="cpu", required=true)
      private final Double cpu;

    public Double getCpu() {
        return this.cpu;
    }

    @Import(name="maxCount", required=true)
      private final Integer maxCount;

    public Integer getMaxCount() {
        return this.maxCount;
    }

    @Import(name="memoryGb", required=true)
      private final Double memoryGb;

    public Double getMemoryGb() {
        return this.memoryGb;
    }

    @Import(name="minCount", required=true)
      private final Integer minCount;

    public Integer getMinCount() {
        return this.minCount;
    }

    @Import(name="storageGb", required=true)
      private final Double storageGb;

    public Double getStorageGb() {
        return this.storageGb;
    }

    public GetEnvironmentConfigWorkloadsConfigWorker(
        Double cpu,
        Integer maxCount,
        Double memoryGb,
        Integer minCount,
        Double storageGb) {
        this.cpu = Objects.requireNonNull(cpu, "expected parameter 'cpu' to be non-null");
        this.maxCount = Objects.requireNonNull(maxCount, "expected parameter 'maxCount' to be non-null");
        this.memoryGb = Objects.requireNonNull(memoryGb, "expected parameter 'memoryGb' to be non-null");
        this.minCount = Objects.requireNonNull(minCount, "expected parameter 'minCount' to be non-null");
        this.storageGb = Objects.requireNonNull(storageGb, "expected parameter 'storageGb' to be non-null");
    }

    private GetEnvironmentConfigWorkloadsConfigWorker() {
        this.cpu = null;
        this.maxCount = null;
        this.memoryGb = null;
        this.minCount = null;
        this.storageGb = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfigWorker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private Integer maxCount;
        private Double memoryGb;
        private Integer minCount;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWorkloadsConfigWorker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.maxCount = defaults.maxCount;
    	      this.memoryGb = defaults.memoryGb;
    	      this.minCount = defaults.minCount;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder cpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        public Builder maxCount(Integer maxCount) {
            this.maxCount = Objects.requireNonNull(maxCount);
            return this;
        }
        public Builder memoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }
        public Builder minCount(Integer minCount) {
            this.minCount = Objects.requireNonNull(minCount);
            return this;
        }
        public Builder storageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }        public GetEnvironmentConfigWorkloadsConfigWorker build() {
            return new GetEnvironmentConfigWorkloadsConfigWorker(cpu, maxCount, memoryGb, minCount, storageGb);
        }
    }
}
