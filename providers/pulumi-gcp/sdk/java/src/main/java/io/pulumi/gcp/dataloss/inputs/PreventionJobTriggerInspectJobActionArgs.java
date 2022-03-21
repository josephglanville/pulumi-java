// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsArgs;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobActionArgs Empty = new PreventionJobTriggerInspectJobActionArgs();

    /**
     * Schedule for triggered jobs
     * Structure is documented below.
     * 
     */
    @Import(name="saveFindings", required=true)
      private final Output<PreventionJobTriggerInspectJobActionSaveFindingsArgs> saveFindings;

    public Output<PreventionJobTriggerInspectJobActionSaveFindingsArgs> getSaveFindings() {
        return this.saveFindings;
    }

    public PreventionJobTriggerInspectJobActionArgs(Output<PreventionJobTriggerInspectJobActionSaveFindingsArgs> saveFindings) {
        this.saveFindings = Objects.requireNonNull(saveFindings, "expected parameter 'saveFindings' to be non-null");
    }

    private PreventionJobTriggerInspectJobActionArgs() {
        this.saveFindings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<PreventionJobTriggerInspectJobActionSaveFindingsArgs> saveFindings;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.saveFindings = defaults.saveFindings;
        }

        public Builder saveFindings(Output<PreventionJobTriggerInspectJobActionSaveFindingsArgs> saveFindings) {
            this.saveFindings = Objects.requireNonNull(saveFindings);
            return this;
        }
        public Builder saveFindings(PreventionJobTriggerInspectJobActionSaveFindingsArgs saveFindings) {
            this.saveFindings = Output.of(Objects.requireNonNull(saveFindings));
            return this;
        }        public PreventionJobTriggerInspectJobActionArgs build() {
            return new PreventionJobTriggerInspectJobActionArgs(saveFindings);
        }
    }
}
