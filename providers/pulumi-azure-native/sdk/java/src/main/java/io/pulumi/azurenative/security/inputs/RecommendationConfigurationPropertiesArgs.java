// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.RecommendationConfigStatus;
import io.pulumi.azurenative.security.enums.RecommendationType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The type of IoT Security recommendation.
 * 
 */
public final class RecommendationConfigurationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecommendationConfigurationPropertiesArgs Empty = new RecommendationConfigurationPropertiesArgs();

    /**
     * The type of IoT Security recommendation.
     * 
     */
    @Import(name="recommendationType", required=true)
      private final Output<Either<String,RecommendationType>> recommendationType;

    public Output<Either<String,RecommendationType>> getRecommendationType() {
        return this.recommendationType;
    }

    /**
     * Recommendation status. When the recommendation status is disabled recommendations are not generated.
     * 
     */
    @Import(name="status", required=true)
      private final Output<Either<String,RecommendationConfigStatus>> status;

    public Output<Either<String,RecommendationConfigStatus>> getStatus() {
        return this.status;
    }

    public RecommendationConfigurationPropertiesArgs(
        Output<Either<String,RecommendationType>> recommendationType,
        Output<Either<String,RecommendationConfigStatus>> status) {
        this.recommendationType = Objects.requireNonNull(recommendationType, "expected parameter 'recommendationType' to be non-null");
        this.status = status == null ? Output.ofLeft("Enabled") : Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private RecommendationConfigurationPropertiesArgs() {
        this.recommendationType = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendationConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,RecommendationType>> recommendationType;
        private Output<Either<String,RecommendationConfigStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendationConfigurationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recommendationType = defaults.recommendationType;
    	      this.status = defaults.status;
        }

        public Builder recommendationType(Output<Either<String,RecommendationType>> recommendationType) {
            this.recommendationType = Objects.requireNonNull(recommendationType);
            return this;
        }
        public Builder recommendationType(Either<String,RecommendationType> recommendationType) {
            this.recommendationType = Output.of(Objects.requireNonNull(recommendationType));
            return this;
        }
        public Builder status(Output<Either<String,RecommendationConfigStatus>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(Either<String,RecommendationConfigStatus> status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public RecommendationConfigurationPropertiesArgs build() {
            return new RecommendationConfigurationPropertiesArgs(recommendationType, status);
        }
    }
}
