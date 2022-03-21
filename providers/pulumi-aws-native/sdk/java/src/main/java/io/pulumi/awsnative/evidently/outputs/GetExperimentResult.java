// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.outputs;

import io.pulumi.awsnative.evidently.outputs.ExperimentMetricGoalObject;
import io.pulumi.awsnative.evidently.outputs.ExperimentOnlineAbConfigObject;
import io.pulumi.awsnative.evidently.outputs.ExperimentTag;
import io.pulumi.awsnative.evidently.outputs.ExperimentTreatmentObject;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExperimentResult {
    private final @Nullable String arn;
    private final @Nullable String description;
    private final @Nullable List<ExperimentMetricGoalObject> metricGoals;
    private final @Nullable ExperimentOnlineAbConfigObject onlineAbConfig;
    private final @Nullable String randomizationSalt;
    private final @Nullable Integer samplingRate;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<ExperimentTag> tags;
    private final @Nullable List<ExperimentTreatmentObject> treatments;

    @CustomType.Constructor
    private GetExperimentResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("metricGoals") @Nullable List<ExperimentMetricGoalObject> metricGoals,
        @CustomType.Parameter("onlineAbConfig") @Nullable ExperimentOnlineAbConfigObject onlineAbConfig,
        @CustomType.Parameter("randomizationSalt") @Nullable String randomizationSalt,
        @CustomType.Parameter("samplingRate") @Nullable Integer samplingRate,
        @CustomType.Parameter("tags") @Nullable List<ExperimentTag> tags,
        @CustomType.Parameter("treatments") @Nullable List<ExperimentTreatmentObject> treatments) {
        this.arn = arn;
        this.description = description;
        this.metricGoals = metricGoals;
        this.onlineAbConfig = onlineAbConfig;
        this.randomizationSalt = randomizationSalt;
        this.samplingRate = samplingRate;
        this.tags = tags;
        this.treatments = treatments;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public List<ExperimentMetricGoalObject> getMetricGoals() {
        return this.metricGoals == null ? List.of() : this.metricGoals;
    }
    public Optional<ExperimentOnlineAbConfigObject> getOnlineAbConfig() {
        return Optional.ofNullable(this.onlineAbConfig);
    }
    public Optional<String> getRandomizationSalt() {
        return Optional.ofNullable(this.randomizationSalt);
    }
    public Optional<Integer> getSamplingRate() {
        return Optional.ofNullable(this.samplingRate);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<ExperimentTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public List<ExperimentTreatmentObject> getTreatments() {
        return this.treatments == null ? List.of() : this.treatments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperimentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable List<ExperimentMetricGoalObject> metricGoals;
        private @Nullable ExperimentOnlineAbConfigObject onlineAbConfig;
        private @Nullable String randomizationSalt;
        private @Nullable Integer samplingRate;
        private @Nullable List<ExperimentTag> tags;
        private @Nullable List<ExperimentTreatmentObject> treatments;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperimentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.metricGoals = defaults.metricGoals;
    	      this.onlineAbConfig = defaults.onlineAbConfig;
    	      this.randomizationSalt = defaults.randomizationSalt;
    	      this.samplingRate = defaults.samplingRate;
    	      this.tags = defaults.tags;
    	      this.treatments = defaults.treatments;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder metricGoals(@Nullable List<ExperimentMetricGoalObject> metricGoals) {
            this.metricGoals = metricGoals;
            return this;
        }
        public Builder metricGoals(ExperimentMetricGoalObject... metricGoals) {
            return metricGoals(List.of(metricGoals));
        }
        public Builder onlineAbConfig(@Nullable ExperimentOnlineAbConfigObject onlineAbConfig) {
            this.onlineAbConfig = onlineAbConfig;
            return this;
        }
        public Builder randomizationSalt(@Nullable String randomizationSalt) {
            this.randomizationSalt = randomizationSalt;
            return this;
        }
        public Builder samplingRate(@Nullable Integer samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public Builder tags(@Nullable List<ExperimentTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ExperimentTag... tags) {
            return tags(List.of(tags));
        }
        public Builder treatments(@Nullable List<ExperimentTreatmentObject> treatments) {
            this.treatments = treatments;
            return this;
        }
        public Builder treatments(ExperimentTreatmentObject... treatments) {
            return treatments(List.of(treatments));
        }        public GetExperimentResult build() {
            return new GetExperimentResult(arn, description, metricGoals, onlineAbConfig, randomizationSalt, samplingRate, tags, treatments);
        }
    }
}
