// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.inputs.FixedOrPercentResponse;
import java.lang.String;
import java.util.Objects;


public final class OSPolicyAssignmentRolloutResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyAssignmentRolloutResponse Empty = new OSPolicyAssignmentRolloutResponse();

    @InputImport(name="disruptionBudget", required=true)
    private final FixedOrPercentResponse disruptionBudget;

    public FixedOrPercentResponse getDisruptionBudget() {
        return this.disruptionBudget;
    }

    @InputImport(name="minWaitDuration", required=true)
    private final String minWaitDuration;

    public String getMinWaitDuration() {
        return this.minWaitDuration;
    }

    public OSPolicyAssignmentRolloutResponse(
        FixedOrPercentResponse disruptionBudget,
        String minWaitDuration) {
        this.disruptionBudget = Objects.requireNonNull(disruptionBudget, "expected parameter 'disruptionBudget' to be non-null");
        this.minWaitDuration = Objects.requireNonNull(minWaitDuration, "expected parameter 'minWaitDuration' to be non-null");
    }

    private OSPolicyAssignmentRolloutResponse() {
        this.disruptionBudget = null;
        this.minWaitDuration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentRolloutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FixedOrPercentResponse disruptionBudget;
        private String minWaitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentRolloutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.minWaitDuration = defaults.minWaitDuration;
        }

        public Builder setDisruptionBudget(FixedOrPercentResponse disruptionBudget) {
            this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
            return this;
        }

        public Builder setMinWaitDuration(String minWaitDuration) {
            this.minWaitDuration = Objects.requireNonNull(minWaitDuration);
            return this;
        }

        public OSPolicyAssignmentRolloutResponse build() {
            return new OSPolicyAssignmentRolloutResponse(disruptionBudget, minWaitDuration);
        }
    }
}