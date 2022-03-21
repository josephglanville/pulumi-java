// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.evidently.inputs.ExperimentMetricGoalObjectArgs;
import io.pulumi.awsnative.evidently.inputs.ExperimentOnlineAbConfigObjectArgs;
import io.pulumi.awsnative.evidently.inputs.ExperimentTagArgs;
import io.pulumi.awsnative.evidently.inputs.ExperimentTreatmentObjectArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExperimentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExperimentArgs Empty = new ExperimentArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="metricGoals", required=true)
      private final Output<List<ExperimentMetricGoalObjectArgs>> metricGoals;

    public Output<List<ExperimentMetricGoalObjectArgs>> getMetricGoals() {
        return this.metricGoals;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="onlineAbConfig", required=true)
      private final Output<ExperimentOnlineAbConfigObjectArgs> onlineAbConfig;

    public Output<ExperimentOnlineAbConfigObjectArgs> getOnlineAbConfig() {
        return this.onlineAbConfig;
    }

    @Import(name="project", required=true)
      private final Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    @Import(name="randomizationSalt")
      private final @Nullable Output<String> randomizationSalt;

    public Output<String> getRandomizationSalt() {
        return this.randomizationSalt == null ? Output.empty() : this.randomizationSalt;
    }

    @Import(name="samplingRate")
      private final @Nullable Output<Integer> samplingRate;

    public Output<Integer> getSamplingRate() {
        return this.samplingRate == null ? Output.empty() : this.samplingRate;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ExperimentTagArgs>> tags;

    public Output<List<ExperimentTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="treatments", required=true)
      private final Output<List<ExperimentTreatmentObjectArgs>> treatments;

    public Output<List<ExperimentTreatmentObjectArgs>> getTreatments() {
        return this.treatments;
    }

    public ExperimentArgs(
        @Nullable Output<String> description,
        Output<List<ExperimentMetricGoalObjectArgs>> metricGoals,
        @Nullable Output<String> name,
        Output<ExperimentOnlineAbConfigObjectArgs> onlineAbConfig,
        Output<String> project,
        @Nullable Output<String> randomizationSalt,
        @Nullable Output<Integer> samplingRate,
        @Nullable Output<List<ExperimentTagArgs>> tags,
        Output<List<ExperimentTreatmentObjectArgs>> treatments) {
        this.description = description;
        this.metricGoals = Objects.requireNonNull(metricGoals, "expected parameter 'metricGoals' to be non-null");
        this.name = name;
        this.onlineAbConfig = Objects.requireNonNull(onlineAbConfig, "expected parameter 'onlineAbConfig' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.randomizationSalt = randomizationSalt;
        this.samplingRate = samplingRate;
        this.tags = tags;
        this.treatments = Objects.requireNonNull(treatments, "expected parameter 'treatments' to be non-null");
    }

    private ExperimentArgs() {
        this.description = Output.empty();
        this.metricGoals = Output.empty();
        this.name = Output.empty();
        this.onlineAbConfig = Output.empty();
        this.project = Output.empty();
        this.randomizationSalt = Output.empty();
        this.samplingRate = Output.empty();
        this.tags = Output.empty();
        this.treatments = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<List<ExperimentMetricGoalObjectArgs>> metricGoals;
        private @Nullable Output<String> name;
        private Output<ExperimentOnlineAbConfigObjectArgs> onlineAbConfig;
        private Output<String> project;
        private @Nullable Output<String> randomizationSalt;
        private @Nullable Output<Integer> samplingRate;
        private @Nullable Output<List<ExperimentTagArgs>> tags;
        private Output<List<ExperimentTreatmentObjectArgs>> treatments;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.metricGoals = defaults.metricGoals;
    	      this.name = defaults.name;
    	      this.onlineAbConfig = defaults.onlineAbConfig;
    	      this.project = defaults.project;
    	      this.randomizationSalt = defaults.randomizationSalt;
    	      this.samplingRate = defaults.samplingRate;
    	      this.tags = defaults.tags;
    	      this.treatments = defaults.treatments;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder metricGoals(Output<List<ExperimentMetricGoalObjectArgs>> metricGoals) {
            this.metricGoals = Objects.requireNonNull(metricGoals);
            return this;
        }
        public Builder metricGoals(List<ExperimentMetricGoalObjectArgs> metricGoals) {
            this.metricGoals = Output.of(Objects.requireNonNull(metricGoals));
            return this;
        }
        public Builder metricGoals(ExperimentMetricGoalObjectArgs... metricGoals) {
            return metricGoals(List.of(metricGoals));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder onlineAbConfig(Output<ExperimentOnlineAbConfigObjectArgs> onlineAbConfig) {
            this.onlineAbConfig = Objects.requireNonNull(onlineAbConfig);
            return this;
        }
        public Builder onlineAbConfig(ExperimentOnlineAbConfigObjectArgs onlineAbConfig) {
            this.onlineAbConfig = Output.of(Objects.requireNonNull(onlineAbConfig));
            return this;
        }
        public Builder project(Output<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder project(String project) {
            this.project = Output.of(Objects.requireNonNull(project));
            return this;
        }
        public Builder randomizationSalt(@Nullable Output<String> randomizationSalt) {
            this.randomizationSalt = randomizationSalt;
            return this;
        }
        public Builder randomizationSalt(@Nullable String randomizationSalt) {
            this.randomizationSalt = Output.ofNullable(randomizationSalt);
            return this;
        }
        public Builder samplingRate(@Nullable Output<Integer> samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public Builder samplingRate(@Nullable Integer samplingRate) {
            this.samplingRate = Output.ofNullable(samplingRate);
            return this;
        }
        public Builder tags(@Nullable Output<List<ExperimentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ExperimentTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(ExperimentTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder treatments(Output<List<ExperimentTreatmentObjectArgs>> treatments) {
            this.treatments = Objects.requireNonNull(treatments);
            return this;
        }
        public Builder treatments(List<ExperimentTreatmentObjectArgs> treatments) {
            this.treatments = Output.of(Objects.requireNonNull(treatments));
            return this;
        }
        public Builder treatments(ExperimentTreatmentObjectArgs... treatments) {
            return treatments(List.of(treatments));
        }        public ExperimentArgs build() {
            return new ExperimentArgs(description, metricGoals, name, onlineAbConfig, project, randomizationSalt, samplingRate, tags, treatments);
        }
    }
}
