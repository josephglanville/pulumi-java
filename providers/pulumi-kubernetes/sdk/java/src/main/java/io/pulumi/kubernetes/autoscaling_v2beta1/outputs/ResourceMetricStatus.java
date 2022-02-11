// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceMetricStatus {
    private final @Nullable Integer currentAverageUtilization;
    private final String currentAverageValue;
    private final String name;

    @OutputCustomType.Constructor({"currentAverageUtilization","currentAverageValue","name"})
    private ResourceMetricStatus(
        @Nullable Integer currentAverageUtilization,
        String currentAverageValue,
        String name) {
        this.currentAverageUtilization = currentAverageUtilization;
        this.currentAverageValue = Objects.requireNonNull(currentAverageValue);
        this.name = Objects.requireNonNull(name);
    }

    public Optional<Integer> getCurrentAverageUtilization() {
        return Optional.ofNullable(this.currentAverageUtilization);
    }
    public String getCurrentAverageValue() {
        return this.currentAverageValue;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer currentAverageUtilization;
        private String currentAverageValue;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentAverageUtilization = defaults.currentAverageUtilization;
    	      this.currentAverageValue = defaults.currentAverageValue;
    	      this.name = defaults.name;
        }

        public Builder setCurrentAverageUtilization(@Nullable Integer currentAverageUtilization) {
            this.currentAverageUtilization = currentAverageUtilization;
            return this;
        }

        public Builder setCurrentAverageValue(String currentAverageValue) {
            this.currentAverageValue = Objects.requireNonNull(currentAverageValue);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public ResourceMetricStatus build() {
            return new ResourceMetricStatus(currentAverageUtilization, currentAverageValue, name);
        }
    }
}
