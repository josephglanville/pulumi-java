// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.batch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchedulingPolicyShareAttributes extends io.pulumi.resources.InvokeArgs {

    public static final SchedulingPolicyShareAttributes Empty = new SchedulingPolicyShareAttributes();

    @InputImport(name="shareIdentifier")
      private final @Nullable String shareIdentifier;

    public Optional<String> getShareIdentifier() {
        return this.shareIdentifier == null ? Optional.empty() : Optional.ofNullable(this.shareIdentifier);
    }

    @InputImport(name="weightFactor")
      private final @Nullable Double weightFactor;

    public Optional<Double> getWeightFactor() {
        return this.weightFactor == null ? Optional.empty() : Optional.ofNullable(this.weightFactor);
    }

    public SchedulingPolicyShareAttributes(
        @Nullable String shareIdentifier,
        @Nullable Double weightFactor) {
        this.shareIdentifier = shareIdentifier;
        this.weightFactor = weightFactor;
    }

    private SchedulingPolicyShareAttributes() {
        this.shareIdentifier = null;
        this.weightFactor = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyShareAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String shareIdentifier;
        private @Nullable Double weightFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyShareAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareIdentifier = defaults.shareIdentifier;
    	      this.weightFactor = defaults.weightFactor;
        }

        public Builder setShareIdentifier(@Nullable String shareIdentifier) {
            this.shareIdentifier = shareIdentifier;
            return this;
        }

        public Builder setWeightFactor(@Nullable Double weightFactor) {
            this.weightFactor = weightFactor;
            return this;
        }
        public SchedulingPolicyShareAttributes build() {
            return new SchedulingPolicyShareAttributes(shareIdentifier, weightFactor);
        }
    }
}
