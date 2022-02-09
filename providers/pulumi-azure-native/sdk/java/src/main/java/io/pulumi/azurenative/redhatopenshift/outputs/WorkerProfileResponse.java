// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkerProfileResponse {
    private final @Nullable Integer count;
    private final @Nullable Integer diskSizeGB;
    private final @Nullable String name;
    private final @Nullable String subnetId;
    private final @Nullable String vmSize;

    @OutputCustomType.Constructor({"count","diskSizeGB","name","subnetId","vmSize"})
    private WorkerProfileResponse(
        @Nullable Integer count,
        @Nullable Integer diskSizeGB,
        @Nullable String name,
        @Nullable String subnetId,
        @Nullable String vmSize) {
        this.count = count;
        this.diskSizeGB = diskSizeGB;
        this.name = name;
        this.subnetId = subnetId;
        this.vmSize = vmSize;
    }

    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    public Optional<Integer> getDiskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    public Optional<String> getVmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable Integer diskSizeGB;
        private @Nullable String name;
        private @Nullable String subnetId;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.name = defaults.name;
    	      this.subnetId = defaults.subnetId;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public WorkerProfileResponse build() {
            return new WorkerProfileResponse(count, diskSizeGB, name, subnetId, vmSize);
        }
    }
}
