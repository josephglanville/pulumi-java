// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PredictionResponseMappings {
    /**
     * The grade of the link mapping.
     * 
     */
    private final String grade;
    /**
     * The reason of the link mapping.
     * 
     */
    private final String reason;
    /**
     * The score of the link mapping.
     * 
     */
    private final String score;

    @CustomType.Constructor
    private PredictionResponseMappings(
        @CustomType.Parameter("grade") String grade,
        @CustomType.Parameter("reason") String reason,
        @CustomType.Parameter("score") String score) {
        this.grade = grade;
        this.reason = reason;
        this.score = score;
    }

    /**
     * The grade of the link mapping.
     * 
    */
    public String getGrade() {
        return this.grade;
    }
    /**
     * The reason of the link mapping.
     * 
    */
    public String getReason() {
        return this.reason;
    }
    /**
     * The score of the link mapping.
     * 
    */
    public String getScore() {
        return this.score;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PredictionResponseMappings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String grade;
        private String reason;
        private String score;

        public Builder() {
    	      // Empty
        }

        public Builder(PredictionResponseMappings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grade = defaults.grade;
    	      this.reason = defaults.reason;
    	      this.score = defaults.score;
        }

        public Builder grade(String grade) {
            this.grade = Objects.requireNonNull(grade);
            return this;
        }
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public Builder score(String score) {
            this.score = Objects.requireNonNull(score);
            return this;
        }        public PredictionResponseMappings build() {
            return new PredictionResponseMappings(grade, reason, score);
        }
    }
}
