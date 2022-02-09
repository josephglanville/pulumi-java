// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManualScaleSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManualScaleSettingsResponse Empty = new ManualScaleSettingsResponse();

    @InputImport(name="instanceCount")
    private final @Nullable Integer instanceCount;

    public Optional<Integer> getInstanceCount() {
        return this.instanceCount == null ? Optional.empty() : Optional.ofNullable(this.instanceCount);
    }

    @InputImport(name="maxInstances")
    private final @Nullable Integer maxInstances;

    public Optional<Integer> getMaxInstances() {
        return this.maxInstances == null ? Optional.empty() : Optional.ofNullable(this.maxInstances);
    }

    @InputImport(name="minInstances")
    private final @Nullable Integer minInstances;

    public Optional<Integer> getMinInstances() {
        return this.minInstances == null ? Optional.empty() : Optional.ofNullable(this.minInstances);
    }

    @InputImport(name="scaleType", required=true)
    private final String scaleType;

    public String getScaleType() {
        return this.scaleType;
    }

    public ManualScaleSettingsResponse(
        @Nullable Integer instanceCount,
        @Nullable Integer maxInstances,
        @Nullable Integer minInstances,
        String scaleType) {
        this.instanceCount = instanceCount;
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.scaleType = Objects.requireNonNull(scaleType, "expected parameter 'scaleType' to be non-null");
    }

    private ManualScaleSettingsResponse() {
        this.instanceCount = null;
        this.maxInstances = null;
        this.minInstances = null;
        this.scaleType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instanceCount;
        private @Nullable Integer maxInstances;
        private @Nullable Integer minInstances;
        private String scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder setInstanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public Builder setMaxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder setMinInstances(@Nullable Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder setScaleType(String scaleType) {
            this.scaleType = Objects.requireNonNull(scaleType);
            return this;
        }

        public ManualScaleSettingsResponse build() {
            return new ManualScaleSettingsResponse(instanceCount, maxInstances, minInstances, scaleType);
        }
    }
}
