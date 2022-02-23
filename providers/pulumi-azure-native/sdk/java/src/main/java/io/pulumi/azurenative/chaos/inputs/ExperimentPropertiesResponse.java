// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.azurenative.chaos.inputs.SelectorResponse;
import io.pulumi.azurenative.chaos.inputs.StepResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Model that represents the Experiment properties model.
 * 
 */
public final class ExperimentPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExperimentPropertiesResponse Empty = new ExperimentPropertiesResponse();

    /**
     * List of selectors.
     * 
     */
    @InputImport(name="selectors", required=true)
      private final List<SelectorResponse> selectors;

    public List<SelectorResponse> getSelectors() {
        return this.selectors;
    }

    /**
     * A boolean value that indicates if experiment should be started on creation or not.
     * 
     */
    @InputImport(name="startOnCreation")
      private final @Nullable Boolean startOnCreation;

    public Optional<Boolean> getStartOnCreation() {
        return this.startOnCreation == null ? Optional.empty() : Optional.ofNullable(this.startOnCreation);
    }

    /**
     * List of steps.
     * 
     */
    @InputImport(name="steps", required=true)
      private final List<StepResponse> steps;

    public List<StepResponse> getSteps() {
        return this.steps;
    }

    public ExperimentPropertiesResponse(
        List<SelectorResponse> selectors,
        @Nullable Boolean startOnCreation,
        List<StepResponse> steps) {
        this.selectors = Objects.requireNonNull(selectors, "expected parameter 'selectors' to be non-null");
        this.startOnCreation = startOnCreation;
        this.steps = Objects.requireNonNull(steps, "expected parameter 'steps' to be non-null");
    }

    private ExperimentPropertiesResponse() {
        this.selectors = List.of();
        this.startOnCreation = null;
        this.steps = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SelectorResponse> selectors;
        private @Nullable Boolean startOnCreation;
        private List<StepResponse> steps;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectors = defaults.selectors;
    	      this.startOnCreation = defaults.startOnCreation;
    	      this.steps = defaults.steps;
        }

        public Builder setSelectors(List<SelectorResponse> selectors) {
            this.selectors = Objects.requireNonNull(selectors);
            return this;
        }

        public Builder setStartOnCreation(@Nullable Boolean startOnCreation) {
            this.startOnCreation = startOnCreation;
            return this;
        }

        public Builder setSteps(List<StepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public ExperimentPropertiesResponse build() {
            return new ExperimentPropertiesResponse(selectors, startOnCreation, steps);
        }
    }
}
