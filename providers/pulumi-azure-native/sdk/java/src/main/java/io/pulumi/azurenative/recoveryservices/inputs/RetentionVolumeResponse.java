// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RetentionVolumeResponse extends io.pulumi.resources.InvokeArgs {

    public static final RetentionVolumeResponse Empty = new RetentionVolumeResponse();

    @InputImport(name="capacityInBytes")
    private final @Nullable Double capacityInBytes;

    public Optional<Double> getCapacityInBytes() {
        return this.capacityInBytes == null ? Optional.empty() : Optional.ofNullable(this.capacityInBytes);
    }

    @InputImport(name="freeSpaceInBytes")
    private final @Nullable Double freeSpaceInBytes;

    public Optional<Double> getFreeSpaceInBytes() {
        return this.freeSpaceInBytes == null ? Optional.empty() : Optional.ofNullable(this.freeSpaceInBytes);
    }

    @InputImport(name="thresholdPercentage")
    private final @Nullable Integer thresholdPercentage;

    public Optional<Integer> getThresholdPercentage() {
        return this.thresholdPercentage == null ? Optional.empty() : Optional.ofNullable(this.thresholdPercentage);
    }

    @InputImport(name="volumeName")
    private final @Nullable String volumeName;

    public Optional<String> getVolumeName() {
        return this.volumeName == null ? Optional.empty() : Optional.ofNullable(this.volumeName);
    }

    public RetentionVolumeResponse(
        @Nullable Double capacityInBytes,
        @Nullable Double freeSpaceInBytes,
        @Nullable Integer thresholdPercentage,
        @Nullable String volumeName) {
        this.capacityInBytes = capacityInBytes;
        this.freeSpaceInBytes = freeSpaceInBytes;
        this.thresholdPercentage = thresholdPercentage;
        this.volumeName = volumeName;
    }

    private RetentionVolumeResponse() {
        this.capacityInBytes = null;
        this.freeSpaceInBytes = null;
        this.thresholdPercentage = null;
        this.volumeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double capacityInBytes;
        private @Nullable Double freeSpaceInBytes;
        private @Nullable Integer thresholdPercentage;
        private @Nullable String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityInBytes = defaults.capacityInBytes;
    	      this.freeSpaceInBytes = defaults.freeSpaceInBytes;
    	      this.thresholdPercentage = defaults.thresholdPercentage;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setCapacityInBytes(@Nullable Double capacityInBytes) {
            this.capacityInBytes = capacityInBytes;
            return this;
        }

        public Builder setFreeSpaceInBytes(@Nullable Double freeSpaceInBytes) {
            this.freeSpaceInBytes = freeSpaceInBytes;
            return this;
        }

        public Builder setThresholdPercentage(@Nullable Integer thresholdPercentage) {
            this.thresholdPercentage = thresholdPercentage;
            return this;
        }

        public Builder setVolumeName(@Nullable String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public RetentionVolumeResponse build() {
            return new RetentionVolumeResponse(capacityInBytes, freeSpaceInBytes, thresholdPercentage, volumeName);
        }
    }
}