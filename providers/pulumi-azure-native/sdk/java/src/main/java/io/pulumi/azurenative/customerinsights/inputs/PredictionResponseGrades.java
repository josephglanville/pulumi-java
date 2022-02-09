// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PredictionResponseGrades extends io.pulumi.resources.InvokeArgs {

    public static final PredictionResponseGrades Empty = new PredictionResponseGrades();

    @InputImport(name="gradeName")
    private final @Nullable String gradeName;

    public Optional<String> getGradeName() {
        return this.gradeName == null ? Optional.empty() : Optional.ofNullable(this.gradeName);
    }

    @InputImport(name="maxScoreThreshold")
    private final @Nullable Integer maxScoreThreshold;

    public Optional<Integer> getMaxScoreThreshold() {
        return this.maxScoreThreshold == null ? Optional.empty() : Optional.ofNullable(this.maxScoreThreshold);
    }

    @InputImport(name="minScoreThreshold")
    private final @Nullable Integer minScoreThreshold;

    public Optional<Integer> getMinScoreThreshold() {
        return this.minScoreThreshold == null ? Optional.empty() : Optional.ofNullable(this.minScoreThreshold);
    }

    public PredictionResponseGrades(
        @Nullable String gradeName,
        @Nullable Integer maxScoreThreshold,
        @Nullable Integer minScoreThreshold) {
        this.gradeName = gradeName;
        this.maxScoreThreshold = maxScoreThreshold;
        this.minScoreThreshold = minScoreThreshold;
    }

    private PredictionResponseGrades() {
        this.gradeName = null;
        this.maxScoreThreshold = null;
        this.minScoreThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PredictionResponseGrades defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String gradeName;
        private @Nullable Integer maxScoreThreshold;
        private @Nullable Integer minScoreThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(PredictionResponseGrades defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gradeName = defaults.gradeName;
    	      this.maxScoreThreshold = defaults.maxScoreThreshold;
    	      this.minScoreThreshold = defaults.minScoreThreshold;
        }

        public Builder setGradeName(@Nullable String gradeName) {
            this.gradeName = gradeName;
            return this;
        }

        public Builder setMaxScoreThreshold(@Nullable Integer maxScoreThreshold) {
            this.maxScoreThreshold = maxScoreThreshold;
            return this;
        }

        public Builder setMinScoreThreshold(@Nullable Integer minScoreThreshold) {
            this.minScoreThreshold = minScoreThreshold;
            return this;
        }

        public PredictionResponseGrades build() {
            return new PredictionResponseGrades(gradeName, maxScoreThreshold, minScoreThreshold);
        }
    }
}
