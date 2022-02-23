// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.RampUpRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Routing rules in production experiments.
 * 
 */
public final class ExperimentsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExperimentsArgs Empty = new ExperimentsArgs();

    /**
     * List of ramp-up rules.
     * 
     */
    @InputImport(name="rampUpRules")
      private final @Nullable Input<List<RampUpRuleArgs>> rampUpRules;

    public Input<List<RampUpRuleArgs>> getRampUpRules() {
        return this.rampUpRules == null ? Input.empty() : this.rampUpRules;
    }

    public ExperimentsArgs(@Nullable Input<List<RampUpRuleArgs>> rampUpRules) {
        this.rampUpRules = rampUpRules;
    }

    private ExperimentsArgs() {
        this.rampUpRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RampUpRuleArgs>> rampUpRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rampUpRules = defaults.rampUpRules;
        }

        public Builder setRampUpRules(@Nullable Input<List<RampUpRuleArgs>> rampUpRules) {
            this.rampUpRules = rampUpRules;
            return this;
        }

        public Builder setRampUpRules(@Nullable List<RampUpRuleArgs> rampUpRules) {
            this.rampUpRules = Input.ofNullable(rampUpRules);
            return this;
        }
        public ExperimentsArgs build() {
            return new ExperimentsArgs(rampUpRules);
        }
    }
}
