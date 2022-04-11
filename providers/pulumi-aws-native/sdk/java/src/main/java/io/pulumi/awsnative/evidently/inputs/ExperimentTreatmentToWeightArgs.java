// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ExperimentTreatmentToWeightArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExperimentTreatmentToWeightArgs Empty = new ExperimentTreatmentToWeightArgs();

    @Import(name="splitWeight", required=true)
      private final Output<Integer> splitWeight;

    public Output<Integer> getSplitWeight() {
        return this.splitWeight;
    }

    @Import(name="treatment", required=true)
      private final Output<String> treatment;

    public Output<String> getTreatment() {
        return this.treatment;
    }

    public ExperimentTreatmentToWeightArgs(
        Output<Integer> splitWeight,
        Output<String> treatment) {
        this.splitWeight = Objects.requireNonNull(splitWeight, "expected parameter 'splitWeight' to be non-null");
        this.treatment = Objects.requireNonNull(treatment, "expected parameter 'treatment' to be non-null");
    }

    private ExperimentTreatmentToWeightArgs() {
        this.splitWeight = Codegen.empty();
        this.treatment = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTreatmentToWeightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> splitWeight;
        private Output<String> treatment;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentTreatmentToWeightArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.splitWeight = defaults.splitWeight;
    	      this.treatment = defaults.treatment;
        }

        public Builder splitWeight(Output<Integer> splitWeight) {
            this.splitWeight = Objects.requireNonNull(splitWeight);
            return this;
        }
        public Builder splitWeight(Integer splitWeight) {
            this.splitWeight = Output.of(Objects.requireNonNull(splitWeight));
            return this;
        }
        public Builder treatment(Output<String> treatment) {
            this.treatment = Objects.requireNonNull(treatment);
            return this;
        }
        public Builder treatment(String treatment) {
            this.treatment = Output.of(Objects.requireNonNull(treatment));
            return this;
        }        public ExperimentTreatmentToWeightArgs build() {
            return new ExperimentTreatmentToWeightArgs(splitWeight, treatment);
        }
    }
}
