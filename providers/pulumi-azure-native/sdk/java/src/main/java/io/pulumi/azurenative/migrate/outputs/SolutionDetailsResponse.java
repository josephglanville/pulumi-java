// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SolutionDetailsResponse {
    private final @Nullable Integer assessmentCount;
    private final @Nullable Map<String,String> extendedDetails;
    private final @Nullable Integer groupCount;

    @OutputCustomType.Constructor({"assessmentCount","extendedDetails","groupCount"})
    private SolutionDetailsResponse(
        @Nullable Integer assessmentCount,
        @Nullable Map<String,String> extendedDetails,
        @Nullable Integer groupCount) {
        this.assessmentCount = assessmentCount;
        this.extendedDetails = extendedDetails;
        this.groupCount = groupCount;
    }

    public Optional<Integer> getAssessmentCount() {
        return Optional.ofNullable(this.assessmentCount);
    }
    public Map<String,String> getExtendedDetails() {
        return this.extendedDetails == null ? Map.of() : this.extendedDetails;
    }
    public Optional<Integer> getGroupCount() {
        return Optional.ofNullable(this.groupCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer assessmentCount;
        private @Nullable Map<String,String> extendedDetails;
        private @Nullable Integer groupCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentCount = defaults.assessmentCount;
    	      this.extendedDetails = defaults.extendedDetails;
    	      this.groupCount = defaults.groupCount;
        }

        public Builder setAssessmentCount(@Nullable Integer assessmentCount) {
            this.assessmentCount = assessmentCount;
            return this;
        }

        public Builder setExtendedDetails(@Nullable Map<String,String> extendedDetails) {
            this.extendedDetails = extendedDetails;
            return this;
        }

        public Builder setGroupCount(@Nullable Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }

        public SolutionDetailsResponse build() {
            return new SolutionDetailsResponse(assessmentCount, extendedDetails, groupCount);
        }
    }
}
