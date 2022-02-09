// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscaleCapacityResponse {
    private final @Nullable Integer maxInstanceCount;
    private final @Nullable Integer minInstanceCount;

    @OutputCustomType.Constructor({"maxInstanceCount","minInstanceCount"})
    private AutoscaleCapacityResponse(
        @Nullable Integer maxInstanceCount,
        @Nullable Integer minInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
        this.minInstanceCount = minInstanceCount;
    }

    public Optional<Integer> getMaxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }
    public Optional<Integer> getMinInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxInstanceCount;
        private @Nullable Integer minInstanceCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.minInstanceCount = defaults.minInstanceCount;
        }

        public Builder setMaxInstanceCount(@Nullable Integer maxInstanceCount) {
            this.maxInstanceCount = maxInstanceCount;
            return this;
        }

        public Builder setMinInstanceCount(@Nullable Integer minInstanceCount) {
            this.minInstanceCount = minInstanceCount;
            return this;
        }

        public AutoscaleCapacityResponse build() {
            return new AutoscaleCapacityResponse(maxInstanceCount, minInstanceCount);
        }
    }
}
