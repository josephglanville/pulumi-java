// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterNodeConfigGuestAccelerator {
    private final Integer count;
    private final String gpuPartitionSize;
    private final String type;

    @CustomType.Constructor
    private GetClusterNodeConfigGuestAccelerator(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("gpuPartitionSize") String gpuPartitionSize,
        @CustomType.Parameter("type") String type) {
        this.count = count;
        this.gpuPartitionSize = gpuPartitionSize;
        this.type = type;
    }

    public Integer getCount() {
        return this.count;
    }
    public String getGpuPartitionSize() {
        return this.gpuPartitionSize;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigGuestAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String gpuPartitionSize;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfigGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.gpuPartitionSize = defaults.gpuPartitionSize;
    	      this.type = defaults.type;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder gpuPartitionSize(String gpuPartitionSize) {
            this.gpuPartitionSize = Objects.requireNonNull(gpuPartitionSize);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetClusterNodeConfigGuestAccelerator build() {
            return new GetClusterNodeConfigGuestAccelerator(count, gpuPartitionSize, type);
        }
    }
}
